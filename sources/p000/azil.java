package p000;

import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.libraries.matchstick.net.MessagingService;

/* renamed from: azil */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azil extends soa {

    /* renamed from: a */
    final /* synthetic */ azit f99482a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public azil(azit azit) {
        super(9);
        this.f99482a = azit;
    }

    public final void run() {
        Boolean bool;
        int i;
        azit azit = this.f99482a;
        Boolean bool2 = azit.f99497f;
        if (bool2 != null && (bool = azit.f99498g) != null && !bool2.equals(bool)) {
            azit azit2 = this.f99482a;
            azdl azdl = azit2.f99495d;
            boolean booleanValue = azit2.f99498g.booleanValue();
            SharedPreferences.Editor edit = azdl.f99088a.edit();
            edit.putBoolean("is_removing_message_after_7_days", booleanValue);
            edit.apply();
            azit azit3 = this.f99482a;
            azph azph = azit3.f99496e;
            if (!azit3.f99498g.booleanValue()) {
                i = 278;
            } else {
                i = 277;
            }
            azph.mo55125a(i);
            if (this.f99482a.f99498g.booleanValue()) {
                azan.m85141a(this.f99482a.f99493b).mo54535a();
                MessagingService.m94557b(new Intent("com.google.android.apps.libraries.matchstick.action.FIRE_ALL_CONVERSATION_NOTIFICATIONS"), this.f99482a.f99493b);
                MessagingService.m94557b(new Intent("com.google.android.apps.libraries.matchstick.action.RUN_SYNC_CHECKER").putExtra("sync_ops", 16), this.f99482a.f99493b);
            }
        }
    }
}
