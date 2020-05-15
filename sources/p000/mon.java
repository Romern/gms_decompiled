package p000;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* renamed from: mon */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mon extends dcj implements mop {
    public mon(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.backup.internal.IGmsRestoreCallback");
    }

    /* renamed from: a */
    public final void mo20219a(List list) {
        Parcel bj = mo8529bj();
        bj.writeTypedList(list);
        mo8530c(1, bj);
    }
}
