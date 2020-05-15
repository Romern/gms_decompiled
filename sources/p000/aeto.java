package p000;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.locationsharing.onboarding.TosUiDescription;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: aeto */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aeto extends aeub {

    /* renamed from: a */
    public static final srn f63788a = srn.m36127a(sgj.LOCATION_SHARING);

    public aeto(String str, Context context) {
        super(str, context);
    }

    /* renamed from: a */
    private final TosUiDescription m52548a(boolean z) {
        bzmu bzmu;
        String str;
        String str2;
        bxvd da = bzmt.f170651e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzmt bzmt = (bzmt) da.f164949b;
        int i = bzmt.f170653a | 1;
        bzmt.f170653a = i;
        bzmt.f170654b = z;
        bzmt.f170655c = 1;
        bzmt.f170653a = i | 2;
        Locale locale = Locale.getDefault();
        int i2 = Build.VERSION.SDK_INT;
        String languageTag = locale.toLanguageTag();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzmt bzmt2 = (bzmt) da.f164949b;
        languageTag.getClass();
        bzmt2.f170653a |= 4;
        bzmt2.f170656d = languageTag;
        try {
            bzmu = (bzmu) mo34565a((bzmt) da.mo74062i(), bzmu.f170657d, "fetchlocationsharingtos");
        } catch (Exception e) {
            bnsl bnsl = (bnsl) f63788a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("aeto", "a", 70, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error fetching Tos.");
            bzmu = null;
        }
        if (bzmu == null || (bzmu.f170659a & 1) == 0) {
            return null;
        }
        bznp bznp = bzmu.f170660b;
        if (bznp == null) {
            bznp = bznp.f170737i;
        }
        byte[] k = bzmu.f170661c.mo73780k();
        ArrayList arrayList = new ArrayList(bznp.f170742d.size());
        bxwc bxwc = bznp.f170742d;
        int size = bxwc.size();
        for (int i3 = 0; i3 < size; i3++) {
            bzno bzno = (bzno) bxwc.get(i3);
            if ((bzno.f170733a & 1) != 0) {
                bznn bznn = bzno.f170734b;
                if (bznn == null) {
                    bznn = bznn.f170727b;
                }
                str2 = bznn.f170729a;
            } else {
                str2 = null;
            }
            arrayList.add(new TosUiDescription.Section(str2, TosUiDescription.m67035a(bzno.f170735c), TosUiDescription.m67035a(bzno.f170736d)));
        }
        bznn bznn2 = bznp.f170740b;
        if (bznn2 == null) {
            bznn2 = bznn.f170727b;
        }
        String str3 = bznn2.f170729a;
        String a = TosUiDescription.m67035a(bznp.f170741c);
        String a2 = TosUiDescription.m67035a(bznp.f170743e);
        String str4 = bznp.f170744f;
        String str5 = bznp.f170745g;
        if ((bznp.f170739a & 8) != 0) {
            bznn bznn3 = bznp.f170746h;
            if (bznn3 == null) {
                bznn3 = bznn.f170727b;
            }
            str = bznn3.f170729a;
        } else {
            str = null;
        }
        return new TosUiDescription(str3, a, arrayList, a2, str4, str5, str, k);
    }
}
