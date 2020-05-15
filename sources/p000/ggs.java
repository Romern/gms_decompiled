package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: ggs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ggs {
    /* renamed from: a */
    static byte[] m13122a(ghk ghk) {
        byte[] bytes = ghk.f18258d.getBytes(Charset.forName("UTF-8"));
        byte[] bArr = new byte[(bytes.length + 9)];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.put(bytes);
        wrap.put((byte) 0);
        wrap.putLong(ghk.f18257c);
        wrap.flip();
        return bArr;
    }
}
