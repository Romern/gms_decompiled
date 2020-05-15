package p000;

import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.common.ErrorCode;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.google.android.gms.fido.u2f.api.common.RegisterResponseData;
import com.google.android.gms.fido.u2f.api.common.ResponseData;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;

/* renamed from: xzv */
final /* synthetic */ class xzv implements Runnable {

    /* renamed from: a */
    private final xzx f53491a;

    /* renamed from: b */
    private final ResponseData f53492b;

    public xzv(xzx xzx, ResponseData responseData) {
        this.f53491a = xzx;
        this.f53492b = responseData;
    }

    public final void run() {
        xzx xzx = this.f53491a;
        ResponseData responseData = this.f53492b;
        xzu xzu = xzx.f53494a;
        if ((responseData instanceof RegisterResponseData) || (responseData instanceof SignResponseData)) {
            ((xzt) xzu).f53477a.mo30061a(Transport.USB, responseData);
        } else if ((responseData instanceof ErrorResponseData) && ((ErrorResponseData) responseData).f31908a.equals(ErrorCode.BAD_REQUEST)) {
            ((xzt) xzu).f53477a.mo30061a(Transport.USB, responseData);
        }
    }
}
