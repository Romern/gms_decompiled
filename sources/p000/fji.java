package p000;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: fji */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fji implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Map f16713a;

    /* renamed from: b */
    final /* synthetic */ String f16714b;

    /* renamed from: c */
    final /* synthetic */ long f16715c;

    /* renamed from: d */
    final /* synthetic */ boolean f16716d;

    /* renamed from: e */
    final /* synthetic */ boolean f16717e;

    /* renamed from: f */
    final /* synthetic */ String f16718f;

    /* renamed from: g */
    final /* synthetic */ fjk f16719g;

    public fji(fjk fjk, Map map, String str, long j, boolean z, boolean z2, String str2) {
        this.f16719g = fjk;
        this.f16713a = map;
        this.f16714b = str;
        this.f16715c = j;
        this.f16716d = z;
        this.f16717e = z2;
        this.f16718f = str2;
    }

    public final void run() {
        double d;
        Map map = this.f16713a;
        fip j = this.f16719g.mo10945j();
        sdo.m34973b("getClientId can not be called from the main thread");
        String b = j.f16658a.mo10963g().mo11000b();
        if (b != null && TextUtils.isEmpty((CharSequence) map.get("cid"))) {
            map.put("cid", b);
        }
        String str = (String) this.f16713a.get("sf");
        if (str != null) {
            try {
                d = Double.parseDouble(str);
            } catch (NumberFormatException e) {
                d = 100.0d;
            }
            if (fog.m12077a(d, (String) this.f16713a.get("cid"))) {
                this.f16719g.mo10929b("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(d));
                return;
            }
        }
        this.f16719g.f16779d.mo10962f();
        this.f16713a.remove("ate");
        this.f16713a.remove("adid");
        fjl b2 = this.f16719g.mo10951p().mo10988b();
        fog.m12075a(this.f16713a, "an", b2.f16727a);
        fog.m12075a(this.f16713a, "av", b2.f16728b);
        fog.m12075a(this.f16713a, "aid", b2.f16729c);
        fog.m12075a(this.f16713a, "aiid", b2.f16730d);
        this.f16713a.put("v", "1");
        this.f16713a.put("_v", fkk.f16782b);
        fog.m12075a(this.f16713a, "ul", this.f16719g.mo10952q().mo11012b().f16744a);
        fog.m12075a(this.f16713a, "sr", this.f16719g.mo10952q().mo11013c());
        if (!this.f16714b.equals("transaction") && !this.f16714b.equals("item")) {
            fnp fnp = this.f16719g.f16722a;
            synchronized (fnp.f16971e) {
                long a = fnp.f16973g.mo20505a();
                double d2 = fnp.f16969c;
                int i = fnp.f16968b;
                if (d2 < 60.0d) {
                    double d3 = (double) (a - fnp.f16970d);
                    long j2 = fnp.f16967a;
                    Double.isNaN(d3);
                    double d4 = d3 / 2000.0d;
                    if (d4 > 0.0d) {
                        d2 = Math.min(60.0d, d2 + d4);
                        fnp.f16969c = d2;
                    }
                }
                fnp.f16970d = a;
                if (d2 >= 1.0d) {
                    fnp.f16969c = d2 - 4.0d;
                } else {
                    String str2 = fnp.f16972f;
                    StringBuilder sb = new StringBuilder(str2.length() + 34);
                    sb.append("Excessive ");
                    sb.append(str2);
                    sb.append(" detected; call ignored.");
                    fnq.m12019b(sb.toString());
                    this.f16719g.mo10941g().mo11028a(this.f16713a, "Too many hits sent too quickly, rate limiting invoked");
                    return;
                }
            }
        }
        long b3 = fog.m12078b((String) this.f16713a.get("ht"));
        if (b3 == 0) {
            b3 = this.f16715c;
        }
        long j3 = b3;
        if (!this.f16716d) {
            HashMap hashMap = new HashMap();
            fog.m12076a(hashMap, "uid", this.f16713a);
            fog.m12076a(hashMap, "an", this.f16713a);
            fog.m12076a(hashMap, "aid", this.f16713a);
            fog.m12076a(hashMap, "av", this.f16713a);
            fog.m12076a(hashMap, "aiid", this.f16713a);
            this.f16713a.put("_s", String.valueOf(this.f16719g.mo10946k().mo10919a(new fko((String) this.f16713a.get("cid"), this.f16718f, !TextUtils.isEmpty((CharSequence) this.f16713a.get("adid")), hashMap))));
            this.f16719g.mo10946k().mo10921a(new fnl(this.f16719g, this.f16713a, j3, this.f16717e));
            return;
        }
        this.f16719g.mo10941g().mo10931c("Dry run enabled. Would have sent hit", new fnl(this.f16719g, this.f16713a, j3, this.f16717e));
    }
}
