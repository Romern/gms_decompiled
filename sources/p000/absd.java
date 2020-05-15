package p000;

import android.text.TextUtils;
import com.google.android.gms.appdatasearch.CorpusScoringInfo;
import com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;
import com.google.android.gms.appdatasearch.STSortSpec;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: absd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class absd {

    /* renamed from: a */
    public static final absc f58093a = new absa();

    /* renamed from: b */
    public static final absc f58094b = new absb();

    /* renamed from: c */
    private static final Pattern f58095c = Pattern.compile("(\\p{Alnum}|[-._/])+");

    /* renamed from: a */
    private static String m48167a(int i, STSortSpec sTSortSpec) {
        if (sTSortSpec != null && i != 5) {
            return "RankingStrategy.ST_SORT and STSortSpec must be set together.";
        }
        if (sTSortSpec == null && i == 5) {
            return "RankingStrategy.ST_SORT and STSortSpec must be set together.";
        }
        if (i >= 0 && i <= 5) {
            return null;
        }
        return "Invalid ranking strategy.";
    }

    /* renamed from: b */
    private static String m48176b(int i) {
        if (i < 0 || i > 3) {
            return "Invalid query tokenizer";
        }
        return null;
    }

    /* renamed from: c */
    private static String m48179c(String str) {
        if (str != null && !TextUtils.isEmpty(str)) {
            if (str.length() > 64) {
                return str.length() == 0 ? new String("Query origin too long, max is 64: ") : "Query origin too long, max is 64: ".concat(str);
            }
            if (!f58095c.matcher(str).matches()) {
                return "Incorrect query origin format. Should use following format: [a-zA-Z0-9._-/]+";
            }
        }
        return null;
    }

    /* renamed from: d */
    public static final String m48181d(String str, String str2, int i) {
        try {
            m48174a(str, str2, i);
            return null;
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }

    /* renamed from: a */
    public static String m48168a(QuerySpecification querySpecification) {
        List list = querySpecification.f9615b;
        if (list != null) {
            if (list.size() > 16) {
                return "Too many tags requested.";
            }
            List list2 = querySpecification.f9615b;
            int size = list2.size();
            int i = 0;
            while (i < size) {
                String d = m48181d("Tag", (String) list2.get(i), 1000);
                i++;
                if (d != null) {
                    return d;
                }
            }
        }
        List list3 = querySpecification.f9616c;
        if (list3 != null && list3.size() > 16) {
            return "Too many sections requested.";
        }
        String b = m48176b(querySpecification.f9621h);
        return (b == null && (b = m48179c(querySpecification.f9626m)) == null) ? m48167a(querySpecification.f9619f, querySpecification.f9625l) : b;
    }

    /* renamed from: b */
    public static void m48177b(String str) {
        m48174a("Corpus name", str, 2048);
        if (str.charAt(0) == '.') {
            throw new IllegalArgumentException("Corpus name cannot start with .");
        }
    }

    /* renamed from: b */
    public static final void m48178b(String str, String str2, int i) {
        m48173a(str, str2);
        m48180c(str, str2, i);
    }

    /* renamed from: c */
    public static final void m48180c(String str, String str2, int i) {
        if (str2.length() > i) {
            StringBuilder sb = new StringBuilder(str.length() + 27);
            sb.append(str);
            sb.append(" too long (max ");
            sb.append(i);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public static final String m48169a(RegisterCorpusInfo registerCorpusInfo) {
        try {
            m48177b(registerCorpusInfo.f9635a);
            m48178b("Version tag", registerCorpusInfo.f9636b, 100);
            m48173a("Content provider uri", registerCorpusInfo.f9637c);
            m48174a("Content provider uri", registerCorpusInfo.f9637c.toString(), 2048);
            RegisterSectionInfo[] registerSectionInfoArr = registerCorpusInfo.f9638d;
            if (registerSectionInfoArr == null) {
                return "Section information is missing";
            }
            if (registerSectionInfoArr.length > 16) {
                return "Too many sections (max: 16)";
            }
            HashMap hashMap = new HashMap();
            RegisterSectionInfo[] registerSectionInfoArr2 = registerCorpusInfo.f9638d;
            int length = registerSectionInfoArr2.length;
            int i = 0;
            while (i < length) {
                RegisterSectionInfo registerSectionInfo = registerSectionInfoArr2[i];
                if (registerSectionInfo == null) {
                    return "Null section info";
                }
                m48172a(registerSectionInfo.f9646a);
                String str = registerSectionInfo.f9647b;
                if (str != null) {
                    if (!fsb.f17187a.contains(str)) {
                        StringBuilder sb = new StringBuilder(str.length() + 22);
                        sb.append("Bad section format: [");
                        sb.append(str);
                        sb.append("]");
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                if ("blob".equals(registerSectionInfo.f9647b) && !registerSectionInfo.f9648c) {
                    return "Format cannot be indexed";
                }
                m48171a(registerSectionInfo.f9649d);
                String str2 = registerSectionInfo.f9651f;
                if (str2 != null) {
                    if (str2.length() > 24) {
                        throw new IllegalArgumentException(str2.length() == 0 ? new String("Subsection separator string too long, max is 24: ") : "Subsection separator string too long, max is 24: ".concat(str2));
                    }
                }
                if (hashMap.containsKey(registerSectionInfo.f9646a)) {
                    String valueOf = String.valueOf(registerSectionInfo.f9646a);
                    return valueOf.length() == 0 ? new String("Duplicate section name ") : "Duplicate section name ".concat(valueOf);
                }
                hashMap.put(registerSectionInfo.f9646a, registerSectionInfo);
                double b = fsq.m12260b(registerSectionInfo);
                if (b > 0.0d) {
                    if (b <= 1.0d) {
                        double c = fsq.m12262c(registerSectionInfo);
                        if (c != 1.0d && !"rfc822".equals(registerSectionInfo.f9647b)) {
                            return "DemoteRfc822Hostname feature only allowed on rfc822 sections.";
                        }
                        if (c > 0.0d) {
                            if (c <= 1.0d) {
                                if (fsq.m12259a(registerSectionInfo)) {
                                    if (!"url".equals(registerSectionInfo.f9647b)) {
                                        return "omniboxUrlSection only allowed on url section";
                                    }
                                }
                                i++;
                            }
                        }
                        StringBuilder sb2 = new StringBuilder(58);
                        sb2.append("Bad demote rfc822 hostname factor ");
                        sb2.append(c);
                        return sb2.toString();
                    }
                }
                StringBuilder sb3 = new StringBuilder(55);
                sb3.append("Bad demote common words factor ");
                sb3.append(b);
                return sb3.toString();
            }
            return null;
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }

    /* renamed from: a */
    public static String m48170a(String str, int i, int i2, GlobalSearchQuerySpecification globalSearchQuerySpecification) {
        Collection<CorpusScoringInfo> collection;
        try {
            m48180c("Query", str, 1000);
            if (i >= 0) {
                if (i2 > 0) {
                    if (globalSearchQuerySpecification == null) {
                        return null;
                    }
                    Map map = globalSearchQuerySpecification.f9591t;
                    if (map != null) {
                        collection = map.values();
                    } else {
                        collection = Collections.emptyList();
                    }
                    for (CorpusScoringInfo corpusScoringInfo : collection) {
                        if (corpusScoringInfo.f9520a.f9517a != null) {
                            int i3 = corpusScoringInfo.f9521b;
                            if (i3 <= 0 || i3 > 65536) {
                                StringBuilder sb = new StringBuilder(22);
                                sb.append("Bad weight ");
                                sb.append(i3);
                                throw new IllegalArgumentException(sb.toString());
                            }
                        } else {
                            throw new IllegalArgumentException("Null package name");
                        }
                    }
                    String a = m48167a(globalSearchQuerySpecification.f9576e, globalSearchQuerySpecification.f9586o);
                    if (a == null) {
                        String b = m48176b(globalSearchQuerySpecification.f9577f);
                        if (b == null) {
                            String c = m48179c(globalSearchQuerySpecification.f9587p);
                            if (c == null) {
                                return null;
                            }
                            throw new IllegalArgumentException(c);
                        }
                        throw new IllegalArgumentException(b);
                    }
                    throw new IllegalArgumentException(a);
                }
            }
            StringBuilder sb2 = new StringBuilder(51);
            sb2.append("Bad start and num results: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            return sb2.toString();
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }

    /* renamed from: a */
    public static final void m48171a(int i) {
        if (i < 0 || i > 63) {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Bad section weight: [");
            sb.append(i);
            sb.append("]");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public static final void m48172a(String str) {
        try {
            acbi acbi = new acbi(str);
            if (acbi.mo32608a() || !acbk.m48823b(acbi.mo32612e())) {
                throw acbi.mo32606a("Expected a letter or _");
            }
            acbi.mo32611d();
            while (!acbi.mo32608a()) {
                if (acbk.m48824c(acbi.mo32612e())) {
                    acbi.mo32611d();
                } else {
                    throw acbi.mo32606a("Invalid character; only letters, digits and _ are allowed");
                }
            }
            if (str.length() > 64) {
                String valueOf = String.valueOf(str);
                throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Section name too long, max is 64: ") : "Section name too long, max is 64: ".concat(valueOf));
            }
        } catch (acbg e) {
            String valueOf2 = String.valueOf(e.mo32605a());
            throw new IllegalArgumentException(valueOf2.length() == 0 ? new String("Invalid section name: ") : "Invalid section name: ".concat(valueOf2));
        }
    }

    /* renamed from: a */
    public static final void m48173a(String str, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(str.concat(" null"));
        }
    }

    /* renamed from: a */
    public static final void m48174a(String str, String str2, int i) {
        if (!TextUtils.isEmpty(str2)) {
            m48180c(str, str2, i);
            return;
        }
        throw new IllegalArgumentException(str.concat(" empty"));
    }

    /* renamed from: a */
    public static final void m48175a(String str, byte[] bArr) {
        if (bArr.length > 64000) {
            StringBuilder sb = new StringBuilder(str.length() + 27);
            sb.append(str);
            sb.append(" too long (max 64000)");
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
