package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.UserManager;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: gjo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class gjo {

    /* renamed from: a */
    public final UserManager f18355a;

    /* renamed from: b */
    public final String f18356b;

    /* renamed from: c */
    private SharedPreferences f18357c;

    /* renamed from: d */
    private final Context f18358d;

    public gjo(Context context) {
        String packageName = context.getPackageName();
        this.f18358d = context;
        this.f18355a = (UserManager) context.getSystemService("user");
        bmxy.m108581a(packageName);
        this.f18356b = packageName;
    }

    /* renamed from: b */
    private final synchronized SharedPreferences m13287b() {
        if (this.f18357c == null) {
            SharedPreferences sharedPreferences = this.f18358d.getSharedPreferences("auth.google.account.authenticator.prefs", 0);
            bmxy.m108581a(sharedPreferences);
            this.f18357c = sharedPreferences;
        }
        return this.f18357c;
    }

    /* renamed from: a */
    public final Collection mo11942a() {
        List list;
        int i = Build.VERSION.SDK_INT;
        String[] stringArray = this.f18355a.getApplicationRestrictions(this.f18356b).getStringArray("auth_account:allowed_domains");
        if (stringArray != null) {
            list = Collections.unmodifiableList(Arrays.asList(stringArray));
        } else {
            list = null;
        }
        if (list != null) {
            return list;
        }
        String string = m13287b().getString("domain", null);
        if (string != null) {
            return Collections.unmodifiableList(Arrays.asList(TextUtils.split(string, ",")));
        }
        return null;
    }

    /* renamed from: a */
    public final void mo11943a(Collection collection) {
        bmxy.m108581a(collection);
        SharedPreferences.Editor edit = m13287b().edit();
        edit.putString("domain", TextUtils.join(",", collection));
        edit.commit();
    }
}
