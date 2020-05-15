package p000;

import android.accounts.Account;
import android.content.Context;

/* renamed from: ahuw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahuw extends buqn {

    /* renamed from: a */
    final /* synthetic */ buru f68123a;

    /* renamed from: b */
    final /* synthetic */ Account f68124b;

    /* renamed from: c */
    final /* synthetic */ ahza f68125c;

    /* renamed from: d */
    final /* synthetic */ String f68126d;

    /* renamed from: e */
    final /* synthetic */ Context f68127e;

    /* renamed from: f */
    final /* synthetic */ ahyz f68128f;

    /* renamed from: g */
    final /* synthetic */ bxvd f68129g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahuw(String str, bxvd bxvd, buru buru, Account account, ahza ahza, String str2, Context context, ahyz ahyz) {
        super(str);
        this.f68129g = bxvd;
        this.f68123a = buru;
        this.f68124b = account;
        this.f68125c = ahza;
        this.f68126d = str2;
        this.f68127e = context;
        this.f68128f = ahyz;
    }

    public final void run() {
        aiaa aiaa = (aiaa) this.f68129g.mo74062i();
        buru buru = this.f68123a;
        Account account = this.f68124b;
        burs e = burt.m120312e();
        e.mo73049a(this.f68125c.f68444b);
        e.mo73050a(this.f68126d);
        e.mo73051b(this.f68125c.f68446d);
        e.mo73048a(aiaa);
        buru.mo73058a(account, e.mo73047a(), (bqfp) null);
        ahst ahst = (ahst) ahgz.m55754a(this.f68127e, ahst.class);
        ahyz ahyz = this.f68128f;
        bxvd bxvd = (bxvd) ahyz.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) ahyz);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        ahyz ahyz2 = (ahyz) bxvd.f164949b;
        bxvu bxvu = ahyz.f68424m;
        aiaa.getClass();
        ahyz2.f68439n = aiaa;
        ahyz2.f68427a |= 1024;
        ahst.mo37036a((ahyz) bxvd.mo74062i());
    }
}
