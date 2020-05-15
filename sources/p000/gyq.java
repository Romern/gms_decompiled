package p000;

import android.view.View;

/* renamed from: gyq */
final /* synthetic */ class gyq implements C0038ax {

    /* renamed from: a */
    private final gyt f19249a;

    public gyq(gyt gyt) {
        this.f19249a = gyt;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        gyt gyt = this.f19249a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        View view = gyt.f19258f;
        int i = !booleanValue ? 8 : 0;
        view.setVisibility(i);
        gyt.f19260h.setVisibility(i);
    }
}
