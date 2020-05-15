package p000;

import com.google.firebase.auth.api.model.ProviderUserInfoList;

/* renamed from: brrb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brrb implements brpk {

    /* renamed from: a */
    public String f143212a;

    /* renamed from: b */
    public ProviderUserInfoList f143213b;

    /* renamed from: c */
    public String f143214c;

    /* renamed from: d */
    public String f143215d;

    /* renamed from: e */
    public long f143216e;

    /* renamed from: a */
    public final bxxk mo69763a() {
        return (bxxk) bkku.f124634i.mo74142c(7);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69764a(bxxc bxxc) {
        if (bxxc instanceof bkku) {
            bkku bkku = (bkku) bxxc;
            this.f143212a = stm.m36300b(bkku.f124636a);
            stm.m36300b(bkku.f124643h);
            stm.m36300b(bkku.f124637b);
            stm.m36300b(bkku.f124640e);
            this.f143213b = ProviderUserInfoList.m118903a(bkku.f124639d);
            this.f143214c = stm.m36300b(bkku.f124638c);
            this.f143215d = stm.m36300b(bkku.f124641f);
            this.f143216e = bkku.f124642g;
            return;
        }
        throw new IllegalArgumentException("The passed proto must be an instance of SetAccountInfoResponse.");
    }
}
