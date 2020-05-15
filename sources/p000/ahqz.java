package p000;

import java.util.List;
import java.util.Map;

/* renamed from: ahqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahqz {

    /* renamed from: a */
    private final Map f67851a = new C1223np();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized ahqy mo36987a(long j) {
        return (ahqy) this.f67851a.get(Long.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo36990b(long j) {
        ahqy ahqy = (ahqy) this.f67851a.remove(Long.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized List mo36988a() {
        return bngx.m109368a(this.f67851a.values());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo36989a(long j, ahqy ahqy) {
        this.f67851a.put(Long.valueOf(j), ahqy);
    }
}
