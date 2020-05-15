package p000;

/* renamed from: bygy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bygy {
    TRIVIAL_BIGTABLE,
    FOOTPRINTS,
    REGISTRATION,
    CHANNELID_NOT_SET;

    /* renamed from: a */
    public static bygy m124802a(int i) {
        if (i == 0) {
            return CHANNELID_NOT_SET;
        }
        if (i == 1) {
            return TRIVIAL_BIGTABLE;
        }
        if (i == 2) {
            return FOOTPRINTS;
        }
        if (i != 3) {
            return null;
        }
        return REGISTRATION;
    }
}
