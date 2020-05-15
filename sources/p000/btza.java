package p000;

/* renamed from: btza */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum btza implements bxvp {
    UNKNOWN_NON_UI_CONTEXT(0),
    DRIVING_MODE_GEARHEAD_SETTING_COPIER(1),
    DRIVING_MODE_DND_SETTING_COPIER(2),
    DRIVING_MODE_LOCATION(3);
    

    /* renamed from: e */
    public final int f153048e;

    private btza(int i) {
        this.f153048e = i;
    }

    /* renamed from: a */
    public static btza m119029a(int i) {
        if (i == 0) {
            return UNKNOWN_NON_UI_CONTEXT;
        }
        if (i == 1) {
            return DRIVING_MODE_GEARHEAD_SETTING_COPIER;
        }
        if (i == 2) {
            return DRIVING_MODE_DND_SETTING_COPIER;
        }
        if (i != 3) {
            return null;
        }
        return DRIVING_MODE_LOCATION;
    }

    /* renamed from: b */
    public static bxvr m119030b() {
        return btyz.f153042a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f153048e;
    }

    public final String toString() {
        return Integer.toString(this.f153048e);
    }
}
