package boot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import boot.pojo.User;
import boot.service.UserService;
import boot.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 86182
* @description 针对表【t_user】的数据库操作Service实现
* @createDate 2023-03-05 21:19:14
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




