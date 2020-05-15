package p000;

import android.content.Context;
import android.os.Parcelable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.widget.EditText;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.plus.oob.FieldViewCustomGender$SavedState;

/* renamed from: anye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anye extends anxz {

    /* renamed from: d */
    public EditText f77860d;

    public anye(Context context, boolean z) {
        super(context, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo42413a() {
        return !this.f77854a ? C0126R.C0128layout.plus_oob_field_custom_gender : C0126R.C0128layout.plus_oob_field_custom_gender_setup_wizard;
    }

    /* renamed from: b */
    public final boolean mo42416b() {
        return mo42420f() || !TextUtils.isEmpty(mo42435j());
    }

    /* renamed from: c */
    public final aoed mo42417c() {
        String j = mo42435j();
        if (TextUtils.isEmpty(j)) {
            return mo42422h().mo42557a();
        }
        aodt h = mo42422h();
        aodz aodz = new aodz();
        aodz.mo42584b(j);
        h.mo42558a(aodz.mo42582a());
        return h.mo42557a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final String mo42435j() {
        return this.f77860d.getText().toString();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof FieldViewCustomGender$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        FieldViewCustomGender$SavedState fieldViewCustomGender$SavedState = (FieldViewCustomGender$SavedState) parcelable;
        super.onRestoreInstanceState(fieldViewCustomGender$SavedState.getSuperState());
        this.f77860d.setText(fieldViewCustomGender$SavedState.f82573a);
    }

    public final Parcelable onSaveInstanceState() {
        FieldViewCustomGender$SavedState fieldViewCustomGender$SavedState = new FieldViewCustomGender$SavedState(super.onSaveInstanceState());
        fieldViewCustomGender$SavedState.f82573a = this.f77860d.getText().toString();
        return fieldViewCustomGender$SavedState;
    }

    /* renamed from: a */
    public final void mo42415a(aoed aoed, anxy anxy) {
        super.mo42415a(aoed, anxy);
        EditText editText = (EditText) findViewById(C0126R.C0129id.oob_field_custom_gender);
        this.f77860d = editText;
        editText.setHint(mo42423i());
        EditText editText2 = this.f77860d;
        String str = null;
        if (this.f77855b.mo42610q() && this.f77855b.mo42609p().mo42595j()) {
            str = this.f77855b.mo42609p().mo42594i();
        }
        editText2.setText(str);
        this.f77860d.setContentDescription(getContentDescription());
        this.f77860d.addTextChangedListener(new anyd(this));
        this.f77860d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50)});
    }
}
