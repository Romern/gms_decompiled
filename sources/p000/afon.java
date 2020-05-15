package p000;

import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: afon */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afon {

    /* renamed from: a */
    public final bbep f64445a;

    /* renamed from: b */
    private final bbch f64446b;

    /* renamed from: c */
    private final Executor f64447c;

    public afon(bbch bbch, bbep bbep, Executor executor) {
        this.f64446b = bbch;
        this.f64445a = bbep;
        this.f64447c = executor;
    }

    /* renamed from: a */
    public final bqgg mo34977a() {
        bdyw bdyw = afok.f64441b;
        baun baun = (baun) afqh.m53443a(afok.f64442c, this.f64445a, (bxxk) baun.f101788b.mo74142c(7));
        if (baun == null) {
            return bqga.m112775a((Object) null);
        }
        ArrayList arrayList = new ArrayList();
        bxwc bxwc = baun.f101790a;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            baui baui = (baui) afqh.m53443a(bdyx.m91611a(bdyw, ((baum) bxwc.get(i)).f101786a, afok.f64440a), this.f64445a, (bxxk) baui.f101771e.mo74142c(7));
            if (baui != null) {
                try {
                    arrayList.add(this.f64446b.mo56065a(bbfe.m87920a(baui.f101774b, baui.f101775c), bbff.m87924a(baui)));
                } catch (bxwf e) {
                    bbev.m87908a(e, "%s: Unable to add groups from individual configs.", "PhenotypeConfig");
                }
            }
        }
        return bqga.m112782b(arrayList).mo69216a(afom.f64444a, this.f64447c);
    }
}
