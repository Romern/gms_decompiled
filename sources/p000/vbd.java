package p000;

import com.android.volley.VolleyError;
import java.util.Set;

/* renamed from: vbd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vbd {

    /* renamed from: a */
    private static final sbw f48913a = new sbw("AppDataFolderIdUpdater", "");

    /* renamed from: b */
    private final uhn f48914b;

    /* renamed from: c */
    private final vkv f48915c;

    public vbd(uhn uhn, vkv vkv) {
        sdo.m34959a(uhn);
        this.f48914b = uhn;
        sdo.m34959a(vkv);
        this.f48915c = vkv;
    }

    /* renamed from: b */
    private final void m39914b(uey uey) {
        try {
            String a = this.f48915c.mo28599a(uey);
            sdo.m34959a((Object) a);
            this.f48914b.mo27435d();
            try {
                ujx a2 = this.f48914b.mo27399a(uey);
                sdo.m34959a(a2);
                sdo.m34974b(a2.mo27573ai());
                sdo.m34974b(a2.mo27640w());
                a2.f47827c.f47810b = a;
                a2.mo27627m(false);
                ujl c = this.f48914b.mo27429c(uey);
                sdo.m34959a(c);
                c.mo27518b();
                c.mo27725t();
                a2.mo27627m(true);
                this.f48914b.mo27442f();
            } finally {
                this.f48914b.mo27439e();
            }
        } catch (gid e) {
            f48913a.mo25373b("AppDataFolderIdUpdater", String.format("Failed to retrieve app folder ID for app %s since app is not authorized.", uey.f47396c.f30764b), e);
            this.f48914b.mo27422b(uey.f47394a.f47683b, uey.f47395b);
            throw e;
        }
    }

    /* renamed from: a */
    public final void mo28190a(uey uey) {
        if (this.f48914b.mo27436e(uey.f47394a).contains(uey.f47395b)) {
            m39914b(uey);
        }
    }

    /* renamed from: a */
    public final void mo28191a(uih uih) {
        Set<String> e = this.f48914b.mo27436e(uih);
        long j = uih.f47683b;
        for (String str : e) {
            try {
                m39914b(this.f48914b.mo27392a(j, str));
            } catch (VolleyError | gid e2) {
            }
        }
    }
}
