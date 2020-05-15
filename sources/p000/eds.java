package p000;

import java.util.Comparator;

/* renamed from: eds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eds implements Comparator {
    protected eds() {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        edr edr = (edr) obj;
        edr edr2 = (edr) obj2;
        if (edr.f14749a.mo18022j().mo18096c() == edr2.f14749a.mo18022j().mo18096c()) {
            return edr.f14751c - edr2.f14751c;
        }
        return edy.m10195a(edr.f14749a.mo18022j().mo18096c(), edr2.f14749a.mo18022j().mo18096c());
    }
}
