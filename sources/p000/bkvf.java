package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bkvf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkvf extends bkvh {

    /* renamed from: d */
    private final List f125314d;

    public bkvf(bkvk bkvk, blgm blgm) {
        super(blgm);
        List<blgm> a = mo66374a("value").mo66494e().mo66478a();
        this.f125314d = new ArrayList(a.size());
        for (blgm blgm2 : a) {
            this.f125314d.add(bkvk.mo66375a(blgm2));
        }
    }

    /* renamed from: a */
    public final List mo66373a() {
        if (!this.f125314d.isEmpty()) {
            return Collections.singletonList(bksz.m106567a(this.f125316a, 0, this.f125314d));
        }
        return Collections.emptyList();
    }
}
