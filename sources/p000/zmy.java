package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.request.DailyTotalRequest;
import com.google.android.gms.fitness.result.DailyTotalResult;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: zmy */
final /* synthetic */ class zmy implements Runnable {

    /* renamed from: a */
    private final zne f55513a;

    /* renamed from: b */
    private final long f55514b;

    /* renamed from: c */
    private final DailyTotalRequest f55515c;

    /* renamed from: d */
    private final ygb f55516d;

    /* renamed from: e */
    private final caah f55517e;

    /* renamed from: f */
    private final bngx f55518f;

    /* renamed from: g */
    private final String f55519g;

    /* renamed from: h */
    private final zaw f55520h;

    public zmy(zne zne, long j, DailyTotalRequest dailyTotalRequest, ygb ygb, caah caah, bngx bngx, zaw zaw, String str) {
        this.f55513a = zne;
        this.f55514b = j;
        this.f55515c = dailyTotalRequest;
        this.f55516d = ygb;
        this.f55517e = caah;
        this.f55518f = bngx;
        this.f55520h = zaw;
        this.f55519g = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a5 A[Catch:{ IOException -> 0x00c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00b4 A[Catch:{ IOException -> 0x00c0 }] */
    public final void run() {
        zaw zaw;
        cadp cadp;
        zne zne = this.f55513a;
        long j = this.f55514b;
        DailyTotalRequest dailyTotalRequest = this.f55515c;
        ygb ygb = this.f55516d;
        caah caah = this.f55517e;
        bngx bngx = this.f55518f;
        zaw zaw2 = this.f55520h;
        String str = this.f55519g;
        try {
            long nanos = TimeUnit.MILLISECONDS.toNanos(j);
            long nanos2 = TimeUnit.MILLISECONDS.toNanos(zvp.m46576a(j));
            if (dailyTotalRequest.f32200b) {
                ygb.f53749c = zly.m45722a(bngx.m109356a(zvn.m46574a(zne.f55428a)), yxy.f54800b.f172301b);
            }
            ygc a = ygb.mo30460a();
            yfk yfk = new yfk(zne.f55535e, bngx.m109356a(yfv.m44005a(nanos2, nanos)));
            long millis = TimeUnit.NANOSECONDS.toMillis(nanos2);
            long j2 = millis;
            String str2 = str;
            zaw = zaw2;
            try {
                List a2 = yfk.mo30405a(j2, TimeUnit.NANOSECONDS.toMillis(nanos), TimeUnit.DAYS.toMillis(1), bngx, a, zne.f55536f);
                if (a2.size() == 1) {
                    cadj cadj = (cadj) a2.get(0);
                    if (cadj.f172687f.size() == 1) {
                        cadp = (cadp) cadj.f172687f.get(0);
                        if (cadp == null) {
                            zne.m45784a(zaw, new DailyTotalResult(ywe.m44939a(cadp, str2), Status.f30107a));
                            return;
                        } else {
                            zne.m45784a(zaw, DailyTotalResult.m23712a(Status.f30109c, dailyTotalRequest.f32199a));
                            return;
                        }
                    }
                }
                ((bnsl) zne.f55533d.mo68387b()).mo68424a("Couldn't find aggregated data point for %s.  Found %s", bzzn.m126362a(caah), a2);
                cadp = null;
                if (cadp == null) {
                }
            } catch (IOException e) {
                e = e;
                bnsl bnsl = (bnsl) zne.f55533d.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68405a("Error reading daily totals.");
                zne.m45784a(zaw, DailyTotalResult.m23712a(new Status(5008), dailyTotalRequest.f32199a));
            }
        } catch (IOException e2) {
            e = e2;
            zaw = zaw2;
            bnsl bnsl2 = (bnsl) zne.f55533d.mo68387b();
            bnsl2.mo68437a(e);
            bnsl2.mo68405a("Error reading daily totals.");
            zne.m45784a(zaw, DailyTotalResult.m23712a(new Status(5008), dailyTotalRequest.f32199a));
        }
    }
}
