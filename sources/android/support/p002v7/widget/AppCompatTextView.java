package android.support.p002v7.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.AppCompatTextView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AppCompatTextView extends TextView implements C1320re {

    /* renamed from: b */
    private final C1493xp f1197b;

    /* renamed from: c */
    private final C1520yp f1198c;

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1493xp xpVar = this.f1197b;
        if (xpVar != null) {
            xpVar.mo16498a();
        }
        C1520yp ypVar = this.f1198c;
        if (ypVar != null) {
            ypVar.mo16568a();
        }
    }

    public final int getAutoSizeTextType() {
        return super.getAutoSizeTextType() != 1 ? 0 : 1;
    }

    public final TextClassifier getTextClassifier() {
        int i = Build.VERSION.SDK_INT;
        return super.getTextClassifier();
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C1498xu.m20829a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C1520yp ypVar = this.f1198c;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1493xp xpVar = this.f1197b;
        if (xpVar != null) {
            xpVar.mo16502b();
        }
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1493xp xpVar = this.f1197b;
        if (xpVar != null) {
            xpVar.mo16499a(i);
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1520yp ypVar = this.f1198c;
        if (ypVar != null) {
            ypVar.mo16568a();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1520yp ypVar = this.f1198c;
        if (ypVar != null) {
            ypVar.mo16568a();
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Context context = getContext();
        Drawable drawable4 = null;
        if (i != 0) {
            drawable = C1391tv.m20459b(context, i);
        } else {
            drawable = null;
        }
        if (i2 != 0) {
            drawable2 = C1391tv.m20459b(context, i2);
        } else {
            drawable2 = null;
        }
        if (i3 != 0) {
            drawable3 = C1391tv.m20459b(context, i3);
        } else {
            drawable3 = null;
        }
        if (i4 != 0) {
            drawable4 = C1391tv.m20459b(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1520yp ypVar = this.f1198c;
        if (ypVar != null) {
            ypVar.mo16568a();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Context context = getContext();
        Drawable drawable4 = null;
        if (i != 0) {
            drawable = C1391tv.m20459b(context, i);
        } else {
            drawable = null;
        }
        if (i2 != 0) {
            drawable2 = C1391tv.m20459b(context, i2);
        } else {
            drawable2 = null;
        }
        if (i3 != 0) {
            drawable3 = C1391tv.m20459b(context, i3);
        } else {
            drawable3 = null;
        }
        if (i4 != 0) {
            drawable4 = C1391tv.m20459b(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1520yp ypVar = this.f1198c;
        if (ypVar != null) {
            ypVar.mo16568a();
        }
    }

    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        C1334rs.m20103a();
        super.setCustomSelectionActionModeCallback(callback);
    }

    public final void setFirstBaselineToTopHeight(int i) {
        int i2 = Build.VERSION.SDK_INT;
        super.setFirstBaselineToTopHeight(i);
    }

    public final void setLastBaselineToBottomHeight(int i) {
        int i2 = Build.VERSION.SDK_INT;
        super.setLastBaselineToBottomHeight(i);
    }

    public final void setLineHeight(int i) {
        C1334rs.m20109c(this, i);
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1520yp ypVar = this.f1198c;
        if (ypVar != null) {
            ypVar.mo16569a(context, i);
        }
    }

    public final void setTextClassifier(TextClassifier textClassifier) {
        int i = Build.VERSION.SDK_INT;
        super.setTextClassifier(textClassifier);
    }

    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2 = null;
        if (typeface != null && i > 0) {
            typeface2 = C1171lr.m19558a(getContext(), typeface, i);
        }
        if (typeface2 != null) {
            typeface = typeface2;
        }
        super.setTypeface(typeface, i);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public final int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public final int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ado.m520a(context);
        adm.m515a(this, getContext());
        C1493xp xpVar = new C1493xp(this);
        this.f1197b = xpVar;
        xpVar.mo16501a(attributeSet, i);
        C1520yp ypVar = new C1520yp(this);
        this.f1198c = ypVar;
        ypVar.mo16570a(attributeSet, i);
        this.f1198c.mo16568a();
        new C1518yn(this);
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1520yp ypVar = this.f1198c;
        if (ypVar != null) {
            ypVar.mo16568a();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1520yp ypVar = this.f1198c;
        if (ypVar != null) {
            ypVar.mo16568a();
        }
    }
}
