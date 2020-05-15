package p000;

import android.content.Context;
import android.net.Uri;
import android.os.Process;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: aknz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aknz {

    /* renamed from: a */
    public final sgv f72334a;

    public aknz(Context context) {
        sgv sgv = cfqe.m142589b() ? new sgv(context, cfqe.f185447a.mo6606a().mo82514a(), cfqe.f185447a.mo6606a().mo82516c(), cfqe.f185447a.mo6606a().mo82517d(), cfqe.f185447a.mo6606a().mo82520g(), cfqe.f185447a.mo6606a().mo82515b(), "") : new sgv(context, cfqb.f185420a.mo6606a().mo82510w(), cfqb.f185420a.mo6606a().mo82509v(), cfqb.f185420a.mo6606a().mo82507t(), cfqb.f185420a.mo6606a().mo82511x(), cfqb.f185420a.mo6606a().mo82506s(), cfqb.f185420a.mo6606a().mo82508u());
        this.f72334a = sgv;
        sgv.f44447g = 6403;
    }

    /* renamed from: a */
    public static ClientContext m60112a(Context context, String str) {
        String str2;
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        ClientContext clientContext = new ClientContext(myUid, str, str, packageName, packageName);
        if (cfqe.m142589b()) {
            str2 = cfqe.f185447a.mo6606a().mo82522i();
        } else {
            str2 = "https://www.googleapis.com/auth/plus.me";
        }
        clientContext.mo17806d(str2);
        return clientContext;
    }

    /* renamed from: a */
    public static String m60113a(String str, String str2) {
        if (cfqe.m142589b()) {
            return cfqe.f185447a.mo6606a().mo82519f() ? Uri.parse(str2).buildUpon().appendQueryParameter("$trace", "true").toString() : str2;
        }
        return str;
    }

    /* renamed from: a */
    public final void mo39595a(Context context, String str, String str2, blfp blfp) {
        ClientContext a = m60112a(context, str);
        bxvd da = blfk.f126377d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blfk blfk = (blfk) da.f164949b;
        blfp.getClass();
        blfk.f126381c = blfp;
        blfk.f126379a |= 2;
        blfh a2 = akoh.m60131a(context, str2, byug.m125352a((int) cfqb.m142536d()));
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blfk blfk2 = (blfk) da.f164949b;
        a2.getClass();
        blfk2.f126380b = a2;
        blfk2.f126379a |= 1;
        if (((blfl) this.f72334a.mo25513a(a, 1, m60113a("/gmsgnotssetreadstates?alt=proto", cfqe.f185447a.mo6606a().mo82523j()), ((blfk) da.mo74062i()).serializeToBytes(), blfl.f126383b)).f126385a == null) {
            blfr blfr = blfr.f126407a;
        }
    }
}
