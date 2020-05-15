package p000;

/* renamed from: btrr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum btrr implements bxvp {
    IDV_CHALLENGE(0),
    PIN_CHALLENGE(1),
    MIN_ADDRESS_UPGRADE_CHALLENGE(2),
    DEVICE_LOCK_CHALLENGE(3),
    CVN_CHALLENGE(4),
    PURCHASE_MANAGER_CHALLENGE(5);
    

    /* renamed from: g */
    public final int f150143g;

    private btrr(int i) {
        this.f150143g = i;
    }

    /* renamed from: a */
    public static btrr m117075a(int i) {
        if (i == 0) {
            return IDV_CHALLENGE;
        }
        if (i == 1) {
            return PIN_CHALLENGE;
        }
        if (i == 2) {
            return MIN_ADDRESS_UPGRADE_CHALLENGE;
        }
        if (i == 3) {
            return DEVICE_LOCK_CHALLENGE;
        }
        if (i == 4) {
            return CVN_CHALLENGE;
        }
        if (i != 5) {
            return null;
        }
        return PURCHASE_MANAGER_CHALLENGE;
    }

    /* renamed from: b */
    public static bxvr m117076b() {
        return btrq.f150135a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f150143g;
    }

    public final String toString() {
        return Integer.toString(this.f150143g);
    }
}
