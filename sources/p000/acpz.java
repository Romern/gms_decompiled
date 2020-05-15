package p000;

import android.content.Context;
import com.android.volley.Request;

/* renamed from: acpz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acpz extends sgv {

    /* renamed from: j */
    public final String f60459j = ((String) abzt.f58996p.mo58455c());

    public acpz(Context context) {
        super(context, (String) abzt.f58996p.mo58455c(), (String) abzt.f58997q.mo58455c(), false, ((Boolean) abzt.f58999s.mo58455c()).booleanValue(), null, (String) abzt.f58998r.mo58455c());
        this.f44447g = 12800;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9812a(Request request, String str) {
        request.setRetryPolicy(new sgu(this.f44453i, str, ((Integer) abzt.f59000t.mo58455c()).intValue(), ((Integer) abzt.f59002v.mo58455c()).intValue(), ((Double) abzt.f59003w.mo58455c()).floatValue()));
    }
}
