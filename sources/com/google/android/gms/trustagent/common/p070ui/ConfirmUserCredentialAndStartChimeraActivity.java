package com.google.android.gms.trustagent.common.p070ui;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.chimera.Activity;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: com.google.android.gms.trustagent.common.ui.ConfirmUserCredentialAndStartChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ConfirmUserCredentialAndStartChimeraActivity extends Activity {

    /* renamed from: a */
    public static final aumh f109159a = new aupd();

    /* renamed from: b */
    private Intent f109160b;

    /* renamed from: c */
    private bogq f109161c;

    /* renamed from: a */
    public static Intent m93423a(Context context, Intent intent) {
        Intent intent2 = new Intent();
        intent2.setClassName(context, "com.google.android.gms.trustagent.ConfirmUserCredentialAndStartActivity");
        intent2.putExtra("google.gmscore.auth.confirm_user_credentials.INTENT_TO_START", intent);
        intent2.setFlags(67108864);
        return intent2;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            Log.i("Coffee-ConfirmCred", "User authenticated, starting intent.");
            m93424a(42);
            startActivity(this.f109160b);
        } else {
            Log.i("Coffee-ConfirmCred", "User failed to authenticate.");
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = (Intent) getIntent().getParcelableExtra("google.gmscore.auth.confirm_user_credentials.INTENT_TO_START");
        this.f109160b = intent;
        if (intent == null) {
            Log.e("Coffee-ConfirmCred", "No intent to start specified in activity, exiting.");
            finish();
        }
        String stringExtra = getIntent().getStringExtra("google.gmscore.auth.confirm_user_credentials.TITLE");
        String stringExtra2 = getIntent().getStringExtra("google.gmscore.auth.confirm_user_credentials.DETAILS");
        this.f109161c = bogq.m111182a(this.f109160b.getIntExtra("notification_type_key", -1));
        Intent intent2 = new Intent("android.app.action.CONFIRM_DEVICE_CREDENTIAL");
        intent2.putExtra("android.app.extra.TITLE", stringExtra);
        intent2.putExtra("android.app.extra.DESCRIPTION", stringExtra2);
        try {
            startActivityForResult(intent2, 0);
            m93424a(21);
        } catch (ActivityNotFoundException e) {
            Log.e("Coffee-ConfirmCred", "Activity to check user credential not found.");
            finish();
        }
    }

    /* renamed from: a */
    private final void m93424a(int i) {
        bogj bogj = (bogj) bohi.f133070z.mo74144da();
        if (bogj.f164950c) {
            bogj.mo74035c();
            bogj.f164950c = false;
        }
        bohi bohi = (bohi) bogj.f164949b;
        bohi.f133088r = i - 1;
        bohi.f133071a |= 4096;
        if (this.f109161c != null) {
            bxvd da = bogm.f133003e.mo74144da();
            bogq bogq = this.f109161c;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bogm bogm = (bogm) da.f164949b;
            bogm.f133006b = bogq.f133019h;
            int i2 = bogm.f133005a | 1;
            bogm.f133005a = i2;
            bogm.f133007c = 4;
            bogm.f133005a = i2 | 2;
            bogj.mo68908a((bogm) da.mo74062i());
        }
        String stringExtra = this.f109160b.getStringExtra("extra_intent_from");
        if (stringExtra != null) {
            if (bogj.f164950c) {
                bogj.mo74035c();
                bogj.f164950c = false;
            }
            bohi bohi2 = (bohi) bogj.f164949b;
            stringExtra.getClass();
            bohi2.f133071a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
            bohi2.f133093w = stringExtra;
        }
        aupk.m77567a(this, (bohi) bogj.mo74062i());
    }
}
