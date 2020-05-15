package com.google.android.wallet.p097ui.common;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: com.google.android.wallet.ui.common.SummaryTitleLayout */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SummaryTitleLayout extends LinearLayout implements View.OnClickListener {

    /* renamed from: a */
    public TextView f152229a;

    /* renamed from: b */
    public ImageView f152230b;

    /* renamed from: c */
    public ImageWithCaptionView f152231c;

    /* renamed from: d */
    public int f152232d;

    /* renamed from: e */
    public boolean f152233e;

    /* renamed from: f */
    public bkfg f152234f;

    /* renamed from: g */
    private int f152235g = -1;

    /* renamed from: h */
    private int f152236h = -1;

    public SummaryTitleLayout(Context context) {
        super(context);
        m118767a(context);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.wallet.ui.common.SummaryTitleLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    private final void m118767a(Context context) {
        setOrientation(0);
        View inflate = LayoutInflater.from(context).inflate((int) C0126R.C0128layout.view_summary_title_layout, (ViewGroup) this, true);
        TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.summary_text_title_view);
        this.f152229a = textView;
        textView.setOnClickListener(this);
        ImageView imageView = (ImageView) inflate.findViewById(C0126R.C0129id.title_edit_image);
        this.f152230b = imageView;
        imageView.setOnClickListener(this);
        ImageWithCaptionView imageWithCaptionView = (ImageWithCaptionView) inflate.findViewById(C0126R.C0129id.tooltip_image);
        this.f152231c = imageWithCaptionView;
        imageWithCaptionView.setOnClickListener(this);
        this.f152231c.setDefaultImageResId(bkfr.m105543a(getContext(), (int) ErrorInfo.TYPE_SDU_MEMORY_FULL, -1));
    }

    public void onClick(View view) {
        bkfg bkfg = this.f152234f;
        if (bkfg == null) {
            return;
        }
        if (view == this.f152231c) {
            bkfg.mo65954g();
        } else if (view == this.f152230b && this.f152232d == 2) {
            bkfg.mo65952e();
        } else {
            bkfg.mo65953f();
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ImageWithCaptionView imageWithCaptionView = this.f152231c;
        if (imageWithCaptionView != null && imageWithCaptionView.getVisibility() == 0) {
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (i5 != this.f152235g || i6 != this.f152236h) {
                this.f152235g = i5;
                this.f152236h = i6;
                Rect rect = new Rect();
                rect.top = 0;
                rect.bottom = getHeight();
                rect.left = this.f152231c.getLeft();
                rect.right = this.f152231c.getRight();
                ViewGroup.LayoutParams layoutParams = this.f152231c.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    rect.left -= marginLayoutParams.leftMargin;
                    rect.right += marginLayoutParams.rightMargin;
                }
                setTouchDelegate(new TouchDelegate(rect, this.f152231c));
            }
        }
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        TextView textView = this.f152229a;
        if (textView != null) {
            textView.setEnabled(z);
        }
        ImageView imageView = this.f152230b;
        if (imageView != null) {
            imageView.setEnabled(z);
        }
        ImageWithCaptionView imageWithCaptionView = this.f152231c;
        if (imageWithCaptionView != null) {
            imageWithCaptionView.setEnabled(z);
        }
    }

    public SummaryTitleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m118767a(context);
    }

    public SummaryTitleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m118767a(context);
    }

    public SummaryTitleLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m118767a(context);
    }

    /* renamed from: a */
    public final void mo72114a() {
        ImageView imageView = this.f152230b;
        int i = 8;
        if (!this.f152233e && this.f152232d != 3) {
            i = 0;
        }
        imageView.setVisibility(i);
    }
}
