package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p002v7.widget.AppCompatCheckBox;
import android.support.p002v7.widget.SwitchCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.p097ui.common.InfoMessageView;

/* renamed from: bkbp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bkbp extends RelativeLayout implements CompoundButton.OnCheckedChangeListener, View.OnClickListener, View.OnFocusChangeListener, ViewTreeObserver.OnGlobalLayoutListener, Checkable, bkdf {

    /* renamed from: a */
    public bkdw f123948a;

    /* renamed from: b */
    public AppCompatCheckBox f123949b;

    /* renamed from: c */
    public SwitchCompat f123950c;

    /* renamed from: d */
    public InfoMessageView f123951d;

    /* renamed from: e */
    public InfoMessageView f123952e;

    /* renamed from: f */
    CompoundButton f123953f;

    /* renamed from: g */
    public boolean f123954g;

    /* renamed from: h */
    private ColorStateList f123955h;

    /* renamed from: i */
    private boolean f123956i;

    /* renamed from: j */
    private boolean f123957j = true;

    public bkbp(Context context) {
        super(context);
        m105251a(context, null, 0, 0);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, bkbp, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    private final void m105251a(Context context, AttributeSet attributeSet, int i, int i2) {
        LayoutInflater.from(context).inflate((int) C0126R.C0128layout.view_base_checkbox_layout, (ViewGroup) this, true);
        this.f123949b = (AppCompatCheckBox) findViewById(C0126R.C0129id.checkbox_toggle);
        this.f123950c = (SwitchCompat) findViewById(C0126R.C0129id.switch_toggle);
        InfoMessageView infoMessageView = (InfoMessageView) findViewById(C0126R.C0129id.message_text);
        this.f123951d = infoMessageView;
        infoMessageView.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.f123952e = (InfoMessageView) findViewById(C0126R.C0129id.error_text);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{C0126R.attr.uicFormErrorColor}, i, i2);
        this.f123955h = obtainStyledAttributes.getColorStateList(0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: U */
    public final bkdw mo52821U() {
        return this.f123948a;
    }

    /* renamed from: a */
    public final String mo52823a(String str) {
        return "";
    }

    /* renamed from: a */
    public final void mo65792a(bjxu bjxu) {
        this.f123951d.f152084h = bjxu;
    }

    /* renamed from: a */
    public boolean mo65795a(Object obj) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo65796b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract bmnr mo65797c();

    /* renamed from: cL */
    public final boolean mo65798cL() {
        return !mo65796b() || isChecked();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkbp.a(boolean, bmnr):void
     arg types: [int, bmnr]
     candidates:
      bkbp.a(java.lang.CharSequence, boolean):void
      bkdf.a(java.lang.CharSequence, boolean):void
      bkbp.a(boolean, bmnr):void */
    /* renamed from: cM */
    public final boolean mo65799cM() {
        boolean cL = mo65798cL();
        if (!cL) {
            m105252a(true, mo65797c());
        }
        return cL;
    }

    /* renamed from: cN */
    public final boolean mo65800cN() {
        if (hasFocus() || !requestFocus()) {
            bkfr.m105602c(this);
            if (getError() != null) {
                mo71871g();
            }
        }
        return hasFocus();
    }

    /* access modifiers changed from: protected */
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        super.dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        super.dispatchFreezeSelfOnly(sparseArray);
    }

    public final CharSequence getError() {
        if (this.f123952e.getVisibility() == 0) {
            return this.f123952e.mo72007c();
        }
        return null;
    }

    public final boolean isChecked() {
        CompoundButton compoundButton = this.f123953f;
        if (compoundButton != null) {
            return compoundButton.isChecked();
        }
        return false;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkbp.a(boolean, bmnr):void
     arg types: [int, ?[OBJECT, ARRAY]]
     candidates:
      bkbp.a(java.lang.CharSequence, boolean):void
      bkdf.a(java.lang.CharSequence, boolean):void
      bkbp.a(boolean, bmnr):void */
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        m105252a(false, (bmnr) null);
    }

    public void onClick(View view) {
        this.f123953f.toggle();
    }

    public final void onFocusChange(View view, boolean z) {
        if (z && getError() != null) {
            mo71871g();
        }
    }

    public final void onGlobalLayout() {
        int i;
        boolean z;
        InfoMessageView infoMessageView = this.f123951d;
        if (infoMessageView.f152078b.getVisibility() == 0 && infoMessageView.f152079c.getVisibility() == 0) {
            i = infoMessageView.f152078b.getLineCount() + infoMessageView.f152079c.getLineCount();
        } else {
            i = infoMessageView.f152078b.getVisibility() == 0 ? infoMessageView.f152078b.getLineCount() : infoMessageView.f152079c.getVisibility() == 0 ? infoMessageView.f152079c.getLineCount() : 0;
        }
        if (i > 2) {
            z = true;
        } else {
            z = false;
        }
        if (this.f123957j != z) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f123949b.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f123950c.getLayoutParams();
            if (z) {
                layoutParams.addRule(6, 0);
                layoutParams2.addRule(6, 0);
                layoutParams.addRule(8, 0);
                layoutParams2.addRule(8, 0);
                layoutParams.addRule(4, C0126R.C0129id.message_text);
                layoutParams2.addRule(4, C0126R.C0129id.message_text);
            } else {
                layoutParams.addRule(4, 0);
                layoutParams2.addRule(4, 0);
                layoutParams.addRule(6, C0126R.C0129id.message_text);
                layoutParams2.addRule(6, C0126R.C0129id.message_text);
                layoutParams.addRule(8, C0126R.C0129id.message_text);
                layoutParams2.addRule(8, C0126R.C0129id.message_text);
            }
            this.f123949b.setLayoutParams(layoutParams);
            this.f123950c.setLayoutParams(layoutParams2);
            this.f123957j = z;
        }
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("parentState"));
            if (this.f123953f != null) {
                this.f123954g = true;
                setChecked(bundle.getBoolean("isChecked"));
                this.f123954g = false;
            }
            m105252a(bundle.getBoolean("isError"), (bmnr) bjvp.m104730a(bundle, "errorInfoMessage", (bxxk) bmnr.f130153o.mo74142c(7)));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("parentState", super.onSaveInstanceState());
        if (this.f123953f != null) {
            bundle.putBoolean("isChecked", isChecked());
            bundle.putBoolean("isError", this.f123956i);
            bjvp.m104736a(bundle, "errorInfoMessage", this.f123952e.f152083g);
        }
        return bundle;
    }

    public final void setChecked(boolean z) {
        CompoundButton compoundButton = this.f123953f;
        if (compoundButton != null) {
            compoundButton.setChecked(z);
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f123951d.setEnabled(z);
        CompoundButton compoundButton = this.f123953f;
        if (compoundButton != null) {
            compoundButton.setEnabled(z);
        }
        this.f123952e.setEnabled(z);
    }

    public final void toggle() {
        CompoundButton compoundButton = this.f123953f;
        if (compoundButton != null) {
            compoundButton.toggle();
        }
    }

    public bkbp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m105251a(context, attributeSet, 0, 0);
    }

    /* renamed from: g */
    private final void mo71871g() {
        bkfr.m105567a(this, getResources().getString(C0126R.string.wallet_uic_accessibility_event_form_field_error, this.f123951d.mo72007c(), getError()));
    }

    public bkbp(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m105251a(context, attributeSet, i, 0);
    }

    public bkbp(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m105251a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private final void m105252a(boolean z, bmnr bmnr) {
        this.f123956i = z;
        if (this.f123953f == this.f123949b) {
            C1321rf.m20065a(this.f123949b, !z ? bkfr.m105588b(getContext()) : this.f123955h);
        }
        if (bmnr == null) {
            this.f123952e.mo72003a((bmnr) null);
            this.f123952e.setVisibility(8);
            return;
        }
        this.f123952e.mo72003a(bmnr);
        this.f123952e.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65789a() {
        mo65791a((CompoundButton) this.f123949b);
    }

    /* renamed from: a */
    public final void mo65790a(int i) {
        CompoundButton compoundButton = this.f123953f;
        AppCompatCheckBox appCompatCheckBox = this.f123949b;
        if (compoundButton == appCompatCheckBox) {
            appCompatCheckBox.getLayoutParams().width = i;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkbp.a(boolean, bmnr):void
     arg types: [int, ?[OBJECT, ARRAY]]
     candidates:
      bkbp.a(java.lang.CharSequence, boolean):void
      bkdf.a(java.lang.CharSequence, boolean):void
      bkbp.a(boolean, bmnr):void */
    /* renamed from: a */
    public final void mo65791a(CompoundButton compoundButton) {
        if (this.f123953f == null) {
            this.f123953f = compoundButton;
            compoundButton.setOnCheckedChangeListener(this);
            this.f123953f.setOnFocusChangeListener(this);
            m105252a(false, (bmnr) null);
            this.f123953f.setEnabled(isEnabled());
            this.f123953f.setVisibility(0);
            this.f123951d.setOnClickListener(this);
            return;
        }
        throw new IllegalStateException("Only one toggle view can be active.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65793a(bmnr bmnr) {
        this.f123951d.mo72003a(bmnr);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkbp.a(boolean, bmnr):void
     arg types: [int, ?[OBJECT, ARRAY]]
     candidates:
      bkbp.a(java.lang.CharSequence, boolean):void
      bkdf.a(java.lang.CharSequence, boolean):void
      bkbp.a(boolean, bmnr):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkbp.a(boolean, bmnr):void
     arg types: [int, bmnr]
     candidates:
      bkbp.a(java.lang.CharSequence, boolean):void
      bkdf.a(java.lang.CharSequence, boolean):void
      bkbp.a(boolean, bmnr):void */
    /* renamed from: a */
    public final void mo65794a(CharSequence charSequence, boolean z) {
        if (TextUtils.isEmpty(charSequence)) {
            m105252a(false, (bmnr) null);
            return;
        }
        bxvd da = bmnr.f130153o.mo74144da();
        String charSequence2 = charSequence.toString();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmnr bmnr = (bmnr) da.f164949b;
        charSequence2.getClass();
        int i = bmnr.f130155a | 4;
        bmnr.f130155a = i;
        bmnr.f130159e = charSequence2;
        bmnr.f130162h = 4;
        bmnr.f130155a = i | 32;
        m105252a(true, (bmnr) da.mo74062i());
    }
}
