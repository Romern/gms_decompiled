package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.internal.model.acls.AclsRequest;
import com.google.android.gms.plus.service.v1whitelisted.models.AclEntity;

/* renamed from: aock */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aock extends aoba {

    /* renamed from: a */
    private final ClientContext f78185a;

    /* renamed from: b */
    private final AclsRequest f78186b;

    /* renamed from: c */
    private final antn f78187c;

    public aock(ClientContext clientContext, AclsRequest aclsRequest, antn antn) {
        this.f78185a = clientContext;
        this.f78186b = aclsRequest;
        this.f78187c = antn;
    }

    /* renamed from: a */
    public final void mo42520a(Context context, anru anru) {
        try {
            ClientContext clientContext = this.f78185a;
            AclsRequest aclsRequest = this.f78186b;
            anru.f77552c.f77577a.mo42550a(clientContext, aclsRequest.f82362c, "shared", (AclEntity) anxi.m65489a(aclsRequest.f82363d.f82370c));
            this.f78187c.mo42237a(0, (Bundle) null);
        } catch (UserRecoverableAuthException e) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("pendingIntent", PendingIntent.getActivity(context, 0, e.mo7366a(), 0));
            this.f78187c.mo42237a(4, bundle);
        } catch (gid e2) {
            this.f78187c.mo42237a(4, anuj.m65341a(context, this.f78185a));
        } catch (VolleyError e3) {
            this.f78187c.mo42237a(7, (Bundle) null);
        }
    }

    /* renamed from: a */
    public final void mo11593a(Status status) {
        antn antn = this.f78187c;
        if (antn != null) {
            antn.mo42237a(8, (Bundle) null);
        }
    }
}
