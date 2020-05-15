package p000;

import android.view.View;

/* renamed from: gyu */
final /* synthetic */ class gyu implements C0038ax {

    /* renamed from: a */
    private final gzd f19263a;

    public gyu(gzd gzd) {
        this.f19263a = gzd;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        gzd gzd = this.f19263a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        View view = gzd.f19280c;
        int i = !booleanValue ? 8 : 0;
        view.setVisibility(i);
        gzd.f19281d.setVisibility(i);
    }
}
