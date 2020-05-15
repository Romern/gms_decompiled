package p000;

import android.content.Context;
import android.os.Handler;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.common.api.Status;

/* renamed from: arrb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arrb extends aaab {

    /* renamed from: a */
    public final argg f88163a;

    /* renamed from: b */
    public final arrh f88164b;

    /* renamed from: c */
    private final Handler f88165c;

    public arrb(arrh arrh, argg argg, Handler handler) {
        super(BaseMfiEventCallback.TYPE_CARD_NOT_ACTIVE, "AbortDirectTransferOperation");
        this.f88163a = argg;
        this.f88164b = arrh;
        this.f88165c = handler;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f88165c.post(new arra(this));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f88164b.mo48773a(status);
    }
}
