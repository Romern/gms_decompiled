package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.lso.RevokeToken;
import java.util.Formatter;

/* renamed from: aobe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aobe extends aoba {

    /* renamed from: a */
    private final ClientContext f78064a;

    /* renamed from: b */
    private final String f78065b;

    /* renamed from: c */
    private final String f78066c;

    /* renamed from: d */
    private final boolean f78067d;

    /* renamed from: e */
    private final antn f78068e;

    public aobe(ClientContext clientContext, String str, String str2, boolean z, antn antn) {
        this.f78064a = clientContext;
        this.f78065b = str;
        this.f78066c = str2;
        this.f78067d = z;
        this.f78068e = antn;
    }

    /* renamed from: a */
    public final void mo42520a(Context context, anru anru) {
        try {
            ClientContext clientContext = this.f78064a;
            String str = this.f78065b;
            String str2 = this.f78066c;
            boolean z = this.f78067d;
            if (str == null) {
                ansg ansg = anru.f77552c;
                if (z) {
                    ansg.f77581e.mo42554a(clientContext, str2);
                }
                aodk aodk = ansg.f77579c;
                StringBuilder sb = new StringBuilder();
                new Formatter(sb).format("applications/%1$s/disconnect", shd.m35267a(str2));
                aodk.f78221a.mo25539a(clientContext, 1, sb.toString(), null);
            } else {
                anrx anrx = anru.f77555f;
                if (z) {
                    anrx.f77559a.mo42554a(clientContext, str2);
                }
                seq seq = anrx.f77561c;
                StringBuilder sb2 = new StringBuilder("RevokeToken");
                shd.m35269a(sb2, "revocation_handle", shd.m35267a(str));
                RevokeToken revokeToken = (RevokeToken) seq.f44096a.mo25536a(clientContext, 1, sb2.toString(), (Object) null, RevokeToken.class);
            }
            this.f78068e.mo42251b(0, null);
        } catch (UserRecoverableAuthException e) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("pendingIntent", PendingIntent.getActivity(context, 0, e.mo7366a(), 0));
            this.f78068e.mo42251b(4, bundle);
        } catch (gid e2) {
            this.f78068e.mo42251b(4, anuj.m65341a(context, this.f78064a));
        } catch (VolleyError e3) {
            this.f78068e.mo42251b(7, null);
        }
    }

    /* renamed from: a */
    public final void mo11593a(Status status) {
        antn antn = this.f78068e;
        if (antn != null) {
            antn.mo42251b(8, null);
        }
    }
}
