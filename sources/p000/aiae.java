package p000;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: aiae */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiae {

    /* renamed from: a */
    private static final Set f68559a = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: b */
    private static final aiad f68560b = new aiad(null, 0);

    /* renamed from: c */
    private final Context f68561c;

    public aiae(Context context) {
        this.f68561c = context;
    }

    /* renamed from: a */
    public static aiad m56945a(Context context, ahyw ahyw) {
        byte[] bArr;
        String str = ahyw.f68399h;
        String str2 = ahyw.f68400i;
        Integer valueOf = Integer.valueOf(ahyw.f68394c);
        if (!ahyw.f68413w.equals(bxtx.f164797b)) {
            bArr = ahyw.f68413w.mo73780k();
        } else {
            bArr = null;
        }
        return m56946a(context, str, str2, valueOf, bArr, ahyw.f68393b, 601);
    }

    /* renamed from: b */
    private static boolean m56951b(String str) {
        try {
            String scheme = new URI(str).getScheme();
            if (scheme != null) {
                return f68559a.contains(scheme.toLowerCase(Locale.US));
            }
            return false;
        } catch (URISyntaxException e) {
            return false;
        }
    }

    /* renamed from: a */
    public static aiad m56946a(Context context, String str, String str2, Integer num, byte[] bArr, String str3, int i) {
        BluetoothDevice bluetoothDevice;
        int i2;
        BluetoothManager bluetoothManager;
        srn srn = ahsd.f67925a;
        if (str == null) {
            return f68560b;
        }
        String str4 = null;
        if (str2 == null || (bluetoothManager = (BluetoothManager) context.getSystemService("bluetooth")) == null) {
            bluetoothDevice = null;
        } else {
            try {
                bluetoothDevice = bluetoothManager.getAdapter().getRemoteDevice(str2);
            } catch (IllegalArgumentException e) {
                ((bnsl) ahsd.f67925a.mo68387b()).mo68420a("Invalid device address: %s", str2);
                bluetoothDevice = null;
            }
        }
        if (m56951b(str)) {
            return new aiad(m56948a(str, bluetoothDevice, str3, context), 1);
        }
        Intent a = m56947a(str);
        if (a == null || TextUtils.isEmpty(a.getPackage())) {
            return f68560b;
        }
        if (cfod.f184793a.mo6606a().mo81937z() && !burl.m120295a(context, a.getPackage()) && a.getPackage() != null) {
            List c = bmyx.m108643a(".").mo66925c((CharSequence) a.getPackage());
            Iterator<ApplicationInfo> it = context.getPackageManager().getInstalledApplications(128).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ApplicationInfo next = it.next();
                if (bmyx.m108643a(".").mo66925c((CharSequence) next.packageName).containsAll(c)) {
                    ((bnsl) ahsd.f67925a.mo68390d()).mo68424a("%s not installed, but found similar alternative and replaced with %s", a.getPackage(), next.packageName);
                    a = a.setPackage(next.packageName);
                    break;
                }
            }
        }
        ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("ActionUrlParser: intent type : %s", a.toUri(1));
        PackageManager packageManager = context.getPackageManager();
        if (sqw.m36041a((Collection) packageManager.queryIntentActivities(a, 64))) {
            i2 = sqw.m36041a(packageManager.queryIntentServices(a, 64)) ? !sqw.m36041a(packageManager.queryBroadcastReceivers(a, 64)) ? 6 : 0 : 5;
        } else {
            i2 = 2;
        }
        if (i2 != 0) {
            if (butf.m120430a(context, a.getPackage(), "android.permission.ACCESS_FINE_LOCATION")) {
                m56949a(a, bluetoothDevice);
                m56950a(a, num, bArr);
            } else if (cfod.f184793a.mo6606a().mo81918g() && butf.m120430a(context, a.getPackage(), "android.permission.BLUETOOTH")) {
                m56949a(a, bluetoothDevice);
            }
            return new aiad(a, i2, a.getPackage());
        }
        String stringExtra = a.getStringExtra("browser_fallback_url");
        if (stringExtra == null || !m56951b(stringExtra)) {
            stringExtra = null;
        }
        if (stringExtra != null) {
            return new aiad(m56948a(stringExtra, bluetoothDevice, str3, context), 3);
        }
        if (i - 1 < 700 || cfod.f184793a.mo6606a().mo81916e()) {
            String str5 = a.getPackage();
            if (a.getData() != null) {
                a.setComponent(null);
                a.addCategory("android.intent.category.BROWSABLE");
                str4 = a.getData().toString();
            }
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme("market").authority("details").appendQueryParameter("id", str5);
            if (str4 != null) {
                appendQueryParameter.appendQueryParameter("url", str4);
            }
            return new aiad(new Intent("android.intent.action.VIEW", appendQueryParameter.build()), 4, a.getPackage());
        } else if (!"com.google.android.googlequicksearchbox".equals(a.getPackage()) || !"com.google.android.apps.gsa.bisto.MAGIC_PAIR".equals(a.getAction())) {
            return f68560b;
        } else {
            Intent intent = DiscoveryChimeraService.m67336a(context).setAction("com.google.android.gms.nearby.discovery:ACTION_MAGIC_PAIR").setPackage(context.getPackageName());
            m56949a(intent, bluetoothDevice);
            m56950a(intent, num, bArr);
            return new aiad(intent, 5, intent.getPackage());
        }
    }

    /* renamed from: a */
    public static Intent m56947a(String str) {
        try {
            return Intent.parseUri(str, 1);
        } catch (URISyntaxException e) {
            ((bnsl) ahsd.f67925a.mo68387b()).mo68420a("Failed to parse action URL using intent scheme: %s", str);
            return null;
        }
    }

    /* renamed from: a */
    private static Intent m56948a(String str, BluetoothDevice bluetoothDevice, String str2, Context context) {
        Intent putExtra = DiscoveryChimeraService.m67336a(context.getApplicationContext()).setAction("com.google.android.gms.nearby.discovery.ACTION_LAUNCH_WEB_URL_IN_BROWSER").putExtra("com.google.android.gms.nearby.discovery.EXTRA_ITEM_ID", str2).putExtra("com.google.android.gms.nearby.discovery.EXTRA_URL", str);
        m56949a(putExtra, bluetoothDevice);
        return putExtra;
    }

    /* renamed from: a */
    static void m56949a(Intent intent, BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice != null) {
            intent.putExtra("android.bluetooth.device.extra.DEVICE", bluetoothDevice);
        }
    }

    /* renamed from: a */
    private static void m56950a(Intent intent, Integer num, byte[] bArr) {
        if (num != null) {
            intent.putExtra("android.bluetooth.device.extra.RSSI", num);
        }
        if (bArr != null) {
            intent.putExtra("com.google.android.gms.nearby.messages.ble.EXTRA_BLE_RECORD_BYTES", bArr);
        }
    }

    /* renamed from: a */
    public final aiad mo37330a(String str, ahsu ahsu) {
        Context context = this.f68561c;
        String m = ahsu.mo37088m();
        Integer u = ahsu.mo37097u();
        byte[] v = ahsu.mo37098v();
        String i = ahsu.mo37084i();
        int b = bzaw.m125599b(ahsu.mo37094s().f169128b);
        return m56946a(context, str, m, u, v, i, b == 0 ? 1 : b);
    }
}
