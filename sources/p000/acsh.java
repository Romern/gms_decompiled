package p000;

/* renamed from: acsh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acsh {

    /* renamed from: a */
    public final abyx f60673a;

    /* renamed from: b */
    public final acrl f60674b;

    /* renamed from: c */
    public Long f60675c;

    /* renamed from: d */
    private final acao f60676d;

    /* renamed from: e */
    private String f60677e;

    /* renamed from: f */
    private Boolean f60678f;

    public acsh(abyx abyx, acao acao, acrl acrl) {
        this.f60673a = abyx;
        this.f60676d = acao;
        this.f60674b = acrl;
    }

    /* renamed from: a */
    public static boolean m49798a(String str, acrl acrl) {
        boolean z;
        acrk d = acrl.mo33027d();
        synchronized (d.f60617a.f60625g) {
            if (!cemw.m137399g() || !d.f60617a.f60623e.isEmpty()) {
                acqm acqm = (acqm) d.f60617a.f60623e.get(str);
                z = acqm != null && acqm.f60501d;
            } else {
                z = !acrl.m49741b(d.f60617a.f60619a, str);
            }
        }
        if (!z) {
            return false;
        }
        absg.m48202d("Package %s is blacklisted for upload", str);
        return true;
    }

    /* renamed from: b */
    public final boolean mo33055b() {
        Boolean bool = this.f60678f;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(this.f60676d.mo32593a(mo33054a()));
        this.f60678f = valueOf;
        if (!valueOf.booleanValue()) {
            absg.m48201d("swaa is not enabled for the current account.");
        }
        return this.f60678f.booleanValue();
    }

    /* renamed from: a */
    public final String mo33054a() {
        long j;
        if (this.f60677e == null) {
            this.f60677e = this.f60676d.mo32592a();
            rkj c = ((acap) this.f60676d).mo32595c();
            if (c == null) {
                absg.m48205e("getSignedInTimestampMs: Falling back to default value");
                j = 0;
            } else {
                j = ((aezj) c.f43190a).mo34654c();
            }
            this.f60675c = Long.valueOf(j);
        }
        return this.f60677e;
    }
}
