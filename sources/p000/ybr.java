package p000;

import android.os.RemoteException;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;

/* renamed from: ybr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ybr implements xxm {

    /* renamed from: a */
    final /* synthetic */ ybs f53564a;

    public ybr(ybs ybs) {
        this.f53564a = ybs;
    }

    /* renamed from: a */
    public final void mo14253a() {
        try {
            this.f53564a.f53566a.mo30211a();
        } catch (RemoteException e) {
            ybs.f53565d.mo25418e("RemoteException calling onDisableNfcReaderMode", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo14254a(ErrorResponseData errorResponseData) {
        try {
            this.f53564a.f53566a.mo30212a(errorResponseData);
        } catch (RemoteException e) {
            ybs.f53565d.mo25418e("RemoteException calling onFailure", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo14255a(SignResponseData signResponseData) {
        try {
            this.f53564a.f53566a.mo30213a(signResponseData);
        } catch (RemoteException e) {
            ybs.f53565d.mo25418e("RemoteException calling onSuccess", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo14256a(String str) {
        try {
            this.f53564a.f53566a.mo30214a(str);
        } catch (RemoteException e) {
            ybs.f53565d.mo25418e("RemoteException calling onViewSelected", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo14257a(xhx xhx, int i) {
        try {
            this.f53564a.f53566a.mo30215a(xhx, i);
        } catch (RemoteException e) {
            ybs.f53565d.mo25418e("RemoteException calling onEnableNfcReaderMode", new Object[0]);
        }
    }
}
