package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: afjk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afjk extends dcj implements afjm {
    public afjk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.mdd.IMddFileGroupWithDownloadStatusCallback");
    }

    /* renamed from: a */
    public final void mo34904a(Status status, List list) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeTypedList(list);
        mo8530c(1, bj);
    }
}
