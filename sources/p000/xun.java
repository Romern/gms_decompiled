package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.fido2.api.StateUpdate;
import java.util.UUID;

/* renamed from: xun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xun extends aaab {

    /* renamed from: a */
    private final xeq f53171a;

    /* renamed from: b */
    private final UUID f53172b;

    /* renamed from: c */
    private final rnt f53173c;

    /* renamed from: d */
    private final StateUpdate f53174d;

    public xun(xeq xeq, UUID uuid, rnt rnt, StateUpdate stateUpdate) {
        super(180, "HandleStatusUpdateZeroParty");
        this.f53171a = xeq;
        this.f53172b = uuid;
        this.f53173c = rnt;
        this.f53174d = stateUpdate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        if (!cdvt.m135136b()) {
            xob a = xob.m43233a(this.f53172b);
            if (a == null) {
                this.f53173c.mo11797a(new Status(10));
                return;
            }
            StateUpdate stateUpdate = this.f53174d;
            a.mo29750a(new com.google.android.gms.fido.u2f.api.StateUpdate(stateUpdate.mo18644a(), stateUpdate.f31695f));
            this.f53173c.mo11797a(Status.f30107a);
            return;
        }
        xeq xeq = this.f53171a;
        xeq.f52083f.mo25812a(new xel(xeq, this.f53174d));
        this.f53173c.mo11797a(Status.f30107a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f53173c.mo11797a(status);
    }
}
