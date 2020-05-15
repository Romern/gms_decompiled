package p000;

import android.os.Parcel;

/* renamed from: ohx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ohx extends dck implements ohy {

    /* renamed from: a */
    final /* synthetic */ ofo f37687a;

    public ohx() {
        super("com.google.android.gms.car.senderprotocol.ICarGalMonitorProxy");
    }

    /* renamed from: a */
    public final void mo22175a(long j, int i) {
        this.f37687a.mo22103a(j, i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ohx(ofo ofo) {
        super("com.google.android.gms.car.senderprotocol.ICarGalMonitorProxy");
        this.f37687a = ofo;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo22175a(parcel.readLong(), parcel.readInt());
        parcel2.writeNoException();
        return true;
    }
}
