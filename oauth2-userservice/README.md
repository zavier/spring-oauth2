## 资源提供者

resources/public.cert 中的内容为授权服务器密钥对中的公钥

```shell
keytool -list -rfc --keystore keystore.jks | openssl x509 -inform pem -pubkey
```