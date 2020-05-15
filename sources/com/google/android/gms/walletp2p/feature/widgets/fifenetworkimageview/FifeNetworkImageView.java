package com.google.android.gms.walletp2p.feature.widgets.fifenetworkimageview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FifeNetworkImageView extends NetworkImageView {

    /* renamed from: g */
    public boolean f110748g;

    /* renamed from: h */
    public ImageLoader f110749h;

    /* renamed from: i */
    private String f110750i;

    /* renamed from: j */
    private boolean f110751j;

    public FifeNetworkImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public static String m94372a(int i, int i2, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("w");
        sb.append(i);
        sb.append("-h");
        sb.append(i2);
        if (z) {
            sb.append("-cc-mo");
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        String str = this.f110750i;
        if (str != null) {
            post(new axkx(this, str));
            this.f110750i = null;
        }
    }

    public final void setImageBitmap(Bitmap bitmap) {
        if (this.f110751j) {
            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(getResources().getColor(17170445)), new BitmapDrawable(getResources(), bitmap)});
            transitionDrawable.setCrossFadeEnabled(true);
            setImageDrawable(transitionDrawable);
            transitionDrawable.startTransition(300);
            return;
        }
        super.setImageBitmap(bitmap);
    }

    public final void setImageResource(int i) {
        try {
            setImageDrawable(aux.m2149a(getResources(), i, getContext().getTheme()));
        } catch (Resources.NotFoundException e) {
            super.setImageResource(i);
        }
    }

    /* renamed from: a */
    public final void mo60205a(String str, ImageLoader imageLoader, boolean z, boolean z2) {
        ViewGroup.LayoutParams layoutParams;
        if (!ryx.m34690b(str)) {
            setImageUrl(str, imageLoader);
            return;
        }
        this.f110751j = z2;
        int width = getWidth();
        int height = getHeight();
        if (width == 0 && height == 0 && (layoutParams = getLayoutParams()) != null && layoutParams.width > 0 && layoutParams.height > 0) {
            width = layoutParams.width;
            height = layoutParams.height;
        }
        if (width == 0 || height == 0) {
            this.f110750i = str;
            this.f110749h = imageLoader;
            this.f110748g = z;
            return;
        }
        setImageUrl(ryx.m34684a(m94372a(width, height, z), str).toString(), imageLoader);
    }
}
