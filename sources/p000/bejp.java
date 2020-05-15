package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: bejp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bejp implements bqeh {

    /* renamed from: a */
    public final List f111667a;

    /* renamed from: b */
    public final Executor f111668b;

    public bejp(List list, Executor executor) {
        this.f111667a = list;
        this.f111668b = executor;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bqgg mo6375a(Object obj) {
        belg belg = (belg) obj;
        int size = this.f111667a.size();
        ArrayList arrayList = new ArrayList(size);
        List list = this.f111667a;
        int size2 = list.size();
        for (int i = 0; i < size2; i++) {
            belw belw = (belw) list.get(i);
            arrayList.add(bqga.m112775a((Object) true));
        }
        bqeh a = bljx.m107266a(new bejl(this, arrayList, size));
        bqfb bqfb = bqfb.INSTANCE;
        blkh.m107286a();
        return bqdx.m112674a(bqdx.m112674a(bqga.m112772a(belg.f111760a.f111763c.mo66570a()), bljx.m107266a(new belf(belg, a, bqfb)), bqfb.INSTANCE), bljx.m107266a(new bejm(this, size, arrayList)), bqfb.INSTANCE);
    }
}
