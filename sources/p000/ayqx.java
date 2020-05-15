package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.libraries.bluetooth.fastpair.BroadcastConstants$Result;
import com.google.android.libraries.bluetooth.fastpair.BroadcastConstants$Step;

/* renamed from: ayqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayqx {
    /* renamed from: a */
    static void m84632a(Context context, String str) {
        if (m84636a(context)) {
            bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
            bnsl.mo68432a("ayqx", "a", 48, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Send device name (%s) to validator", str);
            context.sendBroadcast(new Intent("com.google.android.libraries.bluetooth.fastpair.action.GET_DEVICE_NAME").setPackage("com.google.location.nearby.apps.fastpair.validator").putExtra("com.google.android.gms.nearby.discovery.DEVICE_NAME", str));
            return;
        }
        bnsp bnsp = aypn.f98194a;
    }

    /* renamed from: a */
    public static void m84633a(Context context, String str, BroadcastConstants$Step broadcastConstants$Step, BroadcastConstants$Result broadcastConstants$Result) {
        if (m84636a(context)) {
            bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
            bnsl.mo68432a("ayqx", "a", 31, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68425a("Send pair progress to validator, bleAddress=%s, step=%s, result=%s", str, broadcastConstants$Step, broadcastConstants$Result);
            context.sendBroadcast(new Intent("com.google.android.gms.nearby.discovery.ACTION_VALIDATOR_PAIR_PROGRESS").setPackage("com.google.location.nearby.apps.fastpair.validator").putExtra("com.google.android.gms.nearby.discovery.BLE_ADDRESS", str).putExtra("com.google.android.gms.nearby.discovery.EXTRA_STEP", broadcastConstants$Step).putExtra("com.google.android.gms.nearby.discovery.EXTRA_RESULT", broadcastConstants$Result));
            return;
        }
        bnsp bnsp = aypn.f98194a;
    }

    /* renamed from: a */
    public static void m84634a(Context context, String str, boolean z) {
        if (m84636a(context)) {
            bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
            bnsl.mo68432a("ayqx", "a", 76, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Send silent mode to validator");
            context.sendBroadcast(new Intent("com.google.android.libraries.bluetooth.fastpair.action.SILENT_STATE_CHANGE").setPackage("com.google.location.nearby.apps.fastpair.validator").putExtra("com.google.android.gms.nearby.discovery.PUBLIC_ADDRESS", str).putExtra("com.google.android.gms.nearby.discovery.EXTRA_SILENT_STATE", z));
            return;
        }
        bnsp bnsp = aypn.f98194a;
    }

    /* renamed from: a */
    static void m84635a(Context context, byte[] bArr) {
        if (m84636a(context)) {
            bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
            bnsl.mo68432a("ayqx", "a", 62, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Send account key to validator");
            context.sendBroadcast(new Intent("com.google.android.libraries.bluetooth.fastpair.action.SEND_ACCOUNT_KEY").setPackage("com.google.location.nearby.apps.fastpair.validator").putExtra("com.google.android.gms.nearby.discovery.ACCOUNT_KEY", bArr));
            return;
        }
        bnsp bnsp = aypn.f98194a;
    }

    /* renamed from: a */
    public static boolean m84636a(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo("com.google.location.nearby.apps.fastpair.validator", 0).enabled;
        } catch (PackageManager.NameNotFoundException e) {
            bnsp bnsp = aypn.f98194a;
            return false;
        }
    }
}
