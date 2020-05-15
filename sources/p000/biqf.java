package p000;

/* renamed from: biqf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum biqf implements bxvp {
    EV_CONNECTOR_TYPE_UNKNOWN(0),
    EV_CONNECTOR_TYPE_J1772(1),
    EV_CONNECTOR_TYPE_MENNEKES(2),
    EV_CONNECTOR_TYPE_CHADEMO(3),
    EV_CONNECTOR_TYPE_COMBO_1(4),
    EV_CONNECTOR_TYPE_COMBO_2(5),
    EV_CONNECTOR_TYPE_TESLA_ROADSTER(6),
    EV_CONNECTOR_TYPE_TESLA_HPWC(7),
    EV_CONNECTOR_TYPE_TESLA_SUPERCHARGER(8),
    EV_CONNECTOR_TYPE_GBT(9),
    EV_CONNECTOR_TYPE_OTHER(101);
    

    /* renamed from: l */
    private final int f121273l;

    private biqf(int i) {
        this.f121273l = i;
    }

    /* renamed from: a */
    public static biqf m102720a(int i) {
        if (i == 101) {
            return EV_CONNECTOR_TYPE_OTHER;
        }
        switch (i) {
            case 0:
                return EV_CONNECTOR_TYPE_UNKNOWN;
            case 1:
                return EV_CONNECTOR_TYPE_J1772;
            case 2:
                return EV_CONNECTOR_TYPE_MENNEKES;
            case 3:
                return EV_CONNECTOR_TYPE_CHADEMO;
            case 4:
                return EV_CONNECTOR_TYPE_COMBO_1;
            case 5:
                return EV_CONNECTOR_TYPE_COMBO_2;
            case 6:
                return EV_CONNECTOR_TYPE_TESLA_ROADSTER;
            case 7:
                return EV_CONNECTOR_TYPE_TESLA_HPWC;
            case 8:
                return EV_CONNECTOR_TYPE_TESLA_SUPERCHARGER;
            case 9:
                return EV_CONNECTOR_TYPE_GBT;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m102721b() {
        return biqe.f121260a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f121273l;
    }

    public final String toString() {
        return Integer.toString(this.f121273l);
    }
}
