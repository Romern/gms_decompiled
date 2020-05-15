package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;

/* renamed from: xxe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xxe extends dck implements xxf {

    /* renamed from: a */
    final /* synthetic */ xxm f53326a;

    public xxe() {
        super("com.google.android.gms.fido.u2f.api.ISignResponseHandler");
    }

    /* renamed from: a */
    public final void mo30211a() {
        this.f53326a.mo14253a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xxe(xxm xxm) {
        super("com.google.android.gms.fido.u2f.api.ISignResponseHandler");
        this.f53326a = xxm;
    }

    /* renamed from: a */
    public final void mo30212a(ErrorResponseData errorResponseData) {
        this.f53326a.mo14254a(errorResponseData);
    }

    /* renamed from: a */
    public final void mo30213a(SignResponseData signResponseData) {
        this.f53326a.mo14255a(signResponseData);
    }

    /* renamed from: a */
    public final void mo30214a(String str) {
        this.f53326a.mo14256a(str);
    }

    /* renamed from: a */
    public final void mo30215a(xhx xhx, int i) {
        this.f53326a.mo14257a(xhx, i);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        xhx xhx;
        if (i == 1) {
            mo30214a(parcel.readString());
        } else if (i == 2) {
            mo30212a((ErrorResponseData) dcl.m8163a(parcel, ErrorResponseData.CREATOR));
        } else if (i == 3) {
            mo30213a((SignResponseData) dcl.m8163a(parcel, SignResponseData.CREATOR));
        } else if (i == 4) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.fido.common.nfc.INfcReaderCallback");
                xhx = queryLocalInterface instanceof xhx ? (xhx) queryLocalInterface : new xhv(readStrongBinder);
            } else {
                xhx = null;
            }
            mo30215a(xhx, parcel.readInt());
        } else if (i != 5) {
            return false;
        } else {
            mo30211a();
        }
        return true;
    }
}
