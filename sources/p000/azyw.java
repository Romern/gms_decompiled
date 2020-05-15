package p000;

/* renamed from: azyw */
final /* synthetic */ class azyw implements Runnable {

    /* renamed from: a */
    private final azyz f100241a;

    public azyw(azyz azyz) {
        this.f100241a = azyz;
    }

    public final void run() {
        azyz azyz = this.f100241a;
        azyz.mo55434d();
        azyz.f100252d = 0.0f;
        azyz.f100251c = (azyz.f100251c + 216.0f) % 360.0f;
        int b = azyz.mo55432b();
        azyz.f100253e = b;
        int[] iArr = azyz.f100255g;
        int i = iArr[b];
        azyz.f100254f = i;
        azyz.f100250b.setIntValues(i, iArr[azyz.mo55432b()]);
    }
}
