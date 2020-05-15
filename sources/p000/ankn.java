package p000;

import java.util.concurrent.ExecutorService;

/* renamed from: ankn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ankn {

    /* renamed from: a */
    public static final Object f77022a = new Object();

    /* renamed from: b */
    public static ankn f77023b = null;

    /* renamed from: c */
    private final ExecutorService f77024c;

    /* renamed from: d */
    private final anko f77025d;

    public ankn(ExecutorService executorService, anko anko) {
        this.f77024c = executorService;
        this.f77025d = anko;
        for (int i = 0; i < 50; i++) {
            StringBuilder sb = new StringBuilder(33);
            sb.append("reset_platform_package");
            sb.append(i);
            String sb2 = sb.toString();
            String a = ankj.m64645a("rescue_party_namespace", sb2);
            if (a != null) {
                mo41912a(sb2, a);
            }
        }
        ankj.m64647a("rescue_party_namespace", this.f77024c, new ankm(this));
    }

    /* renamed from: a */
    private final void m64676a(int i, String str) {
        String a = this.f77025d.mo41913a(i, str, "hash");
        if (a != null) {
            this.f77025d.mo41914a(i, str, "banned_integrity_hash", a);
        }
    }

    /* renamed from: a */
    public final void mo41912a(String str, String str2) {
        if (str2.equals("no_package")) {
            str2 = null;
        }
        m64676a(1, str2);
        m64676a(2, str2);
        this.f77025d.mo41914a(2, str2, "hash", null);
        this.f77025d.mo41914a(1, str2, "hash", null);
        this.f77025d.mo41914a(2, str2, "snapshotToken1", null);
        this.f77025d.mo41914a(1, str2, "snapshotToken1", null);
        ankj.m64646a("rescue_party_namespace", str, null, true);
    }
}
