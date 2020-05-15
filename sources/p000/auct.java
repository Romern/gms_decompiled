package p000;

import java.util.concurrent.ExecutionException;

/* renamed from: auct */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class auct implements aucs {

    /* renamed from: a */
    private final Object f91407a = new Object();

    /* renamed from: b */
    private final int f91408b;

    /* renamed from: c */
    private final auck f91409c;

    /* renamed from: d */
    private int f91410d;

    /* renamed from: e */
    private int f91411e;

    /* renamed from: f */
    private int f91412f;

    /* renamed from: g */
    private Exception f91413g;

    /* renamed from: h */
    private boolean f91414h;

    public auct(int i, auck auck) {
        this.f91408b = i;
        this.f91409c = auck;
    }

    /* renamed from: a */
    private final void m76772a() {
        int i = this.f91410d;
        int i2 = this.f91411e;
        int i3 = this.f91412f;
        int i4 = this.f91408b;
        if (i + i2 + i3 != i4) {
            return;
        }
        if (this.f91413g != null) {
            auck auck = this.f91409c;
            StringBuilder sb = new StringBuilder(54);
            sb.append(i2);
            sb.append(" out of ");
            sb.append(i4);
            sb.append(" underlying tasks failed");
            auck.mo50397a((Exception) new ExecutionException(sb.toString(), this.f91413g));
        } else if (this.f91414h) {
            this.f91409c.mo50400f();
        } else {
            this.f91409c.mo50398a((Object) null);
        }
    }

    /* renamed from: b */
    public final void mo13386b() {
        synchronized (this.f91407a) {
            this.f91412f++;
            this.f91414h = true;
            m76772a();
        }
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        synchronized (this.f91407a) {
            this.f91411e++;
            this.f91413g = exc;
            m76772a();
        }
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        synchronized (this.f91407a) {
            this.f91410d++;
            m76772a();
        }
    }
}
