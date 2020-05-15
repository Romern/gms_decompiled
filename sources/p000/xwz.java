package p000;

import android.content.Context;
import com.google.android.gms.fido.u2f.api.StateUpdate;
import com.google.android.gms.fido.u2f.api.common.BrowserSignRequestParams;

@Deprecated
/* renamed from: xwz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xwz extends rjx {
    public xwz(Context context) {
        super(context, wzk.f51605a, (rjk) null, rjw.f43159a);
    }

    /* renamed from: a */
    public final aucb mo30206a(StateUpdate stateUpdate) {
        return mo24701a((rpa) new xwy(stateUpdate));
    }

    /* renamed from: a */
    public final aucb mo30207a(BrowserSignRequestParams browserSignRequestParams, xxm xxm) {
        return mo24701a((rpa) new xww(browserSignRequestParams, new xxe(xxm)));
    }
}
