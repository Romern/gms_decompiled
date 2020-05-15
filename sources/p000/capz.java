package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: capz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class capz implements caqe {

    /* renamed from: a */
    private final List f175524a;

    /* renamed from: b */
    private final int f175525b;

    public capz(boolean z) {
        ArrayList arrayList = new ArrayList();
        this.f175524a = arrayList;
        if (!z) {
            this.f175525b = 2;
            arrayList.add(cash.MISSING_CONSENT);
            return;
        }
        this.f175525b = 1;
    }

    /* renamed from: a */
    public final casg mo74754a() {
        return new casg(this.f175525b, this.f175524a);
    }
}
