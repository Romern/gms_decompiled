package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* renamed from: ohm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ohm extends Thread {

    /* renamed from: a */
    public volatile boolean f37644a = true;

    /* renamed from: b */
    public final Object f37645b = new Object();

    /* renamed from: c */
    public WritableByteChannel f37646c;

    /* renamed from: d */
    public ohy f37647d;

    /* renamed from: e */
    private final InputStream f37648e;

    /* renamed from: f */
    private final byte[] f37649f = new byte[AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES];

    /* renamed from: g */
    private final ByteBuffer f37650g;

    /* renamed from: h */
    private final boolean f37651h;

    public ohm(InputStream inputStream, boolean z) {
        super("ReaderThread");
        this.f37648e = inputStream;
        ByteBuffer wrap = ByteBuffer.wrap(this.f37649f);
        this.f37650g = wrap;
        wrap.limit(0);
        this.f37651h = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r3 = r8.f37648e;
        r6 = r8.f37649f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004c, code lost:
        if (r8.f37651h != false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004f, code lost:
        r4 = com.google.autofill.detection.p098ml.AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0051, code lost:
        r3 = r3.read(r6, 0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r4 = r8.f37647d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0058, code lost:
        if (r4 == null) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005a, code lost:
        r4.mo22175a(android.os.SystemClock.elapsedRealtime(), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0066, code lost:
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r4 = p000.ohp.f37670a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006b, code lost:
        monitor-enter(r8.f37645b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r6 = r8.f37646c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006e, code lost:
        if (r6 != null) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0070, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0074, code lost:
        if (r3 >= 0) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r8.f37650g.limit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x007c, code lost:
        r8.f37644a = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x008a, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x008b, code lost:
        r4 = p000.ohp.f37670a.mo68388c();
        r4.mo68437a(r3);
        r4.mo68432a("ohm", "run", 331, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r4.mo68405a("ReaderThread: crashing with exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00a0, code lost:
        monitor-enter(r8.f37645b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        r5 = r8.f37646c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00a3, code lost:
        if (r5 != null) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r5 = p000.ohp.f37670a.mo68387b();
        r5.mo68437a(r3);
        r5.mo68432a("ohm", "run", 337, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r5.mo68405a("Impossible");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x008a A[ExcHandler: Exception (r3v2 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:1:0x0006] */
    public final void run() {
        while (this.f37644a) {
            try {
                synchronized (this.f37645b) {
                    while (this.f37646c == null && this.f37644a) {
                        try {
                            this.f37645b.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            this.f37644a = false;
                            bnsi d = ohp.f37670a.mo68390d();
                            d.mo68432a("ohm", "run", 297, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            d.mo68405a("ReaderThread: interrupted");
                        }
                    }
                    if (this.f37644a) {
                        int write = this.f37646c.write(this.f37650g);
                        if (write < 0) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } catch (IOException e2) {
                bnsi b = ohp.f37670a.mo68387b();
                b.mo68437a(e2);
                b.mo68432a("ohm", "run", 329, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68405a("IOException with byte channel!!!");
                return;
            } catch (Exception e3) {
            }
        }
    }
}
