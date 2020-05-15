package p000;

import android.content.Context;

/* renamed from: aisx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aisx {
    /* renamed from: a */
    public static String m57878a(Context context, String str) {
        C1223np npVar = new C1223np();
        npVar.put("APP_NAME", "Nearby");
        npVar.put("ID", str);
        bqgy c = bqgy.m112818c();
        new aisw(c, context, npVar).start();
        return (String) ahhf.m55778c("DroidGuard.getResult", c, cfnv.f184625a.mo6606a().mo81763aV());
    }
}
