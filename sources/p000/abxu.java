package p000;

import android.net.Uri;
import android.util.Pair;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;
import com.google.android.gms.appdatasearch.ScoringConfig;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Request;
import java.util.ArrayList;
import java.util.List;

/* renamed from: abxu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abxu {
    /* renamed from: a */
    public static RegisterCorpusInfoCall$Request m48512a(abww abww) {
        boolean z;
        boolean z2;
        boolean z3;
        fry a = RegisterCorpusInfo.m6149a(abww.mo32395b());
        a.f17166a = Integer.toString(abww.f58661a.f58534e);
        String valueOf = String.valueOf(abxn.f58689a);
        String encode = Uri.encode(abww.mo32396c());
        String encode2 = Uri.encode(abww.f58662b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15 + String.valueOf(encode).length() + String.valueOf(encode2).length());
        sb.append(valueOf);
        sb.append("/?type=");
        sb.append(encode);
        sb.append("&client=");
        sb.append(encode2);
        a.f17167b = Uri.parse(sb.toString());
        String str = abww.f58662b;
        String str2 = abww.f58661a.f58531b;
        if (((Boolean) acaw.f59270a.mo58455c()).booleanValue()) {
            bxwc bxwc = cemj.f182986a.mo6606a().mo79351d().f165797a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
            sb2.append(str);
            sb2.append(":");
            sb2.append(str2);
            z = !bxwc.contains(sb2.toString());
        } else {
            z = false;
        }
        a.f17170e = z;
        a.f17175j = ((Integer) abzt.f58945bg.mo58455c()).intValue();
        if (brib.m114026b(abww.f58663c)) {
            a.f17169d = new frk().mo11200a();
        }
        fsa a2 = RegisterSectionInfo.m6151a("thing_proto");
        a2.f17178a = "blob";
        a2.f17179b = true;
        a.mo11230a(a2);
        bxwc bxwc2 = abww.f58661a.f58533d;
        int size = bxwc2.size();
        for (int i = 0; i < size; i++) {
            abvf abvf = (abvf) bxwc2.get(i);
            fsa a3 = RegisterSectionInfo.m6151a(abvf.f58522b);
            a3.f17182e = "\u0000";
            if (abvf.f58524d.equals("plain") || abvf.f58524d.equals("rfc822") || abvf.f58524d.equals("url")) {
                z2 = true;
            } else {
                z2 = false;
            }
            a3.f17181d = z2;
            a3.f17178a = abvf.f58524d;
            int i2 = abvf.f58525e;
            a3.f17180c = i2;
            if (i2 == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            a3.f17179b = z3;
            fsj a4 = ScoringConfig.m6153a();
            acld acld = abvf.f58527g;
            if (acld == null) {
                acld = acld.f60081b;
            }
            a4.f17188a = acld.f60083a;
            a3.f17184g = a4.mo11246a();
            if (!abvf.f58526f.isEmpty()) {
                a3.mo11235a(fsq.m12258a((String[]) abvf.f58526f.toArray(new String[0])));
            }
            String str3 = abww.f58662b;
            String str4 = abww.f58661a.f58531b;
            String str5 = abvf.f58522b;
            if ("com.google.android.gms".equals(str3) && "Person".equals(str4) && ("name".equals(str5) || "additionalName".equals(str5))) {
                a3.mo11235a(fsq.m12257a());
            }
            a.mo11229a(a3.mo11234a());
        }
        RegisterCorpusInfoCall$Request registerCorpusInfoCall$Request = new RegisterCorpusInfoCall$Request();
        registerCorpusInfoCall$Request.f107400a = abww.f58662b;
        registerCorpusInfoCall$Request.f107401b = abww.mo32395b();
        registerCorpusInfoCall$Request.f107402c = a.mo11228a();
        return registerCorpusInfoCall$Request;
    }

    /* renamed from: b */
    public static String m48515b(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36 + String.valueOf(str).length());
        sb.append("CREATE INDEX [");
        sb.append(str);
        sb.append("_uri_index] ON [");
        sb.append(str);
        sb.append("](uri)");
        return sb.toString();
    }

    /* renamed from: a */
    public static String m48513a(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append('[');
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: a */
    public static List m48514a(abvg abvg) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("seqno", "INTEGER PRIMARY KEY AUTOINCREMENT"));
        arrayList.add(new Pair("action", "STRING"));
        arrayList.add(new Pair("uri", "STRING"));
        arrayList.add(new Pair("tag", "STRING"));
        arrayList.add(new Pair("doc_score", "INTEGER"));
        arrayList.add(new Pair("created_timestamp", "INTEGER"));
        arrayList.add(new Pair("section_thing_proto", "BLOB"));
        bxwc bxwc = abvg.f58533d;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            String valueOf = String.valueOf(((abvf) bxwc.get(i)).f58522b);
            arrayList.add(new Pair(valueOf.length() == 0 ? new String("section_") : "section_".concat(valueOf), "STRING"));
        }
        return arrayList;
    }
}
