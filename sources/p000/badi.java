package p000;

/* renamed from: badi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class badi {

    /* renamed from: a */
    private bngs f100525a;

    /* renamed from: b */
    private bngx f100526b;

    /* renamed from: a */
    public final badj mo55645a() {
        bngs bngs = this.f100525a;
        if (bngs != null) {
            this.f100526b = bngs.mo67664a();
        } else if (this.f100526b == null) {
            this.f100526b = bngx.m109376e();
        }
        return new bada(this.f100526b);
    }

    /* renamed from: a */
    public final void mo55646a(byte[] bArr, int i) {
        if (this.f100525a == null) {
            this.f100525a = bngx.m109377j();
        }
        this.f100525a.mo67668c(new bade(bArr, i));
    }
}
