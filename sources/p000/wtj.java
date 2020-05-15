package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.libraries.bluetooth.fastpair.TrueWirelessHeadset;

/* renamed from: wtj */
final /* synthetic */ class wtj implements bmzi {

    /* renamed from: a */
    private final wts f51298a;

    /* renamed from: b */
    private final TrueWirelessHeadset f51299b;

    public wtj(wts wts, TrueWirelessHeadset trueWirelessHeadset) {
        this.f51298a = wts;
        this.f51299b = trueWirelessHeadset;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        return this.f51298a.getString(C0126R.string.fast_pair_accessibility_battery_level_case, Integer.valueOf(this.f51299b.mo60349d().mo60341b()));
    }
}
