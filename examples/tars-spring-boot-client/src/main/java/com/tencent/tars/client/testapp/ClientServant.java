package com.tencent.tars.client.testapp;

import com.qq.tars.protocol.annotation.Servant;


@Servant
public interface ClientServant {
    public String rpcHello(int no, String name);
}
