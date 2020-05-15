package p000;

import android.os.SystemClock;
import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Set;

/* renamed from: besh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class besh implements bfms {

    /* renamed from: a */
    public int[][] f112279a;

    /* renamed from: b */
    public long f112280b;

    /* renamed from: c */
    public bfkk f112281c;

    /* renamed from: d */
    public final Set f112282d = new HashSet();

    /* renamed from: e */
    public final Set f112283e = new HashSet();

    /* renamed from: f */
    public final bfmt f112284f;

    public besh(bfmt bfmt) {
        this.f112284f = bfmt;
        mo61096a();
    }

    /* renamed from: a */
    public final void mo61096a() {
        int[] iArr = new int[2];
        iArr[1] = bfkk.f114300a.length + 1;
        iArr[0] = 3;
        this.f112279a = (int[][]) Array.newInstance(int.class, iArr);
        this.f112280b = SystemClock.elapsedRealtime();
        this.f112283e.clear();
        this.f112282d.clear();
        this.f112281c = null;
    }

    /* renamed from: a */
    public final void mo60973a(boolean z, int i, bfmj bfmj) {
        bfkk bfkk = this.f112281c;
        if (bfkk != null && bfkk.f114302c && z && bfmj != null) {
            long j = bfmj.f114403a;
            if (i == 1) {
                Set set = this.f112282d;
                Long valueOf = Long.valueOf(j);
                set.add(valueOf);
                this.f112283e.add(valueOf);
            } else if (i == 2) {
                this.f112283e.add(Long.valueOf(j));
            }
        }
    }
}
