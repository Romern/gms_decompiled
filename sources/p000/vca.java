package p000;

import android.content.ServiceConnection;
import android.content.SyncResult;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.SystemClock;
import com.android.volley.NetworkError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.internal.model.About;
import com.google.android.gms.drive.metadata.sync.syncadapter.MetadataSyncChimeraService;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: vca */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vca implements Runnable {

    /* renamed from: a */
    final /* synthetic */ vbm f49000a;

    /* renamed from: b */
    final /* synthetic */ ServiceConnection f49001b;

    /* renamed from: c */
    final /* synthetic */ vcb f49002c;

    public vca(vcb vcb, vbm vbm, ServiceConnection serviceConnection) {
        this.f49002c = vcb;
        this.f49000a = vbm;
        this.f49001b = serviceConnection;
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:135:0x02ad */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:385:0x08c4 */
    /* JADX INFO: additional move instructions added (3) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:267:0x0610 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:331:0x07f2 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:303:0x0767 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:201:0x04b6 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:193:0x0460 */
    /* JADX WARN: Type inference failed for: r4v7, types: [int], assign insn: PHI: (r4v7 ?) = (r4v6 int), (r4v94 ?) binds: [B:11:0x0049, B:458:0x0a0c] */
    /* JADX WARN: Type inference failed for: r1v16, types: [android.content.SyncResult], assign insn: PHI: (r1v16 ?) = (r1v25 android.content.SyncResult), (r1v61 ?), (r1v82 ?) binds: [B:427:?, B:342:0x0831, B:40:0x013a] */
    /* JADX WARN: Type inference failed for: r1v33, types: [uij], assign insn: 0x0169: INVOKE  (r1v33 ? I:uij) = (r1v32 uhn), (r13v5 java.lang.String) type: INTERFACE call: uhn.b(java.lang.String):uij */
    /* JADX WARN: Type inference failed for: r4v17, assign insn: PHI: (r4v17 ?) = (r4v7 ?), (r4v20 ?), (r4v45 ?), (r4v52 ?), (r4v55 ?), (r4v55 ?), (r4v45 ?), (r4v59 ?), (r4v73 ?) binds: [B:135:0x02ad, B:385:0x08c4, B:267:0x0610, B:346:0x0862, B:331:0x07f2, B:332:?, B:301:0x075e, B:303:0x0767, B:201:0x04b6] */
    /* JADX WARN: Type inference failed for: r1v37, assign insn: PHI: (r1v37 ?) = (r1v33 ?), (r1v42 ?), (r1v33 ?), (r1v55 ?), (r1v61 ?), (r1v61 ?), (r1v33 ?), (r1v66 ?), (r1v33 ?) binds: [B:135:0x02ad, B:385:0x08c4, B:267:0x0610, B:346:0x0862, B:331:0x07f2, B:332:?, B:301:0x075e, B:303:0x0767, B:201:0x04b6] */
    /* JADX WARN: Type inference failed for: r4v20, assign insn: PHI: (r4v20 ?) = (r4v21 ?), (r4v24 ?), (r4v25 ?) binds: [B:383:0x08c1, B:377:0x08b0, B:370:0x08a1] */
    /* JADX WARN: Type inference failed for: r1v42, types: [android.content.SyncResult], assign insn: PHI: (r1v42 ?) = (r1v43 ?), (r1v46 ?), (r1v96 ?) binds: [B:383:0x08c1, B:377:0x08b0, B:370:0x08a1] */
    /* JADX WARN: Type inference failed for: r1v43, assign insn: 0x08c1: MOVE  (r1v43 ? I:?[OBJECT, ARRAY]) = (r6v8 android.content.SyncResult) */
    /* JADX WARN: Type inference failed for: r4v21, assign insn: 0x08c2: MOVE  (r4v21 ? I:?[OBJECT, ARRAY]) = (r14v5 vcw) */
    /* JADX WARN: Type inference failed for: r4v24, assign insn: 0x08b0: MOVE  (r4v24 ? I:?[OBJECT, ARRAY]) = (r14v5 vcw) */
    /* JADX WARN: Type inference failed for: r1v46, assign insn: 0x08b1: MOVE  (r1v46 ? I:?[OBJECT, ARRAY]) = (r53v0 android.content.SyncResult) */
    /* JADX WARN: Type inference failed for: r4v25, assign insn: 0x0899: MOVE  (r4v25 ? I:?[OBJECT, ARRAY]) = (r14v5 vcw) */
    /* JADX WARN: Type inference failed for: r4v44, assign insn: PHI: (r4v44 ?) = (r4v45 ?), (r4v45 ?), (r4v45 ?), (r4v73 ?) binds: [B:260:0x05c3, B:249:0x05aa, B:208:0x04e8, B:201:0x04b6] */
    /* JADX WARN: Type inference failed for: r4v45, types: [android.content.SyncResult], assign insn: PHI: (r4v45 ?) = (r4v73 ?), (r4v73 ?), (r4v78 ?) binds: [B:202:?, B:198:0x04ad, B:194:?] */
    /* JADX WARN: Type inference failed for: r4v52, assign insn: 0x085d: MOVE  (r4v52 ? I:?[OBJECT, ARRAY]) = (r25v3 vcw) */
    /* JADX WARN: Type inference failed for: r1v55, assign insn: 0x085f: MOVE  (r1v55 ? I:?[OBJECT, ARRAY]) = (r53v3 android.content.SyncResult) */
    /* JADX WARN: Type inference failed for: r4v55, types: [vcw], assign insn: 0x07df: MOVE  (r4v55 ? I:?[OBJECT, ARRAY]) = (r25v3 vcw) */
    /* JADX WARN: Type inference failed for: r1v61, types: [android.content.SyncResult], assign insn: 0x07f0: MOVE  (r1v61 ? I:?[OBJECT, ARRAY]) = (r53v3 android.content.SyncResult) */
    /* JADX WARN: Type inference failed for: r1v66, types: [sbw], assign insn: 0x075e: SGET  (r1v66 ? I:sbw) =  vox.a sbw */
    /* JADX WARN: Type inference failed for: r4v59, types: [java.lang.String], assign insn: 0x0762: CONST_STR  (r4v59 ? I:java.lang.String) =  "Error purging deleted entries, unexpected account gone" */
    /* JADX WARN: Type inference failed for: r4v72, assign insn: PHI: (r4v72 ?) = (r4v45 ?), (r4v45 ?), (r4v45 ?), (r4v45 ?), (r4v45 ?), (r4v45 ?), (r4v45 ?), (r4v78 ?) binds: [B:253:0x05b2, B:221:0x0526, B:222:?, B:242:0x0599, B:232:0x0580, B:205:0x04de, B:206:?, B:193:0x0460] */
    /* JADX WARN: Type inference failed for: r4v73, types: [android.content.SyncResult], assign insn: 0x048d: MOVE  (r4v73 ? I:?[OBJECT, ARRAY]) = (r53v0 android.content.SyncResult) */
    /* JADX WARN: Type inference failed for: r4v78, types: [android.content.SyncResult], assign insn: 0x045e: MOVE  (r4v78 ? I:?[OBJECT, ARRAY]) = (r53v0 android.content.SyncResult) */
    /* JADX WARN: Type inference failed for: r1v82, assign insn: 0x013c: MOVE  (r1v82 ? I:?[OBJECT, ARRAY]) = (r3v14 android.content.SyncResult) */
    /* JADX WARN: Type inference failed for: r4v94, assign insn: 0x0a18: MOVE  (r4v94 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r3v91 boolean) */
    /* JADX WARN: Type inference failed for: r1v96, assign insn: ?: MOVE  (r1v96 ?) = (r1v47 android.content.SyncResult) */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: vkv.a(java.lang.Class, boolean):java.lang.String
     arg types: [java.lang.Class, int]
     candidates:
      vkv.a(java.lang.String, boolean):com.google.android.gms.drive.internal.model.FileLocalId
      vkv.a(com.google.android.gms.common.internal.ClientContext, com.google.android.gms.drive.internal.model.File):vkr
      vkv.a(com.google.android.gms.common.internal.ClientContext, int):vla
      vkv.a(int, com.google.android.gms.drive.internal.model.Permission):void
      vkv.a(java.lang.Class, boolean):java.lang.String */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0898, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0899, code lost:
        r4 = r14;
        r1 = r53;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:?, code lost:
        p000.vpg.m41006a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x08a0, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x08a1, code lost:
        r0 = e;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x08a3, code lost:
        r0 = e;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x08a7, code lost:
        r0 = e;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x08bb, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x08bc, code lost:
        r1 = r53;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0394 A[Catch:{ all -> 0x08a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0396 A[Catch:{ all -> 0x08a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0399 A[Catch:{ all -> 0x08a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x039c A[Catch:{ all -> 0x08a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x03a5 A[Catch:{ all -> 0x08a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x03a7 A[Catch:{ all -> 0x08a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x03ef A[SYNTHETIC, Splitter:B:176:0x03ef] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0404  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x040a A[SYNTHETIC, Splitter:B:182:0x040a] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x048d A[Catch:{ all -> 0x04b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x04de A[SYNTHETIC, Splitter:B:205:0x04de] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x04e8 A[SYNTHETIC, Splitter:B:208:0x04e8] */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0518 A[Catch:{ all -> 0x0880 }] */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0519 A[Catch:{ all -> 0x0880 }] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0526 A[SYNTHETIC, Splitter:B:221:0x0526] */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x05a0 A[Catch:{ all -> 0x04b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0618  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0739 A[SYNTHETIC, Splitter:B:290:0x0739] */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x0756  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x076c A[SYNTHETIC, Splitter:B:306:0x076c] */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x079b A[SYNTHETIC, Splitter:B:314:0x079b] */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x0819 A[Catch:{ VolleyError | InterruptedException | vbw -> 0x093a }] */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x081a A[Catch:{ VolleyError | InterruptedException | vbw -> 0x093a }] */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x0879 A[Catch:{ all -> 0x085c, all -> 0x08f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x08bb A[ExcHandler: gid (e gid), Splitter:B:138:0x02dc] */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x0912 A[Catch:{ VolleyError | InterruptedException | vbw -> 0x093a }] */
    /* JADX WARNING: Removed duplicated region for block: B:429:0x096c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:434:0x0977 A[Catch:{ all -> 0x09bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:435:0x0978 A[Catch:{ all -> 0x09bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:438:0x09aa  */
    /* JADX WARNING: Removed duplicated region for block: B:450:0x09e2 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:455:0x09ed A[Catch:{ all -> 0x0a1c }] */
    /* JADX WARNING: Removed duplicated region for block: B:465:0x0a50  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ec A[SYNTHETIC, Splitter:B:80:0x01ec] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0203 A[SYNTHETIC, Splitter:B:90:0x0203] */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final void run() {
        vca vca;
        Throwable th;
        SyncResult syncResult;
        List list;
        vcw vcw;
        WifiManager.WifiLock wifiLock;
        WifiManager.WifiLock wifiLock2;
        boolean z;
        asfb asfb;
        asfa asfa;
        Throwable th2;
        asfa asfa2;
        asfa asfa3;
        String str;
        vcy vcy;
        vcw vcw2;
        Throwable th3;
        SyncResult syncResult2;
        SyncResult syncResult3;
        vcw vcw3;
        SyncResult syncResult4;
        SyncResult syncResult5;
        Throwable th4;
        SyncResult syncResult6;
        uih uih;
        String str2;
        boolean z2;
        boolean z3;
        vks vks;
        SyncResult syncResult7;
        ? r1;
        long j;
        boolean z4;
        long j2;
        boolean z5;
        boolean z6;
        Long l;
        long j3;
        int i;
        boolean z7;
        int size;
        About about;
        long j4;
        uhn uhn;
        Throwable th5;
        uig uig;
        Throwable th6;
        uij b;
        vcw vcw4;
        uij uij;
        vby vby;
        Long l2;
        About about2;
        vby vby2;
        int i2;
        int i3;
        Long l3;
        Map map;
        vbv vbv;
        long j5;
        uig uig2;
        Throwable th7;
        int i4;
        uhn uhn2;
        int intValue;
        int intValue2;
        boolean z8;
        boolean z9;
        boolean z10;
        vca vca2 = this;
        vcb vcb = vca2.f49002c;
        boolean z11 = false;
        if (vcb.f49006d.mo28223a(vcb.f49003a, 0, 1, (SyncResult) null)) {
            vcb vcb2 = vca2.f49002c;
            vcg vcg = vcb2.f49006d;
            String str3 = vcb2.f49003a;
            if (vcg.f49020f != null) {
                ((vav) vcg.f49020f).mo28181a(str3).mo28173a();
            }
            SyncResult syncResult8 = new SyncResult();
            try {
                MetadataSyncChimeraService metadataSyncChimeraService = vca2.f49000a.f48931a;
                vcb vcb3 = vca2.f49002c;
                String str4 = vcb3.f49003a;
                int i5 = vcb3.f49004b;
                List list2 = vcb3.f49005c;
                if (!list2.isEmpty()) {
                    list = list2;
                } else {
                    list = Collections.singletonList("com.google.android.gms");
                }
                asfb asfb2 = r12;
                List list3 = list;
                int i6 = i5;
                String str5 = str4;
                asfb asfb3 = new asfb(metadataSyncChimeraService, 1, "MetadataSyncChimeraServ", null, (String) list.get(0), "DRIVE");
                int i7 = 1;
                while (i7 < list3.size()) {
                    String str6 = str5;
                    vca vca3 = vca2;
                    SyncResult syncResult9 = syncResult8;
                    boolean z12 = vcw;
                    List list4 = list3;
                    asfb2 = asfb2;
                    asfb2.mo49112a(stx.m36335a(metadataSyncChimeraService, (String) list4.get(i7)));
                    i7++;
                    list3 = list4;
                    str5 = str6;
                    z11 = false;
                    syncResult8 = syncResult9;
                    vca2 = vca3;
                    i6 = z12;
                }
                WifiManager wifiManager = (WifiManager) metadataSyncChimeraService.getApplicationContext().getSystemService("wifi");
                String str7 = Build.BRAND;
                String str8 = Build.MODEL;
                int i8 = Build.VERSION.SDK_INT;
                String a = MetadataSyncChimeraService.m23065a(str7);
                String a2 = MetadataSyncChimeraService.m23065a(str8);
                StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 13 + String.valueOf(a2).length());
                sb.append(a);
                sb.append("~");
                sb.append(a2);
                sb.append("~");
                sb.append(i8);
                if (!sb.toString().matches((String) twy.f46874be.mo58455c())) {
                    try {
                        wifiLock = wifiManager.createWifiLock("MetadataSyncChimeraServ");
                        wifiLock.setReferenceCounted(z11);
                    } catch (Throwable th8) {
                        th = th8;
                        vca = vca2;
                        syncResult = syncResult8;
                    }
                } else {
                    wifiLock = null;
                }
                boolean booleanValue = ((Boolean) twy.f46872bc.mo58455c()).booleanValue();
                if (!booleanValue) {
                    try {
                        asfb2.mo49111a(((Long) twy.f46835aS.mo58455c()).longValue() * 1000);
                        asfa2 = null;
                    } catch (Throwable th9) {
                        vca = vca2;
                        wifiLock2 = wifiLock;
                        syncResult = syncResult8;
                        asfb = asfb2;
                        z = booleanValue;
                        th2 = th9;
                        asfa = null;
                        if (z) {
                        }
                        asfb.mo49120c();
                        if (wifiLock2 != null) {
                        }
                        throw th2;
                    }
                } else {
                    asfa2 = asfb2.mo49116b("MetadataSyncChimeraServ", ((Long) twy.f46835aS.mo58455c()).longValue() * 1000);
                }
                if (wifiLock != null) {
                    try {
                        wifiLock.acquire();
                    } catch (Throwable th10) {
                        th = th10;
                        vca = vca2;
                        wifiLock2 = wifiLock;
                        syncResult = syncResult8;
                        asfb = asfb2;
                        z = booleanValue;
                        asfa3 = asfa2;
                        th2 = th;
                        asfa = asfa3;
                        if (z) {
                        }
                        asfb.mo49120c();
                        if (wifiLock2 != null) {
                        }
                        throw th2;
                    }
                }
                try {
                    syncResult8.stats.numEntries = 0;
                    vby vby3 = metadataSyncChimeraService.f31077b;
                    if (((Boolean) twy.f46799J.mo58455c()).booleanValue() && vcw != 1) {
                        try {
                            vby.f48984a.mo25366a("SyncManager", "Sync is Disabled. Skipping performSync(...)");
                            wifiLock2 = wifiLock;
                            syncResult = syncResult8;
                            asfb = asfb2;
                            z = booleanValue;
                            asfa3 = asfa2;
                        } catch (VolleyError | InterruptedException | vbw e) {
                            e = e;
                            wifiLock2 = wifiLock;
                            syncResult = syncResult8;
                            str = "MetadataSyncChimeraServ";
                            asfb = asfb2;
                            z = booleanValue;
                            asfa3 = asfa2;
                            try {
                                MetadataSyncChimeraService.f31076a.mo25378c(str, "Error during sync", e);
                                if (z) {
                                    try {
                                        asfa3.mo49109a();
                                        if (wifiLock2 == null) {
                                        }
                                        skh.m35531a().mo25689a(this.f49002c.f49006d.f49016b, this.f49001b);
                                        vcb vcb4 = this.f49002c;
                                        vcb4.f49006d.mo28223a(vcb4.f49003a, 1, 2, (SyncResult) syncResult);
                                        vcb vcb5 = this.f49002c;
                                        vcb5.f49006d.mo28221a(vcb5.f49003a, (SyncResult) syncResult);
                                        if (syncResult.stats.numDeletes > 0) {
                                        }
                                        this.f49002c.f49006d.f49018d.mo28398a();
                                    } catch (Throwable th11) {
                                        th = th11;
                                        vca = this;
                                        syncResult = syncResult;
                                        th = th;
                                        skh.m35531a().mo25689a(vca.f49002c.f49006d.f49016b, vca.f49001b);
                                        vcb vcb6 = vca.f49002c;
                                        vcb6.f49006d.mo28223a(vcb6.f49003a, 1, 2, syncResult);
                                        vcb vcb7 = vca.f49002c;
                                        vcb7.f49006d.mo28221a(vcb7.f49003a, (SyncResult) null);
                                        if (syncResult.stats.numDeletes > 0) {
                                            vca.f49002c.f49006d.f49019e.mo27275a();
                                        }
                                        throw th;
                                    }
                                }
                                asfb.mo49120c();
                                if (wifiLock2 == null) {
                                }
                                skh.m35531a().mo25689a(this.f49002c.f49006d.f49016b, this.f49001b);
                                vcb vcb42 = this.f49002c;
                                vcb42.f49006d.mo28223a(vcb42.f49003a, 1, 2, (SyncResult) syncResult);
                                vcb vcb52 = this.f49002c;
                                vcb52.f49006d.mo28221a(vcb52.f49003a, (SyncResult) syncResult);
                                if (syncResult.stats.numDeletes > 0) {
                                }
                                this.f49002c.f49006d.f49018d.mo28398a();
                            } catch (Throwable th12) {
                                th = th12;
                                vca = this;
                                th2 = th;
                                asfa = asfa3;
                                if (z) {
                                    try {
                                        asfa.mo49109a();
                                        if (wifiLock2 != null) {
                                        }
                                        throw th2;
                                    } catch (Throwable th13) {
                                        th = th13;
                                        th = th;
                                        skh.m35531a().mo25689a(vca.f49002c.f49006d.f49016b, vca.f49001b);
                                        vcb vcb62 = vca.f49002c;
                                        vcb62.f49006d.mo28223a(vcb62.f49003a, 1, 2, syncResult);
                                        vcb vcb72 = vca.f49002c;
                                        vcb72.f49006d.mo28221a(vcb72.f49003a, (SyncResult) null);
                                        if (syncResult.stats.numDeletes > 0) {
                                        }
                                        throw th;
                                    }
                                }
                                asfb.mo49120c();
                                if (wifiLock2 != null) {
                                }
                                throw th2;
                            }
                        }
                    } else {
                        vcy c = vby3.f48990g.mo28312c();
                        c.mo28308i();
                        c.mo28300c(1, 23);
                        String str9 = str5;
                        c.mo28284a(str9);
                        vcw c2 = c.mo28298c();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        try {
                            uih c3 = vby3.f48986c.mo27428c(str9);
                            syncResult = vby3.f48986c.mo27418b(str9);
                            asfb = asfb2;
                            z = booleanValue;
                            try {
                                if (syncResult.f47686a != 0) {
                                    try {
                                        uhn2 = vby3.f48986c;
                                        intValue = ((Integer) twy.f46824aH.mo58455c()).intValue();
                                        intValue2 = ((Integer) twy.f46825aI.mo58455c()).intValue();
                                        wifiLock2 = wifiLock;
                                    } catch (Throwable th14) {
                                        th = th14;
                                        wifiLock2 = wifiLock;
                                        str = "MetadataSyncChimeraServ";
                                        asfa3 = asfa2;
                                        vcy = c;
                                        th4 = th;
                                        syncResult6 = syncResult8;
                                        vcw2 = c2;
                                        if (syncResult.hasError()) {
                                        }
                                        vcw2.mo28260a(syncResult.stats.numEntries);
                                        vcw2.mo28258a();
                                        vcy.mo28307h();
                                        vcy.mo28274a();
                                        throw th3;
                                    }
                                    try {
                                        int intValue3 = ((Integer) twy.f46826aJ.mo58455c()).intValue();
                                        asfa3 = asfa2;
                                        try {
                                            vcl a3 = vcm.m39984a(uhn2, c3);
                                            uli b2 = uhn2.mo27421b(c3);
                                            str = "MetadataSyncChimeraServ";
                                            try {
                                                uli uli = a3.f49036a;
                                                if (uli != null) {
                                                    str2 = "SyncManager";
                                                    if (a3.f49037b == null) {
                                                        syncResult5 = syncResult8;
                                                        uih = c3;
                                                        vcy = c;
                                                        z3 = false;
                                                    } else if (b2 != null) {
                                                        long d = uli.mo27692d();
                                                        vcy vcy2 = c;
                                                        if (d < ((long) intValue)) {
                                                            try {
                                                                if (!a3.f49036a.mo27691c()) {
                                                                    z8 = false;
                                                                    uih = c3;
                                                                    vcy = vcy2;
                                                                    if (a3.f49037b.mo27692d() < ((long) intValue2)) {
                                                                        try {
                                                                            if (!a3.f49037b.mo27691c()) {
                                                                                z9 = false;
                                                                                syncResult5 = syncResult8;
                                                                                if (b2.mo27692d() < ((long) intValue3)) {
                                                                                    try {
                                                                                        if (!b2.mo27691c()) {
                                                                                            z10 = false;
                                                                                            if (z8 && z9 && z10) {
                                                                                                z3 = true;
                                                                                            }
                                                                                        }
                                                                                    } catch (Throwable th15) {
                                                                                        th4 = th15;
                                                                                        syncResult6 = syncResult5;
                                                                                        vcw2 = c2;
                                                                                        if (syncResult.hasError()) {
                                                                                        }
                                                                                        vcw2.mo28260a(syncResult.stats.numEntries);
                                                                                        vcw2.mo28258a();
                                                                                        vcy.mo28307h();
                                                                                        vcy.mo28274a();
                                                                                        throw th3;
                                                                                    }
                                                                                }
                                                                                z10 = true;
                                                                                z3 = true;
                                                                            }
                                                                        } catch (Throwable th16) {
                                                                            th = th16;
                                                                            th4 = th;
                                                                            syncResult6 = syncResult8;
                                                                            vcw2 = c2;
                                                                            if (syncResult.hasError()) {
                                                                            }
                                                                            vcw2.mo28260a(syncResult.stats.numEntries);
                                                                            vcw2.mo28258a();
                                                                            vcy.mo28307h();
                                                                            vcy.mo28274a();
                                                                            throw th3;
                                                                        }
                                                                    }
                                                                    z9 = true;
                                                                    syncResult5 = syncResult8;
                                                                    if (b2.mo27692d() < ((long) intValue3)) {
                                                                    }
                                                                    z10 = true;
                                                                    z3 = true;
                                                                }
                                                            } catch (Throwable th17) {
                                                                th4 = th17;
                                                                syncResult6 = syncResult8;
                                                                vcy = vcy2;
                                                                vcw2 = c2;
                                                                if (syncResult.hasError()) {
                                                                }
                                                                vcw2.mo28260a(syncResult.stats.numEntries);
                                                                vcw2.mo28258a();
                                                                vcy.mo28307h();
                                                                vcy.mo28274a();
                                                                throw th3;
                                                            }
                                                        }
                                                        z8 = true;
                                                        try {
                                                            uih = c3;
                                                            vcy = vcy2;
                                                            if (a3.f49037b.mo27692d() < ((long) intValue2)) {
                                                            }
                                                            z9 = true;
                                                            syncResult5 = syncResult8;
                                                            if (b2.mo27692d() < ((long) intValue3)) {
                                                            }
                                                            z10 = true;
                                                            z3 = true;
                                                        } catch (Throwable th18) {
                                                            th = th18;
                                                            vcy = vcy2;
                                                            th4 = th;
                                                            syncResult6 = syncResult8;
                                                            vcw2 = c2;
                                                            if (syncResult.hasError()) {
                                                            }
                                                            vcw2.mo28260a(syncResult.stats.numEntries);
                                                            vcw2.mo28258a();
                                                            vcy.mo28307h();
                                                            vcy.mo28274a();
                                                            throw th3;
                                                        }
                                                    } else {
                                                        syncResult5 = syncResult8;
                                                        uih = c3;
                                                        vcy = c;
                                                    }
                                                    z2 = false;
                                                } else {
                                                    syncResult5 = syncResult8;
                                                    uih = c3;
                                                    vcy = c;
                                                    str2 = "SyncManager";
                                                }
                                                z3 = false;
                                                z2 = false;
                                            } catch (Throwable th19) {
                                                th = th19;
                                                vcy = c;
                                                th4 = th;
                                                syncResult6 = syncResult8;
                                                vcw2 = c2;
                                                if (syncResult.hasError()) {
                                                }
                                                vcw2.mo28260a(syncResult.stats.numEntries);
                                                vcw2.mo28258a();
                                                vcy.mo28307h();
                                                vcy.mo28274a();
                                                throw th3;
                                            }
                                        } catch (Throwable th20) {
                                            th = th20;
                                            str = "MetadataSyncChimeraServ";
                                            vcy = c;
                                            th4 = th;
                                            syncResult6 = syncResult8;
                                            vcw2 = c2;
                                            if (syncResult.hasError()) {
                                            }
                                            vcw2.mo28260a(syncResult.stats.numEntries);
                                            vcw2.mo28258a();
                                            vcy.mo28307h();
                                            vcy.mo28274a();
                                            throw th3;
                                        }
                                    } catch (Throwable th21) {
                                        th = th21;
                                        str = "MetadataSyncChimeraServ";
                                        asfa3 = asfa2;
                                        vcy = c;
                                        th4 = th;
                                        syncResult6 = syncResult8;
                                        vcw2 = c2;
                                        if (syncResult.hasError()) {
                                        }
                                        vcw2.mo28260a(syncResult.stats.numEntries);
                                        vcw2.mo28258a();
                                        vcy.mo28307h();
                                        vcy.mo28274a();
                                        throw th3;
                                    }
                                } else {
                                    wifiLock2 = wifiLock;
                                    uih = c3;
                                    str = "MetadataSyncChimeraServ";
                                    asfa3 = asfa2;
                                    vcy = c;
                                    str2 = "SyncManager";
                                    syncResult5 = syncResult8;
                                    z3 = false;
                                    z2 = true;
                                }
                            } catch (Throwable th22) {
                                th = th22;
                                wifiLock2 = wifiLock;
                                syncResult4 = syncResult8;
                                str = "MetadataSyncChimeraServ";
                                asfa3 = asfa2;
                                vcy = c;
                                syncResult3 = syncResult4;
                                vcw3 = c2;
                                syncResult2 = syncResult3;
                                th3 = th;
                                syncResult6 = syncResult2;
                                if (syncResult.hasError()) {
                                }
                                vcw2.mo28260a(syncResult.stats.numEntries);
                                vcw2.mo28258a();
                                vcy.mo28307h();
                                vcy.mo28274a();
                                throw th3;
                            }
                            try {
                                int intValue4 = ((Integer) twy.f46894u.mo58455c()).intValue();
                                c2.mo28263c(intValue4);
                                c2.mo28267g(vcw);
                                int i9 = 302;
                                if (vcw == 1) {
                                    vks = new vks(302, 1, false, false);
                                } else if (vcw == 2) {
                                    if (!z2) {
                                        i9 = 303;
                                    }
                                    vks = new vks(i9 - 1, 2, true, false);
                                } else if (vcw != 3) {
                                    vks = new vks(302, 2, false, false);
                                } else {
                                    vks = new vks(303, 2, false, false);
                                }
                                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                                ClientContext a4 = uey.m38255a(uih).mo27262a(vby3.f48985b.f49755b);
                                try {
                                    vkv vkv = vby3.f48987d;
                                    vks vks2 = vks;
                                    long j6 = syncResult.f47690e + 1;
                                    long j7 = elapsedRealtime;
                                    boolean z13 = z2;
                                    boolean z14 = vcw;
                                    long j8 = (long) (intValue4 + 1);
                                    sdo.m34970a(vkv.m40744a(a4));
                                    vlb vlb = new vlb(vkv.mo28605a(a4, 2820));
                                    shc shc = new shc();
                                    SyncResult syncResult10 = syncResult5;
                                    boolean z15 = z3;
                                    try {
                                        shc.mo25530a(vkv.m40740a(About.class, true));
                                        vks vks3 = vks2;
                                        About a5 = vlb.mo28609a(a4, vks3.f49403e, true, Long.valueOf(j8), vks3.f49402d, vks3.f49401c, vks3.mo28592a(), Long.valueOf(j6), vks3.f49400b, shc);
                                        long elapsedRealtime3 = SystemClock.elapsedRealtime();
                                        long j9 = elapsedRealtime3 - elapsedRealtime2;
                                        vby.f48984a.mo25369a("About request took %d ms", Long.valueOf(j9));
                                        c2.mo28259a((int) j9);
                                        uih uih2 = uih;
                                        vby3.f48985b.f49760g.mo28383a(uih2.f47682a, a5.f30936b);
                                        vby3.f48989f.mo28191a(uih2);
                                        long elapsedRealtime4 = SystemClock.elapsedRealtime();
                                        long j10 = elapsedRealtime4 - elapsedRealtime3;
                                        vby.f48984a.mo25369a("AppDataFolderIdUpdater took %d ms", Long.valueOf(j10));
                                        c2.mo28262b((int) j10);
                                        if (a5.f30935a.contains(24)) {
                                            long longValue = ((Long) twy.f46812W.mo58455c()).longValue();
                                            if (!syncResult.f47692g) {
                                                j = j10;
                                                try {
                                                    if (syncResult.f47689d >= longValue) {
                                                        z4 = false;
                                                        long j11 = a5.f30939e;
                                                        j2 = elapsedRealtime4;
                                                        boolean z16 = j11 <= ((long) intValue4);
                                                        if (!z4) {
                                                            z5 = true;
                                                        } else {
                                                            z5 = z16;
                                                        }
                                                        if (!z5) {
                                                            z6 = true;
                                                        } else {
                                                            z6 = !z15;
                                                        }
                                                        vby.f48984a.mo25369a("Choosing algorithm [forceFullSync = %s, remainingChangestamps = %d, changelogSyncLimit =%d, needCatchup = %s, restartFullSync = %s, fullSyncComplete = %s, needFullSync = %s]", Boolean.valueOf(z4), Long.valueOf(j11), Integer.valueOf(intValue4), Boolean.valueOf(z16), Boolean.valueOf(z5), Boolean.valueOf(z15), Boolean.valueOf(z6));
                                                        if (!vav.m39898a()) {
                                                            l = Long.valueOf(vav.m39900c().mo28181a(uih2.f47682a).f48863c.get());
                                                        } else {
                                                            l = null;
                                                        }
                                                        c2.mo28261a(l);
                                                        if (!z6) {
                                                            vby.f48984a.mo25371b("Starting full sync for DRIVE and PHOTOS.");
                                                            if (z4) {
                                                                i4 = 3;
                                                            } else {
                                                                i4 = z16 ? 2 : z13 ? 0 : 5;
                                                            }
                                                            c2.mo28268h(i4);
                                                            vcw = syncResult10;
                                                            try {
                                                                long a6 = vby3.mo28214a(vcw, new vcm(vby3.f48988e.f49051a, uih2, ((Integer) twy.f46824aH.mo58455c()).intValue(), ((Integer) twy.f46825aI.mo58455c()).intValue(), ((Integer) twy.f46826aJ.mo58455c()).intValue(), z5, Long.valueOf(a5.f30937c).intValue(), longValue), uih2, vks3);
                                                                i = ((Integer) twy.f46824aH.mo58455c()).intValue() + ((Integer) twy.f46825aI.mo58455c()).intValue() + ((Integer) twy.f46826aJ.mo58455c()).intValue();
                                                                j3 = a6;
                                                                z7 = true;
                                                            } catch (Throwable th23) {
                                                                th4 = th23;
                                                                syncResult6 = vcw;
                                                                vcw2 = c2;
                                                                if (syncResult.hasError()) {
                                                                }
                                                                vcw2.mo28260a(syncResult.stats.numEntries);
                                                                vcw2.mo28258a();
                                                                vcy.mo28307h();
                                                                vcy.mo28274a();
                                                                throw th3;
                                                            }
                                                        } else {
                                                            vcw = syncResult10;
                                                            if (j11 > 0) {
                                                                vby.f48984a.mo25371b("Starting changelog sync for ALL spaces.");
                                                                c2.mo28268h(1);
                                                                j3 = vby3.mo28214a(vcw, new vcj(vby3.f48988e.f49051a, uih2), uih2, vks3);
                                                                z7 = true;
                                                                i = 0;
                                                            } else {
                                                                try {
                                                                    vby.f48984a.mo25371b("No full sync or changelog.");
                                                                    z7 = false;
                                                                    i = 0;
                                                                    j3 = 0;
                                                                } catch (Throwable th24) {
                                                                    th = th24;
                                                                    syncResult3 = vcw;
                                                                    vcw3 = c2;
                                                                    syncResult2 = syncResult3;
                                                                    th3 = th;
                                                                    syncResult6 = syncResult2;
                                                                    if (syncResult.hasError()) {
                                                                    }
                                                                    vcw2.mo28260a(syncResult.stats.numEntries);
                                                                    vcw2.mo28258a();
                                                                    vcy.mo28307h();
                                                                    vcy.mo28274a();
                                                                    throw th3;
                                                                }
                                                            }
                                                        }
                                                        vck vck = new vck(vby3.f48988e.f49051a, uih2, ((Integer) twy.f46823aG.mo58455c()).intValue());
                                                        size = vck.f49032a.size();
                                                        if (size > 0) {
                                                            vby.f48984a.mo25371b("No app data to sync.");
                                                            about = a5;
                                                        } else {
                                                            about = a5;
                                                            vby.f48984a.mo25371b("Syncing app data.");
                                                            if (!z7) {
                                                                c2.mo28268h(4);
                                                            }
                                                            j3 += vby3.mo28214a(vcw, vck, uih2, vks3);
                                                            i += size * ((Integer) twy.f46823aG.mo58455c()).intValue();
                                                            z7 = true;
                                                        }
                                                        c2.mo28264d((int) j3);
                                                        c2.mo28266f(i);
                                                        if (z7) {
                                                            c2.mo28268h(6);
                                                        }
                                                        if (vby3.f48994k >= 0) {
                                                            uhn uhn3 = vby3.f48986c;
                                                            vpu vpu = vby3.f48985b;
                                                            vcz vcz = vpu.f49777x;
                                                            sqv sqv = vpu.f49747F;
                                                            long currentTimeMillis = System.currentTimeMillis();
                                                            j4 = j3;
                                                            long j12 = vby3.f48993j;
                                                            vox.f49690a.mo25369a("Wiping out old unsubscribed entries: %s", uih2);
                                                            vcy c4 = vcz.mo28312c();
                                                            c4.mo28308i();
                                                            c4.mo28300c(1, 66);
                                                            c4.mo28284a(uih2.f47682a);
                                                            uhn3.mo27435d();
                                                            try {
                                                                uig2 = uhn3.mo27397a(uih2, currentTimeMillis - j12, currentTimeMillis + j12);
                                                                try {
                                                                    Iterator it = uig2.iterator();
                                                                    while (it.hasNext()) {
                                                                        ((ujx) it.next()).mo27534L();
                                                                    }
                                                                    uhn3.mo27442f();
                                                                    c4.mo28297b(uig2.size(), j12);
                                                                    c4.mo28307h();
                                                                    c4.mo28274a();
                                                                    if (uig2 != null) {
                                                                        uig2.close();
                                                                    }
                                                                    uhn3.mo27439e();
                                                                } catch (Throwable th25) {
                                                                    th7 = th25;
                                                                }
                                                            } catch (Throwable th26) {
                                                                th7 = th26;
                                                                uig2 = null;
                                                                if (uig2 != null) {
                                                                    uig2.close();
                                                                }
                                                                uhn3.mo27439e();
                                                                throw th7;
                                                            }
                                                        } else {
                                                            j4 = j3;
                                                            boolean z17 = z14;
                                                            if (!z17) {
                                                                map = vby3.f48992i;
                                                            } else {
                                                                map = vby3.f48991h;
                                                            }
                                                            if (map.containsKey(uih2)) {
                                                                vbv = (vbv) map.get(uih2);
                                                            } else {
                                                                if (!z17) {
                                                                    j5 = vby3.f48994k;
                                                                } else {
                                                                    j5 = 0;
                                                                }
                                                                vbv vbv2 = new vbv(new vbx(vby3, uih2, j5, vks3));
                                                                map.put(uih2, vbv2);
                                                                vbv = vbv2;
                                                            }
                                                            vbv.mo28212a();
                                                        }
                                                        uhn = vby3.f48986c;
                                                        vpu vpu2 = vby3.f48985b;
                                                        vcz vcz2 = vpu2.f49777x;
                                                        sqv sqv2 = vpu2.f49747F;
                                                        long currentTimeMillis2 = System.currentTimeMillis();
                                                        syncResult10 = vcw;
                                                        long j13 = vby3.f48995l;
                                                        int i10 = vby3.f48996m;
                                                        vox.f49690a.mo25369a("Purging wipedout entries: %s", uih2);
                                                        vcy c5 = vcz2.mo28312c();
                                                        c5.mo28308i();
                                                        c5.mo28300c(1, 42);
                                                        c5.mo28284a(uih2.f47682a);
                                                        uhn.mo27435d();
                                                        try {
                                                            b = uhn.mo27418b(uih2.f47682a);
                                                            if (b == null) {
                                                                vcw vcw5 = c2;
                                                                long j14 = currentTimeMillis2 - j13;
                                                                long j15 = j13 + currentTimeMillis2;
                                                                try {
                                                                    uog a7 = voz.m40959a();
                                                                    vcw4 = vcw5;
                                                                    try {
                                                                        unp unp = ukm.DELETED_ON_SERVER_TIME.f48022aB;
                                                                        uij = syncResult;
                                                                        vby = vby3;
                                                                        uig a8 = ((ugx) uhn).mo27364a(uey.m38255a(uih2), "EntryView", "ScopedEntryView", uoh.m39066a(a7, voz.m40971a(unp, j14, j15), ukm.IS_DELETED.f48022aB.mo27719f(), ukm.IS_DELETED_ACTION_ID.f48022aB.mo27716e()), String.valueOf(unp.mo27700a()).concat(" ASC"));
                                                                        try {
                                                                            unp unp2 = ukm.DELETED_ON_SERVER_TIME.f48022aB;
                                                                            l2 = l;
                                                                            uig a9 = ((ugx) uhn).mo27364a(uey.m38255a(uih2), "EntryView", "ScopedEntryView", uoh.m39066a(unp2.mo27714d(), unp2.mo27715d(j14), unp2.mo27703a(j15)), (String) null);
                                                                            int size2 = a9.size();
                                                                            a9.close();
                                                                            int size3 = a8.size();
                                                                            int i11 = size3 - i10;
                                                                            if (i11 <= 0) {
                                                                                i3 = size2;
                                                                            } else if (i11 <= size3) {
                                                                                vox.f49690a.mo25369a("Entries to purge: %s", Integer.valueOf(i11));
                                                                                for (ujx ujx : a8.subList(0, i11)) {
                                                                                    ujx.mo27579ao();
                                                                                    size2 = size2;
                                                                                    i11 = i11;
                                                                                }
                                                                                ujx ujx2 = (ujx) a8.get(i11 - 1);
                                                                                i3 = size2;
                                                                                i2 = i11;
                                                                                long max = Math.max(ujx2.mo27642y(), b.f47687b);
                                                                                l3 = Long.valueOf(currentTimeMillis2 - ujx2.f47825a.f47914f.longValue());
                                                                                b.mo27512b(max);
                                                                                b.mo27725t();
                                                                                uhn.mo27442f();
                                                                                c5.mo28277a(i3, i10, i2, l3);
                                                                                c5.mo28307h();
                                                                                c5.mo28274a();
                                                                                if (a8 != null) {
                                                                                    try {
                                                                                        a8.close();
                                                                                    } catch (Throwable th27) {
                                                                                        th3 = th27;
                                                                                        vcw2 = vcw4;
                                                                                    }
                                                                                }
                                                                                uhn.mo27439e();
                                                                            } else {
                                                                                i3 = size2;
                                                                            }
                                                                            vox.f49690a.mo25369a("No purge needed: %s / %s", Integer.valueOf(size3), Integer.valueOf(i10));
                                                                            i10 = size3;
                                                                            l3 = null;
                                                                            i2 = 0;
                                                                            uhn.mo27442f();
                                                                            c5.mo28277a(i3, i10, i2, l3);
                                                                            c5.mo28307h();
                                                                            c5.mo28274a();
                                                                            if (a8 != null) {
                                                                            }
                                                                            uhn.mo27439e();
                                                                        } catch (Throwable th28) {
                                                                            th5 = th28;
                                                                            uig = a8;
                                                                            if (uig != null) {
                                                                            }
                                                                            uhn.mo27439e();
                                                                            throw th5;
                                                                        }
                                                                    } catch (Throwable th29) {
                                                                        th6 = th29;
                                                                        th5 = th6;
                                                                        uig = null;
                                                                        if (uig != null) {
                                                                        }
                                                                        uhn.mo27439e();
                                                                        throw th5;
                                                                    }
                                                                } catch (Throwable th30) {
                                                                    th6 = th30;
                                                                    th5 = th6;
                                                                    uig = null;
                                                                    if (uig != null) {
                                                                    }
                                                                    uhn.mo27439e();
                                                                    throw th5;
                                                                }
                                                            } else {
                                                                uij = syncResult;
                                                                l2 = l;
                                                                vby = vby3;
                                                                vcw4 = c2;
                                                                try {
                                                                    syncResult = vox.f49690a;
                                                                    vcw = "Error purging deleted entries, unexpected account gone";
                                                                    syncResult.mo25377c("EntriesCleanupUtil", vcw);
                                                                    try {
                                                                        uhn.mo27439e();
                                                                    } catch (Throwable th31) {
                                                                        th = th31;
                                                                        vcw = vcw4;
                                                                        syncResult2 = syncResult10;
                                                                        vcw3 = vcw;
                                                                        th3 = th;
                                                                        syncResult6 = syncResult2;
                                                                        if (syncResult.hasError()) {
                                                                            vcv g = vcy.mo28306g();
                                                                            if (syncResult.hasSoftError()) {
                                                                                g.mo28255a(0);
                                                                            } else {
                                                                                g.mo28255a(1);
                                                                            }
                                                                            g.mo28254a();
                                                                        }
                                                                        vcw2.mo28260a(syncResult.stats.numEntries);
                                                                        vcw2.mo28258a();
                                                                        vcy.mo28307h();
                                                                        vcy.mo28274a();
                                                                        throw th3;
                                                                    }
                                                                } catch (Throwable th32) {
                                                                    th = th32;
                                                                    th6 = th;
                                                                    th5 = th6;
                                                                    uig = null;
                                                                    if (uig != null) {
                                                                        uig.close();
                                                                    }
                                                                    uhn.mo27439e();
                                                                    throw th5;
                                                                }
                                                            }
                                                            if (l2 != null) {
                                                                vav.m39900c().mo28181a(uih2.f47682a).f48863c.addAndGet(-l2.longValue());
                                                            }
                                                            long j16 = uij.f47688c;
                                                            about2 = about;
                                                            if (about2.f30935a.contains(14)) {
                                                                List list5 = about2.f30938d;
                                                                int size4 = list5.size();
                                                                int i12 = 0;
                                                                while (true) {
                                                                    if (i12 >= size4) {
                                                                        break;
                                                                    }
                                                                    About.MaxUploadSizes maxUploadSizes = (About.MaxUploadSizes) list5.get(i12);
                                                                    i12++;
                                                                    if (maxUploadSizes.f30943c.equals("*")) {
                                                                        j16 = maxUploadSizes.f30942b;
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            vby2 = vby;
                                                            vby2.f48986c.mo27435d();
                                                            uij b3 = vby2.f48986c.mo27418b(uih2.f47682a);
                                                            b3.f47688c = j16;
                                                            b3.mo27725t();
                                                            vby2.f48986c.mo27442f();
                                                            vby2.f48986c.mo27439e();
                                                            long elapsedRealtime5 = SystemClock.elapsedRealtime() - j2;
                                                            vcw = vcw4;
                                                            try {
                                                                vcw.mo28265e((int) elapsedRealtime5);
                                                                sbw sbw = vby.f48984a;
                                                                Object[] objArr = new Object[5];
                                                                objArr[0] = Long.valueOf(elapsedRealtime5);
                                                                syncResult = syncResult10;
                                                                objArr[1] = Long.valueOf(syncResult.stats.numEntries);
                                                                objArr[2] = Long.valueOf(j4);
                                                                objArr[3] = l2;
                                                                objArr[4] = Long.valueOf(j);
                                                                sbw.mo25369a("Entry sync took %d ms [numEntries: %d, processTime: %d, numPendingPushNotifications: %d appDataFolderIdUpdaterTime: %d]", objArr);
                                                            } catch (Throwable th33) {
                                                                th = th33;
                                                                syncResult2 = syncResult10;
                                                                vcw3 = vcw;
                                                                th3 = th;
                                                                syncResult6 = syncResult2;
                                                                if (syncResult.hasError()) {
                                                                }
                                                                vcw2.mo28260a(syncResult.stats.numEntries);
                                                                vcw2.mo28258a();
                                                                vcy.mo28307h();
                                                                vcy.mo28274a();
                                                                throw th3;
                                                            }
                                                            try {
                                                                if (!syncResult.hasError()) {
                                                                    vcv g2 = vcy.mo28306g();
                                                                    if (syncResult.hasSoftError()) {
                                                                        g2.mo28255a(0);
                                                                    } else {
                                                                        g2.mo28255a(1);
                                                                    }
                                                                    g2.mo28254a();
                                                                }
                                                                vcw.mo28260a(syncResult.stats.numEntries);
                                                                vcw.mo28258a();
                                                                vcy.mo28307h();
                                                                vcy.mo28274a();
                                                                vby.f48984a.mo25369a("Sync took %d ms", Long.valueOf(SystemClock.elapsedRealtime() - j7));
                                                            } catch (VolleyError | InterruptedException | vbw e2) {
                                                                e = e2;
                                                                syncResult = syncResult;
                                                                MetadataSyncChimeraService.f31076a.mo25378c(str, "Error during sync", e);
                                                                if (z) {
                                                                }
                                                                asfb.mo49120c();
                                                                if (wifiLock2 == null) {
                                                                }
                                                                skh.m35531a().mo25689a(this.f49002c.f49006d.f49016b, this.f49001b);
                                                                vcb vcb422 = this.f49002c;
                                                                vcb422.f49006d.mo28223a(vcb422.f49003a, 1, 2, (SyncResult) syncResult);
                                                                vcb vcb522 = this.f49002c;
                                                                vcb522.f49006d.mo28221a(vcb522.f49003a, (SyncResult) syncResult);
                                                                if (syncResult.stats.numDeletes > 0) {
                                                                }
                                                                this.f49002c.f49006d.f49018d.mo28398a();
                                                            }
                                                        } catch (Throwable th34) {
                                                            th = th34;
                                                            th6 = th;
                                                            th5 = th6;
                                                            uig = null;
                                                            if (uig != null) {
                                                            }
                                                            uhn.mo27439e();
                                                            throw th5;
                                                        }
                                                    }
                                                } catch (Throwable th35) {
                                                    th3 = th35;
                                                    vcw2 = c2;
                                                    syncResult6 = syncResult10;
                                                    if (syncResult.hasError()) {
                                                    }
                                                    vcw2.mo28260a(syncResult.stats.numEntries);
                                                    vcw2.mo28258a();
                                                    vcy.mo28307h();
                                                    vcy.mo28274a();
                                                    throw th3;
                                                }
                                            } else {
                                                j = j10;
                                            }
                                            z4 = true;
                                            try {
                                                long j112 = a5.f30939e;
                                                j2 = elapsedRealtime4;
                                                if (j112 <= ((long) intValue4)) {
                                                }
                                                if (!z4) {
                                                }
                                                if (!z5) {
                                                }
                                                vby.f48984a.mo25369a("Choosing algorithm [forceFullSync = %s, remainingChangestamps = %d, changelogSyncLimit =%d, needCatchup = %s, restartFullSync = %s, fullSyncComplete = %s, needFullSync = %s]", Boolean.valueOf(z4), Long.valueOf(j112), Integer.valueOf(intValue4), Boolean.valueOf(z16), Boolean.valueOf(z5), Boolean.valueOf(z15), Boolean.valueOf(z6));
                                                if (!vav.m39898a()) {
                                                }
                                                c2.mo28261a(l);
                                                if (!z6) {
                                                }
                                                vck vck2 = new vck(vby3.f48988e.f49051a, uih2, ((Integer) twy.f46823aG.mo58455c()).intValue());
                                                size = vck2.f49032a.size();
                                                if (size > 0) {
                                                }
                                                c2.mo28264d((int) j3);
                                                c2.mo28266f(i);
                                                if (z7) {
                                                }
                                                if (vby3.f48994k >= 0) {
                                                }
                                                uhn = vby3.f48986c;
                                                vpu vpu22 = vby3.f48985b;
                                                vcz vcz22 = vpu22.f49777x;
                                                sqv sqv22 = vpu22.f49747F;
                                                long currentTimeMillis22 = System.currentTimeMillis();
                                                syncResult10 = vcw;
                                                long j132 = vby3.f48995l;
                                                int i102 = vby3.f48996m;
                                                vox.f49690a.mo25369a("Purging wipedout entries: %s", uih2);
                                                vcy c52 = vcz22.mo28312c();
                                                c52.mo28308i();
                                                c52.mo28300c(1, 42);
                                                c52.mo28284a(uih2.f47682a);
                                                uhn.mo27435d();
                                                b = uhn.mo27418b(uih2.f47682a);
                                                if (b == null) {
                                                }
                                                if (l2 != null) {
                                                }
                                                long j162 = uij.f47688c;
                                                about2 = about;
                                                if (about2.f30935a.contains(14)) {
                                                }
                                                vby2 = vby;
                                                vby2.f48986c.mo27435d();
                                            } catch (Throwable th36) {
                                                th = th36;
                                                vcw = c2;
                                                syncResult2 = syncResult10;
                                                vcw3 = vcw;
                                                th3 = th;
                                                syncResult6 = syncResult2;
                                                if (syncResult.hasError()) {
                                                }
                                                vcw2.mo28260a(syncResult.stats.numEntries);
                                                vcw2.mo28258a();
                                                vcy.mo28307h();
                                                vcy.mo28274a();
                                                throw th3;
                                            }
                                            try {
                                                uij b32 = vby2.f48986c.mo27418b(uih2.f47682a);
                                                b32.f47688c = j162;
                                                b32.mo27725t();
                                                vby2.f48986c.mo27442f();
                                                vby2.f48986c.mo27439e();
                                                long elapsedRealtime52 = SystemClock.elapsedRealtime() - j2;
                                                vcw = vcw4;
                                                vcw.mo28265e((int) elapsedRealtime52);
                                                sbw sbw2 = vby.f48984a;
                                                Object[] objArr2 = new Object[5];
                                                objArr2[0] = Long.valueOf(elapsedRealtime52);
                                                syncResult = syncResult10;
                                                objArr2[1] = Long.valueOf(syncResult.stats.numEntries);
                                                objArr2[2] = Long.valueOf(j4);
                                                objArr2[3] = l2;
                                                objArr2[4] = Long.valueOf(j);
                                                sbw2.mo25369a("Entry sync took %d ms [numEntries: %d, processTime: %d, numPendingPushNotifications: %d appDataFolderIdUpdaterTime: %d]", objArr2);
                                                if (!syncResult.hasError()) {
                                                }
                                                vcw.mo28260a(syncResult.stats.numEntries);
                                                vcw.mo28258a();
                                                vcy.mo28307h();
                                                vcy.mo28274a();
                                                vby.f48984a.mo25369a("Sync took %d ms", Long.valueOf(SystemClock.elapsedRealtime() - j7));
                                            } catch (Throwable th37) {
                                                th = th37;
                                                vcw3 = vcw;
                                                syncResult2 = syncResult;
                                                th3 = th;
                                                syncResult6 = syncResult2;
                                                if (syncResult.hasError()) {
                                                }
                                                vcw2.mo28260a(syncResult.stats.numEntries);
                                                vcw2.mo28258a();
                                                vcy.mo28307h();
                                                vcy.mo28274a();
                                                throw th3;
                                            }
                                        } else {
                                            vby.f48984a.mo25372b(str2, "remainingChangestamps is missing so failing sync.");
                                            throw new vbw("remainingChangestamps is missing.");
                                        }
                                    } catch (gid e3) {
                                    } catch (NetworkError | TimeoutError e4) {
                                        e = e4;
                                        syncResult7 = syncResult10;
                                        Throwable th38 = e;
                                        syncResult7.stats.numIoExceptions++;
                                        throw th38;
                                    } catch (VolleyError e5) {
                                        e = e5;
                                        vcw = c2;
                                        r1 = syncResult10;
                                        VolleyError volleyError = e;
                                        syncResult.stats.numParseExceptions++;
                                        throw volleyError;
                                    }
                                } catch (gid e6) {
                                    e = e6;
                                    SyncResult syncResult11 = syncResult5;
                                    syncResult11.stats.numAuthExceptions++;
                                    throw new vbw("Authorization failed", e);
                                } catch (NetworkError e7) {
                                    e = e7;
                                    syncResult7 = syncResult5;
                                    Throwable th382 = e;
                                    syncResult7.stats.numIoExceptions++;
                                    throw th382;
                                } catch (TimeoutError e8) {
                                    e = e8;
                                    syncResult7 = syncResult5;
                                    Throwable th3822 = e;
                                    syncResult7.stats.numIoExceptions++;
                                    throw th3822;
                                } catch (VolleyError e9) {
                                    e = e9;
                                    r1 = syncResult5;
                                    vcw = c2;
                                    VolleyError volleyError2 = e;
                                    syncResult.stats.numParseExceptions++;
                                    throw volleyError2;
                                }
                            } catch (Throwable th39) {
                                th = th39;
                                syncResult3 = syncResult5;
                                vcw3 = c2;
                                syncResult2 = syncResult3;
                                th3 = th;
                                syncResult6 = syncResult2;
                                if (syncResult.hasError()) {
                                }
                                vcw2.mo28260a(syncResult.stats.numEntries);
                                vcw2.mo28258a();
                                vcy.mo28307h();
                                vcy.mo28274a();
                                throw th3;
                            }
                        } catch (Throwable th40) {
                            th = th40;
                            wifiLock2 = wifiLock;
                            syncResult4 = syncResult8;
                            str = "MetadataSyncChimeraServ";
                            asfb = asfb2;
                            z = booleanValue;
                            asfa3 = asfa2;
                            vcy = c;
                            syncResult3 = syncResult4;
                            vcw3 = c2;
                            syncResult2 = syncResult3;
                            th3 = th;
                            syncResult6 = syncResult2;
                            if (syncResult.hasError()) {
                            }
                            vcw2.mo28260a(syncResult.stats.numEntries);
                            vcw2.mo28258a();
                            vcy.mo28307h();
                            vcy.mo28274a();
                            throw th3;
                        }
                    }
                    if (z && asfa3 != null) {
                        asfa3.mo49109a();
                    } else {
                        asfb.mo49120c();
                    }
                    if (wifiLock2 == null) {
                        wifiLock2.release();
                    }
                    skh.m35531a().mo25689a(this.f49002c.f49006d.f49016b, this.f49001b);
                    vcb vcb4222 = this.f49002c;
                    vcb4222.f49006d.mo28223a(vcb4222.f49003a, 1, 2, (SyncResult) syncResult);
                    vcb vcb5222 = this.f49002c;
                    vcb5222.f49006d.mo28221a(vcb5222.f49003a, (SyncResult) syncResult);
                    if (syncResult.stats.numDeletes > 0) {
                        this.f49002c.f49006d.f49019e.mo27275a();
                    }
                    this.f49002c.f49006d.f49018d.mo28398a();
                } catch (Throwable th41) {
                    th = th41;
                    wifiLock2 = wifiLock;
                    syncResult = syncResult8;
                    asfb = asfb2;
                    z = booleanValue;
                    asfa3 = asfa2;
                    vca = this;
                    th2 = th;
                    asfa = asfa3;
                    if (z && asfa != null) {
                        asfa.mo49109a();
                    } else {
                        asfb.mo49120c();
                    }
                    if (wifiLock2 != null) {
                        wifiLock2.release();
                    }
                    throw th2;
                }
            } catch (Throwable th42) {
                th = th42;
                vca = vca2;
                syncResult = syncResult8;
                th = th;
                skh.m35531a().mo25689a(vca.f49002c.f49006d.f49016b, vca.f49001b);
                vcb vcb622 = vca.f49002c;
                vcb622.f49006d.mo28223a(vcb622.f49003a, 1, 2, syncResult);
                vcb vcb722 = vca.f49002c;
                vcb722.f49006d.mo28221a(vcb722.f49003a, (SyncResult) null);
                if (syncResult.stats.numDeletes > 0) {
                }
                throw th;
            }
        } else {
            vcg.f49015a.mo25374b("SyncScheduler", "%s sync not pending.", "Ignoring sync request: ");
        }
    }
}
