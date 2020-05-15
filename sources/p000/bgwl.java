package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Process;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.ulr.ApiClientInfo;
import java.util.logging.Level;

/* renamed from: bgwl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgwl extends bgwc {

    /* renamed from: o */
    public static final /* synthetic */ int f117826o = 0;

    /* renamed from: i */
    public final Context f117827i;

    /* renamed from: j */
    public final int f117828j;

    /* renamed from: k */
    public final int f117829k;

    /* renamed from: l */
    public final int f117830l;

    /* renamed from: m */
    public final String f117831m;

    /* renamed from: n */
    public final Boolean f117832n;

    public bgwl(Context context, int i, int i2, int i3, String str, Boolean bool) {
        this.f117827i = context;
        this.f117828j = i;
        this.f117829k = i2;
        this.f117830l = i3;
        this.f117831m = str;
        this.f117832n = bool;
    }

    /* renamed from: a */
    public static ClientContext m100164a(Context context, Account account) {
        int myUid = Process.myUid();
        String str = account.name;
        String str2 = account.name;
        String packageName = context.getPackageName();
        ClientContext clientContext = new ClientContext(myUid, str, str2, packageName, packageName);
        clientContext.mo17806d("https://www.googleapis.com/auth/userlocation.reporting");
        return clientContext;
    }

    /* renamed from: a */
    public static void m100165a(VolleyError volleyError) {
        String str;
        NetworkResponse networkResponse = volleyError.networkResponse;
        String valueOf = String.valueOf(volleyError);
        if (networkResponse != null) {
            str = "non-null";
        } else {
            str = "null";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27 + str.length());
        sb.append("VolleyError: ");
        sb.append(valueOf);
        sb.append(", response is ");
        sb.append(str);
        bgur.m100011a("GCoreUlr", sb.toString());
        if (networkResponse != null) {
            int i = networkResponse.statusCode;
            StringBuilder sb2 = new StringBuilder(45);
            sb2.append(" networkResponse: status code is :");
            sb2.append(i);
            bgur.m100020b("GCoreUlr", sb2.toString());
            sik a = sil.m35353a(volleyError, "GCoreUlr");
            if (a != null) {
                bgur.m100014a(Level.WARNING, "GCoreUlr", a.toString());
            }
        }
    }

    /* renamed from: a */
    public final ApiClientInfo mo63280a() {
        return new ApiClientInfo(!sre.m36081a(this.f117827i.getResources()) ? "phone" : "tablet");
    }
}
