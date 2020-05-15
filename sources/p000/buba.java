package p000;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/* renamed from: buba */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buba {
    /* renamed from: a */
    public static int m119277a(buaz buaz, Object[] objArr) {
        int length = objArr.length;
        int i = length * 4;
        for (Object obj : objArr) {
            if (obj != null) {
                i += buaz.mo61974a(obj);
            }
        }
        return i;
    }

    /* renamed from: b */
    public static void m119279b(ByteBuffer byteBuffer, buaz buaz, Object[] objArr) {
        int length = objArr.length;
        IntBuffer asIntBuffer = byteBuffer.asIntBuffer();
        byteBuffer.position(byteBuffer.position() + (length * 4));
        for (int i = 0; i < length; i++) {
            int i2 = asIntBuffer.get();
            if (i2 != -1) {
                objArr[i] = buaz.mo61975a(byteBuffer, i2);
            }
        }
    }

    /* renamed from: a */
    public static void m119278a(ByteBuffer byteBuffer, buaz buaz, Object[] objArr) {
        int length = objArr.length;
        IntBuffer asIntBuffer = byteBuffer.asIntBuffer();
        byteBuffer.position(byteBuffer.position() + (length * 4));
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            if (obj == null) {
                asIntBuffer.put(-1);
            } else {
                asIntBuffer.put(buaz.mo61974a(obj));
                buaz.mo61976a(byteBuffer, objArr[i]);
            }
        }
    }
}
