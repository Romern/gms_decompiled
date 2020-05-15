package p000;

import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity;

/* renamed from: aobx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aobx extends aoba {

    /* renamed from: a */
    private final ClientContext f78142a;

    /* renamed from: b */
    private final String f78143b;

    /* renamed from: c */
    private final antn f78144c;

    public aobx(ClientContext clientContext, String str, antn antn) {
        this.f78142a = clientContext;
        this.f78143b = str;
        this.f78144c = antn;
    }

    /* renamed from: a */
    public final void mo42520a(Context context, anru anru) {
        ContentValues contentValues;
        ansz ansz;
        Context context2 = context;
        try {
            ClientContext clientContext = this.f78142a;
            String str = this.f78143b;
            anry a = anry.m65083a();
            if (str != null) {
                synchronized (a.f77564b) {
                    contentValues = (ContentValues) a.f77564b.mo15546a(str);
                }
            } else {
                contentValues = null;
            }
            if (contentValues != null) {
                ansz = new ansz(contentValues);
            } else {
                ActivityEntity a2 = anru.f77552c.f77578b.mo42553a(clientContext, "me", null, anxj.m65495a(context), false, true, null, null, (ActivityEntity) ansg.m65099a(str, (Bundle) null));
                ContentValues a3 = ansg.m65098a(str);
                ansg.m65100a(a3, a2);
                ansg.m65101a(str, a3);
                ansz = new ansz(a3);
            }
            this.f78144c.mo41924a(0, (Bundle) null, ansz.mo42210d());
        } catch (UserRecoverableAuthException e) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("pendingIntent", PendingIntent.getActivity(context2, 0, e.mo7366a(), 0));
            this.f78144c.mo41924a(4, bundle, (Bundle) null);
        } catch (gid e2) {
            this.f78144c.mo41924a(4, anuj.m65341a(context2, this.f78142a), (Bundle) null);
        } catch (VolleyError e3) {
            this.f78144c.mo41924a(7, (Bundle) null, (Bundle) null);
        }
    }

    /* renamed from: a */
    public final void mo11593a(Status status) {
        antn antn = this.f78144c;
        if (antn != null) {
            antn.mo41924a(8, (Bundle) null, (Bundle) null);
        }
    }
}
