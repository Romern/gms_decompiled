package p000;

import java.nio.ByteBuffer;
import java.util.Random;

/* renamed from: cwa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cwa {
    /* renamed from: a */
    public static String m7738a() {
        return String.valueOf(new Random().nextInt(1000));
    }

    /* renamed from: b */
    public static String m7740b(String str) {
        if (str == null || str.equals("") || str.length() == 0) {
            throw new IllegalArgumentException("error");
        }
        byte[] b = cvz.m7720b(str);
        ByteBuffer allocate = ByteBuffer.allocate(b.length);
        for (byte b2 : b) {
            allocate.put((byte) (b2 ^ -1));
        }
        return cvz.m7704a(allocate.array());
    }

    /* renamed from: a */
    public static String m7739a(String str) {
        if (str.length() != 32) {
            return str;
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(str.substring(0, 16));
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }
}
