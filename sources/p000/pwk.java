package p000;

/* renamed from: pwk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pwk extends ptb {

    /* renamed from: a */
    private static final String f40482a = ptk.m31239c("com.google.cast.receiver.key_exchange");

    /* renamed from: b */
    private final pwn f40483b;

    public pwk(pwn pwn) {
        super(f40482a, "MulticastKeyExcChannel", null);
        this.f40483b = pwn;
    }

    /* renamed from: a */
    public final void mo23348a(byte[] bArr) {
        try {
            blsd blsd = (blsd) GeneratedMessageLite.m124016a(blsd.f127565c, bArr, bxus.m123744c());
            int a = blsc.m107519a(blsd.f127568b);
            int i = 0;
            if (a != 0) {
                int i2 = 1;
                if (a != 1) {
                    pwn pwn = this.f40483b;
                    int a2 = blsc.m107519a(blsd.f127568b);
                    if (a2 != 0) {
                        i2 = a2;
                    }
                    if (i2 - 1 != 0) {
                        i = 2;
                    }
                    pwn.mo23773a((blse) null, i);
                    return;
                }
            }
            if (blsd.f127567a.size() != 0) {
                this.f40483b.mo23773a((blse) blsd.f127567a.get(0), 0);
            } else {
                this.f40483b.mo23773a((blse) null, 6);
            }
        } catch (bxwf e) {
            this.f40483b.mo23773a((blse) null, 3);
        }
    }
}
