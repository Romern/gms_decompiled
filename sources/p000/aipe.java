package p000;

import android.os.SystemClock;
import java.util.Map;
import java.util.Set;

/* renamed from: aipe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aipe {

    /* renamed from: a */
    private final Map f69414a = new C1223np();

    /* renamed from: b */
    private long f69415b = cfnv.m140779c();

    /* renamed from: c */
    private long f69416c = (SystemClock.elapsedRealtime() - cfnv.m140780d());

    /* renamed from: d */
    private int f69417d = 1;

    /* renamed from: a */
    public final synchronized Set mo37799a() {
        return new C1225nr(this.f69414a.values());
    }

    /* renamed from: b */
    public final synchronized long mo37803b() {
        return SystemClock.elapsedRealtime() - this.f69416c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        return r0;
     */
    /* renamed from: c */
    public final synchronized int mo37804c() {
        int i;
        if (this.f69417d == 2) {
            i = 3;
        } else if (mo37803b() >= this.f69415b) {
            return 2;
        } else {
            i = 4;
        }
    }

    /* renamed from: a */
    public final synchronized void mo37800a(int i, byte[] bArr) {
        this.f69414a.put(Integer.valueOf(i), bArr);
    }

    /* renamed from: a */
    public final synchronized void mo37801a(boolean z) {
        this.f69416c = SystemClock.elapsedRealtime();
        int i = 3;
        if (z) {
            this.f69415b = cfnv.m140779c();
            i = 2;
        } else if (this.f69417d == 3) {
            double d = cfnv.f184625a.mo6606a().mo81836d();
            double d2 = (double) this.f69415b;
            Double.isNaN(d2);
            this.f69415b = Math.min((long) (d * d2), cfnv.m140780d());
        } else {
            this.f69415b = cfnv.m140779c();
        }
        this.f69417d = i;
    }

    /* renamed from: a */
    public final synchronized boolean mo37802a(int i) {
        return this.f69414a.containsKey(Integer.valueOf(i));
    }
}
