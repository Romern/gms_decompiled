package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;

/* renamed from: xxd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xxd extends dcj implements xxf {
    public xxd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.u2f.api.ISignResponseHandler");
    }

    /* renamed from: a */
    public final void mo30211a() {
        mo8530c(5, mo8529bj());
    }

    /* renamed from: a */
    public final void mo30212a(ErrorResponseData errorResponseData) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, errorResponseData);
        mo8530c(2, bj);
    }

    /* renamed from: a */
    public final void mo30213a(SignResponseData signResponseData) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, signResponseData);
        mo8530c(3, bj);
    }

    /* renamed from: a */
    public final void mo30214a(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        mo8530c(1, bj);
    }

    /* renamed from: a */
    public final void mo30215a(xhx xhx, int i) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, xhx);
        bj.writeInt(i);
        mo8530c(4, bj);
    }
}
