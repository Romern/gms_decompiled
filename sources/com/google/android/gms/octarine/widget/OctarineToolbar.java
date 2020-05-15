package com.google.android.gms.octarine.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p002v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.libraries.material.productlockup.ProductLockupView;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OctarineToolbar extends Toolbar {

    /* renamed from: A */
    private final TextView f81414A;

    /* renamed from: B */
    private final TextView f81415B;

    /* renamed from: C */
    private final ProductLockupView f81416C;

    /* renamed from: D */
    private CharSequence f81417D;

    /* renamed from: w */
    public CharSequence f81418w;

    /* renamed from: x */
    public int f81419x;

    /* renamed from: y */
    private final View f81420y;

    /* renamed from: z */
    private final ViewGroup f81421z;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class SavedState extends Toolbar.SavedState {
        public static final Parcelable.Creator CREATOR = new alah();

        /* renamed from: e */
        int f81422e;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f81422e = bsmo.m115982a(parcel.readInt());
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            int i2 = this.f81422e;
            int i3 = i2 - 1;
            if (i2 != 0) {
                parcel.writeInt(i3);
                return;
            }
            throw null;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public OctarineToolbar(Context context) {
        this(context, null);
    }

    /* renamed from: g */
    private final void m67766g(int i) {
        this.f81421z.setVisibility(8);
        this.f81416C.setVisibility(0);
        ProductLockupView productLockupView = this.f81416C;
        productLockupView.mo60464a(productLockupView.getContext().getString(i));
        if (adyf.m51386a(akvo.f72966a)) {
            this.f81416C.mo60465b(2);
        }
        ProductLockupView productLockupView2 = this.f81416C;
        productLockupView2.mo60463a(adyg.m51405b(productLockupView2.getContext(), C0126R.attr.octProductNameColor, C0126R.color.google_grey700));
    }

    /* renamed from: a */
    public final void mo1679a(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f81414A.setVisibility(8);
        } else {
            this.f81414A.setText(charSequence);
            this.f81414A.setVisibility(0);
        }
        this.f81418w = charSequence;
    }

    /* renamed from: b */
    public final void mo1682b(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f81415B.setVisibility(8);
        } else {
            this.f81415B.setText(charSequence);
            this.f81415B.setVisibility(0);
        }
        this.f81417D = charSequence;
    }

    /* renamed from: f */
    public final CharSequence mo1693f() {
        return this.f81418w;
    }

    /* renamed from: g */
    public final CharSequence mo1694g() {
        return this.f81417D;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f1048b);
        mo44780f(savedState.f81422e);
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f81422e = this.f81419x;
        return savedState;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.gms.octarine.widget.OctarineToolbar, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public OctarineToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate((int) C0126R.C0128layout.octarine_app_bar_custom_view, (ViewGroup) this, true);
        this.f81420y = findViewById(C0126R.C0129id.octarine_app_bar_custom_view);
        TextView textView = (TextView) findViewById(C0126R.C0129id.action_bar_title);
        this.f81414A = textView;
        textView.setVisibility(8);
        C1334rs.m20104a(this.f81414A, 2132018364);
        this.f81414A.setTextColor(adyg.m51405b(context, C0126R.attr.octOnBackground, C0126R.color.google_grey900));
        TextView textView2 = (TextView) findViewById(C0126R.C0129id.action_bar_subtitle);
        this.f81415B = textView2;
        C1334rs.m20104a(textView2, 2132018362);
        this.f81415B.setTextColor(adyg.m51405b(context, C0126R.attr.octOnBackground, C0126R.color.google_grey900));
        this.f81421z = (ViewGroup) findViewById(C0126R.C0129id.octarine_app_bar_title_container);
        this.f81416C = (ProductLockupView) findViewById(C0126R.C0129id.octarine_lockup);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eoi.f15400l);
        mo44780f(bsmo.m115982a(obtainStyledAttributes.getInt(0, 1)));
        obtainStyledAttributes.recycle();
        sre.m36087g(context);
        adw adw = (adw) this.f81420y.getLayoutParams();
        adw.f26956a = 17;
        this.f81420y.setLayoutParams(adw);
        mo1675a(context, (int) C0126R.style.OctarineMgTitleTextAppearance);
    }

    /* renamed from: f */
    public final void mo44780f(int i) {
        this.f81419x = i;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 1) {
            this.f81416C.setVisibility(8);
            this.f81421z.setVisibility(0);
        } else if (i2 == 2) {
            m67766g(C0126R.string.common_google);
        } else if (i2 == 3) {
            m67766g(C0126R.string.common_asm_google_account_title);
        }
    }
}
