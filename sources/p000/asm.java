package p000;

import android.view.View;
import java.util.ArrayList;

/* renamed from: asm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class asm implements ate {

    /* renamed from: a */
    final /* synthetic */ View f2129a;

    /* renamed from: b */
    final /* synthetic */ ArrayList f2130b;

    public asm(View view, ArrayList arrayList) {
        this.f2129a = view;
        this.f2130b = arrayList;
    }

    /* renamed from: a */
    public final void mo2371a() {
    }

    /* renamed from: b */
    public final void mo2373b() {
    }

    /* renamed from: c */
    public final void mo2374c() {
    }

    /* renamed from: a */
    public final void mo2372a(atf atf) {
        atf.mo2473b(this);
        this.f2129a.setVisibility(8);
        int size = this.f2130b.size();
        for (int i = 0; i < size; i++) {
            ((View) this.f2130b.get(i)).setVisibility(0);
        }
    }

    /* renamed from: b */
    public final void mo2388b(atf atf) {
        atf.mo2473b(this);
        atf.mo2463a(this);
    }
}
