package p000;

import android.content.Context;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.plus.oob.FieldViewName$SavedState;
import com.google.android.gms.plus.service.v1whitelisted.models.AccountField;
import java.util.List;

/* renamed from: anyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anyo extends anxz implements View.OnClickListener, TextView.OnEditorActionListener, View.OnTouchListener, View.OnFocusChangeListener {

    /* renamed from: d */
    private EditText f77874d;

    /* renamed from: e */
    private EditText f77875e;

    /* renamed from: f */
    private EditText f77876f;

    /* renamed from: g */
    private EditText f77877g;

    /* renamed from: h */
    private EditText f77878h;

    /* renamed from: i */
    private boolean f77879i;

    /* renamed from: j */
    private TextView f77880j;

    /* renamed from: k */
    private TextView f77881k;

    /* renamed from: l */
    private boolean f77882l;

    /* renamed from: m */
    private int f77883m = 0;

    public anyo(Context context, boolean z) {
        super(context, z);
    }

    /* renamed from: b */
    private final void m65570b(View view) {
        view.postDelayed(new anyl(this, view), 250);
    }

    /* renamed from: l */
    private final void m65571l() {
        this.f77874d.setVisibility(0);
        this.f77875e.setVisibility(0);
        this.f77878h.setVisibility(8);
        this.f77880j.setVisibility(0);
        int i = this.f77883m;
        if (i == 2) {
            EditText editText = this.f77875e;
            editText.setSelection(editText.getText().length());
            this.f77875e.requestFocus();
            m65570b(this.f77875e);
        } else if (i == 1) {
            EditText editText2 = this.f77874d;
            editText2.setSelection(editText2.getText().length());
            this.f77874d.requestFocus();
            m65570b(this.f77874d);
        } else if (anzh.m65636a()) {
            EditText editText3 = this.f77875e;
            editText3.setSelection(editText3.getText().length());
            this.f77875e.requestFocus();
            mo42450a(this.f77875e);
        } else {
            EditText editText4 = this.f77874d;
            editText4.setSelection(editText4.getText().length());
            this.f77874d.requestFocus();
            mo42450a(this.f77874d);
        }
    }

    /* renamed from: m */
    private final String m65572m() {
        if (m65574o()) {
            return this.f77855b.mo42609p().mo42591f().mo42586c();
        }
        return null;
    }

    /* renamed from: n */
    private final String m65573n() {
        if (m65574o()) {
            return this.f77855b.mo42609p().mo42591f().mo42585b();
        }
        return null;
    }

    /* renamed from: o */
    private final boolean m65574o() {
        return this.f77855b.mo42610q() && this.f77855b.mo42609p().mo42592g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo42413a() {
        return !this.f77854a ? C0126R.C0128layout.plus_oob_field_name : C0126R.C0128layout.plus_oob_field_name_setup_wizard;
    }

    /* renamed from: c */
    public final aoed mo42417c() {
        aodt h = mo42422h();
        aodz aodz = new aodz();
        aoea aoea = new aoea();
        aoea.f78241b = mo42451j();
        aoea.f78242c.add(3);
        aoea.f78240a = mo42452k();
        aoea.f78242c.add(2);
        aodz.f78236c = new AccountField.ValueEntity.NameEntity(aoea.f78242c, aoea.f78240a, aoea.f78241b);
        aodz.f78237d.add(4);
        h.mo42558a(aodz.mo42582a());
        return h.mo42557a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final String mo42451j() {
        return this.f77874d.getText().toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final String mo42452k() {
        return this.f77875e.getText().toString();
    }

    public void onClick(View view) {
        if (view.getId() == C0126R.C0129id.combined_name_edit && !this.f77882l && !this.f77879i) {
            m65571l();
            this.f77882l = true;
        }
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5) {
            return false;
        }
        this.f77876f.setEnabled(false);
        EditText editText = this.f77877g;
        editText.setSelection(editText.getText().length());
        this.f77877g.requestFocus();
        this.f77877g.performClick();
        this.f77876f.setEnabled(true);
        return true;
    }

    public final void onFocusChange(View view, boolean z) {
        if (view.getId() == C0126R.C0129id.combined_name_edit && z) {
            onClick(view);
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof FieldViewName$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        FieldViewName$SavedState fieldViewName$SavedState = (FieldViewName$SavedState) parcelable;
        super.onRestoreInstanceState(fieldViewName$SavedState.getSuperState());
        this.f77882l = fieldViewName$SavedState.f82578a;
        this.f77883m = fieldViewName$SavedState.f82580c;
        this.f77876f.setText(fieldViewName$SavedState.f82581d);
        this.f77877g.setText(fieldViewName$SavedState.f82582e);
        if (this.f77882l) {
            m65571l();
        }
        this.f77879i = fieldViewName$SavedState.f82579b;
    }

    public final Parcelable onSaveInstanceState() {
        FieldViewName$SavedState fieldViewName$SavedState = new FieldViewName$SavedState(super.onSaveInstanceState());
        fieldViewName$SavedState.f82578a = this.f77882l;
        InputMethodManager a = ssc.m36196a(getContext());
        int i = 0;
        if (a != null && a.isAcceptingText()) {
            if (this.f77874d.isFocused()) {
                i = 1;
            } else if (this.f77875e.isFocused()) {
                i = 2;
            }
        }
        fieldViewName$SavedState.f82580c = i;
        fieldViewName$SavedState.f82581d = this.f77876f.getText().toString();
        fieldViewName$SavedState.f82582e = this.f77877g.getText().toString();
        fieldViewName$SavedState.f82579b = this.f77879i;
        return fieldViewName$SavedState;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f77876f.hasFocus()) {
            this.f77876f.clearFocus();
            ssc.m36197a(getContext(), view);
        }
        if (!this.f77877g.hasFocus()) {
            return false;
        }
        this.f77877g.clearFocus();
        ssc.m36197a(getContext(), view);
        return false;
    }

    /* renamed from: a */
    public final void mo42450a(View view) {
        ssc.m36198b(getContext(), view);
    }

    /* renamed from: b */
    public final boolean mo42416b() {
        return mo42420f() || (!TextUtils.isEmpty(mo42451j()) && !TextUtils.isEmpty(mo42452k()));
    }

    /* renamed from: a */
    public final void mo42415a(aoed aoed, anxy anxy) {
        boolean z;
        int i;
        super.mo42415a(aoed, anxy);
        FrameLayout frameLayout = (FrameLayout) findViewById(C0126R.C0129id.name_layout);
        if (anzh.m65636a()) {
            LayoutInflater.from(getContext()).inflate(!this.f77854a ? C0126R.C0128layout.plus_oob_name_fields_last_first : C0126R.C0128layout.plus_oob_name_fields_last_first_setup_wizard, frameLayout);
        } else {
            LayoutInflater.from(getContext()).inflate(!this.f77854a ? C0126R.C0128layout.plus_oob_name_fields_first_last : C0126R.C0128layout.plus_oob_name_fields_first_last_setup_wizard, frameLayout);
        }
        EditText editText = (EditText) findViewById(C0126R.C0129id.first_name_edit);
        this.f77874d = editText;
        editText.setText(m65572m());
        EditText editText2 = (EditText) findViewById(C0126R.C0129id.last_name_edit);
        this.f77875e = editText2;
        editText2.setText(m65573n());
        if (m65574o()) {
            z = this.f77855b.mo42609p().mo42591f().mo42587d();
        } else {
            z = false;
        }
        this.f77879i = z;
        if (mo42418d()) {
            this.f77874d.addTextChangedListener(new anym(this));
            this.f77875e.addTextChangedListener(new anym(this));
        }
        this.f77874d.setVisibility(8);
        this.f77875e.setVisibility(8);
        if (anzh.m65636a()) {
            this.f77876f = this.f77875e;
            this.f77877g = this.f77874d;
        } else {
            this.f77876f = this.f77874d;
            this.f77877g = this.f77875e;
        }
        this.f77876f.setOnEditorActionListener(this);
        if (!this.f77854a) {
            i = C0126R.C0128layout.plus_oob_name_fields_combined;
        } else {
            i = C0126R.C0128layout.plus_oob_name_fields_combined_setup_wizard;
        }
        LayoutInflater.from(getContext()).inflate(i, frameLayout);
        this.f77878h = (EditText) findViewById(C0126R.C0129id.combined_name_edit);
        if (!aoed.mo42597c() && !this.f77879i) {
            this.f77878h.setOnClickListener(this);
            this.f77878h.setOnFocusChangeListener(this);
        } else {
            this.f77878h.setEnabled(false);
            this.f77878h.setFocusable(false);
            this.f77878h.setInputType(0);
        }
        this.f77878h.setText(getContext().getString(C0126R.string.plus_oob_first_and_last_name, m65572m(), m65573n()));
        TextView textView = (TextView) findViewById(C0126R.C0129id.edit_name_warning);
        this.f77880j = textView;
        textView.setVisibility(8);
        this.f77881k = (TextView) findViewById(C0126R.C0129id.name_error);
        if (this.f77855b.mo42597c()) {
            List b = aoed.mo42596b();
            int size = b.size();
            for (int i2 = 0; i2 < size; i2++) {
                aodv aodv = (aodv) b.get(i2);
                if (aodv.mo42566c() && aodv.mo42570h() && aodv.mo42568f()) {
                    CharSequence a = anzh.m65634a(this.f77856c, aodv.mo42569g(), aodv.mo42565b(), aodv.mo42567d());
                    this.f77881k.setVisibility(0);
                    this.f77881k.setText(a);
                    this.f77881k.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        }
    }
}
