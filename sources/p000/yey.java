package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: yey */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yey extends ydz {

    /* renamed from: e */
    private final yeo[] f53715e;

    public yey(caae caae, yeo... yeoArr) {
        super(caae);
        boolean z;
        int length = yeoArr.length;
        caah caah = caae.f172330f;
        if (length == (caah == null ? caah.f172333d : caah).f172337c.size()) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108589a(z, "Field count didn't match number of aggregators.");
        this.f53715e = yeoArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final double mo30383b(cadn cadn) {
        double d = 0.0d;
        for (yeo yeo : this.f53715e) {
            d += yeo.mo30399b(cadn);
        }
        return d;
    }

    /* renamed from: c */
    public final cadn mo30384c() {
        long j = this.f53685c - this.f53684b;
        caaw[] caawArr = new caaw[this.f53715e.length];
        int i = 0;
        while (true) {
            yeo[] yeoArr = this.f53715e;
            if (i >= yeoArr.length) {
                return yyk.m45015a(this.f53683a, mo30394d(), this.f53684b, this.f53685c, TimeUnit.NANOSECONDS, caawArr);
            }
            caawArr[i] = yeoArr[i].mo30398a(j);
            i++;
        }
    }
}
