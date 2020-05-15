package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;

/* renamed from: xoi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xoi extends dcj implements xok {
    public xoi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.fido2.api.IResponseHandler");
    }

    /* renamed from: a */
    public final void mo29967a() {
        mo8530c(5, mo8529bj());
    }

    /* renamed from: a */
    public final void mo29968a(AuthenticatorErrorResponse authenticatorErrorResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, authenticatorErrorResponse);
        mo8530c(2, bj);
    }

    /* renamed from: a */
    public final void mo29969a(PublicKeyCredential publicKeyCredential) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, publicKeyCredential);
        mo8530c(3, bj);
    }

    /* renamed from: a */
    public final void mo29970a(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        mo8530c(1, bj);
    }

    /* renamed from: a */
    public final void mo29971a(xhx xhx, int i) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, xhx);
        bj.writeInt(i);
        mo8530c(4, bj);
    }
}
