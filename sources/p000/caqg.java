package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: caqg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caqg implements caqe {

    /* renamed from: a */
    private final List f175533a;

    /* renamed from: b */
    private final int f175534b;

    public caqg(boolean z) {
        ArrayList arrayList = new ArrayList();
        this.f175533a = arrayList;
        if (!z) {
            this.f175534b = 3;
            arrayList.add(cash.TRANSACTION_CONDITIONS_NOT_ALLOWED);
            return;
        }
        this.f175534b = 1;
    }

    /* renamed from: a */
    public final casg mo74754a() {
        return new casg(this.f175534b, this.f175533a);
    }
}
