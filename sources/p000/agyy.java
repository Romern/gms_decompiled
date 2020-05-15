package p000;

import android.content.SharedPreferences;

/* renamed from: agyy */
public final /* synthetic */ class agyy implements Runnable {

    /* renamed from: a */
    private final agza f66890a;

    /* renamed from: b */
    private final bxzv f66891b;

    /* renamed from: c */
    private final bxzu f66892c;

    public agyy(agza agza, bxzv bxzv, bxzu bxzu) {
        this.f66890a = agza;
        this.f66891b = bxzv;
        this.f66892c = bxzu;
    }

    public final void run() {
        agza agza = this.f66890a;
        bxzv bxzv = this.f66891b;
        bxzu bxzu = this.f66892c;
        agzf agzf = new agzf(agza.f66897b.getLong(bxzv.name(), 0));
        if (bxzu != bxzu.UNRECOGNIZED) {
            agzf.f66903a |= (long) (1 << bxzu.mo3214a());
        }
        SharedPreferences.Editor edit = agza.f66897b.edit();
        edit.putLong(bxzv.name(), agzf.f66903a);
        edit.commit();
    }
}
