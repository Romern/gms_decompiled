package p000;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import com.google.android.gms.update.SystemUpdateStatus;

/* renamed from: avlw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avlw {

    /* renamed from: a */
    public static final avlv f93340a;

    /* renamed from: b */
    public static final avlv f93341b = f93343d.mo51362a("battery_threshold", (Long) 40L, cfsi.f185605c);

    /* renamed from: c */
    public static final avlv f93342c = f93343d.mo51362a("min_battery_threshold", (Long) 20L, cfsi.f185625w);

    /* renamed from: d */
    private static final avlu f93343d;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: avlu.a(java.lang.String, java.lang.Long, bdyx):avlv
     arg types: [java.lang.String, long, bdyx]
     candidates:
      avlu.a(java.lang.String, java.lang.Boolean, bdyx):avlv
      avlu.a(java.lang.String, java.lang.String, bdyx):avlv
      avlu.a(java.lang.String, java.lang.Long, bdyx):avlv */
    static {
        avlu avlu = new avlu("config.flag.");
        f93343d = avlu;
        f93340a = avlu.mo51363a("maintenance_window", "", cfsi.f185624v);
    }

    /* renamed from: c */
    public static int m78760c(Context context) {
        if (avls.m78735b(context)) {
            return ((Long) f93342c.mo51364a()).intValue();
        }
        return ((Long) f93341b.mo51364a()).intValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0087, code lost:
        if ((r4 + p000.cfsj.f185629a.mo82655e().mo82661f()) < r2) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009b, code lost:
        if (p000.avls.m78735b(r9) == false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b7, code lost:
        if (p000.avls.m78735b(r9) == false) goto L_0x00ba;
     */
    /* renamed from: a */
    public static avlr m78755a(Context context, SystemUpdateStatus systemUpdateStatus) {
        long currentTimeMillis = System.currentTimeMillis();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        avmb a = avmb.m78775a(context, systemUpdateStatus.f109472n);
        int i = a.f93369a;
        if (i == 4 || i == 3) {
            return new avlr(1299, a.f93370b);
        }
        avmc a2 = m78756a();
        if (!systemUpdateStatus.f109476r.f109421b && !systemUpdateStatus.f109466h.f109449b && !a2.mo51368a(currentTimeMillis) && a.f93369a != 1) {
            return new avlr(531, a2.mo51369b(currentTimeMillis));
        }
        if (avls.m78736c(context) < m78760c(context)) {
            return new avlr(275, cfsj.m142904d());
        }
        if (!systemUpdateStatus.f109476r.f109421b && a.f93369a == 0 && !systemUpdateStatus.f109466h.f109448a) {
            long j = currentTimeMillis - systemUpdateStatus.f109472n;
            if (j < cfsj.f185629a.mo6606a().mo82664i() && !avls.m78733a(context)) {
                long j2 = systemUpdateStatus.f109474p;
                if (j2 != -1) {
                }
                return new avlr(1043, cfsj.f185629a.mo6606a().mo82663h());
            }
            if (j < cfsj.f185629a.mo6606a().mo82660e()) {
            }
            if (j < cfsj.f185629a.mo6606a().mo82662g()) {
                if (avls.m78736c(context) < 80) {
                }
            }
        }
        if (systemUpdateStatus.f109470l) {
            return new avlr(787, cfsj.f185629a.mo6606a().mo82667l());
        }
        return new avlr(273, 0);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnic.a(java.lang.Object, java.lang.Object):bnic
     arg types: [int, int]
     candidates:
      bnic.a(int, java.lang.Object[]):bnic
      bnic.a(int, int):boolean
      bngm.a(java.lang.Object[], int):int
      bnic.a(java.lang.Object, java.lang.Object):bnic */
    /* renamed from: b */
    public static avlr m78758b(Context context, SystemUpdateStatus systemUpdateStatus) {
        long currentTimeMillis = System.currentTimeMillis();
        avmb a = avmb.m78775a(context, systemUpdateStatus.f109472n);
        int i = a.f93369a;
        if (i == 4 || i == 3) {
            return new avlr(1552, a.f93370b);
        }
        if (avls.m78736c(context) < m78760c(context)) {
            return new avlr(1040, cfsj.m142904d());
        }
        avmc a2 = m78756a();
        if (!systemUpdateStatus.f109476r.f109421b && !a2.mo51368a(currentTimeMillis) && !systemUpdateStatus.f109466h.f109449b && a.f93369a != 1) {
            return new avlr(1296, a2.mo51369b(currentTimeMillis));
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (((Long) avme.f93383e.mo51364a()).longValue() != avme.f93380b.longValue() || !cfsj.f185629a.mo6606a().mo82656a() || !bnic.m109490a((Object) 2, (Object) 1).contains(Integer.valueOf(telephonyManager.getCallState()))) {
            return new avlr(784, 0);
        }
        return new avlr(1041, cfsj.f185629a.mo6606a().mo82668m());
    }

    /* renamed from: b */
    public static boolean m78759b(Context context) {
        return cfsy.f185667a.mo6606a().mo82689a() && context.getPackageManager().hasSystemFeature("android.hardware.reboot_escrow") && !avls.m78741g(context);
    }

    /* renamed from: a */
    public static avmc m78756a() {
        avmc a = avmc.m78777a((String) f93340a.mo51364a());
        return !a.mo51367a() ? avmc.f93372b : a;
    }

    /* renamed from: a */
    public static boolean m78757a(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (m78759b(context)) {
            return true;
        }
        if (avls.m78741g(context)) {
            return false;
        }
        if (cfsy.f185667a.mo6606a().mo82691c() && !avls.m78742h(context)) {
            return true;
        }
        return bmyx.m108640a(',').mo66917a().mo66925c((CharSequence) cfsj.f185629a.mo6606a().mo82659d()).contains(stn.m36304a("ro.crypto.state", ""));
    }
}
