package p000;

/* renamed from: bmbi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bmbi implements bxvp {
    UNKNOWN_ADDRESS_AUTOCOMPLETE_OPTION(0),
    DEVICE_CONTACTS(1),
    EXISTING_PAYMENTS_PROFILE(2),
    GOOGLE_PLACES_API(3),
    GMSCORE_PLACES_API(4),
    ORCHESTRATION_ADDRESS_API(5);
    

    /* renamed from: g */
    private final int f128543g;

    private bmbi(int i) {
        this.f128543g = i;
    }

    /* renamed from: a */
    public static bmbi m107863a(int i) {
        if (i == 0) {
            return UNKNOWN_ADDRESS_AUTOCOMPLETE_OPTION;
        }
        if (i == 1) {
            return DEVICE_CONTACTS;
        }
        if (i == 2) {
            return EXISTING_PAYMENTS_PROFILE;
        }
        if (i == 3) {
            return GOOGLE_PLACES_API;
        }
        if (i == 4) {
            return GMSCORE_PLACES_API;
        }
        if (i != 5) {
            return null;
        }
        return ORCHESTRATION_ADDRESS_API;
    }

    /* renamed from: b */
    public static bxvr m107864b() {
        return bmbh.f128535a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f128543g;
    }

    public final String toString() {
        return Integer.toString(this.f128543g);
    }
}
