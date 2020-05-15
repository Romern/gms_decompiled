package p000;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: rew */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rew {
    @Deprecated
    /* renamed from: a */
    public static Intent m33486a(Account account, ArrayList arrayList, String[] strArr, boolean z, String str, boolean z2, int i, int i2, String str2, boolean z3) {
        String str3;
        boolean z4;
        Intent intent = new Intent();
        if (z3) {
            str3 = "com.google.android.gms.common.account.CHOOSE_ACCOUNT_USERTILE";
        } else {
            if (str2 == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            sdo.m34975b(z4, "We only support hostedDomain filter for account chip styled account picker");
            str3 = "com.google.android.gms.common.account.CHOOSE_ACCOUNT";
        }
        intent.setAction(str3);
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", arrayList);
        intent.putExtra("allowableAccountTypes", strArr);
        intent.putExtra("addAccountOptions", (Bundle) null);
        intent.putExtra("selectedAccount", account);
        intent.putExtra("alwaysPromptForAccount", z);
        intent.putExtra("descriptionTextOverride", str);
        intent.putExtra("authTokenType", (String) null);
        intent.putExtra("addAccountRequiredFeatures", (String[]) null);
        intent.putExtra("setGmsCoreAccount", z2);
        intent.putExtra("overrideTheme", i);
        intent.putExtra("overrideCustomTheme", i2);
        intent.putExtra("hostedDomainFilter", str2);
        return intent;
    }

    @Deprecated
    /* renamed from: a */
    public static Intent m33487a(Account account, ArrayList arrayList, String[] strArr, boolean z, boolean z2, int i) {
        return m33486a(account, arrayList, strArr, z, null, z2, i, 0, null, false);
    }

    /* renamed from: a */
    public static Intent m33488a(rev rev) {
        Intent intent = new Intent();
        int i = 0;
        if (!rev.f42846i) {
            sdo.m34975b(rev.f42845h == null, "We only support hostedDomain filter for account chip styled account picker");
            sdo.m34975b(rev.f42847j == null, "Consent is only valid for account chip styled account picker");
        }
        intent.setAction(!rev.f42846i ? "com.google.android.gms.common.account.CHOOSE_ACCOUNT" : "com.google.android.gms.common.account.CHOOSE_ACCOUNT_USERTILE");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", rev.f42839b);
        ArrayList arrayList = rev.f42840c;
        if (arrayList != null) {
            intent.putExtra("allowableAccountTypes", (String[]) arrayList.toArray(new String[0]));
        }
        intent.putExtra("addAccountOptions", (Bundle) null);
        intent.putExtra("selectedAccount", rev.f42838a);
        intent.putExtra("alwaysPromptForAccount", rev.f42841d);
        intent.putExtra("descriptionTextOverride", rev.f42842e);
        intent.putExtra("setGmsCoreAccount", rev.f42843f);
        intent.putExtra("realClientPackage", rev.f42848k);
        intent.putExtra("overrideTheme", rev.f42844g);
        if (rev.f42846i) {
            i = 2;
        }
        intent.putExtra("overrideCustomTheme", i);
        intent.putExtra("hostedDomainFilter", rev.f42845h);
        Bundle bundle = new Bundle();
        if (rev.f42846i && !TextUtils.isEmpty(rev.f42842e)) {
            bundle.putString("title", rev.f42842e);
        }
        if (rev.f42847j != null) {
            bundle.putBoolean("should_show_consent", true);
            bundle.putString("privacy_policy_url", rev.f42847j.f42837b);
            bundle.putString("terms_of_service_url", rev.f42847j.f42836a);
        }
        if (!bundle.isEmpty()) {
            intent.putExtra("first_party_options_bundle", bundle);
        }
        return intent;
    }
}
