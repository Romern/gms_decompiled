package p000;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.uiflows.common.FilteringRedirectChimeraActivity;
import java.util.List;

/* renamed from: gjz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gjz {

    /* renamed from: a */
    public final Bundle f18370a = new Bundle();

    private gjz() {
        imp a = imp.m15726a();
        sdo.m34959a(a);
    }

    /* renamed from: a */
    public static gjz m13308a() {
        return new gjz();
    }

    /* renamed from: b */
    public final Bundle mo11962b() {
        return new Bundle(this.f18370a);
    }

    /* renamed from: a */
    public final void mo11955a(int i, String str) {
        this.f18370a.putInt("errorCode", i);
        if (!TextUtils.isEmpty(str)) {
            this.f18370a.putString("errorMessage", str);
        }
    }

    /* renamed from: a */
    public final void mo11956a(Account account) {
        this.f18370a.putString("authAccount", account.name);
        this.f18370a.putString("accountType", account.type);
    }

    /* renamed from: a */
    public final void mo11957a(PendingIntent pendingIntent) {
        this.f18370a.putParcelable("intent", imt.m15732a(pendingIntent));
    }

    /* renamed from: a */
    public final void mo11958a(Context context, PendingIntent pendingIntent, AccountAuthenticatorResponse accountAuthenticatorResponse, List list) {
        mo11957a(FilteringRedirectChimeraActivity.m7013a(context, pendingIntent, list, accountAuthenticatorResponse));
    }

    /* renamed from: a */
    public final void mo11959a(Context context, Intent intent) {
        mo11957a(PendingIntent.getActivity(context.getApplicationContext(), 0, intent, 134217728));
    }

    /* renamed from: a */
    public final void mo11960a(TokenData tokenData) {
        this.f18370a.putString("authtoken", tokenData.f9944b);
        Long l = tokenData.f9945c;
        int i = Build.VERSION.SDK_INT;
        if (l != null) {
            this.f18370a.putLong("android.accounts.expiry", l.longValue() * 1000);
        }
    }

    /* renamed from: a */
    public final void mo11961a(boolean z) {
        this.f18370a.putBoolean("booleanResult", z);
    }
}
