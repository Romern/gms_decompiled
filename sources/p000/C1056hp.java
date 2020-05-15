package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: hp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1056hp {

    /* renamed from: a */
    public final ArrayList f20147a = new ArrayList();

    /* renamed from: b */
    public final HashMap f20148b = new HashMap();

    /* renamed from: c */
    public C1053hm f20149c;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12661a() {
        this.f20148b.values().removeAll(Collections.singleton(null));
    }

    /* renamed from: b */
    public final C1055ho mo12665b(String str) {
        return (C1055ho) this.f20148b.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C1018gh mo12669c(String str) {
        C1055ho hoVar = (C1055ho) this.f20148b.get(str);
        if (hoVar != null) {
            return hoVar.f20099a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final List mo12671d() {
        ArrayList arrayList = new ArrayList();
        for (C1055ho hoVar : this.f20148b.values()) {
            if (hoVar != null) {
                arrayList.add(hoVar.f20099a);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final List mo12666b() {
        ArrayList arrayList = new ArrayList();
        for (C1055ho hoVar : this.f20148b.values()) {
            if (hoVar != null) {
                arrayList.add(hoVar);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final List mo12670c() {
        ArrayList arrayList;
        if (this.f20147a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f20147a) {
            arrayList = new ArrayList(this.f20147a);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12662a(C1018gh ghVar) {
        if (!this.f20147a.contains(ghVar)) {
            synchronized (this.f20147a) {
                this.f20147a.add(ghVar);
            }
            ghVar.f18198o = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + ghVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12667b(C1018gh ghVar) {
        synchronized (this.f20147a) {
            this.f20147a.remove(ghVar);
        }
        ghVar.f18198o = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12663a(C1055ho hoVar) {
        C1018gh ghVar = hoVar.f20099a;
        if (!mo12664a(ghVar.f18192i)) {
            this.f20148b.put(ghVar.f18192i, hoVar);
            if (ghVar.f18169F) {
                if (ghVar.f18168E) {
                    this.f20149c.mo12606a(ghVar);
                } else {
                    this.f20149c.mo12608c(ghVar);
                }
                ghVar.f18169F = false;
            }
            if (C1050hj.m14443a(2)) {
                "Added fragment to active set " + ghVar;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12668b(C1055ho hoVar) {
        C1018gh ghVar = hoVar.f20099a;
        if (ghVar.f18168E) {
            this.f20149c.mo12608c(ghVar);
        }
        if (((C1055ho) this.f20148b.put(ghVar.f18192i, null)) != null && C1050hj.m14443a(2)) {
            "Removed fragment from active set " + ghVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo12664a(String str) {
        return this.f20148b.get(str) != null;
    }
}
