package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.administration.AppIndexingErrorInfo;
import com.google.android.gms.search.administration.AppIndexingUserActionInfo;
import com.google.android.gms.search.administration.CorpusConfigParcelable;
import com.google.android.gms.search.administration.GetAppIndexingPackageDetailsCall$Request;
import com.google.android.gms.search.administration.GetAppIndexingPackageDetailsCall$Response;
import java.util.ArrayList;
import java.util.List;

/* renamed from: apmt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class apmt extends aplq {

    /* renamed from: a */
    private final abrv f84735a;

    public apmt(abrv abrv, GetAppIndexingPackageDetailsCall$Request getAppIndexingPackageDetailsCall$Request, abyy abyy) {
        super(bqbd.GET_APP_INDEXING_PACKAGE_DETAILS, 1, 4, abrv.f58066b, getAppIndexingPackageDetailsCall$Request, abyy);
        this.f84735a = abrv;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11132a() {
        CorpusConfigParcelable[] corpusConfigParcelableArr;
        abww a;
        String str;
        String str2 = ((GetAppIndexingPackageDetailsCall$Request) this.f84708n).f107362a;
        Status status = Status.f30107a;
        abyv d = this.f84735a.f58077m.mo32506d(str2);
        if (d != null) {
            ArrayList arrayList = new ArrayList();
            abzo a2 = this.f84735a.mo32298a();
            bnre i = a2.mo32524a(d).listIterator();
            while (i.hasNext()) {
                absr d2 = a2.mo32543d((acak) i.next());
                if (!(d2 == null || (a = abww.m48411a(d2.f58138c, str2, abxt.m48504a(this.f84735a.f58066b))) == null)) {
                    if (brib.m114026b(a.f58663c) || celx.m137224d()) {
                        if (!acaw.m48784a()) {
                            str = a.f58661a.f58531b;
                        } else {
                            int i2 = a.f58663c;
                            if (i2 != 2) {
                                String str3 = a.f58661a.f58531b;
                                String c = brib.m114027c(i2);
                                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 3 + String.valueOf(c).length());
                                sb.append(str3);
                                sb.append(" (");
                                sb.append(c);
                                sb.append(")");
                                str = sb.toString();
                            } else {
                                str = a.f58661a.f58531b;
                            }
                        }
                        arrayList.add(new CorpusConfigParcelable(d2.f58140e, d2.f58138c, str));
                    }
                }
            }
            corpusConfigParcelableArr = (CorpusConfigParcelable[]) arrayList.toArray(new CorpusConfigParcelable[arrayList.size()]);
        } else {
            corpusConfigParcelableArr = null;
        }
        long p = this.f84735a.f58071g.mo33045p(str2);
        abxp a3 = abxp.m48475a(this.f84735a.f58066b);
        List arrayList2 = new ArrayList();
        if (a3.mo32418a()) {
            arrayList2 = a3.mo32412a(str2, "errors", AppIndexingErrorInfo.CREATOR);
        }
        AppIndexingErrorInfo[] appIndexingErrorInfoArr = (AppIndexingErrorInfo[]) arrayList2.toArray(new AppIndexingErrorInfo[arrayList2.size()]);
        abxp a4 = abxp.m48475a(this.f84735a.f58066b);
        List arrayList3 = new ArrayList();
        if (a4.mo32419b()) {
            arrayList3 = a4.mo32412a(str2, "user_actions", AppIndexingUserActionInfo.CREATOR);
        }
        return new GetAppIndexingPackageDetailsCall$Response(status, corpusConfigParcelableArr, p, appIndexingErrorInfoArr, (AppIndexingUserActionInfo[]) arrayList3.toArray(new AppIndexingUserActionInfo[arrayList3.size()]), abvs.m48362a(this.f84735a.f58066b, abvs.m48359a(str2)), abvs.m48363b(this.f84735a.f58066b, abvs.m48359a(str2)));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo47405a(Status status) {
        return new GetAppIndexingPackageDetailsCall$Response(status, null, -1, null, null, false, false);
    }
}
