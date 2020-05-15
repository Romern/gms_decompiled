package p000;

import android.app.PendingIntent;
import com.google.location.nearby.common.fastpair.slice.DeviceDetailsLinks;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: wtz */
final /* synthetic */ class wtz implements bmxj {

    /* renamed from: a */
    private final wuc f51334a;

    /* renamed from: b */
    private final AtomicInteger f51335b;

    /* renamed from: c */
    private final String f51336c;

    /* renamed from: d */
    private final bzau f51337d;

    /* renamed from: e */
    private final String f51338e;

    /* renamed from: f */
    private final DeviceDetailsLinks f51339f;

    public wtz(wuc wuc, AtomicInteger atomicInteger, String str, bzau bzau, String str2, DeviceDetailsLinks deviceDetailsLinks) {
        this.f51334a = wuc;
        this.f51335b = atomicInteger;
        this.f51336c = str;
        this.f51337d = bzau;
        this.f51338e = str2;
        this.f51339f = deviceDetailsLinks;
    }

    public final Object apply(Object obj) {
        wuc wuc = this.f51334a;
        AtomicInteger atomicInteger = this.f51335b;
        return wuc.mo29407a(atomicInteger.getAndIncrement(), bvin.FAST_PAIR_DEVICE_COMPANION_OOBE_CLICKED, this.f51336c, this.f51337d, this.f51338e, this.f51339f.mo86671a(), (PendingIntent) obj);
    }
}
