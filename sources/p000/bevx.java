package p000;

import androidx.preference.Preference;

/* renamed from: bevx */
final /* synthetic */ class bevx implements anz {

    /* renamed from: a */
    private final bevz f112772a;

    public bevx(bevz bevz) {
        this.f112772a = bevz;
    }

    /* renamed from: a */
    public final boolean mo2218a(Preference preference, Object obj) {
        bevz bevz = this.f112772a;
        if (!(obj instanceof String)) {
            return false;
        }
        String str = (String) obj;
        preference.mo1966a((CharSequence) str);
        bevy bevy = bevz.f112774d;
        if (bevy == null) {
            return true;
        }
        bevy.mo61186a(str);
        return true;
    }
}
