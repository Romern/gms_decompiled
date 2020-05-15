package com.google.android.gms.instantapps.routing;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DomainFilterUpdateChimeraService extends aeah {

    /* renamed from: g */
    private static final adfs f79217g = new adfs("DomainFilterUpdateChimeraService");

    /* renamed from: a */
    adje f79218a;

    /* renamed from: b */
    adkr f79219b;

    /* renamed from: c */
    adko f79220c;

    /* renamed from: d */
    adkg f79221d;

    /* renamed from: e */
    adfd f79222e;

    /* renamed from: h */
    private Executor f79223h;

    /* renamed from: a */
    private static final int m66760a(int i, String str, adfb adfb, String str2) {
        if (i == 1) {
            adfb.mo33409a(str2.length() == 0 ? new String("DomainFilterUpdateService.OK") : "DomainFilterUpdateService.OK".concat(str2));
            return 0;
        } else if (i != 2) {
            if (i == 3) {
                adfb.mo33409a(str2.length() == 0 ? new String("DomainFilterUpdateService.NonRetriable") : "DomainFilterUpdateService.NonRetriable".concat(str2));
                return 0;
            } else if (i != 4) {
                f79217g.mo33426b("Unexpected DomainFilterUpdateStatus: %d", Integer.valueOf(i));
                adfb.mo33409a(str2.length() == 0 ? new String("DomainFilterUpdateService.Failure") : "DomainFilterUpdateService.Failure".concat(str2));
                return 2;
            } else {
                adfb.mo33409a(str2.length() == 0 ? new String("DomainFilterUpdateService.Throttled") : "DomainFilterUpdateService.Throttled".concat(str2));
                return 0;
            }
        } else if (ceow.f183163a.mo6606a().mo79501b() || (ceow.f183163a.mo6606a().mo79502c() && "instantapps.DomainFilterUpdateService.frequentChargingUnmetered".equals(str))) {
            f79217g.mo33429c("Will not retry", new Object[0]);
            adfb.mo33409a(str2.length() == 0 ? new String("DomainFilterUpdateService.WillNotReschedule") : "DomainFilterUpdateService.WillNotReschedule".concat(str2));
            return 2;
        } else {
            f79217g.mo33429c("Retry later", new Object[0]);
            adfb.mo33409a(str2.length() == 0 ? new String("DomainFilterUpdateService.Reschedule") : "DomainFilterUpdateService.Reschedule".concat(str2));
            return 1;
        }
    }

    /* renamed from: b */
    private final int m66764b(camh camh) {
        if (cepl.f183185a.mo6606a().mo79539j()) {
            return this.f79218a.mo33564b(camh);
        }
        return this.f79218a.mo33558a(camh);
    }

    /* renamed from: c */
    public static void m66766c() {
        aebl aebl = new aebl();
        aebl.f63097i = "com.google.android.gms.instantapps.routing.DomainFilterUpdateService";
        aebl.f63099k = "instantapps.DomainFilterUpdateService";
        aebl.f63070a = cepl.m137721b() / 1000;
        aebl.mo34024a(0, 0);
        aebl.mo34023a(0);
        aebl.f63102n = true;
        long b = cepl.m137721b() / 1000;
        if (cdny.m134347l()) {
            aebl.mo34009a(aebh.m51568a(b));
        } else {
            aebl.f63070a = b;
        }
        aeat.m51532a(rpr.m34216b()).mo33984a(aebl.mo33974b());
        aebl aebl2 = new aebl();
        aebl2.f63097i = "com.google.android.gms.instantapps.routing.DomainFilterUpdateService";
        aebl2.f63099k = "instantapps.DomainFilterUpdateService.frequentChargingUnmetered";
        aebl2.mo34023a(1);
        aebl2.mo34024a(1, 1);
        aebl2.f63102n = true;
        long m = cepl.f183185a.mo6606a().mo79542m() / 1000;
        if (cdny.m134347l()) {
            aebl2.mo34009a(aebh.m51568a(m));
        } else {
            aebl2.f63070a = m;
        }
        aeat.m51532a(rpr.m34216b()).mo33984a(aebl2.mo33974b());
        if (cepl.f183185a.mo6606a().mo79546q()) {
            aeat a = aeat.m51532a(rpr.m34216b());
            aebl aebl3 = new aebl();
            aebl3.f63097i = "com.google.android.gms.instantapps.routing.DomainFilterUpdateService";
            aebl3.f63099k = "instantapps.DomainFilterUpdateService.fullSync";
            aebl3.f63070a = cepl.f183185a.mo6606a().mo79541l();
            aebl3.mo34024a(0, 0);
            aebl3.mo34023a(0);
            aebl3.f63102n = true;
            a.mo33984a(aebl3.mo33974b());
        }
    }

    /* renamed from: aZ */
    public final void mo7135aZ() {
        m66766c();
    }

    public final void onCreate() {
        super.onCreate();
        adfv a = adfv.m50332a(getApplicationContext());
        this.f79218a = a.f61582g;
        this.f79219b = a.f61579d;
        this.f79220c = a.f61593r;
        this.f79221d = a.f61594s;
        this.f79223h = a.f61576a;
        this.f79222e = a.f61586k;
        int i = adjz.f61965a;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null || !"com.google.android.gms.instantapps.ACTION_UPDATE_DOMAIN_FILTER".equals(intent.getAction())) {
            return super.onStartCommand(intent, i, i2);
        }
        this.f79223h.execute(new adji(this, intent));
        return 2;
    }

    /* renamed from: b */
    public static void m66765b() {
        aeat a = aeat.m51532a(rpr.m34216b());
        a.mo33986a("instantapps.DomainFilterUpdateService", "com.google.android.gms.instantapps.routing.DomainFilterUpdateService");
        a.mo33986a("instantapps.DomainFilterUpdateService.frequentChargingUnmetered", "com.google.android.gms.instantapps.routing.DomainFilterUpdateService");
        a.mo33986a("instantapps.DomainFilterUpdateService.fullSync", "com.google.android.gms.instantapps.routing.DomainFilterUpdateService");
        m66766c();
    }

    /* renamed from: a */
    public static String m66761a(int i) {
        if (cepi.m137716b()) {
            return "instantapps.DomainFilterUpdateService.oneOff";
        }
        StringBuilder sb = new StringBuilder(55);
        sb.append("instantapps.DomainFilterUpdateService.oneOff");
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: a */
    public static void m66762a(Context context) {
        Intent intent = new Intent("com.google.android.gms.instantapps.ACTION_UPDATE_DOMAIN_FILTER");
        intent.setClassName(context.getPackageName(), "com.google.android.gms.instantapps.routing.DomainFilterUpdateService");
        intent.putExtra("domain_filter_request_type", camh.ONE_OFF_SYNC_AT_BOOT_COMPLETE.mo3214a());
        context.startService(intent);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aebi.a(long, long):void
     arg types: [int, int]
     candidates:
      aebz.a(int, int):void
      aebi.a(long, long):void */
    /* renamed from: a */
    public static void m66763a(camh camh) {
        aeat a = aeat.m51532a(rpr.m34216b());
        aebi aebi = new aebi();
        aebi.f63097i = "com.google.android.gms.instantapps.routing.DomainFilterUpdateService";
        aebi.f63099k = m66761a(camh.mo3214a());
        aebi.mo34024a(0, 0);
        aebi.mo34023a(0);
        aebi.mo34004a(15L, 120L);
        aebi.mo34027b(1);
        a.mo33984a(aebi.mo33974b());
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: adkg.a(android.accounts.Account, int, boolean):void
     arg types: [android.accounts.Account, int, int]
     candidates:
      adkg.a(android.accounts.Account, int, int):void
      adkq.a(android.accounts.Account, int, int):void
      adkg.a(android.accounts.Account, int, boolean):void */
    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        String str;
        char c;
        bmxv bmxv;
        adfb a = this.f79222e.mo33411a();
        int i = 0;
        if (this.f79220c.mo33605a()) {
            String str2 = aecc.f63128a;
            int i2 = 1;
            if (!str2.startsWith("instantapps.ScheduleGetIntentFilters")) {
                adkg adkg = this.f79221d;
                adkg.mo33599a(adkg.f62011d.mo33603c(), adkg.f62010c.mo33606a(), false);
                if (this.f79219b.mo33606a() != 0) {
                    if (str2.startsWith("instantapps.DomainFilterUpdateService.oneOff")) {
                        str = "instantapps.DomainFilterUpdateService.oneOff";
                    } else {
                        str = str2;
                    }
                    switch (str.hashCode()) {
                        case -1766957981:
                            if (str.equals("instantapps.DomainFilterUpdateService.fullSync")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1487110658:
                            if (str.equals("instantapps.DomainFilterUpdateService.oneOff")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1825138455:
                            if (str.equals("instantapps.DomainFilterUpdateService.frequentChargingUnmetered")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1825649461:
                            if (str.equals("instantapps.DomainFilterUpdateService")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 0) {
                        if (!cepi.m137716b()) {
                            String substring = str2.substring(44);
                            if (substring.isEmpty()) {
                                bmxv = bmvz.f131120a;
                            } else {
                                try {
                                    camh a2 = camh.m126782a(Integer.parseInt(substring));
                                    if (a2 != null) {
                                        bmxv = bmxv.m108566b(a2);
                                    } else {
                                        f79217g.mo33426b("ONE_OFF task tag with invalid request type number is used. tag: %s", str2);
                                        throw new IllegalStateException(String.format("ONE_OFF task tag with invalid request type number is used. tag: %s", str2));
                                    }
                                } catch (NumberFormatException e) {
                                    f79217g.mo33425a(e, "Invalid number format is used to tag ONE_OFF task. tag: %s", str2);
                                    throw new IllegalStateException(String.format("Invalid number format is used to tag ONE_OFF task. tag: %s", str2));
                                }
                            }
                        } else {
                            bmxv = bmvz.f131120a;
                        }
                        if (!bmxv.mo66813a()) {
                            i = m66764b(camh.ONE_OFF_SYNC);
                        } else {
                            i = m66764b((camh) bmxv.mo66814b());
                        }
                    } else if (c == 1) {
                        i = m66764b(camh.FREQUENT_SYNC);
                    } else if (c == 2) {
                        i = m66764b(camh.PERIODIC_FULL_DOMAIN_FILTER_SYNC);
                    } else if (c != 3) {
                        int i3 = spn.f44932a;
                        f79217g.mo33426b("Unexpected DomainFilterUpdateStatus task tag: %s", str2);
                    } else {
                        i = this.f79218a.mo33564b(camh.DAILY_SYNC);
                    }
                    return m66760a(i, str2, a, "");
                }
                a.mo33409a("DomainFilterUpdateService.OptedOut");
                return 0;
            } else if (this.f79219b.mo33606a() == 0) {
                a.mo33409a("DomainFilterUpdateService.OptedOut.IntentFilter");
                return 0;
            } else {
                adje adje = this.f79218a;
                if (ceqj.m137858b()) {
                    i2 = adje.mo33557a();
                }
                return m66760a(i2, "instantapps.ScheduleGetIntentFilters", a, ".IntentFilter");
            }
        } else {
            a.mo33409a("DomainFilterUpdateService.SwitchKilled");
            return 0;
        }
    }
}
