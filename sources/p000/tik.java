package p000;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: tik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tik implements til {

    /* renamed from: a */
    private static final bnhe f46074a;

    /* renamed from: b */
    private static final bnhe f46075b;

    /* renamed from: c */
    private final qws f46076c;

    /* renamed from: d */
    private final tio f46077d;

    /* renamed from: e */
    private final bzkh f46078e;

    static {
        bnha bnha = new bnha();
        bnha.mo67695b(bzkh.BABEL, tio.HANGOUTS_CONTACT_SHEET_PAGE);
        bnha.mo67695b(bzkh.BIGTOP, tio.INBOX_CONTACT_SHEET_PAGE);
        bnha.mo67695b(bzkh.CALENDAR, tio.CALENDAR_CONTACT_SHEET_PAGE);
        bnha.mo67695b(bzkh.DOCS, tio.DOCS_CONTACT_SHEET_PAGE);
        bnha.mo67695b(bzkh.DRIVE, tio.DRIVE_CONTACT_SHEET_PAGE);
        bnha.mo67695b(bzkh.DYNAMITE, tio.DYNAMITE_CONTACT_SHEET_PAGE);
        bnha.mo67695b(bzkh.GMAIL, tio.GMAIL_CONTACT_SHEET_PAGE);
        bnha.mo67695b(bzkh.GOOGLE_QUICK_SEARCH_BOX, tio.SEARCH_CONTACT_SHEET_PAGE);
        bnha.mo67695b(bzkh.GOOGLE_VOICE, tio.VOICE_CONTACT_SHEET_PAGE);
        bnha.mo67695b(bzkh.GPLUS, tio.TAU_CONTACT_SHEET_PAGE);
        bnha.mo67695b(bzkh.MAPS, tio.MAPS_CONTACT_SHEET_PAGE);
        bnha.mo67695b(bzkh.TEST_APPLICATION, tio.TEST_CONTACT_SHEET_PAGE);
        bnha.mo67695b(bzkh.PLAY_STORE, tio.PLAY_STORE_CONTACT_SHEET_PAGE);
        f46074a = bnha.mo67618b();
        bnha bnha2 = new bnha();
        bnha2.mo67695b(byug.BABEL, bzkh.BABEL);
        bnha2.mo67695b(byug.BIGTOP, bzkh.BIGTOP);
        bnha2.mo67695b(byug.CALENDAR, bzkh.CALENDAR);
        bnha2.mo67695b(byug.DOCS, bzkh.DOCS);
        bnha2.mo67695b(byug.DRIVE, bzkh.DRIVE);
        bnha2.mo67695b(byug.DYNAMITE, bzkh.DYNAMITE);
        bnha2.mo67695b(byug.GMAIL, bzkh.GMAIL);
        bnha2.mo67695b(byug.GOOGLE_QUICK_SEARCH_BOX, bzkh.GOOGLE_QUICK_SEARCH_BOX);
        bnha2.mo67695b(byug.GOOGLE_VOICE, bzkh.GOOGLE_VOICE);
        bnha2.mo67695b(byug.GPLUS, bzkh.GPLUS);
        bnha2.mo67695b(byug.MAPS, bzkh.MAPS);
        bnha2.mo67695b(byug.TEST_APPLICATION, bzkh.TEST_APPLICATION);
        bnha2.mo67695b(byug.PLAY_STORE, bzkh.PLAY_STORE);
        f46075b = bnha2.mo67618b();
    }

    public tik(qws qws, byug byug) {
        this.f46076c = qws;
        bzkh bzkh = (bzkh) f46075b.getOrDefault(byug, bzkh.UNKNOWN_APPLICATION);
        this.f46078e = bzkh;
        this.f46077d = (tio) f46074a.getOrDefault(bzkh, tio.SMART_PROFILE_PAGE);
    }

    /* renamed from: a */
    public static final bxvd m37035a(tin tin, tio... tioArr) {
        bxvd da = bocj.f132559f.mo74144da();
        int intValue = tin.mo26560a().intValue();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bocj bocj = (bocj) da.f164949b;
        bocj.f132561a |= 1;
        bocj.f132562b = intValue;
        if (tin.mo26561b() != null) {
            int intValue2 = tin.mo26561b().intValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bocj bocj2 = (bocj) da.f164949b;
            bocj2.f132561a |= 2;
            bocj2.f132563c = intValue2;
        }
        int length = tioArr.length;
        if (length > 0) {
            ArrayList arrayList = new ArrayList();
            for (tio tio : tioArr) {
                arrayList.add(Integer.valueOf(tio.f46140ag));
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bocj bocj3 = (bocj) da.f164949b;
            if (!bocj3.f132564d.mo73666a()) {
                bocj3.f132564d = GeneratedMessageLite.m124019a(bocj3.f132564d);
            }
            bxsy.m123078a(arrayList, bocj3.f132564d);
        }
        return da;
    }

    /* renamed from: a */
    public final void mo26565a(byfo byfo) {
        bxvd da = bvzo.f158535d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvzo bvzo = (bvzo) da.f164949b;
        byfo.getClass();
        bvzo.f158538b = byfo;
        bvzo.f158537a |= 1;
        bxvd da2 = bvzn.f158530d.mo74144da();
        bxvd da3 = bvzq.f158541c.mo74144da();
        bzkh bzkh = this.f46078e;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bvzq bvzq = (bvzq) da3.f164949b;
        bvzq.f158544b = bzkh.f170435U;
        bvzq.f158543a |= 1;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bvzn bvzn = (bvzn) da2.f164949b;
        bvzq bvzq2 = (bvzq) da3.mo74062i();
        bvzq2.getClass();
        bvzn.f158533b = bvzq2;
        bvzn.f158532a |= 1;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bvzn bvzn2 = (bvzn) da2.f164949b;
        bvzn2.f158534c = 2;
        bvzn2.f158532a |= 2;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvzo bvzo2 = (bvzo) da.f164949b;
        bvzn bvzn3 = (bvzn) da2.mo74062i();
        bvzn3.getClass();
        bvzo2.f158539c = bvzn3;
        bvzo2.f158537a |= 2;
        this.f46076c.mo24334a(new tij((bvzo) da.mo74062i())).mo24327b();
    }

    /* renamed from: a */
    public final tio[] mo26566a(tio... tioArr) {
        int length = tioArr.length;
        if (length != 0) {
            tio[] tioArr2 = (tio[]) Arrays.copyOf(tioArr, length + 1);
            tioArr2[length] = this.f46077d;
            return tioArr2;
        }
        return new tio[]{this.f46077d};
    }
}
