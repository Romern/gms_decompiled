package p000;

/* renamed from: bsty */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bsty implements bxvp {
    PASSPHRASE_TYPE_UNSPECIFIED(0),
    IMPLICIT_PASSPHRASE(1),
    KEYSTORE_PASSPHRASE(2),
    FROZEN_IMPLICIT_PASSPHRASE(3),
    CUSTOM_PASSPHRASE(4),
    TRUSTED_VAULT_PASSPHRASE(5),
    UNRECOGNIZED(-1);
    

    /* renamed from: h */
    private final int f147085h;

    private bsty(int i) {
        this.f147085h = i;
    }

    /* renamed from: a */
    public static bsty m116191a(int i) {
        if (i == 0) {
            return PASSPHRASE_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return IMPLICIT_PASSPHRASE;
        }
        if (i == 2) {
            return KEYSTORE_PASSPHRASE;
        }
        if (i == 3) {
            return FROZEN_IMPLICIT_PASSPHRASE;
        }
        if (i == 4) {
            return CUSTOM_PASSPHRASE;
        }
        if (i != 5) {
            return null;
        }
        return TRUSTED_VAULT_PASSPHRASE;
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f147085h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
