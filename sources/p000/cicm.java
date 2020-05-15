package p000;

import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: cicm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cicm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ chuc f189774a;

    /* renamed from: b */
    final /* synthetic */ chua f189775b;

    public cicm(chua chua, chuc chuc) {
        this.f189775b = chua;
        this.f189774a = chuc;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.RuntimeException]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    public final void run() {
        cicz cicz;
        chuv chuv;
        chuv chuv2;
        String str;
        Object obj;
        chuc chuc = this.f189774a;
        List list = chuc.f189177a;
        this.f189775b.f189173c.f189807E.mo85553a(1, "Resolved address: {0}, config={1}", list, chuc.f189178b);
        cicv cicv = this.f189775b.f189173c;
        int i = cicv.f189814L;
        if (i != 2) {
            cicv.f189807E.mo85553a(2, "Address resolved: {0}", list);
            this.f189775b.f189173c.f189814L = 2;
        }
        cicv cicv2 = this.f189775b.f189173c;
        cicv2.f189815M = null;
        chty chty = this.f189774a.f189179c;
        if (chty == null || (obj = chty.f189170b) == null) {
            cicz = null;
        } else {
            cicz = (cicz) obj;
        }
        if (chty != null) {
            chuv = chty.f189169a;
        } else {
            chuv = null;
        }
        if (cicv2.f189811I) {
            if (cicz == null) {
                if (chuv == null) {
                    cicz = cicv.f189802f;
                } else if (!cicv2.f189810H) {
                    cicv2.f189807E.mo85552a(2, "Fallback to error due to invalid first service config without default config");
                    this.f189775b.mo85669a(chty.f189169a);
                    return;
                } else {
                    cicz = cicv2.f189809G;
                }
            }
            if (!cicz.equals(this.f189775b.f189173c.f189809G)) {
                chqq chqq = this.f189775b.f189173c.f189807E;
                Object[] objArr = new Object[1];
                if (cicz != cicv.f189802f) {
                    str = "";
                } else {
                    str = " to empty";
                }
                objArr[0] = str;
                chqq.mo85553a(2, "Service config changed{0}", objArr);
                this.f189775b.f189173c.f189809G = cicz;
            }
            try {
                this.f189775b.f189173c.mo85963n();
            } catch (RuntimeException e) {
                Logger logger = cicv.f189797a;
                Level level = Level.WARNING;
                String valueOf = String.valueOf(this.f189775b.f189173c.f189832g);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 51);
                sb.append("[");
                sb.append(valueOf);
                sb.append("] Unexpected exception from parsing service config");
                logger.logp(level, "io.grpc.internal.ManagedChannelImpl$NameResolverListener$1NamesResolved", "run", sb.toString(), (Throwable) e);
            }
        } else {
            if (cicz != null) {
                cicv2.f189807E.mo85552a(2, "Service config from name resolver discarded by channel settings");
            }
            cicz = cicv.f189802f;
        }
        chqh chqh = this.f189774a.f189178b;
        chua chua = this.f189775b;
        if (chua.f189171a == chua.f189173c.f189843r) {
            Map map = cicz.f189873d;
            if (map != null) {
                chqf b = chqh.mo85535b();
                b.mo85532a(chsu.f189112b, map);
                chqh = b.mo85531a();
            }
            chwx chwx = this.f189775b.f189171a.f189770a;
            chsq a = chsr.m149493a();
            a.f189105a = list;
            a.f189106b = chqh;
            a.f189107c = cicz.f189872c;
            chsr a2 = a.mo85603a();
            List list2 = a2.f189108a;
            chqh chqh2 = a2.f189109b;
            if (chqh2.mo85534a(chsu.f189111a) == null) {
                cies cies = (cies) a2.f189110c;
                if (cies == null) {
                    try {
                        chxc chxc = chwx.f189433d;
                        String str2 = chxc.f189436b;
                        chsw a3 = chxc.f189435a.mo85622a(str2);
                        if (a3 != null) {
                            cies = new cies(a3, null, null);
                        } else {
                            StringBuilder sb2 = new StringBuilder(str2.length() + 68);
                            sb2.append("Trying to load '");
                            sb2.append(str2);
                            sb2.append("' because ");
                            sb2.append("using default policy");
                            sb2.append(", but it's unavailable");
                            throw new chxb(sb2.toString());
                        }
                    } catch (chxb e2) {
                        chwx.f189430a.mo85599a(chrg.TRANSIENT_FAILURE, new chwz(chuv.f189228o.mo85687a(e2.getMessage())));
                        chwx.f189431b.mo85610a();
                        chwx.f189432c = null;
                        chwx.f189431b = new chxa();
                        chuv2 = chuv.f189215b;
                    }
                }
                if (chwx.f189432c == null || !cies.f189978a.mo85616c().equals(chwx.f189432c.mo85616c())) {
                    chwx.f189430a.mo85599a(chrg.CONNECTING, new chwy());
                    chwx.f189431b.mo85610a();
                    chwx.f189432c = cies.f189978a;
                    chsu chsu = chwx.f189431b;
                    chwx.f189431b = chwx.f189432c.mo85597a(chwx.f189430a);
                    chwx.f189430a.mo85598a().mo85553a(2, "Load balancer changed from {0} to {1}", chsu.getClass().getSimpleName(), chwx.f189431b.getClass().getSimpleName());
                }
                Object obj2 = cies.f189980c;
                if (obj2 != null) {
                    chwx.f189430a.mo85598a().mo85553a(1, "Load-balancing config: {0}", cies.f189980c);
                    chqf b2 = chqh2.mo85535b();
                    b2.mo85532a(chsu.f189111a, cies.f189979b);
                    chqh2 = b2.mo85531a();
                }
                chsu chsu2 = chwx.f189431b;
                if (a2.f189108a.isEmpty()) {
                    chuv chuv3 = chuv.f189229p;
                    String valueOf2 = String.valueOf(list2);
                    String valueOf3 = String.valueOf(chqh2);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 55 + String.valueOf(valueOf3).length());
                    sb3.append("NameResolver returned no usable address. addrs=");
                    sb3.append(valueOf2);
                    sb3.append(", attrs=");
                    sb3.append(valueOf3);
                    chuv2 = chuv3.mo85687a(sb3.toString());
                } else {
                    chsq a4 = chsr.m149493a();
                    a4.f189105a = a2.f189108a;
                    a4.f189106b = chqh2;
                    a4.f189107c = obj2;
                    chsu2.mo85611a(a4.mo85603a());
                    chuv2 = chuv.f189215b;
                }
                if (chuv2.mo85689a()) {
                    return;
                }
                if (list.isEmpty() && i == 2) {
                    this.f189775b.mo85667a();
                    return;
                }
                chua chua2 = this.f189775b;
                String valueOf4 = String.valueOf(chua2.f189172b);
                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 9);
                sb4.append(valueOf4);
                sb4.append(" was used");
                chua2.mo85670b(chuv2.mo85690b(sb4.toString()));
                return;
            }
            String valueOf5 = String.valueOf(chqh2.mo85534a(chsu.f189111a));
            StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf5).length() + 53);
            sb5.append("Unexpected ATTR_LOAD_BALANCING_CONFIG from upstream: ");
            sb5.append(valueOf5);
            throw new IllegalArgumentException(sb5.toString());
        }
    }
}
