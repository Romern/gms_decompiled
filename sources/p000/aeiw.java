package p000;

import com.google.android.gms.location.WifiScan;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: aeiw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeiw {

    /* renamed from: a */
    public static final AtomicReference f63428a = new AtomicReference();

    /* renamed from: b */
    public long f63429b;

    /* renamed from: c */
    public long[] f63430c;

    /* renamed from: d */
    public int[] f63431d;

    /* renamed from: e */
    public int[] f63432e;

    /* renamed from: f */
    public int[] f63433f;

    /* renamed from: g */
    public int[] f63434g;

    /* renamed from: h */
    public int[] f63435h;

    /* renamed from: i */
    public int[] f63436i;

    /* renamed from: j */
    public int f63437j;

    /* renamed from: k */
    public boolean f63438k;

    public aeiw(int i, long j, boolean z) {
        mo34191a(i, j, z);
    }

    /* renamed from: a */
    public final void mo34191a(int i, long j, boolean z) {
        this.f63429b = j;
        this.f63438k = z;
        this.f63430c = new long[i];
        this.f63431d = new int[i];
        if (z) {
            this.f63432e = new int[i];
            this.f63433f = new int[i];
            this.f63434g = new int[i];
            this.f63435h = new int[i];
            this.f63436i = new int[i];
        } else {
            this.f63432e = WifiScan.f79399b;
            this.f63433f = WifiScan.f79399b;
            this.f63434g = WifiScan.f79399b;
            this.f63435h = WifiScan.f79399b;
            this.f63436i = WifiScan.f79399b;
        }
        this.f63437j = 0;
    }

    /* renamed from: a */
    public final void mo34192a(long j, byte b, int i) {
        int i2 = this.f63437j;
        long[] jArr = this.f63430c;
        if (i2 < jArr.length) {
            jArr[i2] = j | (((long) b) << 48);
            this.f63431d[i2] = i;
            this.f63437j = i2 + 1;
            return;
        }
        throw new IllegalStateException("Builder is full, have already added devices to capacity");
    }
}
