package p000;

/* renamed from: cazp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cazp extends bqdt implements Runnable {

    /* renamed from: a */
    private bqgg f176453a;

    public cazp(bqgg bqgg) {
        this.f176453a = bqgg;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bc */
    public final void mo19850bc() {
        this.f176453a = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bi */
    public final String mo60815bi() {
        bqgg bqgg = this.f176453a;
        if (bqgg == null) {
            return null;
        }
        String valueOf = String.valueOf(bqgg);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 11);
        sb.append("delegate=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: c */
    public final boolean mo75205c() {
        return super.mo69140e();
    }

    public final void run() {
        bqgg bqgg = this.f176453a;
        if (bqgg != null) {
            mo69137b(bqgg);
        }
    }
}
