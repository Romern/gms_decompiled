package p000;

import android.content.Context;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.api.ApiChimeraService;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.events.internal.TransferProgressData;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* renamed from: ubd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ubd {

    /* renamed from: a */
    public static final EnumSet f47087a = EnumSet.of(txr.CREATE_FILE, txr.CONTENT_AND_METADATA);

    /* renamed from: d */
    private static final sbw f47088d = new sbw("PendingActionManager", "");

    /* renamed from: b */
    public final snf f47089b;

    /* renamed from: c */
    public Runnable f47090c;

    /* renamed from: e */
    private final uhn f47091e;

    /* renamed from: f */
    private final Context f47092f;

    /* renamed from: g */
    private final vpu f47093g;

    /* renamed from: h */
    private final uav f47094h;

    /* renamed from: i */
    private final ufe f47095i;

    /* renamed from: j */
    private final uqe f47096j;

    /* renamed from: k */
    private final vcz f47097k;

    /* renamed from: l */
    private final sqv f47098l;

    /* renamed from: m */
    private final vfd f47099m;

    /* renamed from: n */
    private final List f47100n = new LinkedList();

    /* renamed from: o */
    private final Map f47101o = new HashMap();

    /* renamed from: p */
    private final List f47102p = new ArrayList();

    /* renamed from: q */
    private final Map f47103q = new HashMap();

    /* renamed from: r */
    private ThreadPoolExecutor f47104r;

    /* renamed from: s */
    private ThreadPoolExecutor f47105s;

    /* renamed from: t */
    private final veg f47106t;

    public ubd(uhn uhn, veg veg, Context context, uat uat, vpu vpu, uav uav, vpp vpp, ufe ufe, snf snf, uqe uqe, vcz vcz, sqv sqv, vfd vfd) {
        sdo.m34959a(uhn);
        this.f47091e = uhn;
        sdo.m34959a(veg);
        this.f47106t = veg;
        sdo.m34959a(context);
        this.f47092f = context;
        sdo.m34959a(uat);
        sdo.m34959a(vpu);
        this.f47093g = vpu;
        sdo.m34959a(uav);
        this.f47094h = uav;
        sdo.m34959a(vpp);
        sdo.m34959a(ufe);
        this.f47095i = ufe;
        sdo.m34959a(snf);
        this.f47089b = snf;
        sdo.m34959a(uqe);
        this.f47096j = uqe;
        sdo.m34959a(vcz);
        this.f47097k = vcz;
        sdo.m34959a(sqv);
        this.f47098l = sqv;
        sdo.m34959a(vfd);
        this.f47099m = vfd;
    }

    /* renamed from: a */
    private static final List m37861a(List list, AppIdentity appIdentity, uih uih, List list2) {
        return vot.m40951a(list, new ubc(appIdentity, uih, list2));
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ube.a(int, boolean):void
     arg types: [int, int]
     candidates:
      ube.a(long, long):void
      ube.a(int, boolean):void */
    /* renamed from: b */
    private final synchronized void m37870b(List list) {
        for (ube ube : bnkn.m109666a(list)) {
            try {
                m37867a(ube, true, 3, this.f47091e, this.f47095i, this.f47094h);
                ube.mo27052a(8, true);
                m37874d(ube);
                ube.f47108a.mo27726u();
                ube.mo27051a();
                this.f47095i.mo27275a();
            } catch (Throwable th) {
                m37874d(ube);
                ube.f47108a.mo27726u();
                ube.mo27051a();
                this.f47095i.mo27275a();
                throw th;
            }
        }
    }

    /* renamed from: c */
    private final void m37872c(ube ube) {
        this.f47100n.add(ube);
        if (ube.mo27061e()) {
            List list = (List) this.f47101o.get(ube.mo27057b().mo26913s());
            if (list == null) {
                this.f47101o.put(ube.mo27057b().mo26913s(), new ArrayList());
                list = (List) this.f47101o.get(ube.mo27057b().mo26913s());
            }
            list.add(ube);
        }
        m37873c(ube, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        return;
     */
    /* renamed from: d */
    private final synchronized void m37874d(ube ube) {
        if (!this.f47100n.remove(ube)) {
            f47088d.mo25377c("PendingActionManager", "The action was not found in the list of queued actions");
        }
        this.f47103q.remove(ube);
        ukk s = ube.mo27057b().mo26913s();
        List list = (List) this.f47101o.get(s);
        if (list != null) {
            list.remove(ube);
        }
        if (list != null) {
            if (list.size() > 0) {
                m37873c((ube) list.get(0), 1);
                return;
            }
        }
        if (ube.mo27061e()) {
            try {
                ujx a = this.f47091e.mo27402a(ube.mo27057b().mo26892c(this.f47091e), s);
                if (a != null) {
                    this.f47096j.mo27858a(new TransferProgressData(0, a.mo27610g()), a);
                }
            } catch (tzw e) {
                f47088d.mo25369a("App no longer authorized so cannot notify upload listeners. Action: %s", ube);
            }
        }
    }

    /* renamed from: g */
    private final synchronized void m37875g() {
        uhn uhn = this.f47091e;
        ugx ugx = (ugx) uhn;
        uig a = ugx.mo27363a(((ugx) uhn).f47578a.mo27468a(ulq.f48148a.mo27735b(), (String[]) null, (uog) null, String.valueOf(ulq.f48148a.f48341a.mo27700a()).concat(" ASC")), uln.m38936b());
        try {
            Iterator it = a.iterator();
            while (it.hasNext()) {
                ube a2 = m37864a((uln) it.next());
                if (a2 != null) {
                    m37872c(a2);
                }
            }
        } finally {
            a.close();
        }
    }

    /* renamed from: h */
    private final List m37876h() {
        List list = this.f47100n;
        List list2 = this.f47102p;
        sdo.m34959a(list2);
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            if (!list2.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public final synchronized void mo27048e() {
        if (this.f47090c == null && !this.f47103q.isEmpty()) {
            long longValue = ((Long) twy.f46880g.mo58455c()).longValue();
            if (longValue > 0) {
                uba uba = new uba(this);
                this.f47090c = uba;
                this.f47089b.mo25814a(uba, longValue, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* renamed from: f */
    public final synchronized void mo27049f() {
        for (ube ube : this.f47100n) {
            ube.mo27064h();
        }
    }

    /* renamed from: a */
    private static final List m37862a(List list, uih uih, DriveId driveId) {
        return vot.m40951a(list, new ubb(uih, driveId));
    }

    /* renamed from: a */
    public static ubd m37863a(uhn uhn, veg veg, Context context, uat uat, vpu vpu, uav uav, vpp vpp, ufe ufe, uqe uqe, vcz vcz, sqv sqv, vfd vfd) {
        sdo.m34970a(!uhn.mo27382b());
        ubd ubd = new ubd(uhn, veg, context, uat, vpu, uav, vpp, ufe, snp.m35703a(1, 9), uqe, vcz, sqv, vfd);
        ubd.mo27036a();
        return ubd;
    }

    /* renamed from: a */
    private final ube m37864a(uln uln) {
        try {
            return new ube(uln, uat.m37850a(this.f47091e, uln), this.f47096j, this.f47091e, this.f47099m);
        } catch (JSONException e) {
            f47088d.mo25378c("PendingActionManager", String.format("Discarded action that could not be deserialized: %s", uln), e);
            uln.mo27726u();
            this.f47095i.mo27275a();
            return null;
        }
    }

    /* renamed from: c */
    private final synchronized void m37873c(ube ube, int i) {
        List list = (List) this.f47101o.get(ube.mo27057b().mo26913s());
        boolean z = false;
        if (list != null && !list.isEmpty() && ube.equals(list.get(0))) {
            z = true;
        }
        ube.mo27052a(i, z);
    }

    /* renamed from: b */
    private final synchronized void m37871b(ube ube) {
        if (!this.f47102p.remove(ube)) {
            f47088d.mo25377c("PendingActionManager", "The action was not found in the list of executing actions");
        }
    }

    /* renamed from: c */
    public final synchronized void mo27045c() {
        sdo.m34970a(!this.f47091e.mo27382b());
        notifyAll();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        if (r4.mo28375c() == false) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d9, code lost:
        return null;
     */
    /* renamed from: b */
    public final synchronized ube mo27041b(boolean z) {
        int i;
        if (this.f47106t.mo28343a()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f47100n.iterator();
            while (it.hasNext()) {
                ube ube = (ube) it.next();
                if (!this.f47102p.contains(ube)) {
                    try {
                        txp b = ube.mo27057b();
                        b.mo26892c(ube.f47109b);
                        if (!ube.mo27065i()) {
                            if (b.mo26901j()) {
                                vfb vfb = ube.f47110c;
                                if (vfb != null) {
                                }
                            }
                            txp b2 = ube.mo27057b();
                            if (!m37868a(b2, this.f47102p)) {
                                if (!m37868a(b2, arrayList)) {
                                    if (z) {
                                        if (ube.mo27055a(f47087a)) {
                                            arrayList.add(ube);
                                        }
                                    }
                                    vpo vpo = (vpo) this.f47103q.get(ube);
                                    if (vpo != null) {
                                        if (!vpo.mo28703d()) {
                                            m37873c(ube, 4);
                                            arrayList.add(ube);
                                        } else {
                                            vpo.mo28706g();
                                        }
                                    }
                                    this.f47102p.add(ube);
                                    m37873c(ube, 6);
                                    return ube;
                                }
                            }
                            m37873c(ube, 3);
                            arrayList.add(ube);
                        }
                        if (!ube.mo27065i()) {
                            i = 2;
                        } else {
                            i = 5;
                        }
                        m37873c(ube, i);
                        arrayList.add(ube);
                    } catch (tzu e) {
                        m37866a(ube, this.f47091e);
                        it.remove();
                        ube.f47108a.mo27726u();
                        ube.mo27051a();
                        this.f47095i.mo27275a();
                    } catch (Throwable th) {
                        it.remove();
                        ube.f47108a.mo27726u();
                        ube.mo27051a();
                        this.f47095i.mo27275a();
                        throw th;
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final synchronized boolean mo27046c(uih uih, DriveId driveId) {
        boolean z;
        List<ube> a = m37862a(this.f47100n, uih, driveId);
        if (!a.isEmpty()) {
            for (ube ube : a) {
                ube.mo27064h();
            }
            notifyAll();
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    private static void m37865a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ube) it.next()).mo27062f();
        }
    }

    /* renamed from: a */
    private static void m37866a(ube ube, uhn uhn) {
        ube.mo27054a(new txu(uhn, ube.f47108a.f48366m, null));
    }

    /* renamed from: d */
    public final synchronized void mo27047d() {
        Iterator it = this.f47103q.values().iterator();
        while (true) {
            if (it.hasNext()) {
                if (((vpo) it.next()).mo28702c()) {
                    notifyAll();
                    break;
                }
            } else {
                break;
            }
        }
    }

    /* renamed from: a */
    static void m37867a(ube ube, boolean z, int i, uhn uhn, ufe ufe, uav uav) {
        synchronized (ufe.f47414f) {
            uau a = ube.mo27057b().mo26876a(uhn);
            if (z) {
                m37866a(ube, uhn);
            }
            if (a != null) {
                uav.mo27024a(i, a);
            }
        }
    }

    /* renamed from: a */
    static boolean m37868a(txp txp, List list) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (((ube) list.get(i)).mo27057b().mo26885a(txp)) {
                return true;
            }
            i = i2;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0069, code lost:
        return false;
     */
    /* renamed from: a */
    private final synchronized boolean m37869a(ube ube) {
        ube ube2;
        if (!ube.mo27057b().mo26903l()) {
            return false;
        }
        ukk s = ube.mo27057b().mo26913s();
        int size = this.f47100n.size() - 1;
        while (true) {
            if (size < 0) {
                ube2 = null;
                break;
            }
            txp b = ((ube) this.f47100n.get(size)).mo27057b();
            if (b instanceof tyr) {
                if (((tyr) b).mo26920o().contains(s)) {
                    ube2 = (ube) this.f47100n.get(size);
                    break;
                }
            } else if (s.equals(b.mo26913s())) {
                ube2 = (ube) this.f47100n.get(size);
                break;
            }
            size--;
        }
        if (ube2 != null && ube2.mo27056a(ube)) {
            return ube2.mo27058b(ube);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ThreadPoolExecutor mo27034a(boolean z, int i) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 10, TimeUnit.SECONDS, new uao(this.f47093g, this.f47091e, this.f47106t, this.f47094h, this.f47095i, this, this.f47097k, this.f47098l, z));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized ube mo27035a(boolean z) {
        ube b;
        while (true) {
            b = mo27041b(z);
            if (b == null) {
                wait();
            }
        }
        return b;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ubd.a(boolean, int):java.util.concurrent.ThreadPoolExecutor
     arg types: [int, int]
     candidates:
      ubd.a(ube, uhn):void
      ubd.a(txp, java.util.List):boolean
      ubd.a(ube, int):void
      ubd.a(uih, com.google.android.gms.drive.DriveId):boolean
      ubd.a(boolean, int):java.util.concurrent.ThreadPoolExecutor */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo27036a() {
        boolean z;
        boolean z2;
        if (this.f47104r == null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        if (this.f47105s == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        sdo.m34970a(z2);
        m37875g();
        ThreadPoolExecutor a = mo27034a(false, ((Integer) twy.f46878e.mo58455c()).intValue());
        this.f47104r = a;
        a.prestartAllCoreThreads();
        if (((Integer) twy.f46879f.mo58455c()).intValue() > 0) {
            ThreadPoolExecutor a2 = mo27034a(true, ((Integer) twy.f46879f.mo58455c()).intValue());
            this.f47105s = a2;
            a2.prestartAllCoreThreads();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final synchronized void mo27042b(ube ube, int i) {
        sdo.m34970a(!this.f47091e.mo27382b());
        m37871b(ube);
        if (i != 1) {
            if (i != 4) {
                if (i != 5) {
                    f47088d.mo25374b("PendingActionManager", "Cannot skip action using status: %s", Integer.valueOf(i));
                }
            } else if (!this.f47103q.containsKey(ube)) {
                this.f47103q.put(ube, new voy(((Long) twy.f46816a.mo58455c()).longValue(), ((Double) twy.f46876c.mo58455c()).doubleValue(), ((Long) twy.f46869b.mo58455c()).longValue()));
                mo27048e();
            }
            m37873c(ube, i);
            notifyAll();
        }
        this.f47103q.remove(ube);
        m37873c(ube, i);
        notifyAll();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo27037a(long j) {
        uhn uhn = this.f47091e;
        ugx ugx = (ugx) uhn;
        uln uln = (uln) ugx.m38386b(ugx.mo27363a(((ugx) uhn).f47578a.mo27468a(ulq.f48148a.mo27735b(), (String[]) null, ulq.f48148a.f48341a.mo27717e(j), (String) null), uln.m38936b()));
        if (uln != null) {
            ube a = m37864a(uln);
            if (a != null && !m37869a(a)) {
                m37872c(a);
                ApiChimeraService.m22937b(this.f47092f);
                this.f47104r.prestartCoreThread();
                ThreadPoolExecutor threadPoolExecutor = this.f47105s;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.prestartCoreThread();
                }
                notifyAll();
            }
        } else {
            f47088d.mo25369a("Ignoring enqueuePendingAction (action id: %d): not persisted in DB", Long.valueOf(j));
        }
    }

    /* renamed from: b */
    public final synchronized boolean mo27043b() {
        return !this.f47100n.isEmpty();
    }

    /* renamed from: b */
    public final synchronized boolean mo27044b(uih uih, DriveId driveId) {
        boolean z;
        List<ube> a = m37862a(this.f47100n, uih, driveId);
        if (!a.isEmpty()) {
            for (ube ube : a) {
                ube.mo27063g();
            }
            notifyAll();
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public final synchronized void mo27038a(AppIdentity appIdentity, uih uih, List list) {
        sdo.m34959a(appIdentity);
        sdo.m34959a(list);
        sdo.m34974b(!list.isEmpty());
        m37870b(m37861a(m37876h(), appIdentity, uih, list));
        m37865a(m37861a(this.f47102p, appIdentity, uih, list));
        notifyAll();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo27039a(ube ube, int i) {
        sdo.m34970a(!this.f47091e.mo27382b());
        m37873c(ube, i);
        m37871b(ube);
        m37874d(ube);
        ube.f47108a.mo27726u();
        ube.mo27051a();
        this.f47095i.mo27275a();
        notifyAll();
        if (this.f47100n.isEmpty()) {
            ApiChimeraService.m22936a(this.f47092f);
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo27040a(uih uih, DriveId driveId) {
        boolean z;
        boolean z2;
        sdo.m34959a(driveId);
        List a = m37862a(m37876h(), uih, driveId);
        z = true;
        if (!a.isEmpty()) {
            m37870b(a);
            z2 = true;
        } else {
            z2 = false;
        }
        List a2 = m37862a(this.f47102p, uih, driveId);
        if (!a2.isEmpty()) {
            m37865a(a2);
        } else {
            z = z2;
        }
        notifyAll();
        return z;
    }
}
