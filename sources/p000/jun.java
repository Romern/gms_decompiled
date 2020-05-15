package p000;

import java.io.IOException;

/* renamed from: jun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jun extends Thread {

    /* renamed from: a */
    final /* synthetic */ jup f23234a;

    public jun(jup jup) {
        this.f23234a = jup;
    }

    public final void run() {
        while (true) {
            try {
                jup jup = this.f23234a;
                sek sek = jup.f23237a;
                byte[] bArr = new byte[jup.f23238b.readInt()];
                this.f23234a.f23238b.readFully(bArr);
                this.f23234a.f23241e.mo14095a(bArr);
            } catch (IOException e) {
                jup.f23237a.mo25410a((Throwable) e);
                this.f23234a.mo14113a();
                return;
            }
        }
    }
}
