package p000;

import android.os.Build;
import android.os.Bundle;
import android.support.p001v4.widget.NestedScrollView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;

/* renamed from: ro */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1330ro extends C1251oq {
    /* renamed from: a */
    public final void mo345a(View view, C1301qm qmVar) {
        int a;
        super.mo345a(view, qmVar);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        qmVar.mo15755a((CharSequence) ScrollView.class.getName());
        if (nestedScrollView.isEnabled() && (a = nestedScrollView.mo1126a()) > 0) {
            qmVar.mo15782h(true);
            if (nestedScrollView.getScrollY() > 0) {
                qmVar.mo15757a(C1298qj.f26865f);
                qmVar.mo15757a(C1298qj.f26869j);
            }
            if (nestedScrollView.getScrollY() < a) {
                qmVar.mo15757a(C1298qj.f26864e);
                qmVar.mo15757a(C1298qj.f26870k);
            }
        }
    }

    /* renamed from: d */
    public final void mo350d(View view, AccessibilityEvent accessibilityEvent) {
        boolean z;
        super.mo350d(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        if (nestedScrollView.mo1126a() > 0) {
            z = true;
        } else {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        int scrollX = nestedScrollView.getScrollX();
        int i = Build.VERSION.SDK_INT;
        accessibilityEvent.setMaxScrollX(scrollX);
        int a = nestedScrollView.mo1126a();
        int i2 = Build.VERSION.SDK_INT;
        accessibilityEvent.setMaxScrollY(a);
    }

    /* renamed from: a */
    public final boolean mo346a(View view, int i, Bundle bundle) {
        if (super.mo346a(view, i, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (!nestedScrollView.isEnabled()) {
            return false;
        }
        if (i != 4096) {
            if (i == 8192 || i == 16908344) {
                int height = nestedScrollView.getHeight();
                int paddingBottom = nestedScrollView.getPaddingBottom();
                int max = Math.max(nestedScrollView.getScrollY() - ((height - paddingBottom) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.mo1163g(max);
                return true;
            } else if (i != 16908346) {
                return false;
            }
        }
        int height2 = nestedScrollView.getHeight();
        int paddingBottom2 = nestedScrollView.getPaddingBottom();
        int min = Math.min(nestedScrollView.getScrollY() + ((height2 - paddingBottom2) - nestedScrollView.getPaddingTop()), nestedScrollView.mo1126a());
        if (min == nestedScrollView.getScrollY()) {
            return false;
        }
        nestedScrollView.mo1163g(min);
        return true;
    }
}
