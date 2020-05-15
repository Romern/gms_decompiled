package android.support.p002v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import com.felicanetworks.mfc.C0126R;

/* renamed from: android.support.v7.widget.AppCompatEditText */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AppCompatEditText extends EditText {

    /* renamed from: a */
    private final C1493xp f1181a;

    /* renamed from: b */
    private final C1520yp f1182b;

    public AppCompatEditText(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1493xp xpVar = this.f1181a;
        if (xpVar != null) {
            xpVar.mo16498a();
        }
        C1520yp ypVar = this.f1182b;
        if (ypVar != null) {
            ypVar.mo16568a();
        }
    }

    public final Editable getText() {
        int i = Build.VERSION.SDK_INT;
        return super.getText();
    }

    public final TextClassifier getTextClassifier() {
        int i = Build.VERSION.SDK_INT;
        return super.getTextClassifier();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C1498xu.m20829a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1493xp xpVar = this.f1181a;
        if (xpVar != null) {
            xpVar.mo16502b();
        }
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1493xp xpVar = this.f1181a;
        if (xpVar != null) {
            xpVar.mo16499a(i);
        }
    }

    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        C1334rs.m20103a();
        super.setCustomSelectionActionModeCallback(callback);
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1520yp ypVar = this.f1182b;
        if (ypVar != null) {
            ypVar.mo16569a(context, i);
        }
    }

    public final void setTextClassifier(TextClassifier textClassifier) {
        int i = Build.VERSION.SDK_INT;
        super.setTextClassifier(textClassifier);
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0126R.attr.editTextStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ado.m520a(context);
        adm.m515a(this, getContext());
        C1493xp xpVar = new C1493xp(this);
        this.f1181a = xpVar;
        xpVar.mo16501a(attributeSet, i);
        C1520yp ypVar = new C1520yp(this);
        this.f1182b = ypVar;
        ypVar.mo16570a(attributeSet, i);
        this.f1182b.mo16568a();
        new C1518yn(this);
    }
}
