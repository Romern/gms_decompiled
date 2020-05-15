package p000;

import java.util.List;
import java.util.Map;

/* renamed from: bkvh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bkvh {

    /* renamed from: a */
    protected final String f125316a = mo66374a("id").mo66491b();

    /* renamed from: b */
    protected final String f125317b = mo66374a("type").mo66491b();

    /* renamed from: c */
    protected final Map f125318c;

    /* renamed from: d */
    private final blgm f125319d;

    public bkvh(blgm blgm) {
        this.f125319d = blgm;
        this.f125318c = blgm.mo66493d().mo66481a();
    }

    /* renamed from: a */
    public final blgm mo66374a(String str) {
        if (this.f125318c.containsKey(str)) {
            return (blgm) this.f125318c.get(str);
        }
        throw new bkqd(str, bkqg.m106277a(this.f125319d));
    }

    /* renamed from: a */
    public abstract List mo66373a();
}
