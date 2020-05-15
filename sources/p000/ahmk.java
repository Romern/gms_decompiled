package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ahmk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahmk {

    /* renamed from: a */
    final int f67540a;

    /* renamed from: b */
    final List f67541b;

    private ahmk(int i, List list) {
        ArrayList a = bnkn.m109661a();
        this.f67541b = a;
        this.f67540a = i;
        if (list != null) {
            a.addAll(list);
        }
    }

    /* renamed from: a */
    protected static ahmk m56134a() {
        return new ahmk(8007, null);
    }

    /* renamed from: a */
    protected static ahmk m56135a(List list) {
        if (list.isEmpty()) {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68405a("StartOperationResult#success expected at least one medium but none were provided");
        }
        return new ahmk(0, list);
    }
}
