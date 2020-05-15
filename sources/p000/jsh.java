package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: jsh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jsh extends dcj implements jsj {
    public jsh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.proximity.internal.IGetSyncedDevicesCallback");
    }

    /* renamed from: a */
    public final void mo13961a(Status status, List list) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeTypedList(list);
        mo8530c(1, bj);
    }
}
