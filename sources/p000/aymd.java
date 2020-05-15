package p000;

/* renamed from: aymd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum aymd implements bxvp {
    BUILD_TYPE_UNKNOWN(0),
    BUILD_TYPE_PROD(1),
    BUILD_TYPE_INTERNAL(2),
    BUILD_TYPE_PRODLMP(3),
    BUILD_TYPE_THINGS(4),
    BUILD_TYPE_PRODMNC(5),
    BUILD_TYPE_WEARABLE(6),
    BUILD_TYPE_AUTO(7),
    BUILD_TYPE_ATV(9),
    BUILD_TYPE_PRODPIX(10),
    BUILD_TYPE_PRODPI(11),
    BUILD_TYPE_PRODGO(12),
    BUILD_TYPE_PRODQT(13),
    BUILD_TYPE_PRODNEXT(15),
    BUILD_TYPE_PRODRVC(16);
    

    /* renamed from: p */
    public final int f97966p;

    private aymd(int i) {
        this.f97966p = i;
    }

    /* renamed from: a */
    public static aymd m84246a(int i) {
        switch (i) {
            case 0:
                return BUILD_TYPE_UNKNOWN;
            case 1:
                return BUILD_TYPE_PROD;
            case 2:
                return BUILD_TYPE_INTERNAL;
            case 3:
                return BUILD_TYPE_PRODLMP;
            case 4:
                return BUILD_TYPE_THINGS;
            case 5:
                return BUILD_TYPE_PRODMNC;
            case 6:
                return BUILD_TYPE_WEARABLE;
            case 7:
                return BUILD_TYPE_AUTO;
            case 8:
            case 14:
            default:
                return null;
            case 9:
                return BUILD_TYPE_ATV;
            case 10:
                return BUILD_TYPE_PRODPIX;
            case 11:
                return BUILD_TYPE_PRODPI;
            case 12:
                return BUILD_TYPE_PRODGO;
            case 13:
                return BUILD_TYPE_PRODQT;
            case 15:
                return BUILD_TYPE_PRODNEXT;
            case 16:
                return BUILD_TYPE_PRODRVC;
        }
    }

    /* renamed from: b */
    public static bxvr m84247b() {
        return aymc.f97949a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f97966p;
    }

    public final String toString() {
        return Integer.toString(this.f97966p);
    }
}
