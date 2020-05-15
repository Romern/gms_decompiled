package p000;

import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.model.posts.Post;
import com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity;

/* renamed from: aoca */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoca extends aoba {

    /* renamed from: a */
    private final ClientContext f78149a;

    /* renamed from: b */
    private final antn f78150b;

    /* renamed from: c */
    private final Post f78151c;

    public aoca(ClientContext clientContext, antn antn, Post post) {
        this.f78149a = clientContext;
        this.f78150b = antn;
        this.f78151c = post;
    }

    /* renamed from: a */
    public final void mo42520a(Context context, anru anru) {
        Bundle bundle;
        Context context2 = context;
        try {
            ClientContext clientContext = this.f78149a;
            Post post = this.f78151c;
            ansg ansg = anru.f77552c;
            String str = post.f82561k;
            if (TextUtils.isEmpty(str)) {
                str = "me";
            }
            if (post.mo46615a()) {
                String uri = post.f82554d.toString();
                ActivityEntity a = ansg.f77578b.mo42553a(clientContext, str, post.f82560j, anxj.m65495a(context), false, true, null, null, (ActivityEntity) ansg.m65099a(uri, post.f82558h));
                ContentValues a2 = ansg.m65098a(uri);
                ansg.m65100a(a2, a);
                ansg.m65101a(uri, a2);
                bundle = new ansz(a2).mo42210d();
            } else {
                bundle = null;
            }
            this.f78150b.mo41924a(0, (Bundle) null, bundle);
        } catch (UserRecoverableAuthException e) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("pendingIntent", PendingIntent.getActivity(context2, 0, e.mo7366a(), 0));
            this.f78150b.mo41924a(4, bundle2, (Bundle) null);
        } catch (gid e2) {
            this.f78150b.mo41924a(4, anuj.m65341a(context2, this.f78149a), (Bundle) null);
        } catch (VolleyError e3) {
            sil.m35353a(e3, "PlusInternalClient");
            this.f78150b.mo41924a(7, (Bundle) null, (Bundle) null);
        }
    }

    /* renamed from: a */
    public final void mo11593a(Status status) {
        antn antn = this.f78150b;
        if (antn != null) {
            antn.mo41924a(8, (Bundle) null, (Bundle) null);
        }
    }
}
