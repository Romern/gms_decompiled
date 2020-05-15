package p000;

import com.android.volley.VolleyError;
import java.util.List;

/* renamed from: vbx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vbx implements Runnable {

    /* renamed from: a */
    final /* synthetic */ uih f48980a;

    /* renamed from: b */
    final /* synthetic */ long f48981b;

    /* renamed from: c */
    final /* synthetic */ vks f48982c;

    /* renamed from: d */
    final /* synthetic */ vby f48983d;

    public vbx(vby vby, uih uih, long j, vks vks) {
        this.f48983d = vby;
        this.f48980a = uih;
        this.f48981b = j;
        this.f48982c = vks;
    }

    public final void run() {
        uih uih = this.f48980a;
        vby vby = this.f48983d;
        uhn uhn = vby.f48986c;
        vpu vpu = vby.f48985b;
        vbt vbt = vpu.f49779z;
        vcz vcz = vpu.f49777x;
        sqv sqv = vpu.f49747F;
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.f48981b;
        vks vks = this.f48982c;
        vox.f49690a.mo25369a("Refreshing old unsubscribed Entries For Account: %s", uih);
        vcy c = vcz.mo28312c();
        c.mo28308i();
        c.mo28300c(1, 65);
        c.mo28284a(uih.f47682a);
        List<ujx> a = uhn.mo27397a(uih, currentTimeMillis - j, currentTimeMillis + j).mo27502a();
        for (ujx ujx : a) {
            try {
                vbt.mo28207a(uey.m38255a(uih), ujx.mo27616i(), vks);
            } catch (VolleyError | gid e) {
            }
        }
        c.mo28297b(a.size(), j);
        c.mo28307h();
        c.mo28274a();
    }
}
