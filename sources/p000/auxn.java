package p000;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.trustlet.place.tracker.HomeAddressChangeTracker$AccountChangedReceiver;
import com.google.android.gms.trustlet.place.tracker.HomeAddressChangeTracker$UserPresentBroadcastReceiver;

/* renamed from: auxn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auxn implements auxc {

    /* renamed from: a */
    public static final aunx f92725a = new aunx("TrustAgent", "HomeAddressChangeTracker");

    /* renamed from: b */
    public final Context f92726b;

    /* renamed from: c */
    public final SharedPreferences f92727c;

    /* renamed from: d */
    public final SharedPreferences.Editor f92728d;

    /* renamed from: e */
    public final HomeAddressChangeTracker$AccountChangedReceiver f92729e = new HomeAddressChangeTracker$AccountChangedReceiver(this);

    /* renamed from: f */
    public final HomeAddressChangeTracker$UserPresentBroadcastReceiver f92730f;

    /* renamed from: g */
    private final auxm f92731g;

    public auxn(Context context, SharedPreferences sharedPreferences, SharedPreferences.Editor editor, auxm auxm) {
        sdo.m34959a(context);
        this.f92726b = context;
        this.f92727c = sharedPreferences;
        this.f92728d = editor;
        this.f92731g = auxm;
        HomeAddressChangeTracker$UserPresentBroadcastReceiver homeAddressChangeTracker$UserPresentBroadcastReceiver = new HomeAddressChangeTracker$UserPresentBroadcastReceiver(this);
        this.f92730f = homeAddressChangeTracker$UserPresentBroadcastReceiver;
        this.f92726b.registerReceiver(homeAddressChangeTracker$UserPresentBroadcastReceiver, new IntentFilter("android.intent.action.USER_PRESENT"));
        IntentFilter intentFilter = new IntentFilter("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE");
        intentFilter.addCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED");
        this.f92726b.registerReceiver(this.f92729e, intentFilter);
        mo51032a();
    }

    /* renamed from: a */
    public final void mo51032a() {
        Account[] accountsByType = AccountManager.get(this.f92726b).getAccountsByType("com.google");
        for (Account account : accountsByType) {
            if (!TextUtils.isEmpty(account.name)) {
                f92725a.mo50711a("fetch for account %s", account.name);
                new auxe(this.f92726b, account.name, this, new aupj(this.f92727c)).mo51006b();
            }
        }
    }

    /* renamed from: a */
    public final void mo51003a(String[] strArr) {
        if (strArr.length == 3 && !TextUtils.isEmpty(strArr[0]) && !TextUtils.isEmpty(strArr[2])) {
            String a = auxi.m78022a(strArr[2], "Home", this.f92727c);
            if (TextUtils.equals(a, strArr[0])) {
                f92725a.mo50711a("home address is not changed.", new Object[0]).mo50708c();
                return;
            }
            if (!TextUtils.isEmpty(a)) {
                f92725a.mo50711a("remove old home pref", new Object[0]).mo50708c();
                String str = strArr[2];
                this.f92728d.remove(auxi.m78025b(a));
                this.f92728d.remove(auxi.m78028c(a));
                this.f92728d.remove(auxi.m78030d(a));
                this.f92728d.remove(auxi.m78034h(str));
                this.f92728d.commit();
            }
            if (!TextUtils.isEmpty(strArr[0])) {
                f92725a.mo50711a("add new home pref", new Object[0]).mo50708c();
                String str2 = strArr[0];
                String str3 = strArr[1];
                String str4 = strArr[2];
                this.f92728d.putString(auxi.m78025b(str2), "Home");
                this.f92728d.putString(auxi.m78028c(str2), str3);
                this.f92728d.putString(auxi.m78030d(str2), str4);
                this.f92728d.putString(auxi.m78034h(str4), str2);
                this.f92728d.commit();
            }
            this.f92731g.mo51031a(strArr[2], a, strArr[0]);
        }
    }
}
