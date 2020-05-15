package p000;

/* renamed from: ciqa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ciqa implements ciqr {

    /* renamed from: a */
    private final ciqr f191223a;

    public ciqa(ciqr ciqr) {
        if (ciqr != null) {
            this.f191223a = ciqr;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    /* renamed from: c */
    public long mo74995c(cipu cipu, long j) {
        return this.f191223a.mo74995c(cipu, j);
    }

    public void close() {
        this.f191223a.close();
    }

    /* renamed from: df */
    public final ciqt mo74997df() {
        return this.f191223a.mo74997df();
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        String obj = this.f191223a.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(obj).length());
        sb.append(simpleName);
        sb.append("(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
