package p000;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.PowerManager;
import android.provider.Settings;
import com.google.android.gms.netrec.logging.DeviceStateLogger$2;

/* renamed from: akkk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akkk extends akko {

    /* renamed from: b */
    private final Handler f72151b;

    /* renamed from: c */
    private final Context f72152c;

    /* renamed from: d */
    private final PowerManager f72153d;

    /* renamed from: e */
    private final ContentObserver f72154e;

    /* renamed from: f */
    private final ContentResolver f72155f;

    /* renamed from: g */
    private final BroadcastReceiver f72156g = new DeviceStateLogger$2(this, "netrec");

    /* renamed from: h */
    private boqz f72157h;

    public akkk(Context context, ContentResolver contentResolver, Handler handler, PowerManager powerManager) {
        this.f72152c = context;
        this.f72151b = handler;
        this.f72155f = contentResolver;
        this.f72153d = powerManager;
        this.f72154e = new akkj(this, "netrec", "DeviceStateLogger", handler);
    }

    /* renamed from: a */
    public final void mo39516a() {
        boolean z;
        bxvd da = boqz.f134359e.mo74144da();
        if (Settings.Global.getInt(this.f72155f, "airplane_mode_on", 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boqz boqz = (boqz) da.f164949b;
        boqz.f134361a |= 1;
        boqz.f134362b = z;
        boolean isPowerSaveMode = this.f72153d.isPowerSaveMode();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boqz boqz2 = (boqz) da.f164949b;
        boqz2.f134361a |= 2;
        boqz2.f134363c = isPowerSaveMode;
        if (cfpd.m142362b()) {
            boolean isInteractive = this.f72153d.isInteractive();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boqz boqz3 = (boqz) da.f164949b;
            boqz3.f134361a |= 4;
            boqz3.f134364d = isInteractive;
        }
        boqz boqz4 = this.f72157h;
        if (boqz4 == null || !boqz4.equals(da.mo74062i())) {
            bxvd da2 = boqx.f134343i.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            boqx boqx = (boqx) da2.f164949b;
            boqx.f134346b = 51;
            boqx.f134345a = 1 | boqx.f134345a;
            boqz boqz5 = (boqz) da.mo74062i();
            boqz5.getClass();
            boqx.f134352h = boqz5;
            boqx.f134345a |= 128;
            aknf.m60074a(da2);
            this.f72157h = (boqz) da.mo74062i();
        }
    }

    /* renamed from: b */
    public final boolean mo39517b() {
        return cfpd.f185332a.mo6606a().mo82446k();
    }

    /* renamed from: c */
    public final void mo39518c() {
        this.f72155f.registerContentObserver(Settings.Global.getUriFor("airplane_mode_on"), false, this.f72154e);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        if (cfpd.m142362b()) {
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
        }
        this.f72152c.registerReceiver(this.f72156g, intentFilter, null, this.f72151b);
        mo39516a();
    }

    /* renamed from: d */
    public final void mo39519d() {
        this.f72155f.unregisterContentObserver(this.f72154e);
        this.f72152c.unregisterReceiver(this.f72156g);
    }
}
