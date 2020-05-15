package p000;

import android.view.View;

/* renamed from: adlx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class adlx implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ boolean f62139a;

    /* renamed from: b */
    final /* synthetic */ adma f62140b;

    public adlx(adma adma, boolean z) {
        this.f62140b = adma;
        this.f62139a = z;
    }

    public void onClick(View view) {
        this.f62140b.f62148i = true;
        adma adma = this.f62140b;
        rjx rjx = adma.f62145c;
        String str = adma.f62143a;
        rkb rkb = rjx.f43165D;
        sdo.m34959a(rkb);
        adgi adgi = new adgi(rkb, str);
        rkb.mo24787a((rle) adgi);
        aucb a = sdl.m34954a(adgi);
        a.mo50373a(new adlw(this));
        a.mo50372a(new adlv(this));
        if (this.f62139a) {
            this.f62140b.f62173f.mo33659a("OptInFragment.noThanks");
        } else {
            this.f62140b.f62173f.mo33659a("OptInFragment.notNow");
        }
    }
}
