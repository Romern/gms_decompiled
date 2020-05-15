package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;
import java.util.HashMap;

/* renamed from: ampo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ampo extends shj {

    /* renamed from: m */
    private static final HashMap f75688m = new HashMap();

    public ampo(Context context, String str, String str2, boolean z, boolean z2, String str3, String str4) {
        super(context.getApplicationContext(), str, str2, z, z2, str3, str4, 5401);
    }

    /* renamed from: a */
    public static void m63145a(ClientContext clientContext, String str) {
        clientContext.mo17798a("sync_reason", str);
    }

    /* renamed from: a */
    public HashMap mo25519a(Context context, ClientContext clientContext) {
        String str;
        String str2;
        HashMap a = super.mo25519a(context, clientContext);
        if (clientContext != null) {
            str = clientContext.mo17803b("sync_reason");
        } else {
            str = null;
        }
        synchronized (f75688m) {
            str2 = (String) f75688m.get(str);
            if (str2 == null) {
                StringBuilder sb = new StringBuilder(sic.m35342a(context, "People/1.0"));
                if (!TextUtils.isEmpty(str)) {
                    sb.append("; sync-");
                    sb.append(str);
                } else {
                    sb.append("; ondemand");
                }
                str2 = sb.toString();
                f75688m.put(str, str2);
            }
        }
        a.put("User-Agent", str2);
        String b = clientContext.mo17803b("social_client_app_id");
        if (TextUtils.isEmpty(b)) {
            Log.w("PeopleApiaryServer", "App ID not set in client context", new ancl());
        }
        anxk.m65496a();
        anxk.m65497a(a, b, spn.m35891g(context), sre.m36081a(context.getResources()));
        return a;
    }

    /* renamed from: b */
    public final String mo25527b(ClientContext clientContext) {
        clientContext.mo17795a();
        if (TextUtils.isEmpty(null)) {
            return super.mo25527b(clientContext);
        }
        return null;
    }

    /* renamed from: d */
    public final String mo25529d(ClientContext clientContext) {
        clientContext.mo17795a();
        if (TextUtils.isEmpty(null)) {
            return super.mo25529d(clientContext);
        }
        return null;
    }
}
