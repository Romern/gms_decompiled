package p000;

import android.content.Context;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

/* renamed from: gkv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gkv {

    /* renamed from: a */
    public static final sek f18435a = ght.m13171a("Change", "AccountStateStore");

    /* renamed from: b */
    public static final imn f18436b = new gku();

    /* renamed from: c */
    public final Object f18437c = new Object();

    /* renamed from: d */
    public final Context f18438d;

    /* renamed from: e */
    public final String f18439e;

    public gkv(Context context, String str) {
        sdo.m34959a(context);
        this.f18438d = context;
        sdo.m34977c(str);
        this.f18439e = str;
    }

    /* renamed from: a */
    public final synchronized void mo12000a(Map map) {
        sdo.m34959a(map);
        synchronized (this.f18437c) {
            FileOutputStream openFileOutput = this.f18438d.openFileOutput(this.f18439e, 0);
            try {
                bxvd da = imb.f21338b.mo74144da();
                for (gks gks : map.values()) {
                    bxvd da2 = ilz.f21326d.mo74144da();
                    String str = gks.f18430a.name;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    ilz ilz = (ilz) da2.f164949b;
                    str.getClass();
                    ilz.f21328a |= 1;
                    ilz.f21329b = str;
                    String str2 = gks.f18430a.type;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    ilz ilz2 = (ilz) da2.f164949b;
                    str2.getClass();
                    ilz2.f21328a |= 2;
                    ilz2.f21330c = str2;
                    ilz ilz3 = (ilz) da2.mo74062i();
                    bxvd da3 = ima.f21332e.mo74144da();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    ima ima = (ima) da3.f164949b;
                    ilz3.getClass();
                    ima.f21335b = ilz3;
                    int i = ima.f21334a | 1;
                    ima.f21334a = i;
                    String str3 = gks.f18431b;
                    if (str3 != null) {
                        str3.getClass();
                        i |= 2;
                        ima.f21334a = i;
                        ima.f21336c = str3;
                    }
                    String str4 = gks.f18432c;
                    if (str4 != null) {
                        str4.getClass();
                        ima.f21334a = i | 4;
                        ima.f21337d = str4;
                    }
                    ima ima2 = (ima) da3.mo74062i();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    imb imb = (imb) da.f164949b;
                    ima2.getClass();
                    if (!imb.f21340a.mo73666a()) {
                        imb.f21340a = bxvk.m124021a(imb.f21340a);
                    }
                    imb.f21340a.add(ima2);
                }
                ((imb) da.mo74062i()).mo73638a(openFileOutput);
                openFileOutput.close();
            } catch (IOException e) {
                f18435a.mo25410a((Throwable) e);
            } catch (Throwable th) {
                try {
                    openFileOutput.close();
                } catch (IOException e2) {
                    f18435a.mo25410a((Throwable) e2);
                }
                throw th;
            }
        }
    }
}
