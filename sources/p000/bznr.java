package p000;

/* renamed from: bznr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bznr implements bxvp {
    CLUTTER_UNKNOWN(0),
    CLUTTER_OPEN(1),
    CLUTTER_BUILDING(2),
    CLUTTER_TREE(3),
    CLUTTER_EDGE(4),
    CLUTTER_CORNER(5);
    

    /* renamed from: g */
    public final int f170755g;

    private bznr(int i) {
        this.f170755g = i;
    }

    /* renamed from: a */
    public static bznr m125965a(int i) {
        if (i == 0) {
            return CLUTTER_UNKNOWN;
        }
        if (i == 1) {
            return CLUTTER_OPEN;
        }
        if (i == 2) {
            return CLUTTER_BUILDING;
        }
        if (i == 3) {
            return CLUTTER_TREE;
        }
        if (i == 4) {
            return CLUTTER_EDGE;
        }
        if (i != 5) {
            return null;
        }
        return CLUTTER_CORNER;
    }

    /* renamed from: b */
    public static bxvr m125966b() {
        return bznq.f170747a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f170755g;
    }

    public final String toString() {
        return Integer.toString(this.f170755g);
    }
}
