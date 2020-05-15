package p000;

/* renamed from: atgh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atgh {
    /* renamed from: a */
    public static int m75821a(bres bres) {
        brer brer = bres.f142689a;
        if (atgf.f90282d.equals(brer) || bret.MFI_UNKNOWN_CARD.equals(brer)) {
            return 15012;
        }
        return !bret.MFI_VERSION_ERROR.equals(brer) ? 8 : 15013;
    }

    /* renamed from: b */
    public static int m75822b(bres bres) {
        brer brer = bres.f142689a;
        if (atgf.f90284f.contains(bres.f142689a)) {
            return 101;
        }
        if (bret.NOT_IC_CHIP_FORMATTING.equals(brer) || bret.NOT_IC_CHIP_FORMATTING.equals(brer)) {
            return 115;
        }
        return !bret.MFI_VERSION_ERROR.equals(brer) ? 102 : 116;
    }
}
