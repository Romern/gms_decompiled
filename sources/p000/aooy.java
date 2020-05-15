package p000;

import android.content.Intent;

/* renamed from: aooy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aooy implements aoot {

    /* renamed from: b */
    private static final sek f78628b = aope.m66267a("RcsBindingManager");

    /* renamed from: a */
    aoou f78629a;

    /* renamed from: c */
    private aoox f78630c;

    /* renamed from: a */
    public final synchronized void mo43130a() {
        if (this.f78630c != null) {
            f78628b.mo25414c("Unbinding from current bound service", new Object[0]);
            try {
                skh.m35531a().mo25689a(rpr.m34216b(), this.f78630c);
            } catch (IllegalArgumentException | IllegalStateException e) {
                sek sek = f78628b;
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
                sb.append("Error unbinding: ");
                sb.append(valueOf);
                sek.mo25418e(sb.toString(), new Object[0]);
            }
            this.f78630c = null;
        }
    }

    /* renamed from: a */
    public final synchronized void mo43131a(aoou aoou) {
        this.f78629a = aoou;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo43142a(boolean z, String str, String str2) {
        if (this.f78629a != null) {
            if (!z) {
                aoov.m66238a().mo43136b(str, str2);
                return;
            }
            aoov.m66238a().mo43135a(str, str2);
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo43132a(String str, String str2, String str3) {
        boolean z;
        int i;
        Intent intent = new Intent(str2);
        intent.setPackage(str);
        aoox aoox = new aoox(this, str, str3);
        sek sek = f78628b;
        String valueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Binding with ");
        sb.append(valueOf);
        z = false;
        sek.mo25414c(sb.toString(), new Object[0]);
        if (!cghr.f186962a.mo6606a().mo83810a()) {
            i = 5;
        } else {
            i = 1;
        }
        try {
            z = skh.m35531a().mo25690a(rpr.m34216b(), intent, aoox, i);
        } catch (SecurityException e) {
            sek sek2 = f78628b;
            String valueOf2 = String.valueOf(e.getMessage());
            sek2.mo25418e(valueOf2.length() == 0 ? new String("Missing permission to access the service or the service cannot be found: ") : "Missing permission to access the service or the service cannot be found: ".concat(valueOf2), new Object[0]);
        }
        if (z) {
            this.f78630c = aoox;
        }
        return z;
    }
}
