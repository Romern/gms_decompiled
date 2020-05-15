package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.support.p002v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.felicanetworks.mfc.C0126R;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TextInputEditText extends AppCompatEditText {

    /* renamed from: a */
    private final Rect f151272a;

    /* renamed from: b */
    private boolean f151273b;

    public TextInputEditText(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private final TextInputLayout mo71767a() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout a = mo71767a();
        if (a != null && this.f151273b && rect != null) {
            a.getFocusedRect(this.f151272a);
            rect.bottom = this.f151272a.bottom;
        }
    }

    public final boolean getGlobalVisibleRect(Rect rect, Point point) {
        boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
        TextInputLayout a = mo71767a();
        if (!(a == null || !this.f151273b || rect == null)) {
            a.getGlobalVisibleRect(this.f151272a, point);
            rect.bottom = this.f151272a.bottom;
        }
        return globalVisibleRect;
    }

    public final CharSequence getHint() {
        TextInputLayout a = mo71767a();
        if (a == null || !a.f151335i) {
            return super.getHint();
        }
        return a.mo71248a();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout a = mo71767a();
        if (a != null && a.f151335i && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            TextInputLayout a = mo71767a();
            editorInfo.hintText = a != null ? a.mo71248a() : null;
        }
        return onCreateInputConnection;
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        mo71767a();
        int i = Build.VERSION.SDK_INT;
    }

    public final boolean requestRectangleOnScreen(Rect rect) {
        boolean requestRectangleOnScreen = super.requestRectangleOnScreen(rect);
        TextInputLayout a = mo71767a();
        if (a != null && this.f151273b) {
            this.f151272a.set(0, a.getHeight() - getResources().getDimensionPixelOffset(C0126R.dimen.mtrl_edittext_rectangle_top_offset), a.getWidth(), a.getHeight());
            a.requestRectangleOnScreen(this.f151272a, true);
        }
        return requestRectangleOnScreen;
    }

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0126R.attr.editTextStyle);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(bhpq.m101285a(context, attributeSet, i, 0), attributeSet, i);
        this.f151272a = new Rect();
        TypedArray a = bhki.m101052a(context, attributeSet, bhpg.f119260b, i, 2132019314, new int[0]);
        this.f151273b = a.getBoolean(0, false);
        a.recycle();
    }
}
