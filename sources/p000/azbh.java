package p000;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.libraries.matchstick.task.ScheduledTaskService;

/* renamed from: azbh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azbh extends soa {

    /* renamed from: a */
    final /* synthetic */ Context f98897a;

    /* renamed from: b */
    final /* synthetic */ String f98898b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public azbh(Context context, String str) {
        super(9);
        this.f98897a = context;
        this.f98898b = str;
    }

    public final void run() {
        azdl a = azdl.m85412a(this.f98897a);
        if (!a.mo54736J()) {
            azoj.m85930a("TachystickUtils", String.format("Tachystick activated: %s", this.f98898b), new Object[0]);
            SharedPreferences.Editor edit = a.f99088a.edit();
            edit.putBoolean("tachystick_activated", true);
            edit.apply();
            if (cffs.f183946a.mo6606a().mo81132d()) {
                int c = (int) cffs.f183946a.mo6606a().mo81131c();
                int nextInt = azbi.m85186a().nextInt(c);
                ScheduledTaskService.m94660a(this.f98897a, "gms:matchstick:updateClientCaps", (long) nextInt, (long) c);
                azoj.m85930a("TachystickUtils", "Starting task %s [%d, %d]", "gms:matchstick:updateClientCaps", Integer.valueOf(nextInt), Integer.valueOf(c));
            }
        }
    }
}
