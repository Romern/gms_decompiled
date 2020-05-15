package p000;

/* renamed from: bucq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bucq implements bxvp {
    UNKNOWN_MODEL(0),
    TREE_BAGGING(1),
    DNN_V1(2),
    DNN_GRU_V1(3),
    DNN_V2(4),
    CNN_GRU_V1(5);
    

    /* renamed from: g */
    public final int f153402g;

    private bucq(int i) {
        this.f153402g = i;
    }

    /* renamed from: a */
    public static bucq m119332a(int i) {
        if (i == 0) {
            return UNKNOWN_MODEL;
        }
        if (i == 1) {
            return TREE_BAGGING;
        }
        if (i == 2) {
            return DNN_V1;
        }
        if (i == 3) {
            return DNN_GRU_V1;
        }
        if (i == 4) {
            return DNN_V2;
        }
        if (i != 5) {
            return null;
        }
        return CNN_GRU_V1;
    }

    /* renamed from: b */
    public static bxvr m119333b() {
        return bucp.f153394a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f153402g;
    }

    public final String toString() {
        return Integer.toString(this.f153402g);
    }
}
