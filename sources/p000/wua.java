package p000;

import android.app.PendingIntent;
import com.google.location.nearby.common.fastpair.slice.DeviceDetailsLinks;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: wua */
final /* synthetic */ class wua implements bmxj {

    /* renamed from: a */
    private final wuc f51340a;

    /* renamed from: b */
    private final AtomicInteger f51341b;

    /* renamed from: c */
    private final String f51342c;

    /* renamed from: d */
    private final bzau f51343d;

    /* renamed from: e */
    private final String f51344e;

    /* renamed from: f */
    private final DeviceDetailsLinks f51345f;

    public wua(wuc wuc, AtomicInteger atomicInteger, String str, bzau bzau, String str2, DeviceDetailsLinks deviceDetailsLinks) {
        this.f51340a = wuc;
        this.f51341b = atomicInteger;
        this.f51342c = str;
        this.f51343d = bzau;
        this.f51344e = str2;
        this.f51345f = deviceDetailsLinks;
    }

    public final Object apply(Object obj) {
        wuc wuc = this.f51340a;
        AtomicInteger atomicInteger = this.f51341b;
        return wuc.mo29407a(atomicInteger.getAndIncrement(), bvin.FAST_PAIR_DEVICE_COMPANION_SETTINGS_CLICKED, this.f51342c, this.f51343d, this.f51344e, this.f51345f.mo86671a(), (PendingIntent) obj);
    }
}
