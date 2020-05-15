package com.google.android.gms.wallet.p088ui.component.instrument.creditcard;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.wallet.ui.component.instrument.creditcard.CreditCardImagesView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CreditCardImagesView extends RelativeLayout {

    /* renamed from: a */
    public ImageView[] f110530a;

    /* renamed from: b */
    public axbc f110531b;

    /* renamed from: c */
    public boolean f110532c = true;

    /* renamed from: d */
    String f110533d = "";

    /* renamed from: e */
    private boolean f110534e = true;

    /* renamed from: f */
    private bjxv f110535f;

    /* renamed from: g */
    private ArrayList f110536g = new ArrayList();

    public CreditCardImagesView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final bjxv mo60099a() {
        if (this.f110535f == null) {
            this.f110535f = bjxv.m104861c();
        }
        return this.f110535f;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f110534e && this.f110531b != null) {
            this.f110534e = false;
            mo60100a(this.f110536g);
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f110533d = bundle.getString("cardNumber");
            this.f110535f = bjxv.m104860b(bundle);
            super.onRestoreInstanceState(bundle.getParcelable("parentState"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("parentState", super.onSaveInstanceState());
        bundle.putString("cardNumber", this.f110533d);
        bjxv bjxv = this.f110535f;
        if (bjxv != null) {
            bjxv.mo65615a(bundle);
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        axbc axbc = this.f110531b;
        if (axbc != null) {
            axbc.f95632c = true;
            mo60100a(this.f110536g);
        }
    }

    /* renamed from: a */
    public final void mo60100a(ArrayList arrayList) {
        this.f110536g = arrayList;
        if (!this.f110534e) {
            axbc axbc = this.f110531b;
            float left = (float) axbc.f95630a[0].getLeft();
            int i = 0;
            int i2 = 0;
            while (true) {
                ImageView[] imageViewArr = axbc.f95630a;
                if (i < imageViewArr.length) {
                    ImageView imageView = imageViewArr[i];
                    int size = arrayList.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            axbc.mo52973a(i, false);
                            axbc.f95633d[i] = -1;
                            break;
                        } else if (bjvn.m104717a((bmhu) arrayList.get(i3), (bmhu) imageView.getTag())) {
                            axbc.mo52973a(i, true);
                            if (!bkfr.m105612e(imageView.getContext()) || Float.compare(imageView.getAlpha(), 0.0f) == 0) {
                                imageView.clearAnimation();
                                imageView.setX(left);
                            } else if (axbc.f95633d[i] != i2 || axbc.f95632c) {
                                imageView.animate().x(left);
                            }
                            axbc.f95633d[i] = i2;
                            if (axbc.f95631b) {
                                left -= (float) imageView.getWidth();
                            } else {
                                left += (float) imageView.getWidth();
                            }
                            i2++;
                        } else {
                            i3++;
                        }
                    }
                    i++;
                } else {
                    axbc.f95632c = false;
                    return;
                }
            }
        }
    }

    public CreditCardImagesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CreditCardImagesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
