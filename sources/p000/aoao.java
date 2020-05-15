package p000;

import android.content.Context;
import com.android.volley.Request;
import com.google.android.gms.common.internal.ClientContext;
import java.util.HashMap;

/* renamed from: aoao */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoao extends shj {
    public aoao(Context context, String str, String str2, boolean z, boolean z2, String str3, String str4) {
        super(context, str, str2, z, z2, str3, str4, 6400);
    }

    /* renamed from: a */
    public final HashMap mo25519a(Context context, ClientContext clientContext) {
        sib sib;
        Long l;
        String str;
        String str2;
        String str3;
        HashMap a = super.mo25519a(context, clientContext);
        synchronized (sib.class) {
            if (sib.f44524a == null) {
                sib.f44524a = new sib();
            }
            sib = sib.f44524a;
        }
        Context context2 = this.f44453i;
        String a2 = aoan.m65705a(context2.getPackageManager(), clientContext.f30215e);
        sif a3 = sif.m35346a();
        String str4 = clientContext.f30216f;
        synchronized (a3.f44533a) {
            l = (Long) a3.f44533a.get(str4);
        }
        a.put("X-Container-Url", a2);
        synchronized (sib) {
            if (sib.f44525b == null) {
                sib.f44525b = spn.m35866b(context2);
            }
            str = sib.f44525b;
        }
        a.put("X-Network-ID", str);
        if (l != null) {
            str2 = l.toString();
        } else {
            str2 = "none";
        }
        a.put("X-Auth-Time", str2);
        if (clientContext != null) {
            str3 = clientContext.mo17803b("application_name");
        } else {
            str3 = null;
        }
        anxk.m65496a();
        anxk.m65497a(a, str3, spn.m35891g(context), sre.m36081a(context.getResources()));
        a.put("User-Agent", sic.m35342a(context, "G+ SDK/1.0.1"));
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final sie mo25526a(ClientContext clientContext) {
        return new sie(clientContext, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9812a(Request request, String str) {
        request.setRetryPolicy(new sgu(this.f44453i, str, ansx.m65136a(request.getMethod(), request.getUrl()), 1, 1.0f));
    }
}
