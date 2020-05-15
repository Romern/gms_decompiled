package p000;

import android.content.Context;

/* renamed from: pyk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pyk extends pyw {

    /* renamed from: a */
    final /* synthetic */ boolean f40647a;

    /* renamed from: b */
    final /* synthetic */ double f40648b;

    /* renamed from: c */
    final /* synthetic */ boolean f40649c;

    /* renamed from: d */
    final /* synthetic */ pyx f40650d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pyk(pyx pyx, String str, boolean z, double d, boolean z2) {
        super(str);
        this.f40650d = pyx;
        this.f40647a = z;
        this.f40648b = d;
        this.f40649c = z2;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        pyx pyx = this.f40650d;
        pyx.f40684d.mo23673b("setMute: %s %b %f %b", pyx.f40683c, Boolean.valueOf(this.f40647a), Double.valueOf(this.f40648b), Boolean.valueOf(this.f40649c));
        if (!this.f40650d.f40686f.mo23209a(this.f40647a, this.f40648b, this.f40649c)) {
            pyx pyx2 = this.f40650d;
            pyx2.mo23813d(pyx2.f40686f.f39230a.f29716d);
        }
    }
}
