package p000;

import android.os.Binder;
import android.util.Base64;

/* renamed from: alml */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alml {

    /* renamed from: a */
    private static alml f73724a;

    public alml() {
        if (almo.f73780a == null) {
            almo.f73780a = new almo();
        }
    }

    /* renamed from: a */
    public static synchronized void m61286a() {
        synchronized (alml.class) {
            if (f73724a == null) {
                f73724a = new alml();
            }
        }
    }

    /* renamed from: a */
    public static final void m61287a(bpwi bpwi) {
        rpr b = rpr.m34216b();
        rik.m33637a();
        rik.m33639a(b, 1, bpwi);
    }

    /* renamed from: a */
    public static final void m61288a(String str, bxvd bxvd) {
        bxvd da = amog.f75587e.mo74144da();
        String f = spn.m35885f(rpr.m34216b());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        amog amog = (amog) da.f164949b;
        f.getClass();
        int i = amog.f75589a | 1;
        amog.f75589a = i;
        amog.f75590b = f;
        if ((i & 1) == 0) {
            "20.15.15 (120300-{{cl}})".getClass();
            amog.f75589a = i | 1;
            amog.f75590b = "20.15.15 (120300-{{cl}})";
        }
        if (amof.m63115a(stu.m36322h()) != 0) {
            int a = amof.m63115a(stu.m36322h());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            amog amog2 = (amog) da.f164949b;
            int i2 = a - 1;
            if (a != 0) {
                amog2.f75592d = i2;
                amog2.f75589a |= 4;
            } else {
                throw null;
            }
        }
        long g = stu.m36321g();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        amog amog3 = (amog) da.f164949b;
        amog3.f75589a |= 2;
        amog3.f75591c = g;
        amog amog4 = (amog) da.mo74062i();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        amoh amoh = (amoh) bxvd.f164949b;
        amoh amoh2 = amoh.f75593x;
        amog4.getClass();
        amoh.f75596b = amog4;
        amoh.f75595a |= 1;
        amoh amoh3 = (amoh) bxvd.mo74062i();
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            byte[] k = amoh3.mo73642k();
            Base64.encodeToString(k, 2);
            new qws(rpr.m34216b(), "GMS_CORE_PEOPLE", str).mo24335a(k).mo24327b();
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }
}
