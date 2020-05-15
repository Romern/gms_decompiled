package p000;

import java.io.ByteArrayOutputStream;

/* renamed from: srx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class srx extends ByteArrayOutputStream {
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo26033a(byte[] bArr, int i) {
        System.arraycopy(this.buf, 0, bArr, i, this.count);
    }
}
