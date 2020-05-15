package p000;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: qfj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qfj extends dcj implements qfl {
    public qfj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.checkin.internal.ICheckinApiService");
    }

    /* renamed from: a */
    public final void mo23913a(qfi qfi) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, qfi);
        mo8528b(5, bj);
    }

    /* renamed from: a */
    public final void mo23915a(rnt rnt, Account account) {
        throw null;
    }

    /* renamed from: b */
    public final void mo23917b(rnt rnt) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        mo8528b(4, bj);
    }

    /* renamed from: b */
    public final void mo23918b(rnt rnt, Bundle bundle) {
        throw null;
    }

    /* renamed from: a */
    public final void mo23914a(rnt rnt) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        mo8528b(3, bj);
    }

    /* renamed from: a */
    public final void mo23916a(rnt rnt, Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        dcl.m8165a(bj, bundle);
        mo8528b(1, bj);
    }
}
