package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.u2f.api.StateUpdate;

/* renamed from: ybt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ybt extends sji {

    /* renamed from: a */
    private final rnt f53571a;

    /* renamed from: d */
    private final StateUpdate f53572d;

    public ybt(rnt rnt, StateUpdate stateUpdate) {
        super(119, "TransactionUpdateZeroParty");
        this.f53571a = rnt;
        this.f53572d = stateUpdate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11356a(Context context) {
        xws xws;
        if (cdwo.f181843a.mo6606a().mo78399c()) {
            xws = xwr.m43574a(context);
        } else {
            xws = null;
        }
        xxb a = xxb.m43593a(xws);
        StateUpdate stateUpdate = this.f53572d;
        sek sek = xxb.f53322c;
        String valueOf = String.valueOf(stateUpdate.f31875e);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("updateTransaction is called for ");
        sb.append(valueOf);
        sek.mo25414c(sb.toString(), new Object[0]);
        if (a.f53325b) {
            a.f53324a.mo29750a(stateUpdate);
            if (stateUpdate.equals(StateUpdate.f31874d)) {
                a.f53325b = false;
            }
        } else {
            xxb.f53322c.mo25418e("updateTransaction must be called during either registration or signtransaction!", new Object[0]);
        }
        this.f53571a.mo11797a(Status.f30107a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11357a(Status status) {
        this.f53571a.mo11797a(status);
    }
}
