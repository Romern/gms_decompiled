package p000;

import android.content.Context;
import com.felicanetworks.mfc.C0126R;
import com.google.android.libraries.bluetooth.fastpair.TrueWirelessHeadset;

/* renamed from: ahwp */
final /* synthetic */ class ahwp implements bmzi {

    /* renamed from: a */
    private final Context f68248a;

    /* renamed from: b */
    private final TrueWirelessHeadset f68249b;

    public ahwp(Context context, TrueWirelessHeadset trueWirelessHeadset) {
        this.f68248a = context;
        this.f68249b = trueWirelessHeadset;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        return this.f68248a.getString(C0126R.string.fast_pair_accessibility_battery_level_case, Integer.valueOf(this.f68249b.mo60349d().mo60341b()));
    }
}
