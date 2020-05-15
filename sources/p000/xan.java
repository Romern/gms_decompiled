package p000;

/* renamed from: xan */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum xan implements bxvp {
    TRANSPORT_RESERVED_DO_NOT_USE(0),
    TRANSPORT_USB(1),
    TRANSPORT_NFC(2),
    TRANSPORT_BLE(3),
    TRANSPORT_CABLE(4),
    TRANSPORT_INTERNAL(5);
    

    /* renamed from: g */
    public final int f51798g;

    private xan(int i) {
        this.f51798g = i;
    }

    /* renamed from: a */
    public static xan m42567a(int i) {
        if (i == 0) {
            return TRANSPORT_RESERVED_DO_NOT_USE;
        }
        if (i == 1) {
            return TRANSPORT_USB;
        }
        if (i == 2) {
            return TRANSPORT_NFC;
        }
        if (i == 3) {
            return TRANSPORT_BLE;
        }
        if (i == 4) {
            return TRANSPORT_CABLE;
        }
        if (i != 5) {
            return null;
        }
        return TRANSPORT_INTERNAL;
    }

    /* renamed from: b */
    public static bxvr m42568b() {
        return xam.f51790a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f51798g;
    }

    public final String toString() {
        return Integer.toString(this.f51798g);
    }
}
