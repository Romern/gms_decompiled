package p000;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.fido.fido2.api.StateUpdate;
import java.util.UUID;

/* renamed from: xnw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xnw extends rjx {

    /* renamed from: b */
    private static final rjo f52811b = new rjo("Fido.FIDO2_ZERO_PARTY_API", new xso(), f52812c);

    /* renamed from: c */
    private static final rje f52812c = new rje();

    /* renamed from: a */
    public final UUID f52813a = UUID.randomUUID();

    public xnw(Context context) {
        super(context, f52811b, (rjk) null, new rky());
    }

    /* renamed from: a */
    public final void mo29958a(StateUpdate stateUpdate) {
        roz b = rpa.m34196b();
        b.f43472a = new xnr(this, stateUpdate);
        b.f43473b = new Feature[]{wzj.f51603d, wzj.f51602c};
        mo24701a(b.mo24977a());
    }
}
