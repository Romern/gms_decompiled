package com.google.android.wallet.p097ui.common;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p002v7.widget.AppCompatSpinner;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.clientlog.LogContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.wallet.ui.common.FormSpinner */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FormSpinner extends AppCompatSpinner implements AdapterView.OnItemSelectedListener, bkdf, bjwg {

    /* renamed from: A */
    private int f152047A = -1;

    /* renamed from: B */
    private ArrayList f152048B;

    /* renamed from: C */
    private boolean f152049C = false;

    /* renamed from: D */
    private Drawable f152050D;

    /* renamed from: e */
    final bkda f152051e = new bkdz(this);

    /* renamed from: f */
    final ArrayList f152052f = new ArrayList(2);

    /* renamed from: g */
    final ArrayList f152053g = new ArrayList(2);

    /* renamed from: h */
    public long f152054h;

    /* renamed from: i */
    public String f152055i = "";

    /* renamed from: j */
    public LogContext f152056j;

    /* renamed from: k */
    public bjsv f152057k = new bjsv(this, 3);

    /* renamed from: l */
    public bkda f152058l = this.f152051e;

    /* renamed from: m */
    public View f152059m;

    /* renamed from: n */
    public boolean f152060n = true;

    /* renamed from: o */
    public String f152061o;

    /* renamed from: p */
    public boolean f152062p = false;

    /* renamed from: q */
    public bjwp f152063q;

    /* renamed from: r */
    public bjwm f152064r;

    /* renamed from: s */
    public CharSequence f152065s = null;

    /* renamed from: t */
    public Drawable f152066t;

    /* renamed from: u */
    private List f152067u = null;

    /* renamed from: v */
    private List f152068v = null;

    /* renamed from: w */
    private boolean f152069w;

    /* renamed from: x */
    private boolean f152070x = false;

    /* renamed from: y */
    private boolean f152071y = true;

    /* renamed from: z */
    private boolean f152072z;

    public FormSpinner(Context context) {
        super(context);
        m118541a(context);
    }

    /* renamed from: a */
    private final void m118541a(Context context) {
        super.setOnItemSelectedListener(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{C0126R.attr.internalUicValidateFieldsWhenNotVisible});
        this.f152062p = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        setMinimumWidth((int) getResources().getDimension(C0126R.dimen.wallet_uic_minimum_tappable_item_size));
        Resources resources = getResources();
        resources.getDimensionPixelSize(C0126R.dimen.wallet_uic_material_field_drop_down_top_margin);
        resources.getDimensionPixelSize(C0126R.dimen.wallet_uic_material_field_drop_down_end_margin);
        int i = Build.VERSION.SDK_INT;
        this.f152050D = C1163lk.m19268a(getResources(), (int) C0126R.C0127drawable.wallet_uic_spinner_dropdown_background, getContext().getTheme());
    }

    /* renamed from: i */
    private final List mo72077i() {
        if (this.f152067u == null) {
            this.f152067u = Collections.unmodifiableList(new ArrayList(this.f152052f));
        }
        return this.f152067u;
    }

    /* renamed from: j */
    private final List m118543j() {
        if (this.f152068v == null) {
            this.f152068v = Collections.unmodifiableList(new ArrayList(this.f152053g));
        }
        return this.f152068v;
    }

    /* renamed from: k */
    private final String m118544k() {
        return getResources().getString(C0126R.string.wallet_uic_accessibility_event_form_field_description, bkfr.m105553a((CharSequence) this.f152061o), !mo65798cL() ? "" : mo71976g(), "", bkfr.m105553a(getError())).trim();
    }

    /* renamed from: l */
    private final void m118545l() {
        if (m118546m()) {
            int i = Build.VERSION.SDK_INT;
        }
    }

    /* renamed from: m */
    private final boolean m118546m() {
        return this.f152066t != null;
    }

    /* renamed from: U */
    public final bkdw mo52821U() {
        return null;
    }

    /* renamed from: a */
    public final void mo71969a(long j) {
        this.f152054h = j;
        this.f152057k.f123259b = j;
    }

    /* renamed from: a */
    public final void mo71971a(LogContext logContext) {
        this.f152056j = logContext;
        this.f152057k.f123258a = logContext;
    }

    /* renamed from: b */
    public final void mo71972b(int i) {
        this.f152071y = true;
        this.f152072z = true;
        setSelection(i);
    }

    /* renamed from: c */
    public final String mo71973c() {
        return mo71968a(getSelectedItemPosition());
    }

    /* renamed from: cL */
    public boolean mo65798cL() {
        int selectedItemPosition;
        if (!this.f152060n || (!this.f152062p && getVisibility() != 0)) {
            return true;
        }
        SpinnerAdapter adapter = getAdapter();
        if (adapter == null || (selectedItemPosition = getSelectedItemPosition()) == -1) {
            return false;
        }
        if (adapter instanceof ListAdapter) {
            return ((ListAdapter) adapter).isEnabled(selectedItemPosition);
        }
        return true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.FormSpinner.a(java.lang.CharSequence, boolean):void
     arg types: [?[OBJECT, ARRAY], int]
     candidates:
      android.support.v7.widget.AppCompatSpinner.a(android.widget.SpinnerAdapter, android.graphics.drawable.Drawable):int
      com.google.android.wallet.ui.common.FormSpinner.a(java.lang.CharSequence, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.FormSpinner.a(java.lang.CharSequence, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      android.support.v7.widget.AppCompatSpinner.a(android.widget.SpinnerAdapter, android.graphics.drawable.Drawable):int
      com.google.android.wallet.ui.common.FormSpinner.a(java.lang.CharSequence, boolean):void */
    /* renamed from: cM */
    public final boolean mo65799cM() {
        if (getAdapter() == null || getAdapter().isEmpty()) {
            throw new IllegalStateException("Must set non-empty adapter before validating");
        }
        this.f152069w = true;
        if (mo65798cL()) {
            mo65794a((CharSequence) null, false);
            return true;
        }
        String string = getContext().getString(C0126R.string.wallet_uic_error_field_must_not_be_empty);
        if (!TextUtils.equals(string, getError())) {
            mo65794a((CharSequence) string, false);
            bjst.m104519a(this.f152056j, 3, this.f152055i, this.f152054h);
        }
        return false;
    }

    /* renamed from: cN */
    public final boolean mo65800cN() {
        if (hasFocus() || !requestFocus()) {
            bkfr.m105602c(this);
            if (getError() != null) {
                mo71977h();
            }
        }
        return hasFocus();
    }

    /* renamed from: ch */
    public final bjwp mo60054ch() {
        return this.f152063q;
    }

    /* renamed from: ci */
    public final bjwm mo60055ci() {
        return this.f152064r;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public CharSequence mo71976g() {
        return getSelectedItem().toString();
    }

    public final CharSequence getError() {
        return this.f152058l.mo52932m();
    }

    public final boolean isFocused() {
        return super.isFocused() || this.f152049C;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f152057k.mo65506a();
    }

    /* access modifiers changed from: protected */
    public final int[] onCreateDrawableState(int i) {
        if (this.f152066t == null || !this.f152049C) {
            return super.onCreateDrawableState(i);
        }
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        mergeDrawableStates(onCreateDrawableState, new int[]{C0126R.attr.drop_down_view_shown});
        m118545l();
        return onCreateDrawableState;
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m118545l();
    }

    /* access modifiers changed from: protected */
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (z && getError() != null) {
            mo71977h();
        }
        super.onFocusChanged(z, i, rect);
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        View view2 = view;
        int i2 = i;
        if (mo65798cL()) {
            mo65799cM();
        }
        List i3 = mo72077i();
        int size = i3.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((AdapterView.OnItemSelectedListener) i3.get(i4)).onItemSelected(adapterView, view, i, j);
        }
        if (!this.f152072z && this.f152047A != i2) {
            List j2 = m118543j();
            int size2 = j2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                ((AdapterView.OnItemSelectedListener) j2.get(i5)).onItemSelected(adapterView, view, i, j);
            }
        }
        this.f152072z = false;
        this.f152047A = i2;
        if (view2 != null) {
            view.setContentDescription(m118544k());
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        if (!this.f152070x && getAdapter() != null) {
            this.f152070x = true;
            if (this.f152069w) {
                mo65799cM();
            }
        }
        SpinnerAdapter adapter = getAdapter();
        if (adapter instanceof bkfz) {
            ((bkfz) adapter).f124178a = this.f152061o;
        } else if (adapter instanceof bkez) {
            ((bkez) adapter).f124125a = this.f152061o;
        }
        if (m118546m() && C1280ps.m19923h(this) == 1) {
            int i5 = Build.VERSION.SDK_INT;
            setTextDirection(4);
        }
        if (m118546m()) {
            setDropDownVerticalOffset(getHeight());
            setDropDownHorizontalOffset(-C1280ps.m19925i(this));
            setDropDownWidth(getWidth());
            int i6 = Build.VERSION.SDK_INT;
            if (this.f152050D != null) {
                Drawable popupBackground = getPopupBackground();
                if (popupBackground != null) {
                    drawable = new LayerDrawable(new Drawable[]{this.f152050D, popupBackground});
                } else {
                    drawable = this.f152050D;
                }
                setPopupBackgroundDrawable(drawable);
            }
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
        if (mo65798cL()) {
            mo65799cM();
        }
        List i = mo72077i();
        int size = i.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AdapterView.OnItemSelectedListener) i.get(i2)).onNothingSelected(adapterView);
        }
        if (!this.f152072z && this.f152047A != -1) {
            List j = m118543j();
            int size2 = j.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((AdapterView.OnItemSelectedListener) j.get(i3)).onNothingSelected(adapterView);
            }
        }
        this.f152072z = false;
        this.f152047A = -1;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("superSavedInstanceState"));
        this.f152069w = bundle.getBoolean("potentialErrorOnConfigChange");
        int i = bundle.getInt("selectedItemPosition");
        if (getSelectedItemPosition() != i) {
            mo71972b(i);
        }
        this.f152065s = bundle.getCharSequence("errorMessage");
        this.f152057k.mo65507a(bundle.getBundle("impressionLoggerState"));
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superSavedInstanceState", super.onSaveInstanceState());
        bundle.putBoolean("potentialErrorOnConfigChange", this.f152069w);
        bundle.putInt("selectedItemPosition", getSelectedItemPosition());
        bundle.putCharSequence("errorMessage", this.f152065s);
        bundle.putBundle("impressionLoggerState", this.f152057k.mo65508b());
        return bundle;
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        ArrayList arrayList = this.f152048B;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((View.OnFocusChangeListener) arrayList.get(i)).onFocusChange(this, z);
            }
        }
        if (this.f152049C && !z) {
            this.f152049C = false;
        }
    }

    public final boolean performClick() {
        this.f152049C = true;
        return super.performClick();
    }

    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!this.f152071y || accessibilityEvent.getEventType() != 4) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            this.f152071y = false;
        }
    }

    public final void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        if (onFocusChangeListener != null) {
            if (this.f152048B == null) {
                this.f152048B = new ArrayList(1);
            }
            this.f152048B.add(onFocusChangeListener);
        }
    }

    public final void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        if (onItemSelectedListener != null && !this.f152052f.contains(onItemSelectedListener)) {
            this.f152052f.add(onItemSelectedListener);
            this.f152067u = null;
        }
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.f152059m;
        if (view != null) {
            view.setVisibility(i);
        }
    }

    /* renamed from: c */
    public final void mo71974c(int i) {
        Drawable drawable = this.f152066t;
        if (drawable != null) {
            drawable.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        }
    }

    /* renamed from: h */
    public final void mo71977h() {
        bkfr.m105567a(this, getResources().getString(C0126R.string.wallet_uic_accessibility_event_form_field_error, this.f152061o, getError()));
    }

    public FormSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m118541a(context);
    }

    /* renamed from: a */
    public final String mo71968a(int i) {
        Object itemAtPosition = getItemAtPosition(i);
        if ((getAdapter() instanceof BaseAdapter) && !((BaseAdapter) getAdapter()).isEnabled(i)) {
            return "";
        }
        if (itemAtPosition instanceof bkfa) {
            return ((bkfa) itemAtPosition).mo65687a();
        }
        if (itemAtPosition != null) {
            return itemAtPosition.toString();
        }
        return "";
    }

    public FormSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m118541a(context);
    }

    /* renamed from: a */
    public String mo52823a(String str) {
        Object selectedItem = getSelectedItem();
        return (mo65798cL() && selectedItem != null) ? selectedItem.toString() : "";
    }

    /* renamed from: a */
    public final void mo71970a(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        if (onItemSelectedListener != null && !this.f152053g.contains(onItemSelectedListener)) {
            this.f152053g.add(onItemSelectedListener);
            this.f152068v = null;
        }
    }

    /* renamed from: a */
    public final void mo65794a(CharSequence charSequence, boolean z) {
        this.f152058l.mo52929a(charSequence);
        if (z) {
            bjst.m104532b(this.f152056j, 3, this.f152055i, this.f152054h);
        }
        View selectedView = getSelectedView();
        if (selectedView != null) {
            selectedView.setContentDescription(m118544k());
        }
    }

    /* renamed from: a */
    public final boolean mo65795a(Object obj) {
        String c = mo71973c();
        return c != null && c.equals(obj);
    }
}
