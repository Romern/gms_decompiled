package p000;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.auth.proximity.GcmRegistrationIntentOperation;
import java.util.HashSet;
import java.util.Set;

/* renamed from: jlr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jlr implements bqfp {

    /* renamed from: a */
    final /* synthetic */ String f22763a;

    /* renamed from: b */
    final /* synthetic */ GcmRegistrationIntentOperation f22764b;

    public jlr(GcmRegistrationIntentOperation gcmRegistrationIntentOperation, String str) {
        this.f22764b = gcmRegistrationIntentOperation;
        this.f22763a = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        GcmRegistrationIntentOperation.f11132a.mo25414c("Registered %s to the private topic %s", this.f22763a, (String) obj);
        Context applicationContext = this.f22764b.getApplicationContext();
        String str = this.f22763a;
        SharedPreferences a = jlq.m16888a(applicationContext);
        Set<String> stringSet = a.getStringSet("registered_gcm_bootstrap_accounts", new HashSet());
        stringSet.add(str);
        a.edit().putStringSet("registered_gcm_bootstrap_accounts", stringSet).apply();
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        GcmRegistrationIntentOperation.f11132a.mo25417e("Couldn't subscribe to GCM private topic for account %s", th, this.f22763a);
    }
}
