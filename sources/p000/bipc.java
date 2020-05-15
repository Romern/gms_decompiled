package p000;

/* renamed from: bipc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bipc implements bxvp {
    BLUETOOTH_PAIRING_UNAVAILABLE(-1),
    BLUETOOTH_PAIRING_OOB(1),
    BLUETOOTH_PAIRING_NUMERIC_COMPARISON(2),
    BLUETOOTH_PAIRING_PASSKEY_ENTRY(3),
    BLUETOOTH_PAIRING_PIN(4);
    

    /* renamed from: f */
    public final int f121142f;

    private bipc(int i) {
        this.f121142f = i;
    }

    /* renamed from: a */
    public static bipc m102687a(int i) {
        if (i == -1) {
            return BLUETOOTH_PAIRING_UNAVAILABLE;
        }
        if (i == 1) {
            return BLUETOOTH_PAIRING_OOB;
        }
        if (i == 2) {
            return BLUETOOTH_PAIRING_NUMERIC_COMPARISON;
        }
        if (i == 3) {
            return BLUETOOTH_PAIRING_PASSKEY_ENTRY;
        }
        if (i != 4) {
            return null;
        }
        return BLUETOOTH_PAIRING_PIN;
    }

    /* renamed from: b */
    public static bxvr m102688b() {
        return bipb.f121135a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f121142f;
    }

    public final String toString() {
        return Integer.toString(this.f121142f);
    }
}
