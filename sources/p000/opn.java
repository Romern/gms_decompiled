package p000;

import android.util.Log;

/* renamed from: opn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class opn extends ooz {

    /* renamed from: a */
    private final long f38181a = this.f38159i;

    /* renamed from: l */
    private boolean f38182l = false;

    public opn(long j, float f) {
        super(j, f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final opa mo22472a(boolean z, long j) {
        long j2 = 0;
        if (z && !this.f38182l) {
            this.f38182l = true;
            mo22475b();
            j = 0;
        }
        if (!this.f38182l) {
            long j3 = this.f38159i + j;
            if (j3 > this.f38181a + 1000) {
                if (Log.isLoggable("CAR.WIN.ANIM", 4)) {
                    long j4 = this.f38181a;
                    StringBuilder sb = new StringBuilder(106);
                    sb.append("timeout while waiting for initial rendering, now:");
                    sb.append(j3);
                    sb.append(" real start time:");
                    sb.append(j4);
                    Log.i("CAR.WIN.ANIM", sb.toString());
                }
                this.f38182l = true;
                mo22475b();
            }
        } else {
            j2 = j;
        }
        return mo22478b(j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract opa mo22478b(long j);

    /* renamed from: a */
    public final boolean mo22474a(long j) {
        if (this.f38182l) {
            return super.mo22474a(j);
        }
        return false;
    }
}
