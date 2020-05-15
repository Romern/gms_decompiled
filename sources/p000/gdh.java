package p000;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: gdh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gdh implements gce {

    /* renamed from: a */
    public final InputStream f17949a;

    /* renamed from: b */
    public final ggg f17950b = new ggg(gcd.class);

    /* renamed from: c */
    private final int f17951c;

    /* renamed from: d */
    private final int f17952d;

    /* renamed from: e */
    private final Thread f17953e;

    /* renamed from: f */
    private boolean f17954f = false;

    public gdh(InputStream inputStream, int i, int i2) {
        this.f17949a = inputStream;
        this.f17951c = i;
        this.f17952d = i2;
        Thread thread = new Thread(new gdg(this), "AudioModemStreamReader");
        this.f17953e = thread;
        thread.setPriority(-19);
    }

    /* renamed from: a */
    public final int mo11641a() {
        return this.f17951c;
    }

    /* renamed from: b */
    public final int mo11643b() {
        return this.f17952d;
    }

    /* renamed from: c */
    public final boolean mo11645c() {
        return this.f17954f;
    }

    /* renamed from: d */
    public final void mo11646d() {
        this.f17953e.interrupt();
        mo11680f();
        this.f17954f = false;
        try {
            this.f17949a.close();
        } catch (IOException e) {
            bnsl bnsl = (bnsl) gdv.f17985a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("gdh", "d", 72, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error closing audio InputStream");
        }
    }

    /* renamed from: e */
    public final boolean mo11647e() {
        return !this.f17954f;
    }

    /* renamed from: f */
    public final void mo11680f() {
        for (gcd gcd : (gcd[]) this.f17950b.f18130a) {
            gcd.mo11638a();
        }
    }

    /* renamed from: a */
    public final void mo11642a(gcd gcd) {
        this.f17950b.mo11790a(gcd);
        if (!this.f17954f) {
            this.f17954f = true;
            this.f17953e.start();
        }
    }

    /* renamed from: b */
    public final void mo11644b(gcd gcd) {
        this.f17950b.mo11791b(gcd);
    }
}
