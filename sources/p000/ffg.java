package p000;

import android.content.Context;
import java.util.List;

/* renamed from: ffg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ffg {

    /* renamed from: a */
    public final fcg f16446a;

    /* renamed from: b */
    public final feh f16447b = new feh(this.f16446a, this.f16453h);

    /* renamed from: c */
    public final feo f16448c;

    /* renamed from: d */
    public final fdb f16449d;

    /* renamed from: e */
    public final fdn f16450e;

    /* renamed from: f */
    public final ffe f16451f;

    /* renamed from: g */
    public final feq f16452g;

    /* renamed from: h */
    public final fdp f16453h;

    public ffg(Context context, ero ero, ffk ffk, esr esr, bsxn bsxn, List list, ffd ffd, fhe fhe, eql eql) {
        this.f16446a = new fcg(ero, ffk, esr, eql);
        this.f16453h = new fdp(context, this.f16446a);
        this.f16448c = new feo(this.f16446a, this.f16453h, bsxn, list);
        this.f16449d = new fdb();
        this.f16450e = new fdn(this.f16446a, bsxn, fhe);
        this.f16451f = new ffe(this.f16450e, this.f16446a, this.f16449d, ffd, this.f16447b);
        this.f16452g = new feq(this.f16450e, this.f16446a, this.f16449d, this.f16447b, this.f16453h);
    }

    /* renamed from: a */
    public final fcs mo10771a(fcr fcr) {
        return new fcs(fcr, this.f16446a, this.f16447b, this.f16449d, this.f16453h);
    }
}
