package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.libraries.bluetooth.fastpair.TrueWirelessHeadset;

/* renamed from: wti */
final /* synthetic */ class wti implements bmzi {

    /* renamed from: a */
    private final wts f51296a;

    /* renamed from: b */
    private final TrueWirelessHeadset f51297b;

    public wti(wts wts, TrueWirelessHeadset trueWirelessHeadset) {
        this.f51296a = wts;
        this.f51297b = trueWirelessHeadset;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        return this.f51296a.getString(C0126R.string.fast_pair_accessibility_battery_level_left, Integer.valueOf(this.f51297b.mo60347b().mo60341b()));
    }
}
