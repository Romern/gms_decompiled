package p000;

import android.os.StrictMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: ayvu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayvu {

    /* renamed from: a */
    public final bqgj f98580a;

    /* renamed from: b */
    public final Set f98581b;

    /* renamed from: c */
    public final ayvq f98582c;

    /* renamed from: d */
    private final cijl f98583d;

    /* renamed from: e */
    private final Executor f98584e;

    /* renamed from: f */
    private volatile bnhe f98585f;

    public ayvu(bqgj bqgj, cijl cijl, Set set, ayvq ayvq) {
        this.f98580a = bqgj;
        this.f98583d = cijl;
        this.f98581b = set;
        this.f98582c = ayvq;
        this.f98584e = bqgs.m112813a((Executor) bqgj);
        bmxy.m108601b(!set.isEmpty(), "No logging result handlers provided.");
    }

    /* renamed from: a */
    public static bqgg m84945a(ayvy ayvy, ayvv ayvv) {
        return ayvv.mo54458a(ayvy);
    }

    /* renamed from: a */
    private final void m84946a(bqgg bqgg) {
        for (ayzy ayzy : this.f98581b) {
            bqga.m112781a(bqgg, new ayzx(), bqfb.INSTANCE);
        }
    }

    /* renamed from: a */
    public final List mo54456a(Class cls) {
        bnhe bnhe = this.f98585f;
        if (bnhe == null) {
            synchronized (this) {
                bnhe = this.f98585f;
                if (bnhe == null) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    for (ayvv ayvv : ((cazi) this.f98583d).mo6445a()) {
                        if (ayvv.mo54459a().isEmpty()) {
                            arrayList.add(ayvv);
                        }
                        for (Class cls2 : ayvv.mo54459a()) {
                            List list = (List) hashMap.get(cls2);
                            if (list == null) {
                                list = new ArrayList();
                                hashMap.put(cls2, list);
                            }
                            list.add(ayvv);
                        }
                    }
                    hashMap.put(ayvw.class, arrayList);
                    bnhe = bnhe.m109413a(hashMap);
                    this.f98585f = bnhe;
                }
            }
        }
        return (List) bnhe.getOrDefault(cls, bngx.m109376e());
    }

    /* renamed from: a */
    public final void mo54457a(ayvt ayvt) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).detectAll().build());
        try {
            long nanoTime = System.nanoTime();
            ayvx ayvx = new ayvx();
            List a = ayvt.mo54455a();
            if (a != null && !a.isEmpty()) {
                bqgy c = bqgy.m112818c();
                m84946a(bqga.m112771a(bljx.m107265a(new ayvr(this, a, c, ayvx)), this.f98584e));
                c.mo69138b(Long.valueOf(System.nanoTime() - nanoTime));
            }
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
        StrictMode.setThreadPolicy(threadPolicy);
    }
}
