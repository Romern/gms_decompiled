package p000;

import android.content.Intent;
import android.os.ParcelUuid;
import android.os.Parcelable;

/* renamed from: ovu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ovu {
    static {
        odk.m28481a("CAR.BT");
    }

    /* renamed from: a */
    public static int m29894a(Intent intent) {
        String action = intent.getAction();
        if ("android.bluetooth.device.action.ACL_CONNECTED".equals(action)) {
            return 2;
        }
        if ("android.bluetooth.device.action.ACL_DISCONNECTED".equals(action)) {
            return 0;
        }
        if ("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(action) || "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED".equals(action)) {
            return intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
        }
        return -1;
    }

    /* renamed from: b */
    public static boolean m29896b(Intent intent) {
        return "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction());
    }

    /* renamed from: a */
    public static boolean m29895a(Parcelable[] parcelableArr) {
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                ParcelUuid parcelUuid = (ParcelUuid) parcelable;
                if (parcelUuid != null && parcelUuid.getUuid() != null && (npp.f36342d.equals(parcelUuid.getUuid()) || npp.f36343e.equals(parcelUuid.getUuid()))) {
                    return true;
                }
            }
        }
        return false;
    }
}
