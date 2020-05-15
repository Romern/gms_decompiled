package p000;

/* renamed from: cipz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class cipz implements ciqq {

    /* renamed from: b */
    public final ciqq f191222b;

    public cipz(ciqq ciqq) {
        if (ciqq != null) {
            this.f191222b = ciqq;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    /* renamed from: a */
    public void mo74930a(cipu cipu, long j) {
        throw null;
    }

    public void close() {
        this.f191222b.close();
    }

    /* renamed from: df */
    public final ciqt mo74932df() {
        return this.f191222b.mo74932df();
    }

    public void flush() {
        this.f191222b.flush();
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        String obj = this.f191222b.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(obj).length());
        sb.append(simpleName);
        sb.append("(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
