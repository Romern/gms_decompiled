package p000;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* renamed from: arcn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arcn extends aaab {

    /* renamed from: a */
    public final arit f87366a;

    /* renamed from: b */
    public final ardc f87367b;

    /* renamed from: c */
    private final Handler f87368c;

    public arcn(arit arit, ardc ardc, Handler handler) {
        super(75, "GetBootstrappableAccountsOperation");
        this.f87366a = arit;
        this.f87367b = ardc;
        this.f87368c = handler;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f87368c.post(new arcm(this));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f87366a.mo48575a(status, new ArrayList());
    }
}
