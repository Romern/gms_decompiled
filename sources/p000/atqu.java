package p000;

import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity;
import com.google.android.gms.tapandpay.tokenization.VerificationMethodView;

/* renamed from: atqu */
public final /* synthetic */ class atqu implements View.OnClickListener {

    /* renamed from: a */
    private final SelectVerificationMethodChimeraActivity f90689a;

    public atqu(SelectVerificationMethodChimeraActivity selectVerificationMethodChimeraActivity) {
        this.f90689a = selectVerificationMethodChimeraActivity;
    }

    public void onClick(View view) {
        String str;
        String str2;
        char c;
        SelectVerificationMethodChimeraActivity selectVerificationMethodChimeraActivity = this.f90689a;
        VerificationMethodView l = selectVerificationMethodChimeraActivity.mo59472l();
        if (l != null) {
            btjx btjx = l.f108930a;
            btnv a = btnv.m116964a(btjx.f149197d);
            if (a == null) {
                a = btnv.UNRECOGNIZED;
            }
            if (a != btnv.SMS || !cgya.m147550b() || C1133kh.m17835a(selectVerificationMethodChimeraActivity, "android.permission.RECEIVE_SMS") != 0) {
                selectVerificationMethodChimeraActivity.f108868i = false;
                selectVerificationMethodChimeraActivity.mo59460a(l, (Boolean) null);
            } else if (!cgwn.f187872a.mo6606a().mo84593H()) {
                btnv a2 = btnv.m116964a(btjx.f149197d);
                if (a2 == null) {
                    a2 = btnv.UNRECOGNIZED;
                }
                if (a2 == btnv.SMS) {
                    str = SelectVerificationMethodChimeraActivity.m93240a(btjx.f149198e);
                } else {
                    str = null;
                }
                TelephonyManager telephonyManager = (TelephonyManager) selectVerificationMethodChimeraActivity.getSystemService("phone");
                if (!TextUtils.isEmpty(null)) {
                    str2 = null;
                } else {
                    str2 = telephonyManager != null ? telephonyManager.getLine1Number() : null;
                }
                String a3 = SelectVerificationMethodChimeraActivity.m93240a(str2);
                if (str == null || a3 == null) {
                    bnsl bnsl = (bnsl) SelectVerificationMethodChimeraActivity.f108854b.mo68387b();
                    bnsl.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity", "a", 940, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("couldn't extract numbers");
                    c = 1;
                } else {
                    long a4 = cgxo.f187982a.mo6606a().mo84687a();
                    if (((long) str.length()) < a4 || ((long) a3.length()) < a4) {
                        c = 1;
                    } else {
                        int min = Math.min(str.length(), a3.length());
                        c = !SelectVerificationMethodChimeraActivity.m93241a(str, min).equals(SelectVerificationMethodChimeraActivity.m93241a(a3, min)) ? (char) 2 : 3;
                    }
                }
                if (c == 1) {
                    selectVerificationMethodChimeraActivity.f108867h.mo49763d(122);
                    selectVerificationMethodChimeraActivity.f108868i = false;
                    selectVerificationMethodChimeraActivity.mo59460a(l, (Boolean) null);
                } else if (c != 2) {
                    selectVerificationMethodChimeraActivity.f108867h.mo49763d(121);
                    selectVerificationMethodChimeraActivity.mo59473m();
                } else {
                    selectVerificationMethodChimeraActivity.f108867h.mo49763d(123);
                    auar auar = new auar();
                    auar.f91333a = 205;
                    auar.f91334b = selectVerificationMethodChimeraActivity.getString(C0126R.string.tp_another_phone_title);
                    auar.f91335c = selectVerificationMethodChimeraActivity.getString(C0126R.string.tp_another_phone_text);
                    auar.f91336d = selectVerificationMethodChimeraActivity.getString(C0126R.string.common_got_it);
                    auar.f91340h = bpan.DIFFERENT_PHONE_NUMBER;
                    auar.f91341i = selectVerificationMethodChimeraActivity.f108864e;
                    auar.mo50344a().show(selectVerificationMethodChimeraActivity.getSupportFragmentManager(), "SelectVerificationActy.differentPhoneDialog");
                }
            } else {
                selectVerificationMethodChimeraActivity.mo59473m();
            }
        }
    }
}
