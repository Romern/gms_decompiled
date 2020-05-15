package p000;

import com.google.android.gms.beacon.BleSettings;

/* renamed from: bigg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bigg extends bhpv {

    /* renamed from: b */
    final /* synthetic */ BleSettings f120504b;

    /* renamed from: c */
    final /* synthetic */ bigi f120505c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bigg(bigi bigi, rkb rkb, BleSettings bleSettings) {
        super(rkb);
        this.f120505c = bigi;
        this.f120504b = bleSettings;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final rke mo64140a() {
        bigi bigi = this.f120505c;
        nfl nfl = bigi.f120520m;
        rkb rkb = bigi.f120513f;
        nej nej = bigi.f120516i;
        return rkb.mo24795b(new nfi(rkb, ((nfn) rkb.mo24786a(nef.f35387c)).mo20564a(rkb, nej), nej, this.f120504b));
    }
}
