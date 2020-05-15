package p000;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: kwz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kwz extends lil {

    /* renamed from: a */
    private final lir f25328a;

    /* renamed from: b */
    private final Bundle f25329b;

    /* renamed from: c */
    private final long f25330c;

    /* renamed from: d */
    private final bmza f25331d;

    /* renamed from: e */
    private final kwu f25332e;

    /* renamed from: f */
    private final AtomicBoolean f25333f = new AtomicBoolean(false);

    /* renamed from: g */
    private final int f25334g;

    public kwz(lir lir, Bundle bundle, int i, bmzq bmzq, kwu kwu) {
        this.f25328a = lir;
        this.f25329b = bundle;
        this.f25334g = i;
        this.f25330c = bundle.getLong("com.google.android.gms.autofill.extra.ACTIVITY_TRACKER_ELAPSED_NANOS", 0);
        this.f25331d = bmza.m108657a(bmzq);
        this.f25332e = kwu;
    }

    /* renamed from: b */
    private final void m18708b(int i, int i2) {
        if (this.f25333f.compareAndSet(false, true)) {
            bxvd da = kzy.f25499e.mo74144da();
            int i3 = this.f25334g;
            if (i3 != 1) {
                int i4 = i3 - 2;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((kzy) da.f164949b).f25501a = i4;
                long millis = TimeUnit.NANOSECONDS.toMillis(m18709e());
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                kzy kzy = (kzy) da.f164949b;
                kzy.f25502b = millis;
                kzy.f25503c = i;
                kzy.f25504d = i2;
                this.f25332e.mo14904e(new kwy(da));
                return;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* renamed from: e */
    private final long m18709e() {
        return this.f25330c + this.f25331d.mo66928a(TimeUnit.NANOSECONDS);
    }

    /* renamed from: a */
    public final void mo14921a() {
        this.f25331d.mo66930d();
    }

    /* renamed from: c */
    public final void mo14924c() {
        this.f25331d.mo66931e();
    }

    /* renamed from: d */
    public final void mo14925d() {
        if (this.f25328a.isFinishing()) {
            m18708b(-2, 0);
        }
    }

    /* renamed from: a */
    public final void mo14922a(int i, int i2) {
        m18708b(i, i2);
    }

    /* renamed from: b */
    public final void mo14923b() {
        this.f25329b.putLong("com.google.android.gms.autofill.extra.ACTIVITY_TRACKER_ELAPSED_NANOS", m18709e());
    }
}
