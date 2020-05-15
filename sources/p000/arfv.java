package p000;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: arfv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arfv extends aaab {

    /* renamed from: a */
    public final arjf f87619a;

    /* renamed from: b */
    private final aqzy f87620b;

    /* renamed from: c */
    private final Handler f87621c;

    public arfv(arjf arjf, aqzy aqzy, Handler handler) {
        super(76, "GetEsimActivationPayloadOperation");
        this.f87620b = aqzy;
        this.f87621c = handler;
        this.f87619a = arjf;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f87620b.mo48314a().mo50378a(new sty(this.f87621c), new arfu(this));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f87619a.mo48601a(status, (List) null);
    }
}
