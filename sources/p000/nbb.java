package p000;

/* renamed from: nbb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nbb implements nax {

    /* renamed from: a */
    private final blbr f35169a;

    /* renamed from: b */
    private long f35170b;

    public nbb(blbr blbr) {
        this.f35169a = blbr;
    }

    /* renamed from: a */
    public final long mo20420a() {
        return this.f35170b;
    }

    /* renamed from: b */
    public final void mo20423b() {
        this.f35169a.mo66449a();
    }

    /* renamed from: a */
    public final void mo20421a(long j, int i) {
        this.f35169a.mo66451a(j, i);
        this.f35170b += (long) i;
    }

    /* renamed from: a */
    public final void mo20422a(byte[] bArr) {
        for (byte b : bArr) {
            this.f35169a.mo66450a(b);
        }
        this.f35170b += (long) bArr.length;
    }
}
