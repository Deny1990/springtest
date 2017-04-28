package yuan.spring.boot.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.test.context.junit4.SpringRunner;
import yuan.spring.boot.model.User;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by yuanxin on 17/4/27.
 */
@RunWith(SpringRunner.class)
@JsonTest
public class MyJsonTests
{
    @Autowired
    private JacksonTester<User> json;

    @Test
    public void testSerialize() throws Exception {
        User user = new User("Honda", "Civic");
        // Assert against a `.json` file in the same package as the test
        assertThat(this.json.write(user)).isEqualToJson("/json/expected.json");
        // Or use JSON path based assertions
        assertThat(this.json.write(user)).hasJsonPathStringValue("@.name");
        assertThat(this.json.write(user)).extractingJsonPathStringValue("@.name")
            .isEqualTo("Honda");
    }

    @Test
    public void testDeserialize() throws Exception {
        String content = "{\"make\":\"Ford\",\"model\":\"Focus\"}";
        assertThat(this.json.parse(content))
            .isEqualTo(new User("Ford", "Focus"));
        assertThat(this.json.parseObject(content).getName()).isEqualTo("Ford");
    }

    
}
