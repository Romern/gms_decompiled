package p000;

import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.auth.UserRecoverableAuthException;

/* renamed from: qrq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qrq {
    /* renamed from: a */
    public static int m32741a(int i) {
        if (i == 7) {
            return 513;
        }
        switch (i) {
            case 38500:
                return 1538;
            case 38501:
                return 257;
            default:
                return 1025;
        }
    }

    /* renamed from: b */
    public static int m32744b(int i) {
        if (i == 257) {
            return 101;
        }
        if (i == 258) {
            return 102;
        }
        if (i == 513) {
            return ErrorInfo.TYPE_SDU_MEMORY_FULL;
        }
        if (i == 769) {
            return ErrorInfo.TYPE_SDU_FAILED;
        }
        if (i == 1025) {
            return 108;
        }
        if (i != 1281) {
            return i != 1282 ? 1 : 106;
        }
        return 107;
    }

    /* renamed from: a */
    public static int m32742a(gid gid) {
        return (!(gid instanceof UserRecoverableAuthException) || !izj.BAD_AUTHENTICATION.f22000ac.equals(gid.getMessage())) ? 1281 : 1282;
    }

    /* renamed from: a */
    public static int m32743a(qqx qqx) {
        return !(qqx instanceof qra) ? 1025 : 769;
    }
}
