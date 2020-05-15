package android.support.p002v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.felicanetworks.mfc.C0126R;

/* renamed from: android.support.v7.widget.AppCompatButton */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AppCompatButton extends Button implements C1320re {

    /* renamed from: b */
    public final C1493xp f1176b;

    /* renamed from: c */
    private final C1520yp f1177c;

    public AppCompatButton(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1493xp xpVar = this.f1176b;
        if (xpVar != null) {
            xpVar.mo16498a();
        }
        C1520yp ypVar = this.f1177c;
        if (ypVar != null) {
            ypVar.mo16568a();
        }
    }

    public final int getAutoSizeTextType() {
        return super.getAutoSizeTextType() != 1 ? 0 : 1;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C1520yp ypVar = this.f1177c;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1493xp xpVar = this.f1176b;
        if (xpVar != null) {
            xpVar.mo16502b();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1493xp xpVar = this.f1176b;
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
        C1520yp ypVar = this.f1177c;
        if (ypVar != null) {
            ypVar.mo16569a(context, i);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0126R.attr.buttonStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ado.m520a(context);
        adm.m515a(this, getContext());
        C1493xp xpVar = new C1493xp(this);
        this.f1176b = xpVar;
        xpVar.mo16501a(attributeSet, i);
        C1520yp ypVar = new C1520yp(this);
        this.f1177c = ypVar;
        ypVar.mo16570a(attributeSet, i);
        this.f1177c.mo16568a();
    }
}
