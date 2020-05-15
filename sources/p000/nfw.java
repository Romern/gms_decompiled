package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.beacon.BleSettings;

/* renamed from: nfw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nfw extends dcj implements nfy {
    public nfw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.beacon.internal.IBleService");
    }

    /* renamed from: a */
    public final void mo20576a(rnt rnt, nfv nfv) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        dcl.m8164a(bj, nfv);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo20577a(rnt rnt, nfv nfv, BleSettings bleSettings) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        dcl.m8164a(bj, nfv);
        dcl.m8165a(bj, bleSettings);
        mo8528b(1, bj);
    }

    /* renamed from: a */
    public final boolean mo20578a() {
        Parcel a = mo8526a(3, mo8529bj());
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }
}
