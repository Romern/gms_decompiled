package p000;

import android.os.Bundle;
import android.util.TimingLogger;
import com.google.android.gms.appdatasearch.DocumentResults;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.appdatasearch.Section;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.search.queries.GetDocumentsCall$Request;
import com.google.android.gms.search.queries.GetDocumentsCall$Response;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: aprv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aprv extends aplq {

    /* renamed from: a */
    private final abrv f84803a;

    /* renamed from: b */
    private final TimingLogger f84804b;

    /* renamed from: c */
    private final String f84805c;

    public aprv(abrv abrv, GetDocumentsCall$Request getDocumentsCall$Request, abyy abyy) {
        super(bqbd.GET_DOCUMENTS, 1, 1, abrv.f58066b, getDocumentsCall$Request, abyy);
        String str;
        this.f84803a = abrv;
        GetDocumentsCall$Request getDocumentsCall$Request2 = (GetDocumentsCall$Request) this.f84708n;
        String[] strArr = getDocumentsCall$Request2.f107457c;
        String str2 = getDocumentsCall$Request2.f107455a;
        String str3 = getDocumentsCall$Request2.f107456b;
        QuerySpecification querySpecification = getDocumentsCall$Request2.f107458d;
        if (querySpecification == null) {
            str = "No query spec defined";
        } else {
            try {
                absd.m48174a("Corpus name", str3, 2048);
                for (String str4 : strArr) {
                    absd.m48174a("Uri", str4, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                }
                str = absd.m48168a(querySpecification);
            } catch (IllegalArgumentException e) {
                str = e.getMessage();
            }
        }
        this.f84805c = str;
        GetDocumentsCall$Request getDocumentsCall$Request3 = (GetDocumentsCall$Request) this.f84708n;
        String str5 = getDocumentsCall$Request3.f107456b;
        int length = getDocumentsCall$Request3.f107457c.length;
        StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 25);
        sb.append("getDocuments ");
        sb.append(str5);
        sb.append(" ");
        sb.append(length);
        this.f84804b = new TimingLogger("Icing", sb.toString());
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0298 A[Catch:{ UnsupportedEncodingException -> 0x035c, UnsupportedEncodingException -> 0x01ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x029a A[Catch:{ UnsupportedEncodingException -> 0x035c, UnsupportedEncodingException -> 0x01ca }] */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11132a() {
        DocumentResults documentResults;
        Bundle bundle;
        List list;
        Bundle bundle2;
        abuh abuh;
        abud abud;
        ArrayList arrayList;
        HashSet hashSet;
        absr absr;
        abue abue;
        abuh abuh2;
        abud abud2;
        ArrayList arrayList2;
        HashSet hashSet2;
        HashSet hashSet3;
        String str;
        Bundle bundle3;
        String str2 = this.f84805c;
        if (str2 == null) {
            this.f84804b.addSplit("wait index init");
            abzo a = this.f84803a.mo32298a();
            synchronized (a.mo32525a()) {
                GetDocumentsCall$Request getDocumentsCall$Request = (GetDocumentsCall$Request) this.f84708n;
                String[] strArr = {getDocumentsCall$Request.f107456b};
                abzn b = a.mo32535b(this.f84709o, strArr, true, getDocumentsCall$Request.f107455a);
                String a2 = apsm.m70910a(b, this.f84709o, strArr, ((GetDocumentsCall$Request) this.f84708n).f107455a);
                bnic bnic = b.f58821a;
                this.f84804b.addSplit("authentication");
                if (a2 == null) {
                    absr d = a.mo32543d((acak) bnic.iterator().next());
                    if (d == null) {
                        documentResults = fsh.m12243a("Failed to find corpus");
                    } else {
                        bxvd da = abtu.f58310g.mo74144da();
                        int i = d.f58137b;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        abtu abtu = (abtu) da.f164949b;
                        abtu.f58312a |= 1;
                        abtu.f58313b = i;
                        if (((GetDocumentsCall$Request) this.f84708n).f107458d.f9616c != null) {
                            Map b2 = abzm.m48654b(d);
                            ArrayList arrayList3 = new ArrayList();
                            for (Section section : ((GetDocumentsCall$Request) this.f84708n).f107458d.f9616c) {
                                abzi abzi = (abzi) b2.get(section.f9683a);
                                if (abzi != null) {
                                    bxvd da2 = abub.f58337e.mo74144da();
                                    int i2 = abzi.f58806a;
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    abub abub = (abub) da2.f164949b;
                                    abub.f58339a |= 1;
                                    abub.f58340b = i2;
                                    arrayList3.add((abub) da2.mo74062i());
                                }
                            }
                            if (!arrayList3.isEmpty()) {
                                da.mo73955R(arrayList3);
                            }
                        }
                        bxvd da3 = abud.f58349v.mo74144da();
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        abud abud3 = (abud) da3.f164949b;
                        abtu abtu2 = (abtu) da.mo74062i();
                        abtu2.getClass();
                        abud3.mo32346a();
                        abud3.f58352b.add(abtu2);
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        abud abud4 = (abud) da3.f164949b;
                        abud4.f58351a |= 2;
                        abud4.f58356f = true;
                        List list2 = ((GetDocumentsCall$Request) this.f84708n).f107458d.f9615b;
                        if (list2 != null) {
                            da3.mo73954Q(list2);
                        }
                        abud abud5 = (abud) da3.mo74062i();
                        this.f84804b.addSplit("build corpus spec");
                        long nanoTime = System.nanoTime();
                        abuh a3 = this.f84803a.f58078n.mo43395a(((GetDocumentsCall$Request) this.f84708n).f107457c, abud5);
                        long nanoTime2 = System.nanoTime() - nanoTime;
                        this.f84804b.addSplit("execute query");
                        if (a3 == null) {
                            this.f84804b.dumpToLog();
                            documentResults = fsh.m12243a("Error parsing QueryResponse from native");
                        } else {
                            absg.m48194b("Retrieved: %d Docs: %d Elapsed: %d ms", Integer.valueOf(a3.f58393e), Integer.valueOf(a3.f58390b), Long.valueOf(nanoTime2 / 1000000));
                            GetDocumentsCall$Request getDocumentsCall$Request2 = (GetDocumentsCall$Request) this.f84708n;
                            String[] strArr2 = getDocumentsCall$Request2.f107457c;
                            QuerySpecification querySpecification = getDocumentsCall$Request2.f107458d;
                            int length = strArr2.length;
                            ArrayList<String> arrayList4 = new ArrayList(length);
                            int i3 = 0;
                            int i4 = 0;
                            int i5 = 0;
                            while (true) {
                                if (i3 < length) {
                                    String str3 = strArr2[i3];
                                    if (i4 >= a3.f58390b) {
                                        break;
                                    }
                                    try {
                                        if (a3.f58395g.mo73754a(i5, a3.f58394f.mo74151b(i4) + i5).mo73772b("UTF-8").equals(str3)) {
                                            arrayList4.add(str3);
                                            i5 += a3.f58394f.mo74151b(i4);
                                            i4++;
                                        }
                                        i3++;
                                    } catch (UnsupportedEncodingException e) {
                                        throw new IllegalStateException("Encoding utf8 not available");
                                    } catch (UnsupportedEncodingException e2) {
                                        throw new IllegalArgumentException("UTF-8 not supported");
                                    }
                                } else {
                                    break;
                                }
                            }
                            Bundle bundle4 = new Bundle(arrayList4.size());
                            for (String str4 : arrayList4) {
                                bundle4.putBoolean(str4, true);
                            }
                            bmxy.m108588a(abud5.f58352b.size() == 1);
                            List list3 = querySpecification.f9615b;
                            if (list3 != null && !list3.isEmpty()) {
                                bundle = new Bundle();
                                HashSet hashSet4 = new HashSet(querySpecification.f9615b);
                                int i6 = 0;
                                while (i6 < abud5.f58355e.size()) {
                                    String str5 = (String) abud5.f58355e.get(i6);
                                    if (hashSet4.contains(str5)) {
                                        bxtx bxtx = ((abuf) ((abug) a3.f58392d.get(0)).f58386b.get(i6)).f58381a;
                                        int i7 = 0;
                                        while (i7 < arrayList4.size()) {
                                            if (bxtx.mo73743a(i7) != 0) {
                                                String str6 = (String) arrayList4.get(i7);
                                                Bundle bundle5 = bundle.getBundle(str5);
                                                if (bundle5 == null) {
                                                    hashSet3 = hashSet4;
                                                    bundle3 = new Bundle();
                                                    bundle.putBundle(str5, bundle3);
                                                } else {
                                                    hashSet3 = hashSet4;
                                                    bundle3 = bundle5;
                                                }
                                                str = str5;
                                                bundle3.putBoolean(str6, true);
                                            } else {
                                                hashSet3 = hashSet4;
                                                str = str5;
                                            }
                                            i7++;
                                            str5 = str;
                                            hashSet4 = hashSet3;
                                        }
                                        hashSet2 = hashSet4;
                                    } else {
                                        hashSet2 = hashSet4;
                                    }
                                    i6++;
                                    hashSet4 = hashSet2;
                                }
                                if (!bundle.isEmpty()) {
                                    bmxy.m108588a(abud5.f58352b.size() != 1);
                                    list = querySpecification.f9616c;
                                    if (list != null || list.isEmpty()) {
                                        bundle2 = null;
                                    } else {
                                        HashSet a4 = bnpf.m110048a(querySpecification.f9616c.size());
                                        bundle2 = new Bundle(querySpecification.f9616c.size());
                                        for (Section section2 : querySpecification.f9616c) {
                                            a4.add(section2.f9683a);
                                        }
                                        int i8 = 0;
                                        while (i8 < ((abtu) abud5.f58352b.get(0)).f58314c.size()) {
                                            int i9 = 0;
                                            abue abue2 = (abue) ((abug) a3.f58392d.get(0)).f58385a.get(i8);
                                            String str7 = ((abqo) d.f58145j.get(((abub) ((abtu) abud5.f58352b.get(0)).f58314c.get(i8)).f58340b)).f57978b;
                                            if (a4.contains(str7)) {
                                                Bundle bundle6 = new Bundle();
                                                absr = d;
                                                int i10 = 0;
                                                while (true) {
                                                    hashSet = a4;
                                                    if (i9 >= arrayList4.size()) {
                                                        break;
                                                    }
                                                    int b3 = abue2.f58374a.mo74151b(i9);
                                                    if (b3 > 0) {
                                                        abud2 = abud5;
                                                        String str8 = (String) arrayList4.get(i9);
                                                        arrayList2 = arrayList4;
                                                        byte[] k = abue2.f58375b.mo73780k();
                                                        abuh2 = a3;
                                                        if (!str7.equals("thing_proto")) {
                                                            abue = abue2;
                                                            bundle6.putString(str8, new String(k, i10, b3, "UTF-8"));
                                                        } else {
                                                            abue = abue2;
                                                            bundle6.putByteArray(str8, Arrays.copyOfRange(k, i10, b3));
                                                        }
                                                        i10 += b3;
                                                    } else {
                                                        abud2 = abud5;
                                                        arrayList2 = arrayList4;
                                                        abuh2 = a3;
                                                        abue = abue2;
                                                    }
                                                    i9++;
                                                    a4 = hashSet;
                                                    arrayList4 = arrayList2;
                                                    abud5 = abud2;
                                                    a3 = abuh2;
                                                    abue2 = abue;
                                                }
                                                abud = abud5;
                                                arrayList = arrayList4;
                                                abuh = a3;
                                                bundle2.putBundle(str7, bundle6);
                                            } else {
                                                absr = d;
                                                hashSet = a4;
                                                abud = abud5;
                                                arrayList = arrayList4;
                                                abuh = a3;
                                            }
                                            i8++;
                                            d = absr;
                                            a4 = hashSet;
                                            arrayList4 = arrayList;
                                            abud5 = abud;
                                            a3 = abuh;
                                        }
                                    }
                                    DocumentResults documentResults2 = new DocumentResults(null, bundle4, bundle, bundle2);
                                    this.f84804b.addSplit("build DocumentResults");
                                    this.f84804b.dumpToLog();
                                    documentResults = documentResults2;
                                }
                            }
                            bundle = null;
                            bmxy.m108588a(abud5.f58352b.size() != 1);
                            list = querySpecification.f9616c;
                            if (list != null) {
                            }
                            bundle2 = null;
                            DocumentResults documentResults22 = new DocumentResults(null, bundle4, bundle, bundle2);
                            this.f84804b.addSplit("build DocumentResults");
                            this.f84804b.dumpToLog();
                            documentResults = documentResults22;
                        }
                    }
                } else {
                    documentResults = fsh.m12243a(a2);
                }
            }
        } else {
            documentResults = fsh.m12243a(str2);
        }
        GetDocumentsCall$Response getDocumentsCall$Response = new GetDocumentsCall$Response();
        getDocumentsCall$Response.f107461b = documentResults;
        String str9 = documentResults.f9537a;
        getDocumentsCall$Response.f107460a = str9 != null ? new Status(8, str9, null) : Status.f30107a;
        return getDocumentsCall$Response;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final String mo33000f() {
        GetDocumentsCall$Request getDocumentsCall$Request = (GetDocumentsCall$Request) this.f84708n;
        return String.format("%s, package[%s], corpus[%s]", super.mo33000f(), getDocumentsCall$Request.f107455a, getDocumentsCall$Request.f107456b);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo47405a(Status status) {
        GetDocumentsCall$Response getDocumentsCall$Response = new GetDocumentsCall$Response();
        getDocumentsCall$Response.f107460a = status;
        return getDocumentsCall$Response;
    }
}
