package p000;

import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: zum */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zum {

    /* renamed from: a */
    public long f55941a = Long.MAX_VALUE;

    /* renamed from: b */
    public long f55942b = 0;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo31530a(cadz cadz) {
        this.f55941a = Math.min(this.f55941a, TimeUnit.MILLISECONDS.toNanos(cadz.f172779e));
        this.f55942b = Math.max(this.f55942b, TimeUnit.MILLISECONDS.toNanos(cadz.f172780f));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo31531a(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            cadn cadn = (cadn) list.get(i);
            long min = Math.min(this.f55941a, cadn.f172702b);
            this.f55941a = min;
            this.f55941a = Math.min(min, cadn.f172703c);
            this.f55942b = Math.max(this.f55942b, cadn.f172702b);
        }
    }
}
