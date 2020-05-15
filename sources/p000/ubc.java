package p000;

import com.google.android.gms.drive.auth.AppIdentity;
import java.util.List;

/* renamed from: ubc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ubc implements ssx {

    /* renamed from: a */
    final /* synthetic */ AppIdentity f47084a;

    /* renamed from: b */
    final /* synthetic */ uih f47085b;

    /* renamed from: c */
    final /* synthetic */ List f47086c;

    public ubc(AppIdentity appIdentity, uih uih, List list) {
        this.f47084a = appIdentity;
        this.f47085b = uih;
        this.f47086c = list;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo6692a(Object obj) {
        ube ube = (ube) obj;
        return ube.mo27057b().mo26882a(this.f47084a, this.f47085b) && this.f47086c.containsAll(ube.mo27057b().mo26891c().f47074e);
    }
}
