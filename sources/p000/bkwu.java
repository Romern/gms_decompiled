package p000;

/* renamed from: bkwu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkwu {
    /* renamed from: a */
    public static String m106778a() {
        char[] cArr = new char[12];
        for (int i = 0; i < 8; i++) {
            cArr[i] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt((char) ((int) Math.floor(Math.random() * 64.0d)));
        }
        long currentTimeMillis = System.currentTimeMillis();
        cArr[8] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt((int) ((currentTimeMillis >>> 18) & 63));
        cArr[9] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt((int) ((currentTimeMillis >>> 12) & 63));
        cArr[10] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt((int) ((currentTimeMillis >>> 6) & 63));
        cArr[11] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt((int) (currentTimeMillis & 63));
        return String.valueOf(cArr);
    }
}
