package p000;

import android.accounts.Account;

/* renamed from: bakh */
final /* synthetic */ class bakh implements bmxj {

    /* renamed from: a */
    private final byie f101124a;

    /* renamed from: b */
    private final byim f101125b;

    public bakh(byie byie, byim byim) {
        this.f101124a = byie;
        this.f101125b = byim;
    }

    public final Object apply(Object obj) {
        bygz bygz;
        byie byie = this.f101124a;
        byim byim = this.f101125b;
        Account account = (Account) obj;
        bygz bygz2 = byim.f166576a;
        if (bygz2 != null) {
            bygz = bygz2;
        } else {
            bygz = bygz.f166410c;
        }
        return new bakf(byie, bygz, account, byim.f166579d, byim.f166580e);
    }
}
