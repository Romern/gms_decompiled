package com.google.android.gms.wallet.p081ib;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.PaymentData;

/* renamed from: com.google.android.gms.wallet.ib.PaisaCompatChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PaisaCompatChimeraActivity extends Activity {
    /* renamed from: a */
    private final void m94002a(int i) {
        Intent intent = new Intent();
        awah.m79565a(intent, new Status(i));
        m94003a(1, intent);
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 501) {
            m94002a(8);
        } else if (i2 == -1) {
            PaymentData a = PaymentData.m93792a(intent.getStringExtra("paymentDataJson"));
            Intent intent2 = new Intent();
            a.mo59766a(intent2);
            m94003a(-1, intent2);
        } else if (i2 == 0) {
            m94003a(0, null);
        } else if (i2 != 1) {
            m94002a(8);
        } else {
            Integer num = 8;
            if (intent != null) {
                num = Integer.valueOf(intent.getIntExtra("errorCode", 8));
            }
            int intValue = num.intValue();
            if (intValue == 8 || intValue == 10 || intValue == 405 || intValue == 409 || intValue == 412) {
                m94002a(intValue);
            } else {
                m94002a(8);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            String str = (String) awie.f94413i.mo58455c();
            if (TextUtils.isEmpty(str)) {
                m94002a(8);
            }
            Intent intent = new Intent("com.google.android.apps.nbu.paisa.user.LOAD_PAYMENT_DATA");
            intent.setPackage(str);
            intent.putExtras((Bundle) awsp.m80966a(Bundle.CREATOR, getIntent().getStringExtra("transformedExtras")));
            startActivityForResult(intent, 501);
        }
    }

    /* renamed from: a */
    private final void m94003a(int i, Intent intent) {
        setResult(i, intent);
        finish();
    }
}
