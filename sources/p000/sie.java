package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;
import java.io.IOException;

/* renamed from: sie */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sie {

    /* renamed from: a */
    protected final Account f44527a;

    /* renamed from: b */
    protected final String f44528b;

    /* renamed from: c */
    protected final String f44529c;

    /* renamed from: d */
    protected final Bundle f44530d;

    /* renamed from: e */
    protected String f44531e;

    public sie(ClientContext clientContext) {
        this.f44528b = clientContext.f30216f;
        Bundle bundle = new Bundle();
        this.f44530d = bundle;
        bundle.putString(gie.f18286b, this.f44528b);
        if (!clientContext.mo17807d()) {
            this.f44530d.putInt("callerUid", clientContext.f30212b);
        }
        if (clientContext.mo17813h() != null) {
            this.f44530d.putString("request_visible_actions", TextUtils.join(" ", clientContext.mo17813h()));
        }
        this.f44527a = clientContext.f30213c;
        this.f44529c = clientContext.mo17812g();
    }

    /* renamed from: a */
    public final String mo25585a(Context context) {
        try {
            this.f44531e = gie.m13188a(context, this.f44527a, this.f44529c, this.f44530d);
            sif.m35346a().mo25588a(this.f44528b);
            return this.f44531e;
        } catch (IOException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("AuthSessionAuthenticato", valueOf.length() == 0 ? new String("Auth related exception is being ignored: ") : "Auth related exception is being ignored: ".concat(valueOf));
            return null;
        } catch (gid e2) {
            String valueOf2 = String.valueOf(e2.getMessage());
            Log.w("AuthSessionAuthenticato", valueOf2.length() == 0 ? new String("Auth related exception is being ignored: ") : "Auth related exception is being ignored: ".concat(valueOf2));
            return null;
        }
    }

    /* renamed from: b */
    public final String mo25586b(Context context) {
        this.f44531e = gie.m13188a(context, this.f44527a, this.f44529c, this.f44530d);
        sif.m35346a().mo25588a(this.f44528b);
        return this.f44531e;
    }

    /* renamed from: c */
    public final void mo25587c(Context context) {
        String str = this.f44531e;
        if (str != null) {
            gie.m13192a(context, str);
            sif a = sif.m35346a();
            String str2 = this.f44528b;
            synchronized (a.f44533a) {
                a.f44533a.remove(str2);
            }
        }
        this.f44531e = null;
    }

    public sie(ClientContext clientContext, byte[] bArr) {
        this(clientContext);
        this.f44530d.putBoolean("suppressProgressScreen", true);
    }
}
