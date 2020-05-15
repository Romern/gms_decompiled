package p000;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.autofill.data.PaymentCard;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* renamed from: llz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class llz extends lim {

    /* renamed from: d */
    public static final srn f26337d = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: e */
    public final bqgj f26338e;

    /* renamed from: f */
    public final kuw f26339f;

    /* renamed from: g */
    public final PaymentCard f26340g;

    /* renamed from: h */
    public final boolean f26341h;

    /* renamed from: i */
    public final boolean f26342i;

    /* renamed from: j */
    public final byte[] f26343j;

    /* renamed from: k */
    final ProgressBar f26344k;

    /* renamed from: l */
    final LinearLayout f26345l;

    /* renamed from: m */
    final TextInputLayout f26346m;

    /* renamed from: n */
    final EditText f26347n;

    /* renamed from: o */
    final TextInputLayout f26348o;

    /* renamed from: p */
    final EditText f26349p;

    /* renamed from: q */
    final TextView f26350q;

    /* renamed from: r */
    final C1350sh f26351r;

    /* renamed from: s */
    public boolean f26352s;

    /* renamed from: t */
    public boolean f26353t;

    /* renamed from: u */
    private final Executor f26354u = new lly();

    /* renamed from: v */
    private final kre f26355v;

    /* renamed from: w */
    private final lrc f26356w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public llz(lir lir, Bundle bundle, bngx bngx) {
        super(lir, bundle, bngx);
        CharSequence charSequence;
        bqgj a = bqgs.m112811a(adzl.f62962b.mo25874a());
        kre a2 = krc.m18382a(this.f26159a);
        this.f26355v = a2;
        this.f26339f = a2.mo14825a(this.f26159a);
        this.f26356w = lrc.m19570a(this.f26159a);
        this.f26352s = true;
        this.f26353t = false;
        this.f26338e = a;
        lir.setTheme(2132019644);
        ArrayList<String> stringArrayList = bundle.getStringArrayList("com.google.android.gms.autofill.extra.FIX_FLOW_COMPONENT");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            throw new lik("Components to fix can not be null.");
        }
        HashSet hashSet = new HashSet();
        int size = stringArrayList.size();
        for (int i = 0; i < size; i++) {
            hashSet.add(lin.m19186a(stringArrayList.get(i)));
        }
        if (!hashSet.isEmpty()) {
            this.f26341h = hashSet.contains(lin.EXPIRATION_DATE);
            this.f26342i = hashSet.contains(lin.CARD_HOLDER_NAME);
            PaymentCard paymentCard = (PaymentCard) lqx.m19548a(bundle.getBundle("com.google.android.gms.autofill.extra.PAYMENT_CARD"));
            if (paymentCard != null) {
                this.f26340g = paymentCard;
                byte[] byteArray = bundle.getByteArray("android.view.autofill.extra.CLIENT_STATE");
                if (byteArray == null || byteArray.length == 0) {
                    throw new lik("Payments session data must be present.");
                }
                this.f26343j = byteArray;
                View inflate = lir.getLayoutInflater().inflate((int) C0126R.C0128layout.payments_fix_flow_dialog_content, (ViewGroup) null);
                View findViewById = inflate.findViewById(C0126R.C0129id.separator_view);
                this.f26344k = (ProgressBar) inflate.findViewById(C0126R.C0129id.progress_bar);
                this.f26345l = (LinearLayout) inflate.findViewById(C0126R.C0129id.input_container);
                this.f26346m = (TextInputLayout) inflate.findViewById(C0126R.C0129id.expiration_date_text_input_layout);
                EditText editText = (EditText) inflate.findViewById(C0126R.C0129id.expiration_date_edit_text);
                this.f26347n = editText;
                editText.addTextChangedListener(new llx(editText, new lln(this)));
                if (!this.f26341h) {
                    this.f26346m.setVisibility(8);
                    findViewById.setVisibility(8);
                }
                this.f26348o = (TextInputLayout) inflate.findViewById(C0126R.C0129id.cardholder_name_text_input_layout);
                this.f26349p = (EditText) inflate.findViewById(C0126R.C0129id.cardholder_name_edit_text);
                this.f26350q = (TextView) inflate.findViewById(C0126R.C0129id.cardholder_name_subtext);
                EditText editText2 = this.f26349p;
                editText2.addTextChangedListener(new llx(editText2, new llo(this)));
                if (!this.f26342i) {
                    this.f26348o.setVisibility(8);
                    this.f26350q.setVisibility(8);
                    findViewById.setVisibility(8);
                }
                String str = paymentCard.f11613a.f23889a;
                String valueOf = String.valueOf(lra.m19564a(lir, paymentCard.f11618f));
                String substring = str.substring(str.length() - 4);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(substring).length());
                sb.append(valueOf);
                sb.append("-");
                sb.append(substring);
                String sb2 = sb.toString();
                if (!this.f26341h) {
                    charSequence = this.f26356w.mo15385a(C0126R.string.autofill_payments_fix_flow_title_name, sb2);
                } else if (this.f26342i) {
                    charSequence = this.f26356w.mo15385a(C0126R.string.autofill_payments_fix_flow_title_all, sb2);
                } else {
                    charSequence = this.f26356w.mo15385a(C0126R.string.autofill_payments_fix_flow_title_exp_date, sb2);
                }
                bhia bhia = new bhia(lir);
                bhia.f118696a = lir.getDrawable(C0126R.C0127drawable.material_alert_background);
                bhia.mo63788d(charSequence);
                bhia.mo63787d(inflate);
                bhia.mo63789d(this.f26356w.mo15386b(C0126R.string.common_save), new llp(this));
                bhia.mo63784c(this.f26356w.mo15386b(C0126R.string.common_cancel), new llq(this));
                bhia.mo63778b(new llr(this));
                C1350sh b = bhia.mo15904b();
                this.f26351r = b;
                b.setOnShowListener(new lls(this));
                if (bundle.containsKey("PaymentFixFlowActivityController::expiration_date")) {
                    this.f26347n.setText(bundle.getCharSequence("PaymentFixFlowActivityController::expiration_date"));
                }
                if (bundle.containsKey("PaymentFixFlowActivityController::cardholder_name")) {
                    this.f26349p.setText(bundle.getCharSequence("PaymentFixFlowActivityController::cardholder_name"));
                    return;
                }
                return;
            }
            throw new lik("Payment card to fix can not be null.");
        }
        throw new lik("Components to fix can not be empty.");
    }

    /* renamed from: l */
    private final void m19344l() {
        this.f26351r.show();
        mo15265k();
    }

    /* renamed from: a */
    public final void mo15164a() {
        if (this.f26160b.containsKey("PaymentFixFlowActivityController::cardholder_name")) {
            mo15263i();
            m19344l();
            return;
        }
        bqgg a = liw.m19221a(this.f26159a).mo15186a((lis) new llv(this));
        this.f26344k.setVisibility(0);
        this.f26345l.setVisibility(8);
        this.f26353t = true;
        m19344l();
        bqga.m112781a(a, new llw(this), this.f26354u);
    }

    /* renamed from: h */
    public final void mo15262h() {
        this.f26352s = false;
        InputMethodManager inputMethodManager = (InputMethodManager) this.f26159a.getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        if (this.f26341h) {
            this.f26347n.requestFocus();
            inputMethodManager.showSoftInput(this.f26347n, 1);
        } else if (this.f26342i && TextUtils.isEmpty(this.f26349p.getText())) {
            this.f26349p.requestFocus();
            inputMethodManager.showSoftInput(this.f26349p, 1);
        }
    }

    /* renamed from: i */
    public final void mo15263i() {
        this.f26344k.setVisibility(8);
        this.f26345l.setVisibility(0);
        this.f26353t = false;
    }

    /* renamed from: j */
    public final void mo15264j() {
        mo15165a(0);
        this.f26159a.overridePendingTransition(0, C0126R.anim.fragment_fade_exit);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: k */
    public final void mo15265k() {
        boolean z;
        Button a;
        boolean z2 = false;
        if (this.f26341h) {
            String obj = this.f26347n.getText().toString();
            String str = null;
            if (obj.trim().isEmpty()) {
                str = this.f26159a.getString(C0126R.string.autofill_payments_fix_flow_exp_data_required);
            } else {
                String replaceAll = obj.replaceAll("[^\\d]", "");
                if (replaceAll.length() == 4) {
                    int parseInt = Integer.parseInt(replaceAll.substring(0, 2));
                    int parseInt2 = Integer.parseInt(replaceAll.substring(2, 4));
                    Calendar instance = Calendar.getInstance();
                    int i = instance.get(1) % 1000;
                    if (parseInt > 0 && parseInt <= 12 && parseInt2 - i <= 20) {
                        int i2 = instance.get(2);
                        if (parseInt2 < i || (parseInt2 == i && parseInt < i2)) {
                            str = this.f26159a.getString(C0126R.string.autofill_payments_fix_flow_exp_date_expired);
                        }
                    } else {
                        str = this.f26159a.getString(C0126R.string.autofill_payments_fix_flow_exp_date_invalid);
                    }
                } else {
                    str = this.f26159a.getString(C0126R.string.autofill_payments_fix_flow_exp_date_invalid);
                }
            }
            if (str != null) {
                this.f26346m.mo71272c(str);
                this.f26346m.mo71266b(true);
                z = false;
            } else {
                this.f26346m.mo71266b(false);
                z = true;
            }
        } else {
            z = true;
        }
        if (this.f26342i) {
            if (this.f26349p.getText().toString().trim().isEmpty()) {
                this.f26348o.mo71272c(this.f26159a.getString(C0126R.string.autofill_payments_fix_flow_cardholder_name_required));
                this.f26348o.mo71266b(true);
                a = this.f26351r.mo15913a(-1);
                if (a == null) {
                    a.setEnabled(z2);
                    return;
                }
                return;
            }
            this.f26348o.mo71266b(false);
        }
        z2 = z;
        a = this.f26351r.mo15913a(-1);
        if (a == null) {
        }
    }
}
