package p000;

/* renamed from: cign */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cign extends chwq {

    /* renamed from: a */
    private final cipu f190152a;

    public cign(cipu cipu) {
        this.f190152a = cipu;
    }

    /* renamed from: a */
    public final int mo85807a() {
        return (int) this.f190152a.f191213b;
    }

    /* renamed from: b */
    public final int mo85810b() {
        return this.f190152a.mo86305e() & 255;
    }

    /* renamed from: c */
    public final cidy mo85812c(int i) {
        cipu cipu = new cipu();
        cipu.mo74930a(this.f190152a, (long) i);
        return new cign(cipu);
    }

    public final void close() {
        this.f190152a.mo86328n();
    }

    /* renamed from: a */
    public final void mo85809a(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            int a = this.f190152a.mo86280a(bArr, i, i2);
            if (a != -1) {
                i2 -= a;
                i += a;
            } else {
                StringBuilder sb = new StringBuilder(36);
                sb.append("EOF trying to read ");
                sb.append(i2);
                sb.append(" bytes");
                throw new IndexOutOfBoundsException(sb.toString());
            }
        }
    }
}
