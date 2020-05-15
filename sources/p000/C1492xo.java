package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: xo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C1492xo extends AutoCompleteTextView {

    /* renamed from: a */
    private static final int[] f27597a = {16843126};

    /* renamed from: b */
    private final C1493xp f27598b;

    /* renamed from: c */
    private final C1520yp f27599c;

    public C1492xo(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1493xp xpVar = this.f27598b;
        if (xpVar != null) {
            xpVar.mo16498a();
        }
        C1520yp ypVar = this.f27599c;
        if (ypVar != null) {
            ypVar.mo16568a();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C1498xu.m20829a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1493xp xpVar = this.f27598b;
        if (xpVar != null) {
            xpVar.mo16502b();
        }
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1493xp xpVar = this.f27598b;
        if (xpVar != null) {
            xpVar.mo16499a(i);
        }
    }

    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        C1334rs.m20103a();
        super.setCustomSelectionActionModeCallback(callback);
    }

    public final void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C1391tv.m20459b(getContext(), i));
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1520yp ypVar = this.f27599c;
        if (ypVar != null) {
            ypVar.mo16569a(context, i);
        }
    }

    public C1492xo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0126R.attr.autoCompleteTextViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1492xo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ado.m520a(context);
        adm.m515a(this, getContext());
        adr a = adr.m523a(getContext(), attributeSet, f27597a, i, 0);
        if (a.mo461f(0)) {
            setDropDownBackgroundDrawable(a.mo449a(0));
        }
        a.mo450a();
        C1493xp xpVar = new C1493xp(this);
        this.f27598b = xpVar;
        xpVar.mo16501a(attributeSet, i);
        C1520yp ypVar = new C1520yp(this);
        this.f27599c = ypVar;
        ypVar.mo16570a(attributeSet, i);
        this.f27599c.mo16568a();
    }
}
