package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: twe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class twe extends aaab {

    /* renamed from: a */
    private final tvx f46750a;

    /* renamed from: b */
    private final tvo f46751b;

    /* renamed from: c */
    private final String[] f46752c;

    public twe(tvx tvx, tvo tvo, String[] strArr) {
        super(20, "UpdateDevFeaturesOp");
        this.f46750a = tvx;
        this.f46751b = tvo;
        this.f46752c = strArr;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f46750a.mo26830a(this.f46751b.mo26823a(this.f46752c));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f46750a.mo26830a(status.f30115i);
    }
}
