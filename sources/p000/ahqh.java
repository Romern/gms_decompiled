package p000;

import com.google.android.gms.nearby.connection.Strategy;
import java.util.Arrays;
import java.util.List;

/* renamed from: ahqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ahqh extends ahpz {
    public ahqh(ahov ahov, ahnp ahnp, ahne ahne, ahlh ahlh) {
        super(ahov, ahnp, ahne, ahlh);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo36855c(ahkv ahkv) {
        return !mo36860e(ahkv) && !mo36862f(ahkv);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public List mo36857d() {
        return Arrays.asList(bvif.WEB_RTC, bvif.WIFI_LAN, bvif.WIFI_DIRECT, bvif.WIFI_HOTSPOT, bvif.BLUETOOTH, bvif.BLE, bvif.NFC);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public bvif mo36859e() {
        return bvif.WIFI_HOTSPOT;
    }

    /* renamed from: g */
    public Strategy mo36958g() {
        return Strategy.f80481b;
    }

    /* renamed from: h */
    public int mo36959h() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo36858d(ahkv ahkv) {
        return !mo36860e(ahkv);
    }
}
