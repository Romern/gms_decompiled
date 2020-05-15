package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.gms.update.SystemUpdateStatus;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: avlt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avlt {

    /* renamed from: a */
    public static final avlv f93328a = f93335h.mo51362a("min_data_space", (Long) 524288000L, cfsf.f185553i);

    /* renamed from: b */
    public static final avlv f93329b = f93335h.mo51362a("min_cache_space", (Long) 104857600L, cfsf.f185552h);

    /* renamed from: c */
    public static final avlv f93330c = f93336i.mo51363a("offpeak_download_window", "", cfsi.f185581J);

    /* renamed from: d */
    public static final avlv f93331d = f93336i.mo51362a("offpeak_download_max_trying_days", (Long) 2147483647L, cfsi.f185579H);

    /* renamed from: e */
    public static final avlv f93332e = f93336i.mo51361a("offpeak_download_operator_restricted", (Boolean) false, cfsi.f185580I);

    /* renamed from: f */
    public static final avlv f93333f = f93336i.mo51363a("zero_rate_apn_capability", "", cfsi.f185603ae);

    /* renamed from: g */
    public static final avlv f93334g = f93336i.mo51362a("mobile_network_delay", (Long) 0L, cfsi.f185626x);

    /* renamed from: h */
    private static final avlu f93335h = new avlu("config.flag.download_");

    /* renamed from: i */
    private static final avlu f93336i = new avlu("config.flag.");

    /* renamed from: b */
    public static final List m78749b() {
        return bmyx.m108640a(',').mo66917a().mo66922b(bmwx.m108501b(' ')).mo66925c((CharSequence) f93333f.mo51364a());
    }

    /* renamed from: c */
    public static boolean m78750c() {
        return (cfrr.f185526a.mo82579b().mo82580a() || (cfrr.f185526a.mo82579b().mo82581b() && ((Boolean) avma.f93362h.mo51364a()).booleanValue())) && cftt.m143037b();
    }

    /* renamed from: a */
    public static long m78746a(Context context) {
        if (cfsg.f185570a.mo6606a().mo82628L()) {
            avls.m78740f(context);
        }
        return ((Long) f93334g.mo51364a()).longValue() * 1000;
    }

    /* renamed from: a */
    public static avlr m78747a(Context context, bmxv bmxv, SystemUpdateStatus systemUpdateStatus) {
        int i;
        bmxv bmxv2;
        long currentTimeMillis = System.currentTimeMillis();
        avmb a = avmb.m78775a(context, systemUpdateStatus.f109472n);
        if (avme.m78790a(context, systemUpdateStatus) && !systemUpdateStatus.f109467i) {
            return new avlr(1803, cfsd.f185543a.mo6606a().mo82595c());
        }
        if (systemUpdateStatus.f109469k) {
            return new avlr(1547, cfsd.f185543a.mo6606a().mo82605m());
        }
        if (bmxx.m108577a((String) avma.f93361g.mo51364a())) {
            long j = systemUpdateStatus.f109473o;
            if (j == 0) {
                return new avlr(1291, Math.max(TimeUnit.MINUTES.toMillis(15), cfsg.m142820g()));
            }
            if (currentTimeMillis < j + cfsg.m142820g()) {
                return new avlr(1291, (cfsg.m142820g() + systemUpdateStatus.f109473o) - currentTimeMillis);
            }
        }
        if (!avls.m78738d(context)) {
            int c = avls.m78736c(context);
            if (avls.m78735b(context)) {
                i = (int) cfsg.f185570a.mo6606a().mo82636h();
            } else {
                i = (int) cfsg.f185570a.mo6606a().mo82635g();
            }
            if (c >= i) {
                if (!systemUpdateStatus.f109476r.f109421b && bmxv.mo66813a() && ((avqa) bmxv.mo66814b()).mo51489b(context) && !systemUpdateStatus.f109465g.f109446a) {
                    long a2 = m78746a(context);
                    if (a.f93369a == 0 && a2 > 0 && a2 + systemUpdateStatus.f109472n > currentTimeMillis) {
                        return new avlr(2059, cfsd.f185543a.mo6606a().mo82613u());
                    }
                    if (TimeUnit.DAYS.toMillis(((Long) f93331d.mo51364a()).longValue()) + systemUpdateStatus.f109472n > currentTimeMillis) {
                        avmc a3 = avmc.m78777a((String) f93330c.mo51364a());
                        if (!a3.mo51367a()) {
                            a3 = avmc.f93372b;
                        }
                        if (!a3.mo51368a(currentTimeMillis) && !systemUpdateStatus.f109465g.f109447b && a.f93369a != 1) {
                            return new avlr(267, a3.mo51369b(currentTimeMillis));
                        }
                        if (((Boolean) f93332e.mo51364a()).booleanValue() && !bmxx.m108578b(((TelephonyManager) context.getSystemService("phone")).getSimOperator()).equalsIgnoreCase(qdg.m31928i(context))) {
                            return new avlr(779, cfsd.f185543a.mo6606a().mo82604l());
                        }
                    }
                    if (!cfsd.f185543a.mo6606a().mo82594b()) {
                        avqa avqa = (avqa) bmxv.mo66814b();
                        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                        if (!avqa.f93761a.mo66813a()) {
                            bmxv2 = bmxv.m108567c(connectivityManager.getActiveNetworkInfo());
                        } else {
                            bmxv2 = bmxv.m108567c(connectivityManager.getNetworkInfo((Network) avqa.f93761a.mo66814b()));
                        }
                        if (bmxv2.mo66813a() && ((NetworkInfo) bmxv2.mo66814b()).isRoaming()) {
                            return new avlr(2571, cfsd.f185543a.mo6606a().mo82597e());
                        }
                    }
                }
                if (!avls.m78735b(context)) {
                    avls.m78745k(context);
                }
                return new avlr(2, 0);
            }
        }
        return new avlr(2315, cfsd.f185543a.mo6606a().mo82599g());
    }

    /* renamed from: a */
    public static boolean m78748a() {
        if (TextUtils.isEmpty((CharSequence) f93333f.mo51364a())) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        return true;
    }
}
