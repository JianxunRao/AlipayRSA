package utils;

import java.net.URLEncoder;

/**
 * Created by Trojx on 2016/7/30 0030.
 */
public class TestRSA {
    public static void main(String[] args)throws Exception {
        String content="partner=\"2088421425683414\"&seller_id=\"ray_jia@aimoqi.net\"&out_trade_no=\"073015161383144\"&subject=\"测试的商品\"&body=\"该测试商品的详细描述\"&total_fee=\"0.01\"&notify_url=\"http://notify.msp.hk/notify.htm\"&service=\"mobile.securitypay.pay\"&payment_type=\"1\"&_input_charset=\"utf-8\"&it_b_pay=\"30m\"&return_url=\"m.alipay.com\"";
        String RSA_PRIVATE = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAJQcHDRDd0zkUEoKIlUNyU+LS8/Vt4g8ErJ5W6wlCCblJQQp1P0x7lN+BARy79ovw9k+7WE07pss1/QQeqKhJEHTid4uxa7sTd8N9g1m5qt5RTly4QWlIGUQ719X1Is7iyDfnvtT6XDAqOxhikV54Gs/fdo6FxLgSxzJxKHkfDLpAgMBAAECgYBC5Fs8o4fbG3bDqcYNwfc8zL3FtVF53x/WqYbkvajr4CwSsE34uLdZ0B1CYSLA2TfMA2a0s3JcdSlnmpW4o6y6ukolbI8NNt7Nw3YW6FRjsBR6ESFg3Y7GUKEtI0hOr9zVSoglfsm5YjdorTDX83blosjQ9tvkxIgl/nsYawmMgQJBAMPnqwaK80iIRP9GWu6GcUIihSD1Qc1z2Y7SqssA01SHwy3JrDwZdM3dV/BK0VsSzT/aRg60VZ8bFWHYcRY73ZkCQQDBixwRKJkdJG6TrHfIlWakE4HFNR3g5Zpl8mn5l539G1BG6Ud04b0sx48cBEa8lk5sJQnOeKrl3Tpi0agVAjHRAkAPCSrhN6zwdjUFerrj78Gll8yr+ObyA+BAy/570jZmGH1seDwV6MZEPqbPNI7Y9Jp4OiKCYmjn60Y62kfjsviRAkEArvD0z7WooKTbpnPQWehhPJG9TOo0NaKUKu4xSD/5uFzF9TLLOiUJf75p5uMepTwfarUX5h9AKkILkmL70PGI4QJBAK+x2cGVZzC54+8tYJBmDxaZUuSR5iWTQFdLSyf8NFrt5/FbYvDl3m38yfWLojV7osv9k5Tno28SuUS0UWfb0po=";
        String signed=SignUtils.sign(content,RSA_PRIVATE);
        signed= URLEncoder.encode(signed, "UTF-8");
        System.out.println(signed);
    }
}
