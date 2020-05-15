package p000;

/* renamed from: bzal */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzal {
    /* renamed from: a */
    public static /* synthetic */ String m125582a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "LOW_LATENCY" : "BALANCED" : "LOW_POWER" : "ZERO_POWER" : "UNKNOWN_BLE_SCAN_MODE";
    }

    /* renamed from: b */
    public static int m125583b(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }
}
