package p000;

import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Process;
import com.google.android.gms.car.senderprotocol.ChannelMessage;
import java.util.Collection;

/* renamed from: okj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class okj extends HandlerThread {

    /* renamed from: a */
    private static final bnsn f37854a = odk.m28481a("CAR.GAL.GAL");

    /* renamed from: b */
    private final ogo f37855b;

    /* renamed from: d */
    protected volatile boolean f37856d;

    /* renamed from: e */
    public final Object f37857e = new Object();

    /* renamed from: f */
    protected final oho f37858f;

    protected okj(oho oho, ogo ogo) {
        super("WriterThread");
        this.f37858f = oho;
        this.f37855b = ogo;
    }

    /* renamed from: a */
    public final void mo22247a() {
        synchronized (this.f37857e) {
            if (this.f37856d) {
                this.f37856d = false;
                quitSafely();
            }
        }
    }

    /* renamed from: a */
    public abstract void mo22152a(Bundle bundle);

    /* renamed from: a */
    public abstract void mo22153a(ChannelMessage channelMessage);

    /* renamed from: a */
    public void mo22204a(oga oga) {
    }

    public final void run() {
        Process.setThreadPriority(-19);
        try {
            super.run();
        } catch (Exception e) {
            bnsi d = f37854a.mo68390d();
            d.mo68437a(e);
            d.mo68432a("okj", "run", 42, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Exception received: ");
            boolean z = this.f37856d;
            synchronized (this.f37857e) {
                this.f37856d = false;
                if (!z) {
                    bnsi b = f37854a.mo68387b();
                    b.mo68437a(e);
                    b.mo68432a("okj", "run", 53, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b.mo68405a("WriterThread: crashing with exception");
                    this.f37855b.mo22122a(bpdo.WRITER_UNKNOWN_EXCEPTION);
                    return;
                }
                bnsi b2 = f37854a.mo68387b();
                b2.mo68432a("okj", "run", 50, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b2.mo68405a("WriterThread: exiting due to IO error");
                this.f37855b.mo22122a(bpdo.WRITER_IO_ERROR);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List, java.util.Collection], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public void mo22203a(Collection r4) {
        int size = r4.size();
        for (int i = 0; i < size; i++) {
            mo22153a((ChannelMessage) r4.get(i));
        }
    }
}
