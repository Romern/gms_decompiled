package com.google.android.wallet.p097ui.common;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.android.volley.toolbox.ImageLoader;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.clientlog.LogContext;

/* renamed from: com.google.android.wallet.ui.common.ImageWithCaptionView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ImageWithCaptionView extends FifeNetworkImageView {

    /* renamed from: g */
    private int f152073g;

    /* renamed from: l */
    bmno f152074l;

    /* renamed from: m */
    public ColorStateList f152075m;

    /* renamed from: n */
    boolean f152076n;

    public ImageWithCaptionView(Context context) {
        super(context);
        m118568a(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public static Drawable m118565a(bmno bmno, Context context) {
        return m118567a(bmno, context, new LinearLayout(context), LinearLayout.generateViewId(), 0, 0, null, 1).getDrawable();
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Bitmap a;
        super.onLayout(z, i, i2, i3, i4);
        bmno bmno = this.f152074l;
        if (bmno != null && bmno.f130150k && (getDrawable() instanceof BitmapDrawable) && (a = bkfr.m105547a(((BitmapDrawable) getDrawable()).getBitmap())) != null) {
            setImageBitmap(a);
            invalidate();
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f152073g = bundle.getInt("defaultImageResId");
            super.onRestoreInstanceState(bundle.getParcelable("parentState"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("parentState", super.onSaveInstanceState());
        bundle.putInt("defaultImageResId", this.f152073g);
        return bundle;
    }

    public final void setDefaultImageResId(int i) {
        super.setDefaultImageResId(i);
        this.f152073g = i;
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (getDrawable() != null && !getDrawable().isStateful()) {
            setAlpha(!z ? 77 : 255);
        }
    }

    public final void setImageBitmap(Bitmap bitmap) {
        if (bitmap != null || !this.f152076n) {
            super.setImageBitmap(bitmap);
        }
    }

    public final void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        setEnabled(isEnabled());
    }

    public final void setImageResource(int i) {
        super.setImageResource(i);
        ColorStateList colorStateList = this.f152075m;
        if (colorStateList != null) {
            bkfr.m105572a(this, colorStateList);
        }
    }

    public ImageWithCaptionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m118568a(context, attributeSet);
    }

    public ImageWithCaptionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m118568a(context, attributeSet);
    }

    /* renamed from: a */
    public static ImageWithCaptionView m118566a(bmno bmno, Context context, ViewGroup viewGroup, int i, int i2, int i3, LogContext logContext) {
        return m118567a(bmno, context, viewGroup, i, i2, i3, logContext, 49);
    }

    /* renamed from: a */
    public static ImageWithCaptionView m118567a(bmno bmno, Context context, ViewGroup viewGroup, int i, int i2, int i3, LogContext logContext, int i4) {
        LinearLayout.LayoutParams layoutParams;
        ImageWithCaptionView imageWithCaptionView = new ImageWithCaptionView(context);
        imageWithCaptionView.setId(i);
        if (bjvn.m104718a(bmno.f130142c)) {
            layoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        } else {
            layoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        }
        layoutParams.topMargin = i2;
        layoutParams.bottomMargin = i2;
        C1260oz.m19821a(layoutParams, i3);
        C1260oz.m19823b(layoutParams, i3);
        if (viewGroup instanceof LinearLayout) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = i4;
            layoutParams = layoutParams2;
        }
        imageWithCaptionView.setLayoutParams(layoutParams);
        imageWithCaptionView.mo71994a(bmno, bjvn.m104721b(context), ((Boolean) bjwd.f123461a.mo54082a()).booleanValue(), logContext, true);
        return imageWithCaptionView;
    }

    /* renamed from: a */
    private final void m118568a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bkju.f124469g);
        setErrorImageResId(obtainStyledAttributes.getResourceId(1, 0));
        setDefaultImageResId(obtainStyledAttributes.getResourceId(0, 0));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public static void m118569a(Context context, ImageView imageView, bmno bmno, boolean z) {
        bmnu bmnu;
        int i;
        int i2;
        if (bmno.f130145f > 0 || bmno.f130146g > 0 || ((z && bmno.f130147h > 0) || (z && bmno.f130148i > 0))) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-2, -2);
                imageView.setLayoutParams(layoutParams);
            }
            int i3 = bmno.f130145f;
            if (i3 > 0) {
                layoutParams.width = (int) bkfr.m105541a((float) i3);
            } else if (z && (i2 = bmno.f130147h) > 0) {
                layoutParams.width = i2;
            }
            int i4 = bmno.f130146g;
            if (i4 > 0) {
                layoutParams.height = (int) bkfr.m105541a((float) i4);
            } else if (z && (i = bmno.f130148i) > 0) {
                layoutParams.height = i;
            }
            imageView.setAdjustViewBounds(true);
        }
        if ((bmno.f130140a & 1024) != 0) {
            bmnu = bmno.f130151l;
            if (bmnu == null) {
                bmnu = bmnu.f130170g;
            }
        } else {
            bmnu = null;
        }
        bkfr.m105561a(context, bmnu, imageView);
    }

    /* renamed from: a */
    private final void m118570a(ImageLoader imageLoader, int i) {
        setImageUrl(null, imageLoader);
        setImageResource(i);
    }

    /* renamed from: a */
    public final void mo71991a(bmno bmno) {
        if (bmno == null || (bmno.f130140a & 2) == 0) {
            setVisibility(8);
            return;
        }
        mo71992a(bmno, bjvn.m104721b(getContext().getApplicationContext()), ((Boolean) bjwd.f123461a.mo54082a()).booleanValue());
        setVisibility(0);
    }

    /* renamed from: a */
    public final void mo71992a(bmno bmno, ImageLoader imageLoader, boolean z) {
        mo71993a(bmno, imageLoader, z, (LogContext) null);
    }

    /* renamed from: a */
    public final void mo71993a(bmno bmno, ImageLoader imageLoader, boolean z, LogContext logContext) {
        mo71994a(bmno, imageLoader, z, logContext, false);
    }

    /* renamed from: a */
    public final void mo71994a(bmno bmno, ImageLoader imageLoader, boolean z, LogContext logContext, boolean z2) {
        this.f152074l = bmno;
        if (bmno != null) {
            int i = 2;
            if ((bmno.f130140a & 2) != 0) {
                m118569a(getContext(), this, bmno, z2);
                if (bjvn.m104718a(bmno.f130142c)) {
                    int a = blxd.m107743a(bjvn.m104720b(bmno.f130142c));
                    int a2 = bkfr.m105543a(getContext(), a, this.f152073g);
                    if (this.f152075m == null && ((Boolean) bjwd.f123464d.mo54082a()).booleanValue() && bkfr.m105617g(a)) {
                        this.f152075m = bkfr.m105601c(getContext(), (int) C0126R.attr.internalUicTintForGreyIconEmbeddedImages);
                    }
                    super.setDefaultImageResId(a2);
                    m118570a(imageLoader, a2);
                } else if (bmno.f130142c.startsWith("data:")) {
                    byte[] decode = Base64.decode(bmno.f130142c.substring(bmno.f130142c.indexOf(";base64,") + 8), 0);
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                    if (logContext != null) {
                        long j = bmno.f130141b;
                        if (decodeByteArray == null) {
                            i = 5;
                        }
                        if (!bjst.m104536d(logContext)) {
                            Log.e("ClientLog", "Tried to log dataUriImageDecoded() in an invalid session.");
                        } else {
                            bxvd e = bjst.m104537e(logContext);
                            bwfe bwfe = bwfe.EVENT_NAME_DATA_URI_IMAGE_DECODED;
                            if (e.f164950c) {
                                e.mo74035c();
                                e.f164950c = false;
                            }
                            bwfr bwfr = (bwfr) e.f164949b;
                            bwfr bwfr2 = bwfr.f159113m;
                            bwfr.f159121g = bwfe.f159083I;
                            int i2 = bwfr.f159115a | 4;
                            bwfr.f159115a = i2;
                            int i3 = i2 | 32;
                            bwfr.f159115a = i3;
                            bwfr.f159124j = j;
                            bwfr.f159125k = i - 1;
                            bwfr.f159115a = i3 | 64;
                            bjst.m104528a(logContext.mo71783b(), (bwfr) e.mo74062i());
                        }
                    }
                    if (decodeByteArray != null) {
                        setDefaultImageResId(0);
                        setImageBitmap(decodeByteArray);
                        setAdjustViewBounds(true);
                        this.f152076n = true;
                    }
                } else {
                    super.setDefaultImageResId(this.f152073g);
                    mo71890a(bmno.f130142c, imageLoader, z, bmno.f130143d);
                }
                setContentDescription(bmno.f130149j);
                return;
            }
        }
        m118570a(imageLoader, this.f152073g);
    }
}
