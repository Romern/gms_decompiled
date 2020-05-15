package p000;

import java.io.IOException;

/* renamed from: buls */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buls implements Runnable {

    /* renamed from: a */
    final /* synthetic */ byte[] f154182a;

    /* renamed from: b */
    final /* synthetic */ bult f154183b;

    public buls(bult bult, byte[] bArr) {
        this.f154183b = bult;
        this.f154182a = bArr;
    }

    public final void run() {
        try {
            this.f154183b.mo61836b(this.f154182a);
            this.f154183b.f114297j = 0;
        } catch (IOException e) {
            bult bult = this.f154183b;
            int i = bult.f114297j + 1;
            bult.f114297j = i;
            if (i > 3) {
                bult.f114296i = false;
            }
        }
        this.f154183b.f154186c.set(false);
    }
}
