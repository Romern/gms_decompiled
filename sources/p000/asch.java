package p000;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: asch */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class asch implements Runnable {

    /* renamed from: a */
    public boolean f88691a;

    /* renamed from: b */
    private final ascg f88692b;

    /* renamed from: c */
    private final DataInputStream f88693c;

    public asch(ascg ascg, DataInputStream dataInputStream) {
        this.f88692b = ascg;
        this.f88693c = dataInputStream;
    }

    public final void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                int readInt = this.f88693c.readInt();
                sek sek = asci.f88694a;
                StringBuilder sb = new StringBuilder(30);
                sb.append("Waiting for ");
                sb.append(readInt);
                sb.append(" bytes.");
                sek.mo25409a(sb.toString(), new Object[0]);
                byte[] bArr = new byte[readInt];
                this.f88693c.readFully(bArr);
                if (asci.f88694a.mo19637a(2)) {
                    sek sek2 = asci.f88694a;
                    int hashCode = Arrays.hashCode(bArr);
                    StringBuilder sb2 = new StringBuilder(36);
                    sb2.append("Received bytes with hash ");
                    sb2.append(hashCode);
                    sek2.mo25409a(sb2.toString(), new Object[0]);
                }
                if (this.f88691a) {
                    asci.f88694a.mo25409a("Not calling listener -- thread already interrupted.", new Object[0]);
                } else {
                    this.f88692b.mo48253b(bArr);
                }
            } catch (IOException e) {
                if (this.f88691a) {
                    asci.f88694a.mo25409a("IOException after interrupting thread.", new Object[0]);
                    return;
                }
                throw new RuntimeException(e);
            }
        }
    }
}
