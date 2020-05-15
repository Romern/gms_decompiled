package p000;

import android.content.Context;

/* renamed from: aick */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aick extends buqn {

    /* renamed from: a */
    final /* synthetic */ String f68682a;

    /* renamed from: b */
    final /* synthetic */ ayqh f68683b;

    /* renamed from: c */
    final /* synthetic */ String f68684c;

    /* renamed from: d */
    final /* synthetic */ aics f68685d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aick(aics aics, String str, String str2, ayqh ayqh, String str3) {
        super(str);
        this.f68685d = aics;
        this.f68682a = str2;
        this.f68683b = ayqh;
        this.f68684c = str3;
    }

    public final void run() {
        String str;
        aics aics = this.f68685d;
        aiaa a = ahvd.m56705a(aics.f68705b, aics.f68706c, aics.f68707d, this.f68682a);
        if (a == null) {
            ((bnsl) ahsd.f67925a.mo68388c()).mo68420a("Can't find StoredDiscoveryItem for model:%s!", this.f68682a);
            ayqh ayqh = this.f68683b;
            String valueOf = String.valueOf(this.f68682a);
            ayqh.mo37372a(3, valueOf.length() == 0 ? new String("Can't find StoredDiscoveryItem for model:") : "Can't find StoredDiscoveryItem for model:".concat(valueOf));
            return;
        }
        Context context = this.f68685d.f68708e;
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        String str2 = this.f68684c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        aiaa aiaa = (aiaa) bxvd.f164949b;
        str2.getClass();
        aiaa.f68513a |= 4;
        aiaa.f68517e = str2;
        ahsu ahsu = new ahsu(context, (aiaa) bxvd.mo74062i());
        if ((a.f68513a & 8) != 0) {
            str = ahvd.m56709a(a);
        } else {
            str = null;
        }
        this.f68685d.mo37399a(ahsu, (byte[]) null, aics.m56977a(str), new ahvq(this.f68685d.f68708e, ahsu, this.f68683b));
    }
}
