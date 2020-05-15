package p000;

import com.google.android.gms.wallet.shared.ApplicationParameters;

/* renamed from: awyd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awyd {
    /* renamed from: a */
    public static String m81488a(int i) {
        if (!(i == 0 || i == 2)) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                    break;
                default:
                    return (String) awif.f94432b.mo58455c();
            }
        }
        return (String) awif.f94431a.mo58455c();
    }

    /* renamed from: b */
    public static String m81490b(int i) {
        if (i == 0 || i == 2) {
            return "https://sandbox.google.com";
        }
        switch (i) {
            case 21:
                return "http://localhost:8081";
            case 22:
                return "http://localhost:8889";
            case 23:
                return (String) awjl.f94542d.mo58455c();
            default:
                return "https://wallet.google.com";
        }
    }

    /* renamed from: c */
    public static String m81491c(int i) {
        return (i == 0 || i == 2 || i == 21) ? "https://sandbox.google.com" : i != 22 ? "https://payments.google.com" : "http://localhost:8889";
    }

    /* renamed from: a */
    public static String m81489a(ApplicationParameters applicationParameters) {
        return m81488a(applicationParameters.f110406a);
    }
}
