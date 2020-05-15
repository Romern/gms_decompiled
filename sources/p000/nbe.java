package p000;

import java.io.OutputStream;

/* renamed from: nbe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nbe implements nax {

    /* renamed from: a */
    private final OutputStream f35174a;

    /* renamed from: b */
    private long f35175b;

    public nbe(OutputStream outputStream) {
        this.f35174a = outputStream;
    }

    /* renamed from: a */
    public final long mo20420a() {
        return this.f35175b;
    }

    /* renamed from: b */
    public final void mo20423b() {
        this.f35174a.flush();
    }

    /* renamed from: a */
    public final void mo20421a(long j, int i) {
        throw new UnsupportedOperationException("RawBackupWriter cannot write existing chunks");
    }

    /* renamed from: a */
    public final void mo20422a(byte[] bArr) {
        this.f35174a.write(bArr);
        this.f35175b += (long) bArr.length;
    }
}
