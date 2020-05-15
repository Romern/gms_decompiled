package p000;

import android.text.TextUtils;
import android.view.View;

/* renamed from: adlu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class adlu implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ adma f62136a;

    public adlu(adma adma) {
        this.f62136a = adma;
    }

    public void onClick(View view) {
        this.f62136a.f62148i = true;
        adma adma = this.f62136a;
        if (!adma.f62171d.mo33667l()) {
            adma.f62173f.mo33659a("OptInFragment.optIn");
            rjx rjx = adma.f62145c;
            String str = adma.f62143a;
            rkb rkb = rjx.f43165D;
            sdo.m34974b(!TextUtils.isEmpty(str));
            adgl adgl = new adgl(rkb, str);
            rkb.mo24787a((rle) adgl);
            aucb a = sdl.m34954a(adgl);
            a.mo50373a(new adlz(adma));
            a.mo50372a(new adly(adma));
        }
    }
}
