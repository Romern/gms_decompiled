package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Process;
import android.os.UserHandle;
import android.os.UserManager;
import android.provider.Settings;
import android.util.Log;
import com.google.android.location.internal.LocationSettings$1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;

/* renamed from: bgav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgav {

    /* renamed from: a */
    public final Context f115940a;

    /* renamed from: b */
    public final WifiManager f115941b;

    /* renamed from: c */
    public final PackageManager f115942c = this.f115940a.getPackageManager();

    /* renamed from: d */
    public final ContentResolver f115943d = this.f115940a.getContentResolver();

    /* renamed from: e */
    public final UserManager f115944e;

    /* renamed from: f */
    public final BluetoothAdapter f115945f;

    /* renamed from: g */
    private final LocationManager f115946g = ((LocationManager) this.f115940a.getSystemService("location"));

    /* renamed from: h */
    private final UserHandle f115947h;

    public bgav(Context context) {
        UserHandle userHandle;
        this.f115940a = context;
        this.f115941b = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        int i = Build.VERSION.SDK_INT;
        this.f115944e = (UserManager) this.f115940a.getSystemService("user");
        if (this.f115942c.hasSystemFeature("android.hardware.bluetooth_le")) {
            this.f115945f = ((BluetoothManager) this.f115940a.getSystemService("bluetooth")).getAdapter();
        } else {
            this.f115945f = null;
        }
        int i2 = Build.VERSION.SDK_INT;
        Iterator<UserHandle> it = this.f115944e.getUserProfiles().iterator();
        while (true) {
            if (!it.hasNext()) {
                userHandle = null;
                break;
            }
            userHandle = it.next();
            if (userHandle.isOwner()) {
                break;
            }
        }
        if (userHandle == null || Process.myUserHandle().equals(userHandle)) {
            this.f115947h = null;
        } else {
            this.f115947h = userHandle;
        }
    }

    /* renamed from: a */
    public final void mo62572a(int i, bgay bgay, int i2, int... iArr) {
        if (this.f115947h != null) {
            Context context = this.f115940a;
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(context, "com.google.android.location.internal.LocationProviderEnabler"));
            intent.putExtra("locationMode", i);
            int i3 = i2 - 1;
            if (i2 != 0) {
                intent.putExtra("source", i3);
                intent.putExtra("textResources", iArr);
                this.f115940a.sendOrderedBroadcastAsUser(intent, this.f115947h, "android.permission.WRITE_SECURE_SETTINGS", new LocationSettings$1("location", bgay), null, 0, null, null);
                return;
            }
            throw null;
        }
        if (i == 3 || i == 2) {
            aeri.m52432a(this.f115940a, true, aerk.ALLOWED, i2, iArr);
        }
        aeri.m52430a(this.f115940a, i, aerk.ALLOWED);
        if (bgay != null) {
            bgay.mo62586a();
        }
    }

    /* renamed from: b */
    public final boolean mo62575b() {
        return this.f115942c.hasSystemFeature("android.hardware.location.gps");
    }

    /* renamed from: c */
    public final boolean mo62576c() {
        if (cevw.m138317b()) {
            return aeri.m52435a(this.f115940a, "network");
        }
        return this.f115946g.isProviderEnabled("network");
    }

    /* renamed from: d */
    public final boolean mo62577d() {
        return this.f115942c.hasSystemFeature("android.hardware.location.network");
    }

    /* renamed from: e */
    public final boolean mo62578e() {
        return this.f115945f != null;
    }

    /* renamed from: h */
    public final boolean mo62581h() {
        return srs.m36149a(this.f115940a);
    }

    /* renamed from: i */
    public final boolean mo62582i() {
        BluetoothAdapter bluetoothAdapter = this.f115945f;
        if (bluetoothAdapter != null) {
            return bluetoothAdapter.isEnabled();
        }
        return false;
    }

    /* renamed from: j */
    public final boolean mo62583j() {
        int i = Build.VERSION.SDK_INT;
        return Settings.Global.getInt(this.f115940a.getContentResolver(), "airplane_mode_on", 0) != 0;
    }

    /* renamed from: f */
    public final boolean mo62579f() {
        int i = Build.VERSION.SDK_INT;
        return Settings.Global.getInt(this.f115943d, "ble_scan_always_enabled", 0) == 1 && !mo62583j();
    }

    /* renamed from: g */
    public final boolean mo62580g() {
        int i = Build.VERSION.SDK_INT;
        if (this.f115944e == null) {
            return false;
        }
        try {
            Method method = UserHandle.class.getMethod("of", Integer.TYPE);
            Method method2 = UserManager.class.getMethod("hasBaseUserRestriction", String.class, UserHandle.class);
            Object[] objArr = {Integer.valueOf(UserHandle.myUserId())};
            return ((Boolean) method2.invoke(this.f115944e, "no_share_location", (UserHandle) method.invoke(null, objArr))).booleanValue();
        } catch (NoSuchMethodException e) {
            if (!Log.isLoggable("LocationSettings", 6)) {
                return false;
            }
            Log.e("LocationSettings", "Method not found.", e);
            return false;
        } catch (ClassCastException | IllegalAccessException | InvocationTargetException e2) {
            if (!Log.isLoggable("LocationSettings", 6)) {
                return false;
            }
            Log.e("LocationSettings", "Method invocation failed.", e2);
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo62573a() {
        if (cevw.m138317b()) {
            return aeri.m52435a(this.f115940a, "gps");
        }
        return this.f115946g.isProviderEnabled("gps");
    }

    /* renamed from: a */
    public final boolean mo62574a(String str) {
        UserManager userManager = this.f115944e;
        if (userManager != null) {
            return userManager.hasUserRestriction(str);
        }
        return false;
    }
}
