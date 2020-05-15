package p000;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* renamed from: burl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class burl {

    /* renamed from: a */
    public final Context f154771a;

    public burl(Context context) {
        this.f154771a = context;
    }

    /* renamed from: a */
    public static boolean m120292a() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return defaultAdapter != null && defaultAdapter.isEnabled();
    }

    /* renamed from: b */
    public static boolean m120296b() {
        int i = Build.VERSION.SDK_INT;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return defaultAdapter != null && defaultAdapter.isLeEnabled();
    }

    /* renamed from: c */
    public static boolean m120298c() {
        if (cfos.f185168a.mo6606a().mo82249a()) {
            int i = Build.VERSION.SDK_INT;
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter == null || !defaultAdapter.isBleScanAlwaysAvailable()) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static Locale m120299d() {
        int i = Build.VERSION.SDK_INT;
        return LocaleList.getDefault().get(0);
    }

    /* renamed from: e */
    public final int mo73045e() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f154771a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            return 2;
        }
        if (activeNetworkInfo.getType() == 1) {
            return 3;
        }
        if (activeNetworkInfo.getType() == 0) {
            return 4;
        }
        return 1;
    }

    /* renamed from: a */
    public static boolean m120293a(Context context) {
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        if (locationManager == null || (!locationManager.isProviderEnabled("gps") && !locationManager.isProviderEnabled("network"))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m120297b(Context context, burk burk) {
        if (cfod.f184793a.mo6606a().mo81934w() && Build.VERSION.SDK_INT >= Math.max(19, (int) cfod.f184793a.mo6606a().mo81890L())) {
            buqv buqv = (buqv) burk;
            if (buqv.f154744b || buqv.f154743a || (!cfod.f184793a.mo6606a().mo81917f() && !context.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le"))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m120294a(Context context, burk burk) {
        return m120297b(context, burk) && (m120292a() || m120298c()) && (m120293a(context) || cfod.m141146f());
    }

    /* renamed from: a */
    public static boolean m120295a(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }
}
