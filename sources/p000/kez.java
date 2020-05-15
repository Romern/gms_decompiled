package p000;

import android.accounts.Account;
import java.util.regex.Pattern;

/* renamed from: kez */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kez extends keo {

    /* renamed from: a */
    private static final Pattern f23962a = Pattern.compile(".*@.*");

    /* renamed from: b */
    private final adyd f23963b;

    public kez(adyd adyd) {
        this.f23963b = adyd;
    }

    /* renamed from: a */
    public final bqgg mo14429a(kej kej) {
        Account[] b = this.f23963b.mo33922b();
        if (b == null) {
            return bqga.m112775a(new kek(bnon.f131923a));
        }
        bnia j = bnic.m109500j();
        for (Account account : b) {
            String str = account.name;
            if (f23962a.matcher(str).matches()) {
                bxvd da = kcy.f23842c.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                kcy kcy = (kcy) da.f164949b;
                str.getClass();
                kcy.f23844a |= 1;
                kcy.f23845b = str;
                j.mo67629b(kct.m17647a((kcy) da.mo74062i(), kcs.m17644a("android_account", str)));
            }
        }
        return bqga.m112775a(new kek(j.mo67751a()));
    }
}
