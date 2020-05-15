package p000;

import android.net.TrafficStats;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URLDecoder;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* renamed from: bdcb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdcb implements Runnable, Delayed {

    /* renamed from: a */
    final /* synthetic */ bdbv f105311a;

    /* renamed from: b */
    final /* synthetic */ bdce f105312b;

    public bdcb() {
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Delayed delayed = (Delayed) obj;
        return 0;
    }

    public final long getDelay(TimeUnit timeUnit) {
        return 0;
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Type inference failed for: r6v1, types: [bdbs], assign insn: PHI: (r6v1 ?) = (r6v2 ?), (r6v21 ?), (r6v22 ?), (r6v28 ?), (r6v32 ?), (r6v34 ?), (r6v36 ?), (r6v42 ?) binds: [B:468:0x0719, B:421:0x066b, B:412:0x0653, B:317:0x0542, B:194:0x032a, B:161:0x02c7, B:101:0x01cc, B:434:0x068c] */
    /* JADX WARN: Type inference failed for: r6v2, assign insn: 0x071b: MOVE  (r6v2 ? I:?[OBJECT, ARRAY]) = (r13v3 java.net.HttpURLConnection) */
    /* JADX WARN: Type inference failed for: r15v3, assign insn: PHI: (r15v3 ?) = (r15v6 ?), (r15v54 ?), (r15v61 ?) binds: [B:433:0x0689, B:105:0x01e2, B:17:0x0059] */
    /* JADX WARN: Type inference failed for: r15v6, assign insn: PHI: (r15v6 ?) = (r15v7 ?), (r15v9 ?), (r15v49 ?) binds: [B:432:0x0688, B:428:0x067e, B:138:0x0260] */
    /* JADX WARN: Type inference failed for: r15v7, assign insn: 0x0688: MOVE  (r15v7 ? I:?[OBJECT, ARRAY]) = (null java.lang.Object) */
    /* JADX WARN: Type inference failed for: r15v9, assign insn: 0x067e: CONST  (r15v9 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (null java.lang.Object) */
    /* JADX WARN: Type inference failed for: r6v21, assign insn: 0x066c: MOVE  (r6v21 ? I:?[OBJECT, ARRAY]) = (r15v13 java.net.HttpURLConnection) */
    /* JADX WARN: Type inference failed for: r6v22, assign insn: 0x0653: MOVE  (r6v22 ? I:?[OBJECT, ARRAY]) = (r13v14 java.net.HttpURLConnection) */
    /* JADX WARN: Type inference failed for: r6v28, assign insn: 0x0545: CONST  (r6v28 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r6v32, assign insn: 0x032e: CONST  (r6v32 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r6v34, assign insn: 0x02c9: CONST  (r6v34 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r15v49, assign insn: 0x0260: MOVE  (r15v49 ? I:?[OBJECT, ARRAY]) = (null java.lang.Object) */
    /* JADX WARN: Type inference failed for: r15v51, assign insn: 0x036a: CONST  (r15v51 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (null java.lang.Object) */
    /* JADX WARN: Type inference failed for: r15v54, assign insn: 0x01e5: CONST  (r15v54 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (null java.lang.Object) */
    /* JADX WARN: Type inference failed for: r6v36, assign insn: 0x01d0: CONST  (r6v36 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r15v61, assign insn: PHI: (r15v61 ?) = (r15v51 ?), (r15v62 ?) binds: [B:207:0x0369, B:16:0x0057] */
    /* JADX WARN: Type inference failed for: r15v62, assign insn: 0x0058: MOVE  (r15v62 ? I:?[OBJECT, ARRAY]) = (null java.lang.Object) */
    /* JADX WARN: Type inference failed for: r6v42, assign insn: ?: MOVE  (r6v42 ?) = (r6v19 java.net.HttpURLConnection) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0047, code lost:
        if (r3.f105303j > 0) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0258, code lost:
        if (r3.f105303j > 0) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0329, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x032a, code lost:
        r10 = r0;
        r19 = r13;
        r6 = 0;
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0364, code lost:
        if (r3.f105303j <= 0) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x03d7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x03d8, code lost:
        r4 = r0;
        r15 = null;
        r19 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0452, code lost:
        if (r3.f105303j > 0) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0456, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0458, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x045b, code lost:
        r18 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x045d, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x046e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0470, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0471, code lost:
        r9 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x047a, code lost:
        if (r9 != null) goto L_0x05f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:?, code lost:
        r9 = r10.getResponseCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0482, code lost:
        if (r9 >= 200) goto L_0x0488;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0484, code lost:
        r19 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x048a, code lost:
        if (r9 >= 300) goto L_0x05a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:?, code lost:
        r4 = r10.getResponseCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0492, code lost:
        if (r4 != 206) goto L_0x04a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0498, code lost:
        if (r13 != 0) goto L_0x04a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:?, code lost:
        android.util.Log.e(p000.bdce.f105314a, "Got partial HTTP response, but no existing bytes");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x04a1, code lost:
        r19 = 0;
        r19 = 0;
        r19 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x04a5, code lost:
        if (r13 > 0) goto L_0x04a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x04a8, code lost:
        if (r4 != 206) goto L_0x04d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:?, code lost:
        r12 = r1.getName();
        r9 = new java.lang.StringBuilder(java.lang.String.valueOf(r12).length() + 87);
        r9.append("File ");
        r9.append(r12);
        r9.append(" existed (");
        r9.append(r13);
        r9.append(" bytes), attempted and succeeded with range download");
        r9.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x04d6, code lost:
        r9 = r1.getName();
        r15 = new java.lang.StringBuilder(java.lang.String.valueOf(r9).length() + 119);
        r15.append("File ");
        r15.append(r9);
        r15.append(" existed, attempted range download, but server didn't response with partial content, so re-downloading whole file.");
        r15.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x04f9, code lost:
        r9 = r10.getHeaderField("Transfer-Encoding");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x04ff, code lost:
        if (r9 == null) goto L_0x0509;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0507, code lost:
        if (r9.equals("identity") == false) goto L_0x052d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0509, code lost:
        r9 = r10.getHeaderField("Content-Length");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x050f, code lost:
        if (r9 == null) goto L_0x052d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:?, code lost:
        java.lang.Long.parseLong(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:?, code lost:
        r12 = p000.bdce.f105314a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x051e, code lost:
        if (r9.length() == 0) goto L_0x0520;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0520, code lost:
        r9 = new java.lang.String("Unparseable Content-Length: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0526, code lost:
        r9 = "Unparseable Content-Length: ".concat(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x052a, code lost:
        android.util.Log.e(r12, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0564, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0565, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0567, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0568, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x056b, code lost:
        if ((r4 instanceof p000.bdcd) == false) goto L_0x056d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0574, code lost:
        throw new p000.bdcd(r4, p000.bdbr.UNKNOWN_IO_ERROR);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0575, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:?, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x057c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x057f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0580, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:?, code lost:
        r9 = android.os.Build.VERSION.SDK_INT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0583, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x058b, code lost:
        throw new p000.bdcd(r0, p000.bdbr.RESPONSE_OPEN_ERROR);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x058c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x058e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0590, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0592, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0593, code lost:
        r19 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0595, code lost:
        r4 = r0;
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0599, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x059c, code lost:
        r19 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x059e, code lost:
        r4 = r0;
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x05a2, code lost:
        r19 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:?, code lost:
        r11 = p000.bdce.f105314a;
        r15 = new java.lang.StringBuilder(java.lang.String.valueOf(r6).length() + 48);
        r15.append("Non-success http response code ");
        r15.append(r9);
        r15.append(" for: ");
        r15.append(r6);
        android.util.Log.e(r11, r15.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x05ce, code lost:
        if (r9 == 416) goto L_0x05da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x05d4, code lost:
        r15 = null;
        r15 = null;
        r15 = null;
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x05d8, code lost:
        r6 = new p000.bdbs(p000.bdbr.HTTP_ERROR, r9, null, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x05da, code lost:
        r19 = r13;
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x05de, code lost:
        p000.bdce.m90562a(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x05e3, code lost:
        if (r3.f105303j <= 0) goto L_0x05e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x05e5, code lost:
        android.net.TrafficStats.clearThreadStatsTag();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x05e8, code lost:
        r3 = r7;
        r4 = r8;
        r7 = r1;
        r8 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x05ef, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x05f0, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x05f3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x05f6, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x05f9, code lost:
        r15 = null;
        r15 = null;
        r15 = null;
        r15 = null;
        r15 = null;
        r15 = null;
        r19 = 0;
        r19 = 0;
        r19 = 0;
        r19 = 0;
        r19 = 0;
        r19 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:?, code lost:
        r4 = r2.f105318b.f105309a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0603, code lost:
        if (r16 >= 3) goto L_0x0613;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0605, code lost:
        p000.bdce.m90562a(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x060a, code lost:
        if (r3.f105303j <= 0) goto L_0x060f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x060c, code lost:
        android.net.TrafficStats.clearThreadStatsTag();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x060f, code lost:
        r2.mo57874b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0612, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:?, code lost:
        p000.bmxy.m108581a(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x061d, code lost:
        throw new p000.bdcd(r9, p000.bdbr.REQUEST_ERROR);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x061e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x0620, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0633, code lost:
        p000.bdce.m90562a(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0638, code lost:
        if (r3.f105303j <= 0) goto L_0x063d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x063a, code lost:
        android.net.TrafficStats.clearThreadStatsTag();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x063d, code lost:
        r10 = 0;
        r3 = r7;
        r4 = r8;
        r6 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x0652, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0653, code lost:
        r6 = r13;
        r13 = r10;
        r10 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x0658, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x065b, code lost:
        r4 = r0;
        r21 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x0666, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x0667, code lost:
        r15 = null;
        r19 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x066a, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x066b, code lost:
        r13 = r10;
        r6 = r15;
        r10 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x0670, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x0673, code lost:
        r18 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x0714, code lost:
        if (r23 != false) goto L_0x008d;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0225 A[Catch:{  }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0323 A[SYNTHETIC, Splitter:B:188:0x0323] */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0329 A[ExcHandler: all (r0v49 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:188:0x0323] */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x03d7 A[ExcHandler: all (r0v47 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:217:0x03b0] */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x046e A[ExcHandler: RuntimeException (e java.lang.RuntimeException), PHI: r18 10  PHI: (r18v11 bdbu) = (r18v12 bdbu), (r18v12 bdbu), (r18v12 bdbu), (r18v21 bdbu) binds: [B:255:0x0462, B:284:0x049a, B:285:?, B:243:0x0434] A[DONT_GENERATE, DONT_INLINE], Splitter:B:243:0x0434] */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x055a  */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x058c A[ExcHandler: all (th java.lang.Throwable), Splitter:B:289:0x04aa] */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x0590 A[ExcHandler: RuntimeException (e java.lang.RuntimeException), Splitter:B:289:0x04aa] */
    /* JADX WARNING: Removed duplicated region for block: B:418:0x0666 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:213:0x039f] */
    /* JADX WARNING: Removed duplicated region for block: B:442:0x06a3 A[Catch:{ all -> 0x0718 }] */
    /* JADX WARNING: Removed duplicated region for block: B:447:0x06c2 A[Catch:{ all -> 0x0718 }] */
    /* JADX WARNING: Removed duplicated region for block: B:465:0x0711  */
    /* JADX WARNING: Removed duplicated region for block: B:471:0x0725  */
    /* JADX WARNING: Unknown variable types count: 3 */
    public final void run() {
        bdbt bdbt;
        boolean b;
        String str;
        File file;
        String str2;
        boolean a;
        boolean a2;
        bdch bdch;
        bdbu a3;
        baxr baxr;
        bnkd bnkd;
        int i;
        long j;
        HttpURLConnection httpURLConnection;
        Throwable th;
        ? r6;
        HttpURLConnection httpURLConnection2;
        bdbu bdbu;
        HttpURLConnection httpURLConnection3;
        RuntimeException runtimeException;
        boolean z;
        bdbs a4;
        HttpURLConnection httpURLConnection4;
        ? r15;
        Throwable th2;
        bdbs bdbs;
        File file2;
        String str3;
        File file3;
        long j2;
        long j3;
        bdbu bdbu2;
        HttpURLConnection httpURLConnection5;
        long j4;
        ? r152;
        HttpURLConnection a5;
        HttpURLConnection httpURLConnection6;
        Throwable th3;
        long a6;
        String str4;
        Throwable th4;
        long j5;
        HttpURLConnection httpURLConnection7;
        long j6;
        int responseCode;
        String str5;
        long j7;
        FileInputStream fileInputStream;
        Throwable th5;
        long j8;
        FileNotFoundException fileNotFoundException;
        FileInputStream fileInputStream2;
        bdbn bdbn;
        int i2;
        ByteArrayInputStream byteArrayInputStream;
        bdce bdce = this.f105312b;
        bdbv bdbv = this.f105311a;
        String str6 = bdce.f105314a;
        synchronized (bdbv) {
            try {
                bdbt = bdbv.f105297d;
                b = bdbv.mo57856b();
                str = bdbv.f105294a;
                file = bdbv.f105295b;
                str2 = bdbv.f105296c;
                a = bdbp.m90542a(str);
                a2 = bdbv.m90550a(str);
                bdch = bdbv.f105298e;
                a3 = bdbv.mo57854a();
                baxr = bdbv.f105304k;
                bnkd = bdbv.f105299f;
                i = bdbv.f105302i + 1;
                bdbv.f105302i = i;
            } catch (Throwable th6) {
                while (true) {
                    throw th6;
                }
            }
        }
        File file4 = new File(file, str2);
        int i3 = i;
        baxr baxr2 = baxr;
        bnkd bnkd2 = bnkd;
        if (b) {
            try {
                bdbs = bdbs.m90545a(bdbr.CANCELED);
                bdce.m90562a((HttpURLConnection) null);
            } catch (IOException | RuntimeException e) {
                runtimeException = e;
                bdbu = a3;
                httpURLConnection4 = null;
            } catch (Throwable th7) {
                th2 = th7;
                r15 = null;
                j4 = 0;
                th = th2;
                HttpURLConnection httpURLConnection8 = r15;
                httpURLConnection = httpURLConnection8;
                r6 = httpURLConnection8;
                bdce.m90562a(httpURLConnection);
                if (bdbv.f105303j > 0) {
                }
                bdce.mo57871a(file, str2, bdbt, r6, file4, j);
                throw th;
            }
        } else {
            try {
                if (!bdce.mo57872a(a3)) {
                    String valueOf = String.valueOf(str);
                    if (valueOf.length() == 0) {
                        new String("Request didn't meet connectivity requirement before download, queueing. URL: ");
                    } else {
                        "Request didn't meet connectivity requirement before download, queueing. URL: ".concat(valueOf);
                    }
                    bdce.m90562a((HttpURLConnection) null);
                    if (bdbv.f105303j > 0) {
                        TrafficStats.clearThreadStatsTag();
                    }
                    bdce.mo57875c(bdbv);
                    return;
                }
                String valueOf2 = String.valueOf(str);
                if (valueOf2.length() == 0) {
                    new String("Starting download: ");
                } else {
                    "Starting download: ".concat(valueOf2);
                }
                if (a) {
                    try {
                        bmxy.m108588a(bdbp.m90542a(str));
                        int indexOf = str.indexOf(44);
                        if (indexOf == -1) {
                            try {
                                String str7 = bdbp.f105269a;
                                String valueOf3 = String.valueOf(str);
                                Log.e(str7, valueOf3.length() == 0 ? new String("Comma not found in data URI: ") : "Comma not found in data URI: ".concat(valueOf3));
                                throw new bdbn(1);
                            } catch (bdbn e2) {
                                bdbn = e2;
                                i2 = bdbn.f105268a;
                                String a7 = bdbo.m90541a(i2);
                                if (i2 != 0) {
                                }
                            }
                        } else {
                            String substring = str.substring(indexOf + 1);
                            String[] split = str.substring(5, indexOf).split(";");
                            int i4 = 1;
                            boolean z2 = false;
                            while (i4 < split.length) {
                                try {
                                    String str8 = split[i4];
                                    if (str8.equals("base64")) {
                                        z2 = true;
                                    } else if (!str8.startsWith("charset=")) {
                                        String str9 = bdbp.f105269a;
                                        StringBuilder sb = new StringBuilder(String.valueOf(str8).length() + 30 + String.valueOf(str).length());
                                        sb.append("Unknown data-URI option '");
                                        sb.append(str8);
                                        sb.append("' in ");
                                        sb.append(str);
                                        Log.e(str9, sb.toString());
                                        throw new bdbn(2);
                                    }
                                    i4++;
                                } catch (IOException | RuntimeException e3) {
                                    runtimeException = e3;
                                    bdbu = a3;
                                    httpURLConnection4 = null;
                                    j3 = 0;
                                    httpURLConnection3 = httpURLConnection4;
                                    httpURLConnection2 = httpURLConnection3;
                                    try {
                                        if (!bdbv.mo57856b()) {
                                        }
                                        bdce.m90562a(httpURLConnection2);
                                        if (bdbv.f105303j > 0) {
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                        r6 = httpURLConnection3;
                                        httpURLConnection = httpURLConnection2;
                                        bdce.m90562a(httpURLConnection);
                                        if (bdbv.f105303j > 0) {
                                        }
                                        bdce.mo57871a(file, str2, bdbt, r6, file4, j);
                                        throw th;
                                    }
                                } catch (Throwable th9) {
                                    th2 = th9;
                                    r15 = null;
                                    j4 = 0;
                                    th = th2;
                                    HttpURLConnection httpURLConnection82 = r15;
                                    httpURLConnection = httpURLConnection82;
                                    r6 = httpURLConnection82;
                                    bdce.m90562a(httpURLConnection);
                                    if (bdbv.f105303j > 0) {
                                    }
                                    bdce.mo57871a(file, str2, bdbt, r6, file4, j);
                                    throw th;
                                }
                            }
                            if (!z2) {
                                String str10 = bdbp.f105269a;
                                String valueOf4 = String.valueOf(str);
                                Log.e(str10, valueOf4.length() == 0 ? new String("We only understand base64-encoded data URIs: ") : "We only understand base64-encoded data URIs: ".concat(valueOf4));
                                throw new bdbn(3);
                            }
                            try {
                                byte[] decode = Base64.decode(substring, 0);
                                String str11 = bdbp.f105269a;
                                String valueOf5 = String.valueOf(str);
                                Log.i(str11, valueOf5.length() == 0 ? new String("Successfully decoded data uri: ") : "Successfully decoded data uri: ".concat(valueOf5));
                                byteArrayInputStream = new ByteArrayInputStream(decode);
                            } catch (IllegalArgumentException e4) {
                                String str12 = bdbp.f105269a;
                                String valueOf6 = String.valueOf(str);
                                Log.e(str12, valueOf6.length() == 0 ? new String("Invalid base64 payload in data URI: ") : "Invalid base64 payload in data URI: ".concat(valueOf6));
                                throw new bdbn(4);
                            } catch (bdbn e5) {
                                e = e5;
                                bdbn = e;
                                i2 = bdbn.f105268a;
                                String a72 = bdbo.m90541a(i2);
                                if (i2 != 0) {
                                    if (a72.length() == 0) {
                                        new String("Data URI failed, error: ");
                                    } else {
                                        "Data URI failed, error: ".concat(a72);
                                    }
                                    bdbu bdbu3 = bdbu.WIFI_ONLY;
                                    bdbr bdbr = bdbr.INVALID_REQUEST;
                                    String a8 = bdbo.m90541a(i2);
                                    bdbs = bdbs.m90546a(bdbr, a8.length() == 0 ? new String("DataUri error type: ") : "DataUri error type: ".concat(a8));
                                    bdce.m90562a((HttpURLConnection) null);
                                } else {
                                    try {
                                        throw null;
                                    } catch (IOException | RuntimeException e6) {
                                        e = e6;
                                        httpURLConnection5 = null;
                                        bdbu2 = a3;
                                    } catch (Throwable th10) {
                                        th = th10;
                                        r152 = null;
                                        j4 = 0;
                                        th2 = th;
                                        th = th2;
                                        HttpURLConnection httpURLConnection822 = r15;
                                        httpURLConnection = httpURLConnection822;
                                        r6 = httpURLConnection822;
                                        bdce.m90562a(httpURLConnection);
                                        if (bdbv.f105303j > 0) {
                                        }
                                        bdce.mo57871a(file, str2, bdbt, r6, file4, j);
                                        throw th;
                                    }
                                }
                            }
                            try {
                                long a9 = bdch.mo57853a(byteArrayInputStream, 0);
                                try {
                                    byteArrayInputStream.close();
                                    String valueOf7 = String.valueOf(file4);
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf7).length() + 39);
                                    sb2.append("Data URI download complete, have file: ");
                                    sb2.append(valueOf7);
                                    sb2.toString();
                                    bdce.m90562a((HttpURLConnection) null);
                                    if (bdbv.f105303j > 0) {
                                        TrafficStats.clearThreadStatsTag();
                                    }
                                    bdbs = null;
                                    file2 = file;
                                    str3 = str2;
                                    file3 = file4;
                                    j2 = a9;
                                } catch (IOException | RuntimeException e7) {
                                    runtimeException = e7;
                                    bdbu = a3;
                                    j = a9;
                                    httpURLConnection3 = null;
                                    httpURLConnection2 = null;
                                    if (!bdbv.mo57856b()) {
                                    }
                                    bdce.m90562a(httpURLConnection2);
                                    if (bdbv.f105303j > 0) {
                                    }
                                } catch (Throwable th11) {
                                    th = th11;
                                    j = a9;
                                    r6 = 0;
                                    httpURLConnection = null;
                                    bdce.m90562a(httpURLConnection);
                                    if (bdbv.f105303j > 0) {
                                    }
                                    bdce.mo57871a(file, str2, bdbt, r6, file4, j);
                                    throw th;
                                }
                            } catch (IOException | RuntimeException e8) {
                                runtimeException = e8;
                                bdbu = a3;
                                j3 = 0;
                                httpURLConnection4 = null;
                                httpURLConnection3 = httpURLConnection4;
                                httpURLConnection2 = httpURLConnection3;
                                if (!bdbv.mo57856b()) {
                                }
                                bdce.m90562a(httpURLConnection2);
                                if (bdbv.f105303j > 0) {
                                }
                            } catch (Throwable th12) {
                                th2 = th12;
                                j4 = 0;
                                r15 = null;
                                th = th2;
                                HttpURLConnection httpURLConnection8222 = r15;
                                httpURLConnection = httpURLConnection8222;
                                r6 = httpURLConnection8222;
                                bdce.m90562a(httpURLConnection);
                                if (bdbv.f105303j > 0) {
                                }
                                bdce.mo57871a(file, str2, bdbt, r6, file4, j);
                                throw th;
                            }
                            bdce.mo57871a(file2, str3, bdbt, bdbs, file3, j2);
                        }
                    } catch (bdbn e9) {
                        e = e9;
                        bdbn = e;
                        i2 = bdbn.f105268a;
                        String a722 = bdbo.m90541a(i2);
                        if (i2 != 0) {
                        }
                    }
                } else {
                    if (a2) {
                        String valueOf8 = String.valueOf(str);
                        if (valueOf8.length() == 0) {
                            new String("Is file uri. Saving from local file: ");
                        } else {
                            "Is file uri. Saving from local file: ".concat(valueOf8);
                        }
                        try {
                            try {
                                File file5 = new File(URLDecoder.decode(str, "UTF-8").replace("file:/", ""));
                                fileInputStream2 = new FileInputStream(file5);
                                try {
                                    file5.length();
                                    j6 = bdch.mo57853a(fileInputStream2, 0);
                                    try {
                                        String valueOf9 = String.valueOf(file4);
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf9).length() + 39);
                                        sb3.append("File URI download complete, have file: ");
                                        sb3.append(valueOf9);
                                        sb3.toString();
                                        bdce.m90562a((HttpURLConnection) null);
                                        if (bdbv.f105303j > 0) {
                                            TrafficStats.clearThreadStatsTag();
                                        }
                                        bdbs bdbs2 = null;
                                        file2 = file;
                                        str3 = str2;
                                    } catch (FileNotFoundException e10) {
                                        fileNotFoundException = e10;
                                        j8 = j6;
                                        try {
                                            throw new bdcd(fileNotFoundException, bdbr.DISK_IO_ERROR);
                                        } catch (Throwable th13) {
                                            fileInputStream = fileInputStream2;
                                            th5 = th13;
                                            j7 = j8;
                                            if (fileInputStream != null) {
                                            }
                                            throw th5;
                                        }
                                    } catch (Throwable th14) {
                                        fileInputStream = fileInputStream2;
                                        th5 = th14;
                                        j7 = j6;
                                        if (fileInputStream != null) {
                                        }
                                        throw th5;
                                    }
                                } catch (FileNotFoundException e11) {
                                    fileNotFoundException = e11;
                                    j8 = 0;
                                    throw new bdcd(fileNotFoundException, bdbr.DISK_IO_ERROR);
                                } catch (Throwable th15) {
                                    fileInputStream = fileInputStream2;
                                    th5 = th15;
                                    j7 = 0;
                                    if (fileInputStream != null) {
                                    }
                                    throw th5;
                                }
                            } catch (FileNotFoundException e12) {
                                fileNotFoundException = e12;
                                fileInputStream2 = null;
                                j8 = 0;
                                throw new bdcd(fileNotFoundException, bdbr.DISK_IO_ERROR);
                            } catch (Throwable th16) {
                                th5 = th16;
                                fileInputStream = null;
                                j7 = 0;
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException | RuntimeException e13) {
                                        runtimeException = e13;
                                        bdbu = a3;
                                        j = j7;
                                        httpURLConnection3 = null;
                                        httpURLConnection2 = null;
                                    } catch (Throwable th17) {
                                    }
                                }
                                throw th5;
                            }
                        } catch (UnsupportedEncodingException | IllegalArgumentException e14) {
                            bdbr bdbr2 = bdbr.INVALID_REQUEST;
                            String valueOf10 = String.valueOf(str);
                            bdbs = bdbs.m90546a(bdbr2, valueOf10.length() == 0 ? new String("Badly encoded file url: ") : "Badly encoded file url: ".concat(valueOf10));
                            bdce.m90562a((HttpURLConnection) null);
                        }
                        try {
                            fileInputStream2.close();
                        } catch (IOException e15) {
                        } catch (RuntimeException e16) {
                            runtimeException = e16;
                            j = j6;
                            bdbu = a3;
                            httpURLConnection3 = null;
                            httpURLConnection2 = null;
                            if (!bdbv.mo57856b()) {
                            }
                            bdce.m90562a(httpURLConnection2);
                            if (bdbv.f105303j > 0) {
                            }
                        } catch (Throwable th18) {
                            j = j6;
                            r6 = 0;
                            httpURLConnection = null;
                            th = th18;
                            bdce.m90562a(httpURLConnection);
                            if (bdbv.f105303j > 0) {
                            }
                            bdce.mo57871a(file, str2, bdbt, r6, file4, j);
                            throw th;
                        }
                    } else {
                        try {
                            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 32);
                            sb4.append("Is http uri, downloading (uri: ");
                            sb4.append(str);
                            sb4.append(")");
                            sb4.toString();
                            a5 = bdce.mo57866a(bdce.m90565b(file, str2), str);
                        } catch (IOException | RuntimeException e17) {
                            e = e17;
                            bdbu2 = a3;
                            httpURLConnection5 = null;
                            j3 = 0;
                            runtimeException = e;
                            httpURLConnection3 = httpURLConnection4;
                            httpURLConnection2 = httpURLConnection3;
                            if (!bdbv.mo57856b()) {
                            }
                            bdce.m90562a(httpURLConnection2);
                            if (bdbv.f105303j > 0) {
                            }
                        } catch (Throwable th19) {
                            th = th19;
                            r152 = null;
                            j4 = 0;
                            th2 = th;
                            th = th2;
                            HttpURLConnection httpURLConnection82222 = r15;
                            httpURLConnection = httpURLConnection82222;
                            r6 = httpURLConnection82222;
                            bdce.m90562a(httpURLConnection);
                            if (bdbv.f105303j > 0) {
                            }
                            bdce.mo57871a(file, str2, bdbt, r6, file4, j);
                            throw th;
                        }
                        try {
                            bmxy.m108582a(a5, "Http request must not be null when actually starting a download");
                            for (String str13 : bnkd2.mo67316o()) {
                                try {
                                    for (String str14 : ((bnci) bnkd2).mo67127c(str13)) {
                                        a5.setRequestProperty(str13, str14);
                                    }
                                } catch (IOException | RuntimeException e18) {
                                    th3 = e18;
                                    bdbu = a3;
                                    httpURLConnection6 = null;
                                    long j9 = 0;
                                    httpURLConnection2 = a5;
                                    httpURLConnection3 = httpURLConnection6;
                                    if (!bdbv.mo57856b()) {
                                    }
                                    bdce.m90562a(httpURLConnection2);
                                    if (bdbv.f105303j > 0) {
                                    }
                                } catch (Throwable th20) {
                                }
                            }
                            a6 = bdch.mo57852a();
                            if (a6 > 0) {
                                StringBuilder sb5 = new StringBuilder(27);
                                sb5.append("bytes=");
                                sb5.append(a6);
                                sb5.append("-");
                                a5.setRequestProperty("Range", sb5.toString());
                            }
                            if (baxr2 != null) {
                                String a10 = ((baxj) ((cayo) baxr2.f102058a.mo66814b()).mo16713a()).mo56022a();
                                if (a10 != null) {
                                    if (a10.length() == 0) {
                                        bdbu = a3;
                                        str5 = new String("Bearer ");
                                    } else {
                                        bdbu = a3;
                                        str5 = "Bearer ".concat(a10);
                                    }
                                    a5.setRequestProperty("Authorization", str5);
                                    str4 = a10;
                                } else {
                                    bdbs = bdbs.m90545a(bdbr.OAUTH_ERROR);
                                    bdce.m90562a(a5);
                                }
                            } else {
                                bdbu = a3;
                                str4 = null;
                            }
                            int i5 = bdbv.f105303j;
                            if (i5 > 0) {
                                TrafficStats.setThreadStatsTag(i5);
                            }
                            a5.connect();
                            IOException iOException = null;
                            synchronized (bdbv) {
                                try {
                                    if (bdbv.mo57856b()) {
                                        httpURLConnection7 = null;
                                        j5 = 0;
                                        j5 = 0;
                                        try {
                                            bdce.m90562a(a5);
                                            bdbs a11 = bdbs.m90545a(bdbr.CANCELED);
                                            try {
                                            } catch (Throwable th21) {
                                                th4 = th21;
                                                httpURLConnection3 = a11;
                                                while (true) {
                                                    try {
                                                        break;
                                                    } catch (Throwable th22) {
                                                        th4 = th22;
                                                    }
                                                }
                                                throw th4;
                                            }
                                        } catch (Throwable th23) {
                                            th = th23;
                                            th4 = th;
                                            httpURLConnection3 = httpURLConnection7;
                                            while (true) {
                                                break;
                                            }
                                            throw th4;
                                        }
                                    }
                                } catch (Throwable th24) {
                                    th = th24;
                                    httpURLConnection7 = null;
                                    j5 = 0;
                                    th4 = th;
                                    httpURLConnection3 = httpURLConnection7;
                                    while (true) {
                                        break;
                                    }
                                    throw th4;
                                }
                            }
                        } catch (IOException | RuntimeException e19) {
                            e = e19;
                            httpURLConnection6 = null;
                            long j10 = 0;
                            th3 = e;
                            httpURLConnection2 = a5;
                            httpURLConnection3 = httpURLConnection6;
                            if (!bdbv.mo57856b()) {
                            }
                            bdce.m90562a(httpURLConnection2);
                            if (bdbv.f105303j > 0) {
                            }
                        } catch (Throwable th25) {
                        }
                    }
                    file3 = file4;
                    j2 = j6;
                    bdce.mo57871a(file2, str3, bdbt, bdbs, file3, j2);
                }
            } catch (IOException | RuntimeException e20) {
                e = e20;
                bdbu2 = a3;
                httpURLConnection5 = null;
                j3 = 0;
                runtimeException = e;
                httpURLConnection3 = httpURLConnection4;
                httpURLConnection2 = httpURLConnection3;
                if (!bdbv.mo57856b()) {
                    String valueOf11 = String.valueOf(str);
                    if (valueOf11.length() == 0) {
                        new String("Request failed because it was canceled: ");
                    } else {
                        "Request failed because it was canceled: ".concat(valueOf11);
                    }
                    a4 = bdbs.m90545a(bdbr.CANCELED);
                    z = false;
                } else if (!bdce.mo57872a(bdbu)) {
                    String valueOf12 = String.valueOf(str);
                    if (valueOf12.length() == 0) {
                        new String("Request didn't meet connectivity requirement during download, queueing: ");
                    } else {
                        "Request didn't meet connectivity requirement during download, queueing: ".concat(valueOf12);
                    }
                    a4 = httpURLConnection3;
                    z = true;
                } else {
                    Log.w(bdce.f105314a, "Request failed for unknown reason, see exception: ", runtimeException);
                    if (runtimeException instanceof bdcd) {
                        bdcd bdcd = (bdcd) runtimeException;
                        a4 = bdbs.m90547a(bdcd.f105313a, bdcd);
                        z = false;
                    } else {
                        a4 = bdbs.m90547a(!(runtimeException instanceof IOException) ? bdbr.UNKNOWN : bdbr.UNKNOWN_IO_ERROR, runtimeException);
                        z = false;
                    }
                }
                bdce.m90562a(httpURLConnection2);
                if (bdbv.f105303j > 0) {
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (Throwable th26) {
                th = th26;
                r152 = null;
                j4 = 0;
                th2 = th;
                th = th2;
                HttpURLConnection httpURLConnection822222 = r15;
                httpURLConnection = httpURLConnection822222;
                r6 = httpURLConnection822222;
                bdce.m90562a(httpURLConnection);
                if (bdbv.f105303j > 0) {
                    TrafficStats.clearThreadStatsTag();
                }
                bdce.mo57871a(file, str2, bdbt, r6, file4, j);
                throw th;
            }
        }
        TrafficStats.clearThreadStatsTag();
        file2 = file;
        str3 = str2;
        file3 = file4;
        j2 = 0;
        bdce.mo57871a(file2, str3, bdbt, bdbs, file3, j2);
        InputStream inputStream = a5.getInputStream();
        if (responseCode != 206) {
            a6 = 0;
        }
        long a12 = bdch.mo57853a(inputStream, a6);
        try {
            inputStream.close();
        } catch (IOException e21) {
        } catch (RuntimeException e22) {
            runtimeException = e22;
            httpURLConnection2 = a5;
            j = a12;
            httpURLConnection3 = null;
            if (!bdbv.mo57856b()) {
            }
            bdce.m90562a(httpURLConnection2);
            if (bdbv.f105303j > 0) {
            }
        } catch (Throwable th27) {
            httpURLConnection = a5;
            j = a12;
            r6 = 0;
            th = th27;
            bdce.m90562a(httpURLConnection);
            if (bdbv.f105303j > 0) {
            }
            bdce.mo57871a(file, str2, bdbt, r6, file4, j);
            throw th;
        }
        bdce.m90562a(a5);
        if (bdbv.f105303j > 0) {
            TrafficStats.clearThreadStatsTag();
        }
        bdbs = null;
        file2 = file;
        str3 = str2;
        file3 = file4;
        j2 = a12;
        bdce.mo57871a(file2, str3, bdbt, bdbs, file3, j2);
        bdce.m90562a(a5);
        if (bdbv.f105303j > 0) {
        }
        bdbs = null;
        file2 = file;
        str3 = str2;
        file3 = file4;
        j2 = a12;
        bdce.mo57871a(file2, str3, bdbt, bdbs, file3, j2);
    }

    public bdcb(bdce bdce, bdbv bdbv) {
        this.f105312b = bdce;
        this.f105311a = bdbv;
    }
}
