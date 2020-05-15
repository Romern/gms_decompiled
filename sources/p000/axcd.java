package p000;

import android.view.ViewGroup;
import com.google.android.chimera.Fragment;

/* renamed from: axcd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axcd extends axca {

    /* renamed from: s */
    final String f95751s;

    protected axcd(ViewGroup viewGroup, String str) {
        super(viewGroup);
        this.f95751s = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo53001a(bkgd bkgd) {
        Fragment findFragmentByTag = bkgd.f124187b.findFragmentByTag(this.f95751s);
        if (findFragmentByTag instanceof bkjj) {
            ((bkjj) findFragmentByTag).mo52947bY();
            bkgd.f124187b.beginTransaction().remove(findFragmentByTag).commitNow();
        }
        super.mo53001a(bkgd);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo53004b(bwig bwig, bkgd bkgd) {
        return false;
    }

    /* renamed from: a */
    public final void mo53002a(bkgd bkgd, boolean z) {
        Fragment findFragmentByTag = bkgd.f124187b.findFragmentByTag(this.f95751s);
        if (findFragmentByTag instanceof bkjj) {
            ((bkjj) findFragmentByTag).mo52808n(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo53003a(bwig bwig, bkgd bkgd) {
        bmeb bmeb = bwig.f159629c;
        if (bmeb == null) {
            bmeb = bmeb.f128902g;
        }
        awzs a = awzs.m81799a(bmeb, bkgd.f124188c, bkgd.f124191f, false, bkgd.f124190e);
        a.f124196aK = bkgd.f124186a;
        bkgd.f124187b.beginTransaction().add(a, this.f95751s).commitNow();
        ((axca) this).f95749t.addView(a.getView());
    }
}
