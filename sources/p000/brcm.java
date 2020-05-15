package p000;

/* renamed from: brcm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum brcm implements bxvp {
    UNKNOWN_FAMILY_ROLE(0),
    HEAD_OF_HOUSEHOLD(1),
    PARENT(2),
    MEMBER(3),
    CHILD(4),
    UNCONFIRMED_MEMBER(5);
    

    /* renamed from: g */
    public final int f142395g;

    private brcm(int i) {
        this.f142395g = i;
    }

    /* renamed from: a */
    public static brcm m113875a(int i) {
        if (i == 0) {
            return UNKNOWN_FAMILY_ROLE;
        }
        if (i == 1) {
            return HEAD_OF_HOUSEHOLD;
        }
        if (i == 2) {
            return PARENT;
        }
        if (i == 3) {
            return MEMBER;
        }
        if (i == 4) {
            return CHILD;
        }
        if (i != 5) {
            return null;
        }
        return UNCONFIRMED_MEMBER;
    }

    /* renamed from: b */
    public static bxvr m113876b() {
        return brcl.f142387a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f142395g;
    }

    public final String toString() {
        return Integer.toString(this.f142395g);
    }
}
