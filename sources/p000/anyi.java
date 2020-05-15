package p000;

import android.content.Context;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.plus.oob.FieldViewHiddenBirthday$SavedState;

/* renamed from: anyi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anyi extends anxz {

    /* renamed from: d */
    private TextView f77868d;

    public anyi(Context context, boolean z) {
        super(context, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo42413a() {
        return C0126R.C0128layout.plus_oob_field_hidden_birthday;
    }

    /* renamed from: b */
    public final boolean mo42416b() {
        return true;
    }

    /* renamed from: c */
    public final aoed mo42417c() {
        String charSequence = this.f77868d.getText().toString();
        if (TextUtils.isEmpty(charSequence)) {
            if (!mo42418d()) {
                return null;
            }
            charSequence = (String) ansx.f77661K.mo25081c();
        }
        aodt h = mo42422h();
        aodz aodz = new aodz();
        aodz.f78235b = charSequence;
        aodz.f78237d.add(3);
        h.mo42558a(aodz.mo42582a());
        return h.mo42557a();
    }

    /* renamed from: e */
    public final boolean mo42419e() {
        return true;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof FieldViewHiddenBirthday$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        FieldViewHiddenBirthday$SavedState fieldViewHiddenBirthday$SavedState = (FieldViewHiddenBirthday$SavedState) parcelable;
        super.onRestoreInstanceState(fieldViewHiddenBirthday$SavedState.getSuperState());
        this.f77868d.setText(fieldViewHiddenBirthday$SavedState.f82577a);
    }

    public final Parcelable onSaveInstanceState() {
        FieldViewHiddenBirthday$SavedState fieldViewHiddenBirthday$SavedState = new FieldViewHiddenBirthday$SavedState(super.onSaveInstanceState());
        fieldViewHiddenBirthday$SavedState.f82577a = this.f77868d.getText().toString();
        return fieldViewHiddenBirthday$SavedState;
    }

    /* renamed from: a */
    public final void mo42415a(aoed aoed, anxy anxy) {
        super.mo42415a(aoed, anxy);
        this.f77868d = (TextView) findViewWithTag(mo42414a(C0126R.string.plus_oob_field_view_tag_hidden_birthday));
        if (aoed.mo42610q()) {
            this.f77868d.setText(aoed.mo42609p().mo42590d());
        }
    }
}
