package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.service.v1whitelisted.models.AclEntity;
import java.util.Formatter;
import java.util.List;

/* renamed from: aoby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoby extends aoba {

    /* renamed from: a */
    private final ClientContext f78145a;

    /* renamed from: b */
    private final String f78146b;

    /* renamed from: c */
    private final antn f78147c;

    public aoby(ClientContext clientContext, String str, antn antn) {
        this.f78145a = clientContext;
        this.f78146b = str;
        this.f78147c = antn;
    }

    /* renamed from: a */
    public final void mo42520a(Context context, anru anru) {
        try {
            ClientContext clientContext = this.f78145a;
            String str = this.f78146b;
            ansg ansg = anru.f77552c;
            String a = anxj.m65495a(context);
            aodi aodi = ansg.f77577a;
            StringBuilder sb = new StringBuilder();
            new Formatter(sb).format("moments/%1$s/acl/%2$s", shd.m35267a(str), shd.m35267a("shared"));
            if (a != null) {
                shd.m35269a(sb, "language", shd.m35267a(a));
            }
            this.f78147c.mo42249a(0, (Bundle) null, anxi.m65491a((AclEntity) aodi.f78219a.mo25536a(clientContext, 0, sb.toString(), (Object) null, AclEntity.class)));
        } catch (UserRecoverableAuthException e) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("pendingIntent", PendingIntent.getActivity(context, 0, e.mo7366a(), 0));
            this.f78147c.mo42249a(4, bundle, (List) null);
        } catch (gid e2) {
            this.f78147c.mo42249a(4, anuj.m65341a(context, this.f78145a), (List) null);
        } catch (VolleyError e3) {
            this.f78147c.mo42249a(7, (Bundle) null, (List) null);
        }
    }

    /* renamed from: a */
    public final void mo11593a(Status status) {
        antn antn = this.f78147c;
        if (antn != null) {
            antn.mo42249a(8, (Bundle) null, (List) null);
        }
    }
}
