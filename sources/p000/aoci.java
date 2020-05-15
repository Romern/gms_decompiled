package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.plus.service.v1whitelisted.models.AclEntity;

/* renamed from: aoci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoci extends aoba {

    /* renamed from: a */
    private final ClientContext f78178a;

    /* renamed from: b */
    private final String f78179b;

    /* renamed from: c */
    private final Audience f78180c;

    /* renamed from: d */
    private final antn f78181d;

    public aoci(ClientContext clientContext, String str, Audience audience, antn antn) {
        this.f78178a = clientContext;
        this.f78179b = str;
        this.f78180c = audience;
        this.f78181d = antn;
    }

    /* renamed from: a */
    public final void mo42520a(Context context, anru anru) {
        try {
            ClientContext clientContext = this.f78178a;
            String str = this.f78179b;
            Audience audience = this.f78180c;
            ansg ansg = anru.f77552c;
            AclEntity aclEntity = (AclEntity) anxi.m65489a(audience);
            ansg.f77577a.mo42549a(clientContext, str, "shared", anxj.m65495a(context), aclEntity);
            this.f78181d.mo42237a(0, (Bundle) null);
        } catch (UserRecoverableAuthException e) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("pendingIntent", PendingIntent.getActivity(context, 0, e.mo7366a(), 0));
            this.f78181d.mo42237a(4, bundle);
        } catch (gid e2) {
            this.f78181d.mo42237a(4, anuj.m65341a(context, this.f78178a));
        } catch (VolleyError e3) {
            this.f78181d.mo42237a(7, (Bundle) null);
        }
    }

    /* renamed from: a */
    public final void mo11593a(Status status) {
        antn antn = this.f78181d;
        if (antn != null) {
            antn.mo42237a(8, (Bundle) null);
        }
    }
}
