package p000;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.wallet.bender3.impl.p096ui.common.input.dateinput.DateInputEditText;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: bjpi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjpi extends bjjm implements bjph, bjop {

    /* renamed from: m */
    TextInputLayout f123084m;

    /* renamed from: o */
    DateInputEditText f123085o;

    public bjpi(bjgv bjgv) {
        super(bjgv, bjpe.class);
    }

    /* renamed from: E */
    private final void m104211E() {
        bjpf bjpf = (bjpf) ((bjhy) ((bjpe) ((bjjm) this).f122830n)).f122754m;
        DateInputEditText dateInputEditText = this.f123085o;
        String a = bjpj.m104222a(dateInputEditText.f151784c, dateInputEditText.f151782a, bjpf.f123076d, bjpf.f123077e, bjpf.f123078f);
        if (!TextUtils.equals(dateInputEditText.getText(), a)) {
            dateInputEditText.setText(a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo65302G() {
        m104211E();
    }

    /* renamed from: a */
    public final int mo65417a() {
        return C0126R.C0128layout.wallet_view_date_input_filled;
    }

    /* renamed from: b */
    public final int mo65418b() {
        return C0126R.C0128layout.wallet_view_date_input_outline;
    }

    /* renamed from: c */
    public final int mo65419c() {
        return C0126R.C0128layout.wallet_view_date_input_legacy;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo65306e(String str) {
        this.f123084m.mo71272c(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo65184p() {
        super.mo65184p();
        mo65177j(this.f123084m);
        this.f122685j.mo65355a(this.f123085o);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo65185q() {
        super.mo65185q();
        mo65192w();
        this.f122685j.mo65358b(this.f123085o);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65162a(bwxl bwxl, bwxl bwxl2) {
        super.mo65162a(bwxl, bwxl2);
        bxvj b = bxvk.m124025b(bwuw.f161081c);
        bwxl2.mo74135a(b);
        Object b2 = bwxl2.f164952m.mo73913b(b.f164958d);
        if (b2 == null) {
            b2 = b.f164956b;
        } else {
            b.mo74139a(b2);
        }
        int a = bwut.m122326a(((bwuw) b2).f161083a);
        if (a == 0) {
            a = 1;
        }
        TextInputLayout textInputLayout = (TextInputLayout) this.f122676a.f122692a.mo65227a().inflate(bjoq.m104173a(a, this), (ViewGroup) null);
        this.f123084m = textInputLayout;
        DateInputEditText dateInputEditText = (DateInputEditText) textInputLayout.f151297a;
        this.f123085o = dateInputEditText;
        String J = ((bjpe) ((bjjm) this).f122830n).mo65427J();
        List K = ((bjpe) ((bjjm) this).f122830n).mo65428K();
        dateInputEditText.f151788g = this;
        dateInputEditText.f151782a = K;
        dateInputEditText.f151784c = J;
        dateInputEditText.f151783b = Pattern.compile(J, 16);
        DateInputEditText dateInputEditText2 = this.f123085o;
        String valueOf = String.valueOf(((bjpe) ((bjjm) this).f122830n).mo65427J());
        dateInputEditText2.setKeyListener(new bjzd(valueOf.length() == 0 ? new String("0123456789") : "0123456789".concat(valueOf), 20));
        bjoq.m104174a(this.f123084m, this.f123085o, (bjon) ((bjjm) this).f122830n);
        m104211E();
    }
}
