package android.support.p002v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.felicanetworks.mfc.C0126R;

/* renamed from: android.support.v7.widget.AppCompatCheckBox */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AppCompatCheckBox extends CheckBox {

    /* renamed from: a */
    private final C1495xr f1178a;

    /* renamed from: b */
    private final C1493xp f1179b;

    /* renamed from: c */
    private final C1520yp f1180c;

    public AppCompatCheckBox(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1493xp xpVar = this.f1179b;
        if (xpVar != null) {
            xpVar.mo16498a();
        }
        C1520yp ypVar = this.f1180c;
        if (ypVar != null) {
            ypVar.mo16568a();
        }
    }

    public final int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        if (this.f1178a != null) {
            int i = Build.VERSION.SDK_INT;
        }
        return compoundPaddingLeft;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1493xp xpVar = this.f1179b;
        if (xpVar != null) {
            xpVar.mo16502b();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1493xp xpVar = this.f1179b;
        if (xpVar != null) {
            xpVar.mo16499a(i);
        }
    }

    public final void setButtonDrawable(int i) {
        setButtonDrawable(C1391tv.m20459b(getContext(), i));
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0126R.attr.checkboxStyle);
    }

    public final void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C1495xr xrVar = this.f1178a;
        if (xrVar != null) {
            xrVar.mo16508a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ado.m520a(context);
        adm.m515a(this, getContext());
        C1495xr xrVar = new C1495xr(this);
        this.f1178a = xrVar;
        xrVar.mo16509a(attributeSet, i);
        C1493xp xpVar = new C1493xp(this);
        this.f1179b = xpVar;
        xpVar.mo16501a(attributeSet, i);
        C1520yp ypVar = new C1520yp(this);
        this.f1180c = ypVar;
        ypVar.mo16570a(attributeSet, i);
    }
}
