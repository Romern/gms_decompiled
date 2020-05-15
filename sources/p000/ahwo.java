package p000;

import android.content.Context;
import com.felicanetworks.mfc.C0126R;
import com.google.android.libraries.bluetooth.fastpair.TrueWirelessHeadset;

/* renamed from: ahwo */
final /* synthetic */ class ahwo implements bmzi {

    /* renamed from: a */
    private final Context f68246a;

    /* renamed from: b */
    private final TrueWirelessHeadset f68247b;

    public ahwo(Context context, TrueWirelessHeadset trueWirelessHeadset) {
        this.f68246a = context;
        this.f68247b = trueWirelessHeadset;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        return this.f68246a.getString(C0126R.string.fast_pair_accessibility_battery_level_left, Integer.valueOf(this.f68247b.mo60347b().mo60341b()));
    }
}
