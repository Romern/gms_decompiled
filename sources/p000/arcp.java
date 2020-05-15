package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.api.Status;

/* renamed from: arcp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arcp extends aaab {

    /* renamed from: a */
    public final arit f87370a;

    /* renamed from: b */
    public final ardc f87371b;

    /* renamed from: c */
    public final Bundle f87372c;

    /* renamed from: d */
    private final Handler f87373d;

    public arcp(arit arit, Bundle bundle, ardc ardc, Handler handler) {
        super(75, "IsTransferInProgressOperation");
        this.f87370a = arit;
        this.f87371b = ardc;
        this.f87372c = bundle;
        this.f87373d = handler;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f87373d.post(new arco(this));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f87370a.mo48585k(status);
    }
}
