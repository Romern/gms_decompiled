package p000;

import android.content.Context;
import com.felicanetworks.mfc.C0126R;
import com.google.android.libraries.bluetooth.fastpair.TrueWirelessHeadset;

/* renamed from: ahwq */
final /* synthetic */ class ahwq implements bmzi {

    /* renamed from: a */
    private final Context f68250a;

    /* renamed from: b */
    private final TrueWirelessHeadset f68251b;

    public ahwq(Context context, TrueWirelessHeadset trueWirelessHeadset) {
        this.f68250a = context;
        this.f68251b = trueWirelessHeadset;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        return this.f68250a.getString(C0126R.string.fast_pair_accessibility_battery_level_right, Integer.valueOf(this.f68251b.mo60348c().mo60341b()));
    }
}
