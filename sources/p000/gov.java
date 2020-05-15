package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: gov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gov extends dcj implements gox {
    public gov(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IGetAccountsCallback");
    }

    /* renamed from: a */
    public final void mo12117a(Status status, List list) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeTypedList(list);
        mo8530c(2, bj);
    }
}
