package p000;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.internal.ConnectParams;

/* renamed from: arcf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arcf extends aaab {

    /* renamed from: a */
    public final ConnectParams f87346a;

    /* renamed from: b */
    public final ardc f87347b;

    /* renamed from: c */
    private final Handler f87348c;

    public arcf(ConnectParams connectParams, ardc ardc, Handler handler) {
        super(75, "Connect2Operation");
        this.f87346a = connectParams;
        this.f87347b = ardc;
        this.f87348c = handler;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f87348c.post(new arce(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        arit arit = this.f87346a.f108000a;
        if (arit != null) {
            arit.mo48577c(status);
        }
    }
}
