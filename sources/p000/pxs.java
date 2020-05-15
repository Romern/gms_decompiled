package p000;

import android.content.Context;

/* renamed from: pxs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pxs extends aaab {

    /* renamed from: a */
    final /* synthetic */ boolean f40588a;

    /* renamed from: b */
    final /* synthetic */ double f40589b;

    /* renamed from: c */
    final /* synthetic */ boolean f40590c;

    /* renamed from: d */
    final /* synthetic */ pyf f40591d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pxs(pyf pyf, String str, boolean z, double d, boolean z2) {
        super(str);
        this.f40591d = pyf;
        this.f40588a = z;
        this.f40589b = d;
        this.f40590c = z2;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        pyf pyf = this.f40591d;
        pyf.f40622d.mo23673b("setMute: %s %b %f %b", pyf.f40621c, Boolean.valueOf(this.f40588a), Double.valueOf(this.f40589b), Boolean.valueOf(this.f40590c));
        if (!this.f40591d.f40624f.mo23209a(this.f40588a, this.f40589b, this.f40590c)) {
            pyf pyf2 = this.f40591d;
            pyf2.mo23808d(pyf2.f40624f.f39230a.f29716d);
        }
    }
}
