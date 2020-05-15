package p000;

import android.content.SharedPreferences;

/* renamed from: agyz */
public final /* synthetic */ class agyz implements Runnable {

    /* renamed from: a */
    private final agza f66893a;

    /* renamed from: b */
    private final bxzv f66894b;

    public agyz(agza agza, bxzv bxzv) {
        this.f66893a = agza;
        this.f66894b = bxzv;
    }

    public final void run() {
        agza agza = this.f66893a;
        bxzv bxzv = this.f66894b;
        SharedPreferences.Editor edit = agza.f66897b.edit();
        edit.putLong(bxzv.name(), new agzf().f66903a);
        edit.commit();
    }
}
