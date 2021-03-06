package com.blueskykong.lottor.server.concurrent;


@FunctionalInterface
public interface IExecute<T> {

    /**
     * 执行器
     *
     * @return 泛型类型
     */
    T execute();

}
