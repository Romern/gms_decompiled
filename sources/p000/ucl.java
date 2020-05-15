package p000;

import android.content.Context;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.internal.CancelPendingActionsRequest;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* renamed from: ucl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ucl extends ucg {

    /* renamed from: f */
    final CancelPendingActionsRequest f47244f;

    public ucl(ubk ubk, CancelPendingActionsRequest cancelPendingActionsRequest, uto uto) {
        super("CancelPendingActionsOpe", ubk, uto, 32);
        this.f47244f = cancelPendingActionsRequest;
    }

    /* renamed from: a */
    public final Set mo27229a() {
        return EnumSet.of(twt.f46774c, twt.f46772a, twt.f46773b);
    }

    /* renamed from: b */
    public final void mo27230b(Context context) {
        aaal.m21020a(this.f47244f, "Invalid cancel pending actions operation no request");
        List list = this.f47244f.f30809a;
        aaal.m21020a(list, "CancelPendingActions with null tags.");
        ubk ubk = this.f47237a;
        uey j = ubk.mo27103j();
        AppIdentity a = ubk.mo27070a(j);
        uaj uaj = ubk.f47146g;
        uaj.mo27000a().mo27038a(a, j.f47394a, list);
        this.f47238b.mo27971a();
    }
}
