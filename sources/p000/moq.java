package p000;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: moq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class moq extends dcj implements mos {
    public moq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.backup.internal.IGmsRestoreService");
    }

    /* renamed from: a */
    public final void mo19621a(mop mop) {
        throw null;
    }

    /* renamed from: a */
    public final void mo19622a(mop mop, Account account) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, mop);
        dcl.m8165a(bj, account);
        mo8528b(3, bj);
    }

    /* renamed from: a */
    public final void mo19623a(rnt rnt, long j, String str) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        bj.writeLong(j);
        bj.writeString(str);
        mo8528b(2, bj);
    }
}
