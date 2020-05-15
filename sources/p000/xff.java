package p000;

import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.google.android.gms.fido.u2f.api.common.ResponseData;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import java.util.Arrays;

/* renamed from: xff */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xff extends xfd {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo12637b(Object obj) {
        ResponseData responseData = (ResponseData) obj;
        if (responseData instanceof ErrorResponseData) {
            xpf xpf = new xpf();
            xpf.mo30001a(ErrorCode.UNKNOWN_ERR);
            xpf.f52860a = String.format("Low level error 0x%s", Integer.toHexString(((ErrorResponseData) responseData).f31908a.f31907g));
            AuthenticatorErrorResponse a = xpf.mo30000a();
            xpw xpw = new xpw();
            xpw.f52903a = a;
            return xpw.mo30021a();
        }
        SignResponseData signResponseData = (SignResponseData) responseData;
        byte[] bArr = signResponseData.f31947c;
        byte b = bArr[0];
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 1, 5);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
        byte[] a2 = bqce.m112562a(signResponseData.f31948d, new byte[]{(byte) (b & 3)}, copyOfRange);
        xpb xpb = new xpb();
        xpb.mo29991d(copyOfRange2);
        xpb.mo29988a(a2);
        xpb.mo29989b(signResponseData.f31946b.getBytes(bmwy.f131158c));
        xpb.mo29990c(signResponseData.f31945a);
        AuthenticatorAssertionResponse a3 = xpb.mo29987a();
        xpw xpw2 = new xpw();
        xpw2.f52903a = a3;
        return xpw2.mo30021a();
    }
}
