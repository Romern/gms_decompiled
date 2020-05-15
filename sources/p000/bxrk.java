package p000;

/* renamed from: bxrk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bxrk implements bxvp {
    CONSENT_FLOW_LAYOUT_UNSPECIFIED(0),
    MATERIAL_DESIGN(1),
    GLIF(2),
    OPA_GLIF(3),
    BOTTOM_SHEET(4),
    GLIF_V2(5),
    OPA_GLIF_V2(6),
    MATERIAL_DESIGN_V2(7);
    

    /* renamed from: i */
    private final int f164569i;

    private bxrk(int i) {
        this.f164569i = i;
    }

    /* renamed from: a */
    public static bxrk m123035a(int i) {
        switch (i) {
            case 0:
                return CONSENT_FLOW_LAYOUT_UNSPECIFIED;
            case 1:
                return MATERIAL_DESIGN;
            case 2:
                return GLIF;
            case 3:
                return OPA_GLIF;
            case 4:
                return BOTTOM_SHEET;
            case 5:
                return GLIF_V2;
            case 6:
                return OPA_GLIF_V2;
            case 7:
                return MATERIAL_DESIGN_V2;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m123036b() {
        return bxrj.f164559a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f164569i;
    }

    public final String toString() {
        return Integer.toString(this.f164569i);
    }
}
