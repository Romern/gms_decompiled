package com.google.android.gms.smart_profile.card.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p002v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.felicanetworks.mfc.C0126R;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BaseCardView extends CardView {
    public BaseCardView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private final void m92530a(String str, Drawable drawable, Drawable drawable2, View.OnClickListener onClickListener) {
        View findViewById = findViewById(C0126R.C0129id.button_container);
        AppCompatButton appCompatButton = (AppCompatButton) findViewById(C0126R.C0129id.bottom_button);
        findViewById.setOnClickListener(onClickListener);
        appCompatButton.setText(str.toUpperCase(Locale.getDefault()));
        appCompatButton.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, drawable2, (Drawable) null);
        findViewById.setVisibility(0);
        findViewById(C0126R.C0129id.separator).setVisibility(0);
        appCompatButton.setVisibility(0);
    }

    /* renamed from: b */
    public final void mo59012b(int i, int i2, View.OnClickListener onClickListener) {
        mo59011a(getContext().getString(i), i2, onClickListener);
    }

    public BaseCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        addView(inflate(getContext(), C0126R.C0128layout.base_card_view, null));
    }

    /* renamed from: a */
    public final void mo59007a(int i) {
        mo59010a(getContext().getString(i));
    }

    /* renamed from: a */
    public final void mo59008a(int i, int i2, View.OnClickListener onClickListener) {
        Drawable b = C1391tv.m20459b(getContext(), i2);
        tey.m36888a(b, C1133kh.m17843b(getContext(), C0126R.color.card_bottom_button_color));
        m92530a(getContext().getString(i), b, null, onClickListener);
    }

    /* renamed from: a */
    public final void mo59009a(View view) {
        ((ViewGroup) findViewById(C0126R.C0129id.card_content)).addView(view);
    }

    /* renamed from: a */
    public final void mo59010a(String str) {
        TextView textView = (TextView) findViewById(C0126R.C0129id.title);
        textView.setPadding(textView.getPaddingLeft(), 0, textView.getPaddingRight(), getContext().getResources().getDimensionPixelSize(C0126R.dimen.card_space_between_entries));
        textView.setVisibility(0);
        textView.setText(str);
    }

    /* renamed from: a */
    public final void mo59011a(String str, int i, View.OnClickListener onClickListener) {
        Drawable b = C1391tv.m20459b(getContext(), i);
        tey.m36888a(b, C1133kh.m17843b(getContext(), C0126R.color.card_bottom_button_color));
        m92530a(str, null, b, onClickListener);
    }
}
