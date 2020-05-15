package p000;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: astv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class astv {

    /* renamed from: a */
    public static final srn f89717a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    private static assn m74817a(List list) {
        assn assn = new assn();
        if (cgxr.m147492e()) {
            bnsl bnsl = (bnsl) f89717a.mo68390d();
            bnsl.mo68432a("astv", "a", 232, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Adding garbage discretionary data to response.");
            assn.mo49435a(m74821a());
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            assn.mo49435a(((astu) it.next()).f89716b.mo49389d());
        }
        return assn;
    }

    /* renamed from: b */
    public static ateb m74823b(askf askf) {
        return atds.m75666a(askf).f90151a.mo49879b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final atbu mo49492c(askf askf) {
        return new atbu(askf);
    }

    /* renamed from: a */
    public static astt m74818a(asqw asqw, asqr asqr) {
        if (cgwn.m147252b()) {
            return new astm(asqw, Collections.singletonList(asqr), bnoj.f131912b);
        }
        return new astq(asqw, Collections.singletonList(asqr), null, null);
    }

    /* renamed from: a */
    private final astt m74819a(asqw asqw, CardInfo cardInfo, asqs asqs) {
        astc[] a = asqs.mo49386a();
        bnsl a2 = f89717a.mo26019b(aske.m74275a());
        a2.mo68432a("astv", "a", 189, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        a2.mo68420a("Create single card session for aids: %s", Arrays.toString(a));
        asqw.f89455s = true;
        asqw.f89456t = asqs.mo49387b();
        asqw.f89454r = asqs.mo49390e();
        assn assn = new assn();
        if (cgxr.m147492e()) {
            bnsl bnsl = (bnsl) f89717a.mo68390d();
            bnsl.mo68432a("astv", "a", 197, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Adding garbage discretionary data to response.");
            assn.mo49435a(m74821a());
        }
        assn.mo49435a(asqs.mo49389d());
        return new astq(asqw, Arrays.asList(assn, asqs), asqs, cardInfo);
    }

    /* renamed from: a */
    private static astt m74820a(asqw asqw, List list) {
        asqw.f89455s = !list.isEmpty();
        asqw.f89454r = 39;
        bngs bngs = new bngs();
        assn assn = new assn();
        if (cgxr.m147492e()) {
            bnsl bnsl = (bnsl) f89717a.mo68390d();
            bnsl.mo68432a("astv", "a", 232, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Adding garbage discretionary data to response.");
            assn.mo49435a(m74821a());
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            assn.mo49435a(((astu) it.next()).f89716b.mo49389d());
        }
        bngs.mo67668c(assn);
        bngs bngs2 = new bngs();
        bngs bngs3 = new bngs();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            astu astu = (astu) it2.next();
            bngs.mo67668c(astu.f89716b);
            bngs2.mo67668c(astu.f89715a);
            bngs3.mo67667b((Object[]) astu.f89716b.mo49386a());
        }
        bnsl a = f89717a.mo26019b(aske.m74275a());
        a.mo68432a("astv", "a", 223, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        a.mo68420a("Create multiple card session for aids: %s", bngs3.mo67664a());
        bngx a2 = bngs.mo67664a();
        bngx a3 = bngs2.mo67664a();
        bnha bnha = new bnha();
        int size = a3.size();
        for (int i = 0; i < size; i++) {
            CardInfo cardInfo = (CardInfo) a3.get(i);
            bnha.mo67695b(cardInfo.f108340a, cardInfo);
        }
        return new astm(asqw, a2, bnha.mo67618b());
    }

    /* renamed from: a */
    private static bngx m74821a() {
        return bngx.m109356a(asta.m74731a(97, asta.m74733a(79, astc.m74747a(asti.m74762a(cgxr.f187985a.mo6606a().mo84694f())).f89685k), asta.m74732a(135, (byte) 1), asta.m74733a(80, "TestAID".getBytes(StandardCharsets.US_ASCII))));
    }

    /* renamed from: a */
    public static void m74822a(asqw asqw, CardInfo cardInfo) {
        if (!cgwn.m147252b()) {
            asqw.f89457u = cardInfo;
        }
    }

    /* renamed from: a */
    public final asqw mo49488a(askf askf) {
        asqw asqw = new asqw();
        if (askf != null) {
            asqw.f89439c = askf.f89125c;
            asqw.f89440d = askf.f89123a;
            asqw.f89441e = askf.f89124b;
        }
        asqw.f89427D = bqcn.m112585b(cgxr.f187985a.mo6606a().mo84696h());
        return asqw;
    }

    /* renamed from: a */
    public final astt mo49489a(Context context) {
        try {
            askf b = askg.m74283b(context, null);
            if (b != null) {
                ateb b2 = m74823b(b);
                CardInfo cardInfo = b2.f90168a;
                if (cardInfo == null) {
                    bnsl a = f89717a.mo26019b(aske.m74275a());
                    a.mo68432a("astv", "a", 258, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    a.mo68405a("createWithoutChecks: no payment card");
                    return null;
                } else if (asiv.m74191b(b)) {
                    asqw a2 = mo49488a(b);
                    m74822a(a2, cardInfo);
                    a2.f89426C = b2.f90169b;
                    bnsl a3 = f89717a.mo26019b(aske.m74275a());
                    a3.mo68432a("astv", "a", 274, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    a3.mo68420a("createWithoutChecks: create applet for %s", cardInfo.f108343d);
                    try {
                        atbu c = mo49492c(b);
                        c.mo49790a();
                        asqs a4 = c.mo49788a(cardInfo, a2, false);
                        if (a4 != null) {
                            return mo49491a(a2, cardInfo, a4, b);
                        }
                        bnsl a5 = f89717a.mo26019b(aske.m74275a());
                        a5.mo68432a("astv", "a", 286, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        a5.mo68405a("createWithoutChecks: no credentials");
                        return null;
                    } catch (aths e) {
                        e = e;
                        bnsl a6 = f89717a.mo26019b(aske.m74275a());
                        a6.mo68437a(e);
                        a6.mo68432a("astv", "a", 281, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        a6.mo68405a("createWithoutChecks failed");
                        return null;
                    } catch (atcu e2) {
                        e = e2;
                        bnsl a62 = f89717a.mo26019b(aske.m74275a());
                        a62.mo68437a(e);
                        a62.mo68432a("astv", "a", 281, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        a62.mo68405a("createWithoutChecks failed");
                        return null;
                    }
                } else {
                    bnsl a7 = f89717a.mo26019b(aske.m74275a());
                    a7.mo68432a("astv", "a", 263, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    a7.mo68405a("createWithoutChecks: User's GSuites domain has payments turned off");
                    return null;
                }
            } else {
                bnsl a8 = f89717a.mo26019b(aske.m74275a());
                a8.mo68432a("astv", "a", 250, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                a8.mo68405a("createWithoutChecks: no account");
                return null;
            }
        } catch (SQLiteException | asks e3) {
            bnsl bnsl = (bnsl) f89717a.mo68387b();
            bnsl.mo68437a(e3);
            bnsl.mo68432a("astv", "a", 292, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to create session");
            return null;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: asiv.a(java.lang.String, askf, boolean):boolean
     arg types: [java.lang.String, askf, int]
     candidates:
      asiv.a(askf, java.lang.String, java.lang.String):void
      asiv.a(java.lang.String, boolean, askf):void
      asiv.a(java.lang.String, askf, boolean):boolean */
    /* renamed from: a */
    public final astt mo49490a(Context context, long j) {
        try {
            askf b = askg.m74283b(context, null);
            asqw a = mo49488a(b);
            astb astb = new astb(context, j);
            if (astb.f89627d) {
                bnsl a2 = f89717a.mo26019b(aske.m74275a());
                a2.mo68432a("astv", "a", 56, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                a2.mo68405a("createFastCheckedSession: screen is off.");
                a.f89454r = 10;
                return m74818a(a, new asuf(bqcn.m112585b(cgxr.m147493f())));
            } else if (b == null) {
                bnsl a3 = f89717a.mo26019b(aske.m74275a());
                a3.mo68432a("astv", "a", 63, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                a3.mo68405a("create: device setup required (no payment card)");
                a.f89454r = 22;
                return m74818a(a, new assn());
            } else if (!astb.f89629f) {
                bnsl a4 = f89717a.mo26019b(aske.m74275a());
                a4.mo68432a("astv", "a", 69, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                a4.mo68405a("createFastCheckedSession: device password missing.");
                a.f89454r = 22;
                return m74818a(a, new assn());
            } else if (astb.f89628e) {
                bnsl a5 = f89717a.mo26019b(aske.m74275a());
                a5.mo68432a("astv", "a", 75, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                a5.mo68405a("createFastCheckedSession: transactions too close.");
                a.f89454r = 17;
                return m74818a(a, new asuf(bqcn.m112585b(cgxr.m147493f())));
            } else if (!astb.f89630g) {
                ateb b2 = m74823b(b);
                CardInfo cardInfo = b2.f90168a;
                if (cardInfo == null) {
                    bnsl a6 = f89717a.mo26019b(aske.m74275a());
                    a6.mo68432a("astv", "a", 98, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    a6.mo68405a("create: device setup required (no payment card)");
                    a.f89454r = 23;
                    return m74818a(a, new assn());
                } else if (asiv.m74191b(b)) {
                    m74822a(a, cardInfo);
                    a.f89426C = b2.f90169b;
                    bnsl a7 = f89717a.mo26019b(aske.m74275a());
                    a7.mo68432a("astv", "a", 113, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    a7.mo68420a("Creating payment applet for card: %s", cardInfo.f108343d);
                    try {
                        atbu c = mo49492c(b);
                        c.mo49790a();
                        asqs a8 = c.mo49788a(cardInfo, a, true);
                        if (a8 != null) {
                            return mo49491a(a, cardInfo, a8, b);
                        }
                        bnsl a9 = f89717a.mo26019b(aske.m74275a());
                        a9.mo68432a("astv", "a", 138, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        a9.mo68405a("create: no payment applet (no credentials)");
                        a.f89454r = 1;
                        atbq.m75407a(context);
                        return m74818a(a, new assn());
                    } catch (aths e) {
                        if (!asiv.m74189a("SELECT fails_attestation from Wallets WHERE account_id = ? AND environment = ?;", b, false)) {
                            bnsl a10 = f89717a.mo26019b(aske.m74275a());
                            a10.mo68432a("astv", "a", 125, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            a10.mo68405a("create: no storage key");
                            a.f89454r = 7;
                            athr.m75911a(context);
                        } else {
                            bnsl a11 = f89717a.mo26019b(aske.m74275a());
                            a11.mo68432a("astv", "a", 122, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            a11.mo68405a("create: attestation failure");
                            a.f89454r = 9;
                        }
                        return m74818a(a, new assn());
                    } catch (atcu e2) {
                        bnsl a12 = f89717a.mo26019b(aske.m74275a());
                        a12.mo68432a("astv", "a", 131, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        a12.mo68405a("create: velocity check exception (device locked)");
                        a.f89454r = 21;
                        return m74818a(a, new asuf(bqcn.m112585b(cgxr.f187985a.mo6606a().mo84690b())));
                    }
                } else {
                    bnsl a13 = f89717a.mo26019b(aske.m74275a());
                    a13.mo68432a("astv", "a", (int) ErrorInfo.TYPE_SDU_FAILED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    a13.mo68405a("create: User's GSuites domain has payments turned off");
                    a.f89454r = 16;
                    return m74818a(a, new assn());
                }
            } else {
                bnsl a14 = f89717a.mo26019b(aske.m74275a());
                a14.mo68432a("astv", "a", 88, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                a14.mo68405a("createFastCheckedSession: payment cards blocked");
                a.f89454r = 37;
                return m74818a(a, new asuf(27266));
            }
        } catch (SQLiteException e3) {
            throw new asks(e3);
        }
    }

    /* renamed from: a */
    public final astt mo49491a(asqw asqw, CardInfo cardInfo, asqs asqs, askf askf) {
        asqs asqs2;
        asqw asqw2 = asqw;
        CardInfo cardInfo2 = cardInfo;
        asqs asqs3 = asqs;
        if (cgwn.m147252b()) {
            astu astu = new astu(cardInfo2, asqs3);
            bngs bngs = new bngs();
            atdz atdz = atds.m75666a(askf).f90151a;
            List a = atxr.m76517a(atdz.mo49886d(), atdw.f90162a, "SELECT PaymentCards.*, EXISTS(SELECT * FROM PaymentBundles WHERE PaymentBundles.bundle_id = PaymentCards.billing_id AND PaymentBundles.account_id = PaymentCards.account_id AND PaymentBundles.environment = PaymentCards.environment AND PaymentBundles.bundle_state NOT IN ('new', 'deleted')) AS has_bundle FROM PaymentCards WHERE account_id=? AND environment=? AND should_present", atdz.mo49885c());
            int size = a.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                CardInfo cardInfo3 = (CardInfo) a.get(i);
                try {
                    atbu c = mo49492c(askf);
                    c.mo49790a();
                    asqs2 = c.mo49788a(cardInfo3, new asqw(), false);
                } catch (atcu | aths e) {
                    asqs2 = null;
                }
                if (asqs2 != null) {
                    bngs.mo67668c(new astu(cardInfo3, asqs2));
                    if (cardInfo3.f108340a.equals(astu.f89715a.f108340a)) {
                        z = true;
                    }
                }
            }
            if (!z) {
                bngs.mo67668c(astu);
            }
            bngx a2 = bngs.mo67664a();
            asqw2.f89455s = !a2.isEmpty();
            asqw2.f89454r = 39;
            bngs bngs2 = new bngs();
            assn assn = new assn();
            if (cgxr.m147492e()) {
                bnsl bnsl = (bnsl) f89717a.mo68390d();
                bnsl.mo68432a("astv", "a", 232, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Adding garbage discretionary data to response.");
                assn.mo49435a(m74821a());
            }
            int size2 = a2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                assn.mo49435a(((astu) a2.get(i2)).f89716b.mo49389d());
            }
            bngs2.mo67668c(assn);
            bngs bngs3 = new bngs();
            bngs bngs4 = new bngs();
            int size3 = a2.size();
            for (int i3 = 0; i3 < size3; i3++) {
                astu astu2 = (astu) a2.get(i3);
                bngs2.mo67668c(astu2.f89716b);
                bngs3.mo67668c(astu2.f89715a);
                bngs4.mo67667b((Object[]) astu2.f89716b.mo49386a());
            }
            bnsl a3 = f89717a.mo26019b(aske.m74275a());
            a3.mo68432a("astv", "a", 223, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            a3.mo68420a("Create multiple card session for aids: %s", bngs4.mo67664a());
            bngx a4 = bngs2.mo67664a();
            bngx a5 = bngs3.mo67664a();
            bnha bnha = new bnha();
            int size4 = a5.size();
            for (int i4 = 0; i4 < size4; i4++) {
                CardInfo cardInfo4 = (CardInfo) a5.get(i4);
                bnha.mo67695b(cardInfo4.f108340a, cardInfo4);
            }
            return new astm(asqw2, a4, bnha.mo67618b());
        }
        astc[] a6 = asqs.mo49386a();
        bnsl a7 = f89717a.mo26019b(aske.m74275a());
        a7.mo68432a("astv", "a", 189, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        a7.mo68420a("Create single card session for aids: %s", Arrays.toString(a6));
        asqw2.f89455s = true;
        asqw2.f89456t = asqs.mo49387b();
        asqw2.f89454r = asqs.mo49390e();
        assn assn2 = new assn();
        if (cgxr.m147492e()) {
            bnsl bnsl2 = (bnsl) f89717a.mo68390d();
            bnsl2.mo68432a("astv", "a", 197, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Adding garbage discretionary data to response.");
            assn2.mo49435a(m74821a());
        }
        assn2.mo49435a(asqs.mo49389d());
        return new astq(asqw2, Arrays.asList(assn2, asqs3), asqs3, cardInfo2);
    }
}
