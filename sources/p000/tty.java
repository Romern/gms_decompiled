package p000;

import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;

/* renamed from: tty */
final /* synthetic */ class tty implements C0038ax {

    /* renamed from: a */
    private final tud f46663a;

    public tty(tud tud) {
        this.f46663a = tud;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        tud tud = this.f46663a;
        Boolean bool = (Boolean) obj;
        FragmentManager childFragmentManager = tud.getChildFragmentManager();
        Fragment findFragmentByTag = childFragmentManager.findFragmentByTag("custom_passphrase_fragment_tag");
        if (findFragmentByTag != null) {
            childFragmentManager.beginTransaction().remove(findFragmentByTag).commit();
        }
        if (bool.booleanValue()) {
            tud.mo26805b();
            tud.f46673a.mo26755a();
            tud.f46674b.f46585a.mo26751a();
            C0034at c = tud.f46673a.mo26759c();
            C0034at a = tud.f46674b.mo26762a();
            c.mo2445a(tud, new ttz(tud, a, c));
            a.mo2445a(tud, new tua(tud, c, a));
            tud.mo26807c();
            tud.mo26808d();
            return;
        }
        tud.getActivity().finish();
    }
}
