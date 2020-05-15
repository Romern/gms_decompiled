package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.service.v1whitelisted.models.UpgradeAccountEntity;
import java.io.IOException;

/* renamed from: aocm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aocm extends aoba {

    /* renamed from: a */
    private final ClientContext f78190a;

    /* renamed from: b */
    private final String f78191b;

    /* renamed from: c */
    private final UpgradeAccountEntity f78192c;

    /* renamed from: d */
    private final antn f78193d;

    public aocm(ClientContext clientContext, String str, UpgradeAccountEntity upgradeAccountEntity, antn antn) {
        this.f78190a = clientContext;
        this.f78191b = str;
        this.f78192c = upgradeAccountEntity;
        this.f78193d = antn;
    }

    /* renamed from: a */
    public final void mo42520a(Context context, anru anru) {
        try {
            ClientContext clientContext = this.f78190a;
            String str = this.f78191b;
            UpgradeAccountEntity upgradeAccountEntity = this.f78192c;
            ansg ansg = anru.f77552c;
            String a = anxj.m65495a(context);
            aodq aodq = ansg.f77583g;
            StringBuilder sb = new StringBuilder("rpc/upgradeAccount");
            shd.m35269a(sb, "client", shd.m35267a("androidGms"));
            if (str != null) {
                shd.m35269a(sb, "gpsrc", shd.m35267a(str));
            }
            if (a != null) {
                shd.m35269a(sb, "language", shd.m35267a(a));
            }
            shd.m35269a(sb, "userId", shd.m35267a("me"));
            UpgradeAccountEntity upgradeAccountEntity2 = (UpgradeAccountEntity) aodq.f78227a.mo25536a(clientContext, 1, sb.toString(), upgradeAccountEntity, UpgradeAccountEntity.class);
            if (anzh.m65638a(upgradeAccountEntity2)) {
                String b = clientContext.mo17802b();
                try {
                    gie.m13192a(context, gie.m13189a(context, b, "cp"));
                    gie.m13189a(context, b, "cp");
                } catch (IOException e) {
                    String valueOf = String.valueOf(b);
                    Log.e("UpgradeAccount", valueOf.length() == 0 ? new String("Exception updating service bits for ") : "Exception updating service bits for ".concat(valueOf), e);
                }
            }
            this.f78193d.mo42246a(0, (Bundle) null, upgradeAccountEntity2);
        } catch (UserRecoverableAuthException e2) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("pendingIntent", PendingIntent.getActivity(context, 0, e2.mo7366a(), 0));
            this.f78193d.mo42246a(4, bundle, (UpgradeAccountEntity) null);
        } catch (gid e3) {
            this.f78193d.mo42246a(4, anuj.m65341a(context, this.f78190a), (UpgradeAccountEntity) null);
        } catch (VolleyError e4) {
            this.f78193d.mo42246a(7, (Bundle) null, (UpgradeAccountEntity) null);
        }
    }

    /* renamed from: a */
    public final void mo11593a(Status status) {
        this.f78193d.mo42246a(8, (Bundle) null, (UpgradeAccountEntity) null);
    }
}
