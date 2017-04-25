package sample.mybatis.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import sample.mybatis.domain.Roster;

/**
 * Created by mark on 4/25/17.
 */
@Mapper
public interface RosterMapper {

    @Select("select * from roster where name = #{name}")
    Roster findByName(@Param("name") String name);
}
