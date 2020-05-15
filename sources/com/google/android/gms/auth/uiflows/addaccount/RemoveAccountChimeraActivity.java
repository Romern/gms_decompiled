package com.google.android.gms.auth.uiflows.addaccount;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.auth.account.p016be.RemoveAccountChimeraIntentService;
import com.google.android.setupdesign.SetupWizardLayout;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RemoveAccountChimeraActivity extends jxx implements bjbh {

    /* renamed from: a */
    public static final imr f11430a = imr.m15727a("account");

    /* renamed from: b */
    private static final imr f11431b = imr.m15727a("reason");

    /* renamed from: c */
    private SetupWizardLayout f11432c;

    /* renamed from: a */
    public static Intent m6997a(Context context, Account account, int i, boolean z, rrq rrq) {
        Bundle bundle;
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.addaccount.RemoveAccountActivity");
        ims ims = new ims();
        ims.mo13148b(f11430a, account);
        ims.mo13148b(f11431b, Integer.valueOf(i));
        ims.mo13148b(jwz.f23429j, Boolean.valueOf(z));
        imr imr = jwz.f23428i;
        if (rrq != null) {
            bundle = rrq.mo25045a();
        } else {
            bundle = null;
        }
        ims.mo13148b(imr, bundle);
        return className.putExtras(ims.f21367a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo7384b() {
        return "RemoveAccountActivity";
    }

    /* renamed from: bd */
    public final void mo7769bd() {
        mo7874a(-1, null);
    }

    public final void onBackPressed() {
        mo7874a(-1, null);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        CharSequence charSequence;
        String str;
        super.onCreate(bundle);
        int intValue = ((Integer) mo14202g().mo13146a(f11431b)).intValue();
        startService(RemoveAccountChimeraIntentService.m6276a(this, (Account) mo14202g().mo13146a(f11430a)));
        SetupWizardLayout setupWizardLayout = (SetupWizardLayout) LayoutInflater.from(this).inflate((int) C0126R.C0128layout.auth_account_removed, (ViewGroup) null);
        this.f11432c = setupWizardLayout;
        setContentView(setupWizardLayout);
        SetupWizardLayout setupWizardLayout2 = this.f11432c;
        switch (intValue) {
            case 1:
                charSequence = getString(C0126R.string.auth_account_removed_dm_setup_failed_title);
                break;
            case 2:
                charSequence = getString(C0126R.string.auth_account_removed_dm_setup_skipped_title);
                break;
            case 3:
            case 4:
                charSequence = getString(C0126R.string.common_something_went_wrong);
                break;
            case 5:
                charSequence = getString(C0126R.string.auth_account_removed_dm_not_supported_title);
                break;
            case 6:
                charSequence = getString(C0126R.string.auth_account_removed_restricted_by_admin_title);
                break;
            default:
                charSequence = getTitle();
                break;
        }
        setupWizardLayout2.mo71375a(charSequence);
        this.f11432c.mo71377c().mo71422a((bjbh) this);
        rrp.m34302a(this.f11432c);
        TextView textView = (TextView) findViewById(C0126R.C0129id.auth_account_removed_description);
        if (intValue == 1) {
            str = getString(C0126R.string.auth_account_removed_dm_setup_failed_description, new Object[]{getString(C0126R.string.auth_account_start_over_and_signin_again)});
        } else if (intValue == 3 || intValue == 4) {
            str = getString(C0126R.string.auth_account_removed_dm_bad_result_description, new Object[]{getString(C0126R.string.auth_account_start_over_and_signin_again)});
        } else if (intValue == 5) {
            str = getString(C0126R.string.auth_account_removed_dm_not_supported_description);
        } else if (intValue != 6) {
            str = getString(C0126R.string.auth_account_removed_default_description, new Object[]{getString(C0126R.string.auth_account_start_over_and_signin_again)});
        } else {
            str = getString(C0126R.string.auth_account_removed_restricted_by_admin_description);
        }
        textView.setText(str);
        if (!(intValue == 5 || intValue == 6)) {
            Button button = this.f11432c.mo71377c().f151533a;
            button.setCompoundDrawables(null, null, null, null);
            String string = getString(C0126R.string.auth_remove_account_start_over);
            button.setText(string);
            button.setContentDescription(string);
        }
        this.f11432c.mo71377c().f151534b.setVisibility(4);
    }

    /* renamed from: a */
    public final void mo7768a() {
        mo7874a(-1, null);
    }
}
