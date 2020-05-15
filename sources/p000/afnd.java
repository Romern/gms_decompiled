package p000;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.mdh.LatestFootprintFilter;

/* renamed from: afnd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afnd extends dcj implements afnf {
    public afnd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.mdh.internal.IMobileDataHubListenerService");
    }

    /* renamed from: a */
    public final void mo32819a(rnt rnt, Account account, int i, int i2, afmu afmu) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        dcl.m8165a(bj, account);
        bj.writeInt(i);
        bj.writeInt(i2);
        dcl.m8164a(bj, afmu);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo32820a(rnt rnt, Account account, int i, int i2, afnj afnj) {
        throw null;
    }

    /* renamed from: a */
    public final void mo32822a(rnt rnt, Account account, int i, afmr afmr) {
        throw null;
    }

    /* renamed from: a */
    public final void mo32823a(rnt rnt, Account account, afmr afmr) {
        throw null;
    }

    /* renamed from: b */
    public final void mo32824b(rnt rnt, Account account, int i, int i2, afnj afnj) {
        throw null;
    }

    /* renamed from: a */
    public final void mo32821a(rnt rnt, Account account, int i, int i2, LatestFootprintFilter latestFootprintFilter, afmu afmu) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        dcl.m8165a(bj, account);
        bj.writeInt(i);
        bj.writeInt(i2);
        dcl.m8165a(bj, latestFootprintFilter);
        dcl.m8164a(bj, afmu);
        mo8528b(1, bj);
    }
}
