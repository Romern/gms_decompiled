package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.service.v1whitelisted.models.MomentsFeed;
import java.util.Formatter;

/* renamed from: aobp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aobp extends aoba {

    /* renamed from: a */
    private final ClientContext f78102a;

    /* renamed from: b */
    private final antn f78103b;

    /* renamed from: c */
    private final String f78104c;

    /* renamed from: d */
    private final int f78105d;

    /* renamed from: e */
    private final String f78106e;

    public aobp(ClientContext clientContext, String str, int i, String str2, antn antn) {
        this.f78102a = clientContext;
        this.f78104c = str;
        this.f78105d = i;
        this.f78106e = str2;
        this.f78103b = antn;
    }

    /* renamed from: a */
    public final void mo42520a(Context context, anru anru) {
        try {
            ClientContext clientContext = this.f78102a;
            String str = this.f78104c;
            int i = this.f78105d;
            String str2 = this.f78106e;
            ansg ansg = anru.f77552c;
            String a = anxj.m65495a(context);
            aodo aodo = ansg.f77581e;
            Integer valueOf = Integer.valueOf(i);
            StringBuilder sb = new StringBuilder();
            new Formatter(sb).format("applications/%1$s/moments", shd.m35267a(str));
            if (a != null) {
                shd.m35269a(sb, "language", shd.m35267a(a));
            }
            shd.m35269a(sb, "maxResults", String.valueOf(valueOf));
            if (str2 != null) {
                shd.m35269a(sb, "pageToken", shd.m35267a(str2));
            }
            String sb2 = sb.toString();
            this.f78103b.mo42244a(0, (Bundle) null, (MomentsFeed) aodo.f78225a.mo25536a(clientContext, 0, sb2, (Object) null, MomentsFeed.class));
        } catch (UserRecoverableAuthException e) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("pendingIntent", PendingIntent.getActivity(context, 0, e.mo7366a(), 0));
            this.f78103b.mo42244a(4, bundle, (MomentsFeed) null);
        } catch (gid e2) {
            this.f78103b.mo42244a(4, anuj.m65341a(context, this.f78102a), (MomentsFeed) null);
        } catch (VolleyError e3) {
            this.f78103b.mo42244a(7, (Bundle) null, (MomentsFeed) null);
        }
    }

    /* renamed from: a */
    public final void mo11593a(Status status) {
        antn antn = this.f78103b;
        if (antn != null) {
            antn.mo42244a(8, (Bundle) null, (MomentsFeed) null);
        }
    }
}
