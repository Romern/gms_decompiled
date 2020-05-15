package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.provider.ContactsContract;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;

/* renamed from: lyy */
final /* synthetic */ class lyy implements Callable {

    /* renamed from: a */
    private final lyz f33230a;

    public lyy(lyz lyz) {
        this.f33230a = lyz;
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:749:0x011a */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:275:0x04ff */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:762:0x04ff */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:288:0x0550 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:764:0x04ff */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:292:0x0560 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:222:0x041a */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:758:0x041a */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:166:0x0326 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:754:0x0326 */
    /* JADX INFO: additional move instructions added (2) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:746:0x011a */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:748:0x011a */
    /* JADX WARN: Type inference failed for: r23v14, assign insn: PHI: (r23v14 ?) = (r23v26 ?), (r23v20 ?) binds: [B:274:0x04fd, B:762:0x04ff] */
    /* JADX WARN: Type inference failed for: r23v15, assign insn: PHI: (r23v15 ?) = (r23v14 ?), (r23v23 ?), (r23v23 ?) binds: [B:275:0x04ff, B:288:0x0550, B:292:0x0560] */
    /* JADX WARN: Type inference failed for: r23v17, assign insn: PHI: (r23v17 ?) = (r23v18 java.util.HashMap), (r23v23 ?) binds: [B:315:0x05b1, B:309:0x05a1] */
    /* JADX WARN: Type inference failed for: r23v20, assign insn: PHI: (r23v20 ?) = (r23v21 java.util.HashMap), (r23v23 ?) binds: [B:765:0x04ff, B:764:0x04ff] */
    /* JADX WARN: Type inference failed for: r23v23, assign insn: PHI: (r23v23 ?) = (r23v24 java.util.HashMap), (r23v25 java.util.HashMap) binds: [B:287:0x054e, B:284:?] */
    /* JADX WARN: Type inference failed for: r10v24, assign insn: PHI: (r10v24 ?) = (r10v23 java.util.concurrent.ExecutorCompletionService), (r10v25 java.util.concurrent.ExecutorCompletionService) binds: [B:757:0x0326, B:756:0x0326] */
    /* JADX WARN: Type inference failed for: r22v19, assign insn: PHI: (r22v19 ?) = (r22v21 ?), (r22v24 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]), (r22v25 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) binds: [B:155:0x0304, B:146:0x02e4, B:101:0x0229] */
    /* JADX WARN: Type inference failed for: r24v22, types: [long], assign insn: 0x0126: INVOKE  (r24v22 ? I:long) = (r14v3 android.database.Cursor), (r15v41 int) type: INTERFACE call: android.database.Cursor.getLong(int):long */
    /* JADX WARN: Type inference failed for: r23v26, assign insn: PHI: (r23v26 ?) = (r23v26 ?), (r23v27 ?), (r23v27 ?) binds: [B:749:0x011a, B:748:0x011a, B:747:0x011a] */
    /* JADX WARN: Type inference failed for: r22v21, assign insn: PHI: (r22v21 ?) = (r22v21 ?), (r22v22 ?), (r22v22 ?) binds: [B:749:0x011a, B:748:0x011a, B:747:0x011a] */
    /* JADX WARN: Type inference failed for: r22v22, types: [java.lang.String], assign insn: 0x0150: INVOKE  (r22v22 ? I:java.lang.String) = (r14v3 android.database.Cursor), (r6v47 int) type: INTERFACE call: android.database.Cursor.getString(int):java.lang.String */
    /* JADX WARN: Type inference failed for: r23v27, types: [java.lang.String], assign insn: 0x015a: INVOKE  (r23v27 ? I:java.lang.String) = (r14v3 android.database.Cursor), (r6v49 int) type: INTERFACE call: android.database.Cursor.getString(int):java.lang.String */
    /* JADX WARN: Type inference failed for: r21v29, types: [long], assign insn: 0x00ae: INVOKE  (r21v29 ? I:long) = (r11v5 android.database.Cursor), (r13v7 int) type: INTERFACE call: android.database.Cursor.getLong(int):long */
    /* JADX WARN: Type inference failed for: r22v24, assign insn: 0x01d3: CONST  (r22v24 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r22v25, assign insn: 0x01d3: CONST  (r22v25 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r23v29, assign insn: ?: MOVE  (r23v29 ?) = (r23v16 boolean) */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02f2, code lost:
        if (r14 == null) goto L_0x0317;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0312, code lost:
        if (r14 == null) goto L_0x0317;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:?, code lost:
        r14.close();
        r22 = r22;
        r21 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0317, code lost:
        r1 = new java.util.HashMap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:?, code lost:
        r4 = r3.mo19775a("vnd.android.cursor.item/website", p000.lzg.f33258o);
        r21 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0324, code lost:
        if (r4 == null) goto L_0x03d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x032a, code lost:
        if (r4.moveToNext() == false) goto L_0x03c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x032c, code lost:
        r7 = java.lang.Long.valueOf(r4.getLong(r4.getColumnIndex("raw_contact_id")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x033e, code lost:
        if (r5.contains(r7) == false) goto L_0x03c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0340, code lost:
        r8 = r4.getString(r4.getColumnIndex("data1"));
        r9 = r4.getInt(r4.getColumnIndex("data2"));
        r14 = r4.getString(r4.getColumnIndex("data3"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0362, code lost:
        if (r1.containsKey(r7) != false) goto L_0x0373;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:?, code lost:
        r1.put(r7, new java.util.ArrayList());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x036d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x036e, code lost:
        r7 = r0;
        r21 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:?, code lost:
        r7 = (java.util.ArrayList) r1.get(r7);
        r15 = p000.bstg.f147003d.mo74144da();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x037f, code lost:
        if (r8 == null) goto L_0x0399;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0381, code lost:
        r21 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0385, code lost:
        if (r15.f164950c != false) goto L_0x0388;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0388, code lost:
        r15.mo74035c();
        r15.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x038f, code lost:
        r8.getClass();
        ((p000.bstg) r15.f164949b).f147005a = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0399, code lost:
        r21 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x039d, code lost:
        if (r15.f164950c != false) goto L_0x03a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03a0, code lost:
        r15.mo74035c();
        r15.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x03a6, code lost:
        r8 = (p000.bstg) r15.f164949b;
        r8.f147006b = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x03ac, code lost:
        if (r14 != null) goto L_0x03af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03af, code lost:
        r14.getClass();
        r8.f147007c = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x03b4, code lost:
        r7.add((p000.bstg) r15.mo74062i());
        r10 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x03c1, code lost:
        r21 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x03c5, code lost:
        r21 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x03c8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x03c9, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x03cb, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x03cc, code lost:
        r21 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x03ce, code lost:
        r7 = r0;
        r21 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x03d0, code lost:
        r21 = r10;
        p000.lzg.f33247a.mo25416d("Could not query ContactsProvider to fetch Website info; disabled? Give up.", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x03dc, code lost:
        if (r4 != null) goto L_0x03df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x03e3, code lost:
        r6 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x03e6, code lost:
        r0 = e;
        r21 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x03e8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x03e9, code lost:
        r1 = r0;
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x03ed, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x03ee, code lost:
        r21 = r10;
        r7 = r0;
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:?, code lost:
        p000.lzg.f33247a.mo25417e("ContentResolver.query threw an exception when fetching website info", r7, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x03fc, code lost:
        if (r4 == null) goto L_0x03ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:?, code lost:
        r4 = new java.util.HashMap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:?, code lost:
        r7 = r3.f33271g.getContentResolver().query(android.provider.ContactsContract.CommonDataKinds.StructuredPostal.CONTENT_URI, p000.lzg.f33262s, null, null, null);
        r22 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0418, code lost:
        if (r7 == null) goto L_0x04bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x041e, code lost:
        if (r7.moveToNext() == false) goto L_0x04b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0420, code lost:
        r8 = java.lang.Long.valueOf(r7.getLong(r7.getColumnIndex("raw_contact_id")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0432, code lost:
        if (r5.contains(r8) == false) goto L_0x04ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0434, code lost:
        r9 = r7.getString(r7.getColumnIndex("data1"));
        r10 = r7.getInt(r7.getColumnIndex("data2"));
        r14 = r7.getString(r7.getColumnIndex("data3"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0456, code lost:
        if (r4.containsKey(r8) != false) goto L_0x0460;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0458, code lost:
        r4.put(r8, new java.util.ArrayList());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0460, code lost:
        r8 = (java.util.List) r4.get(r8);
        r15 = p000.bstb.f146964d.mo74144da();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x046c, code lost:
        if (r9 == null) goto L_0x0486;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x046e, code lost:
        r22 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0472, code lost:
        if (r15.f164950c != false) goto L_0x0475;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0475, code lost:
        r15.mo74035c();
        r15.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x047c, code lost:
        r9.getClass();
        ((p000.bstb) r15.f164949b).f146966a = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0486, code lost:
        r22 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x048a, code lost:
        if (r15.f164950c != false) goto L_0x048d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x048d, code lost:
        r15.mo74035c();
        r15.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0493, code lost:
        r2 = (p000.bstb) r15.f164949b;
        r2.f146968c = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0499, code lost:
        if (r14 != null) goto L_0x049c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x049c, code lost:
        r14.getClass();
        r2.f146967b = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x04a1, code lost:
        r8.add((p000.bstb) r15.mo74062i());
        r2 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x04ae, code lost:
        r22 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x04b2, code lost:
        r22 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x04b5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x04b6, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x04b8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x04b9, code lost:
        r22 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x04bb, code lost:
        r2 = r0;
        r22 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x04bd, code lost:
        r22 = r2;
        p000.lzg.f33247a.mo25416d("Could not query ContactsProvider to fetch Postal info; disabled? Give up.", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x04c9, code lost:
        if (r7 != null) goto L_0x04cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x04d0, code lost:
        r6 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x04d3, code lost:
        r0 = e;
        r22 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x04d5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x04d6, code lost:
        r1 = r0;
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x04da, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x04db, code lost:
        r22 = r2;
        r2 = r0;
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:?, code lost:
        p000.lzg.f33247a.mo25417e("ContentResolver.query threw an exception when fetching postal info", r2, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x04e9, code lost:
        if (r7 == null) goto L_0x04ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:?, code lost:
        r2 = r3.mo19779b(r5);
        r7 = new java.util.HashMap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:?, code lost:
        r8 = r3.mo19775a("vnd.android.cursor.item/relation", p000.lzg.f33260q);
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x04fd, code lost:
        if (r8 == null) goto L_0x05b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0503, code lost:
        if (r8.moveToNext() == false) goto L_0x05a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0505, code lost:
        r9 = java.lang.Long.valueOf(r8.getLong(r8.getColumnIndex("raw_contact_id")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0517, code lost:
        if (r5.contains(r9) == false) goto L_0x05a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0519, code lost:
        r10 = r8.getString(r8.getColumnIndex("data1"));
        r14 = r8.getInt(r8.getColumnIndex("data2"));
        r15 = r8.getString(r8.getColumnIndex("data3"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x053b, code lost:
        if (r7.containsKey(r9) != false) goto L_0x054e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x053d, code lost:
        r23 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:?, code lost:
        r7.put(r9, new java.util.ArrayList());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0548, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0549, code lost:
        r4 = r0;
        r24 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x054e, code lost:
        r23 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:?, code lost:
        r4 = (java.util.ArrayList) r7.get(r9);
        r9 = p000.bstd.f146991d.mo74144da();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x055c, code lost:
        if (r10 == null) goto L_0x0576;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x055e, code lost:
        r24 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0562, code lost:
        if (r9.f164950c != false) goto L_0x0565;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0565, code lost:
        r9.mo74035c();
        r9.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x056c, code lost:
        r10.getClass();
        ((p000.bstd) r9.f164949b).f146993a = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0576, code lost:
        r24 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x057a, code lost:
        if (r9.f164950c != false) goto L_0x057d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x057d, code lost:
        r9.mo74035c();
        r9.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0583, code lost:
        r7 = (p000.bstd) r9.f164949b;
        r7.f146994b = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0589, code lost:
        if (r15 != null) goto L_0x058c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x058c, code lost:
        r15.getClass();
        r7.f146995c = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0591, code lost:
        r4.add((p000.bstd) r9.mo74062i());
        r4 = r23;
        r7 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x05a0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x05a2, code lost:
        r23 = r4;
        r24 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x05a8, code lost:
        r23 = r4;
        r24 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x05ad, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x05ae, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x05b0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x05b1, code lost:
        r23 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x05b3, code lost:
        r24 = r7;
        r23 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x05b5, code lost:
        r4 = r0;
        r24 = r24;
        r23 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x05b7, code lost:
        r23 = r4;
        r24 = r7;
        p000.lzg.f33247a.mo25416d("Could not query CP2 to fetch relation info; disabled? Give up.", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x05c5, code lost:
        if (r8 == null) goto L_0x05e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x05cb, code lost:
        r6 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x05ce, code lost:
        r0 = e;
        r24 = r24;
        r23 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x05d0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x05d1, code lost:
        r1 = r0;
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x05d5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x05d6, code lost:
        r23 = r4;
        r24 = r7;
        r4 = r0;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:?, code lost:
        p000.lzg.f33247a.mo25417e("ContentResolver.query threw an exception when fetching relation info", r4, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x05e6, code lost:
        if (r8 != null) goto L_0x05c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:?, code lost:
        r3.mo19780b(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:?, code lost:
        r4 = r3.mo19775a("vnd.android.cursor.item/note", p000.lzg.f33264u);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x05f4, code lost:
        if (r4 == null) goto L_0x0629;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x05fa, code lost:
        if (r4.moveToNext() == false) goto L_0x0633;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x05fc, code lost:
        r7 = java.lang.Long.valueOf(r4.getLong(r4.getColumnIndex("raw_contact_id")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x060e, code lost:
        if (r13.containsKey(r7) == false) goto L_0x05f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0610, code lost:
        ((p000.lzf) r13.get(r7)).f33243f = r4.getString(r4.getColumnIndex("data1"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0623, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0624, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0626, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0627, code lost:
        r7 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x0629, code lost:
        p000.lzg.f33247a.mo25416d("Could not query ContactsProvider to fetch Note info; disabled? Give up.", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x0633, code lost:
        if (r4 != null) goto L_0x0636;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x063a, code lost:
        r6 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x063d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x063e, code lost:
        r1 = r0;
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0642, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0643, code lost:
        r7 = r0;
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:?, code lost:
        p000.lzg.f33247a.mo25417e("ContentResolver.query threw an exception when fetching note info", r7, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x064f, code lost:
        if (r4 != null) goto L_0x0636;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:?, code lost:
        r4 = r3.mo19775a("vnd.android.cursor.item/nickname", p000.lzg.f33263t);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x065a, code lost:
        if (r4 == null) goto L_0x06e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0660, code lost:
        if (r4.moveToNext() == false) goto L_0x06f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0662, code lost:
        r7 = java.lang.Long.valueOf(r4.getLong(r4.getColumnIndex("raw_contact_id")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x0674, code lost:
        if (r13.containsKey(r7) == false) goto L_0x065c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0676, code lost:
        r8 = r4.getString(r4.getColumnIndex("data1"));
        r9 = java.lang.Integer.valueOf(r4.getInt(r4.getColumnIndex("data2")));
        r10 = r4.getString(r4.getColumnIndex("data3"));
        r14 = p000.bssy.f146939d.mo74144da();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x069e, code lost:
        if (r8 == null) goto L_0x06b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x06a2, code lost:
        if (r14.f164950c != false) goto L_0x06a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x06a5, code lost:
        r14.mo74035c();
        r14.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x06ac, code lost:
        r8.getClass();
        ((p000.bssy) r14.f164949b).f146941a = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x06b5, code lost:
        r8 = r9.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x06bb, code lost:
        if (r14.f164950c != false) goto L_0x06be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x06be, code lost:
        r14.mo74035c();
        r14.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x06c4, code lost:
        r9 = (p000.bssy) r14.f164949b;
        r9.f146943c = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x06ca, code lost:
        if (r10 != null) goto L_0x06cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x06cd, code lost:
        r10.getClass();
        r9.f146942b = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x06d2, code lost:
        ((p000.lzf) r13.get(r7)).f33245h = (p000.bssy) r14.mo74062i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x06e2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x06e3, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x06e5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x06e6, code lost:
        r7 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x06e8, code lost:
        p000.lzg.f33247a.mo25416d("Could not query ContactsProvider to fetch Nickname info; disabled?Give up.", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x06f2, code lost:
        if (r4 != null) goto L_0x06f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x06f9, code lost:
        r6 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x06fc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x06fd, code lost:
        r1 = r0;
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0701, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0702, code lost:
        r7 = r0;
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:?, code lost:
        p000.lzg.f33247a.mo25417e("ContentResolver.query threw an exception when fetching note info", r7, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x070e, code lost:
        if (r4 != null) goto L_0x06f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:?, code lost:
        r3.mo19777a(r13);
        r4 = r13.size();
        r7 = new java.util.ArrayList(r4);
        r5 = r5.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x0725, code lost:
        if (r5.hasNext() == false) goto L_0x0a41;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x0727, code lost:
        r8 = (java.lang.Long) r5.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0731, code lost:
        if (java.lang.Thread.interrupted() != false) goto L_0x0a3b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0733, code lost:
        r9 = (p000.lzf) r13.get(r8);
        r10 = p000.bstc.f146969u.mo74144da();
        r14 = r8.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x0745, code lost:
        if (r10.f164950c != false) goto L_0x0748;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x0748, code lost:
        r10.mo74035c();
        r10.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x074e, code lost:
        r8 = (p000.bstc) r10.f164949b;
        r8.f146979i = r14;
        r8.f146980j = r9.f33239b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x075c, code lost:
        if (r9.mo19774a() != false) goto L_0x075f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x075f, code lost:
        r8 = r9.f33241d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x0763, code lost:
        if (r10.f164950c != false) goto L_0x0766;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0766, code lost:
        r10.mo74035c();
        r10.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x076c, code lost:
        r8.getClass();
        ((p000.bstc) r10.f164949b).f146975e = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x077b, code lost:
        if (android.text.TextUtils.isEmpty(r9.f33244g) == false) goto L_0x077e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x077e, code lost:
        r8 = r9.f33244g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x0782, code lost:
        if (r10.f164950c != false) goto L_0x0785;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x0785, code lost:
        r10.mo74035c();
        r10.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x078b, code lost:
        r8.getClass();
        ((p000.bstc) r10.f164949b).f146971a = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x079a, code lost:
        if (android.text.TextUtils.isEmpty(r9.f33243f) != false) goto L_0x07b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x079c, code lost:
        r8 = r9.f33243f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x07a0, code lost:
        if (r10.f164950c != false) goto L_0x07a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x07a3, code lost:
        r10.mo74035c();
        r10.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x07a9, code lost:
        r8.getClass();
        ((p000.bstc) r10.f164949b).f146981k = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x07b2, code lost:
        r8 = r9.f33245h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x07b4, code lost:
        if (r8 == null) goto L_0x07d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x07bc, code lost:
        if (r8.f146941a.isEmpty() != false) goto L_0x07d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x07be, code lost:
        r8 = r9.f33245h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x07c2, code lost:
        if (r10.f164950c != false) goto L_0x07c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x07c5, code lost:
        r10.mo74035c();
        r10.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x07cb, code lost:
        r8.getClass();
        ((p000.bstc) r10.f164949b).f146984n = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x07d4, code lost:
        r8 = r9.f33246i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x07d6, code lost:
        if (r8 != null) goto L_0x07d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x07db, code lost:
        if (r10.f164950c != false) goto L_0x07de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x07de, code lost:
        r10.mo74035c();
        r10.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x07e5, code lost:
        r8.getClass();
        ((p000.bstc) r10.f164949b).f146987q = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x07f4, code lost:
        if (android.text.TextUtils.isEmpty(r9.f33242e) == false) goto L_0x07f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:0x07f7, code lost:
        r8 = r9.f33242e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x07fb, code lost:
        if (r10.f164950c != false) goto L_0x07fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x07fe, code lost:
        r10.mo74035c();
        r10.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x0804, code lost:
        r8.getClass();
        ((p000.bstc) r10.f164949b).f146990t = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x0819, code lost:
        if (((java.lang.Boolean) r3.f33270d.mo6606a()).booleanValue() == false) goto L_0x083b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x0821, code lost:
        if (android.text.TextUtils.isEmpty(r9.f33240c) == false) goto L_0x0824;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x0824, code lost:
        r8 = r9.f33240c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x0828, code lost:
        if (r10.f164950c != false) goto L_0x082b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x082b, code lost:
        r10.mo74035c();
        r10.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x0831, code lost:
        r8.getClass();
        ((p000.bstc) r10.f164949b).f146978h = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x083b, code lost:
        r8 = r9.f33240c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x083f, code lost:
        if (r10.f164950c != false) goto L_0x0842;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x0842, code lost:
        r10.mo74035c();
        r10.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x0848, code lost:
        r8.getClass();
        ((p000.bstc) r10.f164949b).f146978h = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x0851, code lost:
        r8 = (p000.lzd) r12.get(java.lang.Long.valueOf(r9.f33239b));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x085d, code lost:
        if (r8 != null) goto L_0x0863;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x085f, code lost:
        r25 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x0867, code lost:
        if (r8.mo19762b() <= 0) goto L_0x08b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x0869, code lost:
        r14 = r8.mo19762b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x086f, code lost:
        if (r10.f164950c != false) goto L_0x0872;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x0872, code lost:
        r10.mo74035c();
        r10.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0878, code lost:
        ((p000.bstc) r10.f164949b).f146976f = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x0889, code lost:
        if (r8.mo19763c() <= 1240790401000L) goto L_0x08b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x0895, code lost:
        if (r8.mo19763c() >= java.lang.System.currentTimeMillis()) goto L_0x08af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0897, code lost:
        r14 = r8.mo19763c();
        r25 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x089f, code lost:
        if (r10.f164950c != false) goto L_0x08a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x08a2, code lost:
        r10.mo74035c();
        r10.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x08a8, code lost:
        ((p000.bstc) r10.f164949b).f146977g = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x08af, code lost:
        r25 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x08b2, code lost:
        r25 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x08b5, code lost:
        r25 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x08b7, code lost:
        r5 = r8.mo19764d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x08bd, code lost:
        if (r10.f164950c != false) goto L_0x08c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x08c0, code lost:
        r10.mo74035c();
        r10.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x08c6, code lost:
        ((p000.bstc) r10.f164949b).f146985o = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x08cc, code lost:
        r5 = (java.util.List) r6.get(java.lang.Long.valueOf(r9.f33238a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x08d8, code lost:
        if (r5 != null) goto L_0x08db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x08dd, code lost:
        if (r10.f164950c != false) goto L_0x08e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x08e0, code lost:
        r10.mo74035c();
        r10.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:0x08e6, code lost:
        r8 = (p000.bstc) r10.f164949b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x08f0, code lost:
        if (r8.f146972b.mo73666a() != false) goto L_0x08fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x08f2, code lost:
        r8.f146972b = p000.GeneratedMessageLite.m124021a(r8.f146972b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x08fa, code lost:
        p000.bxsy.m123078a(r5, r8.f146972b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:0x08ff, code lost:
        r5 = (java.util.List) r11.get(java.lang.Long.valueOf(r9.f33238a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x090b, code lost:
        if (r5 != null) goto L_0x090e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:0x0910, code lost:
        if (r10.f164950c != false) goto L_0x0913;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x0913, code lost:
        r10.mo74035c();
        r10.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x0919, code lost:
        r8 = (p000.bstc) r10.f164949b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x0923, code lost:
        if (r8.f146973c.mo73666a() != false) goto L_0x092d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:519:0x0925, code lost:
        r8.f146973c = p000.GeneratedMessageLite.m124021a(r8.f146973c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:520:0x092d, code lost:
        p000.bxsy.m123078a(r5, r8.f146973c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:0x0932, code lost:
        r5 = (java.util.List) r1.get(java.lang.Long.valueOf(r9.f33238a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x093e, code lost:
        if (r5 != null) goto L_0x0941;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x0943, code lost:
        if (r10.f164950c != false) goto L_0x0946;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:0x0946, code lost:
        r10.mo74035c();
        r10.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x094c, code lost:
        r8 = (p000.bstc) r10.f164949b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x0956, code lost:
        if (r8.f146986p.mo73666a() != false) goto L_0x0960;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x0958, code lost:
        r8.f146986p = p000.GeneratedMessageLite.m124021a(r8.f146986p);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:0x0960, code lost:
        p000.bxsy.m123078a(r5, r8.f146986p);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:532:0x0965, code lost:
        r5 = (java.util.List) r2.get(java.lang.Long.valueOf(r9.f33238a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x0971, code lost:
        if (r5 != null) goto L_0x0974;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x0976, code lost:
        if (r10.f164950c != false) goto L_0x0979;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:0x0979, code lost:
        r10.mo74035c();
        r10.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:539:0x097f, code lost:
        r8 = (p000.bstc) r10.f164949b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:0x0989, code lost:
        if (r8.f146988r.mo73666a() != false) goto L_0x0993;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:541:0x098b, code lost:
        r8.f146988r = p000.GeneratedMessageLite.m124021a(r8.f146988r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:542:0x0993, code lost:
        p000.bxsy.m123078a(r5, r8.f146988r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:543:0x0998, code lost:
        r8 = r24;
        r5 = (java.util.List) r8.get(java.lang.Long.valueOf(r9.f33238a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x09a6, code lost:
        if (r5 != null) goto L_0x09a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:547:0x09ab, code lost:
        if (r10.f164950c != false) goto L_0x09ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:549:0x09ae, code lost:
        r10.mo74035c();
        r10.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:550:0x09b4, code lost:
        r14 = (p000.bstc) r10.f164949b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:551:0x09be, code lost:
        if (r14.f146989s.mo73666a() != false) goto L_0x09c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:552:0x09c0, code lost:
        r14.f146989s = p000.GeneratedMessageLite.m124021a(r14.f146989s);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:553:0x09c8, code lost:
        p000.bxsy.m123078a(r5, r14.f146989s);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:554:0x09cd, code lost:
        r14 = r23;
        r5 = (java.util.List) r14.get(java.lang.Long.valueOf(r9.f33238a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:555:0x09db, code lost:
        if (r5 == null) goto L_0x0a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:557:0x09df, code lost:
        if (r10.f164950c != false) goto L_0x09e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:559:0x09e2, code lost:
        r10.mo74035c();
        r10.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:560:0x09e8, code lost:
        r15 = (p000.bstc) r10.f164949b;
        r23 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:561:0x09f4, code lost:
        if (r15.f146974d.mo73666a() != false) goto L_0x09fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:562:0x09f6, code lost:
        r15.f146974d = p000.GeneratedMessageLite.m124021a(r15.f146974d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:563:0x09fe, code lost:
        p000.bxsy.m123078a(r5, r15.f146974d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:564:0x0a04, code lost:
        r23 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:565:0x0a06, code lost:
        if (r22 == false) goto L_0x0a24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:566:0x0a08, code lost:
        r21.submit(new p000.lze(r3, (p000.bstc) r10.mo74062i(), r9));
        r21 = r21;
        r24 = r8;
        r1 = r23;
        r5 = r25;
        r23 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:567:0x0a24, code lost:
        r7.add((p000.bstc) r10.mo74062i());
        r21 = r21;
        r24 = r8;
        r1 = r23;
        r5 = r25;
        r23 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:569:0x0a40, code lost:
        throw new java.lang.InterruptedException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:570:0x0a41, code lost:
        r5 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:571:0x0a43, code lost:
        if (r22 == false) goto L_0x0a81;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:572:0x0a45, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:573:0x0a46, code lost:
        if (r1 >= r4) goto L_0x0a81;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:575:?, code lost:
        r7.add((p000.bstc) r5.take().get());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:576:0x0a55, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:596:0x0a81, code lost:
        if (r20 == null) goto L_0x0a86;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:598:?, code lost:
        r20.shutdownNow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:599:0x0a86, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:602:?, code lost:
        r3.f33272h = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:603:0x0a8b, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:604:0x0a8c, code lost:
        r2 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:622:0x0b02, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:623:0x0b03, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:628:0x0b06, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:629:0x0b07, code lost:
        r1 = r0;
        r6 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:630:0x0b09, code lost:
        if (r6 != null) goto L_0x0b0b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:632:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:633:0x0b0e, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:634:0x0b0f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:635:0x0b10, code lost:
        r1 = r0;
        r6 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:636:0x0b12, code lost:
        if (r6 != null) goto L_0x0b14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:637:0x0b14, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:638:0x0b17, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:639:0x0b18, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:640:0x0b19, code lost:
        r1 = r0;
        r6 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:641:0x0b1b, code lost:
        if (r6 != null) goto L_0x0b1d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:642:0x0b1d, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:643:0x0b20, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:644:0x0b21, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:645:0x0b22, code lost:
        r1 = r0;
        r6 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:646:0x0b24, code lost:
        if (r6 != null) goto L_0x0b26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:647:0x0b26, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:648:0x0b29, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:649:0x0b2a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:650:0x0b2b, code lost:
        r1 = r0;
        r6 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:651:0x0b2d, code lost:
        if (r6 != null) goto L_0x0b2f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:652:0x0b2f, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:653:0x0b32, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03c8 A[Catch:{ SQLiteException -> 0x03e6, all -> 0x03c8 }, ExcHandler: all (r0v61 'th' java.lang.Throwable A[CUSTOM_DECLARE, Catch:{ SQLiteException -> 0x03e6, all -> 0x03c8 }]), Splitter:B:177:0x0373] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x04b5 A[Catch:{ SQLiteException -> 0x04d3, all -> 0x04b5 }, ExcHandler: all (r0v54 'th' java.lang.Throwable A[CUSTOM_DECLARE, Catch:{ SQLiteException -> 0x04d3, all -> 0x04b5 }]), Splitter:B:222:0x041a] */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x05ad A[Catch:{ SQLiteException -> 0x05ce, all -> 0x05ad }, ExcHandler: all (r0v45 'th' java.lang.Throwable A[CUSTOM_DECLARE, Catch:{ SQLiteException -> 0x05ce, all -> 0x05ad }]), Splitter:B:288:0x0550] */
    /* JADX WARNING: Removed duplicated region for block: B:631:0x0b0b A[SYNTHETIC, Splitter:B:631:0x0b0b] */
    /* JADX WARNING: Removed duplicated region for block: B:637:0x0b14 A[Catch:{ ExecutionException -> 0x0a5e, InterruptedException -> 0x0a58, all -> 0x0c0c, all -> 0x0064 }] */
    /* JADX WARNING: Removed duplicated region for block: B:642:0x0b1d A[Catch:{ ExecutionException -> 0x0a5e, InterruptedException -> 0x0a58, all -> 0x0c0c, all -> 0x0064 }] */
    /* JADX WARNING: Removed duplicated region for block: B:647:0x0b26 A[Catch:{ ExecutionException -> 0x0a5e, InterruptedException -> 0x0a58, all -> 0x0c0c, all -> 0x0064 }] */
    /* JADX WARNING: Removed duplicated region for block: B:652:0x0b2f A[Catch:{ ExecutionException -> 0x0a5e, InterruptedException -> 0x0a58, all -> 0x0c0c, all -> 0x0064 }] */
    /* JADX WARNING: Removed duplicated region for block: B:657:0x0b38 A[Catch:{ ExecutionException -> 0x0a5e, InterruptedException -> 0x0a58, all -> 0x0c0c, all -> 0x0064 }] */
    /* JADX WARNING: Removed duplicated region for block: B:683:0x0ba0 A[SYNTHETIC, Splitter:B:683:0x0ba0] */
    /* JADX WARNING: Removed duplicated region for block: B:710:0x0c08 A[SYNTHETIC, Splitter:B:710:0x0c08] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:626:0x0b05=Splitter:B:626:0x0b05, B:605:0x0a8d=Splitter:B:605:0x0a8d} */
    /* JADX WARNING: Unknown variable types count: 3 */
    public final Object call() {
        Iterable iterable;
        bqgj bqgj;
        Throwable th;
        Throwable th2;
        ExecutorCompletionService executorCompletionService;
        bqgj bqgj2;
        bqgj bqgj3;
        Cursor cursor;
        Throwable th3;
        bqgj bqgj4;
        SQLiteException sQLiteException;
        Cursor cursor2;
        Throwable th4;
        bqgj bqgj5;
        SQLiteException sQLiteException2;
        String[] strArr;
        Cursor cursor3;
        Throwable th5;
        boolean z;
        ExecutorCompletionService executorCompletionService2;
        boolean z2;
        ExecutorCompletionService executorCompletionService3;
        Cursor cursor4;
        ? r22;
        SQLiteException sQLiteException3;
        bqgj bqgj6;
        ? r21;
        boolean z3;
        lyz lyz = this.f33230a;
        lyz.f33231a.logVerbose("Starting contact backup async", new Object[0]);
        bste bste = bste.f146996b;
        try {
            lzg lzg = new lzg(lyz.f33232b);
            lzg.f33247a.mo25412b("readContacts", new Object[0]);
            if (!lyz.m24693d()) {
                lzg.f33247a.mo25416d("Doesn't have READ_CONTACTS permission, give up reading contacts.", new Object[0]);
                iterable = bngx.m109376e();
            } else {
                synchronized (lzg) {
                    sdo.m34970a(lzg.f33272h == 0);
                }
                boolean H = cckw.f179263a.mo6606a().mo76218H();
                if (H) {
                    try {
                        bqgj2 = sne.m35694a(5, 9);
                        try {
                            executorCompletionService = new ExecutorCompletionService(bqgj2);
                        } catch (Throwable th6) {
                            th = th6;
                            bqgj = bqgj2;
                        }
                    } catch (ExecutionException e) {
                        ExecutionException executionException = e;
                        if (executionException.getCause() instanceof InterruptedException) {
                            bqgj3.shutdownNow();
                            throw ((InterruptedException) executionException.getCause());
                        }
                        throw new RuntimeException("Exception when fetching contact images", executionException.getCause());
                    } catch (InterruptedException e2) {
                        InterruptedException interruptedException = e2;
                        bqgj3.shutdownNow();
                        throw interruptedException;
                    } catch (Throwable th7) {
                        th = th7;
                        bqgj = null;
                    }
                } else {
                    bqgj2 = null;
                    executorCompletionService = null;
                }
                try {
                    lzg.f33250e = new lyw(lzg.f33271g).mo19768a();
                    HashMap hashMap = new HashMap();
                    try {
                        Cursor query = lzg.f33271g.getContentResolver().query(ContactsContract.Contacts.CONTENT_URI.buildUpon().appendQueryParameter("directory", "0").build(), lzg.f33252i, null, null, null);
                        if (query != null) {
                            while (query.moveToNext()) {
                                try {
                                    try {
                                        r21 = query.getLong(query.getColumnIndex("_id"));
                                        int i = query.getInt(query.getColumnIndex("times_contacted"));
                                        long j = query.getLong(query.getColumnIndex("last_time_contacted"));
                                        if (query.getInt(query.getColumnIndex("starred")) == 1) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        hashMap.put(Long.valueOf((long) r21), new lyv(r21, i, j, z3));
                                    } catch (SQLiteException e3) {
                                        sQLiteException = e3;
                                        bqgj4 = bqgj2;
                                        cursor = query;
                                        try {
                                            lzg.f33247a.mo25417e("ContentResolver.query threw an exception when fetching Contact Ids.", sQLiteException, new Object[0]);
                                            String valueOf = String.valueOf(sQLiteException);
                                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                                            sb.append("Fetching Contact Ids query failed.");
                                            sb.append(valueOf);
                                            throw new lzb(sb.toString());
                                        } catch (Throwable th8) {
                                            th3 = th8;
                                            if (cursor != null) {
                                            }
                                            throw th3;
                                        }
                                    } catch (Throwable th9) {
                                        th3 = th9;
                                        bqgj4 = bqgj2;
                                        cursor = query;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        throw th3;
                                    }
                                } catch (SQLiteException e4) {
                                    e = e4;
                                    bqgj4 = bqgj2;
                                    sQLiteException = e;
                                    cursor = query;
                                    lzg.f33247a.mo25417e("ContentResolver.query threw an exception when fetching Contact Ids.", sQLiteException, new Object[0]);
                                    String valueOf2 = String.valueOf(sQLiteException);
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 34);
                                    sb2.append("Fetching Contact Ids query failed.");
                                    sb2.append(valueOf2);
                                    throw new lzb(sb2.toString());
                                } catch (Throwable th10) {
                                    th = th10;
                                    bqgj4 = bqgj2;
                                    th3 = th;
                                    cursor = query;
                                    if (cursor != null) {
                                    }
                                    throw th3;
                                }
                            }
                            query.close();
                            HashSet hashSet = new HashSet(hashMap.keySet());
                            HashMap hashMap2 = new HashMap();
                            try {
                                Cursor query2 = lzg.f33271g.getContentResolver().query(ContactsContract.RawContacts.CONTENT_URI, lzg.f33253j, null, null, null);
                                String str = r21;
                                if (query2 != null) {
                                    while (query2.moveToNext()) {
                                        try {
                                            try {
                                                ? r24 = query2.getLong(query2.getColumnIndex("_id"));
                                                long j2 = query2.getLong(query2.getColumnIndex("contact_id"));
                                                if (hashSet.contains(Long.valueOf(j2))) {
                                                    str = query2.getString(query2.getColumnIndex("sourceid"));
                                                    r22 = query2.getString(query2.getColumnIndex("account_type"));
                                                    HashMap hashMap3 = query2.getString(query2.getColumnIndex("account_name"));
                                                    lzf lzf = new lzf(r24, j2, str, r22, hashMap3);
                                                    Long valueOf3 = Long.valueOf((long) r24);
                                                    if (hashMap2.containsKey(valueOf3)) {
                                                        lzg.f33247a.mo25418e("Raw contact id already exists, this should not happen.", new Object[0]);
                                                    } else {
                                                        hashMap2.put(valueOf3, lzf);
                                                    }
                                                }
                                            } catch (SQLiteException e5) {
                                                sQLiteException2 = e5;
                                                bqgj5 = bqgj2;
                                                cursor2 = query2;
                                                try {
                                                    lzg.f33247a.mo25417e("ContentResolver.query threw an exception when fetching raw-contacts.", sQLiteException2, new Object[0]);
                                                    String valueOf4 = String.valueOf(sQLiteException2);
                                                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf4).length() + 35);
                                                    sb3.append("Fetching raw contacts query failed.");
                                                    sb3.append(valueOf4);
                                                    throw new lzb(sb3.toString());
                                                } catch (Throwable th11) {
                                                    th4 = th11;
                                                    if (cursor2 != null) {
                                                    }
                                                    throw th4;
                                                }
                                            } catch (Throwable th12) {
                                                th4 = th12;
                                                bqgj5 = bqgj2;
                                                cursor2 = query2;
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                throw th4;
                                            }
                                        } catch (SQLiteException e6) {
                                            e = e6;
                                            bqgj5 = bqgj2;
                                            sQLiteException2 = e;
                                            cursor2 = query2;
                                            lzg.f33247a.mo25417e("ContentResolver.query threw an exception when fetching raw-contacts.", sQLiteException2, new Object[0]);
                                            String valueOf42 = String.valueOf(sQLiteException2);
                                            StringBuilder sb32 = new StringBuilder(String.valueOf(valueOf42).length() + 35);
                                            sb32.append("Fetching raw contacts query failed.");
                                            sb32.append(valueOf42);
                                            throw new lzb(sb32.toString());
                                        } catch (Throwable th13) {
                                            th = th13;
                                            bqgj5 = bqgj2;
                                            th4 = th;
                                            cursor2 = query2;
                                            if (cursor2 != null) {
                                            }
                                            throw th4;
                                        }
                                    }
                                    query2.close();
                                    HashSet hashSet2 = new HashSet(hashMap2.keySet());
                                    Map a = lzg.mo19776a(hashSet2);
                                    HashMap hashMap4 = new HashMap();
                                    ContentResolver contentResolver = lzg.f33271g.getContentResolver();
                                    if (cckw.m130266d()) {
                                        try {
                                            strArr = lzg.f33257n;
                                        } catch (Throwable th14) {
                                            th = th14;
                                            bqgj3 = bqgj2;
                                        }
                                    } else {
                                        strArr = lzg.f33256m;
                                    }
                                    try {
                                        bqgj6 = null;
                                        executorCompletionService3 = null;
                                        str = null;
                                        str = null;
                                        executorCompletionService2 = null;
                                        z2 = false;
                                        r22 = 0;
                                        r22 = 0;
                                        z = false;
                                        cursor4 = contentResolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, lzg.f33249c ? strArr : cckw.m130266d() ? lzg.f33255l : lzg.f33254k, null, null, null);
                                        if (cursor4 != null) {
                                            while (cursor4.moveToNext()) {
                                                try {
                                                    Long valueOf5 = Long.valueOf(cursor4.getLong(cursor4.getColumnIndex("raw_contact_id")));
                                                    if (hashSet2.contains(valueOf5)) {
                                                        String string = cursor4.getString(cursor4.getColumnIndex("data1"));
                                                        int i2 = cursor4.getInt(cursor4.getColumnIndex("data2"));
                                                        String string2 = cursor4.getString(cursor4.getColumnIndex("data3"));
                                                        if (!hashMap4.containsKey(valueOf5)) {
                                                            try {
                                                                hashMap4.put(valueOf5, new ArrayList());
                                                            } catch (SQLiteException e7) {
                                                                sQLiteException3 = e7;
                                                                bqgj6 = bqgj2;
                                                            } catch (Throwable th15) {
                                                                th5 = th15;
                                                                cursor3 = cursor4;
                                                                if (cursor3 != null) {
                                                                }
                                                                throw th5;
                                                            }
                                                        }
                                                        ArrayList arrayList = (ArrayList) hashMap4.get(valueOf5);
                                                        bxvd da = bsta.f146956g.mo74144da();
                                                        if (string != null) {
                                                            bqgj6 = bqgj2;
                                                            try {
                                                                if (da.f164950c) {
                                                                    da.mo74035c();
                                                                    da.f164950c = false;
                                                                }
                                                                string.getClass();
                                                                ((bsta) da.f164949b).f146958a = string;
                                                            } catch (SQLiteException e8) {
                                                                e = e8;
                                                                sQLiteException3 = e;
                                                                try {
                                                                    lzg.f33247a.mo25417e("ContentResolver.query threw an exception when fetching phone info", sQLiteException3, new Object[0]);
                                                                    z2 = r22;
                                                                    z = r22;
                                                                    executorCompletionService3 = str;
                                                                    executorCompletionService2 = str;
                                                                } catch (Throwable th16) {
                                                                    th5 = th16;
                                                                    cursor3 = cursor4;
                                                                    if (cursor3 != null) {
                                                                    }
                                                                    throw th5;
                                                                }
                                                            } catch (Throwable th17) {
                                                                th = th17;
                                                                th5 = th;
                                                                cursor3 = cursor4;
                                                                if (cursor3 != null) {
                                                                }
                                                                throw th5;
                                                            }
                                                        } else {
                                                            bqgj6 = bqgj2;
                                                        }
                                                        if (da.f164950c) {
                                                            da.mo74035c();
                                                            da.f164950c = false;
                                                        }
                                                        bsta bsta = (bsta) da.f164949b;
                                                        bsta.f146962e = i2;
                                                        if (string2 != null) {
                                                            string2.getClass();
                                                            bsta.f146959b = string2;
                                                        }
                                                        if (cckw.m130266d()) {
                                                            boolean z4 = cursor4.getInt(cursor4.getColumnIndex("is_super_primary")) != 0;
                                                            if (da.f164950c) {
                                                                da.mo74035c();
                                                                da.f164950c = false;
                                                            }
                                                            ((bsta) da.f164949b).f146963f = z4;
                                                        }
                                                        if (lzg.f33249c) {
                                                            int i3 = cursor4.getInt(cursor4.getColumnIndex("times_used"));
                                                            long j3 = cursor4.getLong(cursor4.getColumnIndex("last_time_used"));
                                                            if (da.f164950c) {
                                                                da.mo74035c();
                                                                da.f164950c = false;
                                                            }
                                                            bsta bsta2 = (bsta) da.f164949b;
                                                            bsta2.f146960c = i3;
                                                            bsta2.f146961d = j3;
                                                        }
                                                        arrayList.add((bsta) da.mo74062i());
                                                        bqgj2 = bqgj6;
                                                    } else {
                                                        bqgj6 = bqgj2;
                                                    }
                                                } catch (SQLiteException e9) {
                                                    e = e9;
                                                    bqgj6 = bqgj2;
                                                    sQLiteException3 = e;
                                                    lzg.f33247a.mo25417e("ContentResolver.query threw an exception when fetching phone info", sQLiteException3, new Object[0]);
                                                    z2 = r22;
                                                    z = r22;
                                                    executorCompletionService3 = str;
                                                    executorCompletionService2 = str;
                                                } catch (Throwable th18) {
                                                    th = th18;
                                                    th5 = th;
                                                    cursor3 = cursor4;
                                                    if (cursor3 != null) {
                                                        cursor3.close();
                                                    }
                                                    throw th5;
                                                }
                                            }
                                            bqgj3 = bqgj2;
                                        } else {
                                            bqgj3 = bqgj2;
                                            lzg.f33247a.mo25416d("Could not query ContactsProvider to fetch Phone info; disabled? Give up.", new Object[0]);
                                        }
                                    } catch (SQLiteException e10) {
                                        bqgj6 = bqgj2;
                                        sQLiteException3 = e10;
                                        cursor4 = null;
                                        lzg.f33247a.mo25417e("ContentResolver.query threw an exception when fetching phone info", sQLiteException3, new Object[0]);
                                        z2 = r22;
                                        z = r22;
                                        executorCompletionService3 = str;
                                        executorCompletionService2 = str;
                                    } catch (Throwable th19) {
                                        th5 = th19;
                                        cursor3 = null;
                                        if (cursor3 != null) {
                                        }
                                        throw th5;
                                    }
                                } else {
                                    bqgj5 = bqgj2;
                                    try {
                                        lzg.f33247a.mo25416d("Could not query ContactsProvider to fetch RawContacts; disabled? Give up.", new Object[0]);
                                        throw new lza("Raw contacts query cursor is null");
                                    } catch (SQLiteException e11) {
                                        e = e11;
                                        sQLiteException2 = e;
                                        cursor2 = query2;
                                        lzg.f33247a.mo25417e("ContentResolver.query threw an exception when fetching raw-contacts.", sQLiteException2, new Object[0]);
                                        String valueOf422 = String.valueOf(sQLiteException2);
                                        StringBuilder sb322 = new StringBuilder(String.valueOf(valueOf422).length() + 35);
                                        sb322.append("Fetching raw contacts query failed.");
                                        sb322.append(valueOf422);
                                        throw new lzb(sb322.toString());
                                    } catch (Throwable th20) {
                                        th = th20;
                                        th4 = th;
                                        cursor2 = query2;
                                        if (cursor2 != null) {
                                        }
                                        throw th4;
                                    }
                                }
                            } catch (SQLiteException e12) {
                                bqgj5 = bqgj2;
                                sQLiteException2 = e12;
                                cursor2 = null;
                                lzg.f33247a.mo25417e("ContentResolver.query threw an exception when fetching raw-contacts.", sQLiteException2, new Object[0]);
                                String valueOf4222 = String.valueOf(sQLiteException2);
                                StringBuilder sb3222 = new StringBuilder(String.valueOf(valueOf4222).length() + 35);
                                sb3222.append("Fetching raw contacts query failed.");
                                sb3222.append(valueOf4222);
                                throw new lzb(sb3222.toString());
                            } catch (Throwable th21) {
                                bqgj5 = bqgj2;
                                th4 = th21;
                                cursor2 = null;
                                if (cursor2 != null) {
                                }
                                throw th4;
                            }
                        } else {
                            bqgj4 = bqgj2;
                            try {
                                lzg.f33247a.mo25416d("Could not query ContactsProvider to fetch Contact Ids; disabled? Give up.", new Object[0]);
                                throw new lza("Contacts query cursor is null");
                            } catch (SQLiteException e13) {
                                e = e13;
                                sQLiteException = e;
                                cursor = query;
                                lzg.f33247a.mo25417e("ContentResolver.query threw an exception when fetching Contact Ids.", sQLiteException, new Object[0]);
                                String valueOf22 = String.valueOf(sQLiteException);
                                StringBuilder sb22 = new StringBuilder(String.valueOf(valueOf22).length() + 34);
                                sb22.append("Fetching Contact Ids query failed.");
                                sb22.append(valueOf22);
                                throw new lzb(sb22.toString());
                            } catch (Throwable th22) {
                                th = th22;
                                th3 = th;
                                cursor = query;
                                if (cursor != null) {
                                }
                                throw th3;
                            }
                        }
                    } catch (SQLiteException e14) {
                        bqgj4 = bqgj2;
                        sQLiteException = e14;
                        cursor = null;
                        lzg.f33247a.mo25417e("ContentResolver.query threw an exception when fetching Contact Ids.", sQLiteException, new Object[0]);
                        String valueOf222 = String.valueOf(sQLiteException);
                        StringBuilder sb222 = new StringBuilder(String.valueOf(valueOf222).length() + 34);
                        sb222.append("Fetching Contact Ids query failed.");
                        sb222.append(valueOf222);
                        throw new lzb(sb222.toString());
                    } catch (Throwable th23) {
                        bqgj4 = bqgj2;
                        th3 = th23;
                        cursor = null;
                        if (cursor != null) {
                        }
                        throw th3;
                    }
                } catch (Throwable th24) {
                    th = th24;
                    bqgj3 = bqgj2;
                    th = th;
                    bqgj = bqgj3;
                    if (bqgj != null) {
                        bqgj.shutdownNow();
                    }
                    synchronized (lzg) {
                        try {
                            lzg.f33272h = 0;
                        } catch (Throwable th25) {
                            while (true) {
                                th2 = th25;
                            }
                            throw th2;
                        }
                    }
                    throw th;
                }
            }
            bxvd da2 = bste.f146996b.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bste bste2 = (bste) da2.f164949b;
            if (!bste2.f146998a.mo73666a()) {
                bste2.f146998a = GeneratedMessageLite.m124021a(bste2.f146998a);
            }
            bxsy.m123078a(iterable, bste2.f146998a);
            bste bste3 = (bste) da2.mo74062i();
            lvn lvn = lyz.f33231a;
            Object[] objArr = new Object[1];
            int i4 = bste3.f164961ai;
            if (i4 == -1) {
                i4 = bxxm.f165037a.mo74228a(bste3).mo74223b(bste3);
                bste3.f164961ai = i4;
            }
            objArr[0] = Integer.valueOf(i4);
            lvn.mo25414c("Read Contacts data from source device successfully. Contacts data size = %d", objArr);
            int i5 = bste3.f164961ai;
            if (i5 == -1) {
                i5 = bxxm.f165037a.mo74228a(bste3).mo74223b(bste3);
                bste3.f164961ai = i5;
            }
            byte[] bArr = new byte[i5];
            bxuk a2 = bxuk.m123637a(bArr);
            bste3.mo73644a(a2);
            a2.mo73851c();
            return new ByteArrayInputStream(bArr);
        } catch (lzb e15) {
            lyz.f33231a.mo25417e("Failed to read contacts ", e15, new Object[0]);
            String valueOf6 = String.valueOf(e15);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf6).length() + 24);
            sb4.append("Failed to read contacts ");
            sb4.append(valueOf6);
            throw new lzb(sb4.toString());
        } catch (lza e16) {
            lyz.f33231a.mo25417e("Cursor null while querying for raw contacts", e16, new Object[0]);
            String valueOf7 = String.valueOf(e16);
            StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf7).length() + 42);
            sb5.append("Cursor null while querying for rawcontacts");
            sb5.append(valueOf7);
            throw new lza(sb5.toString());
        } catch (Throwable th26) {
            while (true) {
            }
            throw th26;
        }
    }
}
