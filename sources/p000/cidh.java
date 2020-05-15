package p000;

import java.io.OutputStream;

/* renamed from: cidh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cidh extends OutputStream {

    /* renamed from: a */
    final /* synthetic */ cidj f189899a;

    public cidh(cidj cidj) {
        this.f189899a = cidj;
    }

    public final void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.f189899a.mo85989a(bArr, i, i2);
    }
}
