package com.google.android.gms.tapandpay.p068ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;

/* renamed from: com.google.android.gms.tapandpay.ui.WarmWelcomeChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WarmWelcomeChimeraActivity extends atex implements atxf, atxh {

    /* renamed from: d */
    private static final srn f108965d = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    atam f108966b;

    /* renamed from: c */
    boolean f108967c;

    /* renamed from: e */
    private AccountInfo f108968e;

    /* renamed from: f */
    private CardInfo f108969f;

    /* renamed from: a */
    public final void mo50300a(int i) {
        bxvd da = bpbx.f135635S.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpbx bpbx = (bpbx) da.f164949b;
        bpbx.f135657c = i - 1;
        bpbx.f135655a |= 1;
        this.f108966b.mo49741a((bpbx) da.mo74062i());
    }

    /* renamed from: e */
    public final void mo50299e() {
        if (!this.f108967c) {
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            if (getResources().getConfiguration().getLayoutDirection() == 0) {
                beginTransaction.setCustomAnimations(C0126R.animator.slide_in_right, C0126R.animator.slide_out_left, C0126R.animator.slide_in_left, C0126R.animator.slide_out_right);
            } else {
                beginTransaction.setCustomAnimations(C0126R.animator.slide_in_left, C0126R.animator.slide_out_right, C0126R.animator.slide_in_right, C0126R.animator.slide_out_left);
            }
            beginTransaction.replace(C0126R.C0129id.FragmentContainer, new atxb()).addToBackStack(null).commit();
            return;
        }
        startActivity(new Intent().setClassName(this, "com.google.android.gms.tapandpay.settings.TapAndPaySettingsActivity"));
        finish();
    }

    public final void onCreate(Bundle bundle) {
        bmum bmum;
        Fragment fragment;
        int a;
        super.onCreate(bundle);
        setContentView((int) C0126R.C0128layout.tp_warm_welcome_activity);
        setTheme(2132018962);
        AccountInfo accountInfo = (AccountInfo) getIntent().getParcelableExtra("extra_account_info");
        this.f108968e = accountInfo;
        if (accountInfo == null || TextUtils.isEmpty(accountInfo.f108326b)) {
            setResult(0);
            finish();
            return;
        }
        if (this.f108966b == null) {
            this.f108966b = new atam(this, this.f108968e);
        }
        if (bundle == null) {
            CardInfo cardInfo = (CardInfo) getIntent().getParcelableExtra("extra_card_info");
            this.f108969f = cardInfo;
            if (cardInfo == null || !cardInfo.mo59217a()) {
                byte[] byteArrayExtra = getIntent().getByteArrayExtra("extra_warm_welcome_info");
                bmuj bmuj = null;
                if (byteArrayExtra != null) {
                    try {
                        bmum = (bmum) bxvk.m124016a(bmum.f130943d, byteArrayExtra, bxus.m123744c());
                    } catch (bxwf e) {
                        bnsl bnsl = (bnsl) f108965d.mo68388c();
                        bnsl.mo68437a(e);
                        bnsl.mo68432a("com.google.android.gms.tapandpay.ui.WarmWelcomeChimeraActivity", "onCreate", 88, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("Failed to parse WarmWelcomeInfo proto");
                        bmum = null;
                    }
                } else {
                    bmum = null;
                }
                boolean booleanExtra = getIntent().getBooleanExtra("extra_is_web_push_provisioning", false);
                this.f108967c = booleanExtra;
                if (booleanExtra) {
                    fragment = atxg.m76497a(null);
                } else if (((Boolean) askd.f89110b.mo58455c()).booleanValue() && bmum != null && (a = bmul.m108394a(bmum.f130947c)) != 0 && a == 2) {
                    if ((bmum.f130945a & 1) != 0 && (bmuj = bmum.f130946b) == null) {
                        bmuj = bmuj.f130934f;
                    }
                    fragment = atxg.m76497a(bmuj);
                } else {
                    fragment = new atxb();
                }
                getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.FragmentContainer, fragment).commit();
                return;
            }
            int intExtra = getIntent().getIntExtra("felica_current_default_status", 0);
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            CardInfo cardInfo2 = this.f108969f;
            atwq atwq = new atwq();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("extra_card_info", cardInfo2);
            bundle2.putInt("felica_current_default_status", intExtra);
            atwq.setArguments(bundle2);
            beginTransaction.replace(C0126R.C0129id.FragmentContainer, atwq).commit();
        }
    }
}
