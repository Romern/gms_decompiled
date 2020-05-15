package p000;

import android.support.p002v7.widget.AppCompatSpinner;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.SpinnerAdapter;
import com.felicanetworks.mfc.C0126R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import java.util.Locale;

/* renamed from: bjpz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjpz extends bjjm implements TextWatcher, AdapterView.OnItemSelectedListener, bjop {

    /* renamed from: m */
    ViewGroup f123127m;

    /* renamed from: o */
    AppCompatSpinner f123128o;

    /* renamed from: p */
    TextInputLayout f123129p;

    /* renamed from: q */
    EditText f123130q;

    /* renamed from: r */
    int f123131r = -1;

    /* renamed from: s */
    private int f123132s = -1;

    public bjpz(bjgv bjgv) {
        super(bjgv, bjpx.class);
    }

    /* renamed from: f */
    private final void m104294f(String str) {
        if (!TextUtils.equals(this.f123130q.getText().toString(), str)) {
            this.f123130q.setText(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final void mo65155B() {
        super.mo65155B();
        AppCompatSpinner appCompatSpinner = this.f123128o;
        if (appCompatSpinner != null) {
            appCompatSpinner.setImportantForAccessibility(mo65196z());
            this.f123129p.setImportantForAccessibility(mo65196z());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final void mo65156C() {
        super.mo65156C();
        AppCompatSpinner appCompatSpinner = this.f123128o;
        if (appCompatSpinner != null) {
            appCompatSpinner.setEnabled(mo65195y());
            this.f123129p.setEnabled(mo65195y());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo65302G() {
        m104294f(((bjpy) ((bjhy) ((bjpx) ((bjjm) this).f122830n)).f122754m).mo65447e());
    }

    /* renamed from: a */
    public final int mo65417a() {
        return C0126R.C0128layout.wallet_view_phone_input_filled;
    }

    public final void afterTextChanged(Editable editable) {
    }

    /* renamed from: b */
    public final int mo65418b() {
        return C0126R.C0128layout.wallet_view_phone_input_outline;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: c */
    public final int mo65419c() {
        return C0126R.C0128layout.wallet_view_phone_input_legacy;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo65306e(String str) {
        this.f123129p.mo71272c(str);
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        String str;
        if (this.f123131r != i) {
            String obj = this.f123130q.getText().toString();
            int selectionStart = this.f123130q.getSelectionStart();
            int selectionEnd = this.f123130q.getSelectionEnd();
            bjpy bjpy = (bjpy) ((bjhy) ((bjpx) ((bjjm) this).f122830n)).f122754m;
            if (!TextUtils.isEmpty(bjpy.f123123e)) {
                str = String.format(Locale.US, "+%s ", bjpy.f123123e);
            } else {
                str = "";
            }
            String a = bjqa.m104307a(str, obj);
            int length = obj.length() - a.length();
            int max = Math.max(0, selectionStart - length);
            int max2 = Math.max(0, selectionEnd - length);
            String a2 = ((bjpy) ((bjhy) ((bjpx) ((bjjm) this).f122830n)).f122754m).mo65445a(((bjpw) this.f123128o.getItemAtPosition(i)).f123116b);
            m104294f(a2);
            this.f123131r = i;
            int length2 = a2.length() - a.length();
            this.f123130q.setSelection(max + length2, max2 + length2);
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        String str;
        String str2;
        List list;
        String a = bjqa.m104306a(charSequence.toString());
        bjpu bjpu = (bjpu) this.f123128o.getAdapter();
        String str3 = ((bjpy) ((bjhy) ((bjpx) ((bjjm) this).f122830n)).f122754m).f123125g;
        String a2 = bjqa.m104306a(a);
        int min = Math.min(bjpu.f123112a, a2.length());
        while (true) {
            if (min <= 0) {
                i4 = -1;
                break;
            }
            int parseInt = Integer.parseInt(a2.substring(0, min));
            if (!bjpu.f123113b.mo15645e(parseInt) || (list = (List) bjpu.f123113b.mo15646f(parseInt)) == null || list.isEmpty()) {
                min--;
            } else {
                if (!list.contains(str3)) {
                    str3 = (String) list.get(0);
                }
                i4 = bjpu.mo65439a(str3);
            }
        }
        if (i4 != -1) {
            bjpw bjpw = (bjpw) this.f123128o.getItemAtPosition(i4);
            String str4 = bjpw.f123116b;
            str2 = bjpw.f123115a;
            str = str4;
        } else {
            str2 = ((bjpx) ((bjjm) this).f122830n).mo65443J();
            str = "";
        }
        ((bjpy) ((bjhy) ((bjpx) ((bjjm) this).f122830n)).f122754m).mo65446a(str2, str, bjqa.m104307a(str, a), 3, this);
        if (i4 == -1 && (i4 = this.f123132s) == -1) {
            i4 = bjpu.mo65439a(((bjpx) ((bjjm) this).f122830n).mo65443J());
            this.f123132s = i4;
        }
        this.f123131r = i4;
        this.f123128o.setSelection(i4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo65184p() {
        super.mo65184p();
        mo65177j(this.f123127m);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo65185q() {
        super.mo65185q();
        mo65192w();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65162a(bwxl bwxl, bwxl bwxl2) {
        super.mo65162a(bwxl, bwxl2);
        bxvj bxvj = bwvy.f161200c;
        bwxl2.mo74135a(bxvj);
        Object b = bwxl2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        int a = bwut.m122326a(((bwvy) b).f161202a);
        if (a == 0) {
            a = 1;
        }
        ViewGroup viewGroup = (ViewGroup) this.f122676a.f122692a.mo65227a().inflate(bjoq.m104173a(a, this), (ViewGroup) null);
        this.f123127m = viewGroup;
        this.f123129p = (TextInputLayout) viewGroup.findViewById(C0126R.C0129id.phone_input_text_layout);
        this.f123128o = (AppCompatSpinner) this.f123127m.findViewById(C0126R.C0129id.calling_code_spinner);
        EditText editText = this.f123129p.f151297a;
        this.f123130q = editText;
        editText.setInputType(3);
        this.f123130q.addTextChangedListener(this);
        bjpu bjpu = new bjpu(this.f122676a.f122692a.f122732i, ((bjpx) ((bjjm) this).f122830n).mo65444K());
        bjpu.setDropDownViewResource(C0126R.C0128layout.wallet_view_phone_input_spinner_dropdown_item);
        this.f123128o.setAdapter((SpinnerAdapter) bjpu);
        this.f123128o.setOnItemSelectedListener(this);
        bjoq.m104174a(this.f123129p, this.f123130q, (bjon) ((bjjm) this).f122830n);
        m104294f(((bjpy) ((bjhy) ((bjpx) ((bjjm) this).f122830n)).f122754m).mo65447e());
        EditText editText2 = this.f123130q;
        editText2.setSelection(editText2.getText().length());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo65166b(View view) {
        bjkm.m103781a(this.f122686k, this.f123129p);
    }
}
