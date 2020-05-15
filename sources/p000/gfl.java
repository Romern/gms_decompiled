package p000;

import android.os.Parcel;
import com.google.android.gms.audiomodem.DecodedToken;
import java.util.List;

/* renamed from: gfl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gfl extends dck implements gfm {

    /* renamed from: a */
    final /* synthetic */ rod f18080a;

    public gfl() {
        super("com.google.android.gms.audiomodem.internal.ITokenReceiverListener");
    }

    /* renamed from: a */
    public final void mo11766a(int i) {
        this.f18080a.mo24968a(new gco(i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gfl(rod rod) {
        super("com.google.android.gms.audiomodem.internal.ITokenReceiverListener");
        this.f18080a = rod;
    }

    /* renamed from: a */
    public final void mo11767a(List list) {
        this.f18080a.mo24968a(new gcn(list));
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo11767a(parcel.createTypedArrayList(DecodedToken.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo11766a(parcel.readInt());
        }
        parcel2.writeNoException();
        return true;
    }
}
