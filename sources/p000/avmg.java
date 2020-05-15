package p000;

import android.content.Intent;

/* renamed from: avmg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avmg {
    /* renamed from: a */
    public static Intent m78795a() {
        return new Intent("android.settings.SYSTEM_UPDATE_SETTINGS").setPackage("com.google.android.gms");
    }

    /* renamed from: a */
    public static Intent m78796a(String str) {
        return new Intent("android.settings.SYSTEM_UPDATE_COMPLETE").setPackage("com.google.android.gms").addFlags(268730368).putExtra("type", 1).putExtra("message", str);
    }

    /* renamed from: a */
    public static Intent m78797a(String str, String str2, int i, int i2, boolean z, boolean z2) {
        return new Intent("android.settings.SYSTEM_UPDATE_COMPLETE").setPackage("com.google.android.gms").addFlags(268730368).putExtra("type", 3).putExtra("message", str).putExtra("device_detail_update_url", str2).putExtra("overdue_phase", i2).putExtra("device_system_update_status", i).putExtra("is_security_update", z).putExtra("is_glif", z2);
    }
}
