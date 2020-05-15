package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: caqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caqd implements caqe {

    /* renamed from: a */
    private final List f175531a;

    /* renamed from: b */
    private final int f175532b;

    public caqd(boolean z, boolean z2, boolean z3, boolean z4, casy casy) {
        int f;
        ArrayList arrayList = new ArrayList();
        this.f175531a = arrayList;
        if (z) {
            if (z3 && !z2) {
                this.f175532b = 2;
                arrayList.add(cash.MISSING_CD_CVM);
            } else if (!z4) {
                this.f175532b = 2;
                this.f175531a.add(cash.INSUFFICIENT_CD_CVM);
            } else {
                this.f175532b = 1;
            }
        } else if (casy.mo74832d() == 1 || !((f = casy.mo74834f()) == 1 || f == 5)) {
            this.f175532b = 1;
        } else {
            this.f175532b = 3;
            this.f175531a.add(cash.INSUFFICIENT_POI_AUTHENTICATION);
        }
    }

    /* renamed from: a */
    public static boolean m126954a(cara cara, casy casy) {
        capb a = caoz.m126908a();
        boolean a2 = cara.mo74775a();
        long c = cara.f175644f.mo49419c();
        if (c > capb.f175513b) {
            capb.f175512a = 0;
            capb.f175513b = c;
        }
        if (casy.mo74832d() == 1) {
            return capb.m126910a(a.f175514c, capb.f175512a);
        }
        if (capb.f175513b + 300000 > System.currentTimeMillis() && a2 && capb.m126910a(a.f175515d, capb.f175512a)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m126955a(casy casy) {
        return casy.mo74832d() != 1 && casy.mo74831c();
    }

    /* renamed from: a */
    public final casg mo74754a() {
        return new casg(this.f175532b, this.f175531a);
    }
}
