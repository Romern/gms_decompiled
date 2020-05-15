package p000;

/* renamed from: afrg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum afrg implements bxvp {
    UNKNOWN(0),
    PROFILE_FORCE_SYNC(1),
    PROFILE_UPDATE_PERSON_ME(2),
    PROFILE_UPDATE_PHOTO_ME(3);
    

    /* renamed from: e */
    public final int f64622e;

    private afrg(int i) {
        this.f64622e = i;
    }

    /* renamed from: a */
    public static afrg m53475a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return PROFILE_FORCE_SYNC;
        }
        if (i == 2) {
            return PROFILE_UPDATE_PERSON_ME;
        }
        if (i != 3) {
            return null;
        }
        return PROFILE_UPDATE_PHOTO_ME;
    }

    /* renamed from: b */
    public static bxvr m53476b() {
        return afrf.f64616a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f64622e;
    }

    public final String toString() {
        return Integer.toString(this.f64622e);
    }
}
