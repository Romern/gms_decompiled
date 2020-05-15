package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: avel */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avel extends avej {

    /* renamed from: a */
    private final bxsu f93021a;

    public avel(Context context, Account account, bxsu bxsu) {
        super(context, account);
        this.f93021a = bxsu;
    }

    /* renamed from: a */
    public final aucb mo51180a(rjx rjx) {
        bxsu bxsu = this.f93021a;
        rkb rkb = rjx.f43165D;
        aveb aveb = new aveb(rkb, bxsu);
        rkb.mo24795b(aveb);
        return sdl.m34956a(aveb, new avah()).mo50364a(avek.f93020a);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ rkk mo51181a(Status status) {
        return new aveg(status, null);
    }
}
