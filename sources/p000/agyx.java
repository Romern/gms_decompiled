package p000;

import android.content.SharedPreferences;

/* renamed from: agyx */
final /* synthetic */ class agyx implements Runnable {

    /* renamed from: a */
    private final agza f66887a;

    /* renamed from: b */
    private final bxzv f66888b;

    /* renamed from: c */
    private final long f66889c;

    public agyx(agza agza, bxzv bxzv, long j) {
        this.f66887a = agza;
        this.f66888b = bxzv;
        this.f66889c = j;
    }

    public final void run() {
        agza agza = this.f66887a;
        bxzv bxzv = this.f66888b;
        long j = this.f66889c;
        SharedPreferences.Editor edit = agza.f66897b.edit();
        edit.putLong(String.valueOf(bxzv.name()).concat("_last_try_time"), j);
        if (edit.commit()) {
            bxzv.name();
        } else {
            ((bnsl) agza.f66895c.mo68388c()).mo68423a("Failed saving timestamp of last failure for %s value %b to SharedPref", bxzv.name(), j);
        }
    }
}
