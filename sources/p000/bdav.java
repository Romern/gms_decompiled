package p000;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: bdav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdav extends bdar {

    /* renamed from: a */
    public final Map f105253a = new HashMap();

    /* renamed from: b */
    public int f105254b;

    /* renamed from: c */
    private final Set f105255c = new HashSet();

    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List, java.util.Collection], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    private bdav(Collection r6) {
        int size = r6.size();
        for (int i = 0; i < size; i++) {
            bdar bdar = (bdar) r6.get(i);
            this.f105255c.add(new bdat(this, bdar));
            this.f105253a.put(bdar, null);
        }
    }

    /* renamed from: a */
    public static bdav m90505a(Collection collection) {
        return new bdav(collection);
    }

    /* renamed from: c */
    private final synchronized void m90506c() {
        this.f105254b = this.f105255c.size();
        for (bdat bdat : this.f105255c) {
            bdat.mo57833a();
        }
    }

    /* renamed from: g */
    private final synchronized void m90507g() {
        this.f105254b = -1;
        mo57831e();
        for (bdat bdat : this.f105255c) {
            bdat.mo57834b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final synchronized void mo56706b() {
        m90507g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo56704a() {
        m90506c();
    }
}
