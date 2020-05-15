package com.google.android.gms.nearby.sharing.view;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.Attachment;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ContentView extends FrameLayout {

    /* renamed from: a */
    private Context f81144a;

    /* renamed from: b */
    private TextView f81145b;

    /* renamed from: c */
    private LinearLayout f81146c;

    public ContentView(Context context) {
        super(context);
        m67615a(context);
    }

    /* renamed from: a */
    private final void m67614a(int i) {
        TextView textView = this.f81145b;
        if (textView != null) {
            textView.setVisibility(i);
        }
    }

    public ContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m67615a(context);
    }

    /* renamed from: a */
    private final void m67615a(Context context) {
        this.f81144a = context;
        LayoutInflater.from(context).inflate((int) C0126R.C0128layout.sharing_view_content_preview, this);
    }

    public ContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m67615a(context);
    }

    /* renamed from: a */
    private final void m67616a(Uri uri, int i) {
        m67617a(uri, i, 0);
    }

    /* renamed from: a */
    private final void m67617a(Uri uri, int i, int i2) {
        RoundedCornerRectImageView roundedCornerRectImageView = (RoundedCornerRectImageView) this.f81146c.findViewById(i);
        if (roundedCornerRectImageView.getVisibility() != 0) {
            roundedCornerRectImageView.setVisibility(0);
        }
        if (i2 > 0) {
            roundedCornerRectImageView.f81154a = i2;
        }
        Uri uri2 = (Uri) roundedCornerRectImageView.getTag(C0126R.C0128layout.sharing_view_content_preview);
        if (uri2 == null || !uri2.equals(uri)) {
            ColorDrawable colorDrawable = new ColorDrawable(getResources().getColor(C0126R.color.sharing_color_waiting));
            Context context = this.f81144a;
            if (akjf.f72084a == null) {
                akjf.f72084a = new akjf(context);
            }
            akje akje = new akje(akjf.f72084a, uri);
            akje.f72082b = colorDrawable;
            if (akje.f72082b == null) {
                akje.f72082b = new ColorDrawable(0);
            }
            roundedCornerRectImageView.setImageDrawable(akje.f72082b);
            akiu.m59854a(roundedCornerRectImageView);
            int measuredHeight = roundedCornerRectImageView.getMeasuredHeight();
            int measuredWidth = roundedCornerRectImageView.getMeasuredWidth();
            new akjd(akje.f72083c.f72085b, new akjc(roundedCornerRectImageView), akje.f72081a, measuredWidth, measuredHeight).start();
            roundedCornerRectImageView.setTag(C0126R.C0128layout.sharing_view_content_preview, uri);
        }
    }

    /* renamed from: a */
    public final void mo44650a(List list) {
        boolean z;
        this.f81145b = (TextView) findViewById(C0126R.C0129id.file_and_text_preview_title);
        if (list.isEmpty() || !((Attachment) list.get(0)).mo44386d()) {
            z = false;
        } else {
            z = true;
        }
        TextView textView = this.f81145b;
        if (textView != null) {
            if (z) {
                textView.setEllipsize(TextUtils.TruncateAt.END);
                this.f81145b.setMaxLines(2);
            } else {
                textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                this.f81145b.setMaxLines(1);
            }
        }
        this.f81145b.setText(akip.m59840a(getContext(), list));
        this.f81145b.setCompoundDrawablesRelativeWithIntrinsicBounds(akip.m59842b(getContext(), list), (Drawable) null, (Drawable) null, (Drawable) null);
        m67614a(0);
        LinearLayout linearLayout = this.f81146c;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo44651a(Uri[] uriArr) {
        int length = uriArr.length;
        if (length < 3) {
            this.f81146c = (LinearLayout) findViewById(C0126R.C0129id.media_preview_less_than_3);
            m67616a(uriArr[0], C0126R.C0129id.media_preview_image_1_large);
            if (length == 2) {
                m67616a(uriArr[1], C0126R.C0129id.media_preview_image_2_large);
            }
        } else {
            this.f81146c = (LinearLayout) findViewById(C0126R.C0129id.media_preview_multiple);
            m67616a(uriArr[0], C0126R.C0129id.media_preview_image_1_large_in_multiple);
            m67616a(uriArr[1], C0126R.C0129id.media_preview_image_2_small);
            m67617a(uriArr[2], C0126R.C0129id.media_preview_image_3_small, length - 3);
        }
        this.f81146c.setVisibility(0);
        m67614a(8);
    }
}
