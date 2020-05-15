package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.os.Build;
import android.os.PowerManager;
import com.felicanetworks.sdu.ErrorInfo;
import java.util.Locale;

/* renamed from: ovs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ovs {

    /* renamed from: a */
    public static final bnsn f38499a = odk.m28481a("CAR.MISC.WifiSupportChecker");

    /* renamed from: b */
    public final Context f38500b;

    /* renamed from: c */
    public final PackageManager f38501c;

    public ovs(Context context) {
        this.f38500b = context;
        this.f38501c = context.getPackageManager();
    }

    /* renamed from: a */
    public final int mo22705a() {
        PackageInfo packageInfo;
        if (!ccwp.m131939b()) {
            return 2;
        }
        if (!ccwv.f180128a.mo6606a().mo76960a()) {
            return 3;
        }
        bnic a = bnic.m109488a(bmyx.m108640a(',').mo66918a((CharSequence) ccwv.f180128a.mo6606a().mo76961b()));
        String a2 = pcm.m30205a(this.f38500b);
        if (!bmxx.m108577a(a2) && !a.contains(a2.toUpperCase(Locale.getDefault())) && !a.contains("*")) {
            bnsi d = pcm.f38841a.mo68390d();
            d.mo68432a("pcm", "a", 174, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Wireless disabled in country");
            return 3;
        } else if (oyh.f38613a.mo22779a(this.f38500b)) {
            return 5;
        } else {
            if (((long) Build.VERSION.SDK_INT) >= ccwp.f180112a.mo6606a().mo76947b()) {
                try {
                    packageInfo = this.f38501c.getPackageInfo("com.google.android.projection.gearhead", 4096);
                } catch (PackageManager.NameNotFoundException e) {
                    packageInfo = null;
                }
                if (packageInfo == null && ccwp.f180112a.mo6606a().mo76951f()) {
                    bnsi c = f38499a.mo68388c();
                    c.mo68432a("ovs", "a", 89, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68405a("Gearhead not installed; update flow only enabled");
                    return 6;
                } else if (packageInfo != null && this.f38501c.checkPermission("android.permission.ACCESS_COARSE_LOCATION", "com.google.android.projection.gearhead") != 0 && !ccwp.f180112a.mo6606a().mo76950e()) {
                    bnsi c2 = f38499a.mo68388c();
                    c2.mo68432a("ovs", "a", 98, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c2.mo68405a("Location permission denied on Android Auto");
                    return 7;
                } else if (!((LocationManager) this.f38500b.getSystemService("location")).isProviderEnabled("gps") && !ccwp.f180112a.mo6606a().mo76949d()) {
                    bnsi c3 = f38499a.mo68388c();
                    c3.mo68432a("ovs", "a", (int) ErrorInfo.TYPE_SDU_FAILED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c3.mo68405a("Location Services disabled");
                    return 8;
                } else if (!((PowerManager) this.f38500b.getSystemService("power")).isPowerSaveMode() || ccwp.f180112a.mo6606a().mo76948c()) {
                    return 1;
                } else {
                    bnsi c4 = f38499a.mo68388c();
                    c4.mo68432a("ovs", "a", 109, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c4.mo68405a("Device in battery saver mode");
                    return 9;
                }
            } else {
                bnsi c5 = f38499a.mo68388c();
                c5.mo68432a("ovs", "a", 82, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c5.mo68405a("SDK version below wifi enabled version");
                return 4;
            }
        }
    }
}
