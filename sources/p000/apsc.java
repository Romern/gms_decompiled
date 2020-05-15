package p000;

import com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.queries.GlobalQueryCall$Request;
import com.google.android.gms.search.queries.GlobalQueryCall$Response;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: apsc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class apsc extends aplq {

    /* renamed from: a */
    public final abrv f84809a;

    /* renamed from: b */
    private final acxl f84810b;

    /* renamed from: c */
    private final boolean f84811c;

    /* renamed from: d */
    private final boolean f84812d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public apsc(abrv abrv, GlobalQueryCall$Request globalQueryCall$Request, abyy abyy) {
        super(bqbd.GLOBAL_QUERY, 1, 1, abrv.f58066b, globalQueryCall$Request, abyy);
        int i;
        boolean z = true;
        this.f84809a = abrv;
        bpzh bpzh = bpzh.QUERY_UNIVERSAL;
        GlobalSearchQuerySpecification globalSearchQuerySpecification = globalQueryCall$Request.f107472d;
        if (globalSearchQuerySpecification != null) {
            i = globalSearchQuerySpecification.f9576e;
        } else {
            i = 1;
        }
        acxl acxl = new acxl(bpzh, acky.m49364b(i));
        this.f84810b = acxl;
        acxl.mo33202a();
        this.f84811c = abrv.f58083s.mo32454b();
        this.f84812d = globalQueryCall$Request.f107473e == null ? false : z;
    }

    /* renamed from: a */
    private static final GlobalQueryCall$Response m70891a(int i, String str) {
        GlobalQueryCall$Response globalQueryCall$Response = new GlobalQueryCall$Response();
        globalQueryCall$Response.f107474a = new Status(i, str, null);
        globalQueryCall$Response.f107475b = fsh.m12246b(str);
        return globalQueryCall$Response;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final String mo33000f() {
        return String.format("%s, query[%s]", super.mo33000f(), ((GlobalQueryCall$Request) this.f84708n).f107469a);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: abrv.a(abyy, com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification, boolean):java.util.List
     arg types: [abyy, com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification, int]
     candidates:
      abrv.a(abyy, java.lang.String, java.lang.String):absr
      abrv.a(abyy, com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification, boolean):java.util.List */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02e0, code lost:
        r3 = r15.f59418a;
        r3 = r13.mo7197a(r3.f58140e, r3.f58138c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02ea, code lost:
        if (r3 != null) goto L_0x02ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02ec, code lost:
        r34 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02f1, code lost:
        if (r13.f9579h == false) goto L_0x030f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02f3, code lost:
        r7 = r3.f9522c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02f7, code lost:
        if (r9.f164950c != false) goto L_0x02fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02fa, code lost:
        r9.mo74035c();
        r9.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0300, code lost:
        r10 = (p000.abtu) r9.f164949b;
        r34 = r4;
        r10.f58312a |= 4;
        r10.f58317f = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x030f, code lost:
        r34 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0311, code lost:
        r10 = (double) r11;
        java.lang.Double.isNaN(r10);
        r10 = 1.0d / r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0319, code lost:
        if (r9.f164950c != false) goto L_0x031c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x031c, code lost:
        r9.mo74035c();
        r9.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0322, code lost:
        r7 = (p000.abtu) r9.f164949b;
        r4 = r7.f58312a | 2;
        r7.f58312a = r4;
        r7.f58316e = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0330, code lost:
        if (r3 != null) goto L_0x0335;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0332, code lost:
        r35 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0337, code lost:
        r35 = r2;
        r1 = (double) r3.f9521b;
        java.lang.Double.isNaN(r1);
        r10 = r10 * r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:?, code lost:
        r7.f58312a = r4 | 2;
        r7.f58316e = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0351, code lost:
        if (((java.lang.Boolean) p000.abzt.f58846N.mo58455c()).booleanValue() == false) goto L_0x03be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0353, code lost:
        r1 = r13.f9584m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0355, code lost:
        if (r1 == null) goto L_0x03be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0358, code lost:
        if (r1.length <= 0) goto L_0x03be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x035a, code lost:
        r1 = new java.util.ArrayList();
        r2 = p000.abzm.m48654b(r15.f59418a).entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0371, code lost:
        if (r2.hasNext() == false) goto L_0x03bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0373, code lost:
        r3 = (p000.abzi) ((java.util.Map.Entry) r2.next()).getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0390, code lost:
        if (new p000.bxvv(r3.f58807b.f57984h, p000.abqo.f57974i).contains(p000.abqn.f57971c) == false) goto L_0x036d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0392, code lost:
        r4 = p000.abub.f58337e.mo74144da();
        r3 = r3.f58806a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x039c, code lost:
        if (r4.f164950c != false) goto L_0x039f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x039f, code lost:
        r4.mo74035c();
        r4.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x03a5, code lost:
        r10 = (p000.abub) r4.f164949b;
        r10.f58339a |= 1;
        r10.f58340b = r3;
        r1.add((p000.abub) r4.mo74062i());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x03bb, code lost:
        r9.mo73955R(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x03be, code lost:
        r1 = r15.f59418a.f58140e;
        r2 = r12.f60617a.f60625g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x03c6, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03cb, code lost:
        if (p000.cemw.m137399g() == false) goto L_0x03e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03d5, code lost:
        if (r12.f60617a.f60623e.isEmpty() == false) goto L_0x03e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x03df, code lost:
        if (p000.acrl.m49741b(r12.f60617a.f60619a, r1) != false) goto L_0x03e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x03e1, code lost:
        r3 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03e4, code lost:
        r3 = 1.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x03e6, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x03e8, code lost:
        r1 = (p000.acqm) r12.f60617a.f60623e.get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03f2, code lost:
        if (r1 == null) goto L_0x03f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03f4, code lost:
        r3 = r1.f60502e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03f7, code lost:
        r3 = 1.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03f9, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03fe, code lost:
        if (r3 > 0.0d) goto L_0x0401;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0403, code lost:
        if (r3 >= 1.0d) goto L_0x0431;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:?, code lost:
        r1 = ((p000.abtu) r9.f164949b).f58316e * r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x040f, code lost:
        if (r9.f164950c != false) goto L_0x0412;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0412, code lost:
        r9.mo74035c();
        r9.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0418, code lost:
        r10 = (p000.abtu) r9.f164949b;
        r10.f58312a |= 2;
        r10.f58316e = r1;
        p000.absg.m48203d("Demoted %s by %s", r15.f59418a.f58140e, java.lang.Double.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0431, code lost:
        r6.mo73981a((p000.abtu) r9.mo74062i());
        r1 = p000.acxn.m49955a(r15.f59418a.f58145j);
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x044b, code lost:
        if (r2 >= r15.f59418a.f58145j.size()) goto L_0x0465;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x044d, code lost:
        r3 = r15.f59418a;
        r3 = p000.acxn.m49956a(r3, r2, (p000.abqo) r3.f58145j.get(r2), r1, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x045c, code lost:
        if (r3 != null) goto L_0x045f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x045f, code lost:
        r8.add(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0462, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0465, code lost:
        r14 = r14 + 1;
        r12 = r22;
        r10 = r28;
        r9 = r29;
        r7 = r30;
        r3 = r31;
        r4 = r34;
        r2 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x047c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0480, code lost:
        r35 = r2;
        r31 = r3;
        r34 = r4;
        r30 = r7;
        r6.mo73952O(r8);
        r1 = (p000.abud) r6.mo74062i();
        r3 = (p000.bxvd) r1.mo74142c(5);
        r3.mo73625a((p000.bxvk) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x04a1, code lost:
        if (((p000.abud) r3.f164949b).f58357g <= 0) goto L_0x04cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x04a3, code lost:
        r1 = r22.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x04ab, code lost:
        if (r1.hasNext() == false) goto L_0x04cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x04ad, code lost:
        r6 = (p000.absr) r1.next();
        p000.absg.m48204d("Corpus: %s:%s id %d", r6.f58140e, r6.f58138c, java.lang.Integer.valueOf(r6.f58137b));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x04cf, code lost:
        if (r35 == null) goto L_0x050f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x04d1, code lost:
        r1 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x04d5, code lost:
        if (r1.f9584m == null) goto L_0x0511;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x04e3, code lost:
        if (((java.lang.Boolean) p000.abzt.f58846N.mo58455c()).booleanValue() == false) goto L_0x0511;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x04e5, code lost:
        p000.absg.m48202d("Wanted annotation types [%s]", java.util.Arrays.toString(r1.f9584m));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x04f2, code lost:
        if (r3.f164950c != false) goto L_0x04f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x04f5, code lost:
        r3.mo74035c();
        r3.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x04fb, code lost:
        ((p000.abud) r3.f164949b).f58368r = p000.bxvk.m124028dc();
        r3.mo73953P(p000.bqcn.m112586b(r1.f9584m));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x050f, code lost:
        r1 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0511, code lost:
        if (r1 == null) goto L_0x0658;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0515, code lost:
        if (r1.f9583l == false) goto L_0x0658;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0523, code lost:
        if (((java.lang.Boolean) p000.abzt.f58951bm.mo58455c()).booleanValue() == false) goto L_0x0658;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0525, code lost:
        r6 = new java.util.ArrayList();
        r7 = new java.util.HashMap();
        r8 = new java.util.HashMap();
        r9 = r22.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x053c, code lost:
        if (r9.hasNext() == false) goto L_0x0596;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x053e, code lost:
        r10 = p000.abzm.m48654b((p000.absr) r9.next()).entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0554, code lost:
        if (r10.hasNext() == false) goto L_0x0538;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0556, code lost:
        r11 = (java.util.Map.Entry) r10.next();
        r11 = (java.lang.String) r11.getKey();
        r12 = ((p000.abzi) r11.getValue()).f58806a;
        r13 = (java.util.HashSet) r7.get(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0570, code lost:
        if (r13 == null) goto L_0x0573;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0573, code lost:
        r13 = new java.util.HashSet();
        r7.put(r11, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x057b, code lost:
        r12 = java.lang.Integer.valueOf(r12);
        r13.add(r12);
        r13 = (java.util.HashSet) r8.get(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0588, code lost:
        if (r13 != null) goto L_0x0592;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x058a, code lost:
        r13 = new java.util.HashSet();
        r8.put(r12, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0592, code lost:
        r13.add(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0596, code lost:
        r7 = r7.entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x05a2, code lost:
        if (r7.hasNext() == false) goto L_0x0626;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x05a4, code lost:
        r9 = (java.util.Map.Entry) r7.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x05b5, code lost:
        if (((java.util.HashSet) r9.getValue()).size() != 1) goto L_0x059e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x05b7, code lost:
        r10 = (java.lang.Integer) ((java.util.HashSet) r9.getValue()).iterator().next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x05cb, code lost:
        if (r8.containsKey(r10) == false) goto L_0x059e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x05d8, code lost:
        if (((java.util.HashSet) r8.get(r10)).size() != 1) goto L_0x059e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x05da, code lost:
        r11 = p000.abua.f58332d.mo74144da();
        r9 = (java.lang.String) r9.getKey();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x05e8, code lost:
        if (r11.f164950c != false) goto L_0x05eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x05eb, code lost:
        r11.mo74035c();
        r11.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x05f1, code lost:
        r12 = (p000.abua) r11.f164949b;
        r9.getClass();
        r12.f58334a |= 1;
        r12.f58335b = r9;
        r9 = r10.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0606, code lost:
        if (r11.f164950c != false) goto L_0x0609;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0609, code lost:
        r11.mo74035c();
        r11.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x060f, code lost:
        r10 = (p000.abua) r11.f164949b;
        r10.f58334a |= 2;
        r10.f58336c = r9;
        r6.add((p000.abua) r11.mo74062i());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x062a, code lost:
        if (r6.isEmpty() != false) goto L_0x062d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x062d, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x062e, code lost:
        if (r6 != null) goto L_0x0640;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0630, code lost:
        p000.absg.m48184a("Tried to use section restricts in global query, but sections did not match");
        r2 = m70891a(20000, "Could not merge specified corpora's section for query - corpora are incompatible.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x063d, code lost:
        monitor-exit(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0642, code lost:
        if (r3.f164950c != false) goto L_0x0645;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0645, code lost:
        r3.mo74035c();
        r3.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x064b, code lost:
        ((p000.abud) r3.f164949b).f58353c = p000.bxvk.m124030de();
        r3.mo73951N(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0658, code lost:
        if (r1 != null) goto L_0x065d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x065a, code lost:
        r6 = r50;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x065d, code lost:
        r6 = r50;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0663, code lost:
        if (r6.f84709o.f58776b == false) goto L_0x0666;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x066a, code lost:
        if (p000.cemq.m137368e() == false) goto L_0x0685;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x066c, code lost:
        r7 = r1.f9575d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0670, code lost:
        if (r3.f164950c != false) goto L_0x0673;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0673, code lost:
        r3.mo74035c();
        r3.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0679, code lost:
        r8 = (p000.abud) r3.f164949b;
        r8.f58351a |= 32;
        r8.f58359i = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0685, code lost:
        r7 = r6.f84709o.mo32512a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x068d, code lost:
        if (r3.f164950c != false) goto L_0x0690;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0690, code lost:
        r3.mo74035c();
        r3.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0696, code lost:
        r8 = (p000.abud) r3.f164949b;
        r8.f58351a |= com.google.android.gms.org.conscrypt.PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        r8.f58362l = r7;
        r7 = p000.acky.m49357a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x06a8, code lost:
        if (r3.f164950c != false) goto L_0x06ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x06ab, code lost:
        r3.mo74035c();
        r3.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x06b1, code lost:
        r8 = (p000.abud) r3.f164949b;
        r7.getClass();
        r8.f58365o = r7;
        r8.f58351a |= 2048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x06c4, code lost:
        if (p000.acaw.m48787d() != false) goto L_0x06e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x06c8, code lost:
        if (r3.f164950c != false) goto L_0x06cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x06cb, code lost:
        r3.mo74035c();
        r3.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x06d1, code lost:
        r7 = (p000.abud) r3.f164949b;
        r7.f58351a |= com.google.autofill.detection.p098ml.AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        r7.f58371u = Integer.MAX_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x06e1, code lost:
        if (r1 == null) goto L_0x0729;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x06e5, code lost:
        if (r1.f9576e != 5) goto L_0x0729;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x06e7, code lost:
        r7 = r1.f9586o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x06e9, code lost:
        if (r7 == null) goto L_0x0729;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x06eb, code lost:
        r7 = r7.f9662a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x06ed, code lost:
        if (r7 == null) goto L_0x0729;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x06ef, code lost:
        r8 = p000.abuz.f58503b.mo74144da();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x06f7, code lost:
        if (r8.f164950c != false) goto L_0x06fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x06fa, code lost:
        r8.mo74035c();
        r8.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0700, code lost:
        r7.getClass();
        ((p000.abuz) r8.f164949b).f58505a = r7;
        r7 = (p000.abuz) r8.mo74062i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0711, code lost:
        if (r3.f164950c != false) goto L_0x0714;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0714, code lost:
        r3.mo74035c();
        r3.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x071a, code lost:
        r8 = (p000.abud) r3.f164949b;
        r7.getClass();
        r8.f58369s = r7;
        r8.f58351a |= com.google.autofill.detection.p098ml.AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x072d, code lost:
        if (p000.acaw.m48793j() != false) goto L_0x0731;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0731, code lost:
        if (r1 == null) goto L_0x073b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0736, code lost:
        if (r1.f9576e != 1) goto L_0x0739;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x073b, code lost:
        r7 = p000.acky.m49354a(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0741, code lost:
        if (r3.f164950c != false) goto L_0x0744;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0744, code lost:
        r3.mo74035c();
        r3.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x074a, code lost:
        r8 = (p000.abud) r3.f164949b;
        r8.f58360j = r7 - 1;
        r8.f58351a |= 64;
        r7 = p000.abuz.f58503b.mo74144da();
        r8 = (java.lang.String) p000.abzt.f58973ch.mo58455c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0768, code lost:
        if (r7.f164950c != false) goto L_0x076b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x076b, code lost:
        r7.mo74035c();
        r7.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0771, code lost:
        r8.getClass();
        ((p000.abuz) r7.f164949b).f58505a = r8;
        r7 = (p000.abuz) r7.mo74062i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0782, code lost:
        if (r3.f164950c != false) goto L_0x0785;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0785, code lost:
        r3.mo74035c();
        r3.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x078b, code lost:
        r8 = (p000.abud) r3.f164949b;
        r7.getClass();
        r8.f58369s = r7;
        r8.f58351a |= com.google.autofill.detection.p098ml.AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x07a6, code lost:
        if (((java.lang.Boolean) p000.abzt.f58917bE.mo58455c()).booleanValue() != false) goto L_0x07aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x07aa, code lost:
        r7 = (p000.abpp) p000.abzt.f58916bD.mo58455c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x07b2, code lost:
        if (r7 == null) goto L_0x086e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x07b4, code lost:
        r8 = p000.abpo.f57877b;
        r10 = new java.util.ArrayList();
        r11 = r22.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x07c3, code lost:
        if (r11.hasNext() == false) goto L_0x0850;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x07c5, code lost:
        r12 = (p000.absr) r11.next();
        r13 = r12.f58138c;
        r13.getClass();
        r15 = r7.f57882a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x07d6, code lost:
        if (r15.containsKey(r13) == false) goto L_0x07df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x07d8, code lost:
        r13 = (p000.abpo) r15.get(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x07df, code lost:
        r13 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x07e0, code lost:
        r15 = new java.util.HashSet(r13.f57879a);
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x07ee, code lost:
        if (r13 >= r12.f58145j.size()) goto L_0x0846;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x07fe, code lost:
        if (r15.contains(((p000.abqo) r12.f58145j.get(r13)).f57978b) != false) goto L_0x0805;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x0800, code lost:
        r2 = r7;
        r9 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0805, code lost:
        r4 = p000.abuc.f58343e.mo74144da();
        r9 = r12.f58137b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x080f, code lost:
        if (r4.f164950c != false) goto L_0x0812;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0812, code lost:
        r4.mo74035c();
        r4.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x0818, code lost:
        r14 = (p000.abuc) r4.f164949b;
        r2 = r14.f58345a | 1;
        r14.f58345a = r2;
        r14.f58346b = r9;
        r2 = r2 | 2;
        r14.f58345a = r2;
        r14.f58347c = r13;
        r14.f58345a = r2 | 4;
        r2 = r7;
        r9 = r8;
        r14.f58348d = 0.0d;
        r10.add((p000.abuc) r4.mo74062i());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x083f, code lost:
        r13 = r13 + 1;
        r7 = r2;
        r8 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0846, code lost:
        r7 = r7;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x0854, code lost:
        if (r10.isEmpty() != false) goto L_0x086e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0858, code lost:
        if (r3.f164950c != false) goto L_0x085b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x085b, code lost:
        r3.mo74035c();
        r3.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0861, code lost:
        ((p000.abud) r3.f164949b).f58354d = p000.bxvk.m124030de();
        r3.mo73952O(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x086e, code lost:
        r2 = (p000.abud) r3.mo74062i();
        r6.f84810b.mo33210e();
        r3 = r6.f84809a.f58078n.mo43394a(r31, r2, r34, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x0885, code lost:
        if (r3 == null) goto L_0x0cbb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0887, code lost:
        r4 = (p000.bxvd) r3.mo74142c(5);
        r4.mo73625a((p000.bxvk) r3);
        r6.f84810b.mo33211f();
        r3 = r6.f84810b;
        r7 = ((p000.abuh) r4.f164949b).f58400l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x089e, code lost:
        if (r7 == null) goto L_0x08a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x08a1, code lost:
        r7 = p000.abtn.f58271c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x08a3, code lost:
        r3.mo33203a(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x08ae, code lost:
        if ((((p000.abuh) r4.f164949b).f58389a & 64) == 0) goto L_0x08b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x08b3, code lost:
        if (r4.f164950c != false) goto L_0x08b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x08b6, code lost:
        r4.mo74035c();
        r4.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x08bc, code lost:
        r3 = (p000.abuh) r4.f164949b;
        r3.f58401m = p000.bqay.m112492a(2);
        r3.f58389a |= 64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x08cd, code lost:
        r3 = (p000.abuh) r4.mo74062i();
        r4 = p000.bqay.m112493b(r3.f58401m);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x08d9, code lost:
        if (r4 == 0) goto L_0x090f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x08dc, code lost:
        if (r4 == 2) goto L_0x090f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x08de, code lost:
        r4 = p000.bqay.m112493b(r3.f58401m);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x08e4, code lost:
        if (r4 != 0) goto L_0x08e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x08e8, code lost:
        if (r4 != 3) goto L_0x08eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x08eb, code lost:
        r1 = p000.bqay.m112493b(r3.f58401m);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x08f1, code lost:
        if (r1 == 0) goto L_0x08f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x08f4, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x08f5, code lost:
        r1 = p000.bqay.m112492a(r1);
        r2 = p000.bqay.m112493b(r3.f58401m);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x08ff, code lost:
        if (r2 == 0) goto L_0x0903;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0901, code lost:
        r13 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0903, code lost:
        r13 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0904, code lost:
        r2 = m70891a(r1, p000.fsh.m12244a(r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x090c, code lost:
        monitor-exit(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x090f, code lost:
        if (r1 == null) goto L_0x092c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x0913, code lost:
        if (r1.f9589r == null) goto L_0x092c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0927, code lost:
        if (r6.f84809a.f58082r.mo32433a(r6.f84709o.f58780f, p000.bngx.m109368a((java.util.Collection) r22), r1.f9589r) == false) goto L_0x092c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x0929, code lost:
        r49 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x092c, code lost:
        r49 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x092e, code lost:
        r4 = r30;
        r7 = r4.f59419a.length;
        r8 = new java.lang.String[r7];
        r9 = new android.os.Bundle[r7];
        r10 = new android.os.Bundle[r7];
        r11 = new android.os.Bundle[r7];
        r12 = new android.util.SparseIntArray(r7);
        r13 = 0;
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x0942, code lost:
        r14 = r4.f59419a;
        r30 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x0947, code lost:
        if (r13 < r14.length) goto L_0x0b32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:?, code lost:
        r2 = new int[r3.f58391c.size()];
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0954, code lost:
        if (r14 >= r3.f58390b) goto L_0x0965;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:?, code lost:
        r2[r14] = r12.get(r3.f58391c.mo74151b(r14));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0962, code lost:
        r14 = r14 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0969, code lost:
        if ((r3.f58389a & 16) == 0) goto L_0x0979;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:?, code lost:
        r4 = r3.f58396h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x096d, code lost:
        if (r4 == null) goto L_0x0970;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x0970, code lost:
        r4 = p000.abui.f58405a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x0976, code lost:
        r40 = r4.mo73642k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x0979, code lost:
        r40 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x097d, code lost:
        if (r3.f58390b <= 0) goto L_0x098b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0985, code lost:
        if (r3.f58397i.size() == 0) goto L_0x0988;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x0988, code lost:
        r41 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:?, code lost:
        r41 = p000.bqci.m112569a(r3.f58397i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x0993, code lost:
        r4 = r3.f58390b;
        r12 = new long[r4];
        r4 = new long[r4];
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x099a, code lost:
        r13 = r3.f58390b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x099c, code lost:
        if (r14 >= r13) goto L_0x09cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:?, code lost:
        r22 = r11;
        r23 = r5;
        r12[r14] = java.util.concurrent.TimeUnit.SECONDS.toMillis((long) r3.f58398j.mo74151b(r14));
        r17 = r12;
        r4[r14] = java.util.concurrent.TimeUnit.SECONDS.toMillis((long) r3.f58399k.mo74151b(r14));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x09c2, code lost:
        r14 = r14 + 1;
        r12 = r17;
        r11 = r22;
        r5 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x09cd, code lost:
        r23 = r5;
        r22 = r11;
        r17 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x09d3, code lost:
        if (r15 != false) goto L_0x09d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x09d5, code lost:
        r46 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x09d8, code lost:
        r46 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:?, code lost:
        r35 = p000.bqcn.m112584a(r3.f58394f);
        r36 = r3.f58395g.mo73780k();
        r5 = r3.f58393e;
        r47 = p000.bqcn.m112584a(r3.f58403o);
        r48 = r3.f58404p.mo73780k();
        r6 = android.os.Build.VERSION.SDK_INT;
        r6 = new android.os.Bundle();
        r11 = new android.os.UserHandle[r7];
        java.util.Arrays.fill(r11, 0, r7, p000.fsh.m12242a());
        r6.putParcelableArray("USER_HANDLE_ARRAYS_KEY", r11);
        r7 = new com.google.android.gms.appdatasearch.SearchResults(r13, r2, r8, r35, r36, null, r9, r10, r40, r41, r6, r5, r17, r4, r46, r47, r48, r49);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x0a25, code lost:
        r4 = r50;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:?, code lost:
        r4.f84810b.mo33206a(r7.f9672i);
        r2 = r4.f84810b;
        r2.f61023b = r23;
        r2.f61024c = r3.f58390b;
        r2.f61025d = r3.f58393e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x0a3c, code lost:
        if (r1 == null) goto L_0x0a43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x0a3e, code lost:
        r13 = r1.mo7196a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x0a43, code lost:
        r13 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x0a44, code lost:
        r2.f61026e = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x0a46, code lost:
        if (r1 == null) goto L_0x0a4b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x0a48, code lost:
        r5 = r1.f9581j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x0a4b, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x0a4c, code lost:
        r2.f61027f = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x0a4e, code lost:
        if (r1 == null) goto L_0x0a53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x0a50, code lost:
        r5 = r1.f9582k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x0a53, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x0a54, code lost:
        r2.f61028g = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x0a56, code lost:
        if (r1 == null) goto L_0x0a5b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x0a58, code lost:
        r1 = r1.f9587p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x0a5b, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x0a5c, code lost:
        r2.f61029h = r1;
        r1 = p000.bqay.m112493b(r3.f58401m);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x0a64, code lost:
        if (r1 == 0) goto L_0x0a67;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:0x0a67, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x0a68, code lost:
        r2.f61030i = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x0a6c, code lost:
        if (r4.f84812d == false) goto L_0x0a85;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x0a70, code lost:
        if (r4.f84811c == false) goto L_0x0a85;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x0a72, code lost:
        r1 = r4.f84810b;
        r2 = (com.google.android.gms.search.queries.GlobalQueryCall$Request) r4.f84708n;
        r3 = r2.f107469a;
        r5 = r4.f84709o;
        r1.mo33205a(r3, r5.f58780f, r5.f58781g, r2.f107473e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x0a8d, code lost:
        if (r4.f84809a.f58090z.mo33199a() != false) goto L_0x0a91;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0a91, code lost:
        r1 = r4.f84809a.f58090z;
        r3 = p000.abtq.f58291d.mo74144da();
        r2 = p000.bxtx.m123261a(p000.acxk.m49938a((com.google.android.gms.search.queries.GlobalQueryCall$Request) r4.f84708n));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x0aa9, code lost:
        if (r3.f164950c != false) goto L_0x0aac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x0aac, code lost:
        r3.mo74035c();
        r3.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x0ab2, code lost:
        r5 = (p000.abtq) r3.f164949b;
        r2.getClass();
        r5.f58293a |= 1;
        r5.f58294b = r2;
        r2 = p000.bxtx.m123261a(p000.acxk.m49938a(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x0acb, code lost:
        if (r3.f164950c != false) goto L_0x0ace;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x0ace, code lost:
        r3.mo74035c();
        r3.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x0ad4, code lost:
        r5 = (p000.abtq) r3.f164949b;
        r2.getClass();
        r5.f58293a |= 2;
        r5.f58295c = r2;
        r2 = p000.abtt.f58306c.mo74144da();
        r3 = (p000.abtq) r3.mo74062i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x0af1, code lost:
        if (r2.f164950c != false) goto L_0x0af4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x0af4, code lost:
        r2.mo74035c();
        r2.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x0afa, code lost:
        r5 = (p000.abtt) r2.f164949b;
        r3.getClass();
        r5.f58309b = r3;
        r5.f58308a = 1;
        r1.mo33198a((p000.abtt) r2.mo74062i());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x0b0f, code lost:
        r2 = new com.google.android.gms.search.queries.GlobalQueryCall$Response();
        r2.f107474a = new com.google.android.gms.common.api.Status(0);
        r2.f107475b = r7;
        r2.f107476c = ((com.google.android.gms.search.queries.GlobalQueryCall$Request) r4.f84708n).f107473e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x0b26, code lost:
        monitor-exit(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x0b29, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:0x0b2e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0b32, code lost:
        r22 = r11;
        r11 = r14[r13];
        r14 = r11.f59418a;
        r6 = r14.f58140e;
        r14 = r14.f58138c;
        r35 = r1;
        r1 = new java.lang.StringBuilder((java.lang.String.valueOf(r6).length() + 1) + java.lang.String.valueOf(r14).length());
        r1.append(r6);
        r1.append("-");
        r1.append(r14);
        r8[r13] = r1.toString();
        r1 = (p000.abug) r3.f58392d.get(r13);
        r4 = new android.os.Bundle();
        r6 = new android.os.Bundle();
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x0b7e, code lost:
        r23 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x0b88, code lost:
        if (r14 >= r11.f59418a.f58146k.size()) goto L_0x0bd5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x0b8a, code lost:
        r5 = p000.fro.m12230a(((p000.abut) r11.f59418a.f58146k.get(r14)).f58466b);
        r24 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0baa, code lost:
        if (((p000.abue) r1.f58385a.get(r14)).f58374a.size() == 0) goto L_0x0bbd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x0bac, code lost:
        r4.putIntArray(r5, p000.bqcn.m112584a(((p000.abue) r1.f58385a.get(r14)).f58374a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x0bbd, code lost:
        r6.putByteArray(r5, ((p000.abue) r1.f58385a.get(r14)).f58375b.mo73780k());
        r14 = r14 + 1;
        r5 = r23;
        r7 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x0bd5, code lost:
        r24 = r7;
        r1 = android.util.Pair.create(r4, r6);
        r9[r13] = (android.os.Bundle) r1.first;
        r10[r13] = (android.os.Bundle) r1.second;
        r12.put(r11.f59418a.f58137b, r13);
        r1 = (p000.abtu) r2.f58352b.get(r13);
        r4 = (p000.abug) r3.f58392d.get(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0c04, code lost:
        if (r1.f58314c.isEmpty() != false) goto L_0x0c96;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x0c06, code lost:
        r5 = r1.f58315d.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x0c19, code lost:
        if (r4.f58385a.size() >= (r1.f58314c.size() + r5)) goto L_0x0c4a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x0c1b, code lost:
        p000.absg.m48199c("Wanted %d annotation-only sections plus %d universal sections, but only got %d sections", java.lang.Integer.valueOf(r1.f58314c.size()), java.lang.Integer.valueOf(r5), java.lang.Integer.valueOf(r4.f58385a.size()));
        r27 = r2;
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x0c4a, code lost:
        r7 = new android.os.Bundle();
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x0c5c, code lost:
        if (r6 >= r1.f58314c.size()) goto L_0x0c93;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x0c5e, code lost:
        r14 = ((p000.abub) r1.f58314c.get(r6)).f58340b;
        r26 = r1;
        r27 = r2;
        r1 = p000.fsh.m12245a((p000.abue) r4.f58385a.get(r6 + r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x0c7a, code lost:
        if (r1 == null) goto L_0x0c8b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x0c7c, code lost:
        r7.putByteArray(((p000.abqo) r11.f59418a.f58145j.get(r14)).f57978b, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x0c8b, code lost:
        r6 = r6 + 1;
        r1 = r26;
        r2 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x0c93, code lost:
        r27 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x0c96, code lost:
        r27 = r2;
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x0c9d, code lost:
        if (r7 != null) goto L_0x0ca0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:0x0ca4, code lost:
        if (r7.isEmpty() != false) goto L_0x0ca9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x0ca6, code lost:
        r22[r13] = r7;
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x0ca9, code lost:
        r13 = r13 + 1;
        r6 = r50;
        r11 = r22;
        r5 = r23;
        r7 = r24;
        r2 = r27;
        r4 = r30;
        r1 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x0cbb, code lost:
        r2 = m70891a(8, "Failed to parse QueryResponse from native");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:0x0cc3, code lost:
        monitor-exit(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x0cc5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0137, code lost:
        if (r6 != false) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x0cd7, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r6 = r1.f84809a.f58071g;
        r7 = r6.f60625g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0140, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        r6.f60620b.edit().putLong("app-params-last-update-sched", java.lang.System.currentTimeMillis()).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:572:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:574:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:575:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:576:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0154, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r6 = r1.f84809a;
        r7 = r6.f58067c;
        r9 = r6.f58066b;
        r10 = r6.f58071g;
        r24 = r6.mo32298a();
        r6 = r1.f84809a;
        r7.mo32995d(new p000.apsu(r9, r10, r24, r6.f58077m, r6.f58085u, r6.f58069e));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x017d, code lost:
        r7 = new p000.acbd(r12, r2, r1.f84809a.f58071g.mo33027d());
        r6 = p000.abud.f58349v.mo74144da();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0192, code lost:
        if (r6.f164950c != false) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0195, code lost:
        r6.mo74035c();
        r6.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x019b, code lost:
        r8 = (p000.abud) r6.f164949b;
        r9 = r8.f58351a | 8;
        r8.f58351a = r9;
        r8.f58358h = true;
        r9 = r9 | 2;
        r8.f58351a = r9;
        r8.f58356f = true;
        r10 = r7.f59420b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01b4, code lost:
        if (r10 == null) goto L_0x0220;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01b6, code lost:
        r14 = r10.f9581j;
        r9 = r9 | 4096;
        r8.f58351a = r9;
        r8.f58366p = r14;
        r14 = r10.f9582k;
        r9 = r9 | 8192;
        r8.f58351a = r9;
        r8.f58367q = r14;
        r14 = r10.f9573b;
        r9 = r9 | 4;
        r8.f58351a = r9;
        r8.f58357g = r14;
        r14 = r10.f9579h;
        r8.f58351a = r9 | 1024;
        r8.f58364n = r14;
        r8 = p000.acky.m49354a(r10.f9576e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01de, code lost:
        if (r6.f164950c != false) goto L_0x01e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01e1, code lost:
        r6.mo74035c();
        r6.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01e7, code lost:
        r9 = (p000.abud) r6.f164949b;
        r9.f58360j = r8 - 1;
        r9.f58351a |= 64;
        r8 = r7.f59420b;
        r8 = p000.acky.m49355a(r8.f9577f, r8.f9576e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0200, code lost:
        if (r6.f164950c != false) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0203, code lost:
        r6.mo74035c();
        r6.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0209, code lost:
        r9 = (p000.abud) r6.f164949b;
        r9.f58363m = r8 - 1;
        r8 = r9.f58351a | 512;
        r9.f58351a = r8;
        r10 = r7.f59420b.f9588q;
        r9.f58351a = r8 | com.google.autofill.detection.p098ml.AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        r9.f58371u = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0220, code lost:
        r9 = r9 | 4096;
        r8.f58351a = r9;
        r8.f58366p = true;
        r9 = r9 | 8192;
        r8.f58351a = r9;
        r8.f58367q = true;
        r9 = r9 | 4;
        r8.f58351a = r9;
        r8.f58357g = 0;
        r8.f58351a = r9 | 1024;
        r8.f58364n = false;
        r9 = p000.acky.m49354a(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0241, code lost:
        if (r6.f164950c != false) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0244, code lost:
        r6.mo74035c();
        r6.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x024a, code lost:
        r8 = (p000.abud) r6.f164949b;
        r8.f58360j = r9 - 1;
        r8.f58351a |= 64;
        r10 = p000.acky.m49355a(0, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x025f, code lost:
        if (r6.f164950c != false) goto L_0x0262;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0262, code lost:
        r6.mo74035c();
        r6.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0268, code lost:
        r8 = (p000.abud) r6.f164949b;
        r8.f58363m = r10 - 1;
        r9 = r8.f58351a | 512;
        r8.f58351a = r9;
        r8.f58351a = r9 | com.google.autofill.detection.p098ml.AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        r8.f58371u = Integer.MAX_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x027d, code lost:
        r8 = (p000.abud) r6.f164949b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0283, code lost:
        if (r8.f58366p == false) goto L_0x0286;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0288, code lost:
        if (r8.f58367q == false) goto L_0x028f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x028a, code lost:
        p000.absg.m48201d("prefixMatchAllTokens has no effect when prefixMatch is false.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x028f, code lost:
        r8 = new java.util.ArrayList();
        r9 = r7.f59419a;
        r10 = r9.length;
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0298, code lost:
        r22 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x029a, code lost:
        if (r14 >= r10) goto L_0x0480;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x029c, code lost:
        r15 = r9[r14];
        r13 = r7.f59420b;
        r11 = r7.f59422d;
        r12 = r7.f59421c;
        r29 = r9;
        r9 = p000.abtu.f58310g.mo74144da();
        r28 = r10;
        r10 = r15.f59418a.f58137b;
        r30 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02b6, code lost:
        if (r9.f164950c != false) goto L_0x02b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02b9, code lost:
        r9.mo74035c();
        r9.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02bf, code lost:
        r7 = (p000.abtu) r9.f164949b;
        r31 = r3;
        r7.f58312a |= 1;
        r7.f58313b = r10;
        r9.mo73956S(r15.f59418a.f58146k);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02d8, code lost:
        if (r13 != null) goto L_0x02e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02da, code lost:
        r35 = r2;
        r34 = r4;
     */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11132a() {
        Object obj;
        Throwable th;
        acry acry;
        GlobalSearchQuerySpecification globalSearchQuerySpecification = ((GlobalQueryCall$Request) this.f84708n).f107472d;
        if (!(!celx.m137222b() || (acry = this.f60440k) == null || globalSearchQuerySpecification == null)) {
            acry.mo33050a(globalSearchQuerySpecification.f9585n);
        }
        GlobalQueryCall$Request globalQueryCall$Request = (GlobalQueryCall$Request) this.f84708n;
        String str = globalQueryCall$Request.f107469a;
        int i = globalQueryCall$Request.f107470b;
        int i2 = globalQueryCall$Request.f107471c;
        GlobalSearchQuerySpecification globalSearchQuerySpecification2 = globalQueryCall$Request.f107472d;
        String a = absd.m48170a(str, i, i2, globalSearchQuerySpecification2);
        if (a != null) {
            return m70891a(8, a);
        }
        this.f84810b.mo33207b();
        if (globalSearchQuerySpecification2 != null) {
            absg.m48185a("GlobalSearchQuerySpec: %s", globalSearchQuerySpecification2);
        }
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = Integer.valueOf(globalSearchQuerySpecification2 != null ? globalSearchQuerySpecification2.f9588q : Integer.MAX_VALUE);
        absg.m48204d("Query global start %d num %d maxNumSlices %d", objArr);
        absg.m48185a("Query global: [%s]", str);
        absg.m48186a("Index docs: %d pls: %d", Integer.valueOf(this.f84809a.f58078n.mo43409e()), Integer.valueOf(this.f84809a.f58078n.mo43410f()));
        this.f84810b.mo33208c();
        Object a2 = this.f84809a.mo32298a().mo32525a();
        synchronized (a2) {
            try {
                this.f84810b.mo33209d();
                List<absr> a3 = this.f84809a.mo32300a(this.f84709o, globalSearchQuerySpecification2, false);
                if ("com.google.android.googlequicksearchbox".equals(this.f84709o.f58780f)) {
                    int c = this.f84809a.f58077m.mo32504c();
                    ArrayList arrayList = new ArrayList();
                    for (absr absr : a3) {
                        try {
                            if (c < ((Integer) abzt.f58888ac.mo58455c()).intValue()) {
                                if (abzm.m48657e(absr)) {
                                    absg.m48186a("removeCorporaIfAgsa gsaVersion:%d minVersion:%d", Integer.valueOf(c), abzt.f58888ac.mo58455c());
                                }
                            }
                            arrayList.add(absr);
                        } catch (Throwable th2) {
                            th = th2;
                            obj = a2;
                            throw th;
                        }
                    }
                    a3 = arrayList;
                }
                acrl acrl = this.f84809a.f58071g;
                synchronized (acrl.f60625g) {
                    try {
                        obj = a2;
                        try {
                            boolean z = !acrl.f60620b.contains("app-params-last-update-sched") && acrl.f60620b.getLong("app-params-last-update", 0) + TimeUnit.SECONDS.toMillis((long) acrl.f60624f) < System.currentTimeMillis();
                        } catch (Throwable th3) {
                            th = th3;
                            Throwable th4 = th;
                            throw th4;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        obj = a2;
                        Throwable th42 = th;
                        throw th42;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                obj = a2;
                th = th;
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo47405a(Status status) {
        GlobalQueryCall$Response globalQueryCall$Response = new GlobalQueryCall$Response();
        globalQueryCall$Response.f107474a = status;
        return globalQueryCall$Response;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo47406a(Exception exc) {
        if (this.f84811c) {
            this.f84810b.mo33204a(exc);
            boolean z = this.f84812d;
            boolean z2 = false;
            if (z && exc != null) {
                z2 = true;
            }
            if (!z || z2) {
                acxl acxl = this.f84810b;
                String str = ((GlobalQueryCall$Request) this.f84708n).f107469a;
                abyy abyy = this.f84709o;
                bpxd a = acxl.mo33201a(str, abyy.f58780f, abyy.f58781g);
                if (((Boolean) abzt.f58993m.mo58455c()).booleanValue()) {
                    this.f84809a.f58067c.mo32995d(new apsb(this, bqbd.LOG_QUERY_STATS, this.f60439j, acrz.m49787b(this.f84809a.f58066b), a));
                } else {
                    this.f84809a.f58083s.mo32441a(a);
                }
            }
        }
    }
}
