package com.google.android.gms.tapandpay.tokenization;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AddNewCardThroughBrowserChimeraActivity extends atex {

    /* renamed from: b */
    public static boolean f108766b = true;

    /* renamed from: d */
    private static final srn f108767d = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: c */
    atam f108768c;

    /* renamed from: e */
    private boolean f108769e = false;

    /* renamed from: f */
    private AccountInfo f108770f;

    /* renamed from: g */
    private String f108771g = "";

    /* renamed from: h */
    private int f108772h = 1;

    /* renamed from: i */
    private int f108773i;

    /* renamed from: e */
    private final atam m93207e() {
        atam atam = this.f108768c;
        return atam == null ? new atam(this, this.f108770f) : atam;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f108771g = bundle.getString("state_browser_package_name");
        }
        AccountInfo accountInfo = (AccountInfo) getIntent().getParcelableExtra("extra_account_info");
        this.f108770f = accountInfo;
        if (accountInfo == null || TextUtils.isEmpty(accountInfo.f108326b)) {
            bnsl bnsl = (bnsl) f108767d.mo68388c();
            bnsl.mo68432a("com.google.android.gms.tapandpay.tokenization.AddNewCardThroughBrowserChimeraActivity", "onCreate", 96, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Missing accountInfo, finishing");
            setResult(0);
            finish();
            return;
        }
        int a = boxl.m111640a(getIntent().getIntExtra("extra_payment_method_type", 0));
        if (a == 0) {
            a = 1;
        }
        this.f108772h = a;
        int b = btmp.m116929b(getIntent().getIntExtra("tokenizable_type", 0));
        if (b == 0) {
            b = 2;
        }
        this.f108773i = b;
        this.f108768c = m93207e();
        if (bundle == null) {
            if (f108766b) {
                if (getCallingActivity() != null) {
                    if (!getCallingActivity().getPackageName().equals("com.google.android.gms")) {
                        getCallingActivity().getPackageName();
                    }
                }
                setResult(0);
                finish();
                return;
            }
            String stringExtra = getIntent().getStringExtra("extra_url");
            if (TextUtils.isEmpty(stringExtra)) {
                setResult(0);
                finish();
                return;
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(stringExtra));
            ResolveInfo resolveActivity = getPackageManager().resolveActivity(intent, 0);
            if (resolveActivity != null) {
                if (resolveActivity.activityInfo != null) {
                    str = resolveActivity.activityInfo.packageName;
                } else {
                    str = "";
                }
                this.f108771g = str;
                startActivity(intent);
                atam e = m93207e();
                String str2 = this.f108771g;
                int i = this.f108772h;
                int i2 = this.f108773i;
                bxvd g = e.mo49765g(36);
                bxvd da = boxn.f135262g.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boxn boxn = (boxn) da.f164949b;
                str2.getClass();
                boxn.f135264a = 1 | boxn.f135264a;
                boxn.f135265b = str2;
                boxn.m111642a(boxn);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boxn boxn2 = (boxn) da.f164949b;
                int i3 = i - 1;
                if (i != 0) {
                    boxn2.f135268e = i3;
                    boxn2.f135264a |= 16;
                    int f = atam.m75297f(i2);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    boxn boxn3 = (boxn) da.f164949b;
                    boxn3.f135269f = f - 1;
                    boxn3.f135264a |= 32;
                    if (g.f164950c) {
                        g.mo74035c();
                        g.f164950c = false;
                    }
                    bpbx bpbx = (bpbx) g.f164949b;
                    boxn boxn4 = (boxn) da.mo74062i();
                    bpbx bpbx2 = bpbx.f135635S;
                    boxn4.getClass();
                    bpbx.f135671q = boxn4;
                    bpbx.f135655a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                    e.mo49741a((bpbx) g.mo74062i());
                    return;
                }
                throw null;
            }
            setResult(0);
            finish();
            return;
        }
        this.f108769e = true;
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        String str;
        super.onNewIntent(intent);
        Intent intent2 = new Intent();
        intent2.setData(intent.getData());
        if (intent.getData() == null || intent.getData().getPathSegments() == null || intent.getData().getPathSegments().isEmpty()) {
            if (intent.getData() != null) {
                str = intent.getData().toString();
            } else {
                str = "";
            }
            m93207e().mo49750a(this.f108771g, this.f108772h, this.f108773i, 1, str);
            setResult(0);
            finish();
            return;
        }
        List<String> pathSegments = intent.getData().getPathSegments();
        String str2 = pathSegments.get(pathSegments.size() - 1);
        if ("success".equalsIgnoreCase(str2)) {
            m93207e().mo49750a(this.f108771g, this.f108772h, this.f108773i, 4, intent.getData().toString());
            setResult(-1, intent2);
            finish();
        } else if ("failure".equalsIgnoreCase(str2)) {
            m93207e().mo49750a(this.f108771g, this.f108772h, this.f108773i, 3, intent.getData().toString());
            setResult(1, intent2);
            finish();
        } else {
            m93207e().mo49750a(this.f108771g, this.f108772h, this.f108773i, 1, intent.getData().toString());
            setResult(0);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        this.f108769e = true;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        if (this.f108769e) {
            m93207e().mo49750a(this.f108771g, this.f108772h, this.f108773i, 2, "");
            setResult(2);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("state_browser_package_name", this.f108771g);
    }
}
