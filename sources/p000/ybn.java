package p000;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.google.android.gms.fido.u2f.api.common.RegisterResponseData;

/* renamed from: ybn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ybn implements xxh {

    /* renamed from: a */
    final /* synthetic */ ybo f53553a;

    public ybn(ybo ybo) {
        this.f53553a = ybo;
    }

    /* renamed from: a */
    public final void mo14253a() {
        try {
            xxc xxc = this.f53553a.f53555d;
            xxc.mo8530c(5, xxc.mo8529bj());
        } catch (RemoteException e) {
            ybo.f53554a.mo25418e("RemoteException calling onDisableNfcReaderMode", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo14254a(ErrorResponseData errorResponseData) {
        try {
            xxc xxc = this.f53553a.f53555d;
            Parcel bj = xxc.mo8529bj();
            dcl.m8165a(bj, errorResponseData);
            xxc.mo8530c(2, bj);
        } catch (RemoteException e) {
            ybo.f53554a.mo25418e("RemoteException calling onFailure", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo30218a(RegisterResponseData registerResponseData) {
        try {
            xxc xxc = this.f53553a.f53555d;
            Parcel bj = xxc.mo8529bj();
            dcl.m8165a(bj, registerResponseData);
            xxc.mo8530c(3, bj);
        } catch (RemoteException e) {
            ybo.f53554a.mo25418e("RemoteException calling onSuccess", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo14256a(String str) {
        try {
            xxc xxc = this.f53553a.f53555d;
            Parcel bj = xxc.mo8529bj();
            bj.writeString(str);
            xxc.mo8530c(1, bj);
        } catch (RemoteException e) {
            ybo.f53554a.mo25418e("RemoteException calling onViewSelected", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo14257a(xhx xhx, int i) {
        try {
            xxc xxc = this.f53553a.f53555d;
            Parcel bj = xxc.mo8529bj();
            dcl.m8164a(bj, xhx);
            bj.writeInt(i);
            xxc.mo8530c(4, bj);
        } catch (RemoteException e) {
            ybo.f53554a.mo25418e("RemoteException calling onEnableNfcReaderMode", new Object[0]);
        }
    }
}
