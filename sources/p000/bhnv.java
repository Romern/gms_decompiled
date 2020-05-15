package p000;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* renamed from: bhnv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhnv implements avq {

    /* renamed from: a */
    public int f119170a;

    /* renamed from: b */
    public int f119171b;

    /* renamed from: c */
    private final WeakReference f119172c;

    public bhnv(TabLayout tabLayout) {
        this.f119172c = new WeakReference(tabLayout);
    }

    /* renamed from: a */
    public final void mo1834a(int i) {
        TabLayout tabLayout = (TabLayout) this.f119172c.get();
        if (tabLayout != null && tabLayout.mo71230c() != i && i < tabLayout.mo71227b()) {
            int i2 = this.f119171b;
            boolean z = false;
            if (i2 == 0 || (i2 == 2 && this.f119170a == 0)) {
                z = true;
            }
            tabLayout.mo71229b(tabLayout.mo71216a(i), z);
        }
    }

    /* renamed from: b */
    public final void mo1836b(int i) {
        this.f119170a = this.f119171b;
        this.f119171b = i;
    }

    /* renamed from: a */
    public final void mo1835a(int i, float f) {
        boolean z;
        TabLayout tabLayout = (TabLayout) this.f119172c.get();
        if (tabLayout != null) {
            int i2 = this.f119171b;
            boolean z2 = false;
            if (i2 != 2 || this.f119170a == 1) {
                z = true;
            } else {
                z = false;
            }
            if (!(i2 == 2 && this.f119170a == 0)) {
                z2 = true;
            }
            tabLayout.mo71217a(i, f, z, z2);
        }
    }
}
