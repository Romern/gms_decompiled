package p000;

/* renamed from: bbkn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbkn implements bbko {

    /* renamed from: a */
    private static final bngx f102817a = bngx.m109359a("person.email", "person.name", "person.photo", "person.read_only_profile_info");

    /* renamed from: b */
    private static final btcb f102818b;

    /* renamed from: c */
    private final btdk f102819c;

    static {
        bxvd da = btcb.f148246c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btcb btcb = (btcb) da.f164949b;
        "profile-sync-client".getClass();
        btcb.f148248a = "profile-sync-client";
        "1".getClass();
        btcb.f148249b = "1";
        f102818b = (btcb) da.mo74062i();
    }

    public bbkn(btdk btdk) {
        this.f102819c = btdk;
    }

    /* renamed from: a */
    static final btcy m88131a() {
        btcz a = cfhg.f184087a.mo6606a().mo81237a();
        if (a.equals(btcz.f148362g)) {
            btef btef = (btef) bteh.f148502d.mo74144da();
            bxuv bxuv = (bxuv) bxuw.f164878b.mo74144da();
            bxuv.mo73905a(f102817a);
            if (btef.f164950c) {
                btef.mo74035c();
                btef.f164950c = false;
            }
            bxuw bxuw = (bxuw) bxuv.mo74062i();
            bxuw.getClass();
            ((bteh) btef.f164949b).f148504a = bxuw;
            btef.mo70751a(btei.ACCOUNT);
            btef.mo70751a(btei.DOMAIN_PROFILE);
            btef.mo70751a(btei.PROFILE);
            if (cfhg.f184087a.mo6606a().mo81242f()) {
                bxvd da = bteg.f148499b.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((bteg) da.f164949b).f148501a = 2;
                if (btef.f164950c) {
                    btef.mo74035c();
                    btef.f164950c = false;
                }
                bteg bteg = (bteg) da.mo74062i();
                bteg.getClass();
                ((bteh) btef.f164949b).f148506c = bteg;
            }
            btcy btcy = (btcy) btcz.f148362g.mo74144da();
            if (btcy.f164950c) {
                btcy.mo74035c();
                btcy.f164950c = false;
            }
            bteh bteh = (bteh) btef.mo74062i();
            bteh.getClass();
            ((btcz) btcy.f164949b).f148365b = bteh;
            if (!afsp.m53515c()) {
                return btcy;
            }
            bxvd da2 = btea.f148482d.mo74144da();
            btcb btcb = f102818b;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            btcb.getClass();
            ((btea) da2.f164949b).f148484a = btcb;
            if (btcy.f164950c) {
                btcy.mo74035c();
                btcy.f164950c = false;
            }
            btea btea = (btea) da2.mo74062i();
            btea.getClass();
            ((btcz) btcy.f164949b).f148367d = btea;
            return btcy;
        }
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        return (btcy) bxvd;
    }

    /* renamed from: a */
    public final bqgg mo56179a(int i) {
        chtv chtv;
        btcy a = m88131a();
        a.mo70740a("me");
        if (i != 1) {
            bxvd da = btea.f148482d.mo74144da();
            bxvd da2 = bzka.f170365c.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bzka bzka = (bzka) da2.f164949b;
            bzka.f170368b = 2;
            bzka.f170367a = 1 | bzka.f170367a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bzka bzka2 = (bzka) da2.mo74062i();
            bzka2.getClass();
            ((btea) da.f164949b).f148486c = bzka2;
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            btea btea = (btea) da.mo74062i();
            btcz btcz = btcz.f148362g;
            btea.getClass();
            ((btcz) a.f164949b).f148367d = btea;
        }
        btcz btcz2 = (btcz) a.mo74062i();
        btdk btdk = this.f102819c;
        chqp chqp = btdk.f190402a;
        chtv chtv2 = btdl.f148403a;
        if (chtv2 == null) {
            synchronized (btdl.class) {
                chtv = btdl.f148403a;
                if (chtv == null) {
                    chts a2 = chtv.m149565a();
                    a2.f189140c = chtu.UNARY;
                    a2.f189141d = chtv.m149567a("google.internal.people.v2.InternalPeopleService", "GetPeople");
                    a2.mo85659b();
                    a2.f189138a = ciie.m150370a(btcz.f148362g);
                    a2.f189139b = ciie.m150370a(btdb.f148370b);
                    chtv = a2.mo85658a();
                    btdl.f148403a = chtv;
                }
            }
            chtv2 = chtv;
        }
        return ciiq.m150392a(chqp.mo70053a(chtv2, btdk.f190403b), btcz2);
    }

    /* renamed from: a */
    public final bqgg mo56180a(btet btet) {
        bxvd bxvd;
        chtv chtv;
        if (!afsp.m53515c()) {
            bxvd = (bxvd) btet.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) btet);
            btea btea = btet.f148564d;
            if (btea == null) {
                btea = btea.f148482d;
            }
            bxvd bxvd2 = (bxvd) btea.mo74142c(5);
            bxvd2.mo73625a((GeneratedMessageLite) btea);
            btcb btcb = f102818b;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            btcb.getClass();
            ((btea) bxvd2.f164949b).f148484a = btcb;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            btea btea2 = (btea) bxvd2.mo74062i();
            btet btet2 = btet.f148559h;
            btea2.getClass();
            ((btet) bxvd.f164949b).f148564d = btea2;
        } else {
            bxvd = (bxvd) btet.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) btet);
        }
        btdk btdk = this.f102819c;
        btcy a = m88131a();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        btcz btcz = (btcz) a.mo74062i();
        btet btet3 = btet.f148559h;
        btcz.getClass();
        ((btet) bxvd.f164949b).f148566f = btcz;
        btet btet4 = (btet) bxvd.mo74062i();
        chqp chqp = btdk.f190402a;
        chtv chtv2 = btdl.f148405c;
        if (chtv2 == null) {
            synchronized (btdl.class) {
                chtv = btdl.f148405c;
                if (chtv == null) {
                    chts a2 = chtv.m149565a();
                    a2.f189140c = chtu.UNARY;
                    a2.f189141d = chtv.m149567a("google.internal.people.v2.InternalPeopleService", "UpdatePersonPhoto");
                    a2.mo85659b();
                    a2.f189138a = ciie.m150370a(btet.f148559h);
                    a2.f189139b = ciie.m150370a(bteu.f148568d);
                    chtv = a2.mo85658a();
                    btdl.f148405c = chtv;
                }
            }
            chtv2 = chtv;
        }
        return ciiq.m150392a(chqp.mo70053a(chtv2, btdk.f190403b), btet4);
    }

    /* renamed from: a */
    public final bqgg mo56181a(btev btev) {
        chtv chtv;
        btdk btdk = this.f102819c;
        bxvd bxvd = (bxvd) btev.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) btev);
        btcy a = m88131a();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        btcz btcz = (btcz) a.mo74062i();
        btev btev2 = btev.f148574h;
        btcz.getClass();
        ((btev) bxvd.f164949b).f148582g = btcz;
        btev btev3 = (btev) bxvd.mo74062i();
        chqp chqp = btdk.f190402a;
        chtv chtv2 = btdl.f148404b;
        if (chtv2 == null) {
            synchronized (btdl.class) {
                chtv = btdl.f148404b;
                if (chtv == null) {
                    chts a2 = chtv.m149565a();
                    a2.f189140c = chtu.UNARY;
                    a2.f189141d = chtv.m149567a("google.internal.people.v2.InternalPeopleService", "UpdatePerson");
                    a2.mo85659b();
                    a2.f189138a = ciie.m150370a(btev.f148574h);
                    a2.f189139b = ciie.m150370a(btew.f148584b);
                    chtv = a2.mo85658a();
                    btdl.f148404b = chtv;
                }
            }
            chtv2 = chtv;
        }
        return ciiq.m150392a(chqp.mo70053a(chtv2, btdk.f190403b), btev3);
    }
}
