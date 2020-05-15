package p000;

/* renamed from: bwxu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bwxu implements bxvp {
    NODE_STATE_UNKNOWN(0),
    NODE_STATE_DISABLED(1),
    NODE_STATE_FOCUSED(2),
    NODE_STATE_HOVER(4),
    NODE_STATE_TOUCHED(8),
    NODE_STATE_INVALID(16);
    

    /* renamed from: g */
    public final int f161420g;

    private bwxu(int i) {
        this.f161420g = i;
    }

    /* renamed from: a */
    public static bwxu m122413a(int i) {
        if (i == 0) {
            return NODE_STATE_UNKNOWN;
        }
        if (i == 1) {
            return NODE_STATE_DISABLED;
        }
        if (i == 2) {
            return NODE_STATE_FOCUSED;
        }
        if (i == 4) {
            return NODE_STATE_HOVER;
        }
        if (i == 8) {
            return NODE_STATE_TOUCHED;
        }
        if (i != 16) {
            return null;
        }
        return NODE_STATE_INVALID;
    }

    /* renamed from: b */
    public static bxvr m122414b() {
        return bwxt.f161412a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f161420g;
    }

    public final String toString() {
        return Integer.toString(this.f161420g);
    }
}
