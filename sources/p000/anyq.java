package p000;

import android.content.Context;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.plus.oob.FieldViewPronoun$SavedState;
import com.google.android.gms.plus.oob.GenderSpinner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: anyq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anyq extends anxz implements anyv {

    /* renamed from: d */
    public anyu f77884d;

    /* renamed from: e */
    public GenderSpinner f77885e;

    /* renamed from: f */
    public ArrayList f77886f;

    /* renamed from: g */
    public int f77887g = -1;

    /* renamed from: h */
    private TextView f77888h;

    /* renamed from: i */
    private ArrayList f77889i;

    /* renamed from: j */
    private Map f77890j;

    /* renamed from: k */
    private boolean f77891k;

    public anyq(Context context, boolean z) {
        super(context, z);
    }

    /* renamed from: c */
    private final String m65582c(int i) {
        if (!this.f77855b.mo42607n()) {
            return null;
        }
        if (i >= 0 && i < this.f77889i.size()) {
            return ((aody) this.f77889i.get(i)).mo42580b();
        }
        String valueOf = String.valueOf(this.f77855b.mo42600g());
        Log.e("FieldView", valueOf.length() == 0 ? new String("Invalid position for options field: id=") : "Invalid position for options field: id=".concat(valueOf));
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo42413a() {
        return !this.f77854a ? C0126R.C0128layout.plus_oob_field_pronoun : C0126R.C0128layout.plus_oob_field_pronoun_setup_wizard;
    }

    /* renamed from: b */
    public final void mo42438b(int i) {
        if (i != -1) {
            this.f77884d.mo42466a();
            this.f77887g = i;
            this.f77856c.mo42408a();
            mo42459j();
        }
    }

    /* renamed from: j */
    public final void mo42459j() {
        int i;
        String str = null;
        if (!(this.f77890j.size() == 0 || (i = this.f77887g) == -1)) {
            Map map = this.f77890j;
            String valueOf = String.valueOf(m65582c(i));
            str = ((aody) map.get(valueOf.length() == 0 ? new String("s_") : "s_".concat(valueOf))).mo42581c();
        }
        if (str == null) {
            this.f77888h.setText("");
            this.f77888h.setVisibility(8);
            return;
        }
        this.f77888h.setText(str);
        this.f77888h.setVisibility(0);
    }

    public final void onAttachedToWindow() {
        GenderSpinner genderSpinner = this.f77885e;
        if (genderSpinner != null) {
            int i = this.f77887g;
            if (i == -1) {
                this.f77884d.mo42467a(genderSpinner.getPrompt());
            } else {
                genderSpinner.setSelection(i);
            }
            mo42459j();
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof FieldViewPronoun$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        FieldViewPronoun$SavedState fieldViewPronoun$SavedState = (FieldViewPronoun$SavedState) parcelable;
        super.onRestoreInstanceState(fieldViewPronoun$SavedState.getSuperState());
        this.f77891k = fieldViewPronoun$SavedState.f82583a;
        int i = fieldViewPronoun$SavedState.f82584b;
        this.f77887g = i;
        if (i != -1) {
            this.f77885e.setSelection(i);
        }
        mo42459j();
    }

    public final Parcelable onSaveInstanceState() {
        FieldViewPronoun$SavedState fieldViewPronoun$SavedState = new FieldViewPronoun$SavedState(super.onSaveInstanceState());
        fieldViewPronoun$SavedState.f82583a = this.f77891k;
        fieldViewPronoun$SavedState.f82584b = !this.f77884d.mo42468b() ? this.f77885e.getSelectedItemPosition() : -1;
        return fieldViewPronoun$SavedState;
    }

    /* renamed from: a */
    public final void mo42415a(aoed aoed, anxy anxy) {
        String str;
        super.mo42415a(aoed, anxy);
        this.f77889i = new ArrayList();
        this.f77890j = new HashMap();
        if (this.f77855b.mo42607n()) {
            List m = this.f77855b.mo42606m();
            int size = m.size();
            for (int i = 0; i < size; i++) {
                aody aody = (aody) m.get(i);
                if (aody.mo42580b().startsWith("s_")) {
                    this.f77890j.put(aody.mo42580b(), aody);
                } else {
                    this.f77889i.add(aody);
                }
            }
        }
        String str2 = null;
        if (this.f77855b.mo42610q()) {
            str = this.f77855b.mo42609p().mo42593h();
        } else {
            str = null;
        }
        this.f77886f = new ArrayList();
        int size2 = this.f77889i.size();
        for (int i2 = 0; i2 < size2; i2++) {
            aody aody2 = (aody) this.f77889i.get(i2);
            if (str != null && str.equals(aody2.mo42580b())) {
                this.f77887g = i2;
                this.f77891k = true;
            }
            this.f77886f.add(aody2.mo42581c());
        }
        anyu anyu = new anyu(getContext(), (CharSequence[]) this.f77886f.toArray(new CharSequence[0]));
        this.f77884d = anyu;
        anyu.setDropDownViewResource(17367049);
        this.f77888h = (TextView) findViewById(C0126R.C0129id.oob_field_pronoun_example_label);
        GenderSpinner genderSpinner = (GenderSpinner) findViewById(C0126R.C0129id.oob_field_pronoun_spinner);
        this.f77885e = genderSpinner;
        genderSpinner.f82586a = this;
        if (aoed.mo42603j()) {
            str2 = aoed.mo42602i().mo42578c();
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = getResources().getString(C0126R.string.common_select);
        }
        this.f77885e.setPrompt(str2);
        this.f77885e.setAdapter((SpinnerAdapter) this.f77884d);
        int i3 = this.f77887g;
        if (i3 != -1) {
            this.f77885e.setSelection(i3);
        }
        mo42459j();
    }

    /* renamed from: b */
    public final boolean mo42416b() {
        return mo42420f() || this.f77887g != -1;
    }

    /* renamed from: c */
    public final aoed mo42417c() {
        if (this.f77884d.mo42468b()) {
            return mo42422h().mo42557a();
        }
        this.f77887g = this.f77885e.getSelectedItemPosition();
        aodt h = mo42422h();
        aodz aodz = new aodz();
        aodz.mo42583a(m65582c(this.f77887g));
        h.mo42558a(aodz.mo42582a());
        return h.mo42557a();
    }
}
