package p000;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: gwr */
final /* synthetic */ class gwr implements gwu {

    /* renamed from: a */
    private final hwf f19130a;

    public gwr(hwf hwf) {
        this.f19130a = hwf;
    }

    /* renamed from: a */
    public final void mo12286a(Status status, Object obj) {
        hwf hwf = this.f19130a;
        Parcel bj = hwf.mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, (PendingIntent) obj);
        hwf.mo8530c(1, bj);
    }
}
