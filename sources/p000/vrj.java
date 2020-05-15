package p000;

import android.widget.CompoundButton;

/* renamed from: vrj */
final /* synthetic */ class vrj implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    private final vrr f49857a;

    public vrj(vrr vrr) {
        this.f49857a = vrr;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        vrr vrr = this.f49857a;
        vrr.f49865c.mo28759a(bpeb.DRIVING_MODE, bpea.DRIVING_MODE_SETTINGS_CHANGED_BLUETOOTH_AUTOLAUNCH);
        vrr.f49866d.mo28783b(z);
    }
}
