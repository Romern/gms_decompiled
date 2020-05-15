package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: ansu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ansu implements alll {

    /* renamed from: a */
    public boolean f77642a;

    /* renamed from: b */
    private final rkb f77643b;

    /* renamed from: c */
    private final String f77644c;

    /* renamed from: d */
    private final String f77645d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f77646e;

    /* renamed from: f */
    private Map f77647f;

    /* renamed from: g */
    private final anst f77648g;

    public ansu(rkb rkb, String str, String str2, anst anst) {
        this.f77643b = rkb;
        this.f77644c = str;
        this.f77645d = str2;
        this.f77648g = anst;
    }

    /* renamed from: b */
    public final void mo40489b() {
        if (!this.f77646e) {
            this.f77646e = true;
            alkv alkv = new alkv();
            alkv.f73609a = -999;
            alkv.f73611c = false;
            rjo rjo = allr.f73629a;
            amcf.m62588a(this.f77643b, this.f77644c, this.f77645d, alkv).mo9458a(new anss(this));
        }
    }

    /* renamed from: a */
    public final String mo42202a(String str) {
        Map map = this.f77647f;
        if (map != null) {
            return (String) map.get(str);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo42203a() {
        rkb rkb = this.f77643b;
        if (rkb != null && rkb.mo24805i()) {
            if (!this.f77642a && !this.f77646e) {
                this.f77646e = true;
                alkv alkv = new alkv();
                alkv.f73609a = -999;
                alkv.f73611c = false;
                rjo rjo = allr.f73629a;
                amcf.m62588a(this.f77643b, this.f77644c, this.f77645d, alkv).mo9458a(new ansr(this));
            }
            rjo rjo2 = allr.f73629a;
            amdg.m62647a(this.f77643b, this, this.f77644c, this.f77645d, 6);
        }
    }

    /* renamed from: a */
    public final void mo42204a(amev amev) {
        int a = amev.mo24660a();
        if (this.f77647f == null) {
            this.f77647f = new HashMap();
        }
        this.f77647f.clear();
        for (int i = 0; i < a; i++) {
            alzj b = amev.mo24661a(i);
            this.f77647f.put(b.mo41056c(), b.mo41057d());
        }
        this.f77642a = true;
        amev.mo12460c();
        anst anst = this.f77648g;
        if (anst != null) {
            ((ansp) anst).mo42190d();
        }
    }
}
