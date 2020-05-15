package p000;

/* renamed from: yyn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yyn {

    /* renamed from: a */
    public caae f54825a;

    /* renamed from: b */
    public caah f54826b;

    /* renamed from: c */
    public long f54827c = -1;

    /* renamed from: d */
    public int f54828d = 2;

    public yyn() {
    }

    /* renamed from: a */
    public final cadr mo30864a() {
        boolean z;
        caae caae;
        boolean z2 = true;
        if (this.f54825a == null && this.f54826b == null) {
            z = false;
        } else {
            z = true;
        }
        bmxy.m108601b(z, "Must call setDataSource() or setDataType()");
        caah caah = this.f54826b;
        if (!(caah == null || (caae = this.f54825a) == null)) {
            caah caah2 = caae.f172330f;
            if (caah2 == null) {
                caah2 = caah.f172333d;
            }
            if (!bzzn.m126363a(caah, caah2)) {
                z2 = false;
            }
        }
        bmxy.m108601b(z2, "Specified data type is incompatible with specified data source");
        bxvd da = cadr.f172717f.mo74144da();
        int i = this.f54828d;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cadr cadr = (cadr) da.f164949b;
        int i2 = cadr.f172719a | 8;
        cadr.f172719a = i2;
        cadr.f172723e = i;
        long j = this.f54827c;
        int i3 = i2 | 4;
        cadr.f172719a = i3;
        cadr.f172722d = j;
        caae caae2 = this.f54825a;
        if (caae2 != null) {
            caae2.getClass();
            cadr.f172720b = caae2;
            i3 |= 1;
            cadr.f172719a = i3;
        }
        caah caah3 = this.f54826b;
        if (caah3 != null) {
            caah3.getClass();
            cadr.f172721c = caah3;
            cadr.f172719a = i3 | 2;
        }
        return (cadr) da.mo74062i();
    }

    public yyn(cadr cadr) {
        caae caae = cadr.f172720b;
        this.f54825a = caae == null ? caae.f172323i : caae;
        caah caah = cadr.f172721c;
        this.f54826b = caah == null ? caah.f172333d : caah;
        this.f54827c = cadr.f172722d;
        this.f54828d = cadr.f172723e;
    }
}
