package com.google.android.gms.tapandpay.tokenization;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.text.Html;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.IssuerInfo;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class VerificationMethodView extends LinearLayout implements Checkable {

    /* renamed from: h */
    private static final srn f108927h = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: i */
    private static final SparseIntArray f108928i;

    /* renamed from: j */
    private static final SparseIntArray f108929j;

    /* renamed from: a */
    public btjx f108930a;

    /* renamed from: b */
    public String f108931b;

    /* renamed from: c */
    public CardInfo f108932c;

    /* renamed from: d */
    public Intent f108933d;

    /* renamed from: e */
    public String f108934e;

    /* renamed from: f */
    public int f108935f = -1;

    /* renamed from: g */
    public Boolean f108936g;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(1, C0126R.string.tp_sms_method_label);
        sparseIntArray.put(2, C0126R.string.common_email);
        sparseIntArray.put(3, C0126R.string.tp_place_call_method_label);
        sparseIntArray.put(4, C0126R.string.tp_receive_call_method_label);
        sparseIntArray.put(5, C0126R.string.tp_web_url_method_label);
        sparseIntArray.put(6, C0126R.string.tp_app_method_label);
        sparseIntArray.put(7, C0126R.string.tp_issuer_statement_method_label);
        f108928i = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        sparseIntArray2.put(3, C0126R.string.tp_place_call_method_label_paypal);
        f108929j = sparseIntArray2;
    }

    public VerificationMethodView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public static Intent m93294a(btjx btjx, String str, Context context) {
        btka btka;
        btka btka2;
        btka btka3;
        btka btka4;
        btka btka5;
        btka btka6;
        btnv a = btnv.m116964a(btjx.f149197d);
        if (a == null) {
            a = btnv.UNRECOGNIZED;
        }
        if (a != btnv.APP) {
            return null;
        }
        if (btjx.f149194a == 5) {
            btka = (btka) btjx.f149195b;
        } else {
            btka = btka.f149211f;
        }
        Intent intent = new Intent(btka.f149213a);
        if (btjx.f149194a == 5) {
            btka2 = (btka) btjx.f149195b;
        } else {
            btka2 = btka.f149211f;
        }
        Intent addCategory = intent.setPackage(btka2.f149214b).addCategory("android.intent.category.DEFAULT");
        bnsl a2 = f108927h.mo26019b(aske.m74275a());
        a2.mo68432a("com.google.android.gms.tapandpay.tokenization.VerificationMethodView", "a", 278, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        if (btjx.f149194a == 5) {
            btka3 = (btka) btjx.f149195b;
        } else {
            btka3 = btka.f149211f;
        }
        String str2 = btka3.f149214b;
        if (btjx.f149194a == 5) {
            btka4 = (btka) btjx.f149195b;
        } else {
            btka4 = btka.f149211f;
        }
        a2.mo68424a("Creating issuer app intent with package %s and action %s", str2, btka4.f149213a);
        if (btjx.f149194a == 5) {
            btka5 = (btka) btjx.f149195b;
        } else {
            btka5 = btka.f149211f;
        }
        if (!stm.m36302d(btka5.f149215c)) {
            if (btjx.f149194a == 5) {
                btka6 = (btka) btjx.f149195b;
            } else {
                btka6 = btka.f149211f;
            }
            addCategory.putExtra("android.intent.extra.TEXT", btka6.f149215c);
            addCategory.putExtra("extra_wallet_id", str);
        }
        if (context.getPackageManager().resolveActivity(addCategory, 0) != null) {
            return addCategory;
        }
        return null;
    }

    public final boolean isChecked() {
        return ((RadioButton) findViewById(C0126R.C0129id.RadioButton)).isChecked();
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(isChecked());
    }

    public final void setChecked(boolean z) {
        ((RadioButton) findViewById(C0126R.C0129id.RadioButton)).setChecked(z);
    }

    public final void toggle() {
        ((RadioButton) findViewById(C0126R.C0129id.RadioButton)).toggle();
    }

    public VerificationMethodView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VerificationMethodView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public final boolean mo59487a() {
        String str;
        btln btln;
        boolean z;
        btka btka;
        btka btka2;
        IssuerInfo issuerInfo;
        btnv btnv = btnv.UNKNOWN_ACTIVATION_METHOD_TYPE;
        btnv a = btnv.m116964a(this.f108930a.f149197d);
        if (a == null) {
            a = btnv.UNRECOGNIZED;
        }
        String str2 = "";
        switch (a.ordinal()) {
            case 1:
                str2 = getResources().getString(C0126R.string.tp_sms_message_rates_label);
                str = this.f108930a.f149198e;
                break;
            case 2:
            case 4:
                str = this.f108930a.f149198e;
                break;
            case 3:
                Intent addCategory = new Intent("android.intent.action.DIAL", Uri.parse(this.f108930a.f149199f)).addCategory("android.intent.category.DEFAULT");
                if (getContext().getPackageManager().resolveActivity(addCategory, 0) == null) {
                    this.f108934e = getResources().getString(C0126R.string.tp_non_telephony_label);
                } else {
                    this.f108933d = addCategory;
                }
                str = this.f108930a.f149198e;
                break;
            case 5:
                this.f108933d = new Intent("android.intent.action.VIEW", Uri.parse(this.f108930a.f149199f));
                str = this.f108930a.f149198e;
                break;
            case 6:
                CardInfo cardInfo = this.f108932c;
                String string = (cardInfo == null || (issuerInfo = cardInfo.f108350k) == null || TextUtils.isEmpty(issuerInfo.f108388a)) ? getResources().getString(C0126R.string.tp_issuer_name_placeholder) : this.f108932c.f108350k.f108388a;
                Intent a2 = m93294a(this.f108930a, this.f108931b, getContext());
                if (a2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                Boolean valueOf = Boolean.valueOf(z);
                this.f108936g = valueOf;
                if (!valueOf.booleanValue()) {
                    Context context = getContext();
                    btjx btjx = this.f108930a;
                    if (btjx.f149194a == 5) {
                        btka = (btka) btjx.f149195b;
                    } else {
                        btka = btka.f149211f;
                    }
                    String str3 = btka.f149214b;
                    btjx btjx2 = this.f108930a;
                    if (btjx2.f149194a == 5) {
                        btka2 = (btka) btjx2.f149195b;
                    } else {
                        btka2 = btka.f149211f;
                    }
                    this.f108933d = atvg.m76454a(context, str3, btka2.f149217e, true);
                    str = getResources().getString(C0126R.string.tp_app_method_value_app_absent, string);
                    this.f108935f = 302;
                    break;
                } else {
                    str = getResources().getString(C0126R.string.tp_app_method_value_app_present, string);
                    this.f108933d = a2;
                    this.f108935f = ErrorInfo.TYPE_FSC_HTTP_ERROR;
                    break;
                }
            case 7:
                str = getResources().getString(C0126R.string.tp_issuer_statement_method_description);
                break;
            default:
                return false;
        }
        btnv a3 = btnv.m116964a(this.f108930a.f149197d);
        if (a3 == null) {
            a3 = btnv.UNRECOGNIZED;
        }
        int a4 = a3.mo3214a();
        int i = f108928i.get(a4);
        if (atyj.m76564a(this.f108932c) && f108929j.get(a4) != 0) {
            i = f108929j.get(a4);
        }
        if (i == 0) {
            return false;
        }
        TextView textView = (TextView) findViewById(C0126R.C0129id.VerificationMethodLabel);
        btnv a5 = btnv.m116964a(this.f108930a.f149197d);
        if (a5 == null) {
            a5 = btnv.UNRECOGNIZED;
        }
        if (a5 == btnv.ISSUER_STATEMENT) {
            btjx btjx3 = this.f108930a;
            if (btjx3.f149194a != 7 || ((btln) btjx3.f149195b).f149397a == null) {
                return false;
            }
            Resources resources = getResources();
            Object[] objArr = new Object[1];
            btjx btjx4 = this.f108930a;
            if (btjx4.f149194a == 7) {
                btln = (btln) btjx4.f149195b;
            } else {
                btln = btln.f149395c;
            }
            btnd btnd = btln.f149397a;
            if (btnd == null) {
                btnd = btnd.f149596c;
            }
            objArr[0] = beps.m95418a(btnd);
            textView.setText(Html.fromHtml(resources.getString(i, objArr)));
        } else {
            textView.setText(getResources().getString(i));
        }
        ((TextView) findViewById(C0126R.C0129id.VerificationMethodDetailsLabel)).setText(str);
        TextView textView2 = (TextView) findViewById(C0126R.C0129id.VerificationMethodSubLabel);
        if (!TextUtils.isEmpty(str2)) {
            textView2.setText(str2);
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
        return true;
    }
}
