package p000;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* renamed from: apxl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apxl extends soa {

    /* renamed from: a */
    final /* synthetic */ Context f85067a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public apxl(Context context) {
        super(9);
        this.f85067a = context;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.security.settings.VerifyAppsSettingsChimeraActivity.a(boolean, android.content.Context, long):apup
     arg types: [int, android.content.Context, int]
     candidates:
      qkh.a(android.content.Context, java.lang.String, java.lang.String):boolean
      com.google.android.gms.security.settings.VerifyAppsSettingsChimeraActivity.a(boolean, android.content.Context, long):apup */
    public final void run() {
        apup unused = new apus(this.f85067a).mo47632a(false, 5L, TimeUnit.SECONDS);
    }
}
