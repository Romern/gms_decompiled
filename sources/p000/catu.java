package p000;

/* renamed from: catu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class catu {

    /* renamed from: a */
    public final boolean f175963a;

    /* renamed from: b */
    public String[] f175964b;

    /* renamed from: c */
    public String[] f175965c;

    /* renamed from: d */
    public boolean f175966d;

    public catu(catv catv) {
        catv catv2 = catv.f175967a;
        this.f175963a = catv.f175971d;
        this.f175964b = catv.f175973f;
        this.f175965c = catv.f175974g;
        this.f175966d = catv.f175972e;
    }

    /* renamed from: a */
    public final catv mo74855a() {
        return new catv(this);
    }

    /* renamed from: b */
    public final void mo74858b() {
        if (this.f175963a) {
            this.f175966d = true;
            return;
        }
        throw new IllegalStateException("no TLS extensions for cleartext connections");
    }

    /* renamed from: b */
    public final void mo74859b(String... strArr) {
        if (!this.f175963a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        } else if (strArr.length != 0) {
            this.f175965c = (String[]) strArr.clone();
        } else {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
    }

    public catu(boolean z) {
        this.f175963a = z;
    }

    /* renamed from: a */
    public final void mo74856a(cauq... cauqArr) {
        if (this.f175963a) {
            String[] strArr = new String[cauqArr.length];
            for (int i = 0; i < cauqArr.length; i++) {
                strArr[i] = cauqArr[i].f176073e;
            }
            mo74859b(strArr);
            return;
        }
        throw new IllegalStateException("no TLS versions for cleartext connections");
    }

    /* renamed from: a */
    public final void mo74857a(String... strArr) {
        if (!this.f175963a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        } else if (strArr.length != 0) {
            this.f175964b = (String[]) strArr.clone();
        } else {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
    }
}
