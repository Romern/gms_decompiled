package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.libraries.bluetooth.fastpair.TrueWirelessHeadset;

/* renamed from: wtk */
final /* synthetic */ class wtk implements bmzi {

    /* renamed from: a */
    private final wts f51300a;

    /* renamed from: b */
    private final TrueWirelessHeadset f51301b;

    public wtk(wts wts, TrueWirelessHeadset trueWirelessHeadset) {
        this.f51300a = wts;
        this.f51301b = trueWirelessHeadset;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        return this.f51300a.getString(C0126R.string.fast_pair_accessibility_battery_level_right, Integer.valueOf(this.f51301b.mo60348c().mo60341b()));
    }
}
