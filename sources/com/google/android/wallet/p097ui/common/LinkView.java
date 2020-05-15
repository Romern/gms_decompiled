package com.google.android.wallet.p097ui.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.p002v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.felicanetworks.mfc.C0126R;
import java.util.Locale;

/* renamed from: com.google.android.wallet.ui.common.LinkView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LinkView extends AppCompatButton implements View.OnClickListener {

    /* renamed from: c */
    private bwhm f152118c;

    /* renamed from: d */
    private bkdb f152119d;

    /* renamed from: e */
    private ViewGroup f152120e;

    /* renamed from: f */
    private int f152121f = -1;

    /* renamed from: g */
    private int f152122g = -1;

    /* renamed from: h */
    private int f152123h;

    public LinkView(Context context) {
        super(context);
        m118646a();
    }

    /* renamed from: a */
    public static LinkView m118644a(bwhm bwhm, Context context, ViewGroup viewGroup, LayoutInflater layoutInflater, bjxv bjxv, bkdb bkdb) {
        return m118645a(bwhm, context, viewGroup, null, layoutInflater, bjxv, bkdb);
    }

    public void onClick(View view) {
        if (this.f152118c != null && this.f152119d != null) {
            Bundle bundle = new Bundle();
            bjvp.m104736a(bundle, "EventListener.EXTRA_LINK_PROTO", this.f152118c);
            this.f152119d.mo51905a(21, bundle);
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        bwhm bwhm;
        int a;
        super.onLayout(z, i, i2, i3, i4);
        if (this.f152120e != null && (bwhm = this.f152118c) != null && (a = bwhl.m121966a(bwhm.f159529f)) != 0 && a == 5) {
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (i5 != this.f152121f || i6 != this.f152122g) {
                this.f152121f = i5;
                this.f152122g = i6;
                Rect rect = new Rect();
                getDrawingRect(rect);
                this.f152120e.offsetDescendantRectToMyCoords(this, rect);
                rect.top -= this.f152123h;
                rect.bottom += this.f152123h;
                this.f152120e.setTouchDelegate(new TouchDelegate(rect, this));
            }
        }
    }

    public final void setEnabled(boolean z) {
        bwhm bwhm = this.f152118c;
        if (bwhm == null || !bwhm.f159530g) {
            super.setEnabled(z);
        }
    }

    public LinkView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m118646a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkfr.a(android.content.Context, android.widget.Button):void
     arg types: [android.content.Context, com.google.android.wallet.ui.common.LinkView]
     candidates:
      bkfr.a(android.content.Context, int):int
      bkfr.a(android.view.View, android.view.View):int
      bkfr.a(android.content.Context, java.lang.String):android.content.Intent
      bkfr.a(android.content.res.Resources, java.util.List):java.lang.String
      bkfr.a(java.lang.String, java.lang.String):java.lang.String
      bkfr.a(android.content.Context, android.view.View):void
      bkfr.a(android.view.View, int):void
      bkfr.a(android.view.View, android.util.TypedValue):void
      bkfr.a(android.view.View, java.lang.CharSequence):void
      bkfr.a(android.view.View, boolean):void
      bkfr.a(android.view.ViewGroup, int):void
      bkfr.a(android.view.ViewGroup, boolean):void
      bkfr.a(android.widget.ImageView, android.content.res.ColorStateList):void
      bkfr.a(android.widget.TextView, java.lang.String):void
      bkfr.a(android.widget.TextView, boolean):void
      bkfr.a(boolean, java.lang.Object):void
      bkfr.a(android.content.Context, bmap):boolean
      bkfr.a(android.content.Context, int[]):boolean
      bkfr.a(com.google.android.chimera.Activity, android.widget.TextView):boolean
      bkfr.a(android.content.Context, android.widget.Button):void */
    /* renamed from: a */
    public static LinkView m118645a(bwhm bwhm, Context context, ViewGroup viewGroup, ViewGroup viewGroup2, LayoutInflater layoutInflater, bjxv bjxv, bkdb bkdb) {
        LinkView linkView;
        int a = bwhl.m121966a(bwhm.f159529f);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        if (i2 == 1) {
            linkView = (LinkView) layoutInflater.inflate((int) C0126R.C0128layout.view_link_primary, viewGroup, false);
            bkfr.m105560a(context, (Button) linkView);
        } else if (i2 == 2 || i2 == 3) {
            linkView = (LinkView) layoutInflater.inflate((int) C0126R.C0128layout.view_link_secondary, viewGroup, false);
            linkView.setTextColor(bkfr.m105600c(context));
        } else if (i2 != 4) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            int a2 = bwhl.m121966a(bwhm.f159529f);
            if (a2 != 0) {
                i = a2;
            }
            objArr[0] = Integer.toString(i - 1);
            throw new IllegalArgumentException(String.format(locale, "Unsupported LinkType=%s", objArr));
        } else {
            linkView = (LinkView) layoutInflater.inflate((int) C0126R.C0128layout.view_link_text, viewGroup, false);
            linkView.setTextColor(bkfr.m105600c(context));
            linkView.f152120e = viewGroup2;
        }
        linkView.f152118c = bwhm;
        bmnr bmnr = bwhm.f159526c;
        if (bmnr == null) {
            bmnr = bmnr.f130153o;
        }
        linkView.setText(bmnr.f130159e);
        super.setEnabled(!bwhm.f159530g);
        linkView.f152119d = bkdb;
        linkView.setId(bjxv.mo65614a());
        return linkView;
    }

    public LinkView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m118646a();
    }

    /* renamed from: a */
    private final void m118646a() {
        setOnClickListener(this);
        setGravity(8388627);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{C0126R.attr.internalUicNonFormFieldTextTopBottomMargin});
        this.f152123h = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }
}
