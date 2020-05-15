package p000;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* renamed from: vej */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vej extends FilterOutputStream {

    /* renamed from: a */
    public long f49120a;

    /* renamed from: b */
    private final vew f49121b;

    public vej(OutputStream outputStream, vew vew) {
        super(outputStream);
        sdo.m34959a(vew);
        this.f49121b = vew;
    }

    /* renamed from: a */
    public final void mo28350a(String str) {
        write(str.getBytes());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo28351b(String str) {
        this.f49121b.mo28356a(str);
    }

    public final void write(int i) {
        mo28351b("Interrupted");
        this.out.write(i);
        this.f49120a++;
    }

    public final void write(byte[] bArr, int i, int i2) {
        mo28351b("Interrupted");
        this.out.write(bArr, i, i2);
        this.f49120a += (long) i2;
    }
}
