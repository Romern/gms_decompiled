package p000;

import android.os.Parcel;

/* renamed from: ahdl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahdl extends dck implements ahdm {

    /* renamed from: a */
    private final arbg f67055a;

    public ahdl() {
        super("com.google.android.gms.nearby.bootstrap.internal.IDataListener");
    }

    /* renamed from: a */
    public final void mo36349a(byte[] bArr) {
        arbg arbg = this.f67055a;
        arbg.f87272a.f87277c.post(new arbe(arbg, bArr));
    }

    public ahdl(arbg arbg) {
        super("com.google.android.gms.nearby.bootstrap.internal.IDataListener");
        this.f67055a = arbg;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo36349a(parcel.createByteArray());
        } else if (i != 2) {
            return false;
        } else {
            int readInt = parcel.readInt();
            arbg arbg = this.f67055a;
            arbg.f87272a.f87277c.post(new arbf(arbg, readInt));
        }
        return true;
    }
}
