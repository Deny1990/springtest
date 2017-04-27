package yuan.spring.boot.model;

/**
 * Created by yuanxin on 17/4/14.
 */
public class City
{
    private Integer id;

    private String cityName;

    private Integer peopleNum;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getCityName()
    {
        return cityName;
    }

    public void setCityName(String cityName)
    {
        this.cityName = cityName;
    }

    public Integer getPeopleNum()
    {
        return peopleNum;
    }

    public void setPeopleNum(Integer peopleNum)
    {
        this.peopleNum = peopleNum;
    }
}
