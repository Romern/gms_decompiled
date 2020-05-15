package com.google.android.wallet.p097ui.card;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p002v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.p097ui.common.ImageWithCaptionView;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: com.google.android.wallet.ui.card.CardImagesView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CardImagesView extends RelativeLayout {

    /* renamed from: a */
    public ImageView[] f151860a;

    /* renamed from: b */
    public ImageView[] f151861b;

    /* renamed from: c */
    public ImageView f151862c;

    /* renamed from: d */
    public bkat f151863d;

    /* renamed from: e */
    public int f151864e;

    /* renamed from: f */
    public int f151865f;

    /* renamed from: g */
    public boolean f151866g;

    /* renamed from: h */
    bmno f151867h;

    /* renamed from: i */
    public boolean f151868i;

    /* renamed from: j */
    private int f151869j;

    /* renamed from: k */
    private boolean f151870k;

    /* renamed from: l */
    private boolean f151871l = true;

    /* renamed from: m */
    private bjxv f151872m;

    public CardImagesView(Context context) {
        super(context);
    }

    /* renamed from: a */
    private final void m118383a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bkju.f124464b);
        this.f151864e = obtainStyledAttributes.getDimensionPixelSize(3, context.getResources().getDimensionPixelSize(C0126R.dimen.wallet_uic_credit_card_icon_width));
        this.f151865f = obtainStyledAttributes.getDimensionPixelSize(1, context.getResources().getDimensionPixelSize(C0126R.dimen.wallet_uic_credit_card_icon_height));
        this.f151869j = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f151870k = obtainStyledAttributes.getBoolean(2, false);
        this.f151866g = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    private final bjxv m118384b() {
        if (this.f151872m == null) {
            this.f151872m = bjxv.m104861c();
        }
        return this.f151872m;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        if (!this.f151866g) {
            ImageView imageView = (ImageView) findViewById(C0126R.C0129id.unresolved_logo);
            this.f151862c = imageView;
            if (imageView != null) {
                TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{C0126R.attr.uicCardGenericDrawable});
                int resourceId = obtainStyledAttributes.getResourceId(0, -1);
                obtainStyledAttributes.recycle();
                this.f151862c.setImageResource(resourceId);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f151862c.getLayoutParams();
                layoutParams.width = this.f151864e;
                layoutParams.height = this.f151865f;
                this.f151862c.setLayoutParams(layoutParams);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        if (!this.f151866g && this.f151871l) {
            this.f151871l = false;
            bkat bkat = this.f151863d;
            bmno bmno = this.f151867h;
            int a = bkat.mo65756a(bmno);
            if (a == -1) {
                i5 = bkat.mo65757b(bmno);
            } else {
                i5 = -1;
            }
            float f = a != -1 ? 0.0f : i5 == -1 ? 1.0f : 0.0f;
            int length = bkat.f123896a.length;
            for (int i6 = 0; i6 < length; i6++) {
                bkat.f123896a[i6].animate().cancel();
                if (i6 == a) {
                    bkat.f123896a[i6].setAlpha(1.0f);
                    ImageView[] imageViewArr = bkat.f123896a;
                    imageViewArr[i6].setX((float) imageViewArr[0].getLeft());
                } else {
                    bkat.f123896a[i6].setAlpha(f);
                    bkat.f123896a[i6].setTranslationX(0.0f);
                }
            }
            int length2 = bkat.f123897b.length;
            for (int i7 = 0; i7 < length2; i7++) {
                bkat.f123897b[i7].animate().cancel();
                if (i7 == i5) {
                    bkat.f123897b[i7].setAlpha(1.0f);
                } else {
                    bkat.f123897b[i7].setAlpha(0.0f);
                }
            }
            bkat.f123899d = bmno;
            if (this.f151868i) {
                mo71823a();
            }
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f151867h = (bmno) bjvp.m104730a(bundle, "currentIcon", (bxxk) bmno.f130138m.mo74142c(7));
            this.f151868i = bundle.getBoolean("oneCardMode");
            this.f151872m = bjxv.m104860b(bundle);
            super.onRestoreInstanceState(bundle.getParcelable("parentState"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("parentState", super.onSaveInstanceState());
        bjvp.m104736a(bundle, "currentIcon", this.f151867h);
        bundle.putBoolean("oneCardMode", this.f151868i);
        bjxv bjxv = this.f151872m;
        if (bjxv != null) {
            bjxv.mo65615a(bundle);
        }
        return bundle;
    }

    public CardImagesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m118383a(context, attributeSet);
    }

    public CardImagesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m118383a(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo71823a() {
        int i;
        if (!this.f151866g) {
            this.f151868i = true;
            if (!this.f151871l) {
                bkat bkat = this.f151863d;
                if (!bkat.f123900e) {
                    int a = bkat.mo65756a(bkat.f123899d);
                    if (a == -1) {
                        i = bkat.mo65757b(bkat.f123899d);
                    } else {
                        i = -1;
                    }
                    int length = bkat.f123896a.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        bkat.f123896a[i2].animate().cancel();
                        ImageView[] imageViewArr = bkat.f123896a;
                        imageViewArr[i2].setX((float) imageViewArr[0].getLeft());
                        if (i2 == a) {
                            bkat.f123896a[i2].setAlpha(1.0f);
                        } else {
                            bkat.f123896a[i2].setAlpha(0.0f);
                        }
                    }
                    int length2 = bkat.f123897b.length;
                    for (int i3 = 0; i3 < length2; i3++) {
                        bkat.f123897b[i3].animate().cancel();
                        if (i3 == i) {
                            bkat.f123897b[i3].setAlpha(1.0f);
                        } else {
                            bkat.f123897b[i3].setAlpha(0.0f);
                        }
                    }
                    bkat.f123898c.animate().cancel();
                    bkat.f123898c.setVisibility(0);
                    if (a == -1 && i == -1) {
                        bkat.f123898c.setAlpha(1.0f);
                    } else {
                        bkat.f123898c.setAlpha(0.0f);
                    }
                }
                bkat.f123900e = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("One card mode cannot be used if allImagesStaticOnly is true.");
    }

    /* renamed from: a */
    public final void mo71824a(bmno bmno) {
        int i;
        float f;
        if (!this.f151866g) {
            this.f151867h = bmno;
            if (!this.f151871l) {
                bkat bkat = this.f151863d;
                bmno bmno2 = bkat.f123899d;
                if (bjzb.m104957a(bmno, bmno2)) {
                    return;
                }
                if (bmno == null || bmno2 == null || !bjzb.m104957a(bmno.f130142c, bmno2.f130142c)) {
                    int a = bkat.mo65756a(bmno);
                    if (a == -1) {
                        i = bkat.mo65757b(bmno);
                    } else {
                        i = -1;
                    }
                    if (a != -1) {
                        f = 0.0f;
                    } else {
                        f = (i != -1 || bkat.f123900e) ? 0.0f : 1.0f;
                    }
                    int length = bkat.f123896a.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (i2 != a) {
                            bkat.f123896a[i2].animate().alpha(f);
                            if (!bkat.f123900e) {
                                bkat.f123896a[i2].animate().translationX(0.0f);
                            }
                        } else {
                            bkat.f123896a[i2].animate().alpha(1.0f);
                            if (!bkat.f123900e) {
                                bkat.f123896a[i2].animate().x((float) bkat.f123896a[0].getLeft());
                            }
                        }
                    }
                    int length2 = bkat.f123897b.length;
                    for (int i3 = 0; i3 < length2; i3++) {
                        if (i3 != i) {
                            bkat.f123897b[i3].animate().alpha(0.0f);
                        } else {
                            bkat.f123897b[i3].animate().alpha(1.0f);
                        }
                    }
                    if (bkat.f123900e) {
                        if (a == -1 && i == -1) {
                            bkat.f123898c.animate().alpha(1.0f);
                        } else {
                            bkat.f123898c.animate().alpha(0.0f);
                        }
                    }
                    bkat.f123899d = bmno;
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("setCardIcon cannot be used if allImagesStaticOnly is true.");
    }

    /* renamed from: a */
    public final ImageView[] mo71825a(bmno[] bmnoArr, int i, int i2, boolean z, boolean z2) {
        ImageView imageView;
        int i3;
        bmno[] bmnoArr2 = bmnoArr;
        int length = bmnoArr2.length;
        ArrayList arrayList = new ArrayList(length);
        HashSet hashSet = new HashSet(length);
        int a = m118384b().mo65614a();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{C0126R.attr.uicCardGenericDrawable});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        int i4 = -1;
        for (bmno bmno : bmnoArr2) {
            if (!hashSet.contains(bmno.f130142c)) {
                hashSet.add(bmno.f130142c);
                if (bjvn.m104718a(bmno.f130142c)) {
                    imageView = new AppCompatImageView(getContext());
                } else {
                    imageView = new ImageWithCaptionView(getContext());
                }
                imageView.setLayerType(2, null);
                imageView.setId(a);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i2);
                if (i4 == -1 && this.f151870k) {
                    i3 = 21;
                } else if (z || z2) {
                    i3 = -1;
                } else if (i4 > 0) {
                    C1260oz.m19821a(layoutParams, this.f151869j);
                    i3 = this.f151870k ? 16 : 17;
                } else {
                    i3 = -1;
                }
                if (i3 != -1) {
                    bkfr.m105592b();
                    layoutParams.addRule(i3, i4);
                }
                addView(imageView, layoutParams);
                if (imageView instanceof ImageWithCaptionView) {
                    ImageWithCaptionView imageWithCaptionView = (ImageWithCaptionView) imageView;
                    imageWithCaptionView.mo71992a(bmno, bjvn.m104721b(getContext().getApplicationContext()), ((Boolean) bjwd.f123461a.mo54082a()).booleanValue());
                    imageWithCaptionView.mo71888a();
                    imageWithCaptionView.setErrorImageResId(resourceId);
                } else {
                    imageView.setImageResource(bkfr.m105586b(getContext(), bmno.f130142c));
                }
                imageView.setTag(bmno);
                arrayList.add(imageView);
                i4 = a;
                a = m118384b().mo65614a();
            }
        }
        return (ImageView[]) arrayList.toArray(new ImageView[arrayList.size()]);
    }
}
