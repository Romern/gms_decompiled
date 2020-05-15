package p000;

import com.google.android.gms.beacon.BleFilter;
import com.google.android.gms.beacon.BleSettings;
import com.google.android.gms.beacon.BleSighting;
import java.util.List;

/* renamed from: ngr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ngr {

    /* renamed from: c */
    public final List f35539c;

    /* renamed from: d */
    public final nej f35540d;

    /* renamed from: e */
    public final BleSettings f35541e;

    public ngr(BleSettings bleSettings, nej nej) {
        bleSettings = bleSettings == null ? new nem().mo20533a() : bleSettings;
        this.f35541e = bleSettings;
        this.f35539c = bleSettings.f29268d;
        this.f35540d = nej;
    }

    /* renamed from: a */
    public final boolean mo20613a(BleSighting bleSighting) {
        List list = this.f35539c;
        if (list == null || list.isEmpty()) {
            return true;
        }
        for (BleFilter bleFilter : this.f35539c) {
            if (bleFilter.mo17292a(bleSighting)) {
                return true;
            }
        }
        return false;
    }
}
