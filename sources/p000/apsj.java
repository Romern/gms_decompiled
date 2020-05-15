package p000;

import android.text.TextUtils;
import com.google.android.gms.appdatasearch.SuggestionResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import com.google.android.gms.search.queries.QuerySuggestCall$Request;
import com.google.android.gms.search.queries.QuerySuggestCall$Response;
import java.util.Set;

/* renamed from: apsj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class apsj extends aplq {

    /* renamed from: a */
    public final abrv f84817a;

    /* renamed from: b */
    private final acxl f84818b;

    /* renamed from: c */
    private final boolean f84819c;

    /* renamed from: d */
    private final boolean f84820d;

    public apsj(abrv abrv, QuerySuggestCall$Request querySuggestCall$Request, abyy abyy) {
        super(bqbd.QUERY_SUGGEST, 1, 1, abrv.f58066b, querySuggestCall$Request, abyy);
        this.f84817a = abrv;
        acxl acxl = new acxl(bpzh.SUGGEST, acky.m49364b(-1));
        this.f84818b = acxl;
        acxl.mo33202a();
        this.f84819c = abrv.f58083s.mo32454b();
        this.f84820d = querySuggestCall$Request.f107492f != null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01f7  */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11132a() {
        String str;
        abun abun;
        QuerySuggestCall$Response querySuggestCall$Response = new QuerySuggestCall$Response();
        QuerySuggestCall$Request querySuggestCall$Request = (QuerySuggestCall$Request) this.f84708n;
        String str2 = querySuggestCall$Request.f107487a;
        String str3 = querySuggestCall$Request.f107488b;
        String[] strArr = querySuggestCall$Request.f107489c;
        int i = querySuggestCall$Request.f107490d;
        try {
            absd.m48180c("Query", str2, 1000);
            if (str3 != null || strArr == null) {
                if (strArr != null) {
                    for (String str4 : strArr) {
                        absd.m48174a("Corpus name", str4, 2048);
                    }
                }
                if (i > 0) {
                    if (i <= 100) {
                        str = null;
                        if (str == null) {
                            this.f84818b.mo33207b();
                            abzo a = this.f84817a.mo32298a();
                            this.f84818b.mo33208c();
                            synchronized (a.mo32525a()) {
                                this.f84818b.mo33209d();
                                abyy abyy = this.f84709o;
                                QuerySuggestCall$Request querySuggestCall$Request2 = (QuerySuggestCall$Request) this.f84708n;
                                Set<acak> a2 = a.mo32528a(abyy, querySuggestCall$Request2.f107489c, true, querySuggestCall$Request2.f107488b);
                                int[] iArr = new int[a2.size()];
                                int i2 = 0;
                                for (acak acak : a2) {
                                    absr d = a.mo32543d(acak);
                                    if (d != null) {
                                        iArr[i2] = d.f58137b;
                                        i2++;
                                    }
                                }
                                this.f84818b.mo33210e();
                                NativeIndex nativeIndex = this.f84817a.f58078n;
                                QuerySuggestCall$Request querySuggestCall$Request3 = (QuerySuggestCall$Request) this.f84708n;
                                byte[] nativeSuggest = NativeIndex.nativeSuggest(nativeIndex.f79071b, NativeIndex.m66681a(querySuggestCall$Request3.f107487a), iArr, querySuggestCall$Request3.f107490d);
                                if (nativeSuggest != null) {
                                    try {
                                        abun = (abun) bxvk.m124014a(abun.f58432c, nativeSuggest);
                                    } catch (bxwf e) {
                                        absg.m48189a(e, "Failed parsing suggestions");
                                        abun = abun.f58432c;
                                    }
                                } else {
                                    abun = abun.f58432c;
                                }
                                this.f84818b.mo33211f();
                                acxl acxl = this.f84818b;
                                abtn abtn = abun.f58435b;
                                if (abtn == null) {
                                    abtn = abtn.f58271c;
                                }
                                acxl.mo33203a(abtn);
                                int size = abun.f58434a.size();
                                String[] strArr2 = new String[size];
                                String[] strArr3 = new String[abun.f58434a.size()];
                                for (int i3 = 0; i3 < abun.f58434a.size(); i3++) {
                                    strArr2[i3] = ((abum) abun.f58434a.get(i3)).f58429a;
                                    String str5 = ((abum) abun.f58434a.get(i3)).f58430b;
                                    if (TextUtils.isEmpty(str5)) {
                                        str5 = null;
                                    }
                                    strArr3[i3] = str5;
                                }
                                SuggestionResults suggestionResults = new SuggestionResults(null, strArr2, strArr3);
                                QuerySuggestCall$Request querySuggestCall$Request4 = (QuerySuggestCall$Request) this.f84708n;
                                acxl acxl2 = this.f84818b;
                                acxl2.f61023b = querySuggestCall$Request4.f107490d;
                                acxl2.f61024c = size;
                                acxl2.f61025d = 0;
                                String[] strArr4 = querySuggestCall$Request4.f107489c;
                                acxl2.f61026e = strArr4 != null ? strArr4.length : -1;
                                acxl2.f61027f = false;
                                acxl2.f61028g = false;
                                acxl2.f61029h = null;
                                acxl2.f61030i = 3;
                                if (this.f84820d && this.f84819c) {
                                    String str6 = querySuggestCall$Request4.f107487a;
                                    abyy abyy2 = this.f84709o;
                                    acxl2.mo33205a(str6, abyy2.f58780f, abyy2.f58781g, querySuggestCall$Request4.f107492f);
                                }
                                if (this.f84817a.f58090z.mo33199a()) {
                                    acxk acxk = this.f84817a.f58090z;
                                    bxvd da = abts.f58301d.mo74144da();
                                    bxtx a3 = bxtx.m123261a(acxk.m49938a((QuerySuggestCall$Request) this.f84708n));
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    abts abts = (abts) da.f164949b;
                                    a3.getClass();
                                    abts.f58303a = 1 | abts.f58303a;
                                    abts.f58304b = a3;
                                    bxtx a4 = bxtx.m123261a(acxk.m49938a(suggestionResults));
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    abts abts2 = (abts) da.f164949b;
                                    a4.getClass();
                                    abts2.f58303a |= 2;
                                    abts2.f58305c = a4;
                                    bxvd da2 = abtt.f58306c.mo74144da();
                                    abts abts3 = (abts) da.mo74062i();
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    abtt abtt = (abtt) da2.f164949b;
                                    abts3.getClass();
                                    abtt.f58309b = abts3;
                                    abtt.f58308a = 3;
                                    acxk.mo33198a((abtt) da2.mo74062i());
                                }
                                querySuggestCall$Response.f107493a = Status.f30107a;
                                querySuggestCall$Response.f107494b = suggestionResults;
                                querySuggestCall$Response.f107495c = ((QuerySuggestCall$Request) this.f84708n).f107492f;
                            }
                        } else {
                            querySuggestCall$Response.f107493a = new Status(8, str, null);
                            querySuggestCall$Response.f107494b = new SuggestionResults(str, null, null);
                        }
                        return querySuggestCall$Response;
                    }
                }
                StringBuilder sb = new StringBuilder(32);
                sb.append("Bad num suggestions: ");
                sb.append(i);
                str = sb.toString();
                if (str == null) {
                }
                return querySuggestCall$Response;
            }
            str = "Corpora specified but not package name";
            if (str == null) {
            }
            return querySuggestCall$Response;
        } catch (IllegalArgumentException e2) {
            str = e2.getMessage();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final String mo33000f() {
        return String.format("%s, query[%s]", super.mo33000f(), ((QuerySuggestCall$Request) this.f84708n).f107487a);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo47405a(Status status) {
        QuerySuggestCall$Response querySuggestCall$Response = new QuerySuggestCall$Response();
        querySuggestCall$Response.f107493a = status;
        return querySuggestCall$Response;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo47406a(Exception exc) {
        if (this.f84819c) {
            this.f84818b.mo33204a(exc);
            boolean z = this.f84820d;
            boolean z2 = false;
            if (z && exc != null) {
                z2 = true;
            }
            if (!z || z2) {
                acxl acxl = this.f84818b;
                String str = ((QuerySuggestCall$Request) this.f84708n).f107487a;
                abyy abyy = this.f84709o;
                bpxd a = acxl.mo33201a(str, abyy.f58780f, abyy.f58781g);
                if (((Boolean) abzt.f58993m.mo58455c()).booleanValue()) {
                    this.f84817a.f58067c.mo32995d(new apsi(this, bqbd.LOG_QUERY_STATS, this.f60439j, acrz.m49787b(this.f84817a.f58066b), a));
                } else {
                    this.f84817a.f58083s.mo32441a(a);
                }
            }
        }
    }
}
