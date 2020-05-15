package p000;

import android.app.UiModeManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings;
import java.util.ArrayList;
import java.util.List;

/* renamed from: nwj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nwj {

    /* renamed from: a */
    public static final bnsn f36801a = odk.m28481a("CAR.SYS");

    /* renamed from: b */
    private final Context f36802b;

    /* renamed from: c */
    private final List f36803c = new ArrayList();

    /* renamed from: d */
    private asfb f36804d;

    /* renamed from: e */
    private final int f36805e;

    /* renamed from: f */
    private final npd f36806f;

    /* renamed from: g */
    private boolean f36807g = false;

    /* renamed from: h */
    private boolean f36808h = false;

    /* renamed from: i */
    private boolean f36809i;

    public nwj(npd npd, Context context, int i, boolean z) {
        this.f36806f = npd;
        this.f36802b = context;
        this.f36805e = i;
        if (z) {
            int i2 = Build.VERSION.SDK_INT;
            if (Settings.System.canWrite(context)) {
                if (!ccuf.m131593d().isEmpty()) {
                    this.f36803c.add(new nwi("lockscreen_sounds_enabled", ccuf.m131593d()));
                }
                if (!ccuf.m131594e().isEmpty()) {
                    this.f36803c.add(new nwi("screen_off_timeout", ccuf.m131594e()));
                }
                if (!ccuf.m131595f().isEmpty()) {
                    this.f36803c.add(new nwi("sound_effects_enabled", ccuf.m131595f()));
                }
            }
        }
        this.f36803c.add(new nwh());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0125, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011d  */
    /* renamed from: a */
    public final synchronized void mo21750a() {
        if (this.f36804d == null) {
            asfb asfb = new asfb(this.f36802b.getApplicationContext(), 1, "CarService", null, "com.google.android.gms");
            asfb.mo49115a(false);
            this.f36804d = asfb;
        }
        this.f36804d.mo49117b();
        if (!this.f36807g && this.f36805e != 0) {
            this.f36807g = true;
            npd npd = this.f36806f;
            List list = this.f36803c;
            if (!npd.f36296c.getBoolean("car_backup_valid", false)) {
                SharedPreferences.Editor edit = npd.f36296c.edit();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    npc npc = (npc) list.get(i);
                    npc.f36291b = npc.mo21374a(npd.f36295b);
                    if (npc.f36291b != null) {
                        String valueOf = String.valueOf(npc.f36290a);
                        edit.putString(valueOf.length() == 0 ? new String("car_saved_setting_") : "car_saved_setting_".concat(valueOf), npc.f36291b);
                    }
                }
                edit.putBoolean("car_backup_valid", true);
                edit.apply();
            } else {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    npc npc2 = (npc) list.get(i2);
                    SharedPreferences sharedPreferences = npd.f36296c;
                    String valueOf2 = String.valueOf(npc2.f36290a);
                    npc2.f36291b = sharedPreferences.getString(valueOf2.length() == 0 ? new String("car_saved_setting_") : "car_saved_setting_".concat(valueOf2), null);
                }
            }
            List list2 = this.f36803c;
            int size3 = list2.size();
            for (int i3 = 0; i3 < size3; i3++) {
                ((npc) list2.get(i3)).mo21375b(this.f36802b.getApplicationContext());
            }
        }
        if (this.f36805e != 0) {
            UiModeManager uiModeManager = (UiModeManager) this.f36802b.getApplicationContext().getSystemService("uimode");
            int i4 = 3;
            if (ccvl.f180035a.mo6606a().mo76878a() || this.f36805e == 3) {
                i4 = 2;
            }
            if (nzi.m28224a()) {
                if (ccqf.f179749a.mo6606a().mo76640b()) {
                    uiModeManager.enableCarMode((int) ccqf.f179749a.mo6606a().mo76639a(), i4);
                    if (this.f36808h) {
                        mo21751a(this.f36809i);
                        return;
                    }
                }
            }
            uiModeManager.enableCarMode(i4);
            if (this.f36808h) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo21752b() {
        if (this.f36805e != 0) {
            UiModeManager uiModeManager = (UiModeManager) this.f36802b.getApplicationContext().getSystemService("uimode");
            if (uiModeManager.getCurrentModeType() == 3) {
                uiModeManager.disableCarMode(0);
                if (ccuf.f179931a.mo6606a().mo76809t()) {
                    uiModeManager.disableCarMode(0);
                }
            }
        }
        asfb asfb = this.f36804d;
        if (asfb != null && asfb.mo49124e()) {
            this.f36804d.mo49120c();
        }
        if (this.f36807g && this.f36805e != 0) {
            List list = this.f36803c;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                npc npc = (npc) list.get(i);
                if (npc.f36291b != null) {
                    npc.mo21376c(this.f36802b.getApplicationContext());
                }
            }
            SharedPreferences.Editor edit = this.f36806f.f36296c.edit();
            edit.putBoolean("car_backup_valid", false);
            edit.apply();
            this.f36807g = false;
        }
    }

    /* renamed from: a */
    public final void mo21751a(boolean z) {
        UiModeManager uiModeManager = (UiModeManager) this.f36802b.getApplicationContext().getSystemService("uimode");
        int i = 1;
        if (uiModeManager.getCurrentModeType() == 3) {
            if (z) {
                i = 2;
            }
            uiModeManager.setNightMode(i);
            this.f36808h = false;
            return;
        }
        this.f36808h = true;
        this.f36809i = z;
    }
}
