package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.support.p002v7.widget.AppCompatImageView;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.volley.toolbox.ImageLoader;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.wallet.p097ui.common.CheckboxView;
import com.google.android.wallet.p097ui.common.ImageWithCaptionView;
import java.util.Arrays;

/* renamed from: bkfl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkfl extends LinearLayout implements View.OnClickListener, View.OnFocusChangeListener, bkdd {

    /* renamed from: a */
    public bkfk f124143a;

    /* renamed from: b */
    public View f124144b;

    /* renamed from: c */
    public ImageView f124145c;

    /* renamed from: d */
    private bmoq f124146d;

    /* renamed from: e */
    private boolean f124147e;

    /* renamed from: f */
    private boolean f124148f;

    /* renamed from: g */
    private int f124149g;

    /* renamed from: h */
    private int f124150h = -1;

    /* renamed from: i */
    private int f124151i = -1;

    public bkfl(Context context) {
        super(context, null);
    }

    /* renamed from: a */
    private final void m105535a(boolean z) {
        int i;
        boolean z2 = true;
        if (this.f124147e && !this.f124144b.hasFocus()) {
            z2 = false;
        }
        if (!z2) {
            i = 4;
        } else {
            i = 0;
        }
        if (this.f124145c.getVisibility() != i) {
            if (!z) {
                this.f124145c.setVisibility(i);
            } else if (!z2) {
                bkfr.m105564a(this.f124145c, 0, 0);
            } else {
                bkcd.m105304a(this.f124145c, 0);
            }
            this.f124145c.setClickable(z2);
        }
    }

    public final void addView(View view) {
        throw new UnsupportedOperationException("Do not directly add views to TooltipUiFieldView.");
    }

    /* renamed from: b */
    public final View mo65860b() {
        return this.f124144b;
    }

    public void onClick(View view) {
        bkfk bkfk;
        if (view == this.f124145c && (bkfk = this.f124143a) != null) {
            bkfk.mo65959a(this.f124146d);
        }
    }

    public final void onFocusChange(View view, boolean z) {
        if (view == this.f124144b) {
            m105535a(true);
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != this.f124150h || i6 != this.f124151i) {
            this.f124150h = i5;
            this.f124151i = i6;
            if (this.f124148f) {
                Rect rect = new Rect();
                rect.top = 0;
                rect.bottom = getHeight();
                if (this.f124144b.getLeft() < this.f124145c.getLeft()) {
                    rect.left = this.f124144b.getRight();
                    rect.right = getWidth();
                } else {
                    rect.left = 0;
                    rect.right = this.f124144b.getLeft();
                }
                setTouchDelegate(new TouchDelegate(rect, this.f124145c));
            }
        }
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        View view = this.f124144b;
        if (view != null) {
            view.setEnabled(z);
        }
        this.f124145c.setEnabled(z);
    }

    /* renamed from: a */
    public final void mo65960a() {
        this.f124147e = true;
        if (this.f124144b != null) {
            m105535a(false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x029f  */
    /* renamed from: a */
    public final void mo65961a(View view, bmqf bmqf, ImageLoader imageLoader) {
        ImageView imageView;
        ColorStateList c;
        LinearLayout.LayoutParams layoutParams;
        bmqe bmqe;
        boolean a;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        View view2 = view;
        bmqf bmqf2 = bmqf;
        if (this.f124144b != null) {
            throw new IllegalStateException("setContent should only be called once.");
        } else if (!(view2 instanceof TextView) && !(view2 instanceof CheckboxView)) {
            throw new IllegalArgumentException("Tooltips are only supported for text, checkbox and date UI fields.");
        } else {
            this.f124144b = view2;
            bmoq bmoq = bmqf2.f130382k;
            if (bmoq == null) {
                bmoq = bmoq.f130246g;
            }
            this.f124146d = bmoq;
            int[] iArr = {C0126R.attr.uicFormInlineTooltipIconEnabled, C0126R.attr.uicFormTooltipIconSize, C0126R.attr.uicClickableBackground, C0126R.attr.internalUicNonFormFieldTextStartMargin, C0126R.attr.uicFormItemHeight};
            Arrays.sort(iArr);
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(iArr);
            boolean z = obtainStyledAttributes.getBoolean(Arrays.binarySearch(iArr, (int) C0126R.attr.uicFormInlineTooltipIconEnabled), false);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(Arrays.binarySearch(iArr, (int) C0126R.attr.uicFormTooltipIconSize), 0);
            int resourceId = obtainStyledAttributes.getResourceId(Arrays.binarySearch(iArr, (int) C0126R.attr.uicClickableBackground), 0);
            this.f124149g = obtainStyledAttributes.getDimensionPixelSize(Arrays.binarySearch(iArr, (int) C0126R.attr.internalUicNonFormFieldTextStartMargin), 0);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(Arrays.binarySearch(iArr, (int) C0126R.attr.uicFormItemHeight), 0);
            obtainStyledAttributes.recycle();
            int dimensionPixelSize3 = getResources().getDimensionPixelSize(C0126R.dimen.wallet_uic_minimum_tappable_item_size);
            bmoq bmoq2 = this.f124146d;
            if ((bmoq2.f130248a & 1) != 0) {
                bmno bmno = bmoq2.f130249b;
                if (bmno == null) {
                    bmno = bmno.f130138m;
                }
                if (bjvn.m104718a(bmno.f130142c)) {
                    this.f124145c = new AppCompatImageView(getContext());
                    if (z && (view2 instanceof EditText)) {
                        if (bmqf2.f130373b != 6) {
                            bmqe = (bmqe) bmqf2.f130374c;
                        } else {
                            bmqe = bmqe.f130351s;
                        }
                        RelativeLayout relativeLayout = new RelativeLayout(getContext());
                        super.addView(relativeLayout);
                        relativeLayout.addView(this.f124144b);
                        this.f124148f = false;
                        int[] iArr2 = {C0126R.attr.internalUicInlineTooltipEndMargin, C0126R.attr.internalUicInlineTooltipBottomMargin};
                        Arrays.sort(iArr2);
                        TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(iArr2);
                        int dimensionPixelSize4 = obtainStyledAttributes2.getDimensionPixelSize(Arrays.binarySearch(iArr2, (int) C0126R.attr.internalUicInlineTooltipBottomMargin), getResources().getDimensionPixelSize(C0126R.dimen.wallet_uic_inline_tooltip_bottom_margin));
                        int dimensionPixelSize5 = obtainStyledAttributes2.getDimensionPixelSize(Arrays.binarySearch(iArr2, (int) C0126R.attr.internalUicInlineTooltipEndMargin), getResources().getDimensionPixelSize(C0126R.dimen.wallet_uic_margin_touchable));
                        obtainStyledAttributes2.recycle();
                        a = bkft.m105639a(bmqe);
                        int i8 = Build.VERSION.SDK_INT;
                        if (dimensionPixelSize >= dimensionPixelSize3) {
                            i4 = (dimensionPixelSize3 - dimensionPixelSize) / 2;
                            i3 = Math.min(dimensionPixelSize5, i4);
                            i2 = dimensionPixelSize5 - i3;
                            i = Math.min(dimensionPixelSize4, i4);
                            int i9 = dimensionPixelSize + i;
                            dimensionPixelSize4 -= i;
                            i5 = i4 + i9 > dimensionPixelSize2 ? dimensionPixelSize2 - i9 : i4;
                        } else {
                            i2 = dimensionPixelSize5;
                            i5 = 0;
                            i4 = 0;
                            i3 = 0;
                            i = 0;
                        }
                        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(dimensionPixelSize + i4 + i3, dimensionPixelSize + i5 + i);
                        if (!a) {
                            this.f124145c.setPadding(i4, i5, i3, i);
                            layoutParams2.setMargins(0, 0, i2, dimensionPixelSize4);
                            layoutParams2.addRule(7, this.f124144b.getId());
                        } else {
                            C1280ps.m19885a(this.f124145c, i4, i5, i3, i);
                            layoutParams2.topMargin = 0;
                            layoutParams2.bottomMargin = dimensionPixelSize4;
                            C1260oz.m19821a(layoutParams2, 0);
                            C1260oz.m19823b(layoutParams2, i2);
                            bkfr.m105592b();
                            layoutParams2.addRule(19, this.f124144b.getId());
                        }
                        layoutParams2.addRule(8, this.f124144b.getId());
                        relativeLayout.addView(this.f124145c, layoutParams2);
                        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f124145c.getLayoutParams();
                        if (a) {
                            if (layoutParams3 != null) {
                                i7 = layoutParams3.width + C1260oz.m19822b(layoutParams3);
                            } else {
                                i7 = dimensionPixelSize + dimensionPixelSize5;
                            }
                            if (C1280ps.m19927j(this.f124144b) < i7) {
                                int i10 = Build.VERSION.SDK_INT;
                                if (getResources().getConfiguration().getLayoutDirection() == 1) {
                                    View view3 = this.f124144b;
                                    view3.setPadding(i7, view3.getPaddingTop(), C1280ps.m19927j(this.f124144b), this.f124144b.getPaddingBottom());
                                } else {
                                    View view4 = this.f124144b;
                                    C1280ps.m19885a(view4, C1280ps.m19925i(view4), this.f124144b.getPaddingTop(), i7, this.f124144b.getPaddingBottom());
                                }
                            }
                        } else {
                            if (layoutParams3 != null) {
                                i6 = layoutParams3.width + layoutParams3.rightMargin;
                            } else {
                                i6 = dimensionPixelSize + dimensionPixelSize5;
                            }
                            if (this.f124144b.getPaddingRight() < i6) {
                                View view5 = this.f124144b;
                                view5.setPadding(view5.getPaddingLeft(), this.f124144b.getPaddingTop(), i6, this.f124144b.getPaddingBottom());
                            }
                        }
                        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.f124144b.getLayoutParams();
                        relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(layoutParams4.width, -2));
                        setLayoutParams(new LinearLayout.LayoutParams(layoutParams4.width, -2));
                    } else {
                        super.addView(view);
                        layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
                        setLayoutParams(new LinearLayout.LayoutParams(layoutParams.width, -2));
                        if (layoutParams.width == -1) {
                            layoutParams.width = 0;
                            layoutParams.weight = 1.0f;
                        }
                        view2.setLayoutParams(layoutParams);
                        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
                        if (dimensionPixelSize < dimensionPixelSize3) {
                            this.f124148f = true;
                        }
                        layoutParams5.gravity = 17;
                        C1260oz.m19821a(layoutParams5, getResources().getDimensionPixelSize(C0126R.dimen.wallet_uic_icon_margin));
                        C1260oz.m19823b(layoutParams5, this.f124149g);
                        addView(this.f124145c, layoutParams5);
                    }
                    view2.setOnFocusChangeListener(this);
                    imageView = this.f124145c;
                    if (imageView instanceof ImageWithCaptionView) {
                        ImageWithCaptionView imageWithCaptionView = (ImageWithCaptionView) imageView;
                        imageWithCaptionView.setDefaultImageResId(bkfr.m105543a(getContext(), (int) ErrorInfo.TYPE_SDU_MEMORY_FULL, -1));
                        bmno bmno2 = this.f124146d.f130249b;
                        if (bmno2 == null) {
                            bmno2 = bmno.f130138m;
                        }
                        imageWithCaptionView.mo71992a(bmno2, imageLoader, ((Boolean) bjwd.f123461a.mo54082a()).booleanValue());
                    } else {
                        bmno bmno3 = this.f124146d.f130249b;
                        if (bmno3 == null) {
                            bmno3 = bmno.f130138m;
                        }
                        int a2 = blxd.m107743a(bjvn.m104720b(bmno3.f130142c));
                        this.f124145c.setImageResource(bkfr.m105543a(getContext(), a2, -1));
                        if (((Boolean) bjwd.f123464d.mo54082a()).booleanValue() && bkfr.m105617g(a2) && (c = bkfr.m105601c(getContext(), (int) C0126R.attr.internalUicTintForGreyIconEmbeddedImages)) != null) {
                            bkfr.m105572a(this.f124145c, c);
                        }
                        ImageView imageView2 = this.f124145c;
                        bmno bmno4 = this.f124146d.f130249b;
                        if (bmno4 == null) {
                            bmno4 = bmno.f130138m;
                        }
                        imageView2.setContentDescription(bmno4.f130149j);
                    }
                    this.f124145c.setBackgroundResource(resourceId);
                    m105535a(false);
                    this.f124145c.setOnClickListener(this);
                }
            }
            this.f124145c = new ImageWithCaptionView(getContext());
            if (z) {
                if (bmqf2.f130373b != 6) {
                }
                RelativeLayout relativeLayout2 = new RelativeLayout(getContext());
                super.addView(relativeLayout2);
                relativeLayout2.addView(this.f124144b);
                this.f124148f = false;
                int[] iArr22 = {C0126R.attr.internalUicInlineTooltipEndMargin, C0126R.attr.internalUicInlineTooltipBottomMargin};
                Arrays.sort(iArr22);
                TypedArray obtainStyledAttributes22 = getContext().obtainStyledAttributes(iArr22);
                int dimensionPixelSize42 = obtainStyledAttributes22.getDimensionPixelSize(Arrays.binarySearch(iArr22, (int) C0126R.attr.internalUicInlineTooltipBottomMargin), getResources().getDimensionPixelSize(C0126R.dimen.wallet_uic_inline_tooltip_bottom_margin));
                int dimensionPixelSize52 = obtainStyledAttributes22.getDimensionPixelSize(Arrays.binarySearch(iArr22, (int) C0126R.attr.internalUicInlineTooltipEndMargin), getResources().getDimensionPixelSize(C0126R.dimen.wallet_uic_margin_touchable));
                obtainStyledAttributes22.recycle();
                a = bkft.m105639a(bmqe);
                int i82 = Build.VERSION.SDK_INT;
                if (dimensionPixelSize >= dimensionPixelSize3) {
                }
                RelativeLayout.LayoutParams layoutParams22 = new RelativeLayout.LayoutParams(dimensionPixelSize + i4 + i3, dimensionPixelSize + i5 + i);
                if (!a) {
                }
                layoutParams22.addRule(8, this.f124144b.getId());
                relativeLayout2.addView(this.f124145c, layoutParams22);
                RelativeLayout.LayoutParams layoutParams32 = (RelativeLayout.LayoutParams) this.f124145c.getLayoutParams();
                if (a) {
                }
                RelativeLayout.LayoutParams layoutParams42 = (RelativeLayout.LayoutParams) this.f124144b.getLayoutParams();
                relativeLayout2.setLayoutParams(new LinearLayout.LayoutParams(layoutParams42.width, -2));
                setLayoutParams(new LinearLayout.LayoutParams(layoutParams42.width, -2));
                view2.setOnFocusChangeListener(this);
                imageView = this.f124145c;
                if (imageView instanceof ImageWithCaptionView) {
                }
                this.f124145c.setBackgroundResource(resourceId);
                m105535a(false);
                this.f124145c.setOnClickListener(this);
            }
            super.addView(view);
            layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            setLayoutParams(new LinearLayout.LayoutParams(layoutParams.width, -2));
            if (layoutParams.width == -1) {
            }
            view2.setLayoutParams(layoutParams);
            LinearLayout.LayoutParams layoutParams52 = new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
            if (dimensionPixelSize < dimensionPixelSize3) {
            }
            layoutParams52.gravity = 17;
            C1260oz.m19821a(layoutParams52, getResources().getDimensionPixelSize(C0126R.dimen.wallet_uic_icon_margin));
            C1260oz.m19823b(layoutParams52, this.f124149g);
            addView(this.f124145c, layoutParams52);
            view2.setOnFocusChangeListener(this);
            imageView = this.f124145c;
            if (imageView instanceof ImageWithCaptionView) {
            }
            this.f124145c.setBackgroundResource(resourceId);
            m105535a(false);
            this.f124145c.setOnClickListener(this);
        }
    }
}
