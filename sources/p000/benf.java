package p000;

/* renamed from: benf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class benf extends bqdt implements Runnable {

    /* renamed from: a */
    private final bemj f111869a;

    public benf(bemj bemj) {
        this.f111869a = bemj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo60813a(bemj bemj);

    /* renamed from: bi */
    public final String mo60815bi() {
        String str = this.f111869a.f111827b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8);
        sb.append("query=[");
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    public final void run() {
        bljb a;
        if (!isCancelled()) {
            try {
                String valueOf = String.valueOf(this.f111869a.f111827b);
                a = blkh.m107282a(valueOf.length() == 0 ? new String("Query: ") : "Query: ".concat(valueOf), blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
                mo60813a(this.f111869a);
                if (a != null) {
                    a.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                mo69136a(th);
                return;
            }
        } else {
            return;
        }
        throw th;
    }
}
