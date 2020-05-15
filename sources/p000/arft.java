package p000;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.AdvertisingInfo;

/* renamed from: arft */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arft extends aaab {

    /* renamed from: a */
    public final argg f87615a;

    /* renamed from: b */
    public final arjf f87616b;

    /* renamed from: c */
    private final Handler f87617c;

    public arft(arjf arjf, argg argg, Handler handler) {
        super(76, "GetAdvertisingInfoOperation");
        this.f87615a = argg;
        this.f87616b = arjf;
        this.f87617c = handler;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f87617c.post(new arfs(this));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f87616b.mo48598a(status, new AdvertisingInfo(null, "", null, null));
    }
}
