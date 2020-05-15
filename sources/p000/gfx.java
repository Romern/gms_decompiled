package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.HandlerThread;
import android.os.IBinder;
import com.google.android.gms.audiomodem.AudioStreamParams;
import com.google.android.gms.audiomodem.Snoop$Params;
import com.google.android.gms.audiomodem.TokenBroadcaster$Params;
import com.google.android.gms.audiomodem.TokenReceiver$Params;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: gfx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gfx extends gfb implements gge {

    /* renamed from: a */
    public final adzt f18113a;

    /* renamed from: b */
    public final gcy f18114b;

    /* renamed from: c */
    private final PackageManager f18115c;

    public gfx(Context context) {
        this.f18115c = context.getPackageManager();
        HandlerThread handlerThread = new HandlerThread("AudioModemThread");
        handlerThread.start();
        this.f18113a = new adzt(handlerThread.getLooper());
        this.f18114b = new gcy(context, this.f18113a);
    }

    /* renamed from: a */
    public final void mo11756a(IBinder iBinder, gfj gfj, TokenBroadcaster$Params tokenBroadcaster$Params, gez gez) {
        this.f18113a.post(new gfr(this, iBinder, gfj, this.f18115c.getNameForUid(Binder.getCallingUid()), tokenBroadcaster$Params, gez));
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.println("\nAudioModem State:");
        printWriter.println("\nEnd AudioModem State\n");
    }

    /* renamed from: a */
    public final void mo11757a(IBinder iBinder, gfm gfm, TokenReceiver$Params tokenReceiver$Params, gez gez) {
        this.f18113a.post(new gfp(this, iBinder, gfm, this.f18115c.getNameForUid(Binder.getCallingUid()), tokenReceiver$Params, gez));
    }

    /* renamed from: a */
    public final void mo11758a(AudioStreamParams audioStreamParams, gfg gfg) {
        this.f18113a.post(new gfu(this, audioStreamParams, gfg));
    }

    /* renamed from: a */
    public final void mo11759a(Snoop$Params snoop$Params, gff gff, gez gez) {
        this.f18113a.post(new gft(this, gff, snoop$Params, gez));
    }

    /* renamed from: a */
    public final void mo11760a(gfj gfj, gez gez) {
        this.f18113a.post(new gfs(this, gfj, this.f18115c.getNameForUid(Binder.getCallingUid()), gez));
    }

    /* renamed from: a */
    public final void mo11761a(gfm gfm, gez gez) {
        this.f18113a.post(new gfq(this, gfm, this.f18115c.getNameForUid(Binder.getCallingUid()), gez));
    }

    /* renamed from: a */
    public final void mo11776a(Runnable runnable) {
        this.f18113a.post(new gfv(this, runnable));
    }
}
