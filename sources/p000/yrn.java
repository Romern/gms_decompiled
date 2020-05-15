package p000;

import android.content.Context;
import com.android.volley.Request;
import com.google.android.gms.common.internal.ClientContext;
import java.util.HashMap;

/* renamed from: yrn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class yrn extends sgv {
    public yrn(Context context, String str) {
        super(context, cdyo.f181926a.mo6606a().mo78473l(), str, false, true, cdyo.m135313b(), cdyo.f181926a.mo6606a().mo78466e());
    }

    /* renamed from: a */
    public final HashMap mo25519a(Context context, ClientContext clientContext) {
        HashMap a = super.mo25519a(context, clientContext);
        a.put("User-Agent", sic.m35342a(context, "Fitness"));
        a.put("X-Server-Token", cdyo.f181926a.mo6606a().mo78472k());
        return a;
    }

    /* renamed from: a */
    public final void mo25521a(int i) {
        this.f44447g = 3328;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9812a(Request request, String str) {
        bmxy.m108581a(str);
        request.setRetryPolicy(new sgu(this.f44453i, str, (int) cdyo.f181926a.mo6606a().mo78471j(), (int) cdyo.f181926a.mo6606a().mo78470i(), (float) cdyo.f181926a.mo6606a().mo78469h()));
    }
}
