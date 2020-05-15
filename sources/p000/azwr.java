package p000;

/* renamed from: azwr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azwr extends azwv {

    /* renamed from: a */
    final /* synthetic */ azws f100130a;

    public azwr(azws azws) {
        this.f100130a = azws;
    }

    /* renamed from: a */
    public final void mo55339a(long j) {
        azws azws = this.f100130a;
        azws.f100134d++;
        if (!azws.mo55336a(azws.f100131a) && !this.f100130a.f100131a.isStarted()) {
            azws azws2 = this.f100130a;
            if (azws2.f100133c == -1 || azws2.f100134d < 0) {
                Runnable runnable = azws2.f100132b;
                if (runnable != null) {
                    runnable.run();
                }
                this.f100130a.f100131a.start();
            }
        }
    }
}
