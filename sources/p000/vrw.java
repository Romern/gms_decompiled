package p000;

import androidx.preference.Preference;
import androidx.preference.SwitchPreference;
import androidx.preference.TwoStatePreference;

/* renamed from: vrw */
final /* synthetic */ class vrw implements aoa {

    /* renamed from: a */
    private final vry f49884a;

    /* renamed from: b */
    private final String f49885b;

    /* renamed from: c */
    private final SwitchPreference f49886c;

    public vrw(vry vry, String str, SwitchPreference switchPreference) {
        this.f49884a = vry;
        this.f49885b = str;
        this.f49886c = switchPreference;
    }

    /* renamed from: a */
    public final boolean mo2219a(Preference preference) {
        vry vry = this.f49884a;
        String str = this.f49885b;
        SwitchPreference switchPreference = this.f49886c;
        vry.f49888c.mo28759a(bpeb.DRIVING_MODE, bpea.DRIVING_MODE_SETTINGS_CHANGED_BLUETOOTH_AUTOLAUNCH_DEVICE);
        vry.f49889d.mo28777a(str, ((TwoStatePreference) switchPreference).f1642a);
        vry.mo28773a(((TwoStatePreference) switchPreference).f1642a);
        return true;
    }
}
