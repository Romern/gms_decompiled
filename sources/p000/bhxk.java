package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: bhxk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhxk {

    /* renamed from: a */
    public bhzq f119816a;

    /* renamed from: b */
    public final bigx f119817b;

    /* renamed from: c */
    public final biaa f119818c;

    /* renamed from: d */
    public final C1245ok f119819d = new C1245ok(this.f119821f.size() + this.f119820e.size());

    /* renamed from: e */
    public final List f119820e = Arrays.asList(cggm.f186849a.mo6606a().mo83730i().split(","));

    /* renamed from: f */
    public final List f119821f = Arrays.asList(cgfr.f186745a.mo6606a().mo83634i().split(","));

    public bhxk(bigx bigx, biaa biaa) {
        this.f119817b = bigx;
        this.f119818c = biaa;
    }

    /* renamed from: a */
    public final List mo64387a(int i) {
        if (i != 100) {
            return i != 110 ? Collections.emptyList() : this.f119821f;
        }
        return this.f119820e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo64388a(int i, bhzp bhzp) {
        List<String> a = mo64387a(i);
        if (a != null && !a.isEmpty()) {
            for (String str : a) {
                if (this.f119819d.containsKey(str)) {
                    ((bhzr) this.f119819d.get(str)).mo64462b(bhzp);
                }
            }
        }
    }
}
