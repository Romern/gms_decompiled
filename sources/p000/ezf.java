package p000;

import android.view.MenuItem;

/* renamed from: ezf */
final /* synthetic */ class ezf implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    private final ezm f16085a;

    /* renamed from: b */
    private final bsww f16086b;

    public ezf(ezm ezm, bsww bsww) {
        this.f16085a = ezm;
        this.f16086b = bsww;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        ezm ezm = this.f16085a;
        bsww bsww = this.f16086b;
        fde fde = ezm.f16100a;
        bsxn aU = ezm.mo10584aU();
        bsxn bsxn = bsww.f147508c;
        if (bsxn == null) {
            bsxn = bsxn.f147586d;
        }
        fde.mo10732a(aU, bsxn);
        return true;
    }
}
