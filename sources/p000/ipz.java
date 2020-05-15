package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: ipz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ipz {

    /* renamed from: a */
    public final Object f21541a = new Object();

    /* renamed from: b */
    public final SharedPreferences f21542b;

    public ipz(Context context) {
        this.f21542b = context.getSharedPreferences("com.google.android.gms.auth.cryptauth.datastore.sharedpreferences.RegisteredKeyNames", 0);
    }

    /* renamed from: a */
    public final void mo13247a(String str, List list) {
        Set stringSet = this.f21542b.getStringSet(str, null);
        if (stringSet == null) {
            stringSet = new HashSet();
        }
        stringSet.addAll(list);
        synchronized (this.f21541a) {
            this.f21542b.edit().putStringSet(str, stringSet).commit();
        }
    }
}
