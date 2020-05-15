package p000;

import android.content.Context;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;

/* renamed from: efh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class efh extends dwm implements eei, dvw {

    /* renamed from: a */
    public final dqs f14823a;

    /* renamed from: b */
    public final efj f14824b = new efj();

    /* renamed from: c */
    private final efv f14825c;

    /* renamed from: d */
    private final efm f14826d;

    /* renamed from: e */
    private final efq f14827e;

    /* renamed from: f */
    private final efg f14828f;

    public efh() {
        efg efg;
        if (!cdhl.f180912a.mo6606a().mo77620a()) {
            this.f14823a = new dqs();
            this.f14825c = new efv();
            this.f14826d = new efm();
            this.f14827e = new efq();
            efg = new efg();
        } else {
            efg = null;
            this.f14823a = null;
            this.f14825c = null;
            this.f14826d = null;
            this.f14827e = null;
        }
        this.f14828f = efg;
    }

    /* renamed from: a */
    public final void mo10068a() {
        new Object[1][0] = 0L;
        mo10070a(this.f14826d, 0, 0, "DownloadSyncOperation", null);
    }

    /* renamed from: a */
    public final void mo9389a(doh doh, bxco bxco) {
    }

    /* renamed from: b */
    public final void mo10071b(long j) {
        new Object[1][0] = Long.valueOf(j);
        mo10070a(this.f14825c, 0, j, "SyncServerInterestRecordsOperation", null);
    }

    /* renamed from: b */
    public final void mo9394b(doh doh, bxco bxco) {
    }

    /* renamed from: c */
    public final void mo10072c(long j) {
        long j2 = j + 86400000;
        Object[] objArr = {Long.valueOf(j), Long.valueOf(j2)};
        mo10070a(this.f14827e, j, j2, "RefreshStateOperation", null);
    }

    /* renamed from: d */
    public final void mo10073d(long j) {
        long p = j + cdgp.f180782a.mo6606a().mo77596p();
        Object[] objArr = {Long.valueOf(j), Long.valueOf(p)};
        mo10070a(this.f14828f, j, p, "DailyCheckinOperation", null);
    }

    /* renamed from: a */
    public final void mo10069a(long j) {
        new Object[1][0] = Long.valueOf(j);
        mo10070a(this.f14824b, 0, j, "SyncOperation", null);
    }

    /* renamed from: a */
    public final void mo9388a(ContextData contextData, ContextManagerClientInfo contextManagerClientInfo) {
        efk efk;
        Object[] objArr = {contextData, contextManagerClientInfo};
        int g = contextData.mo18018g();
        efj efj = this.f14824b;
        doh a = contextManagerClientInfo.mo18066a();
        if (a.mo9338b() || (efk = (efk) efj.f14830a.get(a)) == null || efk.f14831a.get(g) == null) {
            Object[] objArr2 = {contextManagerClientInfo.mo18066a(), Integer.valueOf(g)};
            return;
        }
        efk efk2 = (efk) this.f14824b.f14830a.get(contextManagerClientInfo.mo18066a());
        long j = Long.MAX_VALUE;
        if (efk2 != null) {
            j = ((Long) efk2.f14832b.get(g, Long.MAX_VALUE)).longValue();
        }
        Object[] objArr3 = {contextManagerClientInfo.mo18066a(), Integer.valueOf(g), Long.valueOf(j)};
        mo10069a(j);
    }

    /* renamed from: a */
    public final void mo9390a(doh doh, dwa dwa) {
        this.f14824b.mo10074a(doh, dwa);
    }

    /* renamed from: a */
    public final void mo9391a(doh doh, dwa dwa, dwa dwa2) {
        if (dwa2 != null) {
            this.f14824b.mo10074a(doh, dwa2);
        }
        efj efj = this.f14824b;
        efk efk = (efk) efj.f14830a.get(doh);
        if (efk == null) {
            efk = new efk();
            efj.f14830a.put(doh, efk);
        }
        efk.mo10075a(dwa);
    }

    /* renamed from: a */
    public final void mo10070a(dqm dqm, long j, long j2, String str, String str2) {
        boolean z;
        String str3;
        String str4 = str2;
        boolean z2 = true;
        if (this.f14823a == null) {
            long j3 = j / 1000;
            long max = Math.max(1 + j3, j2 / 1000);
            Context f = dwq.m9662f();
            aebi aebi = new aebi();
            aebi.f63097i = "com.google.android.contextmanager.sync.ContextManagerTaskService";
            aebi.mo34004a(j3, max);
            aebi.mo34023a(0);
            if (str4 != null) {
                StringBuilder sb = new StringBuilder(str.length() + 1 + str2.length());
                sb.append(str);
                sb.append(":");
                sb.append(str4);
                str3 = sb.toString();
            } else {
                str3 = str;
            }
            aebi.f63099k = str3;
            aeat.m51532a(f).mo33984a(aebi.mo33974b());
            return;
        }
        Object[] objArr = {dqm, Long.valueOf(j), Long.valueOf(j2)};
        dqs dqs = this.f14823a;
        sdo.m34959a(dqm);
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        if (j2 < j) {
            z2 = false;
        }
        sdo.m34974b(z2);
        if (dqs.f13833b.mo9437a()) {
            dqs.f13833b.mo9435a(new dqp(dqs, dqm, j, j2), dqy.m9123a("TaskConsolidator#ScheduleOperation"));
            return;
        }
        throw new IllegalStateException("Background thread is not running.  Call start()");
    }
}
