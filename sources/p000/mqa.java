package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: mqa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mqa extends dcj implements IInterface {
    public mqa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.backup.migrate.helper.IBooleanCallbacks");
    }

    /* renamed from: a */
    public final void mo20224a(boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8166a(bj, z);
        mo8530c(1, bj);
    }
}
