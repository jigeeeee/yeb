package com.kinoki.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kinoki.server.mapper.NationMapper;
import com.kinoki.server.pojo.Nation;
import com.kinoki.server.service.INationService;
import org.springframework.stereotype.Service;

@Service
public class NationServiceImpl extends ServiceImpl<NationMapper, Nation> implements INationService {

}
