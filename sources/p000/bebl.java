package p000;

/* renamed from: bebl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bebl implements bebx {

    /* renamed from: a */
    private boolean f106870a = false;

    /* renamed from: a */
    private final void m91723a(String str) {
        if (this.f106870a) {
            StringBuilder sb = new StringBuilder(str.length() + 36);
            sb.append("cannot invoke ");
            sb.append(str);
            sb.append(" on a closed transport");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo28334a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo28335a(bkxr bkxr);

    /* renamed from: b */
    public final void mo58527b() {
        m91723a("close");
        mo28334a();
        this.f106870a = true;
    }

    /* renamed from: c */
    public final boolean mo58529c() {
        return this.f106870a;
    }

    /* renamed from: b */
    public final void mo58528b(bkxr bkxr) {
        m91723a("log");
        mo28335a(bkxr);
    }
}
