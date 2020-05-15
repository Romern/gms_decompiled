package p000;

import android.os.ConditionVariable;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: acpn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class acpn implements acpw {

    /* renamed from: a */
    private final AtomicInteger f60435a;

    /* renamed from: g */
    public final bqbd f60436g;

    /* renamed from: h */
    public final int f60437h;

    /* renamed from: i */
    public final int f60438i;

    /* renamed from: j */
    public final String f60439j;

    /* renamed from: k */
    protected final acry f60440k;

    /* renamed from: l */
    public final ConditionVariable f60441l;

    /* renamed from: m */
    public volatile Object f60442m;

    public acpn(bqbd bqbd) {
        this(bqbd, (String) null);
    }

    /* renamed from: a */
    public static void m49671a(int i) {
        boolean z;
        if (i == 1 || i == 2) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34976b(z, "Invalid scheduling: %d", Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo32291b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo32428b(Object obj) {
    }

    /* renamed from: d */
    public final String mo32998d() {
        String name = this.f60436g.name();
        if (name != null) {
            return name;
        }
        absg.m48192b("Unknown task name enum: %d", Integer.valueOf(this.f60436g.mo3214a()));
        return bqbd.UNKNOWN.name();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo32999e() {
        mo32996a(3, 4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo33000f() {
        return mo32998d();
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            int i = this.f60435a.get();
            if (!(i == 0 || i == 4)) {
                absg.m48207e("Incomplete task %s with state %d.", this, Integer.valueOf(i));
            }
        } finally {
            super.finalize();
        }
    }

    /* renamed from: g */
    public final boolean mo33002g() {
        return celx.m137222b() && this.f60440k != null;
    }

    /* renamed from: h */
    public final Object mo32295h() {
        this.f60441l.block();
        return this.f60442m;
    }

    public final String toString() {
        return String.format(Locale.US, "%s(name=%s,scheduling=%d)", super.toString(), mo32998d(), Integer.valueOf(this.f60437h));
    }

    public acpn(bqbd bqbd, int i) {
        this(bqbd, i, 3, null, null);
    }

    public acpn(bqbd bqbd, int i, int i2, String str, acry acry) {
        int i3;
        this.f60441l = new ConditionVariable();
        this.f60435a = new AtomicInteger(0);
        m49671a(i);
        if (i2 != 3) {
            i3 = 4;
        } else {
            i3 = i2;
        }
        sdo.m34976b(true, "Invalid waking: %d", Integer.valueOf(i3));
        this.f60436g = bqbd;
        this.f60437h = i;
        this.f60438i = i2;
        this.f60440k = acry;
        this.f60439j = str == null ? "com.google.android.gms" : str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo11132a() {
        mo32291b();
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo32996a(int i, int i2) {
        if (!this.f60435a.compareAndSet(i, i2)) {
            throw new IllegalStateException(String.format(Locale.US, "Invalid task state for %s. Expected %d, was %d.", this, Integer.valueOf(i), Integer.valueOf(this.f60435a.get())));
        }
    }

    public acpn(bqbd bqbd, int i, String str) {
        this(bqbd, i, 3, str, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo32997a(RuntimeException runtimeException) {
        throw runtimeException;
    }

    public acpn(bqbd bqbd, acry acry) {
        this(bqbd, 2, 3, null, acry);
    }

    public acpn(bqbd bqbd, String str) {
        this(bqbd, 2, str);
    }
}
