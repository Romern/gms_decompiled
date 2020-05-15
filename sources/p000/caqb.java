package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: caqb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caqb implements caqe {

    /* renamed from: a */
    private final List f175527a;

    /* renamed from: b */
    private final int f175528b;

    public caqb(boolean z, boolean z2, boolean z3) {
        ArrayList arrayList = new ArrayList();
        this.f175527a = arrayList;
        if (z2 && z3 && !z) {
            this.f175528b = 2;
            arrayList.add(cash.CREDENTIALS_NOT_ACCESSIBLE_WITHOUT_CVM);
            return;
        }
        this.f175528b = 1;
    }

    /* renamed from: a */
    public final casg mo74754a() {
        return new casg(this.f175528b, this.f175527a);
    }
}
