package p000;

import android.content.Context;
import java.util.Locale;

/* renamed from: aeue */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeue extends aeub {

    /* renamed from: a */
    public static final srn f63820a = srn.m36127a(sgj.LOCATION_SHARING);

    public aeue(String str, Context context) {
        super(str, context);
    }

    /* renamed from: a */
    public final aeud mo34568a(boolean z) {
        bzmy bzmy;
        int a;
        int a2;
        boolean z2;
        boolean z3;
        bxvd da = bzmx.f170673d.mo74144da();
        bzmf a3 = aexp.m52655a(this.f63812c, this.f63811b);
        boolean z4 = false;
        if (a3.f170611a.size() > 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bzmx bzmx = (bzmx) da.f164949b;
            a3.getClass();
            bzmx.f170677c = a3;
            bzmx.f170675a |= 2;
        }
        if (ceyd.m138418b() && z) {
            bxvd da2 = bzmh.f170616c.mo74144da();
            bxvd da3 = byuj.f168295f.mo74144da();
            byug byug = byug.ACCOUNT_SETTINGS_MOBILE;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            byuj byuj = (byuj) da3.f164949b;
            byuj.f168299c = byug.f168292ja;
            int i = byuj.f168297a | 2;
            byuj.f168297a = i;
            byuj.f168298b = 2;
            byuj.f168297a = i | 1;
            byuj byuj2 = (byuj) da3.mo74062i();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bzmh bzmh = (bzmh) da2.f164949b;
            byuj2.getClass();
            bzmh.f170619b = byuj2;
            bzmh.f170618a |= 1;
            bzmh bzmh2 = (bzmh) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bzmx bzmx2 = (bzmx) da.f164949b;
            bzmh2.getClass();
            bzmx2.f170676b = bzmh2;
            bzmx2.f170675a |= 1;
        }
        try {
            bzmy = (bzmy) mo34565a((bzmx) da.mo74062i(), bzmy.f170678d, "readsharingstate");
        } catch (Exception e) {
            bnsl bnsl = (bnsl) f63820a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("aeue", "a", 60, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Exception running ReadSharingStateResponse: ");
            bqye.m113758a(e);
            bzmy = null;
        }
        if (bzmy == null || (a = bzmj.m125931a(bzmy.f170681b)) == 0 || a == 1 || (a2 = bzlp.m125910a(bzmy.f170680a)) == 0 || a2 == 1) {
            return null;
        }
        bzmm bzmm = bzmy.f170682c;
        if (bzmm == null) {
            bzmm = bzmm.f170622e;
        }
        boolean equals = bzmm.f170627d.toLowerCase(Locale.US).equals(Locale.KOREA.getCountry().toLowerCase(Locale.US));
        bzmm bzmm2 = bzmy.f170682c;
        if (bzmm2 == null) {
            bzmm2 = bzmm.f170622e;
        }
        int a4 = bzmj.m125931a(bzmm2.f170625b);
        if (a4 == 0) {
            z2 = false;
        } else {
            z2 = a4 == 2;
        }
        int a5 = bzlp.m125910a(bzmy.f170680a);
        if (a5 == 0) {
            a5 = 1;
        }
        if (a5 == 3) {
            z3 = true;
        } else {
            z3 = false;
        }
        bzmm bzmm3 = bzmy.f170682c;
        if (bzmm3 == null) {
            bzmm3 = bzmm.f170622e;
        }
        int a6 = bzml.m125933a(bzmm3.f170626c);
        if (a6 == 0) {
            a6 = 1;
        }
        if (a6 == 4) {
            z4 = true;
        }
        return new aeud(z2, z3, z4, equals);
    }
}
