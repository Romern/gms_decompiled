package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: azw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azw implements azg, azx {

    /* renamed from: a */
    public final boolean f2734a;

    /* renamed from: b */
    public final azy f2735b;

    /* renamed from: c */
    public final azy f2736c;

    /* renamed from: d */
    public final azy f2737d;

    /* renamed from: e */
    public final int f2738e;

    /* renamed from: f */
    private final List f2739f = new ArrayList();

    public azw(bcg bcg, bce bce) {
        this.f2734a = bce.f2930d;
        this.f2738e = bce.f2931e;
        this.f2735b = bce.f2927a.mo2972a();
        this.f2736c = bce.f2928b.mo2972a();
        this.f2737d = bce.f2929c.mo2972a();
        bcg.mo2989a(this.f2735b);
        bcg.mo2989a(this.f2736c);
        bcg.mo2989a(this.f2737d);
        this.f2735b.mo2939a(this);
        this.f2736c.mo2939a(this);
        this.f2737d.mo2939a(this);
    }

    /* renamed from: a */
    public final void mo2922a() {
        for (int i = 0; i < this.f2739f.size(); i++) {
            ((azx) this.f2739f.get(i)).mo2922a();
        }
    }

    /* renamed from: a */
    public final void mo2927a(List list, List list2) {
    }

    /* renamed from: b */
    public final String mo2930b() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2935a(azx azx) {
        this.f2739f.add(azx);
    }
}
