package p000;

/* renamed from: caxm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class caxm extends caxh {

    /* renamed from: d */
    final /* synthetic */ caxn f176323d;

    /* renamed from: e */
    private boolean f176324e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public caxm(caxn caxn) {
        super(caxn);
        this.f176323d = caxn;
    }

    /* renamed from: c */
    public final long mo74995c(cipu cipu, long j) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder(35);
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (this.f176308b) {
            throw new IllegalStateException("closed");
        } else if (this.f176324e) {
            return -1;
        } else {
            long c = this.f176323d.f176326b.mo74995c(cipu, j);
            if (c != -1) {
                return c;
            }
            this.f176324e = true;
            mo75040b();
            return -1;
        }
    }

    public final void close() {
        if (!this.f176308b) {
            if (!this.f176324e) {
                mo75041c();
            }
            this.f176308b = true;
        }
    }
}
