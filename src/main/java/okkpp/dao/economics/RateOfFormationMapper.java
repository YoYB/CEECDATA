package okkpp.dao.economics;

import okkpp.model.economics.RateOfFormation;
import okkpp.model.economics.RateOfFormationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RateOfFormationMapper {
    int countByExample(RateOfFormationExample example);

    int deleteByExample(RateOfFormationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RateOfFormation record);

    int insertSelective(RateOfFormation record);

    List<RateOfFormation> selectByExample(RateOfFormationExample example);

    RateOfFormation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RateOfFormation record, @Param("example") RateOfFormationExample example);

    int updateByExample(@Param("record") RateOfFormation record, @Param("example") RateOfFormationExample example);

    int updateByPrimaryKeySelective(RateOfFormation record);

    int updateByPrimaryKey(RateOfFormation record);
}