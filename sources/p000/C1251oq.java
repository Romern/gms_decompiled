package p000;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.felicanetworks.mfc.C0126R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: oq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C1251oq {

    /* renamed from: b */
    private static final View.AccessibilityDelegate f26818b = new View.AccessibilityDelegate();

    /* renamed from: a */
    public final View.AccessibilityDelegate f26819a;

    /* renamed from: c */
    private final View.AccessibilityDelegate f26820c;

    public C1251oq() {
        this(f26818b);
    }

    /* renamed from: b */
    static List m19796b(View view) {
        List list = (List) view.getTag(C0126R.C0129id.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: a */
    public C1304qp mo342a(View view) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeProvider accessibilityNodeProvider = this.f26820c.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C1304qp(accessibilityNodeProvider);
        }
        return null;
    }

    /* renamed from: c */
    public void mo349c(View view, AccessibilityEvent accessibilityEvent) {
        this.f26820c.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: d */
    public void mo350d(View view, AccessibilityEvent accessibilityEvent) {
        this.f26820c.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public C1251oq(View.AccessibilityDelegate accessibilityDelegate) {
        this.f26820c = accessibilityDelegate;
        this.f26819a = new C1250op(this);
    }

    /* renamed from: b */
    public boolean mo348b(View view, AccessibilityEvent accessibilityEvent) {
        return this.f26820c.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public void mo343a(View view, int i) {
        this.f26820c.sendAccessibilityEvent(view, i);
    }

    /* renamed from: a */
    public void mo344a(View view, AccessibilityEvent accessibilityEvent) {
        this.f26820c.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    /* renamed from: a */
    public void mo345a(View view, C1301qm qmVar) {
        this.f26820c.onInitializeAccessibilityNodeInfo(view, qmVar.f26877a);
    }

    /* renamed from: a */
    public boolean mo346a(View view, int i, Bundle bundle) {
        boolean z;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List b = m19796b(view);
        int i2 = 0;
        while (true) {
            if (i2 >= b.size()) {
                break;
            }
            C1298qj qjVar = (C1298qj) b.get(i2);
            if (qjVar.mo15748a() != i) {
                i2++;
            } else if (qjVar.f26874o != null) {
                Class cls = qjVar.f26873n;
                if (cls != null) {
                    try {
                        C1306qr qrVar = (C1306qr) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    } catch (Exception e) {
                        Class cls2 = qjVar.f26873n;
                        String name = cls2 != null ? cls2.getName() : "null";
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + name, e);
                    }
                }
                z = qjVar.f26874o.mo812a(view);
            }
        }
        z = false;
        if (!z) {
            int i3 = Build.VERSION.SDK_INT;
            z = this.f26820c.performAccessibilityAction(view, i, bundle);
        }
        if (z || i != C0126R.C0129id.accessibility_action_clickable_span) {
            return z;
        }
        int i4 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(C0126R.C0129id.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i4)) == null || (clickableSpan = (ClickableSpan) weakReference.get()) == null) {
            return false;
        }
        CharSequence text = view.createAccessibilityNodeInfo().getText();
        ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
        int i5 = 0;
        while (clickableSpanArr != null && i5 < clickableSpanArr.length) {
            if (!clickableSpan.equals(clickableSpanArr[i5])) {
                i5++;
            } else {
                clickableSpan.onClick(view);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo347a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f26820c.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
}
