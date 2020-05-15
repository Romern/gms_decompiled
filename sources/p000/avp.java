package p000;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.viewpager.widget.ViewPager;

/* renamed from: avp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avp extends C1251oq {

    /* renamed from: b */
    final /* synthetic */ ViewPager f2392b;

    public avp(ViewPager viewPager) {
        this.f2392b = viewPager;
    }

    /* renamed from: a */
    private final boolean m2250a() {
        avh avh = this.f2392b.f1753b;
        return avh != null && avh.mo2709a() > 1;
    }

    /* renamed from: d */
    public final void mo350d(View view, AccessibilityEvent accessibilityEvent) {
        avh avh;
        super.mo350d(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        accessibilityEvent.setScrollable(m2250a());
        if (accessibilityEvent.getEventType() == 4096 && (avh = this.f2392b.f1753b) != null) {
            accessibilityEvent.setItemCount(avh.mo2709a());
            accessibilityEvent.setFromIndex(this.f2392b.f1754c);
            accessibilityEvent.setToIndex(this.f2392b.f1754c);
        }
    }

    /* renamed from: a */
    public final void mo345a(View view, C1301qm qmVar) {
        super.mo345a(view, qmVar);
        qmVar.mo15755a((CharSequence) "androidx.viewpager.widget.ViewPager");
        qmVar.mo15782h(m2250a());
        if (this.f2392b.canScrollHorizontally(1)) {
            qmVar.mo15752a(4096);
        }
        if (this.f2392b.canScrollHorizontally(-1)) {
            qmVar.mo15752a(8192);
        }
    }

    /* renamed from: a */
    public final boolean mo346a(View view, int i, Bundle bundle) {
        if (super.mo346a(view, i, bundle)) {
            return true;
        }
        if (i != 4096) {
            if (i != 8192 || !this.f2392b.canScrollHorizontally(-1)) {
                return false;
            }
            ViewPager viewPager = this.f2392b;
            viewPager.mo2143b(viewPager.f1754c - 1);
            return true;
        } else if (!this.f2392b.canScrollHorizontally(1)) {
            return false;
        } else {
            ViewPager viewPager2 = this.f2392b;
            viewPager2.mo2143b(viewPager2.f1754c + 1);
            return true;
        }
    }
}
