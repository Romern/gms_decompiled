package p000;

import androidx.preference.Preference;

/* renamed from: vua */
final /* synthetic */ class vua implements aoa {

    /* renamed from: a */
    private final vuf f49977a;

    public vua(vuf vuf) {
        this.f49977a = vuf;
    }

    /* renamed from: a */
    public final boolean mo2219a(Preference preference) {
        vuf vuf = this.f49977a;
        vuf.f49983c = new vrv();
        vuf.f49983c.setTargetFragment(vuf, 1);
        vuf.f49983c.show(vuf.getFragmentManager(), vrv.class.getName());
        return true;
    }
}
