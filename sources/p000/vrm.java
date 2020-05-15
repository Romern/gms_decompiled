package p000;

import androidx.preference.Preference;

/* renamed from: vrm */
final /* synthetic */ class vrm implements anz {

    /* renamed from: a */
    private final vrr f49860a;

    public vrm(vrr vrr) {
        this.f49860a = vrr;
    }

    /* renamed from: a */
    public final boolean mo2218a(Preference preference, Object obj) {
        vrr vrr = this.f49860a;
        vrr.f49865c.mo28759a(bpeb.DRIVING_MODE, bpea.DRIVING_MODE_SETTINGS_CHANGED_ACTIVITY_RECOGNITION);
        vrr.f49866d.mo28780a(((Boolean) obj).booleanValue());
        return true;
    }
}
