package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import java.io.IOException;

/* renamed from: sgw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class sgw {

    /* renamed from: i */
    public final Context f44453i;

    public sgw(Context context) {
        this.f44453i = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public sie mo25526a(ClientContext clientContext) {
        return new sie(clientContext);
    }

    /* renamed from: b */
    public String mo25527b(ClientContext clientContext) {
        if (clientContext.mo17802b() != null) {
            return mo25526a(clientContext).mo25585a(this.f44453i);
        }
        return null;
    }

    /* renamed from: c */
    public final String mo25528c(ClientContext clientContext) {
        try {
            return new iei(this.f44453i).mo12952a(clientContext.f30216f);
        } catch (IOException e) {
            Log.w("AbstractServer", "IOException while getting app cert is being ignored.", e);
            return null;
        } catch (gid e2) {
            Log.w("AbstractServer", "GoogleAuthException while getting app cert is being ignored.", e2);
            return null;
        }
    }

    /* renamed from: d */
    public String mo25529d(ClientContext clientContext) {
        String b = clientContext.mo17803b("auth_token");
        if (!TextUtils.isEmpty(b)) {
            return b;
        }
        if (clientContext.mo17802b() == null) {
            return null;
        }
        try {
            return mo25526a(clientContext).mo25586b(this.f44453i);
        } catch (IOException e) {
            throw new VolleyError(e);
        }
    }
}
