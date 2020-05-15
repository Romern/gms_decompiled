package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: pog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pog extends poq {

    /* renamed from: c */
    private final List f39912c;

    public pog(pnl pnl, plx plx, List list, boolean z, boolean z2, String str) {
        super(pnl, plx, z, z2, str);
        ArrayList arrayList = new ArrayList();
        this.f39912c = arrayList;
        arrayList.addAll(list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo23518a(pnl pnl) {
        List list = this.f39912c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((poq) list.get(i)).mo23518a(pnl);
        }
    }
}
