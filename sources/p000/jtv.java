package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: jtv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jtv {

    /* renamed from: a */
    private static final Logger f23202a = jsy.m17256a("FeatureSharedPreferences");

    /* renamed from: b */
    private final rtj f23203b;

    public jtv(Context context, String str) {
        this.f23203b = new rtj(context.getApplicationContext(), str, true);
    }

    /* renamed from: a */
    private static String m17329a(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("feature_list_") : "feature_list_".concat(valueOf);
    }

    /* renamed from: b */
    public final void mo14091b(Account account) {
        SharedPreferences.Editor edit = this.f23203b.edit();
        edit.putStringSet(m17329a(account.name), new HashSet());
        edit.commit();
    }

    /* renamed from: c */
    public final void mo14093c(Account account, bsni bsni) {
        HashSet hashSet = new HashSet(this.f23203b.getStringSet(m17329a(account.name), new HashSet()));
        if (!hashSet.remove(bsni.name())) {
            f23202a.mo25418e("Feature not removed: %s", bsni.name());
            return;
        }
        SharedPreferences.Editor edit = this.f23203b.edit();
        edit.putStringSet(m17329a(account.name), hashSet);
        edit.commit();
    }

    /* renamed from: a */
    public final List mo14089a(Account account) {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f23203b.getStringSet(m17329a(account.name), new HashSet())) {
            try {
                arrayList.add(bsni.m116007a(str));
            } catch (IllegalArgumentException e) {
                f23202a.mo25418e("Invalid feature: %s", str, e);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void mo14092b(Account account, bsni bsni) {
        HashSet hashSet = new HashSet(this.f23203b.getStringSet(m17329a(account.name), new HashSet()));
        if (!hashSet.add(bsni.name())) {
            f23202a.mo25418e("Feature not added: %s", bsni.name());
            return;
        }
        SharedPreferences.Editor edit = this.f23203b.edit();
        edit.putStringSet(m17329a(account.name), hashSet);
        edit.commit();
    }

    /* renamed from: a */
    public final boolean mo14090a(Account account, bsni bsni) {
        return this.f23203b.getStringSet(m17329a(account.name), new HashSet()).contains(bsni.name());
    }
}
