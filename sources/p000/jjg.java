package p000;

import android.os.Handler;
import com.google.android.gms.auth.proximity.BleCentralChimeraService;
import com.google.android.gms.auth.proximity.RemoteDevice;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: jjg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jjg implements Runnable {

    /* renamed from: a */
    private final jns f22608a;

    /* renamed from: b */
    private final RemoteDevice f22609b;

    /* renamed from: c */
    private final Future f22610c;

    /* renamed from: d */
    private final String f22611d;

    /* renamed from: e */
    private final jkh f22612e;

    /* renamed from: f */
    private final Handler f22613f;

    /* renamed from: g */
    private final jjc f22614g;

    /* renamed from: h */
    private final jta f22615h;

    /* renamed from: i */
    private final qxo f22616i;

    public jjg(jns jns, RemoteDevice remoteDevice, Future future, String str, jkh jkh, Handler handler, jjc jjc, jta jta, qxo qxo) {
        this.f22608a = jns;
        this.f22609b = remoteDevice;
        this.f22610c = future;
        this.f22611d = str;
        this.f22612e = jkh;
        this.f22613f = handler;
        this.f22614g = jjc;
        this.f22615h = jta;
        this.f22616i = qxo;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int], assign insn: 0x0002: CONST  (r2v0 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    public final void run() {
        int i = 2;
        int i2 = 0;
        try {
            this.f22615h.mo14044a(this.f22616i);
            jke jke = new jke(this.f22611d, (blun) this.f22610c.get(cchi.f178978a.mo6606a().mo75955e(), TimeUnit.MILLISECONDS), snp.m35703a(1, 10), i2);
            jke.mo13816a(this.f22612e);
            jke.mo13816a(this.f22608a);
            rpr.m34216b();
            jmc b = jmb.m16908b(this.f22609b);
            synchronized (jke.f22683e) {
                jke.f22689k = b;
                jke.f22690l = b;
                jke.mo13821b(2);
                jke.mo13823c(1);
                jke.f22679a.mo25414c("Connecting to socket with address %s...", jke.f22680b);
                jke.f22685g = jke.f22684f.mo14040a("ble_weave_socket_connection_time");
                jke.f22681c.mo66733f();
            }
            this.f22615h.mo14048d(i2);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            try {
                BleCentralChimeraService.f11094a.mo25417e("Error connecting to RemoteDevice: %s", e, this.f22609b);
                jsw.m17254a().mo14033a(e);
                this.f22612e.mo13832b(this.f22609b.f11138b, 2);
                this.f22613f.post(this.f22614g);
                if (e instanceof InterruptedException) {
                    i = 1;
                } else if (e instanceof TimeoutException) {
                    i = 3;
                }
            } finally {
                this.f22615h.mo14048d(i2);
            }
        }
    }
}
