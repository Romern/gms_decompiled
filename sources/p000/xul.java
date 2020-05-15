package p000;

import android.os.RemoteException;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.service.Fido2ChimeraService;

/* renamed from: xul */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xul implements xoo {

    /* renamed from: a */
    final /* synthetic */ xok f53166a;

    public xul(xok xok) {
        this.f53166a = xok;
    }

    /* renamed from: a */
    public final void mo14253a() {
        try {
            this.f53166a.mo29967a();
        } catch (RemoteException e) {
            Fido2ChimeraService.f31852a.mo25418e("RemoteException calling onDisableNfcReaderMode", new Object[0]);
        }
    }

    /* renamed from: b */
    public final void mo14262b() {
    }

    /* renamed from: a */
    public final void mo14259a(AuthenticatorErrorResponse authenticatorErrorResponse) {
        try {
            this.f53166a.mo29968a(authenticatorErrorResponse);
        } catch (RemoteException e) {
            Fido2ChimeraService.f31852a.mo25418e("RemoteException calling onFailure", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo14260a(PublicKeyCredential publicKeyCredential) {
        try {
            this.f53166a.mo29969a(publicKeyCredential);
        } catch (RemoteException e) {
            Fido2ChimeraService.f31852a.mo25418e("RemoteException calling onSuccess", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo14261a(String str) {
        try {
            this.f53166a.mo29970a(str);
        } catch (RemoteException e) {
            Fido2ChimeraService.f31852a.mo25418e("RemoteException calling onViewSelected", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo14257a(xhx xhx, int i) {
        try {
            this.f53166a.mo29971a(xhx, i);
        } catch (RemoteException e) {
            Fido2ChimeraService.f31852a.mo25418e("RemoteException calling onEnableNfcReaderMode", new Object[0]);
        }
    }
}
