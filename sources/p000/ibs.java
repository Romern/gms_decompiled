package p000;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: ibs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ibs implements chtt {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ InputStream mo12898a(Object obj) {
        return new ByteArrayInputStream((byte[]) obj);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo12899a(InputStream inputStream) {
        byte[] bArr = new byte[0];
        try {
            bArr = srz.m36178b(inputStream);
        } catch (IOException e) {
        } catch (Throwable th) {
            srz.m36171a((Closeable) inputStream);
            throw th;
        }
        srz.m36171a((Closeable) inputStream);
        return bArr;
    }
}
