package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;

/* renamed from: xoj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xoj extends dck implements xok {

    /* renamed from: a */
    final /* synthetic */ xoo f52840a;

    public xoj() {
        super("com.google.android.gms.fido.fido2.api.IResponseHandler");
    }

    /* renamed from: a */
    public final void mo29967a() {
        this.f52840a.mo14253a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xoj(xoo xoo) {
        super("com.google.android.gms.fido.fido2.api.IResponseHandler");
        this.f52840a = xoo;
    }

    /* renamed from: a */
    public final void mo29968a(AuthenticatorErrorResponse authenticatorErrorResponse) {
        this.f52840a.mo14259a(authenticatorErrorResponse);
    }

    /* renamed from: a */
    public final void mo29969a(PublicKeyCredential publicKeyCredential) {
        this.f52840a.mo14260a(publicKeyCredential);
    }

    /* renamed from: a */
    public final void mo29970a(String str) {
        this.f52840a.mo14261a(str);
    }

    /* renamed from: a */
    public final void mo29971a(xhx xhx, int i) {
        this.f52840a.mo14257a(xhx, i);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        xhx xhx;
        switch (i) {
            case 1:
                mo29970a(parcel.readString());
                return true;
            case 2:
                mo29968a((AuthenticatorErrorResponse) dcl.m8163a(parcel, AuthenticatorErrorResponse.CREATOR));
                return true;
            case 3:
                mo29969a((PublicKeyCredential) dcl.m8163a(parcel, PublicKeyCredential.CREATOR));
                return true;
            case 4:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.fido.common.nfc.INfcReaderCallback");
                    xhx = queryLocalInterface instanceof xhx ? (xhx) queryLocalInterface : new xhv(readStrongBinder);
                } else {
                    xhx = null;
                }
                mo29971a(xhx, parcel.readInt());
                return true;
            case 5:
                mo29967a();
                return true;
            case 6:
                this.f52840a.mo14262b();
                return true;
            default:
                return false;
        }
    }
}
