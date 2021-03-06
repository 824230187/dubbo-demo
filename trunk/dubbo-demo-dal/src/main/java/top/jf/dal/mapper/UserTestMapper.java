package top.jf.dal.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.jf.dal.entity.UserTest;
import top.jf.dal.entity.UserTestExample;

public interface UserTestMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_test
     *
     * @mbg.generated Fri Jul 07 09:52:36 CST 2017
     */
    long countByExample(UserTestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_test
     *
     * @mbg.generated Fri Jul 07 09:52:36 CST 2017
     */
    int deleteByExample(UserTestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_test
     *
     * @mbg.generated Fri Jul 07 09:52:36 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_test
     *
     * @mbg.generated Fri Jul 07 09:52:36 CST 2017
     */
    int insert(UserTest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_test
     *
     * @mbg.generated Fri Jul 07 09:52:36 CST 2017
     */
    int insertSelective(UserTest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_test
     *
     * @mbg.generated Fri Jul 07 09:52:36 CST 2017
     */
    List<UserTest> selectByExample(UserTestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_test
     *
     * @mbg.generated Fri Jul 07 09:52:36 CST 2017
     */
    UserTest selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_test
     *
     * @mbg.generated Fri Jul 07 09:52:36 CST 2017
     */
    int updateByExampleSelective(@Param("record") UserTest record, @Param("example") UserTestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_test
     *
     * @mbg.generated Fri Jul 07 09:52:36 CST 2017
     */
    int updateByExample(@Param("record") UserTest record, @Param("example") UserTestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_test
     *
     * @mbg.generated Fri Jul 07 09:52:36 CST 2017
     */
    int updateByPrimaryKeySelective(UserTest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_test
     *
     * @mbg.generated Fri Jul 07 09:52:36 CST 2017
     */
    int updateByPrimaryKey(UserTest record);
}