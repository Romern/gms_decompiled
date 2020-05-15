package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* renamed from: xq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C1494xq extends CheckedTextView {

    /* renamed from: a */
    private static final int[] f27606a = {16843016};

    /* renamed from: b */
    private final C1520yp f27607b;

    public C1494xq(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1520yp ypVar = this.f27607b;
        if (ypVar != null) {
            ypVar.mo16568a();
        }
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C1498xu.m20829a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public final void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C1391tv.m20459b(getContext(), i));
    }

    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        C1334rs.m20103a();
        super.setCustomSelectionActionModeCallback(callback);
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1520yp ypVar = this.f27607b;
        if (ypVar != null) {
            ypVar.mo16569a(context, i);
        }
    }

    public C1494xq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1494xq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ado.m520a(context);
        adm.m515a(this, getContext());
        C1520yp ypVar = new C1520yp(this);
        this.f27607b = ypVar;
        ypVar.mo16570a(attributeSet, i);
        this.f27607b.mo16568a();
        adr a = adr.m523a(getContext(), attributeSet, f27606a, i, 0);
        setCheckMarkDrawable(a.mo449a(0));
        a.mo450a();
    }
}
