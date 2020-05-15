package p000;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.felicanetworks.mfc.mfi.MfiClientException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: aipd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aipd {

    /* renamed from: a */
    private static boolean f69412a;

    /* renamed from: b */
    private static aipd f69413b;

    private aipd() {
    }

    /* renamed from: a */
    public static synchronized aipd m57627a() {
        aipd aipd;
        synchronized (aipd.class) {
            if (f69413b == null) {
                f69413b = new aipd();
            }
            aipd = f69413b;
        }
        return aipd;
    }

    /* renamed from: b */
    public static List m57629b(Context context) {
        return Arrays.asList(m57630e(context).getString("modified_device_name", "").split(","));
    }

    /* renamed from: e */
    private static SharedPreferences m57630e(Context context) {
        return context.getSharedPreferences("nearbymediums:bluetoothclassic", 0);
    }

    /* renamed from: c */
    public final synchronized void mo37797c(Context context) {
        if (!m57629b(context).isEmpty()) {
            new soa(9, new aipb(this, context)).start();
        }
    }

    /* renamed from: d */
    public final synchronized void mo37798d(Context context) {
        if (!f69412a) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null) {
                mo37795a(context, defaultAdapter);
            } else {
                throw new IllegalStateException(String.format("BluetoothAdapter not ready yet!", new Object[0]));
            }
        }
    }

    /* renamed from: a */
    public static String m57628a(Context context) {
        return m57630e(context).getString("original_device_name", null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005f, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo37795a(Context context, BluetoothAdapter bluetoothAdapter) {
        f69412a = false;
        if (!m57629b(context).contains(bluetoothAdapter.getName())) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aipd", "a", (int) MfiClientException.TYPE_MFICLIENT_NOT_FOUND, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("BluetoothAdapter's name was not set by Nearby Connections, ignoring call to restore device name");
            return;
        }
        String a = m57628a(context);
        if (a != null) {
            if (bluetoothAdapter.setName(a)) {
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
                bnsl2.mo68432a("aipd", "a", 160, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("Restored bluetooth device name to persisted original device name: %s ", a);
                return;
            }
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68388c();
            bnsl3.mo68432a("aipd", "a", 164, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68420a("Failed to restore original Bluetooth device name to %s", a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0071, code lost:
        return false;
     */
    /* renamed from: a */
    public final synchronized boolean mo37796a(Context context, BluetoothAdapter bluetoothAdapter, String str) {
        f69412a = false;
        String name = bluetoothAdapter.getName();
        if (m57629b(context).contains(name)) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68432a("aipd", "a", 98, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Detected a failure to restore the original Bluetooth device name");
            name = m57628a(context);
        }
        ArrayList arrayList = new ArrayList(m57629b(context));
        while (arrayList.size() >= 5) {
            arrayList.remove(0);
        }
        arrayList.add(str);
        if (m57630e(context).edit().putString("original_device_name", name).putString("modified_device_name", TextUtils.join(",", arrayList)).commit() && bluetoothAdapter.setName(str)) {
            f69412a = true;
            return true;
        }
    }
}
