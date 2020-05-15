package p000;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import org.json.JSONObject;

/* renamed from: azqr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azqr {

    /* renamed from: a */
    protected static final String f99914a;

    /* renamed from: b */
    protected final Context f99915b;

    /* renamed from: c */
    private final azez f99916c;

    static {
        azua e = azub.m86259e();
        e.mo55295a("");
        e.mo55296a(true);
        e.mo55297b("");
        f99914a = ((JSONObject) e.mo55293a().mo55298f().mo66814b()).toString();
    }

    /* renamed from: a */
    protected static String m86190a(String str) {
        azua e = azub.m86259e();
        e.mo55295a("");
        e.mo55296a(false);
        e.mo55297b(str);
        return ((JSONObject) e.mo55293a().mo55298f().mo66814b()).toString();
    }

    public azqr(Context context, azez azez) {
        this.f99915b = context.getApplicationContext();
        this.f99916c = azez;
    }

    /* renamed from: a */
    public final String mo55246a(String str, String str2) {
        Object[] objArr = {str, str2};
        azph.m85998a(this.f99915b).mo55165b(1935);
        try {
            this.f99916c.mo54857a(str, str2);
            azph.m85998a(this.f99915b).mo55165b(1919);
            return f99914a;
        } catch (DeadObjectException e) {
            azoj.m85931a("IpcAIDLBridge", e, "Connection broken when attempting to call JSBridge method %s", str2);
            azph.m85998a(this.f99915b).mo55135a(1907, 65, str2, (ConversationId) null);
            return m86190a("Broken connection");
        } catch (RemoteException e2) {
            azoj.m85931a("IpcAIDLBridge", e2, "RemoteException when attempting to call JSBridge method %s", new Object[0]);
            azph.m85998a(this.f99915b).mo55135a(1909, 65, str2, (ConversationId) null);
            return m86190a("RemoteException");
        } catch (SecurityException e3) {
            azoj.m85931a("IpcAIDLBridge", e3, "Conflicting AIDL definition when attempting to call JSBridge method %s", str2);
            azph.m85998a(this.f99915b).mo55135a(1908, 65, str2, (ConversationId) null);
            return m86190a("Conflicting AIDL");
        }
    }
}
