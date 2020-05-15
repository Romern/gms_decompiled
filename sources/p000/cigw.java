package p000;

/* renamed from: cigw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cigw {

    /* renamed from: a */
    public final boolean f190267a;

    /* renamed from: b */
    public String[] f190268b;

    /* renamed from: c */
    public String[] f190269c;

    /* renamed from: d */
    public boolean f190270d;

    public cigw(cigx cigx) {
        this.f190267a = cigx.f190273b;
        cigx cigx2 = cigx.f190271a;
        this.f190268b = cigx.f190274c;
        this.f190269c = cigx.f190275d;
        this.f190270d = cigx.f190276e;
    }

    /* renamed from: a */
    public final cigx mo86088a() {
        return new cigx(this);
    }

    /* renamed from: b */
    public final void mo86092b() {
        if (this.f190267a) {
            this.f190270d = true;
            return;
        }
        throw new IllegalStateException("no TLS extensions for cleartext connections");
    }

    /* renamed from: b */
    public final void mo86093b(String... strArr) {
        if (!this.f190267a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        } else if (strArr != null) {
            this.f190269c = (String[]) strArr.clone();
        } else {
            this.f190269c = null;
        }
    }

    /* renamed from: a */
    public final void mo86089a(cigv... cigvArr) {
        if (this.f190267a) {
            String[] strArr = new String[cigvArr.length];
            for (int i = 0; i < cigvArr.length; i++) {
                strArr[i] = cigvArr[i].f190266aS;
            }
            this.f190268b = strArr;
            return;
        }
        throw new IllegalStateException("no cipher suites for cleartext connections");
    }

    public cigw(boolean z) {
        this.f190267a = z;
    }

    /* renamed from: a */
    public final void mo86090a(cihk... cihkArr) {
        if (this.f190267a) {
            int length = cihkArr.length;
            if (length != 0) {
                String[] strArr = new String[length];
                for (int i = 0; i < cihkArr.length; i++) {
                    strArr[i] = cihkArr[i].f190320e;
                }
                this.f190269c = strArr;
                return;
            }
            throw new IllegalArgumentException("At least one TlsVersion is required");
        }
        throw new IllegalStateException("no TLS versions for cleartext connections");
    }

    /* renamed from: a */
    public final void mo86091a(String... strArr) {
        if (!this.f190267a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        } else if (strArr != null) {
            this.f190268b = (String[]) strArr.clone();
        } else {
            this.f190268b = null;
        }
    }
}
