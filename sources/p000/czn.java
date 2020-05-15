package p000;

import java.nio.ByteBuffer;
import java.util.Random;

/* renamed from: czn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class czn {
    /* renamed from: a */
    public static String m8029a() {
        return String.valueOf(new Random().nextInt(1000));
    }

    /* renamed from: b */
    public static String m8031b(String str) {
        if (str == null || str.equals("") || str.length() == 0) {
            throw new IllegalArgumentException("error");
        }
        byte[] a = czm.m8012a(str);
        ByteBuffer allocate = ByteBuffer.allocate(a.length);
        for (byte b : a) {
            allocate.put((byte) (b ^ -1));
        }
        return czm.m8019b(allocate.array());
    }

    /* renamed from: a */
    public static String m8030a(String str) {
        if (str.length() != 32) {
            return str;
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(str.substring(0, 16));
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }
}
