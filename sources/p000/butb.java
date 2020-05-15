package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;

/* renamed from: butb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class butb {
    /* renamed from: a */
    public static Intent m120413a(Context context) {
        return m120417b(context).setAction("com.google.android.gms.nearby.discovery.ACTION_LIST_ACTIVITY_AUTO_REFRESH");
    }

    /* renamed from: b */
    public static Intent m120417b(Context context) {
        return new Intent().setClassName(context, "com.google.android.gms.nearby.discovery.service.DiscoveryService");
    }

    /* renamed from: a */
    public static Intent m120414a(Context context, bvin bvin) {
        return m120417b(context).setAction("com.google.android.gms.nearby.discovery.ACTION_LOG_EVENT").putExtra("com.google.android.gms.nearby.discovery.EXTRA_LOG_EVENT", bvin.f156289bv);
    }

    /* renamed from: a */
    public static Intent m120415a(Context context, bvin bvin, String str, bzau bzau, String str2, byte[] bArr, Parcelable parcelable) {
        Intent b = m120417b(context);
        if (parcelable instanceof Intent) {
            b.setAction("com.google.android.gms.nearby.discovery.ACTION_LOG_SLICE_AND_LAUNCH_INTENT").putExtra("com.google.android.gms.nearby.discovery.EXTRA_INTENT", parcelable);
        } else {
            b.setAction("com.google.android.gms.nearby.discovery.ACTION_LOG_SLICE_AND_SEND_PENDING_INTENT").putExtra("com.google.android.gms.nearby.discovery.EXTRA_PENDING_INTENT", parcelable);
        }
        return b.putExtra("com.google.android.gms.nearby.discovery.EXTRA_LOG_EVENT", bvin.f156289bv).putExtra("com.google.android.gms.nearby.discovery:EXTRA_COMPANION_APP", str).putExtra("com.google.android.gms.nearby.discovery:EXTRA_ENTRY_POINT", bzau.f169233e).putExtra("com.google.android.gms.nearby.discovery.EXTRA_MAC_ADDRESS", str2).putExtra("com.google.android.gms.nearby.discovery.EXTRA_ACCOUNT_KEY", bArr);
    }

    /* renamed from: a */
    public static Intent m120416a(Context context, String str, String str2, long j, int i, Throwable th) {
        Intent putExtra = m120417b(context).setAction("com.google.android.gms.nearby.discovery.ACTION_FOOTPRINTS_ANALYTICS").putExtra("com.google.android.gms.nearby.discovery.EXTRA_TRIGGER_ID", str).putExtra("com.google.android.gms.nearby.discovery.EXTRA_BLE_ADDRESS", str2).putExtra("com.google.android.gms.nearby.discovery.EXTRA_DURATION_MILLIS", j).putExtra("com.google.android.gms.nearby.discovery.EXTRA_NUMBER_DEVICES", i);
        if (th != null) {
            putExtra.putExtra("com.google.android.gms.nearby.discovery.EXTRA_UPLOAD_FAIL_REASON", th);
        }
        return putExtra;
    }
}
