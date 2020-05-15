package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.backup.BackUpNowConfig;

/* renamed from: mog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mog extends dcj implements moi {
    public mog(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.backup.internal.IBackUpNowService");
    }

    /* renamed from: a */
    public final void mo20215a(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        mo8528b(4, bj);
    }

    /* renamed from: a */
    public final void mo20216a(String str, lud lud) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        dcl.m8164a(bj, lud);
        mo8528b(1, bj);
    }

    /* renamed from: a */
    public final void mo20217a(mof mof, BackUpNowConfig backUpNowConfig) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, mof);
        dcl.m8165a(bj, backUpNowConfig);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final boolean mo20218a() {
        Parcel a = mo8526a(3, mo8529bj());
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }
}
