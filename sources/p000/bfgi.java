package p000;

import com.google.android.location.collectionlib.RealCollectorConfig;
import com.google.android.location.collectionlib.utils.ParcelableSensorScannerConfig;
import java.util.Set;

/* renamed from: bfgi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfgi {

    /* renamed from: a */
    public Set f113754a;

    /* renamed from: b */
    public String f113755b = null;

    /* renamed from: c */
    public byte[] f113756c = null;

    /* renamed from: d */
    public long f113757d = 0;

    /* renamed from: e */
    public long f113758e;

    /* renamed from: f */
    public boolean f113759f = false;

    /* renamed from: g */
    public bfgy f113760g = null;

    /* renamed from: h */
    public boolean f113761h = true;

    /* renamed from: i */
    public bgmj f113762i = null;

    /* renamed from: j */
    public int f113763j;

    /* renamed from: a */
    public final RealCollectorConfig mo61653a() {
        ParcelableSensorScannerConfig parcelableSensorScannerConfig;
        if (this.f113754a.contains(bfgt.f113832v)) {
            bmxy.m108600b(false);
            bmxy.m108600b(false);
        }
        bfgy bfgy = this.f113760g;
        if (bfgy != null) {
            parcelableSensorScannerConfig = new ParcelableSensorScannerConfig(bfgy);
        } else {
            parcelableSensorScannerConfig = null;
        }
        return new RealCollectorConfig(this.f113754a, this.f113759f, this.f113757d, 0, this.f113758e, parcelableSensorScannerConfig, this.f113763j, this.f113755b, this.f113756c, this.f113761h, this.f113762i, false, -1, -1);
    }

    /* renamed from: a */
    public final void mo61654a(long j) {
        this.f113758e = j;
        this.f113759f = false;
        this.f113760g = null;
    }
}
