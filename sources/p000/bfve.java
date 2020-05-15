package p000;

/* renamed from: bfve */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bfve extends bfvo {

    /* renamed from: r */
    public long f115402r = Long.MAX_VALUE;

    /* renamed from: s */
    public boolean f115403s = false;

    /* renamed from: t */
    public long f115404t = 0;

    /* renamed from: a */
    public final void mo62308a(long j) {
        if (this.f115402r != j) {
            this.f115402r = j;
            mo62325g();
        }
    }

    /* renamed from: b */
    public final void mo62309b() {
        if (this.f115403s) {
            mo62325g();
        }
        super.mo62309b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo62307a(StringBuilder sb) {
        super.mo62307a(sb);
        sb.append(", interval=");
        long j = this.f115402r;
        if (j != Long.MAX_VALUE) {
            sb.append(j);
            sb.append("ms");
        } else {
            sb.append("MAX");
        }
        sb.append(", trigger=");
        sb.append(this.f115403s);
    }

    /* renamed from: b */
    public final void mo62310b(long j) {
        if (this.f115404t != j) {
            this.f115404t = j;
            mo62325g();
        }
    }
}
