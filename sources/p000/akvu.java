package p000;

import com.google.android.gms.octarine.widget.OctarineToolbar;

/* renamed from: akvu */
final /* synthetic */ class akvu implements srl {

    /* renamed from: a */
    private final akwc f72975a;

    /* renamed from: b */
    private final int f72976b;

    public akvu(akwc akwc, int i) {
        this.f72975a = akwc;
        this.f72976b = i;
    }

    /* renamed from: a */
    public final Object mo21850a(Object obj) {
        akwc akwc = this.f72975a;
        Void voidR = (Void) obj;
        int a = bsmo.m115982a(this.f72976b);
        if (a == 0) {
            a = 1;
        }
        OctarineToolbar octarineToolbar = ((alaf) akwc.f72985a).f73214h;
        if (octarineToolbar == null) {
            return null;
        }
        octarineToolbar.mo44780f(a);
        return null;
    }
}
