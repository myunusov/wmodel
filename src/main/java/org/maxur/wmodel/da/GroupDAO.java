package org.maxur.wmodel.da;

import org.maxur.wmodel.domain.Group;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

/**
 * @author myunusov
 * @version 1.0
 * @since <pre>04.11.2015</pre>
 */
@RegisterMapper(GroupMapper.class)
public interface GroupDAO {

    @SqlQuery("select * from t_group where group_id = :group_id")
    Group findGroupById(@Bind("group_id") int groupId);
}