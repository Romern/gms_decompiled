package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: abyu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abyu {

    /* renamed from: a */
    final ApplicationInfo f58756a;

    /* renamed from: b */
    final Context f58757b;

    /* renamed from: c */
    final XmlPullParser f58758c;

    /* renamed from: d */
    private final TypedValue f58759d = new TypedValue();

    public abyu(ApplicationInfo applicationInfo, Context context, XmlPullParser xmlPullParser) {
        this.f58756a = applicationInfo;
        this.f58757b = context;
        this.f58758c = xmlPullParser;
    }

    /* renamed from: a */
    private final double m48575a(String str, Bundle bundle) {
        String string = bundle.getString("factor");
        if (string != null) {
            try {
                double parseDouble = Double.parseDouble(string);
                if (parseDouble > 0.0d && parseDouble <= 1.0d) {
                    return parseDouble;
                }
                throw m48579b(string.length() == 0 ? new String("Factor not in range: Must be > 0 and <= 1 ") : "Factor not in range: Must be > 0 and <= 1 ".concat(string));
            } catch (NumberFormatException e) {
                StringBuilder sb = new StringBuilder(string.length() + 47);
                sb.append("Parameter factor=");
                sb.append(string);
                sb.append(" must be a number > 0 and <= 1");
                throw m48579b(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder(str.length() + 39);
            sb2.append("Section feature ");
            sb2.append(str);
            sb2.append(" needs parameter factor");
            throw m48579b(sb2.toString());
        }
    }

    /* renamed from: b */
    private final int m48578b(AttributeSet attributeSet, int i) {
        int a = m48576a(attributeSet, i);
        mo32461a(attributeSet.getAttributeName(i), a, true);
        return a;
    }

    /* renamed from: c */
    private final String m48580c(AttributeSet attributeSet, int i) {
        int attributeResourceValue = attributeSet.getAttributeResourceValue(i, -1);
        if (attributeResourceValue != -1) {
            return mo32461a(attributeSet.getAttributeName(i), attributeResourceValue, false);
        }
        return attributeSet.getAttributeValue(i);
    }

    /* renamed from: b */
    private final abyt m48579b(String str) {
        throw new abyt(this.f58757b.getPackageName(), this.f58758c, str);
    }

    /* renamed from: a */
    private final int m48576a(AttributeSet attributeSet, int i) {
        int attributeResourceValue = attributeSet.getAttributeResourceValue(i, -1);
        if (attributeResourceValue != -1) {
            return attributeResourceValue;
        }
        throw m48579b(String.valueOf(attributeSet.getAttributeName(i)).concat(" must be a resource reference."));
    }

    /* renamed from: a */
    private final abyt m48577a(String str, Throwable th) {
        throw new abyt(this.f58757b.getPackageName(), this.f58758c, str, th);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01ef, code lost:
        r11 = r9.getAttributeBooleanValue(r14, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01f5, code lost:
        r13 = r9.getAttributeIntValue(r14, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01fb, code lost:
        r15 = r9.getAttributeBooleanValue(r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0201, code lost:
        r7 = r9.getAttributeIntValue(r14, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0207, code lost:
        if (r7 == 0) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x020a, code lost:
        if (r7 == 1) goto L_0x0223;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x020d, code lost:
        if (r7 == 2) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0210, code lost:
        if (r7 == 3) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0213, code lost:
        if (r7 != 4) goto L_0x0218;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0215, code lost:
        r2 = "date";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x021e, code lost:
        throw m48579b("Invalid section format");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x021f, code lost:
        r2 = "url";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0221, code lost:
        r2 = "rfc822";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0223, code lost:
        r2 = "html";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0226, code lost:
        r2 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r7 = new p000.abys(r1.f58758c);
        r10 = new java.util.ArrayList();
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0229, code lost:
        r27 = m48580c(r9, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x022d, code lost:
        r14 = r14 + 1;
        r12 = r31;
        r6 = r32;
        r3 = r33;
        r7 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0239, code lost:
        if (r27 == null) goto L_0x04b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x023b, code lost:
        r7 = com.google.android.gms.appdatasearch.RegisterSectionInfo.m6151a(r27);
        r7.f17178a = r2;
        r7.f17179b = r15;
        r7.f17180c = r13;
        r7.f17181d = r11;
        r7.f17182e = r10;
        r7.f17183f = r4;
        r4 = new java.util.HashSet();
        r9 = new p000.abys(r1.f58758c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x025b, code lost:
        if (r9.mo32458a() == false) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x025d, code lost:
        r10 = r9.mo32459b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0267, code lost:
        if ("SectionFeature".equals(r10) == false) goto L_0x047e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0269, code lost:
        r11 = android.util.Xml.asAttributeSet(r1.f58758c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0271, code lost:
        if (r11 == null) goto L_0x0478;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0273, code lost:
        r13 = "";
        r12 = 0;
        r14 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x027c, code lost:
        if (r12 < r11.getAttributeCount()) goto L_0x0439;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x027e, code lost:
        r11 = new p000.abys(r1.f58758c);
        r12 = new android.os.Bundle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x028e, code lost:
        if (r11.mo32458a() == false) goto L_0x0338;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0290, code lost:
        r15 = r11.mo32459b();
        r27 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x029c, code lost:
        if ("FeatureParam".equals(r15) == false) goto L_0x0315;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x029e, code lost:
        r9 = android.util.Xml.asAttributeSet(r1.f58758c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02a4, code lost:
        if (r9 == null) goto L_0x030f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r7.mo32458a() != false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02a6, code lost:
        r31 = r11;
        r37 = r13;
        r11 = null;
        r13 = null;
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02ad, code lost:
        r38 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02b3, code lost:
        if (r15 >= r9.getAttributeCount()) goto L_0x02f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02b5, code lost:
        r7 = r9.getAttributeName(r15);
        r39 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02c1, code lost:
        if ("paramName".equals(r7) != false) goto L_0x02e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02c9, code lost:
        if ("paramValue".equals(r7) != false) goto L_0x02e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02cb, code lost:
        r2 = java.lang.String.valueOf(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02d3, code lost:
        if (r2.length() != 0) goto L_0x02db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02d5, code lost:
        r2 = new java.lang.String("Invalid attribute name ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        r3 = r1.f58756a.packageName;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02db, code lost:
        r2 = "Invalid attribute name ".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x02e3, code lost:
        throw m48579b(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02e4, code lost:
        r13 = m48580c(r9, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x02e9, code lost:
        r11 = r9.getAttributeValue(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02ed, code lost:
        r15 = r15 + 1;
        r7 = r38;
        r4 = r39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02f4, code lost:
        r39 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02f6, code lost:
        if (r11 == null) goto L_0x0308;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x02f8, code lost:
        if (r13 == null) goto L_0x0308;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x02fa, code lost:
        r12.putString(r11, r13);
        r9 = r27;
        r11 = r31;
        r13 = r37;
        r7 = r38;
        r4 = r39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        return new p000.abyr(r10, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x030e, code lost:
        throw m48579b("Both name and value must be specified");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0314, code lost:
        throw m48579b("No attributes specified");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0315, code lost:
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r15).length() + 57);
        r3.append(r26);
        r3.append(r15);
        r3.append(" inside SectionFeature; expected FeatureParam");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0337, code lost:
        throw m48579b(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0338, code lost:
        r39 = r4;
        r38 = r7;
        r27 = r9;
        r37 = r13;
        r4 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0343, code lost:
        if (r14 == -1) goto L_0x0432;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0346, code lost:
        if (r14 != 1) goto L_0x035f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        r13 = r7.mo32459b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x034c, code lost:
        if (r12.isEmpty() == false) goto L_0x0358;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x034e, code lost:
        r11 = p000.fsq.m12257a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x035e, code lost:
        throw m48579b("Section feature match_global_nicknames does not take set");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0362, code lost:
        if (r14 != 2) goto L_0x037b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:?, code lost:
        r9 = m48575a("demote_common_words", r12);
        r11 = new com.google.android.gms.appdatasearch.Feature(2);
        r11.mo7178a("factor", java.lang.String.valueOf(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
        r11 = "Invalid tag ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x037c, code lost:
        if (r14 != 3) goto L_0x039b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0382, code lost:
        if ("rfc822".equals(r2) == false) goto L_0x039b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0384, code lost:
        r9 = m48575a("demote_rfc822_hostnames", r12);
        r11 = new com.google.android.gms.appdatasearch.Feature(3);
        r11.mo7178a("factor", java.lang.String.valueOf(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x039c, code lost:
        if (r14 != 4) goto L_0x03ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03a2, code lost:
        if ("url".equals(r2) == false) goto L_0x03ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03a4, code lost:
        r11 = p000.fsq.m12261b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        if (r3.equals(r13) == false) goto L_0x06ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03ae, code lost:
        if (r14 != 5) goto L_0x03b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x03b0, code lost:
        r11 = p000.fsq.m12263c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03ba, code lost:
        if (r14 != 6) goto L_0x0403;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03bc, code lost:
        r11 = p000.fsq.m12258a("AddressAnnotator", "DateAnnotator", "PhoneAnnotator", "UrlAnnotator");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x03d8, code lost:
        r10 = r39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x03e4, code lost:
        if (r10.contains(java.lang.Integer.valueOf(r11.f9547a)) != false) goto L_0x03fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x03e6, code lost:
        r38.mo11235a(r11);
        r10.add(java.lang.Integer.valueOf(r11.f9547a));
        r26 = r4;
        r7 = r38;
        r4 = r10;
        r9 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0051, code lost:
        r13 = " inside Corpus; expected Section or GlobalSearchCorpus";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0402, code lost:
        throw m48579b("Duplicate feature defined for section");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0403, code lost:
        r5 = new java.lang.StringBuilder((java.lang.String.valueOf(r37).length() + 60) + r2.length());
        r5.append("Invalid section feature of type ");
        r5.append(r37);
        r5.append(" inside section with format ");
        r5.append(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0431, code lost:
        throw m48579b(r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0438, code lost:
        throw m48579b("No type specified.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0439, code lost:
        r16 = r4;
        r27 = r9;
        r4 = r26;
        r9 = r7;
        r7 = r11.getAttributeName(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x044d, code lost:
        if ("featureType".equals(r7) != false) goto L_0x0468;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x044f, code lost:
        r2 = java.lang.String.valueOf(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0457, code lost:
        if (r2.length() != 0) goto L_0x045f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0459, code lost:
        r2 = new java.lang.String("Invalid attribute name ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x045f, code lost:
        r2 = "Invalid attribute name ".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0467, code lost:
        throw m48579b(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0468, code lost:
        r14 = r11.getAttributeIntValue(r12, r14);
        r12 = r12 + 1;
        r26 = r4;
        r13 = r7;
        r7 = r9;
        r4 = r16;
        r9 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x047d, code lost:
        throw m48579b("No attributes specified");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x047e, code lost:
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r10).length() + 52);
        r3.append(r26);
        r3.append(r10);
        r3.append(r34);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x04a2, code lost:
        throw m48579b(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x04a3, code lost:
        r4 = r26;
        r3 = r33;
        r3.mo11229a(r7.mo11234a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r14 = android.util.Xml.asAttributeSet(r1.f58758c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x04b7, code lost:
        throw m48579b("No section ID specified.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x04bd, code lost:
        throw m48579b("No attributes specified");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x04be, code lost:
        r28 = r2;
        r29 = r4;
        r32 = r6;
        r30 = r10;
        r4 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x04cf, code lost:
        if ("GlobalSearchCorpus".equals(r7) != false) goto L_0x0545;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x04d7, code lost:
        if ("IMECorpus".equals(r7) == false) goto L_0x0522;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04d9, code lost:
        r6 = new p000.abys(r1.f58758c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x04e6, code lost:
        if (r6.mo32458a() == false) goto L_0x0516;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0059, code lost:
        if (r14 == null) goto L_0x06a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x04e8, code lost:
        r7 = r6.mo32459b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x04f2, code lost:
        if ("IMESection".equals(r7) == false) goto L_0x04f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x04f5, code lost:
        r5 = new java.lang.StringBuilder(java.lang.String.valueOf(r7).length() + 50);
        r5.append(r4);
        r5.append(r7);
        r5.append(" inside IMECorpus; expected IMESection");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0515, code lost:
        throw m48579b(r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0516, code lost:
        r26 = r4;
        r2 = r28;
        r4 = r29;
        r10 = r30;
        r6 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0522, code lost:
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r7).length() + 66);
        r3.append(r4);
        r3.append(r7);
        r3.append(r25);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0544, code lost:
        throw m48579b(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0545, code lost:
        r2 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0547, code lost:
        if (r32 != false) goto L_0x0692;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        r23 = r2;
        r18 = r3;
        r20 = r4;
        r19 = r9;
        r22 = r12;
        r24 = "searchEnabled";
        r2 = false;
        r3 = 0;
        r4 = 0;
        r6 = true;
        r9 = false;
        r12 = null;
        r15 = null;
        r21 = null;
        r17 = r7;
        r7 = "0";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0549, code lost:
        r7 = android.util.Xml.asAttributeSet(r1.f58758c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0551, code lost:
        if (r7 == null) goto L_0x059a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0553, code lost:
        r9 = 0;
        r10 = false;
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x055a, code lost:
        if (r9 >= r7.getAttributeCount()) goto L_0x0597;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x055c, code lost:
        r12 = r7.getAttributeName(r9);
        r14 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0566, code lost:
        if (r14.equals(r12) != false) goto L_0x058e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x056e, code lost:
        if ("allowShortcuts".equals(r12) != false) goto L_0x0589;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0570, code lost:
        r2 = java.lang.String.valueOf(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0078, code lost:
        r25 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0578, code lost:
        if (r2.length() != 0) goto L_0x0580;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x057a, code lost:
        r2 = new java.lang.String("Invalid attribute name ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0580, code lost:
        r2 = "Invalid attribute name ".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0588, code lost:
        throw m48579b(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0589, code lost:
        r10 = r7.getAttributeBooleanValue(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x058e, code lost:
        r11 = r7.getAttributeBooleanValue(r9, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0592, code lost:
        r9 = r9 + 1;
        r24 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0597, code lost:
        r14 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x059a, code lost:
        r14 = r24;
        r10 = false;
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007e, code lost:
        if (r3 >= r14.getAttributeCount()) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x059e, code lost:
        r7 = new int[p000.fro.m12228a()];
        r9 = new p000.abys(r1.f58758c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x05af, code lost:
        if (r9.mo32458a() == false) goto L_0x065d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x05b1, code lost:
        r12 = r9.mo32459b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x05bb, code lost:
        if ("GlobalSearchSection".equals(r12) == false) goto L_0x063c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x05bd, code lost:
        r12 = android.util.Xml.asAttributeSet(r9.f58753a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x05c3, code lost:
        if (r12 == null) goto L_0x0636;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x05c5, code lost:
        r13 = 0;
        r15 = -1;
        r16 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x05c9, code lost:
        r25 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x05cf, code lost:
        if (r13 >= r12.getAttributeCount()) goto L_0x0613;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0080, code lost:
        r13 = r14.getAttributeName(r3);
        r26 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x05d1, code lost:
        r2 = r12.getAttributeName(r13);
        r26 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x05dd, code lost:
        if ("sectionType".equals(r2) != false) goto L_0x0607;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x05e5, code lost:
        if ("sectionContent".equals(r2) != false) goto L_0x0600;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x05e7, code lost:
        r2 = java.lang.String.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x05ef, code lost:
        if (r2.length() != 0) goto L_0x05f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x05f1, code lost:
        r2 = new java.lang.String("Invalid attribute name ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x05f7, code lost:
        r2 = "Invalid attribute name ".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x05ff, code lost:
        throw m48579b(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008c, code lost:
        if ("corpusId".equals(r13) != false) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0600, code lost:
        r16 = m48578b(r12, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0607, code lost:
        r15 = r12.getAttributeIntValue(r13, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x060c, code lost:
        r13 = r13 + 1;
        r2 = r25;
        r9 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0613, code lost:
        r26 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0616, code lost:
        if (r15 == -1) goto L_0x062f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0618, code lost:
        if (r15 < 0) goto L_0x0628;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x061e, code lost:
        if (r15 > p000.fro.m12228a()) goto L_0x0628;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0620, code lost:
        r7[r15] = r16;
        r2 = r25;
        r9 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x062e, code lost:
        throw m48579b("Section ID out of range; badly formed XML?");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0635, code lost:
        throw m48579b("No sectionType specified");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x063b, code lost:
        throw m48579b("No attributes specified");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x063c, code lost:
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r12).length() + 68);
        r3.append(r4);
        r3.append(r12);
        r3.append(" inside GlobalSearchCorpus; expected GlobalSearchSection");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x065c, code lost:
        throw m48579b(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x065d, code lost:
        r25 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x065f, code lost:
        if (r11 == false) goto L_0x0682;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0661, code lost:
        r2 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0094, code lost:
        if ("corpusVersion".equals(r13) != false) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0666, code lost:
        if (r10 != false) goto L_0x0669;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0669, code lost:
        r2.add(p000.frm.m12227a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0670, code lost:
        r6 = new com.google.android.gms.appdatasearch.GlobalSearchCorpusConfig(r7, (com.google.android.gms.appdatasearch.Feature[]) r2.toArray(new com.google.android.gms.appdatasearch.Feature[r2.size()]));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0682, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0683, code lost:
        r3.f17169d = r6;
        r26 = r4;
        r24 = r14;
        r2 = r28;
        r4 = r29;
        r10 = r30;
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0698, code lost:
        throw m48579b("Duplicate element GlobalSearchCorpus");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x069f, code lost:
        throw m48579b("No content provider URI specified.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x06a6, code lost:
        throw m48579b("No corpus ID specified.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x06ac, code lost:
        throw m48579b("No attributes specified");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x06ad, code lost:
        r18 = r3;
        r20 = r4;
        r17 = r7;
        r19 = r9;
        r30 = r10;
        r4 = r11;
        r22 = r12;
        r14 = "searchEnabled";
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x06c3, code lost:
        if (r2.equals(r13) == false) goto L_0x07a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x06c5, code lost:
        if (r22 != null) goto L_0x079f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x06c7, code lost:
        r3 = android.util.Xml.asAttributeSet(r1.f58758c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x06cd, code lost:
        if (r3 == null) goto L_0x0799;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x06cf, code lost:
        r36 = r1.f58756a.icon;
        r4 = 0;
        r6 = true;
        r34 = 0;
        r35 = 0;
        r37 = null;
        r38 = null;
        r39 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009c, code lost:
        if ("contentProviderUri".equals(r13) != false) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x06e5, code lost:
        if (r4 >= r3.getAttributeCount()) goto L_0x0766;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x06e7, code lost:
        r7 = r3.getAttributeName(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x06ef, code lost:
        if (r14.equals(r7) != false) goto L_0x075e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x06f7, code lost:
        if ("searchLabel".equals(r7) != false) goto L_0x0757;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x06ff, code lost:
        if ("settingsDescription".equals(r7) != false) goto L_0x0750;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0707, code lost:
        if ("defaultIntentAction".equals(r7) != false) goto L_0x074b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x070f, code lost:
        if ("defaultIntentData".equals(r7) != false) goto L_0x0746;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0717, code lost:
        if ("defaultIntentActivity".equals(r7) != false) goto L_0x0741;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x071f, code lost:
        if ("globalSearchIcon".equals(r7) != false) goto L_0x073a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0721, code lost:
        r2 = java.lang.String.valueOf(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x0729, code lost:
        if (r2.length() != 0) goto L_0x0731;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x072b, code lost:
        r2 = new java.lang.String("Invalid attribute name ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0731, code lost:
        r2 = "Invalid attribute name ".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a4, code lost:
        if ("trimmable".equals(r13) != false) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x0739, code lost:
        throw m48579b(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x073a, code lost:
        r36 = m48576a(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0741, code lost:
        r39 = m48580c(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0746, code lost:
        r38 = m48580c(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x074b, code lost:
        r37 = m48580c(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0750, code lost:
        r35 = m48578b(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x0757, code lost:
        r34 = m48578b(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x075e, code lost:
        r6 = r3.getAttributeBooleanValue(r4, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0762, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x0766, code lost:
        if (r34 == 0) goto L_0x0792;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0768, code lost:
        if (r6 == false) goto L_0x0783;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x076a, code lost:
        r12 = new com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo(r42, null, r34, r35, r36, r37, r38, r39);
        r7 = r17;
        r3 = r18;
        r9 = r19;
        r4 = r20;
        r10 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0783, code lost:
        r7 = r17;
        r3 = r18;
        r9 = r19;
        r4 = r20;
        r10 = r30;
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0798, code lost:
        throw m48579b("No label specified");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x079e, code lost:
        throw m48579b("No attributes specified");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x07a5, code lost:
        throw m48579b("Duplicate element GlobalSearch");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ac, code lost:
        if ("schemaOrgType".equals(r13) != false) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x07a6, code lost:
        r5 = new java.lang.StringBuilder(java.lang.String.valueOf(r13).length() + 66);
        r5.append(r4);
        r5.append(r13);
        r5.append(" inside ");
        r5.append(r20);
        r5.append(r19);
        r5.append(r18);
        r5.append(" or ");
        r5.append(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x07df, code lost:
        throw m48579b(r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x07e0, code lost:
        r2 = r1.f58758c.getName();
        r6 = new java.lang.StringBuilder(java.lang.String.valueOf(r2).length() + 41);
        r6.append("Invalid root tag ");
        r6.append(r2);
        r6.append(r9);
        r6.append(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x080d, code lost:
        throw m48579b(r6.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b4, code lost:
        if ("semanticallySearchable".equals(r13) != false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00bc, code lost:
        if ("documentMaxAgeSecs".equals(r13) != false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c4, code lost:
        if ("perAccountTemplate".equals(r13) != false) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c6, code lost:
        r2 = java.lang.String.valueOf(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ce, code lost:
        if (r2.length() != 0) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d0, code lost:
        r2 = new java.lang.String("Invalid attribute name ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d6, code lost:
        r2 = "Invalid attribute name ".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00de, code lost:
        throw m48579b(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00df, code lost:
        r2 = r14.getAttributeBooleanValue(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e4, code lost:
        r4 = r14.getAttributeIntValue(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e9, code lost:
        r9 = r14.getAttributeBooleanValue(r3, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ee, code lost:
        r15 = m48580c(r14, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f3, code lost:
        r6 = r14.getAttributeBooleanValue(r3, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f8, code lost:
        r11 = m48580c(r14, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00fc, code lost:
        if (r11 == null) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fe, code lost:
        r12 = android.net.Uri.parse(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0104, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0106, code lost:
        r7 = m48580c(r14, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x010b, code lost:
        r21 = m48580c(r14, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x010f, code lost:
        r3 = r3 + 1;
        r13 = r25;
        r11 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0117, code lost:
        r26 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0119, code lost:
        if (r21 == null) goto L_0x06a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x011b, code lost:
        if (r12 == null) goto L_0x0699;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x011d, code lost:
        r3 = com.google.android.gms.appdatasearch.RegisterCorpusInfo.m6149a(r21);
        r3.f17166a = r7;
        r3.f17167b = r12;
        r3.f17170e = r6;
        r3.f17173h = r15;
        r3.f17174i = r9;
        r3.f17175j = r4;
        r4 = new p000.abys(r1.f58758c);
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0139, code lost:
        if (r4.mo32458a() != false) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x013b, code lost:
        r10.add(new p000.abyq(r3.mo11228a(), r2));
        r7 = r17;
        r3 = r18;
        r9 = r19;
        r4 = r20;
        r12 = r22;
        r2 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0157, code lost:
        r7 = r4.mo32459b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0161, code lost:
        if ("Section".equals(r7) == false) goto L_0x04be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0163, code lost:
        r7 = " inside Section; expected SectionFeature";
        r9 = android.util.Xml.asAttributeSet(r1.f58758c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x016b, code lost:
        if (r9 == null) goto L_0x04b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x016d, code lost:
        r12 = "plain";
        r28 = r2;
        r29 = r4;
        r30 = r10;
        r2 = r12;
        r4 = null;
        r10 = null;
        r11 = false;
        r13 = 1;
        r14 = 0;
        r15 = false;
        r27 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x017e, code lost:
        r31 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0184, code lost:
        r32 = r6;
        r33 = r3;
        r34 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x018e, code lost:
        if (r14 >= r9.getAttributeCount()) goto L_0x0239;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        r12 = r9.getAttributeName(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x019a, code lost:
        if ("sectionId".equals(r12) != false) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01a2, code lost:
        if ("sectionFormat".equals(r12) != false) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01aa, code lost:
        if ("noIndex".equals(r12) != false) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01b2, code lost:
        if ("sectionWeight".equals(r12) != false) goto L_0x01f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01ba, code lost:
        if ("indexPrefixes".equals(r12) != false) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01c2, code lost:
        if ("subsectionSeparator".equals(r12) != false) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        r9 = "; expected ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01ca, code lost:
        if ("schemaOrgProperty".equals(r12) != false) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01cc, code lost:
        r2 = java.lang.String.valueOf(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01d4, code lost:
        if (r2.length() != 0) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01d6, code lost:
        r2 = new java.lang.String("Invalid attribute name ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01dc, code lost:
        r2 = "Invalid attribute name ".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01e4, code lost:
        throw m48579b(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01e5, code lost:
        r4 = m48580c(r9, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01ea, code lost:
        r10 = m48580c(r9, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r1.f58758c.getName().equals(r4) == false) goto L_0x07e0;
     */
    /* renamed from: a */
    public final abyr mo32460a(String str) {
        String str2;
        String str3;
        String str4 = "GlobalSearch";
        String str5 = "Corpus";
        String str6 = "AppDataSearch";
        while (true) {
            try {
                int next = this.f58758c.next();
                if (next == 1) {
                    throw m48579b("No start tag found!");
                } else if (next == 2) {
                    break;
                } else {
                    str6 = str2;
                    str5 = str3;
                }
            } catch (IOException | XmlPullParserException e) {
                absg.m48195b(e, "Failed to read search metadata from package %s", this.f58756a.packageName);
                String valueOf = String.valueOf(this.f58756a.packageName);
                throw m48579b(valueOf.length() == 0 ? new String("Failed to read search metadata from package ") : "Failed to read search metadata from package ".concat(valueOf));
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.res.Resources.getValue(int, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException}
     arg types: [int, android.util.TypedValue, int]
     candidates:
      ClspMth{android.content.res.Resources.getValue(java.lang.String, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException}
      ClspMth{android.content.res.Resources.getValue(int, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException} */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo32461a(String str, int i, boolean z) {
        if (i == 0) {
            return null;
        }
        try {
            this.f58757b.getResources().getValue(i, this.f58759d, true);
            if (!z) {
                if (this.f58759d.changingConfigurations != 0) {
                    throw m48579b(String.valueOf(str).concat(" must not change between configurations"));
                }
            }
            int i2 = this.f58759d.type;
            if (i2 == 0) {
                return null;
            }
            if (i2 != 3) {
                throw m48579b(String.valueOf(str).concat(" does not refer to a string resource"));
            } else if (this.f58759d.string != null) {
                return this.f58759d.string.toString();
            } else {
                throw m48579b(String.valueOf(str).concat(" refer to a null string resource"));
            }
        } catch (Resources.NotFoundException e) {
            throw m48577a(String.valueOf(str).concat(" resource not found"), e);
        } catch (NullPointerException e2) {
            throw m48577a(String.valueOf(str).concat(" getStringResource threw a NPE"), e2);
        }
    }
}
