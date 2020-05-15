package p000;

import android.content.Context;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.widget.EditText;
import android.widget.SpinnerAdapter;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.plus.oob.FieldViewGender$SavedState;
import com.google.android.gms.plus.oob.GenderSpinner;
import java.util.ArrayList;
import java.util.List;

/* renamed from: anyg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anyg extends anxz implements anyv {

    /* renamed from: d */
    public anye f77861d;

    /* renamed from: e */
    public anyq f77862e;

    /* renamed from: f */
    private anyu f77863f;

    /* renamed from: g */
    private GenderSpinner f77864g;

    /* renamed from: h */
    private boolean f77865h;

    /* renamed from: i */
    private boolean f77866i;

    /* renamed from: j */
    private int f77867j = -1;

    public anyg(Context context, boolean z) {
        super(context, z);
    }

    /* renamed from: c */
    private final String m65548c(int i) {
        if (!this.f77855b.mo42607n()) {
            return null;
        }
        List m = this.f77855b.mo42606m();
        if (i >= 0 && i < m.size()) {
            return ((aody) m.get(i)).mo42580b();
        }
        String valueOf = String.valueOf(this.f77855b.mo42600g());
        Log.e("FieldView", valueOf.length() == 0 ? new String("Invalid position for options field: id=") : "Invalid position for options field: id=".concat(valueOf));
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo42413a() {
        return !this.f77854a ? C0126R.C0128layout.plus_oob_field_gender : C0126R.C0128layout.plus_oob_field_gender_setup_wizard;
    }

    /* renamed from: b */
    public final void mo42438b(int i) {
        if (!this.f77865h) {
            if (this.f77867j == i) {
                this.f77856c.mo42409a(rim.f43074p);
            } else {
                this.f77856c.mo42409a(rim.f43073o);
            }
            this.f77865h = true;
        }
        this.f77863f.mo42466a();
        this.f77867j = i;
        mo42439j();
        this.f77856c.mo42408a();
    }

    /* renamed from: j */
    public final void mo42439j() {
        int i;
        if (!mo42419e()) {
            if (!"custom".equals(m65548c(this.f77867j))) {
                i = 8;
            } else {
                i = 0;
            }
            anye anye = this.f77861d;
            if (anye != null) {
                anye.setVisibility(i);
                if (i == 8) {
                    EditText editText = anye.f77860d;
                    if (editText != null) {
                        editText.setText("");
                    }
                } else {
                    i = 0;
                }
            }
            anyq anyq = this.f77862e;
            if (anyq != null) {
                anyq.setVisibility(i);
                if (i == 8 && anyq.f77885e != null) {
                    anyq.f77887g = -1;
                    anyq.f77884d = new anyu(anyq.getContext(), (CharSequence[]) anyq.f77886f.toArray(new CharSequence[0]));
                    anyq.f77884d.setDropDownViewResource(17367049);
                    anyq.f77884d.mo42467a(anyq.f77885e.getPrompt());
                    anyq.f77885e.setAdapter((SpinnerAdapter) anyq.f77884d);
                    anyq.mo42459j();
                }
            }
        }
    }

    public final void onAttachedToWindow() {
        GenderSpinner genderSpinner = this.f77864g;
        if (genderSpinner != null) {
            int i = this.f77867j;
            if (i == -1) {
                this.f77863f.mo42467a(genderSpinner.getPrompt());
            } else {
                genderSpinner.setSelection(i);
            }
            mo42439j();
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof FieldViewGender$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        FieldViewGender$SavedState fieldViewGender$SavedState = (FieldViewGender$SavedState) parcelable;
        super.onRestoreInstanceState(fieldViewGender$SavedState.getSuperState());
        this.f77865h = fieldViewGender$SavedState.f82574a;
        this.f77866i = fieldViewGender$SavedState.f82575b;
        int i = fieldViewGender$SavedState.f82576c;
        this.f77867j = i;
        if (i != -1) {
            this.f77864g.setSelection(i);
        }
        mo42439j();
    }

    public final Parcelable onSaveInstanceState() {
        FieldViewGender$SavedState fieldViewGender$SavedState = new FieldViewGender$SavedState(super.onSaveInstanceState());
        fieldViewGender$SavedState.f82574a = this.f77865h;
        fieldViewGender$SavedState.f82575b = this.f77866i;
        fieldViewGender$SavedState.f82576c = !this.f77863f.mo42468b() ? this.f77864g.getSelectedItemPosition() : -1;
        return fieldViewGender$SavedState;
    }

    /* renamed from: a */
    public final void mo42415a(aoed aoed, anxy anxy) {
        String str;
        super.mo42415a(aoed, anxy);
        String str2 = null;
        if (this.f77855b.mo42610q()) {
            str = this.f77855b.mo42609p().mo42593h();
        } else {
            str = null;
        }
        ArrayList arrayList = new ArrayList();
        if (this.f77855b.mo42607n()) {
            List m = this.f77855b.mo42606m();
            int size = m.size();
            for (int i = 0; i < size; i++) {
                aody aody = (aody) m.get(i);
                if (str != null && str.equals(aody.mo42580b())) {
                    this.f77867j = i;
                    this.f77866i = true;
                    if (!this.f77865h) {
                        this.f77856c.mo42409a(rim.f43074p);
                        this.f77865h = true;
                    }
                }
                arrayList.add(aody.mo42581c());
            }
        }
        anyu anyu = new anyu(getContext(), (CharSequence[]) arrayList.toArray(new CharSequence[0]));
        this.f77863f = anyu;
        anyu.setDropDownViewResource(17367049);
        GenderSpinner genderSpinner = (GenderSpinner) findViewById(C0126R.C0129id.oob_field_gender_spinner);
        this.f77864g = genderSpinner;
        genderSpinner.f82586a = this;
        if (aoed.mo42603j()) {
            str2 = aoed.mo42602i().mo42578c();
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = getResources().getString(C0126R.string.plus_gender_prompt);
        }
        this.f77864g.setPrompt(str2);
        this.f77864g.setAdapter((SpinnerAdapter) this.f77863f);
        int i2 = this.f77867j;
        if (i2 != -1) {
            this.f77864g.setSelection(i2);
        }
        mo42439j();
    }

    /* renamed from: c */
    public final aoed mo42417c() {
        this.f77867j = this.f77864g.getSelectedItemPosition();
        aodt h = mo42422h();
        aodz aodz = new aodz();
        aodz.mo42583a(m65548c(this.f77867j));
        h.mo42558a(aodz.mo42582a());
        return h.mo42557a();
    }

    /* renamed from: b */
    public final boolean mo42416b() {
        boolean z;
        anye anye;
        String str;
        int i = this.f77867j;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        if ("custom".equals(m65548c(i))) {
            if (!(this.f77862e == null || (anye = this.f77861d) == null || TextUtils.isEmpty(anye.mo42435j()))) {
                anyq anyq = this.f77862e;
                int i2 = anyq.f77887g;
                if (i2 != -1) {
                    str = ((CharSequence) anyq.f77884d.getItem(i2)).toString();
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    z = true;
                }
            }
            z = false;
        }
        return mo42420f() || z;
    }
}
