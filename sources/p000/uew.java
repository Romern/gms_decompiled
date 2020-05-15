package p000;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.auth.AppIdentity;

/* renamed from: uew */
final /* synthetic */ class uew implements Runnable {

    /* renamed from: a */
    private final uex f47382a;

    /* renamed from: b */
    private final ClientContext f47383b;

    /* renamed from: c */
    private final AppIdentity f47384c;

    /* renamed from: d */
    private final bnic f47385d;

    /* renamed from: e */
    private final uih f47386e;

    /* renamed from: f */
    private final uey f47387f;

    public uew(uex uex, ClientContext clientContext, AppIdentity appIdentity, bnic bnic, uih uih, uey uey) {
        this.f47382a = uex;
        this.f47383b = clientContext;
        this.f47384c = appIdentity;
        this.f47385d = bnic;
        this.f47386e = uih;
        this.f47387f = uey;
    }

    public final void run() {
        uex uex = this.f47382a;
        ClientContext clientContext = this.f47383b;
        AppIdentity appIdentity = this.f47384c;
        bnic bnic = this.f47385d;
        uih uih = this.f47386e;
        uey uey = this.f47387f;
        try {
            uex.f47388a.mo25371b("Refreshing app auth in background.");
            uex.mo27261a(clientContext, appIdentity, bnic, uih, uey, true);
        } finally {
            uex.f47389b = null;
        }
    }
}
