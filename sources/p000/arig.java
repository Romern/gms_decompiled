package p000;

import android.app.PendingIntent;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import com.google.android.gms.smartdevice.d2d.AccountTransferResult;
import java.util.Arrays;
import java.util.List;

/* renamed from: arig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arig extends dck implements arik {

    /* renamed from: a */
    public final aqzp f87776a;

    /* renamed from: b */
    protected final Handler f87777b;

    public arig() {
        super("com.google.android.gms.smartdevice.d2d.internal.IDirectTransferListener");
    }

    /* renamed from: a */
    public final void mo48558a(int i, String str) {
        this.f87777b.sendMessage(this.f87777b.obtainMessage(2, i, 0, str));
    }

    /* renamed from: a */
    public final void mo48559a(PendingIntent pendingIntent) {
        Handler handler = this.f87777b;
        handler.sendMessage(handler.obtainMessage(1, pendingIntent));
    }

    public arig(Looper looper, aqzp aqzp) {
        super("com.google.android.gms.smartdevice.d2d.internal.IDirectTransferListener");
        sdo.m34959a(aqzp);
        this.f87776a = aqzp;
        this.f87777b = new aric(this, looper);
    }

    /* renamed from: a */
    public final void mo48560a(AccountTransferResult[] accountTransferResultArr) {
        List asList = Arrays.asList(accountTransferResultArr);
        Handler handler = this.f87777b;
        handler.sendMessage(handler.obtainMessage(0, asList));
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo48560a((AccountTransferResult[]) parcel.createTypedArray(AccountTransferResult.CREATOR));
        } else if (i == 2) {
            mo48559a((PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            mo48558a(parcel.readInt(), parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
