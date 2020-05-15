package p000;

import android.util.Log;

/* renamed from: vuu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum vuu {
    ACTIVITY_RECOGNITION,
    BLUETOOTH,
    ANDROID_AUTO,
    DOCK,
    MANUAL,
    FORCE;
    

    /* renamed from: g */
    private static final vuu[] f50009g = values();

    /* renamed from: a */
    public static vuu m41423a(int i) {
        if (i == 1) {
            return ANDROID_AUTO;
        }
        if (i == 2) {
            return DOCK;
        }
        StringBuilder sb = new StringBuilder(70);
        sb.append("TriggerReason given (");
        sb.append(i);
        sb.append(") cannot be converted to TriggerSource");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public static vuu m41424b(int i) {
        try {
            return f50009g[i];
        } catch (IndexOutOfBoundsException e) {
            StringBuilder sb = new StringBuilder(42);
            sb.append("Invalid ordinal TriggerSource: ");
            sb.append(i);
            Log.e("CAR.DRIVINGMODE", sb.toString());
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append("Invalid ordinal TriggerSource: ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString(), e);
        }
    }

    /* renamed from: a */
    public final boolean mo28893a() {
        return this == ACTIVITY_RECOGNITION || this == BLUETOOTH;
    }
}
