package com.google.android.setupdesign;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.android.setupdesign.view.Illustration;
import com.google.android.setupdesign.view.NavigationBar;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SetupWizardLayout extends TemplateLayout {

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new bizh();

        /* renamed from: a */
        boolean f151485a = false;

        public SavedState(Parcel parcel) {
            super(parcel);
            boolean z = false;
            this.f151485a = parcel.readInt() != 0 ? true : z;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f151485a ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public SetupWizardLayout(Context context) {
        super(context, 0, 0);
        m117833b(null, C0126R.attr.sudLayoutTheme);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.res.Resources.getValue(int, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException}
     arg types: [?, android.util.TypedValue, int]
     candidates:
      ClspMth{android.content.res.Resources.getValue(java.lang.String, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException}
      ClspMth{android.content.res.Resources.getValue(int, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException} */
    /* renamed from: b */
    private void m117833b(AttributeSet attributeSet, int i) {
        ScrollView scrollView = null;
        mo71343a(biyt.class, new biyt(this, null));
        mo71343a(bjad.class, new bjad(this, attributeSet, i));
        mo71343a(bjai.class, new bjai(this));
        mo71343a(bjah.class, new bjah(this));
        bjas bjas = new bjas();
        mo71343a(bjas.class, bjas);
        View b = mo71345b((int) C0126R.C0129id.sud_bottom_scroll_view);
        if (b instanceof ScrollView) {
            scrollView = (ScrollView) b;
        }
        if (scrollView != null) {
            bjas.f122440b = new bjat(bjas, scrollView);
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, bizg.f122382p, i, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            mo71374a(drawable);
        } else {
            Drawable drawable2 = obtainStyledAttributes.getDrawable(1);
            if (drawable2 != null) {
                if (drawable2 instanceof BitmapDrawable) {
                    ((BitmapDrawable) drawable2).setTileModeXY(Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
                }
                mo71374a(drawable2);
            }
        }
        Drawable drawable3 = obtainStyledAttributes.getDrawable(3);
        if (drawable3 == null) {
            Drawable drawable4 = obtainStyledAttributes.getDrawable(6);
            Drawable drawable5 = obtainStyledAttributes.getDrawable(5);
            if (!(drawable4 == null || drawable5 == null)) {
                View b2 = mo71345b((int) C0126R.C0129id.sud_layout_decor);
                if (b2 instanceof Illustration) {
                    Illustration illustration = (Illustration) b2;
                    if (getContext().getResources().getBoolean(C0126R.bool.sudUseTabletLayout)) {
                        if (drawable5 instanceof BitmapDrawable) {
                            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable5;
                            bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
                            bitmapDrawable.setGravity(48);
                        }
                        if (drawable4 instanceof BitmapDrawable) {
                            ((BitmapDrawable) drawable4).setGravity(51);
                        }
                        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable5, drawable4});
                        int i2 = Build.VERSION.SDK_INT;
                        layerDrawable.setAutoMirrored(true);
                        drawable4 = layerDrawable;
                    } else {
                        int i3 = Build.VERSION.SDK_INT;
                        drawable4.setAutoMirrored(true);
                    }
                    illustration.mo71415a(drawable4);
                }
            }
        } else {
            View b3 = mo71345b((int) C0126R.C0129id.sud_layout_decor);
            if (b3 instanceof Illustration) {
                ((Illustration) b3).mo71415a(drawable3);
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize == -1) {
            dimensionPixelSize = getResources().getDimensionPixelSize(C0126R.dimen.sud_decor_padding_top);
        }
        View b4 = mo71345b((int) C0126R.C0129id.sud_layout_decor);
        if (b4 != null) {
            b4.setPadding(b4.getPaddingLeft(), dimensionPixelSize, b4.getPaddingRight(), b4.getPaddingBottom());
        }
        float f = obtainStyledAttributes.getFloat(4, -1.0f);
        if (f == -1.0f) {
            TypedValue typedValue = new TypedValue();
            getResources().getValue((int) C0126R.dimen.sud_illustration_aspect_ratio, typedValue, true);
            f = typedValue.getFloat();
        }
        View b5 = mo71345b((int) C0126R.C0129id.sud_layout_decor);
        if (b5 instanceof Illustration) {
            Illustration illustration2 = (Illustration) b5;
            illustration2.f151524a = f;
            illustration2.invalidate();
            illustration2.requestLayout();
        }
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo64837a(LayoutInflater layoutInflater, int i) {
        if (i == 0) {
            i = C0126R.C0128layout.sud_template;
        }
        return mo71341a(layoutInflater, 2132018269, i);
    }

    /* renamed from: c */
    public final NavigationBar mo71377c() {
        return ((bjah) mo71342a(bjah.class)).mo64947a();
    }

    /* renamed from: e */
    public final TextView mo71378e() {
        return ((bjad) mo71342a(bjad.class)).mo64934a();
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            String valueOf = String.valueOf(parcelable);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
            sb.append("Ignoring restore instance state ");
            sb.append(valueOf);
            Log.w("SetupWizardLayout", sb.toString());
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        mo71376b(savedState.f151485a);
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f151485a = ((bjai) mo71342a(bjai.class)).mo64950a();
        return savedState;
    }

    public SetupWizardLayout(Context context, int i) {
        this(context, i, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ViewGroup mo64838a(int i) {
        if (i == 0) {
            i = C0126R.C0129id.sud_layout_content;
        }
        return super.mo64838a(i);
    }

    public SetupWizardLayout(Context context, int i, int i2) {
        super(context, i, i2);
        m117833b(null, C0126R.attr.sudLayoutTheme);
    }

    /* renamed from: a */
    public final void mo71374a(Drawable drawable) {
        View b = mo71345b((int) C0126R.C0129id.sud_layout_decor);
        if (b != null) {
            b.setBackgroundDrawable(drawable);
        }
    }

    public SetupWizardLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m117833b(attributeSet, C0126R.attr.sudLayoutTheme);
    }

    public SetupWizardLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m117833b(attributeSet, i);
    }

    /* renamed from: a */
    public final void mo71375a(CharSequence charSequence) {
        ((bjad) mo71342a(bjad.class)).mo64937a(charSequence);
    }

    /* renamed from: b */
    public final void mo71376b(boolean z) {
        ((bjai) mo71342a(bjai.class)).mo64949a(z);
    }
}
