package p000;

import android.os.RemoteException;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;

/* renamed from: xuu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xuu implements xoo {

    /* renamed from: a */
    final /* synthetic */ xuv f53188a;

    public xuu(xuv xuv) {
        this.f53188a = xuv;
    }

    /* renamed from: a */
    public final void mo14253a() {
        try {
            this.f53188a.f53190a.mo29967a();
        } catch (RemoteException e) {
            xuv.f53189b.mo25418e("RemoteException calling onDisableNfcReaderMode", new Object[0]);
        }
    }

    /* renamed from: b */
    public final void mo14262b() {
    }

    /* renamed from: a */
    public final void mo14259a(AuthenticatorErrorResponse authenticatorErrorResponse) {
        try {
            this.f53188a.f53190a.mo29968a(authenticatorErrorResponse);
        } catch (RemoteException e) {
            xuv.f53189b.mo25418e("RemoteException calling onFailure", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo14260a(PublicKeyCredential publicKeyCredential) {
        try {
            this.f53188a.f53190a.mo29969a(publicKeyCredential);
        } catch (RemoteException e) {
            xuv.f53189b.mo25418e("RemoteException calling onSuccess", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo14261a(String str) {
        try {
            this.f53188a.f53190a.mo29970a(str);
        } catch (RemoteException e) {
            xuv.f53189b.mo25418e("RemoteException calling onViewSelected", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo14257a(xhx xhx, int i) {
        try {
            this.f53188a.f53190a.mo29971a(xhx, i);
        } catch (RemoteException e) {
            xuv.f53189b.mo25418e("RemoteException calling onEnableNfcReaderMode", new Object[0]);
        }
    }
}
