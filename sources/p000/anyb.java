package p000;

import android.content.Context;
import android.os.Parcelable;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.plus.oob.FieldViewCheck$SavedState;

/* renamed from: anyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anyb extends anxz implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: d */
    private CheckBox f77857d;

    /* renamed from: e */
    private aond f77858e;

    public anyb(Context context, boolean z) {
        super(context, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo42413a() {
        return !this.f77854a ? C0126R.C0128layout.plus_oob_field_check : C0126R.C0128layout.plus_oob_field_check_setup_wizard;
    }

    /* renamed from: b */
    public final boolean mo42416b() {
        return mo42420f() || this.f77857d.isChecked();
    }

    /* renamed from: c */
    public final aoed mo42417c() {
        if ("customAds".equals(this.f77855b.mo42600g())) {
            this.f77856c.mo42409a(this.f77857d.isChecked() ? rim.f43071m : rim.f43072n);
        }
        aodt h = mo42422h();
        aodz aodz = new aodz();
        aodz.f78234a = this.f77857d.isChecked();
        aodz.f78237d.add(2);
        h.mo42558a(aodz.mo42582a());
        return h.mo42557a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final FavaDiagnosticsEntity mo42421g() {
        if ("picasa".equals(this.f77855b.mo42600g())) {
            return rim.f43067i;
        }
        if ("customAds".equals(this.f77855b.mo42600g())) {
            return rim.f43070l;
        }
        return null;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (mo42418d()) {
            this.f77856c.mo42408a();
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof FieldViewCheck$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        FieldViewCheck$SavedState fieldViewCheck$SavedState = (FieldViewCheck$SavedState) parcelable;
        super.onRestoreInstanceState(fieldViewCheck$SavedState.getSuperState());
        this.f77857d.setChecked(fieldViewCheck$SavedState.f82572a);
    }

    public final Parcelable onSaveInstanceState() {
        FieldViewCheck$SavedState fieldViewCheck$SavedState = new FieldViewCheck$SavedState(super.onSaveInstanceState());
        fieldViewCheck$SavedState.f82572a = this.f77857d.isChecked();
        return fieldViewCheck$SavedState;
    }

    /* renamed from: a */
    public final void mo42415a(aoed aoed, anxy anxy) {
        super.mo42415a(aoed, anxy);
        CheckBox checkBox = (CheckBox) findViewWithTag(mo42414a(C0126R.string.plus_oob_field_view_tag_check));
        this.f77857d = checkBox;
        checkBox.setText(mo42423i());
        this.f77857d.setOnCheckedChangeListener(this);
        CheckBox checkBox2 = this.f77857d;
        boolean z = false;
        if (this.f77855b.mo42610q() && this.f77855b.mo42609p().mo42589c()) {
            z = this.f77855b.mo42609p().mo42588b();
        }
        checkBox2.setChecked(z);
        aond aond = new aond(this.f77857d);
        this.f77858e = aond;
        this.f77857d.setMovementMethod(aond);
    }
}
