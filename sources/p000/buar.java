package p000;

import java.nio.ByteBuffer;
import java.util.zip.Adler32;

/* renamed from: buar */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buar {
    /* renamed from: a */
    public static void m119184a(ByteBuffer byteBuffer, byte b, int i) {
        int position = byteBuffer.position() - i;
        Adler32 adler32 = new Adler32();
        adler32.update(b);
        adler32.update(byteBuffer.array(), position, i);
        byteBuffer.putLong(position - 8, adler32.getValue());
    }

    /* renamed from: a */
    public static boolean m119185a(ByteBuffer byteBuffer, byte b) {
        int i = byteBuffer.getInt();
        long j = byteBuffer.getLong();
        Adler32 adler32 = new Adler32();
        adler32.update(b);
        adler32.update(byteBuffer.array(), byteBuffer.position(), i);
        return j == adler32.getValue();
    }
}
