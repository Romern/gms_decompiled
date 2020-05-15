package p000;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.android.volley.toolbox.AndroidAuthenticator;
import java.util.Locale;
import java.util.Map;

/* renamed from: bjty */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjty {

    /* renamed from: a */
    public final Uri f123325a;

    /* renamed from: b */
    private final String f123326b;

    /* renamed from: c */
    private final AndroidAuthenticator f123327c;

    /* renamed from: d */
    private String f123328d;

    private bjty(bwgw bwgw, AndroidAuthenticator androidAuthenticator) {
        this.f123325a = Uri.parse(bwgw.f159295b);
        Uri.parse(bwgw.f159296c);
        this.f123326b = bwgw.f159297d;
        this.f123327c = androidAuthenticator;
    }

    /* renamed from: a */
    public static bjty m104626a(Context context, Account account, bwgw bwgw) {
        boolean contains;
        boolean contains2;
        Context applicationContext = context.getApplicationContext();
        String str = account.name;
        String str2 = bwgw.f159298e;
        if (aytc.f98443a == null) {
            int i = Build.VERSION.SDK_INT;
            aytc.f98443a = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (aytc.f98443a.booleanValue() && (contains = str.contains("@")) != (contains2 = str2.contains("@"))) {
            if (contains) {
                str = str.substring(0, str.indexOf(64));
            }
            if (contains2) {
                str2 = str2.substring(0, str2.indexOf(64));
            }
        }
        if (!account.name.equalsIgnoreCase(bwgw.f159298e) && !str.equalsIgnoreCase(str2)) {
            Log.e("ApiContext", String.format(Locale.US, "Account specified by integrator=%s should match AndroidEnvironmentConfig=%s", account.name, bwgw.f159298e));
        }
        return new bjty(bwgw, new AndroidAuthenticator(applicationContext, account, bwgw.f159297d));
    }

    /* renamed from: a */
    public final synchronized Map mo65532a() {
        C1223np npVar;
        this.f123328d = this.f123327c.getAuthToken();
        npVar = new C1223np(2);
        if (this.f123326b.startsWith("oauth2:")) {
            String valueOf = String.valueOf(this.f123328d);
            npVar.put("Authorization", valueOf.length() == 0 ? new String("Bearer ") : "Bearer ".concat(valueOf));
        } else {
            String valueOf2 = String.valueOf(this.f123328d);
            npVar.put("Authorization", valueOf2.length() == 0 ? new String("GoogleLogin auth=") : "GoogleLogin auth=".concat(valueOf2));
        }
        npVar.put("User-Agent", bjtx.f123321a);
        return npVar;
    }
}
