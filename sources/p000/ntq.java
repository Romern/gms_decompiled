package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.car.CarAudioConfiguration;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ntq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ntq implements oiw {

    /* renamed from: j */
    private static final bnsn f36452j = odk.m28481a("CAR.MIC");

    /* renamed from: a */
    public volatile boolean f36453a = false;

    /* renamed from: b */
    public CarAudioConfiguration[] f36454b;

    /* renamed from: c */
    public volatile oix f36455c;

    /* renamed from: d */
    public final List f36456d = new ArrayList();

    /* renamed from: e */
    public final AtomicInteger f36457e = new AtomicInteger();

    /* renamed from: f */
    public volatile boolean f36458f = false;

    /* renamed from: g */
    public final Context f36459g;

    /* renamed from: h */
    public final boolean f36460h;

    /* renamed from: i */
    public volatile oaq f36461i;

    /* renamed from: k */
    private final Handler f36462k = new nvt(this, Looper.getMainLooper());

    /* renamed from: l */
    private final Runnable f36463l = new ntp(this);

    public ntq(Context context, boolean z) {
        this.f36459g = context;
        this.f36460h = z;
    }

    /* renamed from: a */
    public final void mo20649a(PrintWriter printWriter) {
        throw null;
    }

    /* renamed from: b */
    public final void mo21573b() {
        this.f36462k.removeCallbacks(this.f36463l);
    }

    /* renamed from: c */
    public final void mo20658c() {
        throw null;
    }

    /* renamed from: d */
    public final void mo21574d() {
        if (!this.f36453a) {
            throw new IllegalStateException("Attempted to use MicrophoneInputService before service discovery.");
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ ojh mo20646a(ojm ojm) {
        return new oix(this, ojm);
    }

    /* renamed from: a */
    public final void mo21570a() {
        this.f36462k.postDelayed(this.f36463l, 2000);
    }

    /* renamed from: a */
    public final void mo21571a(ByteBuffer byteBuffer) {
        oaq oaq;
        this.f36457e.getAndIncrement();
        mo21573b();
        synchronized (this.f36456d) {
            for (njl njl : this.f36456d) {
                njl.mo20900a(byteBuffer);
            }
        }
        mo21570a();
        if (this.f36460h && (oaq = this.f36461i) != null) {
            int position = byteBuffer.position();
            oaq.mo21908a(byteBuffer.array(), byteBuffer.arrayOffset() + position, byteBuffer.limit() - position);
        }
    }

    /* renamed from: a */
    public final void mo20651a(ojh ojh) {
        this.f36455c = (oix) ojh;
        this.f36453a = true;
    }

    /* renamed from: a */
    public final void mo21572a(boolean z) {
        if (!z) {
            bnsi b = f36452j.mo68387b();
            b.mo68432a("ntq", "a", 113, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("onMicrophoneStateChange not ok");
            synchronized (this.f36456d) {
                for (njl njl : this.f36456d) {
                    njl.f35830b.getAndSet(2);
                    njl.mo20903b();
                }
            }
        }
    }
}
