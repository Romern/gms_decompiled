package p000;

import android.os.Parcel;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.api.Status;

/* renamed from: hff */
final /* synthetic */ class hff {

    /* renamed from: a */
    private final hwq f19646a;

    public hff(hwq hwq) {
        this.f19646a = hwq;
    }

    /* renamed from: a */
    public final void mo12449a(Status status, Object obj) {
        hwq hwq = this.f19646a;
        Parcel bj = hwq.mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, (SavePasswordResult) obj);
        hwq.mo8530c(1, bj);
    }
}
