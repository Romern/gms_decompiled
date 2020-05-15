package p000;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.google.android.gms.appdatasearch.DocumentSection;
import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.appdatasearch.GlobalSearchCorpusConfig;
import com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;
import com.google.android.gms.appdatasearch.ScoringConfig;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.File;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.crypto.Mac;

/* renamed from: abzm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abzm implements abzo {

    /* renamed from: a */
    public static final int f58810a = ((int) TimeUnit.DAYS.toSeconds(90));

    /* renamed from: h */
    private static final Map f58811h;

    /* renamed from: i */
    private static final Map f58812i;

    /* renamed from: b */
    public final acam f58813b;

    /* renamed from: c */
    public final abyx f58814c;

    /* renamed from: d */
    public final acxb f58815d;

    /* renamed from: e */
    public final abym f58816e;

    /* renamed from: f */
    public final Map f58817f;

    /* renamed from: g */
    public boolean f58818g = false;

    /* renamed from: j */
    private final Context f58819j;

    /* renamed from: k */
    private SecureRandom f58820k;

    static {
        HashMap hashMap = new HashMap();
        f58811h = hashMap;
        hashMap.put(null, abql.TOKENIZER_TEXT);
        f58811h.put("plain", abql.TOKENIZER_TEXT);
        f58811h.put("html", abql.TOKENIZER_HTML);
        f58811h.put("rfc822", abql.TOKENIZER_RFC822_FORMATTED);
        f58811h.put("url", abql.TOKENIZER_URL);
        f58811h.put("blob", abql.TOKENIZER_NONE);
        f58811h.put("date", abql.TOKENIZER_NONE);
        f58811h.put("location", abql.TOKENIZER_NONE);
        f58811h.put("verbatim", abql.TOKENIZER_VERBATIM);
        HashMap hashMap2 = new HashMap(f58811h.size());
        f58812i = hashMap2;
        hashMap2.put(abql.TOKENIZER_TEXT, "plain");
        for (Map.Entry entry : f58811h.entrySet()) {
            if (entry.getKey() != null && !((abql) entry.getValue()).equals(abql.TOKENIZER_TEXT)) {
                f58812i.put((abql) entry.getValue(), (String) entry.getKey());
            }
        }
    }

    public abzm(NativeIndex nativeIndex, abyx abyx, Context context, String str, File file, abym abym) {
        HashMap hashMap = new HashMap();
        this.f58819j = context;
        this.f58817f = hashMap;
        sdo.m34959a(nativeIndex);
        this.f58814c = abyx;
        this.f58815d = new acxb(context);
        this.f58816e = abym;
        acan acan = new acan(context, str, file);
        this.f58813b = acan;
        for (abss abss : acan.mo32588a()) {
            mo32538b(mo32521a(abss));
        }
        this.f58818g = false;
    }

    /* renamed from: a */
    public static abqo m48648a(RegisterSectionInfo registerSectionInfo) {
        String a;
        abql abql = (abql) f58811h.get(registerSectionInfo.f9647b);
        if (abql == null) {
            abql = abql.TOKENIZER_TEXT;
        }
        String str = registerSectionInfo.f9651f;
        if (str == null) {
            str = "";
        }
        bxvd da = abqo.f57975r.mo74144da();
        String str2 = registerSectionInfo.f9646a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abqo abqo = (abqo) da.f164949b;
        str2.getClass();
        int i = 1;
        int i2 = abqo.f57977a | 1;
        abqo.f57977a = i2;
        abqo.f57978b = str2;
        boolean z = registerSectionInfo.f9648c;
        int i3 = i2 | 2;
        abqo.f57977a = i3;
        abqo.f57979c = !z;
        abqo.f57980d = abql.f57967g;
        int i4 = i3 | 4;
        abqo.f57977a = i4;
        int i5 = registerSectionInfo.f9649d;
        int i6 = i4 | 8;
        abqo.f57977a = i6;
        abqo.f57981e = i5;
        boolean z2 = registerSectionInfo.f9650e;
        int i7 = i6 | 16;
        abqo.f57977a = i7;
        abqo.f57982f = z2;
        str.getClass();
        int i8 = i7 | 32;
        abqo.f57977a = i8;
        abqo.f57983g = str;
        ScoringConfig scoringConfig = registerSectionInfo.f9654i;
        boolean z3 = scoringConfig != null && scoringConfig.f9663a;
        abqo.f57977a = i8 | 4096;
        abqo.f57992q = z3;
        ArrayList arrayList = new ArrayList();
        if (registerSectionInfo.mo7218a(1) != null) {
            arrayList.add(abqn.VARIANT_NICKNAME);
        }
        if (registerSectionInfo.mo7218a(6) != null) {
            arrayList.add(abqn.VARIANT_ANNOTATION);
            Feature a2 = registerSectionInfo.mo7218a(6);
            String[] strArr = null;
            if (!(a2 == null || (a = a2.mo7177a("annotators")) == null)) {
                strArr = TextUtils.split(a, ",");
            }
            da.mo73947J(Arrays.asList(strArr));
        }
        da.mo73948K(arrayList);
        double b = fsq.m12260b(registerSectionInfo);
        if (b < 1.0d) {
            int a3 = NativeIndex.m66677a(b);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            abqo abqo2 = (abqo) da.f164949b;
            abqo2.f57977a |= 64;
            abqo2.f57986k = a3;
        }
        double c = fsq.m12262c(registerSectionInfo);
        if (c < 1.0d) {
            int a4 = NativeIndex.m66677a(c);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            abqo abqo3 = (abqo) da.f164949b;
            abqo3.f57977a |= 128;
            abqo3.f57987l = a4;
        }
        if ("url".equals(registerSectionInfo.f9647b) && fsq.m12259a(registerSectionInfo)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            abqo abqo4 = (abqo) da.f164949b;
            abqo4.f57990o = 1;
            abqo4.f57977a |= 1024;
        } else if (registerSectionInfo.mo7218a(5) != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            abqo abqo5 = (abqo) da.f164949b;
            abqo5.f57990o = 2;
            abqo5.f57977a |= 1024;
        }
        String str3 = registerSectionInfo.f9653h;
        if (str3 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            abqo abqo6 = (abqo) da.f164949b;
            str3.getClass();
            abqo6.f57977a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            abqo6.f57988m = str3;
        }
        String str4 = registerSectionInfo.f9647b;
        if ("date".equals(str4)) {
            i = 2;
        } else if ("location".equals(str4)) {
            i = 3;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abqo abqo7 = (abqo) da.f164949b;
        abqo7.f57991p = i - 1;
        abqo7.f57977a |= 2048;
        return (abqo) da.mo74062i();
    }

    /* renamed from: b */
    public static Map m48654b(absr absr) {
        return m48652a(absr, abzl.f58808a);
    }

    /* renamed from: c */
    public static Map m48655c(absr absr) {
        return m48652a(absr, abzl.f58809b);
    }

    /* renamed from: d */
    public static boolean m48656d(absr absr) {
        bxwc bxwc = absr.f58145j;
        int size = bxwc.size();
        int i = 0;
        while (i < size) {
            int a = abqh.m48072a(((abqo) bxwc.get(i)).f57990o);
            if (a == 0) {
                a = 1;
            }
            i++;
            if (a != 1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m48657e(absr absr) {
        return abww.m48413a(absr.f58138c);
    }

    /* renamed from: f */
    public static boolean m48658f(absr absr) {
        return absr.f58138c.startsWith(".implicit:");
    }

    /* renamed from: g */
    public static Feature[] m48659g(absr absr) {
        if (!absr.f58148m) {
            return new Feature[0];
        }
        return new Feature[]{frm.m12227a()};
    }

    /* renamed from: h */
    public static RegisterCorpusInfo m48660h(absr absr) {
        fry a = RegisterCorpusInfo.m6149a(absr.f58138c);
        a.f17166a = absr.f58139d;
        a.mo11231a(absr.f58141f);
        bxwc bxwc = absr.f58146k;
        Feature[] g = m48659g(absr);
        frk frk = new frk();
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            abut abut = (abut) bxwc.get(i);
            frk.mo11201a(fro.m12230a(abut.f58466b), abut.f58468d);
        }
        frk.mo11202a(g);
        a.f17169d = frk.mo11200a();
        a.f17170e = absr.f58142g;
        a.f17175j = absr.f58153r;
        String str = absr.f58152q;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        a.f17173h = str;
        if (!absr.f58151p.isEmpty() || !absr.f58150o.isEmpty()) {
            a.f17171f = new Account(absr.f58151p, absr.f58150o);
        }
        bxwc bxwc2 = absr.f58145j;
        int size2 = bxwc2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            abqo abqo = (abqo) bxwc2.get(i2);
            Map map = f58812i;
            abql a2 = abql.m48076a(abqo.f57980d);
            if (a2 == null) {
                a2 = abql.TOKENIZER_TEXT;
            }
            String str2 = (String) map.get(a2);
            if (str2 == null) {
                str2 = "plain";
            }
            fsa a3 = RegisterSectionInfo.m6151a(abqo.f57978b);
            a3.f17178a = str2;
            a3.f17179b = !abqo.f57979c;
            a3.f17180c = abqo.f57981e;
            a3.f17181d = abqo.f57982f;
            a3.f17182e = abqo.f57983g;
            fsj a4 = ScoringConfig.m6153a();
            a4.f17188a = abqo.f57992q;
            a3.f17184g = a4.mo11246a();
            if (!abqo.f57988m.isEmpty()) {
                a3.f17183f = abqo.f57988m;
            }
            if (new bxvv(abqo.f57984h, abqo.f57974i).contains(abqn.VARIANT_NICKNAME)) {
                a3.mo11235a(fsq.m12257a());
            }
            if (new bxvv(abqo.f57984h, abqo.f57974i).contains(abqn.VARIANT_ANNOTATION)) {
                a3.mo11235a(fsq.m12258a((String[]) abqo.f57985j.toArray(new String[0])));
            }
            int a5 = abqh.m48072a(abqo.f57990o);
            if (a5 != 0 && a5 == 2) {
                a3.mo11235a(fsq.m12261b());
            } else {
                int a6 = abqh.m48072a(abqo.f57990o);
                if (a6 != 0 && a6 == 3) {
                    a3.mo11235a(fsq.m12263c());
                }
            }
            a.mo11230a(a3);
        }
        return a.mo11228a();
    }

    /* renamed from: b */
    public final abss mo32534b(acak acak) {
        abss abss;
        synchronized (mo32525a()) {
            abss = (abss) this.f58817f.get(acak);
            if (abss == null) {
                abss = null;
            }
        }
        return abss;
    }

    /* renamed from: c */
    public final abzr mo32540c(acak acak) {
        abss b = mo32534b(acak);
        if (b == null) {
            return null;
        }
        absr absr = b.f58157b;
        if (absr == null) {
            absr = absr.f58134s;
        }
        int i = absr.f58147l;
        absr absr2 = b.f58157b;
        if (absr2 == null) {
            absr2 = absr.f58134s;
        }
        return abzr.m48711a(i, b, absr2.f58149n);
    }

    /* renamed from: e */
    public final abzr mo32545e(acak acak) {
        abzr c = mo32540c(acak);
        if (c == null) {
            return null;
        }
        absr absr = ((abss) c.mo32560c()).f58157b;
        if (absr == null) {
            absr = absr.f58134s;
        }
        return c.mo32554a(absr);
    }

    /* renamed from: f */
    public final absy mo32547f(acak acak) {
        absy a;
        synchronized (mo32525a()) {
            a = mo32522a(acak, absy.f58176h);
        }
        return a;
    }

    /* renamed from: b */
    public final abzn mo32535b(abyy abyy, String[] strArr, boolean z, String str) {
        HashSet hashSet;
        HashSet hashSet2;
        if (strArr != null) {
            hashSet = new HashSet(Arrays.asList(strArr));
        } else {
            hashSet = null;
        }
        if (!abyy.f58776b) {
            HashSet hashSet3 = new HashSet();
            for (abyv abyv : this.f58814c.mo32502b(abyy)) {
                synchronized (mo32525a()) {
                    for (acak acak : abyv.mo32462a()) {
                        abss abss = (abss) this.f58817f.get(acak);
                        if (abss != null) {
                            hashSet3.add(abss);
                        }
                    }
                }
            }
            hashSet2 = hashSet3;
        } else {
            hashSet2 = null;
        }
        return mo32523a(new abzc(this, hashSet, str, hashSet2, abyy, z));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        return r3;
     */
    /* renamed from: d */
    public final absr mo32543d(acak acak) {
        synchronized (mo32525a()) {
            abss abss = (abss) this.f58817f.get(acak);
            if (abss == null) {
                return null;
            }
            absr absr = abss.f58157b;
            if (absr == null) {
                absr = absr.f58134s;
            }
        }
    }

    /* renamed from: e */
    public final SparseIntArray mo32546e() {
        SparseIntArray sparseIntArray;
        int i;
        synchronized (mo32525a()) {
            sparseIntArray = new SparseIntArray(this.f58817f.size());
            for (abss abss : this.f58817f.values()) {
                absr absr = abss.f58157b;
                if (absr == null) {
                    absr = absr.f58134s;
                }
                if (((Boolean) abzt.f58944bf.mo58455c()).booleanValue() && (i = absr.f58153r) > 0) {
                    Integer valueOf = Integer.valueOf(i);
                    if (m48657e(absr)) {
                        if (((Integer) abzt.f58945bg.mo58455c()).intValue() > 0) {
                            abww a = abww.m48411a(absr.f58138c, absr.f58140e, abxt.m48504a(this.f58819j));
                            if (a != null) {
                                valueOf = Integer.valueOf(Math.min(a.f58661a.f58532c, Math.min(valueOf.intValue(), ((Integer) abzt.f58945bg.mo58455c()).intValue())));
                            }
                        }
                    }
                    sparseIntArray.put(absr.f58137b, valueOf.intValue());
                } else if (m48658f(absr)) {
                    sparseIntArray.put(absr.f58137b, Integer.valueOf(f58810a).intValue());
                }
            }
        }
        return sparseIntArray;
    }

    /* renamed from: c */
    public final bngx mo32541c() {
        bngx a;
        synchronized (mo32525a()) {
            bngs b = bngx.m109371b(this.f58817f.size());
            for (abss abss : this.f58817f.values()) {
                absy absy = abss.f58158c;
                if (absy == null) {
                    absy = absy.f58176h;
                }
                int a2 = absx.m48236a(absy.f58180c);
                if (a2 != 0) {
                    if (a2 != 1) {
                    }
                }
                absr absr = abss.f58157b;
                if (absr == null) {
                    absr = absr.f58134s;
                }
                b.mo67668c(absr);
            }
            a = b.mo67664a();
        }
        return a;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: abzm.a(abyy, java.lang.String[], boolean, java.lang.String):java.util.Set
     arg types: [abyy, ?[OBJECT, ARRAY], int, java.lang.String]
     candidates:
      abzm.a(acak, java.util.List, java.lang.Integer, absv):void
      abzm.a(abyy, java.lang.String[], boolean, java.lang.String):java.util.Set */
    /* renamed from: b */
    public final bngx mo32536b(abyy abyy, int i) {
        bngx a;
        synchronized (mo32525a()) {
            bngs j = bngx.m109377j();
            for (acak acak : mo32528a(abyy, (String[]) null, false, abyy.f58780f)) {
                abzr c = mo32540c(acak);
                if (c != null) {
                    absr absr = ((abss) c.mo32560c()).f58157b;
                    if (absr == null) {
                        absr = absr.f58134s;
                    }
                    if (absr.f58140e.equals(abyy.f58780f)) {
                        if (i != -1) {
                            if (i != c.mo32553a()) {
                            }
                        }
                        j.mo67668c((abss) c.mo32560c());
                    }
                }
            }
            a = j.mo67664a();
        }
        return a;
    }

    /* renamed from: d */
    public final bnic mo32544d() {
        bnic bnic;
        synchronized (mo32525a()) {
            bnic = mo32523a(abzb.f58785a).f58821a;
        }
        return bnic;
    }

    /* renamed from: c */
    public final void mo32542c(acak acak, absy absy) {
        synchronized (mo32525a()) {
            abss abss = (abss) this.f58817f.get(acak);
            if (abss != null) {
                bxvd bxvd = (bxvd) abss.mo74142c(5);
                bxvd.mo73625a((bxvk) abss);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                abss abss2 = (abss) bxvd.f164949b;
                absy.getClass();
                abss2.f58158c = absy;
                abss2.f58156a |= 2;
                abss abss3 = (abss) bxvd.mo74062i();
                this.f58817f.put(acak, abss3);
                this.f58818g = true;
                acam acam = this.f58813b;
                String valueOf = String.valueOf(((acan) acam).mo32590a(new acak(abss3)));
                ((acan) acam).f59109a.edit().putString(valueOf.length() == 0 ? new String("corpuskey:") : "corpuskey:".concat(valueOf), acky.m49362a(abss3)).apply();
                return;
            }
            absg.m48192b("Cannot set status for non-existent key: %s", acak.mo32584b());
        }
    }

    /* renamed from: b */
    public final bnic mo32537b() {
        return mo32523a(abzg.f58795g).f58821a;
    }

    /* renamed from: b */
    public final void mo32538b(abss abss) {
        acak acak = new acak(abss);
        this.f58817f.put(acak, abss);
        this.f58818g = true;
        absr absr = abss.f58157b;
        if (absr == null) {
            absr = absr.f58134s;
        }
        abyv c = this.f58814c.mo32505c(absr.f58140e);
        synchronized (c.f58764e) {
            c.f58765f.add(acak);
        }
    }

    /* renamed from: b */
    public final void mo32539b(acak acak, absy absy) {
        abss abss = (abss) this.f58817f.get(acak);
        if (abss != null) {
            Map map = this.f58817f;
            bxvd bxvd = (bxvd) abss.mo74142c(5);
            bxvd.mo73625a((bxvk) abss);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            abss abss2 = (abss) bxvd.f164949b;
            absy.getClass();
            abss2.f58158c = absy;
            abss2.f58156a |= 2;
            map.put(acak, (abss) bxvd.mo74062i());
        }
    }

    /* renamed from: a */
    public static absr m48649a(abyv abyv, RegisterCorpusInfo registerCorpusInfo) {
        String str = abyv.f58761b;
        bxvd da = absr.f58134s.mo74144da();
        String b = bmxx.m108578b(registerCorpusInfo.f9635a);
        int i = 0;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        absr absr = (absr) da.f164949b;
        b.getClass();
        int i2 = absr.f58136a | 2;
        absr.f58136a = i2;
        absr.f58138c = b;
        str.getClass();
        absr.f58136a = i2 | 8;
        absr.f58140e = str;
        String b2 = bmxx.m108578b(registerCorpusInfo.f9636b);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        absr absr2 = (absr) da.f164949b;
        b2.getClass();
        absr2.f58136a |= 4;
        absr2.f58139d = b2;
        String uri = registerCorpusInfo.f9637c.toString();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        absr absr3 = (absr) da.f164949b;
        uri.getClass();
        int i3 = absr3.f58136a | 16;
        absr3.f58136a = i3;
        absr3.f58141f = uri;
        boolean z = registerCorpusInfo.f9640f;
        int i4 = i3 | 32;
        absr3.f58136a = i4;
        absr3.f58142g = z;
        int i5 = registerCorpusInfo.f9645k;
        absr3.f58136a = i4 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        absr3.f58153r = i5;
        GlobalSearchCorpusConfig globalSearchCorpusConfig = registerCorpusInfo.f9639e;
        boolean z2 = true;
        if (globalSearchCorpusConfig == null) {
            z2 = false;
        } else if (Feature.m6140a(1, globalSearchCorpusConfig.f9571b) == null) {
            z2 = false;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        absr absr4 = (absr) da.f164949b;
        absr4.f58136a |= 512;
        absr4.f58148m = z2;
        Account account = registerCorpusInfo.f9641g;
        if (account != null && account.type != null && registerCorpusInfo.f9641g.name != null) {
            String str2 = registerCorpusInfo.f9641g.type;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            absr absr5 = (absr) da.f164949b;
            str2.getClass();
            absr5.f58136a |= 2048;
            absr5.f58150o = str2;
            String str3 = registerCorpusInfo.f9641g.name;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            absr absr6 = (absr) da.f164949b;
            str3.getClass();
            absr6.f58136a |= 4096;
            absr6.f58151p = str3;
        } else if (((absr) da.f164949b).f58140e.equals("com.google.android.gm") && registerCorpusInfo.f9635a != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            absr absr7 = (absr) da.f164949b;
            "com.google".getClass();
            int i6 = absr7.f58136a | 2048;
            absr7.f58136a = i6;
            absr7.f58150o = "com.google";
            String str4 = registerCorpusInfo.f9635a;
            str4.getClass();
            absr7.f58136a = i6 | 4096;
            absr7.f58151p = str4;
        }
        String str5 = registerCorpusInfo.f9643i;
        if (str5 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            absr absr8 = (absr) da.f164949b;
            str5.getClass();
            absr8.f58136a |= 8192;
            absr8.f58152q = str5;
        }
        while (true) {
            RegisterSectionInfo[] registerSectionInfoArr = registerCorpusInfo.f9638d;
            if (i >= registerSectionInfoArr.length) {
                return (absr) da.mo74062i();
            }
            da.mo73980a(m48648a(registerSectionInfoArr[i]));
            i++;
        }
    }

    /* renamed from: a */
    public static absr m48650a(String str, abqe abqe) {
        bxvd da = absr.f58134s.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        absr absr = (absr) da.f164949b;
        ".implicit:".getClass();
        int i = absr.f58136a | 2;
        absr.f58136a = i;
        absr.f58138c = ".implicit:";
        str.getClass();
        absr.f58136a = i | 8;
        absr.f58140e = str;
        for (int i2 = 0; i2 < abqe.f57955e.size(); i2++) {
            abqo abqo = ((abqd) abqe.f57955e.get(i2)).f57948d;
            if (abqo == null) {
                abqo = abqo.f57975r;
            }
            int i3 = abqo.f57989n;
            da.mo73980a(abqo);
            if (i3 != DocumentSection.f9541a) {
                abut a = acbf.m48809a(i3, new abur[]{acbf.m48805a(i2)});
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                absr absr2 = (absr) da.f164949b;
                a.getClass();
                absr2.mo32342b();
                absr2.f58146k.add(a);
            }
        }
        return (absr) da.mo74062i();
    }

    /* renamed from: a */
    public static List m48651a(List list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.remove(abqn.VARIANT_ANNOTATION);
        return arrayList;
    }

    /* renamed from: a */
    private static Map m48652a(absr absr, abzl abzl) {
        int size = absr.f58145j.size();
        HashMap hashMap = new HashMap(size);
        for (int i = 0; i < size; i++) {
            abqo abqo = (abqo) absr.f58145j.get(i);
            String a = abzl.mo32520a(absr, abqo);
            if (!TextUtils.isEmpty(a)) {
                hashMap.put(a, new abzi(i, abqo));
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static boolean m48653a(absr absr) {
        return !absr.f58141f.isEmpty();
    }

    /* renamed from: a */
    public final abss mo32521a(abss abss) {
        absr absr = abss.f58157b;
        if (absr == null) {
            absr = absr.f58134s;
        }
        if ("com.google.android.gm".equals(absr.f58140e)) {
            absr absr2 = abss.f58157b;
            if (absr2 == null) {
                absr2 = absr.f58134s;
            }
            if (absr2.f58138c.startsWith("messages")) {
                absr absr3 = abss.f58157b;
                if (absr3 == null) {
                    absr3 = absr.f58134s;
                }
                if (absr3.f58146k.isEmpty()) {
                    bxvd bxvd = (bxvd) abss.mo74142c(5);
                    bxvd.mo73625a((bxvk) abss);
                    absr absr4 = abss.f58157b;
                    if (absr4 == null) {
                        absr4 = absr.f58134s;
                    }
                    bxvd bxvd2 = (bxvd) absr4.mo74142c(5);
                    bxvd2.mo73625a((bxvk) absr4);
                    bxvd2.mo73949L(Arrays.asList(acbf.m48809a(0, new abur[]{acbf.m48805a(0)}), acbf.m48809a(1, new abur[]{acbf.m48805a(2)}), acbf.m48809a(3, new abur[]{acbf.m48806a("android.intent.action.VIEW")}), acbf.m48809a(4, new abur[]{acbf.m48805a(6)})));
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    abss abss2 = (abss) bxvd.f164949b;
                    absr absr5 = (absr) bxvd2.mo74062i();
                    abss abss3 = abss.f58154d;
                    absr5.getClass();
                    abss2.f58157b = absr5;
                    abss2.f58156a |= 1;
                    return (abss) bxvd.mo74062i();
                }
            }
        }
        return abss;
    }

    /* renamed from: a */
    public final absy mo32522a(acak acak, absy absy) {
        abss abss = (abss) this.f58817f.get(acak);
        if (abss == null) {
            return absy;
        }
        absy absy2 = abss.f58158c;
        return absy2 == null ? absy.f58176h : absy2;
    }

    /* renamed from: a */
    public final abzn mo32523a(abzg abzg) {
        abzn abzn;
        synchronized (mo32525a()) {
            bnia bnia = new bnia();
            bnia bnia2 = new bnia();
            for (Map.Entry entry : this.f58817f.entrySet()) {
                abss abss = (abss) entry.getValue();
                absy absy = abss.f58158c;
                if (absy == null) {
                    absy = absy.f58176h;
                }
                int a = absx.m48236a(absy.f58180c);
                if (a != 0) {
                    if (a != 1) {
                        continue;
                    }
                }
                int a2 = abzg.mo32515a(abss);
                if (a2 == 0) {
                    throw null;
                } else if (a2 == 1) {
                    bnia.mo67629b((acak) entry.getKey());
                } else if (a2 == 0) {
                    throw null;
                } else if (a2 != 2) {
                    bnia2.mo67629b((acak) entry.getKey());
                }
            }
            abzn = new abzn(bnia.mo67751a(), bnia2.mo67751a());
        }
        return abzn;
    }

    /* renamed from: a */
    public final bngx mo32524a(abyv abyv) {
        bngx a;
        synchronized (mo32525a()) {
            Set<acak> a2 = abyv.mo32462a();
            bngs b = bngx.m109371b(a2.size());
            for (acak acak : a2) {
                abss abss = (abss) this.f58817f.get(acak);
                if (abss != null) {
                    absy absy = abss.f58158c;
                    if (absy == null) {
                        absy = absy.f58176h;
                    }
                    int a3 = absx.m48236a(absy.f58180c);
                    if (a3 == 0 || a3 == 1) {
                        b.mo67668c(acak);
                    }
                }
            }
            a = b.mo67664a();
        }
        return a;
    }

    /* renamed from: a */
    public final Object mo32525a() {
        return this.f58814c.f58772a.f58767a.f60625g;
    }

    /* renamed from: a */
    public final String mo32526a(acak acak) {
        synchronized (mo32525a()) {
            absr d = mo32543d(acak);
            if (d == null) {
                return null;
            }
            byte[] bytes = d.f58140e.getBytes(Charset.defaultCharset());
            byte[] bytes2 = d.f58138c.getBytes(Charset.defaultCharset());
            Mac mac = ((acan) this.f58813b).f59111c;
            mac.reset();
            mac.update(bytes);
            mac.update((byte) 45);
            mac.update(bytes2);
            String d2 = srv.m36164d(mac.doFinal());
            String hexString = Long.toHexString(d.f58143h);
            StringBuilder sb = new StringBuilder(String.valueOf(d2).length() + 1 + String.valueOf(hexString).length());
            sb.append(d2);
            sb.append("-");
            sb.append(hexString);
            String sb2 = sb.toString();
            return sb2;
        }
    }

    /* renamed from: a */
    public final List mo32527a(abyy abyy, GlobalSearchQuerySpecification globalSearchQuerySpecification, boolean z) {
        boolean z2;
        abzh abzh;
        Set set;
        sdo.m34970a(Thread.holdsLock(mo32525a()));
        if (z) {
            z2 = true;
        } else {
            z2 = abyy != null;
        }
        sdo.m34974b(z2);
        bngx c = mo32541c();
        boolean a = this.f58814c.f58772a.mo32490a();
        ArrayList arrayList = new ArrayList(c.size());
        bnre i = c.listIterator();
        while (i.hasNext()) {
            absr absr = (absr) i.next();
            if (absr.f58146k.isEmpty()) {
                abzh = abzh.NO_UNIVERSAL_SECTION_MAPPING;
            } else {
                if (globalSearchQuerySpecification != null) {
                    String str = absr.f58140e;
                    String str2 = absr.f58138c;
                    Map map = globalSearchQuerySpecification.f9590s;
                    if (map != null && ((set = (Set) map.get(str)) == null || (!set.isEmpty() && !set.contains(str2)))) {
                        abzh = abzh.FILTERED_BY_SPEC;
                    } else if (globalSearchQuerySpecification.f9576e == 3 && !m48656d(absr)) {
                        abzh = abzh.NOT_OMNIBOX_CORPUS_IN_CHROME_OMNIBOX;
                    }
                }
                if (!z && !mo32532a(abyy, absr)) {
                    abzh = abzh.NOT_AUTHORIZED_FOR_INTERNAL_CORPUS;
                } else if (this.f58814c.mo32509e(absr.f58140e)) {
                    abyv d = this.f58814c.mo32506d(absr.f58140e);
                    if (d == null) {
                        abzh = abzh.CLIENT_NOT_EXIST;
                    } else if (m48657e(absr) && !abzt.m48729c(absr.f58140e)) {
                        abzh = abzh.CONTENT_CORPUS_NOT_ENABLED;
                    } else if (!z && !d.mo32468a(absr.f58138c, a)) {
                        abzh = abzh.SETTINGS_USER_DISABLED;
                    } else {
                        abzh = abzh.OK;
                    }
                } else {
                    abzh = abzh.PACKAGE_NOT_GLOBALLY_SEARCHABLE;
                }
            }
            if (!abzh.equals(abzh.OK)) {
                absg.m48208e("CorpusConfig package name : %s, Corpus name : %s is not active for global search due to %s.", absr.f58140e, absr.f58138c, abzh);
            } else {
                arrayList.add(absr);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final Set mo32528a(abyy abyy, String[] strArr, boolean z, String str) {
        return mo32535b(abyy, strArr, z, str).f58821a;
    }

    /* renamed from: a */
    public final void mo32529a(acak acak, abzr abzr) {
        try {
            mo32530a(acak, abzr, (abrp) null);
        } catch (acat e) {
        }
    }

    /* renamed from: a */
    public final void mo32530a(acak acak, abzr abzr, abrp abrp) {
        abzr abzr2;
        long j;
        int i;
        long j2;
        abrp abrp2 = abrp;
        synchronized (mo32525a()) {
            absg.m48185a("Setting config for %s", acak.mo32584b());
            abss abss = (abss) this.f58817f.get(acak);
            if (abss == null) {
                BitSet bitSet = new BitSet();
                for (abss abss2 : this.f58817f.values()) {
                    absr absr = abss2.f58157b;
                    if (absr == null) {
                        absr = absr.f58134s;
                    }
                    bitSet.set(absr.f58137b);
                }
                if (bitSet.length() == bitSet.cardinality()) {
                    i = bitSet.length();
                } else {
                    int i2 = 0;
                    while (i2 < bitSet.length() && bitSet.get(i2)) {
                        i2++;
                    }
                    i = i2;
                }
                if (i <= 65534) {
                    if (this.f58820k == null) {
                        this.f58820k = new SecureRandom();
                    }
                    j = this.f58820k.nextLong();
                    abzr2 = abzr.m48711a(0, abss.f58154d, 0);
                } else {
                    throw new acaq("Too many corpora");
                }
            } else {
                absr absr2 = abss.f58157b;
                if (absr2 == null) {
                    absr2 = absr.f58134s;
                }
                int i3 = absr2.f58137b;
                absr absr3 = abss.f58157b;
                if (absr3 == null) {
                    absr3 = absr.f58134s;
                }
                long j3 = absr3.f58143h;
                absr absr4 = abss.f58157b;
                if (absr4 == null) {
                    absr4 = absr.f58134s;
                }
                int i4 = absr4.f58147l;
                absr absr5 = abss.f58157b;
                if (absr5 == null) {
                    absr5 = absr.f58134s;
                }
                abzr2 = abzr.m48711a(i4, abss, absr5.f58149n);
                i = i3;
                j = j3;
            }
            if (!abzr2.mo32558a(abzr)) {
                String d = abzr.mo32561d();
                String d2 = abzr2.mo32561d();
                StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 38 + String.valueOf(d2).length());
                sb.append("CorpusConfig: cannot ");
                sb.append(d);
                sb.append(" when previously ");
                sb.append(d2);
                throw new acaq(sb.toString());
            } else if (((absr) abzr.mo32560c()).f58138c.isEmpty() || ((absr) abzr.mo32560c()).f58140e.isEmpty()) {
                throw new acaq("Need name and package name");
            } else {
                abss abss3 = (abss) abzr2.mo32560c();
                bxvd bxvd = (bxvd) abss3.mo74142c(5);
                bxvd.mo73625a((bxvk) abss3);
                absr absr6 = (absr) abzr.mo32560c();
                bxvd bxvd2 = (bxvd) absr6.mo74142c(5);
                bxvd2.mo73625a((bxvk) absr6);
                int a = abzr.mo32553a();
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                absr absr7 = (absr) bxvd2.f164949b;
                absr absr8 = absr.f58134s;
                absr7.f58136a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                absr7.f58147l = a;
                long b = abzr.mo32559b();
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                absr absr9 = (absr) bxvd2.f164949b;
                int i5 = absr9.f58136a | 1024;
                absr9.f58136a = i5;
                absr9.f58149n = b;
                int i6 = i5 | 1;
                absr9.f58136a = i6;
                absr9.f58137b = i;
                absr9.f58136a = i6 | 64;
                absr9.f58143h = j;
                String str = ((absr) abzr.mo32560c()).f58140e;
                String str2 = ((absr) abzr.mo32560c()).f58138c;
                String str3 = ((absr) abzr.mo32560c()).f58139d;
                synchronized (mo32525a()) {
                    Mac mac = ((acan) this.f58813b).f59111c;
                    mac.reset();
                    mac.update(str2.getBytes(Charset.defaultCharset()));
                    mac.update((byte) 45);
                    mac.update(str.getBytes(Charset.defaultCharset()));
                    mac.update((byte) 45);
                    mac.update(str3.getBytes(Charset.defaultCharset()));
                    byte[] doFinal = mac.doFinal();
                    j2 = (long) (doFinal[7] & Byte.MAX_VALUE);
                    for (int i7 = 6; i7 >= 0; i7--) {
                        j2 = (j2 << 8) + ((long) (doFinal[i7] & 255));
                    }
                }
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                absr absr10 = (absr) bxvd2.f164949b;
                absr10.f58136a |= 128;
                absr10.f58144i = j2;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                abss abss4 = (abss) bxvd.f164949b;
                absr absr11 = (absr) bxvd2.mo74062i();
                absr11.getClass();
                abss4.f58157b = absr11;
                abss4.f58156a |= 1;
                abss abss5 = (abss) bxvd.mo74062i();
                if (abrp2 != null) {
                    absr absr12 = abss5.f58157b;
                    if (absr12 == null) {
                        absr12 = absr.f58134s;
                    }
                    if (!abrp2.f58047a.f58078n.mo43402a(absr12.f58144i, absr12.f58137b, abrv.m48116b(m48656d(absr12)))) {
                        abrp2.f58047a.f58083s.mo32447a("pre_corpus_config_committed_add_corpus_failed");
                        throw new acat("Could not add new corpus");
                    }
                }
                abss a2 = mo32521a(abss5);
                mo32538b(a2);
                if (!this.f58813b.mo32589a(a2)) {
                    this.f58816e.mo32447a("metadata_union_writeMetadata_err");
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo32531a(acak acak, List list, Integer num, absv absv) {
        synchronized (mo32525a()) {
            absy a = mo32522a(acak, (absy) null);
            if (a != null) {
                bxvd bxvd = (bxvd) a.mo74142c(5);
                bxvd.mo73625a((bxvk) a);
                if (list != null && !list.equals(a.f58179b)) {
                    this.f58818g = true;
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    ((absy) bxvd.f164949b).f58179b = bxvk.m124030de();
                    bxvd.mo73950M(list);
                }
                if (!(num == null || a.f58182e == num.intValue())) {
                    this.f58818g = true;
                    int intValue = num.intValue();
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    absy absy = (absy) bxvd.f164949b;
                    absy.f58178a |= 16;
                    absy.f58182e = intValue;
                }
                if (absv != null) {
                    absv absv2 = a.f58183f;
                    if (absv2 == null) {
                        absv2 = absv.f58170d;
                    }
                    if (!absv.equals(absv2)) {
                        this.f58818g = true;
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        absy absy2 = (absy) bxvd.f164949b;
                        absv.getClass();
                        absy2.f58183f = absv;
                        absy2.f58178a |= 32;
                    }
                }
                mo32539b(acak, (absy) bxvd.mo74062i());
                return;
            }
            absg.m48192b("Cannot set status for non-existent key: %s", acak.mo32584b());
        }
    }

    /* renamed from: a */
    public final boolean mo32532a(abyy abyy, absr absr) {
        if (!"com.google.android.gms".equals(absr.f58140e)) {
            return true;
        }
        if (abyy == null) {
            return false;
        }
        acxb acxb = this.f58815d;
        String str = abyy.f58780f;
        int i = abyy.f58775a;
        String str2 = (String) acnk.f60241f.get(absr.f58138c);
        if (str2 == null) {
            return true;
        }
        ClientContext clientContext = new ClientContext();
        clientContext.f30215e = str;
        clientContext.f30212b = i;
        if (sfr.m35174a(acxb.f61001a, clientContext).mo25481a(str2) != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final String[] mo32533a(abyy abyy, int i) {
        bngx b = mo32536b(abyy, i);
        int size = b.size();
        String[] strArr = new String[size];
        for (int i2 = 0; i2 < size; i2++) {
            absr absr = ((abss) b.get(i2)).f58157b;
            if (absr == null) {
                absr = absr.f58134s;
            }
            strArr[i2] = absr.f58138c;
        }
        return strArr;
    }
}
