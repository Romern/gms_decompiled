package p000;

import android.content.Context;
import com.google.ads.afma.C0149b;

/* renamed from: aagi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aagi {

    /* renamed from: a */
    private final qws f28063a;

    /* renamed from: b */
    private final Context f28064b;

    public aagi(Context context, qws qws) {
        this.f28063a = qws;
        this.f28064b = context;
    }

    /* renamed from: a */
    public static aagi m21209a(Context context) {
        return new aagi(context, qws.m33019a(context, "GLAS"));
    }

    /* renamed from: a */
    public final void mo16858a(int i, long j) {
        mo16859a(i, j, null);
    }

    /* renamed from: a */
    public final void mo16859a(int i, long j, Exception exc) {
        bxvd da = C0149b.f7489i.mo74144da();
        String packageName = this.f28064b.getPackageName();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        C0149b bVar = (C0149b) da.f164949b;
        packageName.getClass();
        int i2 = bVar.f7491a | 1;
        bVar.f7491a = i2;
        bVar.f7492b = packageName;
        bVar.f7491a = i2 | 2;
        bVar.f7493c = j;
        if (exc != null) {
            String name = exc.getClass().getName();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            C0149b bVar2 = (C0149b) da.f164949b;
            name.getClass();
            bVar2.f7491a |= 8;
            bVar2.f7495e = name;
        }
        qwo a = this.f28063a.mo24335a(((C0149b) da.mo74062i()).mo73642k());
        a.mo24328b(i);
        a.mo24327b();
    }
}
