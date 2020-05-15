package p000;

import android.content.Context;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.plus.oob.FieldViewString$SavedState;

/* renamed from: anyt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anyt extends anxz {

    /* renamed from: d */
    private TextView f77893d;

    /* renamed from: e */
    private EditText f77894e;

    public anyt(Context context, boolean z) {
        super(context, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo42413a() {
        return !this.f77854a ? C0126R.C0128layout.plus_oob_field_string : C0126R.C0128layout.plus_oob_field_string_setup_wizard;
    }

    /* renamed from: b */
    public final boolean mo42416b() {
        return mo42420f() || !TextUtils.isEmpty(this.f77894e.getText().toString());
    }

    /* renamed from: c */
    public final aoed mo42417c() {
        aodt h = mo42422h();
        aodz aodz = new aodz();
        aodz.mo42584b(this.f77894e.getText().toString());
        h.mo42558a(aodz.mo42582a());
        return h.mo42557a();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof FieldViewString$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        FieldViewString$SavedState fieldViewString$SavedState = (FieldViewString$SavedState) parcelable;
        super.onRestoreInstanceState(fieldViewString$SavedState.getSuperState());
        this.f77894e.setText(fieldViewString$SavedState.f82585a);
    }

    public final Parcelable onSaveInstanceState() {
        FieldViewString$SavedState fieldViewString$SavedState = new FieldViewString$SavedState(super.onSaveInstanceState());
        fieldViewString$SavedState.f82585a = this.f77894e.getText().toString();
        return fieldViewString$SavedState;
    }

    /* renamed from: a */
    public final void mo42415a(aoed aoed, anxy anxy) {
        super.mo42415a(aoed, anxy);
        TextView textView = (TextView) findViewWithTag(mo42414a(C0126R.string.plus_oob_field_view_tag_string_label));
        this.f77893d = textView;
        textView.setText(mo42423i());
        EditText editText = (EditText) findViewWithTag(mo42414a(C0126R.string.plus_oob_field_view_tag_string));
        this.f77894e = editText;
        String str = null;
        if (this.f77855b.mo42610q() && this.f77855b.mo42609p().mo42595j()) {
            str = this.f77855b.mo42609p().mo42594i();
        }
        editText.setText(str);
        this.f77894e.setContentDescription(getContentDescription());
        if (mo42418d()) {
            this.f77894e.addTextChangedListener(new anys(this));
        }
    }
}
