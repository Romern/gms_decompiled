package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.google.android.gms.audiomodem.PlaybackCapabilityHelper$1;
import com.google.android.gms.audiomodem.PlaybackCapabilityHelper$2;

/* renamed from: gec */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gec {

    /* renamed from: a */
    public final Context f18007a;

    /* renamed from: b */
    public final adzt f18008b;

    /* renamed from: c */
    public geb f18009c;

    /* renamed from: d */
    public boolean f18010d;

    /* renamed from: e */
    public final gdk f18011e;

    /* renamed from: f */
    public boolean f18012f;

    /* renamed from: g */
    public final IntentFilter f18013g;

    /* renamed from: h */
    public final BroadcastReceiver f18014h = new PlaybackCapabilityHelper$1(this, "nearby");

    /* renamed from: i */
    public final TelephonyManager f18015i;

    /* renamed from: j */
    public boolean f18016j;

    /* renamed from: k */
    public final PhoneStateListener f18017k = new gea(this);

    /* renamed from: l */
    public final BroadcastReceiver f18018l = new PlaybackCapabilityHelper$2(this, "nearby");

    /* renamed from: m */
    private final AudioManager f18019m;

    public gec(Context context) {
        this.f18007a = context;
        this.f18008b = new adzt();
        this.f18019m = (AudioManager) context.getSystemService("audio");
        this.f18011e = new gdk(context);
        this.f18013g = new IntentFilter("android.intent.action.HEADSET_PLUG");
        int i = Build.VERSION.SDK_INT;
        this.f18013g.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
        this.f18015i = (TelephonyManager) context.getSystemService("phone");
        context.registerReceiver(this.f18018l, new IntentFilter("android.intent.action.NEW_OUTGOING_CALL"), null, this.f18008b);
        this.f18015i.listen(this.f18017k, 32);
    }

    /* renamed from: a */
    public final void mo11720a() {
        this.f18009c = null;
        try {
            this.f18007a.unregisterReceiver(this.f18014h);
            this.f18012f = false;
        } catch (IllegalArgumentException e) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
        return true;
     */
    /* renamed from: b */
    public final boolean mo11722b() {
        if (this.f18016j) {
            return false;
        }
        if (!this.f18019m.isWiredHeadsetOn()) {
            gdk gdk = this.f18011e;
            if (gdk.f17956a.isBluetoothA2dpOn()) {
                srn srn = gdv.f17985a;
                return false;
            } else if (gdk.f17956a.isBluetoothScoOn()) {
                srn srn2 = gdv.f17985a;
                return false;
            } else {
                int i = Build.VERSION.SDK_INT;
                synchronized (gdk.f17958c) {
                    if (gdk.f17957b != null && gdk.f17957b.getConnectedDevices().size() > 0) {
                        srn srn3 = gdv.f17985a;
                        return false;
                    }
                }
            }
        } else {
            srn srn4 = gdv.f17985a;
            return false;
        }
    }

    /* renamed from: c */
    public final void mo11723c() {
        geb geb;
        boolean z = this.f18010d;
        boolean b = mo11722b();
        this.f18010d = b;
        if (b != z && (geb = this.f18009c) != null) {
            srn srn = gdv.f17985a;
            geb.mo11719a(b);
        }
    }

    /* renamed from: a */
    public final boolean mo11721a(geb geb) {
        if (geb != null) {
            bnsl bnsl = (bnsl) gdv.f17985a.mo68388c();
            bnsl.mo68432a("gec", "a", 131, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("requestStartPlayback() called during outstanding request");
        }
        this.f18009c = geb;
        if (!this.f18012f) {
            this.f18007a.registerReceiver(this.f18014h, this.f18013g, null, this.f18008b);
            this.f18012f = true;
        }
        boolean b = mo11722b();
        this.f18010d = b;
        return b;
    }
}
