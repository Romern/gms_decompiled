package p000;

import android.content.Context;
import android.provider.Settings;

/* renamed from: xih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xih {

    /* renamed from: b */
    private static final sek f52347b = new sek(new String[]{"BleLocationServiceUtil"}, (short[]) null);

    /* renamed from: a */
    private final Context f52348a;

    public xih(Context context) {
        bmxy.m108581a(context);
        this.f52348a = context;
    }

    /* renamed from: a */
    public final boolean mo29801a() {
        int i;
        try {
            i = Settings.Secure.getInt(this.f52348a.getContentResolver(), "location_mode");
        } catch (Settings.SettingNotFoundException e) {
            f52347b.mo25417e("Cannot query location service", e, new Object[0]);
            i = 0;
        }
        sek sek = f52347b;
        StringBuilder sb = new StringBuilder(28);
        sb.append("Location mode is ");
        sb.append(i);
        sek.mo25412b(sb.toString(), new Object[0]);
        if (i != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo29802b() {
        Settings.Secure.putInt(this.f52348a.getContentResolver(), "location_mode", 3);
    }

    /* renamed from: c */
    public final void mo29803c() {
        Settings.Secure.putInt(this.f52348a.getContentResolver(), "location_mode", 0);
    }
}
