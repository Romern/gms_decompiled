package p000;

import java.util.HashMap;
import java.util.Iterator;

/* renamed from: hm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1053hm extends C0053bl {

    /* renamed from: a */
    public static final C0056bn f20003a = new C1052hl();

    /* renamed from: d */
    public final HashMap f20004d = new HashMap();

    /* renamed from: e */
    public final HashMap f20005e = new HashMap();

    /* renamed from: f */
    public final HashMap f20006f = new HashMap();

    /* renamed from: g */
    public final boolean f20007g;

    /* renamed from: h */
    public boolean f20008h = false;

    /* renamed from: i */
    public boolean f20009i = false;

    public C1053hm(boolean z) {
        this.f20007g = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12606a(C1018gh ghVar) {
        if (this.f20009i) {
            C1050hj.m14443a(2);
        } else if (!this.f20004d.containsKey(ghVar.f18192i)) {
            this.f20004d.put(ghVar.f18192i, ghVar);
            if (C1050hj.m14443a(2)) {
                "Updating retained Fragments: Added " + ghVar;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo12607b(C1018gh ghVar) {
        if (!this.f20004d.containsKey(ghVar.f18192i) || !this.f20007g) {
            return true;
        }
        return this.f20008h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo12608c(C1018gh ghVar) {
        if (this.f20009i) {
            C1050hj.m14443a(2);
        } else if (this.f20004d.remove(ghVar.f18192i) != null && C1050hj.m14443a(2)) {
            "Updating retained Fragments: Removed " + ghVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C1053hm hmVar = (C1053hm) obj;
            return this.f20004d.equals(hmVar.f20004d) && this.f20005e.equals(hmVar.f20005e) && this.f20006f.equals(hmVar.f20006f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo3218f() {
        if (C1050hj.m14443a(3)) {
            "onCleared called for " + this;
        }
        this.f20008h = true;
    }

    public final int hashCode() {
        return (((this.f20004d.hashCode() * 31) + this.f20005e.hashCode()) * 31) + this.f20006f.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f20004d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f20005e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f20006f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
