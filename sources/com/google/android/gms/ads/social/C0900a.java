package com.google.android.gms.ads.social;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.net.HttpCookie;
import java.util.List;

/* renamed from: com.google.android.gms.ads.social.a */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0900a {

    /* renamed from: a */
    public final SharedPreferences f9465a;

    public C0900a(Context context) {
        this.f9465a = context.getSharedPreferences("social.account_doritos", 0);
    }

    /* renamed from: a */
    static C0900a m6091a(Context context) {
        return new C0900a(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo7123a(String str) {
        String string = this.f9465a.getString(str, null);
        if (string == null) {
            return null;
        }
        List<HttpCookie> parse = HttpCookie.parse(string);
        if (parse.size() == 1 && parse.get(0).getName().equals("DSID")) {
            HttpCookie httpCookie = parse.get(0);
            if (!httpCookie.hasExpired()) {
                return httpCookie.toString();
            }
            this.f9465a.edit().remove(str).commit();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo7124a(Account[] accountArr) {
        for (Account account : accountArr) {
            String str = account.name;
            if (!TextUtils.isEmpty(str) && TextUtils.isEmpty(mo7123a(str))) {
                return true;
            }
        }
        return false;
    }
}
