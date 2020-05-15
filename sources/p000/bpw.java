package p000;

/* renamed from: bpw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpw implements asrx {

    /* renamed from: a */
    public final bxd f5327a;

    /* renamed from: b */
    public final bpq f5328b;

    static {
        bpw.class.getSimpleName();
    }

    public bpw(bxd bxd, bpq bpq) {
        int i = cbd.f6383a;
        this.f5327a = bxd;
        this.f5328b = bpq;
    }

    /* renamed from: a */
    public final byte[] mo3395a() {
        int i = cbd.f6383a;
        cat cat = this.f5327a.f5949c;
        try {
            bxm a = this.f5328b.mo3387d().mo3492a(this.f5327a, new bqn(), bxf.CONTACTLESS);
            can can = (can) this.f5328b.mo3384a(cat).mo3484a((Byte) (byte) -92);
            return can.mo3634b(a, can.mo3491a(a.f5984f)).mo3339a();
        } catch (bqh e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final byte[] mo3396a(int i) {
        byte[] bArr;
        int i2 = cbd.f6383a;
        cbj cbj = new cbj(i);
        byte[] a = cbj.mo3651a();
        int i3 = 0;
        while (true) {
            int length = a.length;
            if (i3 >= length) {
                bArr = new byte[]{0};
                break;
            } else if (a[i3] != 0) {
                int i4 = length - i3;
                bArr = new byte[i4];
                System.arraycopy(cbj.f6395a, i3, bArr, 0, i4);
                break;
            } else {
                i3++;
            }
        }
        return this.f5327a.mo3578d().mo3575b(bArr);
    }
}
