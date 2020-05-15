package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.appdatasearch.CorpusStatus;
import com.google.android.gms.appdatasearch.DocumentResults;
import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.appdatasearch.GlobalSearchApplication;
import com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo;
import com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification;
import com.google.android.gms.appdatasearch.NativeApiInfo;
import com.google.android.gms.appdatasearch.PIMEUpdateResponse;
import com.google.android.gms.appdatasearch.PhraseAffinityResponse;
import com.google.android.gms.appdatasearch.PhraseAffinitySpecification;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.appdatasearch.RegisteredPackageInfo;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.android.gms.appdatasearch.StorageStats;
import com.google.android.gms.appdatasearch.SuggestSpecification;
import com.google.android.gms.appdatasearch.SuggestionResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.administration.BundleResponse;
import com.google.android.gms.search.administration.GetStorageStatsCall$PackageStats;
import com.google.android.gms.search.administration.GetStorageStatsCall$Request;
import com.google.android.gms.search.administration.GetStorageStatsCall$Response;
import com.google.android.gms.search.corpora.GetCorpusInfoCall$Request;
import com.google.android.gms.search.corpora.GetCorpusInfoCall$Response;
import com.google.android.gms.search.corpora.GetCorpusStatusCall$Request;
import com.google.android.gms.search.corpora.GetCorpusStatusCall$Response;
import com.google.android.gms.search.corpora.RequestIndexingCall$Request;
import com.google.android.gms.search.corpora.RequestIndexingCall$Response;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$CorpusInfo;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$GlobalSearchSource;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$Request;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$Response;
import com.google.android.gms.search.global.SetIncludeInGlobalSearchCall$Request;
import com.google.android.gms.search.queries.GetDocumentsCall$Request;
import com.google.android.gms.search.queries.GetDocumentsCall$Response;
import com.google.android.gms.search.queries.GetPhraseAffinityCall$Request;
import com.google.android.gms.search.queries.GetPhraseAffinityCall$Response;
import com.google.android.gms.search.queries.GlobalQueryCall$Request;
import com.google.android.gms.search.queries.GlobalQueryCall$Response;
import com.google.android.gms.search.queries.QueryCall$Request;
import com.google.android.gms.search.queries.QueryCall$Response;
import com.google.android.gms.search.queries.QuerySuggestCall$Request;
import com.google.android.gms.search.queries.QuerySuggestCall$Response;
import java.util.ArrayList;
import java.util.Map;

@Deprecated
/* renamed from: fqq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fqq extends fte implements sjr {

    /* renamed from: a */
    final abrv f17145a;

    /* renamed from: b */
    private final abyy f17146b;

    public fqq(abrv abrv, abyy abyy) {
        sdo.m34959a(abrv);
        this.f17145a = abrv;
        this.f17146b = abyy;
    }

    /* renamed from: a */
    private final void m12182a(String str, GlobalSearchApplicationInfo globalSearchApplicationInfo) {
        boolean z;
        abyy a = this.f17145a.f58077m.mo32499a(str);
        acpl acpl = this.f17145a.f58067c;
        fqn fqn = new fqn(this, bqbd.SET_GLOBAL_SEARCH_INFO, this.f17146b.f58780f, a, globalSearchApplicationInfo);
        acpl.mo32995d(fqn);
        Exception exc = (Exception) fqn.mo32295h();
        if (exc instanceof acaq) {
            throw new IllegalArgumentException(exc.getMessage(), exc);
        } else if (!(exc instanceof SecurityException)) {
            if (exc == null) {
                z = true;
            } else {
                z = false;
            }
            sdo.m34970a(z);
        } else {
            throw ((SecurityException) exc);
        }
    }

    /* renamed from: b */
    public final CorpusStatus mo11147b(String str, String str2) {
        GetCorpusStatusCall$Request getCorpusStatusCall$Request = new GetCorpusStatusCall$Request();
        getCorpusStatusCall$Request.f107396a = str;
        getCorpusStatusCall$Request.f107397b = str2;
        apop apop = new apop(this.f17145a, getCorpusStatusCall$Request, this.f17146b);
        this.f17145a.f58067c.mo32995d(apop);
        return ((GetCorpusStatusCall$Response) apop.mo32295h()).f107399b;
    }

    /* renamed from: c */
    public final RegisterCorpusInfo mo11152c(String str, String str2) {
        GetCorpusInfoCall$Request getCorpusInfoCall$Request = new GetCorpusInfoCall$Request();
        getCorpusInfoCall$Request.f107392a = str;
        getCorpusInfoCall$Request.f107393b = str2;
        abrv abrv = this.f17145a;
        acpl acpl = abrv.f58067c;
        apom apom = new apom(abrv, getCorpusInfoCall$Request, this.f17146b);
        acpl.mo32995d(apom);
        return ((GetCorpusInfoCall$Response) apom.mo32295h()).f107395b;
    }

    /* renamed from: d */
    public final boolean mo11155d() {
        apmj apmj = new apmj(this.f17145a, this.f17146b);
        this.f17145a.f58067c.mo32995d(apmj);
        return ((Status) apmj.mo32295h()).mo17710c();
    }

    /* renamed from: e */
    public final NativeApiInfo mo11156e() {
        return new NativeApiInfo(null, null, null);
    }

    /* renamed from: f */
    public final void mo11157f() {
        if (this.f17146b.f58776b) {
            this.f17145a.mo32324g();
            return;
        }
        throw new SecurityException("Access denied");
    }

    /* renamed from: g */
    public final int[] mo11158g() {
        return new int[0];
    }

    /* renamed from: h */
    public final int[] mo11159h() {
        return new int[0];
    }

    /* renamed from: i */
    public final String[] mo11160i() {
        return new String[0];
    }

    /* renamed from: j */
    public final PIMEUpdateResponse mo11161j() {
        return new PIMEUpdateResponse("API disabled", null, null);
    }

    /* renamed from: k */
    public final boolean mo11162k() {
        return false;
    }

    /* renamed from: l */
    public final boolean mo11163l() {
        return true;
    }

    /* renamed from: m */
    public final boolean mo11164m() {
        return false;
    }

    /* renamed from: b */
    public final void mo11148b(String[] strArr) {
        if (this.f17146b.f58776b) {
            this.f17145a.f58067c.mo32995d(new fqp(this, bqbd.UNBLOCK_PACKAGES, this.f17146b.f58780f, strArr));
            return;
        }
        throw new SecurityException("Access denied");
    }

    /* renamed from: c */
    public final StorageStats mo11153c() {
        apna apna = new apna(this.f17145a, new GetStorageStatsCall$Request(), this.f17146b);
        this.f17145a.f58067c.mo32995d(apna);
        GetStorageStatsCall$Response getStorageStatsCall$Response = (GetStorageStatsCall$Response) apna.mo32295h();
        RegisteredPackageInfo[] registeredPackageInfoArr = new RegisteredPackageInfo[getStorageStatsCall$Response.f107378b.length];
        int i = 0;
        while (true) {
            GetStorageStatsCall$PackageStats[] getStorageStatsCall$PackageStatsArr = getStorageStatsCall$Response.f107378b;
            if (i >= getStorageStatsCall$PackageStatsArr.length) {
                return new StorageStats(registeredPackageInfoArr, getStorageStatsCall$Response.f107379c, getStorageStatsCall$Response.f107380d, getStorageStatsCall$Response.f107381e);
            }
            GetStorageStatsCall$PackageStats getStorageStatsCall$PackageStats = getStorageStatsCall$PackageStatsArr[i];
            registeredPackageInfoArr[i] = new RegisteredPackageInfo(getStorageStatsCall$PackageStats.f107373a, getStorageStatsCall$PackageStats.f107374b, getStorageStatsCall$PackageStats.f107375c, getStorageStatsCall$PackageStats.f107376d);
            i++;
        }
    }

    /* renamed from: b */
    public final boolean mo11149b(String str, RegisterCorpusInfo registerCorpusInfo) {
        String a = absd.m48169a(registerCorpusInfo);
        if (a == null) {
            abyy a2 = this.f17145a.f58077m.mo32499a(str);
            abzr a3 = abzr.m48712a(registerCorpusInfo, System.currentTimeMillis());
            acpl acpl = this.f17145a.f58067c;
            fql fql = new fql(this, bqbd.REGISTER_CORPUS_INFO, this.f17146b.f58780f, a2, a3);
            acpl.mo32995d(fql);
            Exception exc = (Exception) fql.mo32295h();
            boolean z = false;
            if (exc != null) {
                absg.m48189a(exc, "Client exception");
                if (exc instanceof acaq) {
                    throw new IllegalArgumentException(exc.getMessage(), exc);
                } else if (exc instanceof SecurityException) {
                    throw ((SecurityException) exc);
                } else if (exc instanceof acat) {
                    absg.m48189a(exc, "Internal error");
                    return false;
                }
            }
            if (exc == null) {
                z = true;
            }
            sdo.m34970a(z);
            return true;
        }
        throw new IllegalArgumentException(a);
    }

    /* renamed from: c */
    public final void mo11154c(String str) {
        sdo.m34959a((Object) str);
        m12182a(str, (GlobalSearchApplicationInfo) null);
    }

    /* renamed from: a */
    public final Bundle mo11133a(Bundle bundle) {
        apmq apmq = new apmq(this.f17145a, bundle, this.f17146b);
        this.f17145a.f58067c.mo32995d(apmq);
        return ((BundleResponse) apmq.mo32295h()).f107356b;
    }

    /* renamed from: a */
    public final Bundle mo11134a(String str, String str2) {
        String str3 = null;
        if (str2 != null) {
            try {
                absd.m48177b(str2);
            } catch (IllegalArgumentException e) {
                str3 = e.getMessage();
            }
        }
        if (str3 == null) {
            abyv a = this.f17145a.f58077m.mo32495a(this.f17145a.f58077m.mo32499a(str));
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            acpl acpl = this.f17145a.f58067c;
            fqm fqm = new fqm(this, bqbd.UNREGISTER_CORPUS, this.f17146b.f58780f, str2, a, arrayList2, arrayList);
            acpl.mo32995d(fqm);
            fqm.mo32295h();
            Bundle bundle = new Bundle();
            bundle.putStringArray("content_provider_uris", (String[]) arrayList.toArray(new String[arrayList.size()]));
            boolean[] zArr = new boolean[arrayList2.size()];
            for (int i = 0; i < arrayList2.size(); i++) {
                zArr[i] = ((Boolean) arrayList2.get(i)).booleanValue();
            }
            bundle.putBooleanArray("success", zArr);
            return bundle;
        }
        throw new IllegalArgumentException(str3);
    }

    /* renamed from: b */
    public final GlobalSearchApplication[] mo11150b() {
        appy appy = new appy(this.f17145a, new GetGlobalSearchSourcesCall$Request(), this.f17146b);
        this.f17145a.f58067c.mo32995d(appy);
        GetGlobalSearchSourcesCall$Response getGlobalSearchSourcesCall$Response = (GetGlobalSearchSourcesCall$Response) appy.mo32295h();
        int length = getGlobalSearchSourcesCall$Response.f107428b.length;
        GlobalSearchApplication[] globalSearchApplicationArr = new GlobalSearchApplication[length];
        for (int i = 0; i < length; i++) {
            GetGlobalSearchSourcesCall$GlobalSearchSource getGlobalSearchSourcesCall$GlobalSearchSource = getGlobalSearchSourcesCall$Response.f107428b[i];
            GlobalSearchApplicationInfo globalSearchApplicationInfo = new GlobalSearchApplicationInfo(getGlobalSearchSourcesCall$GlobalSearchSource.f107416a, getGlobalSearchSourcesCall$GlobalSearchSource.f107417b, getGlobalSearchSourcesCall$GlobalSearchSource.f107418c, getGlobalSearchSourcesCall$GlobalSearchSource.f107419d, getGlobalSearchSourcesCall$GlobalSearchSource.f107420e, getGlobalSearchSourcesCall$GlobalSearchSource.f107421f, getGlobalSearchSourcesCall$GlobalSearchSource.f107422g, getGlobalSearchSourcesCall$GlobalSearchSource.f107423h);
            frh frh = new frh();
            frh.f17153a = globalSearchApplicationInfo;
            GetGlobalSearchSourcesCall$CorpusInfo[] getGlobalSearchSourcesCall$CorpusInfoArr = getGlobalSearchSourcesCall$GlobalSearchSource.f107424i;
            for (GetGlobalSearchSourcesCall$CorpusInfo getGlobalSearchSourcesCall$CorpusInfo : getGlobalSearchSourcesCall$CorpusInfoArr) {
                String str = getGlobalSearchSourcesCall$CorpusInfo.f107412a;
                Feature[] featureArr = getGlobalSearchSourcesCall$CorpusInfo.f107413b;
                Map map = frh.f17154b;
                sdo.m34959a((Object) str);
                map.put(str, (Feature[]) sdo.m34959a(featureArr));
            }
            globalSearchApplicationArr[i] = new GlobalSearchApplication(frh.f17153a, getGlobalSearchSourcesCall$GlobalSearchSource.f107425j, frh.f17154b);
        }
        return globalSearchApplicationArr;
    }

    /* renamed from: a */
    public final DocumentResults mo11135a(String[] strArr, String str, String str2, QuerySpecification querySpecification) {
        GetDocumentsCall$Request getDocumentsCall$Request = new GetDocumentsCall$Request();
        getDocumentsCall$Request.f107457c = strArr;
        getDocumentsCall$Request.f107455a = str;
        getDocumentsCall$Request.f107456b = str2;
        getDocumentsCall$Request.f107458d = querySpecification;
        aprv aprv = new aprv(this.f17145a, getDocumentsCall$Request, this.f17146b);
        this.f17145a.f58067c.mo32995d(aprv);
        return ((GetDocumentsCall$Response) aprv.mo32295h()).f107461b;
    }

    /* renamed from: a */
    public final PhraseAffinityResponse mo11136a(String[] strArr, PhraseAffinitySpecification phraseAffinitySpecification) {
        GetPhraseAffinityCall$Request getPhraseAffinityCall$Request = new GetPhraseAffinityCall$Request();
        getPhraseAffinityCall$Request.f107463a = strArr;
        getPhraseAffinityCall$Request.f107464b = phraseAffinitySpecification.mo7208a();
        apry apry = new apry(this.f17145a, getPhraseAffinityCall$Request, this.f17146b);
        this.f17145a.f58067c.mo32995d(apry);
        return ((GetPhraseAffinityCall$Response) apry.mo32295h()).f107467b;
    }

    /* renamed from: a */
    public final SearchResults mo11137a(String str, int i, int i2, GlobalSearchQuerySpecification globalSearchQuerySpecification) {
        GlobalQueryCall$Request globalQueryCall$Request = new GlobalQueryCall$Request();
        globalQueryCall$Request.f107469a = str;
        globalQueryCall$Request.f107470b = i;
        globalQueryCall$Request.f107471c = i2;
        globalQueryCall$Request.f107472d = globalSearchQuerySpecification;
        apsc apsc = new apsc(this.f17145a, globalQueryCall$Request, this.f17146b);
        this.f17145a.f58067c.mo32995d(apsc);
        return ((GlobalQueryCall$Response) apsc.mo32295h()).f107475b;
    }

    /* renamed from: a */
    public final SearchResults mo11138a(String str, String str2, String[] strArr, int i, int i2, QuerySpecification querySpecification) {
        QueryCall$Request queryCall$Request = new QueryCall$Request();
        queryCall$Request.f107477a = str;
        queryCall$Request.f107478b = str2;
        queryCall$Request.f107479c = strArr;
        queryCall$Request.f107480d = i;
        queryCall$Request.f107481e = i2;
        queryCall$Request.f107482f = querySpecification;
        apsl apsl = new apsl(this.f17145a, queryCall$Request, this.f17146b);
        this.f17145a.f58067c.mo32995d(apsl);
        return ((QueryCall$Response) apsl.mo32295h()).f107485b;
    }

    /* renamed from: a */
    public final SuggestionResults mo11139a(String str, String str2, String[] strArr, int i, SuggestSpecification suggestSpecification) {
        QuerySuggestCall$Request querySuggestCall$Request = new QuerySuggestCall$Request();
        querySuggestCall$Request.f107487a = str;
        querySuggestCall$Request.f107488b = str2;
        querySuggestCall$Request.f107489c = strArr;
        querySuggestCall$Request.f107490d = i;
        querySuggestCall$Request.f107491e = suggestSpecification;
        apsj apsj = new apsj(this.f17145a, querySuggestCall$Request, this.f17146b);
        this.f17145a.f58067c.mo32995d(apsj);
        return ((QuerySuggestCall$Response) apsj.mo32295h()).f107494b;
    }

    /* renamed from: b */
    public final String[] mo11151b(String str) {
        return this.f17145a.mo32298a().mo32533a(this.f17145a.f58077m.mo32499a(str), -1);
    }

    /* renamed from: a */
    public final void mo11140a(GlobalSearchApplicationInfo globalSearchApplicationInfo) {
        sdo.m34959a(globalSearchApplicationInfo);
        m12182a(globalSearchApplicationInfo.f9562a, globalSearchApplicationInfo);
    }

    @Deprecated
    /* renamed from: a */
    public final void mo11141a(String str, RegisterCorpusInfo registerCorpusInfo) {
        mo11149b(str, registerCorpusInfo);
    }

    /* renamed from: a */
    public final void mo11142a(String str, boolean z) {
        apqj apqj = new apqj(this.f17145a, new SetIncludeInGlobalSearchCall$Request(str, null, z), this.f17146b);
        this.f17145a.f58067c.mo32995d(apqj);
        apqj.mo32295h();
    }

    /* renamed from: a */
    public final void mo11143a(String[] strArr) {
        if (this.f17146b.f58776b) {
            this.f17145a.f58067c.mo32995d(new fqo(this, bqbd.BLOCK_PACKAGES, this.f17146b.f58780f, strArr));
            return;
        }
        throw new SecurityException("Access denied");
    }

    /* renamed from: a */
    public final boolean mo11144a(String str, String str2, long j) {
        RequestIndexingCall$Request requestIndexingCall$Request = new RequestIndexingCall$Request();
        requestIndexingCall$Request.f107405a = str;
        requestIndexingCall$Request.f107406b = str2;
        requestIndexingCall$Request.f107407c = j;
        abrv abrv = this.f17145a;
        Context context = abrv.f58066b;
        acpl acpl = abrv.f58067c;
        abzo a = abrv.mo32298a();
        abrv abrv2 = this.f17145a;
        apow apow = new apow(context, acpl, a, abrv2.f58079o, abrv2.f58081q, requestIndexingCall$Request, this.f17146b);
        this.f17145a.f58067c.mo32995d(apow);
        return ((RequestIndexingCall$Response) apow.mo32295h()).f107408a.mo17710c();
    }

    /* renamed from: a */
    public final GlobalSearchApplicationInfo[] mo11145a() {
        GlobalSearchApplication[] b = mo11150b();
        GlobalSearchApplicationInfo[] globalSearchApplicationInfoArr = new GlobalSearchApplicationInfo[b.length];
        for (int i = 0; i < b.length; i++) {
            globalSearchApplicationInfoArr[i] = b[i].f9559a;
        }
        return globalSearchApplicationInfoArr;
    }

    /* renamed from: a */
    public final String[] mo11146a(String str) {
        return this.f17145a.mo32298a().mo32533a(this.f17145a.f58077m.mo32499a(str), 1);
    }
}
