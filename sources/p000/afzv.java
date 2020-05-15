package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import com.google.android.gms.mdm.util.BaseDeviceRinger$1;
import com.google.android.gms.mdm.util.BaseDeviceRinger$3;
import java.io.IOException;

/* renamed from: afzv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afzv implements MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener {

    /* renamed from: a */
    public static final int[] f65036a = {1, 4, 2};

    /* renamed from: l */
    private static final IntentFilter f65037l = new BaseDeviceRinger$1();

    /* renamed from: b */
    public final AudioManager f65038b;

    /* renamed from: c */
    public MediaPlayer f65039c;

    /* renamed from: d */
    public afzu f65040d;

    /* renamed from: e */
    public afzs f65041e;

    /* renamed from: f */
    public final Runnable f65042f = new afzr(this);

    /* renamed from: g */
    public final BroadcastReceiver f65043g = new BaseDeviceRinger$3(this, "security");

    /* renamed from: h */
    public int f65044h = -1;

    /* renamed from: i */
    public int f65045i = -1;

    /* renamed from: j */
    public final afzt f65046j;

    /* renamed from: k */
    public final Context f65047k;

    public afzv(Context context, afzt afzt) {
        this.f65047k = context;
        this.f65046j = afzt;
        this.f65038b = (AudioManager) context.getSystemService("audio");
        context.registerReceiver(this.f65043g, f65037l);
    }

    /* renamed from: a */
    public final boolean mo35125a(Uri uri) {
        if (uri == null) {
            return false;
        }
        try {
            this.f65039c.setDataSource(this.f65047k, uri);
            return true;
        } catch (IOException | IllegalStateException e) {
            agac.m53790a("Failed to play requested ringtone", e);
            this.f65039c.reset();
            return false;
        }
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        agac.m53790a("Error playing ringtone, what: %s extra: %s", Integer.valueOf(i), Integer.valueOf(i2));
        this.f65046j.mo35107b();
        return true;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        try {
            mediaPlayer.start();
        } catch (IllegalStateException e) {
            agac.m53790a("Error starting playing ringtone.", new Object[0]);
            this.f65046j.mo35107b();
        }
    }
}
