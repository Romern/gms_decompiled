package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.internal.model.acls.AclsRequest;
import com.google.android.gms.plus.internal.model.apps.AppAclsEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.AclEntity;
import java.util.ArrayList;

/* renamed from: aocj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aocj extends aoba {

    /* renamed from: a */
    private final ClientContext f78182a;

    /* renamed from: b */
    private final AclsRequest f78183b;

    /* renamed from: c */
    private final antn f78184c;

    public aocj(ClientContext clientContext, AclsRequest aclsRequest, antn antn) {
        this.f78182a = clientContext;
        this.f78183b = aclsRequest;
        this.f78184c = antn;
    }

    /* renamed from: a */
    public final void mo42520a(Context context, anru anru) {
        try {
            ClientContext clientContext = this.f78182a;
            AclsRequest aclsRequest = this.f78183b;
            ansg ansg = anru.f77552c;
            ArrayList arrayList = new ArrayList();
            AppAclsEntity appAclsEntity = aclsRequest.f82363d;
            if (appAclsEntity.f82372e) {
                aoia aoia = new aoia();
                aoia.mo42787b("allCircles");
                arrayList.add(aoia.mo42785a());
            } else if (appAclsEntity.mo46590a()) {
                arrayList.addAll(anxi.m65492a(aclsRequest.f82363d.f82371d));
            }
            aoel aoel = new aoel();
            aoel.mo42627a(arrayList);
            ansg.f77577a.mo42550a(clientContext, aclsRequest.f82362c, "visible", (AclEntity) aoel.mo42626a());
            this.f78184c.mo42237a(0, (Bundle) null);
        } catch (UserRecoverableAuthException e) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("pendingIntent", PendingIntent.getActivity(context, 0, e.mo7366a(), 0));
            this.f78184c.mo42237a(4, bundle);
        } catch (gid e2) {
            this.f78184c.mo42237a(4, anuj.m65341a(context, this.f78182a));
        } catch (VolleyError e3) {
            this.f78184c.mo42237a(7, (Bundle) null);
        }
    }

    /* renamed from: a */
    public final void mo11593a(Status status) {
        antn antn = this.f78184c;
        if (antn != null) {
            antn.mo42237a(8, (Bundle) null);
        }
    }
}
