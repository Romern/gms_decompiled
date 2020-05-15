package p000;

import android.os.Message;
import java.util.Random;

/* renamed from: bgti */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgti extends bgtf {

    /* renamed from: a */
    private final long f117490a;

    /* renamed from: b */
    private final long f117491b;

    /* renamed from: c */
    private final Random f117492c;

    public bgti(long j, long j2, Random random) {
        super("Delay");
        this.f117490a = j;
        this.f117491b = j2;
        this.f117492c = random;
    }

    /* renamed from: a */
    public final void mo63111a() {
        this.f117482h.f117486b.mo63147a(15, this.f117490a + (this.f117492c.nextLong() % (this.f117491b - this.f117490a)));
    }

    /* renamed from: b */
    public final void mo63113b() {
        this.f117482h.f117486b.removeMessages(15);
    }

    /* renamed from: a */
    public final boolean mo63112a(Message message) {
        if (message.what != 15) {
            return false;
        }
        mo63145e();
        return true;
    }
}
