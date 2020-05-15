package p000;

import android.os.Bundle;
import java.util.Locale;

/* renamed from: bjil */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bjil {

    /* renamed from: n */
    public int f122792n = 0;

    /* renamed from: o */
    public C1230nw f122793o;

    /* renamed from: a */
    public static Bundle m103603a(long j, Bundle bundle) {
        if (bundle != null) {
            return bundle.getBundle(m103604l(j));
        }
        return null;
    }

    /* renamed from: l */
    private static String m103604l(long j) {
        return String.format(Locale.US, "lifeCycleChild:%d", Long.valueOf(j));
    }

    /* renamed from: A */
    public final void mo65280A() {
        this.f122792n = 3;
        mo65086cG();
        int F = mo65285F();
        for (int i = 0; i < F; i++) {
            mo65289c(i).mo65280A();
        }
    }

    /* renamed from: B */
    public final void mo65281B() {
        this.f122792n = 4;
        int F = mo65285F();
        for (int i = 0; i < F; i++) {
            mo65289c(i).mo65281B();
        }
        mo65087cb();
    }

    /* renamed from: C */
    public final void mo65282C() {
        this.f122792n = 5;
        int F = mo65285F();
        for (int i = 0; i < F; i++) {
            mo65289c(i).mo65282C();
        }
        mo65284E();
    }

    /* renamed from: D */
    public final void mo65283D() {
        this.f122792n = 6;
        if (this.f122793o != null) {
            int F = mo65285F();
            for (int i = 0; i < F; i++) {
                mo65289c(i).mo65283D();
            }
            this.f122793o.mo15542c();
        }
        mo65201cC();
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo65284E() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final int mo65285F() {
        C1230nw nwVar = this.f122793o;
        if (nwVar != null) {
            return nwVar.mo15537b();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo52015a(Bundle bundle) {
    }

    /* renamed from: b */
    public final bjil mo65287b(long j, Class cls) {
        boolean z;
        bjil d = mo65291d(j);
        if (d == null || cls.isAssignableFrom(d.getClass())) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108589a(z, String.format(Locale.US, "DataComponent not of expected class. Expected %s, Actual %s", cls, d));
        return (bjil) cls.cast(d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final bjil mo65289c(int i) {
        C1230nw nwVar = this.f122793o;
        if (nwVar != null) {
            return (bjil) nwVar.mo15538b(i);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: cC */
    public void mo65201cC() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: cG */
    public void mo65086cG() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: cb */
    public void mo65087cb() {
    }

    /* renamed from: d */
    public final bjil mo65291d(long j) {
        C1230nw nwVar = this.f122793o;
        if (nwVar != null) {
            return (bjil) nwVar.mo15534a(j);
        }
        return null;
    }

    /* renamed from: y */
    public final void mo65292y() {
        this.f122792n = 1;
        int F = mo65285F();
        for (int i = 0; i < F; i++) {
            mo65289c(i).mo65292y();
        }
    }

    /* renamed from: z */
    public final void mo65293z() {
        this.f122792n = 2;
        int F = mo65285F();
        for (int i = 0; i < F; i++) {
            mo65289c(i).mo65293z();
        }
    }

    /* renamed from: a */
    public final void mo65286a(long j, bjil bjil) {
        if (this.f122793o == null) {
            this.f122793o = new C1230nw();
        }
        this.f122793o.mo15540b(j, bjil);
        bjim.m103623a(bjil, this.f122792n);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo65290c(long j) {
        bjil bjil;
        C1230nw nwVar = this.f122793o;
        if (nwVar != null && (bjil = (bjil) nwVar.mo15534a(j)) != null) {
            bjim.m103623a(bjil, 6);
            this.f122793o.mo15539b(j);
        }
    }

    /* renamed from: b */
    public final void mo65288b(Bundle bundle) {
        long j;
        this.f122792n = 4;
        mo65087cb();
        mo52015a(bundle);
        int F = mo65285F();
        for (int i = 0; i < F; i++) {
            Bundle bundle2 = new Bundle();
            mo65289c(i).mo65288b(bundle2);
            C1230nw nwVar = this.f122793o;
            if (nwVar != null) {
                j = nwVar.mo15533a(i);
            } else {
                j = -1;
            }
            bundle.putBundle(m103604l(j), bundle2);
        }
    }
}
