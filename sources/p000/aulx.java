package p000;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;

/* renamed from: aulx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aulx implements aumc {

    /* renamed from: a */
    private final aurj f92059a;

    /* renamed from: b */
    private final aulj f92060b;

    public aulx(aurj aurj, aulj aulj) {
        this.f92059a = aurj;
        this.f92060b = aulj;
    }

    /* renamed from: a */
    public final aups mo50665a() {
        long j;
        Status status = Status.f30107a;
        boolean c = this.f92059a.mo50826c();
        boolean b = this.f92059a.mo50825b();
        aulj aulj = this.f92060b;
        synchronized (aulj.f92037c) {
            if (aulj.f92035a > 0) {
                j = SystemClock.elapsedRealtime() - aulj.f92035a;
            } else {
                j = -1;
            }
        }
        return new aups(status, c, b, j);
    }
}
