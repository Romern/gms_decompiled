package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: aljr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aljr extends aaab {

    /* renamed from: a */
    final /* synthetic */ aljs f73574a;

    /* renamed from: b */
    private final alix f73575b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aljr(aljs aljs, String str, alix alix) {
        super(198, str);
        this.f73574a = aljs;
        this.f73575b = alix;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        aljs aljs = this.f73574a;
        if (aljs.f73576a == null) {
            aljs.f73576a = new alhw(context);
        }
        this.f73574a.f73576a.mo40355a();
        if (cfuc.m143051c()) {
            this.f73575b.mo40441a(new Status(37502));
        } else {
            this.f73575b.mo40441a(new Status(37501));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f73575b.mo40441a(new Status(8));
    }
}
