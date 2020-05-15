package p000;

import java.util.HashSet;

/* renamed from: gz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1038gz {

    /* renamed from: a */
    final /* synthetic */ C1050hj f19271a;

    public C1038gz(C1050hj hjVar) {
        this.f19271a = hjVar;
    }

    /* renamed from: a */
    public final void mo12338a(C1018gh ghVar, C1187mg mgVar) {
        C1050hj hjVar = this.f19271a;
        if (hjVar.f19857h.get(ghVar) == null) {
            hjVar.f19857h.put(ghVar, new HashSet());
        }
        ((HashSet) hjVar.f19857h.get(ghVar)).add(mgVar);
    }

    /* renamed from: b */
    public final void mo12339b(C1018gh ghVar, C1187mg mgVar) {
        if (!mgVar.mo15460a()) {
            C1050hj hjVar = this.f19271a;
            HashSet hashSet = (HashSet) hjVar.f19857h.get(ghVar);
            if (hashSet != null && hashSet.remove(mgVar) && hashSet.isEmpty()) {
                hjVar.f19857h.remove(ghVar);
                if (ghVar.f18188e < 4) {
                    hjVar.mo12540b(ghVar);
                    hjVar.mo12546c(ghVar);
                }
            }
        }
    }
}
