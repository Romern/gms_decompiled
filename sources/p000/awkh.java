package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.wallet.firstparty.GetClientTokenRequest;
import com.google.android.gms.wallet.firstparty.saveinstrument.GetSaveInstrumentDetailsRequest;

/* renamed from: awkh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awkh extends rjx {

    /* renamed from: a */
    public final Context f94589a;

    /* renamed from: b */
    public final String f94590b;

    /* renamed from: c */
    public final int f94591c;

    /* renamed from: d */
    public final int f94592d;

    public awkh(Context context, awbu awbu) {
        super(context, awbv.f94154a, awbu, new rky());
        this.f94589a = context;
        this.f94591c = awbu.f94150a;
        Account account = awbu.f94152c;
        this.f94590b = account != null ? account.name : null;
        this.f94592d = awbu.f94151b;
    }

    /* renamed from: a */
    public final aucb mo52198a(GetClientTokenRequest getClientTokenRequest) {
        rkb rkb = this.f43165D;
        awnp awnp = new awnp(rkb, getClientTokenRequest);
        rkb.mo24787a((rle) awnp);
        return sdl.m34956a(awnp, new awkc());
    }

    /* renamed from: a */
    public final aucb mo52199a(GetSaveInstrumentDetailsRequest getSaveInstrumentDetailsRequest) {
        return mo24732b(new awkg(this, getSaveInstrumentDetailsRequest));
    }
}
