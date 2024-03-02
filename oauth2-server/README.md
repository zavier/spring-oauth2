## 授权服务

keytools生成密钥对命令

```shell
keytool -genkeypair -alias k-alias -keyalg RSA -sigalg SHA256withRSA -dname "cn=zavier,ou=zavier,o=zavier,l=BJ,st=BJ,c=CN" -validity 3650 -storetype JKS -keypass oauth2.0 -storepass oauth2.0 -keystore keystore.jks
```

可以使用如下命令导出公钥
```shell
keytool -list -rfc --keystore keystore.jks | openssl x509 -inform pem -pubkey
```