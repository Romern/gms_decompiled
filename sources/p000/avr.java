package p000;

import android.database.DataSetObserver;
import androidx.viewpager.widget.ViewPager;

/* renamed from: avr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avr extends DataSetObserver {

    /* renamed from: a */
    final /* synthetic */ ViewPager f2393a;

    public avr(ViewPager viewPager) {
        this.f2393a = viewPager;
    }

    public final void onChanged() {
        this.f2393a.mo2142b();
    }

    public final void onInvalidated() {
        this.f2393a.mo2142b();
    }
}
