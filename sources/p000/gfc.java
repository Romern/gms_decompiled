package p000;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.audiomodem.AudioStreamParams;
import com.google.android.gms.audiomodem.Snoop$Params;
import com.google.android.gms.audiomodem.TokenBroadcaster$Params;
import com.google.android.gms.audiomodem.TokenReceiver$Params;

/* renamed from: gfc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface gfc extends IInterface {
    /* renamed from: a */
    void mo11756a(IBinder iBinder, gfj gfj, TokenBroadcaster$Params tokenBroadcaster$Params, gez gez);

    /* renamed from: a */
    void mo11757a(IBinder iBinder, gfm gfm, TokenReceiver$Params tokenReceiver$Params, gez gez);

    /* renamed from: a */
    void mo11758a(AudioStreamParams audioStreamParams, gfg gfg);

    /* renamed from: a */
    void mo11759a(Snoop$Params snoop$Params, gff gff, gez gez);

    /* renamed from: a */
    void mo11760a(gfj gfj, gez gez);

    /* renamed from: a */
    void mo11761a(gfm gfm, gez gez);
}
