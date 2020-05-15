package p000;

import android.util.Pair;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.DataUpdateNotification;
import com.google.android.gms.fitness.store.listener.DataUpdateListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: zsj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zsj implements zre {

    /* renamed from: b */
    protected final zre f55795b;

    /* renamed from: c */
    protected final String f55796c;

    /* renamed from: d */
    private final zsm f55797d;

    public zsj(zre zre, String str, zsm zsm) {
        this.f55795b = zre;
        this.f55796c = str;
        this.f55797d = zsm;
    }

    /* renamed from: a */
    private final void m46167a(int i, long j, long j2, caae caae) {
        ysl ysl;
        DataSource dataSource;
        DataType dataType;
        if (this.f55797d != null) {
            DataSource a = yvx.m44926a(caae);
            caah caah = caae.f172330f;
            if (caah == null) {
                caah = caah.f172333d;
            }
            DataUpdateNotification dataUpdateNotification = new DataUpdateNotification(j, j2, i, a, ywb.m44931a(caah));
            zsm zsm = this.f55797d;
            String str = this.f55796c;
            DataSource dataSource2 = dataUpdateNotification.f32071d;
            DataType dataType2 = dataUpdateNotification.f32072e;
            ArrayList arrayList = new ArrayList();
            for (DataUpdateListener dataUpdateListener : zsm.f55816m.mo30751b()) {
                if (dataUpdateListener.f32449a.equals(str) && (((dataSource = dataUpdateListener.f32451c) == null || dataSource.equals(dataSource2)) && ((dataType = dataUpdateListener.f32452d) == null || dataType.equals(dataType2)))) {
                    arrayList.add(dataUpdateListener);
                }
            }
            if (!arrayList.isEmpty()) {
                if (cdyr.f181940a.mo6606a().mo78493s()) {
                    ysl = zsm.f55805b.mo30741b(str);
                } else {
                    ysl = null;
                }
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    DataUpdateListener dataUpdateListener2 = (DataUpdateListener) arrayList.get(i2);
                    if (ysl != null) {
                        DataType dataType3 = dataUpdateListener2.f32452d;
                        if (dataType3 == null || ysl.mo30725b(dataUpdateListener2.f32450b, ywb.m44928a((List) bngx.m109356a(dataType3)), 1).mo17710c()) {
                            DataSource dataSource3 = dataUpdateListener2.f32451c;
                            if (dataSource3 != null && !ysl.mo30717a(dataUpdateListener2.f32450b, yvx.m44924a(bngx.m109356a(dataSource3)), 1).mo17710c()) {
                                zsm.mo31439b(str, dataUpdateListener2.f32450b, dataUpdateListener2.f32453e);
                            }
                        } else {
                            zsm.mo31439b(str, dataUpdateListener2.f32450b, dataUpdateListener2.f32453e);
                        }
                    }
                    ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) zsm.f55814k.get(dataUpdateListener2);
                    if (concurrentLinkedQueue == null) {
                        synchronized (dataUpdateListener2) {
                            concurrentLinkedQueue = new ConcurrentLinkedQueue();
                            zsm.f55814k.put(dataUpdateListener2, concurrentLinkedQueue);
                            zsm.f55815l.put(dataUpdateListener2, new AtomicBoolean(false));
                        }
                    }
                    if (concurrentLinkedQueue.size() < zsm.f55812i) {
                        concurrentLinkedQueue.add(dataUpdateNotification);
                    }
                    if (zsm.f55813j.get() < zsm.f55811h && !((AtomicBoolean) zsm.f55815l.get(dataUpdateListener2)).getAndSet(true)) {
                        zsl zsl = new zsl(zsm, dataUpdateListener2, concurrentLinkedQueue, str);
                        zsm.f55813j.incrementAndGet();
                        zsm.f55806c.post(zsl);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final long mo31349b() {
        return this.f55795b.mo31349b();
    }

    /* renamed from: c */
    public final int mo31352c() {
        return this.f55795b.mo31352c();
    }

    /* renamed from: d */
    public final int mo31355d() {
        return this.f55795b.mo31355d();
    }

    /* renamed from: e */
    public final bngx mo31357e(long j) {
        return this.f55795b.mo31357e(j);
    }

    /* renamed from: f */
    public final boolean mo31378f() {
        return this.f55795b.mo31378f();
    }

    /* renamed from: g */
    public final boolean mo31379g() {
        return this.f55795b.mo31379g();
    }

    /* renamed from: h */
    public final Set mo31388h() {
        return this.f55795b.mo31388h();
    }

    /* renamed from: i */
    public final Map mo31389i() {
        return this.f55795b.mo31389i();
    }

    /* renamed from: j */
    public final Map mo31390j() {
        return this.f55795b.mo31390j();
    }

    /* renamed from: k */
    public final Map mo31391k() {
        return this.f55795b.mo31391k();
    }

    /* renamed from: b */
    public final long mo31372b(caae caae) {
        return this.f55795b.mo31372b(caae);
    }

    /* renamed from: c */
    public final int mo31353c(long j) {
        return this.f55795b.mo31353c(j);
    }

    /* renamed from: d */
    public final int mo31356d(long j) {
        return this.f55795b.mo31356d(j);
    }

    /* renamed from: e */
    public final ydh mo31376e() {
        return this.f55795b.mo31376e();
    }

    /* renamed from: b */
    public final bngx mo31350b(int i, long j) {
        return this.f55795b.mo31350b(i, j);
    }

    /* renamed from: c */
    public final yqi mo31387c(caae caae) {
        return this.f55795b.mo31387c(caae);
    }

    /* renamed from: b */
    public final bngx mo31373b(yfz yfz) {
        return this.f55795b.mo31373b(yfz);
    }

    /* renamed from: c */
    public final zrb mo31354c(int i, long j) {
        return this.f55795b.mo31354c(i, j);
    }

    /* renamed from: b */
    public final caah mo31383b(String str) {
        return this.f55795b.mo31383b(str);
    }

    /* renamed from: c */
    public final void mo31375c(caae caae, long j, long j2) {
        this.f55795b.mo31375c(caae, j, j2);
    }

    /* renamed from: b */
    public final Set mo31384b(Set set) {
        return this.f55795b.mo31384b(set);
    }

    /* renamed from: c */
    public final void mo31395c(cadz cadz, int i) {
        this.f55795b.mo31395c(cadz, i);
    }

    /* renamed from: b */
    public final zrb mo31351b(long j) {
        return this.f55795b.mo31351b(j);
    }

    /* renamed from: b */
    public final void mo31374b(caae caae, long j, long j2) {
        this.f55795b.mo31374b(caae, j, j2);
    }

    /* renamed from: b */
    public final void mo31394b(cadz cadz, int i) {
        this.f55795b.mo31394b(cadz, i);
    }

    /* renamed from: b */
    public final void mo31385b(Collection collection) {
        this.f55795b.mo31385b(collection);
    }

    /* renamed from: b */
    public final void mo31386b(List list) {
        this.f55795b.mo31386b(list);
    }

    /* renamed from: a */
    private final void m46168a(List list, int i) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cadn cadn = (cadn) it.next();
            caae caae = cadn.f172705e;
            if (caae == null) {
                caae = caae.f172323i;
            }
            Pair pair = (Pair) hashMap.get(caae);
            if (pair == null) {
                hashMap.put(caae, Pair.create(Long.valueOf(cadn.f172702b), Long.valueOf(cadn.f172702b)));
            } else {
                long longValue = ((Long) pair.first).longValue();
                long longValue2 = ((Long) pair.second).longValue();
                long j = cadn.f172702b;
                hashMap.put(caae, Pair.create(Long.valueOf(Math.min(j, longValue)), Long.valueOf(Math.max(j, longValue2))));
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            m46167a(i, ((Long) ((Pair) entry.getValue()).first).longValue(), ((Long) ((Pair) entry.getValue()).second).longValue(), (caae) entry.getKey());
        }
    }

    /* renamed from: a */
    public final int mo31358a(caae caae) {
        return this.f55795b.mo31358a(caae);
    }

    /* renamed from: a */
    public final int mo31359a(caae caae, long j) {
        int a = this.f55795b.mo31359a(caae, j);
        m46167a(2, 0, j - 1, caae);
        return a;
    }

    /* renamed from: a */
    public final int mo31344a(List list) {
        return this.f55795b.mo31344a(list);
    }

    /* renamed from: a */
    public final long mo31345a() {
        return this.f55795b.mo31345a();
    }

    /* renamed from: a */
    public final long mo31360a(caae caae, int i) {
        return this.f55795b.mo31360a(caae, i);
    }

    /* renamed from: a */
    public final bngx mo31346a(int i, long j) {
        return this.f55795b.mo31346a(i, j);
    }

    /* renamed from: a */
    public final bngx mo31392a(String str, String str2, String str3, long j, long j2) {
        return this.f55795b.mo31392a(str, str2, str3, j, j2);
    }

    /* renamed from: a */
    public final bngx mo31361a(List list, boolean z) {
        bngx a = this.f55795b.mo31361a(list, z);
        m46168a(a, 1);
        return a;
    }

    /* renamed from: a */
    public final bngx mo31362a(yfz yfz) {
        return this.f55795b.mo31362a(yfz);
    }

    /* renamed from: a */
    public final caae mo31377a(String str) {
        return this.f55795b.mo31377a(str);
    }

    /* renamed from: a */
    public final cadp mo31363a(caae caae, long j, int i) {
        return this.f55795b.mo31363a(caae, j, i);
    }

    /* renamed from: a */
    public final cadp mo31364a(caae caae, long j, long j2) {
        return this.f55795b.mo31364a(caae, j, j2);
    }

    /* renamed from: a */
    public final cadp mo31365a(caae caae, long j, long j2, int i) {
        return this.f55795b.mo31365a(caae, j, j2, i);
    }

    /* renamed from: a */
    public final cadp mo31366a(cadp cadp, boolean z) {
        if (cadp.f172714c.size() == 0) {
            return cadp;
        }
        cadp a = this.f55795b.mo31366a(cadp, z);
        m46168a(cadp.f172714c, 1);
        return a;
    }

    /* renamed from: a */
    public final Set mo31380a(Collection collection) {
        return this.f55795b.mo31380a(collection);
    }

    /* renamed from: a */
    public final zrb mo31347a(long j) {
        return this.f55795b.mo31347a(j);
    }

    /* renamed from: a */
    public final void mo31367a(long j, long j2, caae caae, boolean z) {
        this.f55795b.mo31367a(j, j2, caae, z);
        m46167a(2, j, j2, caae);
    }

    /* renamed from: a */
    public final void mo31368a(caae caae, long j, long j2, cadp cadp) {
        this.f55795b.mo31368a(caae, j, j2, cadp);
        m46167a(3, j, j2, caae);
    }

    /* renamed from: a */
    public final void mo31369a(caae caae, List list, boolean z) {
        if (!list.isEmpty()) {
            this.f55795b.mo31369a(caae, list, z);
            m46168a(list, 2);
        }
    }

    /* renamed from: a */
    public final void mo31381a(caah caah) {
        this.f55795b.mo31381a(caah);
    }

    /* renamed from: a */
    public final void mo31348a(Set set) {
        this.f55795b.mo31348a(set);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: zrc.a(java.util.Set, long, long, boolean):void
     arg types: [java.util.Set, long, long, int]
     candidates:
      zrc.a(caae, long, long, int):cadp
      zrc.a(long, long, caae, boolean):void
      zrc.a(caae, long, long, cadp):void
      zrc.a(java.util.Set, long, long, boolean):void */
    /* renamed from: a */
    public final void mo31370a(Set set, long j, long j2, boolean z) {
        this.f55795b.mo31370a(set, j, j2, true);
        for (caae caae : mo31388h()) {
            caah caah = caae.f172330f;
            if (caah == null) {
                caah = caah.f172333d;
            }
            if (set.contains(caah.f172336b)) {
                m46167a(2, j, j2, caae);
            }
        }
    }

    /* renamed from: a */
    public final void mo31371a(ydh ydh) {
        this.f55795b.mo31371a(ydh);
    }

    /* renamed from: a */
    public final void mo31382a(yqi yqi) {
        this.f55795b.mo31382a(yqi);
    }

    /* renamed from: a */
    public final boolean mo31393a(cadz cadz, int i) {
        return this.f55795b.mo31393a(cadz, i);
    }
}
