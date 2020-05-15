package p000;

import java.util.Collection;
import java.util.Set;

/* renamed from: aeac */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeac extends aebz {

    /* renamed from: a */
    public final Set f62979a = new C1225nr();

    public aeac() {
        this.f63102n = false;
    }

    /* renamed from: b */
    private static final void m51505b(aeab aeab) {
        if (aeab == null || aeab.f62977a == null) {
            throw new IllegalArgumentException("Uri must not be null.");
        }
    }

    /* renamed from: a */
    public final aead mo33974b() {
        super.mo34031d();
        if (!this.f62979a.isEmpty()) {
            mo34030c();
            return new aead(this);
        }
        throw new IllegalArgumentException("Must provide at least one URI to observe.");
    }

    /* renamed from: a */
    public final void mo33972a(aeab aeab) {
        m51505b(aeab);
        this.f62979a.add(aeab);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List, java.util.Collection], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public final void mo33973a(Collection r4) {
        int size = r4.size();
        for (int i = 0; i < size; i++) {
            m51505b((aeab) r4.get(i));
        }
        this.f62979a.addAll(r4);
    }
}
