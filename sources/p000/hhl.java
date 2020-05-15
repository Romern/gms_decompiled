package p000;

import java.util.List;

/* renamed from: hhl */
final /* synthetic */ class hhl implements C0038ax {

    /* renamed from: a */
    private final hhn f19784a;

    public hhl(hhn hhn) {
        this.f19784a = hhn;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        hhn hhn = this.f19784a;
        hhn.f19789d.mo12441a((List) obj);
        hhn.f19788c.getViewTreeObserver().addOnGlobalLayoutListener(new hhm(hhn));
    }
}
