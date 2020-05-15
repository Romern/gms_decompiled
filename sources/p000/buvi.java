package p000;

import android.content.Context;

/* renamed from: buvi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buvi extends buuz {

    /* renamed from: g */
    private final buvp f155042g;

    public buvi(Context context, buzk buzk) {
        super(context, buzk);
        this.f155042g = (buvp) ahgz.m55754a(context, buvp.class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bvbw mo73119a(buzt buzt) {
        return this.f155042g.mo73279b(buzt);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo73121a(bvbw bvbw) {
        if (bvbw instanceof buvo) {
            this.f155042g.mo73281c((buvo) bvbw);
            return;
        }
        bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
        bnsl.mo68432a("buvi", "a", 45, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Unexpected connection to release from BleGattConnect: %s", bvbw);
    }
}
