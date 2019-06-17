package com.github.feifuzeng.encrypt.auto;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.github.feifuzeng.encrypt.advice.EncryptRequestBodyAdvice;
import com.github.feifuzeng.encrypt.advice.EncryptResponseBodyAdvice;

/**
 * 加解密自动配置
 *
 */
@Configuration
@Component
@EnableAutoConfiguration
@EnableConfigurationProperties(EncryptProperties.class)
public class EncryptAutoConfiguration {

	/**
	 * 配置请求解密
	 * @return
	 */
	@Bean
	public EncryptResponseBodyAdvice encryptResponseBodyAdvice() {
		return new EncryptResponseBodyAdvice();
	}
	
	/**
	 * 配置请求加密
	 * @return
	 */
	@Bean
	public EncryptRequestBodyAdvice encryptRequestBodyAdvice() {
		return new EncryptRequestBodyAdvice();
	}
	
}
