package com.zhx.postpictest;



public class OneHttp {
    private static OneService mService;

    protected static final Object monitor = new Object();

    public static OneService getServiceInstance(){
        synchronized (monitor){
            if(mService==null){
                mService = new OneRetrofit().getService();
            }
            return mService;
        }
    }
}
