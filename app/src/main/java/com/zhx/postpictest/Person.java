package com.zhx.postpictest;

/**
 * Author   :zhx
 * Create at 2017/3/23
 * Description:
 */
public class Person {

    /**
     * error_code : 0
     * reason : 操作成功
     * result : {"住址":"武汉市江岸区永清路****","保留":"","公民身份号码":"42010619510609****","出生":"1951-06-09","头像":"","姓名":"彭*","性别":"男","民族":"汉"}
     */

    private int error_code;
    private String reason;
    /**
     * 住址 : 武汉市江岸区永清路****
     * 保留 :
     * 公民身份号码 : 42010619510609****
     * 出生 : 1951-06-09
     * 头像 :
     * 姓名 : 彭*
     * 性别 : 男
     * 民族 : 汉
     */

    private ResultBean result;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        private String 住址;
        private String 保留;
        private String 公民身份号码;
        private String 出生;
        private String 头像;
        private String 姓名;
        private String 性别;
        private String 民族;

        public String get住址() {
            return 住址;
        }

        public void set住址(String 住址) {
            this.住址 = 住址;
        }

        public String get保留() {
            return 保留;
        }

        public void set保留(String 保留) {
            this.保留 = 保留;
        }

        public String get公民身份号码() {
            return 公民身份号码;
        }

        public void set公民身份号码(String 公民身份号码) {
            this.公民身份号码 = 公民身份号码;
        }

        public String get出生() {
            return 出生;
        }

        public void set出生(String 出生) {
            this.出生 = 出生;
        }

        public String get头像() {
            return 头像;
        }

        public void set头像(String 头像) {
            this.头像 = 头像;
        }

        public String get姓名() {
            return 姓名;
        }

        public void set姓名(String 姓名) {
            this.姓名 = 姓名;
        }

        public String get性别() {
            return 性别;
        }

        public void set性别(String 性别) {
            this.性别 = 性别;
        }

        public String get民族() {
            return 民族;
        }

        public void set民族(String 民族) {
            this.民族 = 民族;
        }
    }
}
