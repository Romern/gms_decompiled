package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.felicanetworks.mfc.C0126R;

/* renamed from: xz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C1503xz extends RadioButton {

    /* renamed from: a */
    private final C1495xr f27626a;

    /* renamed from: b */
    private final C1493xp f27627b;

    /* renamed from: c */
    private final C1520yp f27628c;

    public C1503xz(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, null);
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1493xp xpVar = this.f27627b;
        if (xpVar != null) {
            xpVar.mo16498a();
        }
        C1520yp ypVar = this.f27628c;
        if (ypVar != null) {
            ypVar.mo16568a();
        }
    }

    public final int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        if (this.f27626a != null) {
            int i = Build.VERSION.SDK_INT;
        }
        return compoundPaddingLeft;
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1493xp xpVar = this.f27627b;
        if (xpVar != null) {
            xpVar.mo16502b();
        }
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1493xp xpVar = this.f27627b;
        if (xpVar != null) {
            xpVar.mo16499a(i);
        }
    }

    public final void setButtonDrawable(int i) {
        setButtonDrawable(C1391tv.m20459b(getContext(), i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1503xz(Context context, AttributeSet attributeSet, byte[] bArr) {
        super(context, attributeSet, C0126R.attr.radioButtonStyle);
        ado.m520a(context);
        adm.m515a(this, getContext());
        C1495xr xrVar = new C1495xr(this);
        this.f27626a = xrVar;
        xrVar.mo16509a(attributeSet, C0126R.attr.radioButtonStyle);
        C1493xp xpVar = new C1493xp(this);
        this.f27627b = xpVar;
        xpVar.mo16501a(attributeSet, C0126R.attr.radioButtonStyle);
        C1520yp ypVar = new C1520yp(this);
        this.f27628c = ypVar;
        ypVar.mo16570a(attributeSet, (int) C0126R.attr.radioButtonStyle);
    }

    public final void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C1495xr xrVar = this.f27626a;
        if (xrVar != null) {
            xrVar.mo16508a();
        }
    }
}
