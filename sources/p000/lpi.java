package p000;

import com.google.android.gms.autofill.data.Credential;

/* renamed from: lpi */
final /* synthetic */ class lpi implements Runnable {

    /* renamed from: a */
    private final lpk f26537a;

    /* renamed from: b */
    private final Credential f26538b;

    public lpi(lpk lpk, Credential credential) {
        this.f26537a = lpk;
        this.f26538b = credential;
    }

    public final void run() {
        this.f26537a.mo15343a(this.f26538b);
    }
}
