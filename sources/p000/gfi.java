package p000;

import android.os.Parcel;

/* renamed from: gfi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gfi extends dck implements gfj {

    /* renamed from: a */
    final /* synthetic */ rod f18079a;

    public gfi() {
        super("com.google.android.gms.audiomodem.internal.ITokenBroadcasterListener");
    }

    /* renamed from: a */
    public final void mo11765a(int i) {
        this.f18079a.mo24968a(new gcr());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gfi(rod rod) {
        super("com.google.android.gms.audiomodem.internal.ITokenBroadcasterListener");
        this.f18079a = rod;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo11765a(parcel.readInt());
        parcel2.writeNoException();
        return true;
    }
}
