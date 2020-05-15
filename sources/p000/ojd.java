package p000;

/* renamed from: ojd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ojd implements oha {

    /* renamed from: a */
    private static final bnsn f37739a = odk.m28481a("CAR.GAL.DIAGNOSTICS");

    /* renamed from: b */
    private final Object f37740b;

    /* renamed from: c */
    private final boolean f37741c;

    /* renamed from: d */
    private ohb f37742d;

    public ojd() {
        this(false);
    }

    /* renamed from: a */
    public final void mo22138a() {
        synchronized (this.f37740b) {
            this.f37742d = null;
        }
    }

    public ojd(boolean z) {
        this.f37740b = new Object();
        this.f37741c = z;
    }

    /* renamed from: a */
    public final void mo22139a(bitp bitp) {
        long j = bitp.f121692b;
        if (!this.f37741c) {
            synchronized (this.f37740b) {
                ohb ohb = this.f37742d;
                if (ohb == null) {
                    bnsi d = f37739a.mo68390d();
                    d.mo68432a("ojd", "a", 57, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d.mo68405a("onPingRequest: ControlEndPoint has not been registered");
                } else {
                    long j2 = bitp.f121692b;
                    bxvd da = bitq.f121696d.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bitq bitq = (bitq) da.f164949b;
                    bitq.f121698a |= 1;
                    bitq.f121699b = j2;
                    ((ojh) ohb).mo22206a(12, (bitq) da.mo74062i());
                }
            }
        }
    }

    /* renamed from: a */
    public void mo21235a(bitq bitq) {
        long j = bitq.f121699b;
    }

    /* renamed from: a */
    public final void mo22140a(ohb ohb) {
        synchronized (this.f37740b) {
            this.f37742d = ohb;
        }
    }
}
