package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.request.SessionInsertRequest;

/* renamed from: zos */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zos {

    /* renamed from: a */
    public static final srn f55627a = zvt.m46581a();

    /* renamed from: b */
    public static final Status f55628b = new Status(0);

    /* renamed from: c */
    public final zre f55629c;

    /* renamed from: d */
    public final ysl f55630d;

    /* renamed from: e */
    private final caaq f55631e;

    public zos(zre zre, caaq caaq, ysl ysl) {
        this.f55629c = zre;
        this.f55631e = caaq;
        this.f55630d = ysl;
    }

    /* renamed from: a */
    private final void m45908a(SessionInsertRequest sessionInsertRequest, String str, bngx bngx, bngx bngx2) {
        bnia c = bnic.m109499c(sessionInsertRequest.f32289b.size() + sessionInsertRequest.f32290c.size());
        bnre i = bngx.listIterator();
        while (i.hasNext()) {
            caae caae = ((cadp) i.next()).f172713b;
            if (caae == null) {
                caae = caae.f172323i;
            }
            c.mo67629b(caae);
        }
        bnre i2 = bngx2.listIterator();
        while (i2.hasNext()) {
            caae caae2 = ((cadn) i2.next()).f172705e;
            if (caae2 == null) {
                caae2 = caae.f172323i;
            }
            c.mo67629b(caae2);
        }
        Status a = this.f55630d.mo30717a(str, c.mo67751a(), 2);
        if (!a.mo17710c()) {
            bnsl bnsl = (bnsl) f55627a.mo68388c();
            bnsl.mo68432a("zos", "a", 125, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68424a("App %s does not have access to data types in request %s", str, sessionInsertRequest);
            throw new ytw(a.f30115i, a.f30116j);
        }
    }

    /* renamed from: a */
    public final void mo31300a(long j, long j2) {
        for (caae caae : this.f55629c.mo31388h()) {
            bnic bnic = (bnic) yvm.f54688a.mo30787a();
            caah caah = caae.f172330f;
            if (caah == null) {
                caah = caah.f172333d;
            }
            if (bnic.contains(caah.f172336b) && !zuq.m46516a(caae, this.f55631e)) {
                this.f55629c.mo31374b(caae, j, j2);
            }
        }
    }
}
