package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.wallet.shared.service.ServerResponse;
import java.io.IOException;

/* renamed from: awpg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awpg {

    /* renamed from: a */
    private final Context f94801a;

    /* renamed from: b */
    private final String f94802b;

    public awpg(Context context, String str) {
        this.f94801a = context.getApplicationContext();
        this.f94802b = str;
    }

    /* renamed from: a */
    public final ServerResponse mo52446a(awpf awpf) {
        if (!awyf.m81495a(this.f94801a)) {
            return ServerResponse.f110423a;
        }
        ServerResponse serverResponse = null;
        int i = 0;
        while (i <= 1) {
            try {
                Context context = this.f94801a;
                String a = awpf.mo52307a();
                bjev bjev = new bjev(a, gie.m13189a(context, awpf.f94800d.name, a));
                ServerResponse a2 = awpf.mo52306a(bjev);
                if (a2.mo60050c() != 5) {
                    return a2;
                }
                serverResponse = ServerResponse.f110424b;
                gie.m13192a(this.f94801a, bjev.f122588a);
                i++;
            } catch (UserRecoverableAuthException e) {
                Log.e(this.f94802b, "Could not get auth token", e);
                return ServerResponse.f110425c;
            } catch (gid e2) {
                Log.e(this.f94802b, "Could not get auth token", e2);
                return ServerResponse.f110424b;
            } catch (IOException e3) {
                Log.e(this.f94802b, "Could not get auth token", e3);
                return ServerResponse.f110423a;
            }
        }
        return serverResponse;
    }
}
