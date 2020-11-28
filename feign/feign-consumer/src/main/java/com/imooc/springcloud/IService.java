package com.imooc.springcloud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by 半仙.
 */
@FeignClient("feign-client")
public interface IService {

    @GetMapping("/sayHi")
    String sayHi();

}
