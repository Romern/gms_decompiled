package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: twd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class twd extends aaab {

    /* renamed from: a */
    private final tvx f46748a;

    /* renamed from: b */
    private final tvo f46749b;

    public twd(tvx tvx, tvo tvo) {
        super(20, "GetDevFeaturesOp");
        this.f46748a = tvx;
        this.f46749b = tvo;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        DataHolder a = this.f46749b.mo26824a();
        try {
            this.f46748a.mo26831a(a);
        } finally {
            a.close();
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f46748a.mo26831a(DataHolder.m22539b(status.f30115i));
    }
}
