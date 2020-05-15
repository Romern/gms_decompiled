package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: caqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caqc implements caqe {

    /* renamed from: a */
    private final List f175529a;

    /* renamed from: b */
    private final int f175530b;

    public caqc(boolean z) {
        ArrayList arrayList = new ArrayList();
        this.f175529a = arrayList;
        if (!z) {
            this.f175530b = 2;
            arrayList.add(cash.CREDENTIALS_NOT_AVAILABLE);
            return;
        }
        this.f175530b = 1;
    }

    /* renamed from: a */
    public final casg mo74754a() {
        return new casg(this.f175530b, this.f175529a);
    }
}
