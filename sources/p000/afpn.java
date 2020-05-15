package p000;

import android.net.Uri;
import com.google.android.gms.mdd.MddFile;
import java.util.List;

/* renamed from: afpn */
final /* synthetic */ class afpn implements bqeh {

    /* renamed from: a */
    private final afpq f64513a;

    /* renamed from: b */
    private final List f64514b;

    /* renamed from: c */
    private final bauy f64515c;

    /* renamed from: d */
    private final bxvd f64516d;

    public afpn(afpq afpq, List list, bauy bauy, bxvd bxvd) {
        this.f64513a = afpq;
        this.f64514b = list;
        this.f64515c = bauy;
        this.f64516d = bxvd;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        afpq afpq = this.f64513a;
        List list = this.f64514b;
        bauy bauy = this.f64515c;
        bxvd bxvd = this.f64516d;
        Uri uri = (Uri) obj;
        if (uri == null) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpxn bpxn = (bpxn) bxvd.f164949b;
            bpxn bpxn2 = bpxn.f139738g;
            bpxn.f139743d = bpzz.m112457a(9);
            bpxn.f139740a |= 8;
            String str = afpq.f64460c.f79958a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 41);
            sb.append("GetFileGroupOp : ");
            sb.append(str);
            sb.append(" Failed to get file uris");
            throw new aaaj(13, sb.toString());
        }
        list.add(new MddFile(bauy.f101850b, uri.toString()));
        return bqga.m112775a((Object) null);
    }
}
