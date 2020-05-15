package p000;

import android.content.Context;

/* renamed from: afai */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afai extends aezv {
    public afai(Context context) {
        super("com.google.android.gms.magictether.client.FIRST_TIME_SETUP_PREFERENCE_FILE", context);
        if (!super.mo34689a().contains("com.google.android.gms.magictether.HAS_FINISHED_FIRST_TIME_SETUP")) {
            mo34694b("com.google.android.gms.magictether.HAS_FINISHED_FIRST_TIME_SETUP", this.f64055a.getSharedPreferences("PREFERENCE_FILE", 0).getBoolean("com.google.android.gms.magictether.HAS_FINISHED_FIRST_TIME_SETUP", false));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aezv.a(java.lang.String, boolean):boolean
     arg types: [java.lang.String, int]
     candidates:
      aezv.a(java.lang.String, int):void
      aezv.a(java.lang.String, java.lang.String):void
      aezv.a(java.lang.String, boolean):boolean */
    /* renamed from: d */
    public final boolean mo34710d() {
        return mo34692a("com.google.android.gms.magictether.HAS_FINISHED_FIRST_TIME_SETUP", false);
    }
}
