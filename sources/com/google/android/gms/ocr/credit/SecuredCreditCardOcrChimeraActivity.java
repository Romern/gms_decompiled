package com.google.android.gms.ocr.credit;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.gms.ocr.CreditCardOcrResult;
import com.google.android.gms.ocr.credit.base.CreditCardResult;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SecuredCreditCardOcrChimeraActivity extends aksn {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo39809a(Intent intent, int i) {
        CreditCardResult creditCardResult;
        Intent b = aksq.m60383b(this.f72646a);
        if (!this.f72648c) {
            if (!(intent == null || (creditCardResult = (CreditCardResult) intent.getParcelableExtra("CREDIT_CARD_OCR_RESULT")) == null)) {
                b.putExtra("com.google.android.gms.ocr.CREDIT_CARD_OCR_RESULT", aksq.m60380a(creditCardResult));
            }
        } else if (intent == null) {
            b.putExtra("com.google.android.gms.ocr.CREDIT_CARD_OCR_RESULT", aksq.m60379a(mo39807a(this.f72647b).f81257c, i));
        } else {
            b.putExtra("com.google.android.gms.ocr.CREDIT_CARD_OCR_RESULT", (CreditCardOcrResult) intent.getParcelableExtra("CREDIT_CARD_OCR_RESULT"));
        }
        setResult(i, b);
        finish();
    }

    public final void onBackPressed() {
        Intent b = aksq.m60383b(this.f72646a);
        if (this.f72648c) {
            b.putExtra("com.google.android.gms.ocr.CREDIT_CARD_OCR_RESULT", aksq.m60379a(mo39807a(this.f72647b).f81257c, 0));
        }
        setResult(0, b);
        super.onBackPressed();
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        spn.m35870c((Activity) this);
        boolean z3 = false;
        int intExtra = getIntent().getIntExtra("com.google.android.gms.ocr.THEME", 0);
        Intent intent = getIntent();
        if (intExtra == 0) {
            z = true;
        } else {
            z = intExtra == 2;
        }
        intent.putExtra("FULLSCREEN_MODE", z);
        Intent intent2 = getIntent();
        if (intExtra == 1) {
            z2 = true;
        } else {
            z2 = intExtra == 0;
        }
        intent2.putExtra("USE_BRANDED_UI", z2);
        int intExtra2 = getIntent().getIntExtra("com.google.android.gms.ocr.NIGHT_MODE", 0);
        Intent intent3 = getIntent();
        if (intExtra2 == 1) {
            z3 = true;
        } else if (intExtra2 == 2 && (getResources().getConfiguration().uiMode & 48) == 32) {
            z3 = true;
        }
        intent3.putExtra("NIGHT_MODE", z3);
        super.onCreate(bundle);
    }
}
