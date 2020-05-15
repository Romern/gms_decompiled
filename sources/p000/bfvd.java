package p000;

import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* renamed from: bfvd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfvd extends bfuz {

    /* renamed from: q */
    public static final /* synthetic */ int f115392q = 0;

    /* renamed from: y */
    private static final long f115393y = TimeUnit.SECONDS.toMillis(30);

    /* renamed from: j */
    protected final spf f115394j;

    /* renamed from: k */
    protected final sqv f115395k;

    /* renamed from: l */
    public final bfuv f115396l = new bfvb(this);

    /* renamed from: m */
    public final bfuv f115397m = new bfvc(this);

    /* renamed from: n */
    public long f115398n = f115393y;

    /* renamed from: o */
    public int f115399o = 4;

    /* renamed from: p */
    public final int f115400p = 10;

    /* renamed from: z */
    private final long f115401z = Long.MAX_VALUE;

    public bfvd(bhbr bhbr, spf spf, sqv sqv, Looper looper, bfpj bfpj) {
        super(bhbr, looper, bfpj);
        this.f115394j = spf;
        this.f115395k = sqv;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62307a(StringBuilder sb) {
        super.mo62307a(sb);
        sb.append(", minpulse=");
        long j = this.f115401z;
        if (j != Long.MAX_VALUE) {
            sb.append(j);
            sb.append("ms");
            return;
        }
        sb.append("MAX");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GpsPulse[");
        mo62307a(sb);
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: a */
    public final boolean mo62305a(bfuv bfuv) {
        if (bfuv == this.f115382g && this.f115402r > this.f115401z) {
            bfuv = this.f115403s ? this.f115396l : this.f115397m;
        }
        return super.mo62305a(bfuv);
    }
}
