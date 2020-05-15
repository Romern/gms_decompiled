package p000;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;

/* renamed from: arfz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arfz extends aaab {

    /* renamed from: a */
    public final argg f87627a;

    /* renamed from: b */
    public final arjf f87628b;

    /* renamed from: c */
    private final Handler f87629c;

    public arfz(arjf arjf, argg argg, Handler handler) {
        super(76, "GetPinOperation");
        this.f87627a = argg;
        this.f87628b = arjf;
        this.f87629c = handler;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f87629c.post(new arfy(this));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f87628b.mo48600a(status, (String) null);
    }
}
