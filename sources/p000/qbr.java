package p000;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;

/* renamed from: qbr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qbr extends qbo {

    /* renamed from: c */
    private final int f40902c;

    public qbr(int i, qbn qbn, qbx qbx) {
        super("IsMirroringOperation", qbn, qbx);
        this.f40902c = i;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        try {
            CastDevice a = this.f40899a.mo23873a();
            if (a == null) {
                this.f40900b.mo23898c();
            } else if (this.f40902c >= 6000000) {
                qbx qbx = this.f40900b;
                Parcel bj = qbx.mo8529bj();
                dcl.m8165a(bj, a);
                qbx.mo8530c(4, bj);
            } else {
                this.f40900b.mo23896a();
            }
        } catch (RemoteException e) {
        }
    }
}
