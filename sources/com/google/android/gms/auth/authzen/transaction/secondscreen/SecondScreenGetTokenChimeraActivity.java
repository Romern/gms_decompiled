package com.google.android.gms.auth.authzen.transaction.secondscreen;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SecondScreenGetTokenChimeraActivity extends Activity {
    static {
        new sek("SecondScreenGetTokenChimeraActivity");
    }

    /* renamed from: a */
    public static Intent m6534a(bypc bypc, String str, byte[] bArr, Intent intent) {
        sdo.m34959a(bypc);
        sdo.m34977c(str);
        Intent intent2 = new Intent();
        intent2.putExtra("token_intent", intent);
        intent2.putExtra("account", str);
        intent2.putExtra("tx_request", bypc.mo73642k());
        intent2.putExtra("encryption_key_handle", bArr);
        intent2.addFlags(268435456).addFlags(134217728).addFlags(8388608).addFlags(4).addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE).addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE);
        intent2.setClassName(rpr.m34216b(), "com.google.android.gms.auth.authzen.transaction.secondscreen.SecondScreenGetTokenActivity");
        return intent2;
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 10) {
            byoo byoo = byoo.NO_RESPONSE_SELECTED;
            if (i2 == -1) {
                byoo = byoo.APPROVE_SELECTED;
            } else if (i2 == 0) {
                byoo = byoo.REJECT_SELECTED;
            }
            SecondScreenIntentOperation.m6536a(this, getIntent(), byoo);
        }
    }

    public final void onCreate(Bundle bundle) {
        Intent intent;
        super.onCreate(bundle);
        Intent intent2 = getIntent();
        if (intent2 != null && intent2.getExtras() != null && (intent = (Intent) intent2.getExtras().getParcelable("token_intent")) != null) {
            startActivityForResult(intent, 10);
        }
    }
}
