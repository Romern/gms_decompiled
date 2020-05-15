package p000;

import android.app.job.JobInfo;
import android.net.Uri;
import android.os.PersistableBundle;
import android.os.SystemClock;
import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;

/* renamed from: apjr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apjr implements aphv {

    /* renamed from: a */
    public final aphw f84546a;

    /* renamed from: b */
    public final apln f84547b;

    /* renamed from: c */
    public final apia f84548c;

    /* renamed from: d */
    public final aamf f84549d;

    /* renamed from: e */
    public volatile boolean f84550e = false;

    /* renamed from: f */
    private final apie f84551f = new apie();

    /* renamed from: g */
    private final apib[] f84552g;

    /* renamed from: h */
    private final apjp f84553h;

    /* renamed from: i */
    private final adzi f84554i;

    /* renamed from: j */
    private final apjq f84555j;

    /* renamed from: k */
    private final apkg f84556k;

    /* renamed from: l */
    private long f84557l = -1;

    /* renamed from: m */
    private long f84558m;

    public apjr(apln apln, apib[] apibArr, aamf aamf, aphw aphw, apjp apjp, adzi adzi, apia apia, apkg apkg) {
        this.f84547b = apln;
        this.f84552g = apibArr;
        this.f84549d = aamf;
        this.f84546a = aphw;
        this.f84553h = apjp;
        this.f84554i = adzi;
        this.f84548c = apia;
        this.f84556k = apkg;
        this.f84555j = new apjq(this);
    }

    /* renamed from: a */
    private final synchronized aapn m70471a(Collection collection, List list) {
        aapn aapn;
        aech aech = new aech("nts:jobscheduler:sync");
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f84551f.mo47290d(new aecn().mo34038a());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                JobInfo jobInfo = (JobInfo) it.next();
                int id = jobInfo.getId();
                if (id >= 1000 && id < Integer.MAX_VALUE) {
                    this.f84554i.mo33955a(jobInfo.getId());
                }
            }
            Set set = bnon.f131923a;
            if (cedu.m136333b()) {
                set = this.f84556k.mo47357a();
            }
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                apid apid = (apid) it2.next();
                if (m70475a(apid, set)) {
                    m70476b(apid);
                }
            }
            if (cedu.m136333b()) {
                this.f84556k.mo47361a(this.f84551f.mo47286a());
            }
            bxvd da = aapn.f28810f.mo74144da();
            long size = (long) list.size();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aapn aapn2 = (aapn) da.f164949b;
            aapn2.f28812a |= 1;
            aapn2.f28813b = size;
            long size2 = (long) collection.size();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aapn aapn3 = (aapn) da.f164949b;
            int i = aapn3.f28812a | 2;
            aapn3.f28812a = i;
            aapn3.f28814c = size2;
            aapn3.f28812a = i | 4;
            aapn3.f28815d = 1;
            bxun a = bxzr.m124575a(SystemClock.elapsedRealtime() - elapsedRealtime);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aapn aapn4 = (aapn) da.f164949b;
            a.getClass();
            aapn4.f28816e = a;
            aapn4.f28812a |= 8;
            aapn = (aapn) da.mo74062i();
            aech.close();
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        return aapn;
        throw th;
    }

    /* renamed from: b */
    private final synchronized void m70476b(apid apid) {
        if (this.f84546a.mo47239a(apid, m70478d(apid))) {
            apid a = this.f84551f.mo47285a(apid.mo47282s());
            if (a == null) {
                int i = apid.f84439i;
                if (i == -1 || !this.f84553h.mo47345a(i)) {
                    try {
                        apid.f84439i = this.f84553h.mo47344a();
                    } catch (apjo e) {
                        Log.e("NetworkScheduler", "Ran out of Job ID space, scheduling is incomplete", e);
                        return;
                    }
                }
            } else {
                if (a.f84442l != 1) {
                    if (!apid.f84444n.f63115h) {
                        return;
                    }
                }
                apid.f84439i = a.f84439i;
                apid.mo47261a(true);
                a.mo47261a(true);
                apjy apjy = apht.m70315a().f84402b;
                if (apjy != null) {
                    synchronized (apjy.f84576a) {
                        apjx apjx = (apjx) apjy.f84582g.remove(a);
                        if (apjx != null) {
                            apjx.f84575c.mo47295b(1);
                        }
                    }
                }
            }
            this.f84546a.mo47238a(apid);
            int i2 = 2;
            apid.f84442l = 2;
            this.f84551f.mo47287a(a, apid);
            if (apid.f84446p) {
                i2 = 4;
            }
            if (m70480f(apid)) {
                apib[] apibArr = this.f84552g;
                int length = apibArr.length;
                apibArr[0].mo47257a(apid, a, i2);
            }
            this.f84547b.mo47399a(apid, a);
        }
    }

    /* renamed from: c */
    private final synchronized void m70477c(apid apid) {
        apib[] apibArr = this.f84552g;
        int length = apibArr.length;
        apibArr[0].mo47256a(apid);
        this.f84553h.mo47346b(apid.f84439i);
        this.f84547b.mo47398a(apid);
    }

    /* renamed from: d */
    private final synchronized int m70478d(apid apid) {
        return this.f84551f.mo47288b(apid.mo47273j().mo17015a()).size();
    }

    /* renamed from: e */
    private final synchronized void m70479e(apid apid) {
        this.f84551f.mo47289c(apid.mo47282s());
        apib[] apibArr = this.f84552g;
        int length = apibArr.length;
        apibArr[0].mo47256a(apid);
        this.f84547b.mo47398a(apid);
        this.f84553h.mo47346b(apid.f84439i);
    }

    /* renamed from: f */
    private final boolean m70480f(apid apid) {
        if (cedu.m136333b()) {
            return m70475a(apid, this.f84556k.mo47357a());
        }
        return true;
    }

    /* renamed from: a */
    public final void mo47227a(int i) {
    }

    /* renamed from: a */
    public final void mo47229a(aeab aeab, Uri uri, int i) {
    }

    /* renamed from: b */
    public final aakq mo47233b() {
        return this.f84555j;
    }

    /* renamed from: b */
    public final void mo47234b(aapx aapx) {
    }

    /* renamed from: c */
    public final void mo47236c(aapx aapx) {
    }

    /* renamed from: c */
    public final aapu mo47348c() {
        bxvd da = aapu.f28835d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aapu aapu = (aapu) da.f164949b;
        aapu.f28838b = 3;
        aapu.f28837a |= 1;
        bxun a = bxzr.m124575a(SystemClock.elapsedRealtime() - this.f84558m);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aapu aapu2 = (aapu) da.f164949b;
        a.getClass();
        aapu2.f28839c = a;
        aapu2.f28837a |= 2;
        return (aapu) da.mo74062i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized apid mo47349c(aeco aeco) {
        return this.f84551f.mo47285a(aeco);
    }

    /* renamed from: b */
    public final synchronized void mo47235b(aeco aeco) {
        aech aech = new aech("nts:jobscheduler:cancelAll");
        try {
            List<apid> d = this.f84551f.mo47290d(aeco);
            for (apid apid : d) {
                m70477c(apid);
            }
            m70473a(true);
            if (cedu.m136333b() && !d.isEmpty()) {
                this.f84556k.mo47361a(this.f84551f.mo47286a());
            }
            aech.close();
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        return;
        throw th;
    }

    /* renamed from: a */
    private final synchronized void m70472a(apid apid, apid apid2, int i) {
        if (apid2 != null) {
            this.f84551f.mo47287a(apid, apid2);
            if (m70480f(apid2)) {
                apib[] apibArr = this.f84552g;
                int length = apibArr.length;
                apibArr[0].mo47257a(apid2, apid, i);
            }
            this.f84547b.mo47399a(apid2, apid);
            return;
        }
        m70479e(apid);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0185, code lost:
        return;
     */
    /* renamed from: a */
    private final synchronized void m70473a(boolean z) {
        boolean z2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (z) {
            long j = elapsedRealtime - this.f84557l;
            long h = cedr.f182397a.mo6606a().mo78895h() * 1000;
            if (this.f84557l != -1 && j < h) {
                return;
            }
        }
        this.f84557l = elapsedRealtime;
        Collection<apid> a = this.f84551f.mo47286a();
        List<JobInfo> a2 = this.f84554i.mo33954a();
        if (cedu.m136333b()) {
            bnic a3 = this.f84556k.mo47357a();
            C1225nr nrVar = new C1225nr();
            for (apid apid : a) {
                if (!m70475a(apid, a3)) {
                    nrVar.add(apid);
                }
            }
            if (a.size() - nrVar.f26758b != a2.size()) {
                C1225nr nrVar2 = new C1225nr(a);
                nrVar2.removeAll(nrVar);
                Log.i("NetworkScheduler", String.format(Locale.US, "Tasks count doesn't match jobs count. Tasks: %s. Tasks blocked by reachability: %s. Jobs: %s", nrVar2, nrVar, a2));
            } else {
                for (apid apid2 : a) {
                    Iterator it = a2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (m70474a((JobInfo) it.next(), apid2)) {
                                z2 = true;
                                break;
                            }
                        } else {
                            z2 = false;
                            break;
                        }
                    }
                    boolean contains = nrVar.contains(apid2);
                    if (!z2 && !contains) {
                        String valueOf = String.valueOf(apid2);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                        sb.append("Task was not present in JobScheduler. TaskInfo: ");
                        sb.append(valueOf);
                        Log.e("NetworkScheduler", sb.toString());
                    } else if (z2 && contains) {
                        String valueOf2 = String.valueOf(apid2);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 64);
                        sb2.append("Unreachable task should be removes from JobScheduler. TaskInfo: ");
                        sb2.append(valueOf2);
                        Log.e("NetworkScheduler", sb2.toString());
                    }
                }
            }
        } else if (a.size() != a2.size()) {
            Log.e("NetworkScheduler", String.format(Locale.US, "Tasks count doesn't match jobs count. tasks: %s jobs: %s", a, a2));
        } else {
            for (apid apid3 : a) {
                for (JobInfo jobInfo : a2) {
                    if (m70474a(jobInfo, apid3)) {
                    }
                }
                String valueOf3 = String.valueOf(apid3);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 48);
                sb3.append("Task was not present in JobScheduler. TaskInfo: ");
                sb3.append(valueOf3);
                Log.e("NetworkScheduler", sb3.toString());
            }
        }
        m70471a(new ArrayList(a), a2);
    }

    /* renamed from: a */
    private static boolean m70474a(JobInfo jobInfo, apid apid) {
        PersistableBundle extras = jobInfo.getExtras();
        return jobInfo.getId() == apid.f84439i && Objects.equals(extras.getString("_nts.tag"), apid.mo47266e()) && apid.f84431a.f28806b.equals(extras.getString("_nts.pkg")) && apid.mo47269g().equals(extras.getString("_nts.cls")) && ((int) apid.f84431a.f28809e) == extras.getInt("_nts.usr", -1);
    }

    /* renamed from: a */
    private static boolean m70475a(apid apid, Set set) {
        if (cedu.m136333b()) {
            Set set2 = apid.f84444n.f63118k;
            if (!set2.isEmpty()) {
                return Collections.disjoint(set2, set);
            }
        }
        return true;
    }

    /* renamed from: a */
    public final synchronized void mo47226a() {
        if (!this.f84550e) {
            this.f84558m = SystemClock.elapsedRealtime();
            aech aech = new aech("nts:jobscheduler:init");
            try {
                aapn a = m70471a(this.f84547b.mo47402c(), this.f84554i.mo33954a());
                aape e = this.f84547b.mo47404e();
                List a2 = apka.m70507a(this.f84551f.mo47286a());
                bxun a3 = bxzr.m124575a(SystemClock.elapsedRealtime() - this.f84558m);
                apia apia = this.f84548c;
                aapu c = mo47348c();
                bxvd da = aapk.f28782g.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                aapk aapk = (aapk) da.f164949b;
                e.getClass();
                aapk.f28789f = e;
                int i = aapk.f28784a | 8;
                aapk.f28784a = i;
                a3.getClass();
                aapk.f28785b = a3;
                int i2 = i | 1;
                aapk.f28784a = i2;
                a.getClass();
                aapk.f28787d = a;
                aapk.f28784a = i2 | 4;
                da.mo73945H(a2);
                apia.mo47243a(c, (aapk) da.mo74062i());
                aech.close();
                this.f84550e = true;
                return;
            } catch (aplo e2) {
                throw e2.f84705a;
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo47228a(aapx aapx) {
        if (cedu.m136333b() && aapx == aapx.REACHABILITY_CHANGED) {
            m70473a(false);
        }
    }

    /* renamed from: a */
    public final synchronized void mo47230a(aeco aeco) {
        aech aech = new aech("nts:jobscheduler:cancel");
        try {
            apid c = this.f84551f.mo47289c(aeco);
            if (c != null) {
                m70477c(c);
                m70473a(true);
                if (cedu.m136333b()) {
                    this.f84556k.mo47361a(this.f84551f.mo47286a());
                }
            }
            aech.close();
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        return;
        throw th;
    }

    /* renamed from: a */
    public final synchronized void mo47231a(apid apid) {
        String valueOf = String.valueOf(apid.mo47266e());
        aech aech = new aech(valueOf.length() == 0 ? new String("nts:jobscheduler:schedule:") : "nts:jobscheduler:schedule:".concat(valueOf));
        try {
            m70476b(apid);
            if (cedu.m136333b()) {
                this.f84556k.mo47361a(this.f84551f.mo47286a());
            }
            aech.close();
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        return;
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo47347a(apid apid, int i) {
        if (!apid.f84446p) {
            if (i == 1) {
                if (apid.mo47276m()) {
                    m70472a(apid, aphw.m70333c(apid), 3);
                    this.f84548c.mo47246a(apid, i);
                    m70473a(true);
                }
            }
            if (apid.mo47277n()) {
                m70472a(apid, aphw.m70332b(apid), 4);
            } else {
                m70479e(apid);
                if (cedu.m136333b()) {
                    this.f84556k.mo47361a(this.f84551f.mo47286a());
                }
            }
            this.f84548c.mo47246a(apid, i);
            m70473a(true);
        }
    }

    /* renamed from: a */
    public final synchronized void mo47232a(PrintWriter printWriter, String[] strArr) {
        printWriter.println();
        printWriter.println("Global GmsTaskScheduler stats:");
        this.f84556k.mo47360a(printWriter);
        aphw.m70331a(printWriter, strArr, this.f84551f.mo47286a(), this.f84548c);
    }
}
