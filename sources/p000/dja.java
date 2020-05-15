package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.chimera.config.InvalidConfigException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: dja */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dja extends diu {
    public dja(String str) {
        super(str);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: diu.a(java.util.List, boolean):java.util.ArrayList
     arg types: [java.util.ArrayList, int]
     candidates:
      diu.a(din, dfg):void
      diu.a(djn, java.lang.String):void
      diu.a(java.util.ArrayList, java.util.SortedMap):java.util.ArrayList
      diu.a(java.util.List, boolean):java.util.ArrayList */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dky.a(java.lang.Iterable, java.util.Comparator):dky
     arg types: [java.util.ArrayList, java.util.Comparator]
     candidates:
      bnfo.a(java.lang.Object, java.lang.Object):void
      bmzu.a(java.lang.Object, java.lang.Object):void
      dky.a(java.lang.Iterable, java.util.Comparator):dky */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02e3, code lost:
        r8 = new p000.dit(r1, r9, r4);
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02ef, code lost:
        if (r9 >= r1.f13281l.size()) goto L_0x0453;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02f1, code lost:
        r11 = r1.f13281l.keyAt(r9);
        r12 = p000.diu.m8583a((java.util.List) r1.f13281l.get(r11), r6, r4);
        r13 = new java.util.ArrayList();
        r12 = r12.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0310, code lost:
        if (r12.hasNext() == false) goto L_0x03ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0312, code lost:
        r14 = (p000.dmo) r12.next();
        r15 = (p000.djn) r4.get(r14);
        p000.bmzs.m108696a(r15);
        r15 = super.mo9101a(r15);
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x032c, code lost:
        if (r7 >= r13.size()) goto L_0x034c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x032e, code lost:
        r10 = (p000.diq) r13.get(r7);
        r17 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0338, code lost:
        if (r10.f13263b != r15) goto L_0x0347;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x033a, code lost:
        r4 = (p000.bxvd) r10.mo74142c(5);
        r4.mo73625a((p000.GeneratedMessageLite) r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0347, code lost:
        r7 = r7 + 1;
        r4 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x034c, code lost:
        r17 = r4;
        r4 = null;
        r7 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0350, code lost:
        if (r4 != null) goto L_0x0382;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0352, code lost:
        r4 = p000.diq.f13260d.mo74144da();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x035a, code lost:
        if (r4.f164950c != false) goto L_0x035d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x035d, code lost:
        r4.mo74035c();
        r4.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0363, code lost:
        r7 = (p000.diq) r4.f164949b;
        r7.f13262a |= 1;
        r7.f13263b = r15;
        r13.add((p000.diq) r4.mo74062i());
        r7 = r13.size() - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0382, code lost:
        r10 = (java.lang.Integer) r1.f13278i.get(r14.f13575b);
        p000.bmzs.m108696a(r10);
        r10 = r10.intValue();
        r14 = ((p000.diq) r4.f164949b).f13264c.size();
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x039e, code lost:
        if (r15 >= r14) goto L_0x03b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03a0, code lost:
        r16 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03ac, code lost:
        if (((p000.diq) r4.f164949b).f13264c.mo74151b(r15) != r10) goto L_0x03af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x03af, code lost:
        r15 = r15 + 1;
        r6 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03b4, code lost:
        r16 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03b8, code lost:
        if (r4.f164950c != false) goto L_0x03bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03bb, code lost:
        r4.mo74035c();
        r4.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03c1, code lost:
        r6 = (p000.diq) r4.f164949b;
        r14 = p000.diq.f13260d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03cd, code lost:
        if (r6.f13264c.mo73666a() != false) goto L_0x03d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x03cf, code lost:
        r6.f13264c = p000.GeneratedMessageLite.m124019a(r6.f13264c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x03d7, code lost:
        r6.f13264c.mo74153d(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x03dc, code lost:
        r13.set(r7, (p000.diq) r4.mo74062i());
        r6 = r16;
        r4 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x03ec, code lost:
        r17 = r4;
        r16 = r6;
        java.util.Collections.sort(r13, r8);
        r4 = r1.f13276g;
        r6 = (p000.din) r4.get(r11);
        r10 = (p000.bxvd) r6.mo74142c(5);
        r10.mo73625a((p000.GeneratedMessageLite) r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0407, code lost:
        if (r10.f164950c != false) goto L_0x040a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x040a, code lost:
        r10.mo74035c();
        r10.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0410, code lost:
        r7 = p000.din.f13229r;
        ((p000.din) r10.f164949b).f13240j = p000.GeneratedMessageLite.m124030de();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x041e, code lost:
        if (r10.f164950c != false) goto L_0x0421;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0421, code lost:
        r10.mo74035c();
        r10.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0427, code lost:
        r6 = (p000.din) r10.f164949b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0431, code lost:
        if (r6.f13240j.mo73666a() == false) goto L_0x0434;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0434, code lost:
        r6.f13240j = p000.GeneratedMessageLite.m124021a(r6.f13240j);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x043c, code lost:
        p000.bxsy.m123078a(r13, r6.f13240j);
        r4.set(r11, (p000.din) r10.mo74062i());
        r9 = r9 + 1;
        r6 = r16;
        r4 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0453, code lost:
        r4 = new java.util.ArrayList();
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x045f, code lost:
        if (r8 >= r1.f13274e.size()) goto L_0x04a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0467, code lost:
        if (r1.f13275f.get(r8) != false) goto L_0x049e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0469, code lost:
        r6 = (p000.din) r1.f13274e.get(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0477, code lost:
        if (r1.f13281l.indexOfKey(r8) < 0) goto L_0x049e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0479, code lost:
        r6 = (p000.dmj) r1.f13279j.get(r6);
        p000.bmzs.m108696a(r6);
        r6 = r6.f13539a.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x048e, code lost:
        if (r6.hasNext() == false) goto L_0x049e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0490, code lost:
        r4.add(p000.dgk.m8397a((p000.dmn) r6.next()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x049e, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x04a1, code lost:
        if (r5 != false) goto L_0x04ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x04a3, code lost:
        r0 = p000.dgk.m8396a(r0, p000.dgk.m8395a(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x04b0, code lost:
        if (r4.isEmpty() != false) goto L_0x04ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x04b2, code lost:
        r4.add(r0);
        r0 = p000.dgk.m8395a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x04ba, code lost:
        r1.f13271b = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:?, code lost:
        r1.f13282m = true;
        r0 = p000.dky.m8762a((java.lang.Iterable) r1.f13276g, r2.f13433a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:?, code lost:
        p000.djn.m8655a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x04ca, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x04cb, code lost:
        r17 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:?, code lost:
        r7 = (java.util.Map.Entry) r6.next();
        r9 = (p000.dmo) r7.getKey();
        r10 = r1.f13277h;
        r11 = (p000.bxvd) r9.mo74142c(5);
        r11.mo73625a((p000.GeneratedMessageLite) r9);
        r7 = ((p000.djn) r7.getValue()).f13343f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x04f0, code lost:
        if (r11.f164950c != false) goto L_0x04f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04f4, code lost:
        r11.mo74035c();
        r11.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04fa, code lost:
        r13 = (p000.dmo) r11.f164949b;
        r14 = p000.dmo.f13572f;
        r13.f13574a |= 4;
        r13.f13578e = r7;
        r10.add((p000.dmo) r11.mo74062i());
        r1.f13278i.put(r9.f13575b, java.lang.Integer.valueOf(r8));
        r8 = r8 + 1;
        r4 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0523, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0533, code lost:
        if (super.mo9107b((p000.djn) r6.next()) != false) goto L_0x0538;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0535, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0543, code lost:
        throw new com.google.android.chimera.config.InvalidConfigException("No built-in module");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x054d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0555, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x055b, code lost:
        r27.clear();
        r2 = r1.f13273d.entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x056c, code lost:
        if (r2.hasNext() != false) goto L_0x056e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x056e, code lost:
        r5 = (java.util.Map.Entry) r2.next();
        r6 = (p000.din) r5.getKey();
        r8 = r6.f13233c;
        r18 = p000.dik.m8576a(r6.f13232b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0582, code lost:
        if (r18 != 0) goto L_0x0584;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0584, code lost:
        r9 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0587, code lost:
        r9 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0588, code lost:
        r10 = r6.f13243m;
        r18 = p000.dkc.m8723a(r6.f13239i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0590, code lost:
        if (r18 != 0) goto L_0x0592;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0592, code lost:
        r11 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0595, code lost:
        r11 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0596, code lost:
        r12 = r6.f13242l;
        r13 = r6.f13244n;
        r7 = r6.f13231a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x059e, code lost:
        if ((r7 & 4096) != 0) goto L_0x05a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x05a0, code lost:
        r14 = r6.f13245o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x05a3, code lost:
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x05a6, code lost:
        if ((r7 & 8192) != 0) goto L_0x05a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x05a8, code lost:
        r15 = r6.f13246p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x05ac, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x05ad, code lost:
        r7 = p000.dht.m8527a(r20, r8, r9, r10, r11, r12, r13, r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x05b3, code lost:
        if (r7 == null) goto L_0x05b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x05b5, code lost:
        r5 = java.lang.String.valueOf(r6.f13233c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x05c1, code lost:
        if (r5.length() == 0) goto L_0x05c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x05c3, code lost:
        r5 = new java.lang.String("failed to create ModuleApk from descriptor: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x05c9, code lost:
        r5 = "failed to create ModuleApk from descriptor: ".concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x05cd, code lost:
        mo9105a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x05d1, code lost:
        r3.put(r7, (p000.dfg) r5.getValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x021a, code lost:
        if (r12 != false) goto L_0x021d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x021d, code lost:
        if (r13 == false) goto L_0x053b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x021f, code lost:
        r6 = r10.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0227, code lost:
        if (r6.hasNext() != false) goto L_0x0523;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0229, code lost:
        java.util.Collections.sort(r1.f13272c, p000.diu.f13268n);
        r6 = p000.bnic.m109495a((java.util.Collection) r4.keySet());
        r8 = r9.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0240, code lost:
        if (r8.hasNext() == false) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0242, code lost:
        r9 = (p000.djn) r8.next();
        r10 = p000.adyi.m51410a();
        r11 = r6.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0254, code lost:
        if (r11.hasNext() == false) goto L_0x0262;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0256, code lost:
        r12 = (p000.dmo) r11.next();
        r10.put(r12.f13575b, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0262, code lost:
        r11 = r9.f13342e.f13557g.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x026e, code lost:
        if (r11.hasNext() == false) goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0270, code lost:
        r12 = (p000.dmr) r11.next();
        r13 = (p000.dmo) r10.get(r12.f13595b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x027e, code lost:
        if (r13 == null) goto L_0x026a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0280, code lost:
        r13 = r13.f13576c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0284, code lost:
        if (r13 < r12.f13596c) goto L_0x026a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0288, code lost:
        if (r13 > r12.f13597d) goto L_0x026a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x028a, code lost:
        r9.f13344g.add(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0290, code lost:
        r6 = r4.entrySet().iterator();
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x029d, code lost:
        if (r6.hasNext() != false) goto L_0x04cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x029f, code lost:
        r6 = new java.util.ArrayList(r4.keySet());
        r8 = new java.util.BitSet();
        r9 = new android.util.SparseArray();
        r11 = r4.values().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02be, code lost:
        if (r11.hasNext() == false) goto L_0x02e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02c0, code lost:
        r12 = super.mo9101a((p000.djn) r11.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02ce, code lost:
        if (r8.get(r12) != false) goto L_0x02ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02d0, code lost:
        r8.set(r12);
        r9.append(r12, p000.diu.m8583a((java.util.List) r1.f13281l.get(r12), r6, r4));
     */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x055b  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x00bb A[EDGE_INSN: B:242:0x00bb->B:237:0x00bb ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0218 A[Catch:{ all -> 0x054f }] */
    /* renamed from: a */
    public final dky mo9122a(Context context, List list, List list2, List list3, dky dky, dky dky2, dky dky3, Map map) {
        dky dky4 = dky;
        dky dky5 = dky2;
        Map map2 = map;
        Map a = adyi.m51410a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dht dht = (dht) it.next();
            din din = (din) dky5.get(dky5.mo9239a(dht.mo8913e()));
            dmj k = dht.mo8966k();
            if (k != null) {
                a.put(din, k);
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            dht dht2 = (dht) it2.next();
            din din2 = (din) dky5.get(dky5.mo9239a(dht2.mo8913e()));
            dmj k2 = dht2.mo8966k();
            if (k2 != null) {
                a.put(din2, k2);
            }
        }
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            dht dht3 = (dht) it3.next();
            din din3 = (din) dky5.get(dky5.mo9239a(dht3.mo8913e()));
            dmj k3 = dht3.mo8966k();
            if (k3 != null) {
                a.put(din3, k3);
            }
        }
        boolean z = true;
        try {
            boolean i = dfq.m8314a().mo8870i();
            this.f13275f = new BitSet(dky2.size());
            this.f13274e = dky5;
            this.f13276g = new ArrayList(dky5);
            this.f13279j.clear();
            this.f13279j.putAll(a);
            this.f13280k = dky3;
            this.f13273d.clear();
            try {
                TreeMap treeMap = new TreeMap(diu.f13269o);
                loop3:
                while (true) {
                    this.f13282m = false;
                    this.f13272c.clear();
                    this.f13277h.clear();
                    this.f13278i.clear();
                    bxvd da = dmn.f13549v.mo74144da();
                    String str = this.f13270a;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    dmn dmn = (dmn) da.f164949b;
                    str.getClass();
                    dmn.f13551a |= 8;
                    dmn.f13565o = str;
                    this.f13283p = da;
                    ArrayList a2 = mo9102a(super.mo9103a(this.f13274e, z), treeMap);
                    if (a2.size() != 0) {
                        if (!this.f13273d.isEmpty()) {
                            mo9106b("Config resolution failed. Try without optional APKs");
                            ArrayList arrayList = new ArrayList(this.f13274e.size());
                            for (int i2 = 0; i2 < this.f13274e.size(); i2++) {
                                if (!this.f13275f.get(i2)) {
                                    din din4 = (din) this.f13274e.get(i2);
                                    if (!diu.m8587a(din4)) {
                                        arrayList.add(din4);
                                    }
                                }
                            }
                            ArrayList a3 = super.mo9103a((List) arrayList, false);
                            this.f13273d.clear();
                            mo9102a(a3, new TreeMap(diu.f13269o));
                            if (!this.f13273d.isEmpty()) {
                                for (Map.Entry entry : this.f13273d.entrySet()) {
                                    String str2 = ((din) entry.getKey()).f13233c;
                                    String valueOf = String.valueOf(entry.getValue());
                                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 24 + String.valueOf(valueOf).length());
                                    sb.append("Rejected required APK ");
                                    sb.append(str2);
                                    sb.append(": ");
                                    sb.append(valueOf);
                                    sb.toString();
                                }
                                throw new InvalidConfigException("Modules from required APKs are discarded");
                            }
                        }
                        this.f13281l.clear();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it4 = a2.iterator();
                        boolean z2 = false;
                        boolean z3 = false;
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            djn djn = (djn) it4.next();
                            int a4 = super.mo9101a(djn);
                            List list4 = (List) this.f13281l.get(a4);
                            if (list4 == null) {
                                list4 = new ArrayList();
                                this.f13281l.append(a4, list4);
                            }
                            list4.add(djn);
                            int a5 = dim.m8578a(djn.f13341d.f13241k);
                            if (a5 != 0) {
                                if (a5 != z) {
                                    if (!diu.m8587a(djn.f13341d)) {
                                        if (super.mo9107b(djn)) {
                                            break;
                                        }
                                    } else {
                                        arrayList2.add(djn);
                                    }
                                }
                            }
                            z3 |= djn.f13338a.isEmpty();
                            z2 = true;
                            if (super.mo9107b(djn)) {
                            }
                        }
                    } else {
                        throw new InvalidConfigException("No usable modules");
                    }
                }
            } catch (Throwable th) {
                th = th;
                djn.m8655a();
                throw th;
            }
        } catch (InvalidConfigException e) {
            e = e;
            if (map2 != null) {
            }
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9104a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo9106b(String str) {
        Log.w("ChimeraCfgRslvr", str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9105a(String str) {
        Log.e("ChimeraCfgRslvr", str);
    }
}
