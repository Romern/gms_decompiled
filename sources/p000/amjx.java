package p000;

/* renamed from: amjx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum amjx implements bxvp {
    UNKNOWN(0),
    ONLY_EXIST_IN_SERVER(1),
    ONLY_EXIST_IN_LOCAL(2),
    DATA1(3),
    DATA2(4),
    DATA3(5),
    DATA4(6),
    DATA5(7),
    DATA6(8),
    DATA7(9),
    DATA8(10),
    DATA9(11),
    DATA10(12),
    DATA11(13),
    DATA12(14),
    DATA13(15),
    DATA14(16),
    DATA15(17),
    IS_PRIMARY(18),
    GROUP_SOURCE_ID(19),
    SYNC1(20),
    SYNC2(21),
    SYNC3(22);
    

    /* renamed from: x */
    public final int f75042x;

    private amjx(int i) {
        this.f75042x = i;
    }

    /* renamed from: a */
    public static amjx m62988a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return ONLY_EXIST_IN_SERVER;
            case 2:
                return ONLY_EXIST_IN_LOCAL;
            case 3:
                return DATA1;
            case 4:
                return DATA2;
            case 5:
                return DATA3;
            case 6:
                return DATA4;
            case 7:
                return DATA5;
            case 8:
                return DATA6;
            case 9:
                return DATA7;
            case 10:
                return DATA8;
            case 11:
                return DATA9;
            case 12:
                return DATA10;
            case 13:
                return DATA11;
            case 14:
                return DATA12;
            case 15:
                return DATA13;
            case 16:
                return DATA14;
            case 17:
                return DATA15;
            case 18:
                return IS_PRIMARY;
            case 19:
                return GROUP_SOURCE_ID;
            case 20:
                return SYNC1;
            case 21:
                return SYNC2;
            case 22:
                return SYNC3;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m62989b() {
        return amjw.f75017a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f75042x;
    }

    public final String toString() {
        return Integer.toString(this.f75042x);
    }
}
