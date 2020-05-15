package p000;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: uaj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uaj {

    /* renamed from: a */
    public static final sbw f47016a = new sbw("ActionQueue", "");

    /* renamed from: g */
    private static final String f47017g = new JSONObject().toString();

    /* renamed from: b */
    public final uhn f47018b;

    /* renamed from: c */
    public final vpu f47019c;

    /* renamed from: d */
    public final ufe f47020d;

    /* renamed from: e */
    public final long f47021e = ((Long) twy.f46895v.mo58455c()).longValue();

    /* renamed from: f */
    public final veg f47022f;

    /* renamed from: h */
    private final Context f47023h;

    /* renamed from: i */
    private final uhj f47024i;

    /* renamed from: j */
    private final uav f47025j;

    /* renamed from: k */
    private final uat f47026k;

    /* renamed from: l */
    private final vpp f47027l;

    /* renamed from: m */
    private final uqe f47028m;

    /* renamed from: n */
    private final vcz f47029n;

    /* renamed from: o */
    private final sqv f47030o;

    /* renamed from: p */
    private final vpn f47031p = new vpn(new uah(this), this.f47021e, snp.m35704b(10), "PendingCleanupActionThread");

    /* renamed from: q */
    private final vfd f47032q;

    /* renamed from: r */
    private ubd f47033r;

    public uaj(Context context, vpu vpu, uhn uhn, uhj uhj, veg veg, uav uav, uqe uqe, ufe ufe, sqv sqv, vcz vcz, vfd vfd) {
        this.f47023h = context;
        sdo.m34959a(uhn);
        this.f47018b = uhn;
        sdo.m34959a(uhj);
        this.f47024i = uhj;
        sdo.m34959a(veg);
        this.f47022f = veg;
        sdo.m34959a(uav);
        this.f47025j = uav;
        this.f47026k = new uat();
        this.f47019c = vpu;
        this.f47027l = new uak();
        this.f47020d = ufe;
        this.f47030o = sqv;
        sdo.m34959a(uqe);
        this.f47028m = uqe;
        sdo.m34959a(vcz);
        this.f47029n = vcz;
        sdo.m34959a(vfd);
        this.f47032q = vfd;
    }

    /* renamed from: a */
    public final synchronized int mo26998a(txp txp) {
        return mo26999a(txp, null);
    }

    /* renamed from: b */
    public final void mo27001b() {
        mo27000a().mo27045c();
        mo27003d();
    }

    /* renamed from: c */
    public final synchronized void mo27002c() {
        boolean z = true;
        sdo.m34970a(!this.f47018b.mo27382b());
        if (this.f47033r != null) {
            z = false;
        }
        sdo.m34970a(z);
        this.f47033r = ubd.m37863a(this.f47018b, this.f47022f, this.f47023h, this.f47026k, this.f47019c, this.f47025j, this.f47027l, this.f47020d, this.f47028m, this.f47029n, this.f47030o, this.f47032q);
        mo27003d();
    }

    /* renamed from: d */
    public final void mo27003d() {
        this.f47031p.mo28726a();
    }

    /* renamed from: e */
    public final synchronized boolean mo27004e() {
        ubd ubd;
        ubd = this.f47033r;
        return ubd != null && ubd.mo27043b();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final synchronized int mo26999a(txp txp, vcy vcy) {
        uhj uhj;
        boolean z;
        txp txp2 = txp;
        synchronized (this) {
            this.f47024i.mo27482h();
            int i = 2;
            try {
                uih a = txp.mo26877a();
                ubd a2 = mo27000a();
                uln uln = new uln(this.f47024i, -1, a.f47683b, f47017g, txp.mo26913s(), 0, System.currentTimeMillis(), false, null);
                uln.mo27725t();
                uln uln2 = uln;
                long j = uln2.f48366m;
                try {
                    txw a3 = txp2.mo26875a(new txu(this.f47018b, j, vcy));
                    uln2.f48135d = txp.mo26913s();
                    uln2.mo27693a(a3.mo26926a().toString());
                    uln2.mo27725t();
                    if (j >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sdo.m34974b(z);
                    a2.f47089b.execute(new uay(a2, j));
                    this.f47024i.mo27483i();
                    this.f47024i.mo27484j();
                    return 0;
                } catch (tzx e) {
                    this.f47024i.mo27484j();
                    uau a4 = txp2.mo26876a(this.f47018b);
                    if (a4 != null) {
                        this.f47025j.mo27024a(2, a4);
                    }
                    return 0;
                } catch (Throwable th) {
                    this.f47024i.mo27484j();
                    throw th;
                }
            } catch (JSONException e2) {
                f47016a.mo25378c("ActionQueue", "Failed to commit action", e2);
                uhj = this.f47024i;
                uhj.mo27484j();
                return 1;
            } catch (tzw e3) {
                f47016a.mo25378c("ActionQueue", "Cannot apply action", e3);
                if (!(e3 instanceof uaa)) {
                    i = !(e3 instanceof uac) ? !(e3 instanceof tzz) ? !(e3 instanceof tzy) ? e3 instanceof uad ? 6 : 1 : 5 : 4 : 3;
                }
                this.f47024i.mo27484j();
                return i;
            } catch (Exception e4) {
                f47016a.mo25378c("ActionQueue", "Unexpected exception when applying action", e4);
                uhj = this.f47024i;
                uhj.mo27484j();
                return 1;
            }
        }
    }

    /* renamed from: a */
    public final synchronized ubd mo27000a() {
        ubd ubd;
        ubd = this.f47033r;
        sdo.m34966a(ubd, "PendingActionManager is not initialized");
        return ubd;
    }
}
