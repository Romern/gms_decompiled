package p000;

/* renamed from: bwmu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bwmu implements bxvp {
    BOTTOM_SHEET_POSITION_STATE_UNKNOWN(0),
    BOTTOM_SHEET_POSITION_STATE_COLLAPSED(1),
    BOTTOM_SHEET_POSITION_STATE_PARTIALLY_EXPANDED(2),
    BOTTOM_SHEET_POSITION_STATE_EXPANDED(3),
    BOTTOM_SHEET_POSITION_STATE_HIDDEN(4);
    

    /* renamed from: f */
    public final int f160321f;

    private bwmu(int i) {
        this.f160321f = i;
    }

    /* renamed from: a */
    public static bwmu m122115a(int i) {
        if (i == 0) {
            return BOTTOM_SHEET_POSITION_STATE_UNKNOWN;
        }
        if (i == 1) {
            return BOTTOM_SHEET_POSITION_STATE_COLLAPSED;
        }
        if (i == 2) {
            return BOTTOM_SHEET_POSITION_STATE_PARTIALLY_EXPANDED;
        }
        if (i == 3) {
            return BOTTOM_SHEET_POSITION_STATE_EXPANDED;
        }
        if (i != 4) {
            return null;
        }
        return BOTTOM_SHEET_POSITION_STATE_HIDDEN;
    }

    /* renamed from: b */
    public static bxvr m122116b() {
        return bwmt.f160314a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f160321f;
    }

    public final String toString() {
        return Integer.toString(this.f160321f);
    }
}
