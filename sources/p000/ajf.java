package p000;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.drawerlayout.widget.DrawerLayout;

/* renamed from: ajf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajf extends C1251oq {

    /* renamed from: b */
    final /* synthetic */ DrawerLayout f640b;

    public ajf(DrawerLayout drawerLayout) {
        this.f640b = drawerLayout;
        new Rect();
    }

    /* renamed from: a */
    public final void mo345a(View view, C1301qm qmVar) {
        int i = DrawerLayout.f1507h;
        super.mo345a(view, qmVar);
        qmVar.mo15755a((CharSequence) "androidx.drawerlayout.widget.DrawerLayout");
        qmVar.mo15767c(false);
        qmVar.mo15771d(false);
        qmVar.mo15762b(C1298qj.f26860a);
        qmVar.mo15762b(C1298qj.f26861b);
    }

    /* renamed from: b */
    public final boolean mo348b(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            return super.mo348b(view, accessibilityEvent);
        }
        accessibilityEvent.getText();
        View b = this.f640b.mo1918b();
        if (b == null) {
            return true;
        }
        C1256ov.m19815a(this.f640b.mo1920c(b), C1280ps.m19923h(this.f640b));
        return true;
    }

    /* renamed from: d */
    public final void mo350d(View view, AccessibilityEvent accessibilityEvent) {
        super.mo350d(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
    }

    /* renamed from: a */
    public final boolean mo347a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        int i = DrawerLayout.f1507h;
        return super.mo347a(viewGroup, view, accessibilityEvent);
    }
}
