package p000;

import android.content.SharedPreferences;

/* renamed from: bbbz */
final /* synthetic */ class bbbz implements bmxj {

    /* renamed from: a */
    private final SharedPreferences f102298a;

    public bbbz(SharedPreferences sharedPreferences) {
        this.f102298a = sharedPreferences;
    }

    public final Object apply(Object obj) {
        SharedPreferences sharedPreferences = this.f102298a;
        Void voidR = (Void) obj;
        boolean z = bbch.f102314a;
        sharedPreferences.edit().putBoolean("mdd_migrated_to_offroad", true).commit();
        return null;
    }
}
