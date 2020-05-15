package p000;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;

/* renamed from: bynr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bynr implements bynf {

    /* renamed from: a */
    private static final byne f167127a = new bynt();

    /* renamed from: b */
    private final ConcurrentMap f167128b = new ConcurrentHashMap(3, 0.75f, 1);

    /* renamed from: c */
    private final bynn f167129c;

    /* renamed from: d */
    private final bynw f167130d;

    public bynr(bynn bynn, bynw bynw) {
        bmxy.m108581a(bynn);
        this.f167129c = bynn;
        bmxy.m108581a(bynw);
        this.f167130d = bynw;
    }

    /* renamed from: a */
    private final bqgg m125002a(byne byne) {
        String str = byne.mo74395a().f167104a;
        bynw bynw = this.f167130d;
        String str2 = bynw.f167140a;
        Object[] objArr = {str2, str};
        bqgy c = bqgy.m112818c();
        bynw.f167142c.mo25236a(str2, str, (String) null).mo50371a(new acrw(str2, str, c));
        byne.mo74400a(c);
        return c;
    }

    /* renamed from: b */
    public final byne mo74404b(String str) {
        ConcurrentMap concurrentMap = this.f167128b;
        bmxy.m108581a(str);
        byne byne = (byne) concurrentMap.get(str);
        return byne == null ? f167127a : byne;
    }

    /* renamed from: a */
    public final void mo74401a() {
        ArrayList arrayList = new ArrayList();
        for (byne byne : this.f167128b.values()) {
            arrayList.add(m125002a(byne));
        }
        bqdx.m112673a(bqga.m112774a((Iterable) arrayList), new bynp(), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final void mo74402a(bynd bynd) {
        acrt acrt = (acrt) this.f167129c.f167124a.mo6445a();
        bynn.m124997a(acrt, 1);
        Executor b = acse.m49793b();
        bynn.m124997a(b, 2);
        bynn.m124997a(bynd, 3);
        bynm bynm = new bynm(acrt, b, bynd);
        bmxy.m108581a(bynm);
        bqga.m112781a(m125002a(bynm), new bynq(), bqfb.INSTANCE);
        this.f167128b.put(bynd.f167104a, bynm);
    }

    /* renamed from: a */
    public final boolean mo74403a(String str) {
        ConcurrentMap concurrentMap = this.f167128b;
        bmxy.m108581a(str);
        return concurrentMap.containsKey(str);
    }
}
