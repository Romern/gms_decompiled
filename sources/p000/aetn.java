package p000;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.locationsharing.onboarding.TosUiDescription;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: aetn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aetn extends aesx {

    /* renamed from: b */
    private final boolean f63787b;

    public aetn(Context context, String str, boolean z) {
        super(context, str);
        this.f63787b = z;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        bzmu bzmu;
        String str;
        String str2;
        String str3 = ((aesx) this).f63753a;
        Context context = getContext();
        boolean z = this.f63787b;
        aeto aeto = new aeto(str3, context);
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
            bzmu = (bzmu) aeto.mo34565a((bzmt) da.mo74062i(), bzmu.f170657d, "fetchlocationsharingtos");
        } catch (Exception e) {
            bnsl bnsl = (bnsl) aeto.f63788a.mo68387b();
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
        String str4 = bznn2.f170729a;
        String a = TosUiDescription.m67035a(bznp.f170741c);
        String a2 = TosUiDescription.m67035a(bznp.f170743e);
        String str5 = bznp.f170744f;
        String str6 = bznp.f170745g;
        if ((bznp.f170739a & 8) != 0) {
            bznn bznn3 = bznp.f170746h;
            if (bznn3 == null) {
                bznn3 = bznn.f170727b;
            }
            str = bznn3.f170729a;
        } else {
            str = null;
        }
        return new TosUiDescription(str4, a, arrayList, a2, str5, str6, str, k);
    }
}
