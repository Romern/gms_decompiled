package p000;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* renamed from: bhnu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhnu {

    /* renamed from: a */
    public Drawable f119162a;

    /* renamed from: b */
    public CharSequence f119163b;

    /* renamed from: c */
    public CharSequence f119164c;

    /* renamed from: d */
    public int f119165d = -1;

    /* renamed from: e */
    public View f119166e;

    /* renamed from: f */
    public final int f119167f = 1;

    /* renamed from: g */
    public TabLayout f119168g;

    /* renamed from: h */
    public bhnx f119169h;

    /* renamed from: a */
    public final void mo64060a() {
        TabLayout tabLayout = this.f119168g;
        if (tabLayout != null) {
            tabLayout.mo71220a(this);
            return;
        }
        throw new IllegalArgumentException("Tab not attached to a TabLayout");
    }

    /* renamed from: b */
    public final void mo64063b() {
        bhnx bhnx = this.f119169h;
        if (bhnx != null) {
            bhnx.mo64065a();
        }
    }

    /* renamed from: a */
    public final void mo64061a(Drawable drawable) {
        this.f119162a = drawable;
        TabLayout tabLayout = this.f119168g;
        if (tabLayout.f151265t == 1 || tabLayout.f151268w == 2) {
            tabLayout.mo71222a(true);
        }
        mo64063b();
        int i = bhen.f118404a;
    }

    /* renamed from: a */
    public final void mo64062a(CharSequence charSequence) {
        this.f119164c = charSequence;
        mo64063b();
    }
}
