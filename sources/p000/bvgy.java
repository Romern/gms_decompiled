package p000;

/* renamed from: bvgy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvgy {
    /* renamed from: a */
    public static /* synthetic */ String m121105a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "CANCELLATION" : "IP_AVAILABLE" : "NETWORK_AVAILABLE" : "HOST_NETWORK" : "UNKNOWN_FRAME_TYPE";
    }

    /* renamed from: b */
    public static int m121106b(int i) {
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
