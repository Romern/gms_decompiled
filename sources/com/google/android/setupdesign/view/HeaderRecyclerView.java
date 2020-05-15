package com.google.android.setupdesign.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.p002v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class HeaderRecyclerView extends RecyclerView {

    /* renamed from: a */
    public View f151521a;

    /* renamed from: b */
    private int f151522b;

    /* renamed from: c */
    private boolean f151523c = false;

    public HeaderRecyclerView(Context context) {
        super(context);
        m117911a(null, 0);
    }

    /* renamed from: a */
    private final void m117911a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, bizg.f122374h, i, 0);
        this.f151522b = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0089, code lost:
        if (r1 == false) goto L_0x008d;
     */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View findFocus;
        boolean z = false;
        if (!this.f151523c || keyEvent.getAction() != 1) {
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19) {
                    View findFocus2 = findFocus();
                    if (findFocus2 != null) {
                        int[] iArr = new int[2];
                        int[] iArr2 = new int[2];
                        findFocus2.getLocationInWindow(iArr);
                        getLocationInWindow(iArr2);
                        int i = iArr[1] - iArr2[1];
                        if (i < 0) {
                            smoothScrollBy(0, Math.max((int) (((float) getMeasuredHeight()) * -0.7f), i));
                            z = true;
                        }
                    }
                } else if (keyCode == 20 && (findFocus = findFocus()) != null) {
                    int[] iArr3 = new int[2];
                    int[] iArr4 = new int[2];
                    findFocus.getLocationInWindow(iArr3);
                    getLocationInWindow(iArr4);
                    int measuredHeight = (iArr3[1] + findFocus.getMeasuredHeight()) - (iArr4[1] + getMeasuredHeight());
                    if (measuredHeight > 0) {
                        smoothScrollBy(0, Math.min((int) (((float) getMeasuredHeight()) * 0.7f), measuredHeight));
                        z = true;
                    }
                }
                this.f151523c = z;
            }
            return super.dispatchKeyEvent(keyEvent);
        }
        this.f151523c = false;
        return true;
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int i;
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (this.f151521a != null) {
            i = 1;
        } else {
            i = 0;
        }
        accessibilityEvent.setItemCount(accessibilityEvent.getItemCount() - i);
        accessibilityEvent.setFromIndex(Math.max(accessibilityEvent.getFromIndex() - i, 0));
        int i2 = Build.VERSION.SDK_INT;
        accessibilityEvent.setToIndex(Math.max(accessibilityEvent.getToIndex() - i, 0));
    }

    public final void setAdapter(abh abh) {
        if (!(this.f151521a == null || abh == null)) {
            bjbf bjbf = new bjbf(abh);
            bjbf.f122466d = this.f151521a;
            abh = bjbf;
        }
        super.setAdapter(abh);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, com.google.android.setupdesign.view.HeaderRecyclerView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final void setLayoutManager(abu abu) {
        super.setLayoutManager(abu);
        if (abu != null && this.f151521a == null && this.f151522b != 0) {
            this.f151521a = LayoutInflater.from(getContext()).inflate(this.f151522b, (ViewGroup) this, false);
        }
    }

    public HeaderRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m117911a(attributeSet, 0);
    }

    public HeaderRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m117911a(attributeSet, i);
    }
}
