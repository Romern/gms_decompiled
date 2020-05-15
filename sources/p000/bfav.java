package p000;

/* renamed from: bfav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bfav {
    UNKNOWN,
    GPS_L1,
    GPS_L5,
    GAL_E1,
    GAL_E5,
    GLO_G1,
    BDS_B1,
    BDS_B2,
    QZS_J1,
    QZS_J5;

    /* renamed from: a */
    public static int m96290a(bfav bfav) {
        switch (bfav.ordinal()) {
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            default:
                return 1;
        }
    }

    /* renamed from: a */
    public static bfav m96291a(int i, double d) {
        if (i == 1) {
            bnoa bnoa = bfao.f113252b;
            Double valueOf = Double.valueOf(d);
            if (bnoa.mo6527a(valueOf)) {
                return GPS_L5;
            }
            if (bfao.f113251a.mo6527a(valueOf) || d == 0.0d) {
                return GPS_L1;
            }
        } else if (i != 3) {
            if (i == 4) {
                bnoa bnoa2 = bfap.f113254b;
                Double valueOf2 = Double.valueOf(d);
                if (bnoa2.mo6527a(valueOf2)) {
                    return QZS_J5;
                }
                if (bfap.f113253a.mo6527a(valueOf2) || d == 0.0d) {
                    return QZS_J1;
                }
            } else if (i == 5) {
                bnoa bnoa3 = bfal.f113247b;
                Double valueOf3 = Double.valueOf(d);
                if (bnoa3.mo6527a(valueOf3)) {
                    return BDS_B2;
                }
                if (bfal.f113246a.mo6527a(valueOf3) || d == 0.0d) {
                    return BDS_B1;
                }
            } else if (i == 6) {
                bnoa bnoa4 = bfam.f113249b;
                Double valueOf4 = Double.valueOf(d);
                if (bnoa4.mo6527a(valueOf4)) {
                    return GAL_E5;
                }
                if (bfam.f113248a.mo6527a(valueOf4) || d == 0.0d) {
                    return GAL_E1;
                }
            }
        } else if (bfan.f113250a.mo6527a(Double.valueOf(d)) || d == 0.0d) {
            return GLO_G1;
        }
        return UNKNOWN;
    }
}
