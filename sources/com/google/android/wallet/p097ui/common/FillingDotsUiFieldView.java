package com.google.android.wallet.p097ui.common;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: com.google.android.wallet.ui.common.FillingDotsUiFieldView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FillingDotsUiFieldView extends LinearLayout implements TextWatcher, TextView.OnEditorActionListener, View.OnFocusChangeListener, View.OnKeyListener, bkdd, bkda {

    /* renamed from: a */
    public FormEditText f151959a;

    /* renamed from: b */
    public int f151960b;

    /* renamed from: c */
    private CharSequence f151961c;

    public FillingDotsUiFieldView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo52929a(CharSequence charSequence) {
        this.f151961c = charSequence;
    }

    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        int i = 0;
        while (i < this.f151960b) {
            int i2 = i + 1;
            ImageView imageView = (ImageView) getChildAt(i2);
            if (i < length) {
                imageView.setImageResource(C0126R.C0127drawable.wallet_uic_dot_filled);
            } else {
                imageView.setImageResource(C0126R.C0127drawable.wallet_uic_dot_unfilled);
            }
            i = i2;
        }
    }

    /* renamed from: b */
    public final View mo65860b() {
        return this.f151959a;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: m */
    public final CharSequence mo52932m() {
        return this.f151961c;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return textView == this.f151959a && i == 6;
    }

    public final void onFocusChange(View view, boolean z) {
        if (view == this.f151959a && z) {
            bkfr.m105575a((TextView) view, view.focusSearch(130) != null);
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        boolean z = false;
        if (view != this.f151959a || keyEvent.getKeyCode() != 23 || keyEvent.getAction() != 1) {
            return false;
        }
        TextView textView = (TextView) view;
        if (view.focusSearch(130) != null) {
            z = true;
        }
        bkfr.m105575a(textView, z);
        return true;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public FillingDotsUiFieldView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FillingDotsUiFieldView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public FillingDotsUiFieldView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
