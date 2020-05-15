package p000;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: ciec */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciec {
    static {
        new ciea(new byte[0], 0, 0);
    }

    /* renamed from: a */
    public static cidy m150111a(ByteBuffer byteBuffer) {
        return new cieb(byteBuffer);
    }

    /* renamed from: a */
    public static InputStream m150112a(cidy cidy) {
        return new cidz(cidy);
    }

    /* renamed from: a */
    public static String m150113a(cidy cidy, Charset charset) {
        bmxy.m108582a(charset, "charset");
        bmxy.m108582a(cidy, "buffer");
        int a = cidy.mo85807a();
        byte[] bArr = new byte[a];
        cidy.mo85809a(bArr, 0, a);
        return new String(bArr, charset);
    }
}
