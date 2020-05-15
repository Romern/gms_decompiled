package com.google.android.gms.plus.audience;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AudienceAvatarImageView extends FrameLayout {

    /* renamed from: a */
    private ImageView f82275a;

    public AudienceAvatarImageView(Context context) {
        super(context);
        m68346a(context);
    }

    /* renamed from: a */
    private final void m68346a(Context context) {
        ImageView imageView = new ImageView(context);
        this.f82275a = imageView;
        addView(imageView);
    }

    public AudienceAvatarImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m68346a(context);
    }

    /* renamed from: a */
    public final void mo46542a(Bitmap bitmap) {
        this.f82275a.setImageBitmap(ssa.m36185a(bitmap));
    }

    public AudienceAvatarImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m68346a(context);
    }
}
