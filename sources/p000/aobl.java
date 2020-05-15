package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: aobl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aobl extends aoba {

    /* renamed from: a */
    private final ClientContext f78092a;

    /* renamed from: b */
    private final antk f78093b;

    public aobl(ClientContext clientContext, antk antk) {
        this.f78092a = clientContext;
        this.f78093b = antk;
    }

    /* renamed from: a */
    private final void m65749a(int i, Bundle bundle, Bundle bundle2) {
        antk antk = this.f78093b;
        if (antk != null) {
            antk.mo42230a(i, bundle, bundle2);
        }
    }

    /* renamed from: a */
    public final void mo42520a(Context context, anru anru) {
        try {
            antb a = anru.mo42168a(context, this.f78092a, 1);
            if (a != null) {
                m65749a(0, null, a.f77710a);
                return;
            }
            Log.e("GetSignUpStateOperation", "Unable to load the user's sign-up state");
            m65749a(8, null, null);
        } catch (UserRecoverableAuthException e) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("pendingIntent", PendingIntent.getActivity(context, 0, e.mo7366a(), 0));
            m65749a(4, bundle, null);
        } catch (gid e2) {
            m65749a(4, anuj.m65341a(context, this.f78092a), null);
        } catch (VolleyError e3) {
            m65749a(7, null, null);
        }
    }

    /* renamed from: a */
    public final void mo11593a(Status status) {
        m65749a(8, null, null);
    }
}
