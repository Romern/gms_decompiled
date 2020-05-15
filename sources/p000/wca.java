package p000;

import com.google.android.chimera.Activity;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: wca */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wca implements cayy {

    /* renamed from: a */
    private final cijl f50476a;

    /* renamed from: b */
    private final cijl f50477b;

    /* renamed from: c */
    private final cijl f50478c;

    public wca(cijl cijl, cijl cijl2, cijl cijl3) {
        this.f50476a = cijl;
        this.f50477b = cijl2;
        this.f50478c = cijl3;
    }

    /* renamed from: b */
    public final bycl mo6445a() {
        return m41744a((Activity) ((cayz) this.f50476a).f176439a, (bycs) this.f50477b.mo6445a(), (AtomicReference) this.f50478c.mo6445a());
    }

    /* renamed from: a */
    public static bycl m41744a(Activity activity, bycs bycs, AtomicReference atomicReference) {
        bycl bycl = (bycl) atomicReference.get();
        if (bycl == null) {
            byco byco = bycs.f165698q;
            if (byco == null) {
                byco = byco.f165674b;
            }
            if (Collections.unmodifiableMap(byco.f165676a).isEmpty()) {
                bycl = bycl.f165662d;
            } else {
                int i = activity.getResources().getConfiguration().screenLayout;
                byco byco2 = bycs.f165698q;
                if (byco2 == null) {
                    byco2 = byco.f165674b;
                }
                bycl = (bycl) ((Map.Entry) Collections.min(Collections.unmodifiableMap(byco2.f165676a).entrySet(), bnnt.f131877a.mo68159a(new wbr(i & 15)))).getValue();
            }
        }
        cazf.m127593a(bycl, "Cannot return null from a non-@Nullable @Provides method");
        return bycl;
    }
}
