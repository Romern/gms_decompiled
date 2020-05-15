package p000;

import android.content.Context;
import android.os.Handler;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.common.api.Status;

/* renamed from: arqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arqt extends aaab {

    /* renamed from: a */
    public final arrh f88134a;

    /* renamed from: b */
    public final ardc f88135b;

    /* renamed from: c */
    private final Handler f88136c;

    public arqt(arrh arrh, ardc ardc, Handler handler) {
        super(BaseMfiEventCallback.TYPE_INVALID_LINKAGE_DATA, "AbortDirectTransferOperation");
        this.f88134a = arrh;
        this.f88135b = ardc;
        this.f88136c = handler;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f88136c.post(new arqs(this));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f88134a.mo48773a(status);
    }
}
