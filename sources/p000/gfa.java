package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.audiomodem.AudioStreamParams;
import com.google.android.gms.audiomodem.Snoop$Params;
import com.google.android.gms.audiomodem.TokenBroadcaster$Params;
import com.google.android.gms.audiomodem.TokenReceiver$Params;

/* renamed from: gfa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gfa extends dcj implements gfc {
    public gfa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.audiomodem.internal.IAudioModemService");
    }

    /* renamed from: a */
    public final void mo11756a(IBinder iBinder, gfj gfj, TokenBroadcaster$Params tokenBroadcaster$Params, gez gez) {
        Parcel bj = mo8529bj();
        bj.writeStrongBinder(iBinder);
        dcl.m8164a(bj, gfj);
        dcl.m8165a(bj, tokenBroadcaster$Params);
        dcl.m8164a(bj, gez);
        mo8528b(3, bj);
    }

    /* renamed from: a */
    public final void mo11758a(AudioStreamParams audioStreamParams, gfg gfg) {
        throw null;
    }

    /* renamed from: a */
    public final void mo11757a(IBinder iBinder, gfm gfm, TokenReceiver$Params tokenReceiver$Params, gez gez) {
        Parcel bj = mo8529bj();
        bj.writeStrongBinder(iBinder);
        dcl.m8164a(bj, gfm);
        dcl.m8165a(bj, tokenReceiver$Params);
        dcl.m8164a(bj, gez);
        mo8528b(1, bj);
    }

    /* renamed from: a */
    public final void mo11759a(Snoop$Params snoop$Params, gff gff, gez gez) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, snoop$Params);
        dcl.m8164a(bj, gff);
        dcl.m8164a(bj, gez);
        mo8528b(5, bj);
    }

    /* renamed from: a */
    public final void mo11760a(gfj gfj, gez gez) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, gfj);
        dcl.m8164a(bj, gez);
        mo8528b(4, bj);
    }

    /* renamed from: a */
    public final void mo11761a(gfm gfm, gez gez) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, gfm);
        dcl.m8164a(bj, gez);
        mo8528b(2, bj);
    }
}
