package p000;

import com.google.android.gms.fido.u2f.api.common.ErrorCode;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;

/* renamed from: xfv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xfv extends Exception {

    /* renamed from: a */
    public final short f52149a;

    private xfv(short s, Throwable th) {
        super(th);
        this.f52149a = s;
    }

    /* renamed from: a */
    public static xfv m42834a(short s) {
        return m42835a(s, null);
    }

    /* renamed from: a */
    public static xfv m42835a(short s, Throwable th) {
        return new xfv(s, th);
    }

    /* renamed from: a */
    public final ErrorResponseData mo29712a() {
        String str;
        ErrorCode errorCode;
        short s = this.f52149a;
        if (s == 27264) {
            errorCode = ErrorCode.BAD_REQUEST;
            str = String.format("Low level error 0x%s", Integer.toHexString(this.f52149a));
        } else if (s != 27904) {
            errorCode = ErrorCode.OTHER_ERROR;
            str = String.format("Low level error 0x%s", Integer.toHexString(this.f52149a));
        } else {
            errorCode = ErrorCode.DEVICE_INELIGIBLE;
            str = "Device ineligible.";
        }
        return new ErrorResponseData(errorCode, str);
    }
}
