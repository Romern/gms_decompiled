package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.common.api.Status;

/* renamed from: arqv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arqv extends aaab {

    /* renamed from: a */
    public final arrh f88138a;

    /* renamed from: b */
    public final ardc f88139b;

    /* renamed from: c */
    public final Bundle f88140c;

    /* renamed from: d */
    private final Handler f88141d;

    public arqv(arrh arrh, Bundle bundle, ardc ardc, Handler handler) {
        super(BaseMfiEventCallback.TYPE_INVALID_LINKAGE_DATA, "IsTransferInProgressOperation");
        this.f88138a = arrh;
        this.f88139b = ardc;
        this.f88140c = bundle;
        this.f88141d = handler;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f88141d.post(new arqu(this));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f88138a.mo48773a(status);
    }
}
