package com.google.android.wallet.p097ui.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.util.List;

/* renamed from: com.google.android.wallet.ui.common.FormHeaderView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FormHeaderView extends LinearLayout implements bkdf {

    /* renamed from: a */
    private int f152044a;

    /* renamed from: b */
    private bmdn f152045b;

    /* renamed from: c */
    private bjxv f152046c;

    public FormHeaderView(Context context) {
        super(context);
        setVisibility(getVisibility());
    }

    /* renamed from: U */
    public final bkdw mo52821U() {
        return null;
    }

    /* renamed from: a */
    public final String mo52823a(String str) {
        return "";
    }

    /* renamed from: a */
    public final void mo65794a(CharSequence charSequence, boolean z) {
    }

    /* renamed from: a */
    public final boolean mo65795a(Object obj) {
        return false;
    }

    /* renamed from: cL */
    public final boolean mo65798cL() {
        return true;
    }

    /* renamed from: cM */
    public final boolean mo65799cM() {
        return true;
    }

    /* renamed from: cN */
    public final boolean mo65800cN() {
        if (hasFocus() || !requestFocus()) {
            bkfr.m105602c(this);
        }
        return hasFocus();
    }

    public final CharSequence getError() {
        return null;
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("superSavedState"));
        this.f152046c = bjxv.m104860b(bundle);
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superSavedState", super.onSaveInstanceState());
        bjxv bjxv = this.f152046c;
        if (bjxv != null) {
            bjxv.mo65615a(bundle);
        }
        return bundle;
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setEnabled(z);
        }
    }

    public final void setVisibility(int i) {
        this.f152044a = i;
        bmdn bmdn = this.f152045b;
        if (bmdn == null || (bmdn.f128837e.isEmpty() && this.f152045b.f128838f.size() == 0)) {
            super.setVisibility(8);
        } else {
            super.setVisibility(i);
        }
    }

    public FormHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setVisibility(getVisibility());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, com.google.android.wallet.ui.common.FormHeaderView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final void mo71963a(bmdn bmdn, LayoutInflater layoutInflater, bjxu bjxu, List list) {
        if (!bmdn.f128837e.isEmpty()) {
            TextView textView = (TextView) findViewById(C0126R.C0129id.header_title);
            textView.setText(bmdn.f128837e);
            textView.setVisibility(0);
        }
        TypedArray obtainStyledAttributes = layoutInflater.getContext().obtainStyledAttributes(new int[]{C0126R.attr.internalUicInfoMessageLayout});
        int resourceId = obtainStyledAttributes.getResourceId(0, C0126R.C0128layout.view_info_message_text);
        obtainStyledAttributes.recycle();
        boolean isEnabled = isEnabled();
        bxwc bxwc = bmdn.f128838f;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bmnr bmnr = (bmnr) bxwc.get(i);
            InfoMessageView infoMessageView = (InfoMessageView) layoutInflater.inflate(resourceId, (ViewGroup) this, false);
            if (this.f152046c == null) {
                this.f152046c = bjxv.m104861c();
            }
            infoMessageView.setId(this.f152046c.mo65614a());
            infoMessageView.mo72003a(bmnr);
            infoMessageView.f152084h = bjxu;
            addView(infoMessageView);
            list.add(infoMessageView);
            infoMessageView.setEnabled(isEnabled);
        }
        this.f152045b = bmdn;
        setVisibility(this.f152044a);
    }

    public FormHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setVisibility(getVisibility());
    }

    public FormHeaderView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        setVisibility(getVisibility());
    }
}
