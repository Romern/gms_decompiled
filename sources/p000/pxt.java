package p000;

import android.content.Context;

/* renamed from: pxt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pxt extends aaab {

    /* renamed from: a */
    final /* synthetic */ double f40592a;

    /* renamed from: b */
    final /* synthetic */ double f40593b;

    /* renamed from: c */
    final /* synthetic */ boolean f40594c;

    /* renamed from: d */
    final /* synthetic */ pyf f40595d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pxt(pyf pyf, String str, double d, double d2, boolean z) {
        super(str);
        this.f40595d = pyf;
        this.f40592a = d;
        this.f40593b = d2;
        this.f40594c = z;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        pyf pyf = this.f40595d;
        pyf.f40622d.mo23673b("setVolume: %s %f %f %b", pyf.f40621c, Double.valueOf(this.f40592a), Double.valueOf(this.f40593b), Boolean.valueOf(this.f40594c));
        if (!this.f40595d.f40624f.mo23208a(this.f40592a, this.f40593b, this.f40594c)) {
            pyf pyf2 = this.f40595d;
            pyf2.mo23808d(pyf2.f40624f.f39230a.f29716d);
        }
    }
}
