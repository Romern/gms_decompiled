package p000;

import android.text.TextUtils;
import com.google.android.gms.appdatasearch.CorpusId;
import com.google.android.gms.appdatasearch.PhraseAffinityCorpusSpec;
import com.google.android.gms.appdatasearch.PhraseAffinityResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import com.google.android.gms.search.queries.GetPhraseAffinityCall$Request;
import com.google.android.gms.search.queries.GetPhraseAffinityCall$Response;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: apry */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class apry extends aplq {

    /* renamed from: a */
    private final abrv f84806a;

    public apry(abrv abrv, GetPhraseAffinityCall$Request getPhraseAffinityCall$Request, abyy abyy) {
        super(bqbd.GET_PHRASE_AFFINITY, 1, 2, abrv.f58066b, getPhraseAffinityCall$Request, abyy);
        this.f84806a = abrv;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11132a() {
        String str;
        PhraseAffinityResponse phraseAffinityResponse;
        int i;
        Map map;
        GetPhraseAffinityCall$Request getPhraseAffinityCall$Request = (GetPhraseAffinityCall$Request) this.f84708n;
        String[] strArr = getPhraseAffinityCall$Request.f107463a;
        PhraseAffinityCorpusSpec[] phraseAffinityCorpusSpecArr = getPhraseAffinityCall$Request.f107464b;
        boolean z = false;
        if (strArr == null || phraseAffinityCorpusSpecArr == null) {
            str = "Null phrases or specs";
        } else {
            try {
                int length = strArr.length;
                if (length <= 100) {
                    int length2 = phraseAffinityCorpusSpecArr.length;
                    if (length2 != 0) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length2) {
                                str = null;
                                break;
                            }
                            Map a = phraseAffinityCorpusSpecArr[i2].mo7205a();
                            if (a.isEmpty()) {
                                str = "Empty section weights";
                                break;
                            }
                            for (Map.Entry entry : a.entrySet()) {
                                absd.m48172a((String) entry.getKey());
                                absd.m48171a(((Integer) entry.getValue()).intValue());
                            }
                            i2++;
                        }
                    } else {
                        str = "No corpora names";
                    }
                } else {
                    StringBuilder sb = new StringBuilder(28);
                    sb.append("Bad num phrases: ");
                    sb.append(length);
                    str = sb.toString();
                }
            } catch (IllegalArgumentException e) {
                str = e.getMessage();
            }
        }
        if (str == null) {
            PhraseAffinityCorpusSpec[] phraseAffinityCorpusSpecArr2 = ((GetPhraseAffinityCall$Request) this.f84708n).f107464b;
            bxvd da = abtp.f58286d.mo74144da();
            List asList = Arrays.asList(((GetPhraseAffinityCall$Request) this.f84708n).f107463a);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            abtp abtp = (abtp) da.f164949b;
            if (!abtp.f58290c.mo73666a()) {
                abtp.f58290c = GeneratedMessageLite.m124021a(abtp.f58290c);
            }
            bxsy.m123078a(asList, abtp.f58290c);
            bxvd da2 = abud.f58349v.mo74144da();
            abzo a2 = this.f84806a.mo32298a();
            synchronized (a2.mo32525a()) {
                int i3 = 0;
                while (true) {
                    int length3 = phraseAffinityCorpusSpecArr2.length;
                    if (i3 < length3) {
                        PhraseAffinityCorpusSpec phraseAffinityCorpusSpec = phraseAffinityCorpusSpecArr2[i3];
                        CorpusId corpusId = phraseAffinityCorpusSpec.f9608a;
                        Map a3 = phraseAffinityCorpusSpec.mo7205a();
                        int i4 = 1;
                        for (Integer num : a3.values()) {
                            i4 = Math.max(i4, num.intValue());
                        }
                        if (!this.f84806a.f58077m.mo32509e(corpusId.f9517a)) {
                            String valueOf = String.valueOf(corpusId.f9517a);
                            phraseAffinityResponse = fsh.m12247c(valueOf.length() == 0 ? new String("Package name non-existent or not globally searchable ") : "Package name non-existent or not globally searchable ".concat(valueOf));
                        } else {
                            absr d = a2.mo32543d(new acak(corpusId.f9517a, corpusId.f9518b));
                            if (d != null) {
                                int i5 = 0;
                                boolean z2 = false;
                                while (i5 < d.f58145j.size()) {
                                    Integer num2 = (Integer) a3.get(((abqo) d.f58145j.get(i5)).f57978b);
                                    if (num2 == null) {
                                        map = a3;
                                    } else {
                                        bxvd da3 = abuc.f58343e.mo74144da();
                                        int i6 = d.f58137b;
                                        if (da3.f164950c) {
                                            da3.mo74035c();
                                            da3.f164950c = z;
                                        }
                                        abuc abuc = (abuc) da3.f164949b;
                                        int i7 = abuc.f58345a | 1;
                                        abuc.f58345a = i7;
                                        abuc.f58346b = i6;
                                        abuc.f58345a = i7 | 2;
                                        abuc.f58347c = i5;
                                        double intValue = (double) num2.intValue();
                                        map = a3;
                                        double d2 = (double) i4;
                                        Double.isNaN(intValue);
                                        Double.isNaN(d2);
                                        double d3 = intValue / d2;
                                        if (da3.f164950c) {
                                            da3.mo74035c();
                                            da3.f164950c = false;
                                        }
                                        abuc abuc2 = (abuc) da3.f164949b;
                                        abuc2.f58345a |= 4;
                                        abuc2.f58348d = d3;
                                        da2.mo73982a((abuc) da3.mo74062i());
                                        z2 = true;
                                    }
                                    i5++;
                                    a3 = map;
                                    z = false;
                                }
                                if (!z2) {
                                    bxvd da4 = abuc.f58343e.mo74144da();
                                    int i8 = d.f58137b;
                                    if (da4.f164950c) {
                                        da4.mo74035c();
                                        da4.f164950c = false;
                                    }
                                    abuc abuc3 = (abuc) da4.f164949b;
                                    abuc3.f58345a |= 1;
                                    abuc3.f58346b = i8;
                                    da2.mo73982a((abuc) da4.mo74062i());
                                }
                            }
                            i3++;
                            z = false;
                        }
                    } else {
                        if (!da.f164950c) {
                            i = 0;
                        } else {
                            da.mo74035c();
                            i = 0;
                            da.f164950c = false;
                        }
                        abtp abtp2 = (abtp) da.f164949b;
                        abud abud = (abud) da2.mo74062i();
                        abud.getClass();
                        abtp2.f58289b = abud;
                        abtp2.f58288a |= 1;
                        int[] nativeGetPhraseAffinityScores = NativeIndex.nativeGetPhraseAffinityScores(this.f84806a.f58078n.f79071b, ((abtp) da.mo74062i()).serializeToBytes());
                        CorpusId[] corpusIdArr = new CorpusId[length3];
                        while (i < phraseAffinityCorpusSpecArr2.length) {
                            corpusIdArr[i] = phraseAffinityCorpusSpecArr2[i].f9608a;
                            i++;
                        }
                        phraseAffinityResponse = new PhraseAffinityResponse(corpusIdArr, nativeGetPhraseAffinityScores);
                    }
                }
            }
        } else {
            phraseAffinityResponse = fsh.m12247c(str);
        }
        GetPhraseAffinityCall$Response getPhraseAffinityCall$Response = new GetPhraseAffinityCall$Response();
        getPhraseAffinityCall$Response.f107467b = phraseAffinityResponse;
        String str2 = phraseAffinityResponse.f9610a;
        getPhraseAffinityCall$Response.f107466a = str2 != null ? new Status(8, str2, null) : Status.f30107a;
        return getPhraseAffinityCall$Response;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final String mo33000f() {
        String str;
        String[] strArr = ((GetPhraseAffinityCall$Request) this.f84708n).f107463a;
        if (strArr != null) {
            str = TextUtils.join(",", strArr);
        } else {
            str = "";
        }
        return String.format("%s, phrases[%s]", super.mo33000f(), str);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo47405a(Status status) {
        GetPhraseAffinityCall$Response getPhraseAffinityCall$Response = new GetPhraseAffinityCall$Response();
        getPhraseAffinityCall$Response.f107466a = status;
        return getPhraseAffinityCall$Response;
    }
}
