package p000;

/* renamed from: abuy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum abuy implements bxvp {
    GENERAL_USE(0),
    SEARCHED_USE(1),
    GLOBAL_SEARCH_USE(2),
    USAGE_ENDED_USE(3),
    CONTEXT_ONLY_USE(4),
    FIREBASE_USER_ACTIONS_USE(5);
    

    /* renamed from: g */
    public final int f58502g;

    private abuy(int i) {
        this.f58502g = i;
    }

    /* renamed from: a */
    public static abuy m48299a(int i) {
        if (i == 0) {
            return GENERAL_USE;
        }
        if (i == 1) {
            return SEARCHED_USE;
        }
        if (i == 2) {
            return GLOBAL_SEARCH_USE;
        }
        if (i == 3) {
            return USAGE_ENDED_USE;
        }
        if (i == 4) {
            return CONTEXT_ONLY_USE;
        }
        if (i != 5) {
            return null;
        }
        return FIREBASE_USER_ACTIONS_USE;
    }

    /* renamed from: b */
    public static bxvr m48300b() {
        return abux.f58494a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f58502g;
    }

    public final String toString() {
        return Integer.toString(this.f58502g);
    }
}
