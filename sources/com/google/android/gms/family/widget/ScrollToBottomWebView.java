package com.google.android.gms.family.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ScrollToBottomWebView extends WebView {

    /* renamed from: a */
    public wrv f31482a;

    public ScrollToBottomWebView(Context context) {
        super(context);
    }

    /* renamed from: a */
    private final void m23344a() {
        wrd wrd;
        View view;
        if (this.f31482a != null && getContentHeight() > 0 && ((int) Math.floor((double) (((float) getContentHeight()) * ((Fragment) this.f31482a).getActivity().getResources().getDisplayMetrics().density))) - (getHeight() + getScrollY()) < 10 && (view = (wrd = (wrd) this.f31482a).f51164d) != null) {
            view.findViewById(C0126R.C0129id.fm_tos_layout_more_button).setVisibility(8);
            wrd.f51164d.findViewById(C0126R.C0129id.fm_tos_layout_continue_button).setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m23344a();
    }

    /* access modifiers changed from: protected */
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        m23344a();
    }

    public ScrollToBottomWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ScrollToBottomWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
