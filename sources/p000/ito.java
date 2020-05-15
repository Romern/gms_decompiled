package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: ito */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ito {
    /* renamed from: a */
    public static Status m16125a(ehh ehh) {
        String str;
        ehh ehh2 = ehh.NEW_ACTIVE_KEY_ENROLLED;
        switch (ehh.ordinal()) {
            case 0:
                return new Status(-25501);
            case 1:
                return new Status(-25502);
            case 2:
                return new Status(-25503);
            case 3:
            case 5:
            case 8:
            case 10:
            case 11:
            case 13:
                return new Status(-25504);
            case 4:
                return new Status(25501);
            case 6:
                return new Status(25502);
            case 7:
                return new Status(25504);
            case 9:
                return new Status(25503);
            case 12:
            default:
                String valueOf = String.valueOf(ehh.toString());
                if (valueOf.length() == 0) {
                    str = new String("Unexpected status ");
                } else {
                    str = "Unexpected status ".concat(valueOf);
                }
                throw new IllegalArgumentException(str);
            case 14:
                return new Status(-25505);
        }
    }
}
