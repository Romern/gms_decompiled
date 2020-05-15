package p000;

/* renamed from: cadt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum cadt implements bxvp {
    UNKNOWN_CONNECTIVITY(0),
    WIFI_CONNECTIVITY(1),
    BT_CONNECTIVITY(2),
    CELL_CONNECTIVITY(3);
    

    /* renamed from: e */
    private final int f172732e;

    private cadt(int i) {
        this.f172732e = i;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f172732e;
    }

    public final String toString() {
        return Integer.toString(this.f172732e);
    }
}
