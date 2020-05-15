package p000;

import android.content.SharedPreferences;

/* renamed from: bazh */
final /* synthetic */ class bazh implements bqeh {

    /* renamed from: a */
    private final SharedPreferences f102151a;

    public bazh(SharedPreferences sharedPreferences) {
        this.f102151a = sharedPreferences;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        Void voidR = (Void) obj;
        if (!this.f102151a.edit().putBoolean("done_remove_groupkeys_with_downloaded_field_not_set", true).commit()) {
            bbev.m87905a("%s: Unable to save the state of removing GroupKeys with downloaded field not set", "FileGroupManager");
        }
        return bqga.m112775a((Object) null);
    }
}
