package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.service.v1whitelisted.models.MomentsFeed;
import java.util.Formatter;

/* renamed from: aobq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aobq extends aoba {

    /* renamed from: a */
    private final ClientContext f78107a;

    /* renamed from: b */
    private final antn f78108b;

    /* renamed from: c */
    private final int f78109c;

    /* renamed from: d */
    private final String f78110d;

    /* renamed from: e */
    private final Uri f78111e;

    /* renamed from: f */
    private final String f78112f;

    /* renamed from: g */
    private final String f78113g;

    /* renamed from: h */
    private final String f78114h;

    public aobq(ClientContext clientContext, int i, String str, Uri uri, String str2, String str3, String str4, antn antn) {
        this.f78107a = clientContext;
        this.f78109c = i;
        this.f78110d = str;
        this.f78111e = uri;
        this.f78112f = str2;
        this.f78113g = str3;
        this.f78114h = str4;
        this.f78108b = antn;
    }

    /* renamed from: a */
    public final void mo42520a(Context context, anru anru) {
        String str;
        Context context2 = context;
        try {
            ClientContext clientContext = this.f78107a;
            int i = this.f78109c;
            String str2 = this.f78110d;
            Uri uri = this.f78111e;
            String str3 = this.f78112f;
            String str4 = this.f78113g;
            String str5 = this.f78114h;
            ansg ansg = anru.f77552c;
            if (uri != null) {
                str = uri.toString();
            } else {
                str = null;
            }
            String a = anxj.m65495a(context);
            aodo aodo = ansg.f77581e;
            Integer valueOf = Integer.valueOf(i);
            StringBuilder sb = new StringBuilder();
            new Formatter(sb).format("people/%1$s/moments/%2$s", shd.m35267a(str4), shd.m35267a(str5));
            if (a != null) {
                shd.m35269a(sb, "language", shd.m35267a(a));
            }
            shd.m35269a(sb, "maxResults", String.valueOf(valueOf));
            if (str2 != null) {
                shd.m35269a(sb, "pageToken", shd.m35267a(str2));
            }
            if (str != null) {
                shd.m35269a(sb, "targetUrl", shd.m35267a(str));
            }
            if (str3 != null) {
                shd.m35269a(sb, "type", shd.m35267a(str3));
            }
            this.f78108b.mo42244a(0, (Bundle) null, (MomentsFeed) aodo.f78225a.mo25536a(clientContext, 0, sb.toString(), (Object) null, MomentsFeed.class));
        } catch (UserRecoverableAuthException e) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("pendingIntent", PendingIntent.getActivity(context2, 0, e.mo7366a(), 0));
            this.f78108b.mo42244a(4, bundle, (MomentsFeed) null);
        } catch (gid e2) {
            this.f78108b.mo42244a(4, anuj.m65341a(context2, this.f78107a), (MomentsFeed) null);
        } catch (VolleyError e3) {
            this.f78108b.mo42244a(7, (Bundle) null, (MomentsFeed) null);
        }
    }

    /* renamed from: a */
    public final void mo11593a(Status status) {
        antn antn = this.f78108b;
        if (antn != null) {
            antn.mo42244a(8, (Bundle) null, (MomentsFeed) null);
        }
    }
}
