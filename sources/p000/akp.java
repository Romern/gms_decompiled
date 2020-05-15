package p000;

import android.os.Bundle;

/* renamed from: akp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akp {

    /* renamed from: a */
    public final Bundle f782a;

    /* renamed from: b */
    private all f783b;

    public akp(all all, boolean z) {
        if (all != null) {
            Bundle bundle = new Bundle();
            this.f782a = bundle;
            this.f783b = all;
            bundle.putBundle("selector", all.f839a);
            this.f782a.putBoolean("activeScan", z);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    /* renamed from: d */
    private final void m966d() {
        if (this.f783b == null) {
            all a = all.m1016a(this.f782a.getBundle("selector"));
            this.f783b = a;
            if (a == null) {
                this.f783b = all.f838c;
            }
        }
    }

    /* renamed from: a */
    public final all mo919a() {
        m966d();
        return this.f783b;
    }

    /* renamed from: b */
    public final boolean mo920b() {
        return this.f782a.getBoolean("activeScan");
    }

    /* renamed from: c */
    public final boolean mo921c() {
        m966d();
        all all = this.f783b;
        all.mo975b();
        return !all.f840b.contains(null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof akp) {
            akp akp = (akp) obj;
            return mo919a().equals(akp.mo919a()) && mo920b() == akp.mo920b();
        }
    }

    public final int hashCode() {
        return mo919a().hashCode() ^ mo920b() ? 1 : 0;
    }

    public final String toString() {
        return "DiscoveryRequest{ selector=" + mo919a() + ", activeScan=" + mo920b() + ", isValid=" + mo921c() + " }";
    }

    public akp(Bundle bundle) {
        this.f782a = bundle;
    }
}
