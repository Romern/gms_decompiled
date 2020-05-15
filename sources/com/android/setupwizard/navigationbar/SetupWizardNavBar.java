package com.android.setupwizard.navigationbar;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SetupWizardNavBar extends Fragment implements ViewTreeObserver.OnPreDrawListener, View.OnClickListener {

    /* renamed from: a */
    public Button f7192a;

    /* renamed from: b */
    public Button f7193b;

    /* renamed from: c */
    private int f7194c = 4610;

    /* renamed from: d */
    private ViewGroup f7195d;

    /* renamed from: e */
    private blv f7196e;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class NavButton extends Button {
        public NavButton(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4;
            super.onTextChanged(charSequence, i, i2, i3);
            if (!TextUtils.isEmpty(charSequence)) {
                i4 = getResources().getDimensionPixelSize(C0126R.dimen.auth_setup_wizard_navbar_button_drawable_padding);
            } else {
                i4 = 0;
            }
            setCompoundDrawablePadding(i4);
        }

        public final void setEnabled(boolean z) {
            float f;
            super.setEnabled(z);
            if (!z) {
                f = 0.23f;
            } else {
                f = 1.0f;
            }
            setAlpha(f);
        }

        public NavButton(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public NavButton(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }

        public NavButton(Context context, AttributeSet attributeSet, int i, int i2) {
            super(context, attributeSet, i, i2);
        }
    }

    /* renamed from: a */
    public final void mo4069a(boolean z, boolean z2) {
        if (!z) {
            this.f7194c &= -4611;
            getActivity().getWindow().clearFlags(Integer.MIN_VALUE);
        } else {
            int i = this.f7194c | 4098;
            this.f7194c = i;
            if (z2) {
                this.f7194c = i | 512;
            }
            getActivity().getWindow().addFlags(Integer.MIN_VALUE);
        }
        getActivity().getWindow().getDecorView().setSystemUiVisibility(this.f7194c);
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f7196e = (blv) activity;
    }

    public void onClick(View view) {
        if (view == this.f7193b) {
            this.f7196e.mo3251a();
        } else if (view == this.f7192a) {
            this.f7196e.mo3253b();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Activity activity = getActivity();
        TypedArray obtainStyledAttributes = getActivity().obtainStyledAttributes(new int[]{C0126R.attr.auth_setup_wizard_navbar_theme, 16842800, 16842801});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId == 0) {
            float[] fArr = new float[3];
            float[] fArr2 = new float[3];
            Color.colorToHSV(obtainStyledAttributes.getColor(1, 0), fArr);
            Color.colorToHSV(obtainStyledAttributes.getColor(2, 0), fArr2);
            if (fArr[2] <= fArr2[2]) {
                resourceId = C0126R.style.auth_setup_wizard_navbar_theme_light;
            } else {
                resourceId = C0126R.style.auth_setup_wizard_navbar_theme_dark;
            }
        }
        obtainStyledAttributes.recycle();
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(new ContextThemeWrapper(activity, resourceId)).inflate((int) C0126R.C0128layout.auth_setup_wizard_navbar_layout, viewGroup, false);
        this.f7195d = viewGroup2;
        this.f7192a = (Button) viewGroup2.findViewById(C0126R.C0129id.auth_setup_wizard_navbar_next);
        this.f7193b = (Button) this.f7195d.findViewById(C0126R.C0129id.auth_setup_wizard_navbar_back);
        this.f7192a.setOnClickListener(this);
        this.f7193b.setOnClickListener(this);
        return this.f7195d;
    }

    public final boolean onPreDraw() {
        getActivity().getWindow().getDecorView().setSystemUiVisibility(this.f7194c);
        return true;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f7196e.mo3252a(this);
        View decorView = getActivity().getWindow().getDecorView();
        decorView.setSystemUiVisibility(this.f7194c);
        decorView.getViewTreeObserver().addOnPreDrawListener(this);
    }
}
