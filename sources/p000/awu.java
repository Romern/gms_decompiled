package p000;

import java.io.UnsupportedEncodingException;

/* renamed from: awu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awu {
    /* renamed from: a */
    public static byte[] m2287a(byte b) {
        byte b2 = b & 255;
        if (b2 >= 128) {
            if (b2 == 129 || b2 == 141 || b2 == 143 || b2 == 144 || b2 == 157) {
                return new byte[]{32};
            }
            try {
                return new String(new byte[]{b}, "cp1252").getBytes("UTF-8");
            } catch (UnsupportedEncodingException e) {
            }
        }
        return new byte[]{b};
    }
}
