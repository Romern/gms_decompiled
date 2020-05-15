package p000;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.icing.mdh.service.MobileDataHubListenerChimeraService;
import com.google.android.gms.mdh.LatestFootprintFilter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: ackk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ackk extends afne implements aaai {

    /* renamed from: a */
    private static final int f60028a = byip.f166588d.mo73900a();

    /* renamed from: b */
    private final MobileDataHubListenerChimeraService f60029b;

    /* renamed from: c */
    private final String f60030c;

    /* renamed from: d */
    private final aaag f60031d;

    /* renamed from: e */
    private final WeakHashMap f60032e = new WeakHashMap();

    public ackk(MobileDataHubListenerChimeraService mobileDataHubListenerChimeraService, String str, aaag aaag) {
        this.f60029b = mobileDataHubListenerChimeraService;
        this.f60030c = str;
        this.f60031d = aaag;
    }

    /* renamed from: a */
    private final afmu m49322a(afmr afmr) {
        WeakReference weakReference = (WeakReference) this.f60032e.get(afmr.f12819a);
        if (weakReference != null) {
            return (afmu) weakReference.get();
        }
        return null;
    }

    /* renamed from: b */
    public final void mo32824b(rnt rnt, Account account, int i, int i2, afnj afnj) {
        if (acaw.m48788e()) {
            try {
                String str = this.f60030c;
                acgo acgo = (acgo) this.f60029b.f79069a.mo32784h().f59861a.mo6445a();
                achn.m49125a(acgo, 1);
                achn.m49125a(account, 2);
                achn.m49125a(afnj, 5);
                achn.m49125a(rnt, 6);
                m49323a(new acjn(164, "UnregisterTimeSeriesFootprintsListenerAsyncOperationDelegate", str, new achm(acgo, account, i, i2, afnj, rnt), this.f60029b.f79069a));
            } catch (RuntimeException e) {
                acbq.m48833a().mo32707a("Unexpected RuntimeException in MDH.", e);
                rnt.mo11797a(new Status(8, "Unexpected RuntimeException in MDH."));
            }
        } else {
            rnt.mo11797a(new Status(8, "Time Series Footprints API is disabled."));
        }
    }

    /* renamed from: a */
    private final void m49323a(aaab aaab) {
        this.f60031d.mo16658a(aaab);
    }

    /* renamed from: a */
    public final void mo32819a(rnt rnt, Account account, int i, int i2, afmu afmu) {
        try {
            m49323a(new acjn(164, "UnregisterLatestFootprintListenerAsyncOperationDelegate", this.f60030c, this.f60029b.f79069a.mo32782f().mo32742a(account, i, i2, afmu, rnt), this.f60029b.f79069a));
        } catch (RuntimeException e) {
            acbq.m48833a().mo32707a("Unexpected RuntimeException in MDH.", e);
            rnt.mo11797a(new Status(8, "Unexpected RuntimeException in MDH."));
        }
    }

    /* renamed from: a */
    public final void mo32820a(rnt rnt, Account account, int i, int i2, afnj afnj) {
        rnt rnt2 = rnt;
        if (acaw.m48788e()) {
            try {
                String str = this.f60030c;
                achj g = this.f60029b.f79069a.mo32783g();
                String str2 = this.f60030c;
                acgo acgo = (acgo) g.f59853a.mo6445a();
                achj.m49116a(acgo, 1);
                achj.m49116a(str2, 2);
                achj.m49116a(account, 3);
                achj.m49116a(afnj, 6);
                achj.m49116a(rnt2, 7);
                m49323a(new acjn(164, "RegisterTimeSeriesFootprintsListenerAsyncOperationDelegate", str, new achi(acgo, str2, account, i, i2, afnj, rnt), this.f60029b.f79069a));
            } catch (RuntimeException e) {
                acbq.m48833a().mo32707a("Unexpected RuntimeException in MDH.", e);
                rnt2.mo11797a(new Status(8, "Unexpected RuntimeException in MDH."));
            }
        } else {
            rnt2.mo11797a(new Status(8, "Time Series Footprints API is disabled."));
        }
    }

    /* renamed from: a */
    public final void mo32821a(rnt rnt, Account account, int i, int i2, LatestFootprintFilter latestFootprintFilter, afmu afmu) {
        rnt rnt2 = rnt;
        try {
            String str = this.f60030c;
            achh e = this.f60029b.f79069a.mo32781e();
            String str2 = this.f60030c;
            acgi acgi = (acgi) e.f59848a.mo6445a();
            achh.m49112a(acgi, 1);
            achh.m49112a(str2, 2);
            achh.m49112a(account, 3);
            achh.m49112a(latestFootprintFilter, 6);
            achh.m49112a(afmu, 7);
            achh.m49112a(rnt2, 8);
            m49323a(new acjn(164, "RegisterLatestFootprintListenerAsyncOperationDelegate", str, new achg(acgi, str2, account, i, i2, latestFootprintFilter, afmu, rnt), this.f60029b.f79069a));
        } catch (RuntimeException e2) {
            acbq.m48833a().mo32707a("Unexpected RuntimeException in MDH.", e2);
            rnt2.mo11797a(new Status(8, "Unexpected RuntimeException in MDH."));
        }
    }

    /* renamed from: a */
    public final void mo32822a(rnt rnt, Account account, int i, afmr afmr) {
        afmu afmu;
        rnt rnt2 = rnt;
        afmr afmr2 = afmr;
        try {
            synchronized (this.f60032e) {
                afmu a = m49322a(afmr2);
                if (a == null) {
                    byte[] bytes = String.valueOf(i).getBytes(bmwy.f131158c);
                    cayo cayo = (cayo) this.f60029b.f79069a.mo32786j().f59739a.mo6445a();
                    acga.m49046a(cayo, 1);
                    acga.m49046a(afmr2, 2);
                    afmu = new acfz(cayo, afmr2, i, (byte[]) acga.m49046a(bytes, 4));
                    this.f60032e.put(afmr2.f12819a, new WeakReference(afmu));
                } else {
                    afmu = a;
                }
            }
            String str = this.f60030c;
            achf i2 = this.f60029b.f79069a.mo32785i();
            String str2 = this.f60030c;
            acgi acgi = (acgi) i2.f59842a.mo6445a();
            achf.m49108a(acgi, 1);
            achf.m49108a(str2, 2);
            achf.m49108a(account, 3);
            achf.m49108a(afmu, 5);
            achf.m49108a(rnt2, 6);
            m49323a(new acjn(164, "RegisterFootprintsRecordingSettingsListenerAsyncOperationDelegate", str, new ache(acgi, str2, account, i, afmu, rnt), this.f60029b.f79069a));
        } catch (RuntimeException e) {
            acbq.m48833a().mo32707a("Unexpected RuntimeException in MDH.", e);
            rnt2.mo11797a(new Status(8, "Unexpected RuntimeException in MDH."));
        }
    }

    /* renamed from: a */
    public final void mo32823a(rnt rnt, Account account, afmr afmr) {
        afmu a;
        synchronized (this.f60032e) {
            a = m49322a(afmr);
        }
        if (a != null) {
            try {
                m49323a(new acjn(164, "UnregisterLatestFootprintListenerAsyncOperationDelegate", this.f60030c, this.f60029b.f79069a.mo32782f().mo32742a(account, 553, f60028a, a, rnt), this.f60029b.f79069a));
            } catch (RuntimeException e) {
                acbq.m48833a().mo32707a("Unexpected RuntimeException in MDH.", e);
                rnt.mo11797a(new Status(8, "Unexpected RuntimeException in MDH."));
            }
        } else {
            rnt.mo11797a(new Status(0));
        }
    }
}
