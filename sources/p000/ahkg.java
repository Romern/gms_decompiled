package p000;

import com.google.android.gms.nearby.internal.connection.InitiateBandwidthUpgradeParams;
import java.util.concurrent.Callable;

/* renamed from: ahkg */
final /* synthetic */ class ahkg implements Callable {

    /* renamed from: a */
    private final ahki f67332a;

    /* renamed from: b */
    private final ahkv f67333b;

    /* renamed from: c */
    private final InitiateBandwidthUpgradeParams f67334c;

    public ahkg(ahki ahki, ahkv ahkv, InitiateBandwidthUpgradeParams initiateBandwidthUpgradeParams) {
        this.f67332a = ahki;
        this.f67333b = ahkv;
        this.f67334c = initiateBandwidthUpgradeParams;
    }

    public final Object call() {
        ahki ahki = this.f67332a;
        ahkv ahkv = this.f67333b;
        InitiateBandwidthUpgradeParams initiateBandwidthUpgradeParams = this.f67334c;
        if (!ahkv.mo36716e(initiateBandwidthUpgradeParams.f80567b)) {
            return 8009;
        }
        ahki.f67338a.mo36766b(ahkv, initiateBandwidthUpgradeParams.f80567b);
        return 0;
    }
}
