package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.plus.internal.model.acls.AclsRequest;
import com.google.android.gms.plus.internal.model.apps.AppAclsEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.AclEntity;
import java.util.ArrayList;

/* renamed from: aobg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aobg extends aoba {

    /* renamed from: a */
    private final ClientContext f78073a;

    /* renamed from: b */
    private final AclsRequest f78074b;

    /* renamed from: c */
    private final antn f78075c;

    public aobg(ClientContext clientContext, AclsRequest aclsRequest, antn antn) {
        this.f78073a = clientContext;
        this.f78074b = aclsRequest;
        this.f78075c = antn;
    }

    /* renamed from: a */
    public final void mo42520a(Context context, anru anru) {
        Context context2 = context;
        try {
            ClientContext clientContext = this.f78073a;
            AclsRequest aclsRequest = this.f78074b;
            ansg ansg = anru.f77552c;
            ansg.f77585i.mo25545d();
            String a = anxj.m65495a(context);
            spp a2 = spp.m35906a();
            String str = aclsRequest.f82362c;
            spp b = a2.mo25939b();
            spp spp = b;
            String str2 = str;
            ansg.f77577a.mo42552b(clientContext, str, "shared", a, b, spp);
            spp b2 = a2.mo25939b();
            spp spp2 = b2;
            ansg.f77577a.mo42552b(clientContext, str2, "visible", a, b2, b2);
            try {
                ansg.f77585i.mo25546e();
            } catch (InterruptedException e) {
            }
            a2.mo25940c();
            if (!spp.mo25941d() || !spp2.mo25941d()) {
                throw new VolleyError("Interrupted.");
            }
            AclEntity aclEntity = (AclEntity) spp.mo25937a(0);
            Audience b3 = anxi.m65494b(aclEntity);
            AclEntity aclEntity2 = (AclEntity) spp2.mo25937a(0);
            boolean z = true;
            if (!aclEntity2.mo42632f() || aclEntity2.f82740g.size() != 1 || !"allCircles".equals(((aoib) aclEntity2.f82740g.get(0)).mo42790d())) {
                z = false;
            }
            ArrayList arrayList = z ? new ArrayList() : anxi.m65491a(aclEntity2);
            anwr anwr = new anwr();
            anwr.f77832b = b3;
            anwr.f77833c = arrayList;
            anwr.f77834d = z;
            anwr.f77831a = aclEntity.f82737d;
            AppAclsEntity a3 = anwr.mo42346a();
            anwp anwp = new anwp();
            anwp.f77830b = a3;
            anwp.f77829a = str2;
            this.f78075c.mo42239a(0, (Bundle) null, anwp.mo42343a());
        } catch (UserRecoverableAuthException e2) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("pendingIntent", PendingIntent.getActivity(context2, 0, e2.mo7366a(), 0));
            antn antn = this.f78075c;
            anwp anwp2 = new anwp();
            anwp2.f77829a = this.f78074b.f82362c;
            antn.mo42239a(4, bundle, anwp2.mo42343a());
        } catch (gid e3) {
            Bundle a4 = anuj.m65341a(context2, this.f78073a);
            antn antn2 = this.f78075c;
            anwp anwp3 = new anwp();
            anwp3.f77829a = this.f78074b.f82362c;
            antn2.mo42239a(4, a4, anwp3.mo42343a());
        } catch (VolleyError e4) {
            antn antn3 = this.f78075c;
            anwp anwp4 = new anwp();
            anwp4.f77829a = this.f78074b.f82362c;
            antn3.mo42239a(7, (Bundle) null, anwp4.mo42343a());
        }
    }

    /* renamed from: a */
    public final void mo11593a(Status status) {
        antn antn = this.f78075c;
        if (antn != null) {
            anwp anwp = new anwp();
            anwp.f77829a = this.f78074b.f82362c;
            antn.mo42239a(8, (Bundle) null, anwp.mo42343a());
        }
    }
}
