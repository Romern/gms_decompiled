package p000;

import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.wearable.node.CloudNodeAdapter$EventHandler$1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: axwh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axwh extends adzt {

    /* renamed from: a */
    final /* synthetic */ axwi f96565a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public axwh(axwi axwi, Looper looper) {
        super(looper);
        this.f96565a = axwi;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axwh.a(axwl, boolean):void
     arg types: [axwl, int]
     candidates:
      axwh.a(java.lang.String, java.util.List):void
      adzt.a(android.os.Message, long):void
      axwh.a(axwl, boolean):void */
    /* renamed from: a */
    private final void m83375a(String str, List list) {
        long elapsedRealtime;
        if (Log.isLoggable("CloudNode", 2)) {
            Log.v("CloudNode", "sendAllDataSynced: sending batch");
        }
        HashSet hashSet = new HashSet();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            hashSet.add(((axxi) list.get(i)).f96646a.f96377a);
        }
        try {
            axwi axwi = this.f96565a;
            int i2 = axwi.f96566A;
            axwi.mo53680a(hashSet);
            this.f96565a.mo53683d();
            elapsedRealtime = SystemClock.elapsedRealtime();
            axwl a = this.f96565a.f96583h.mo53690a(str, list.iterator(), list.size());
            this.f96565a.mo53675a(2, elapsedRealtime, 0);
            this.f96565a.mo53678a(a);
            mo53670a(a, false);
            if (Log.isLoggable("CloudNode", 2)) {
                String valueOf = String.valueOf(a.f96607b);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
                sb.append("sendAllDataSynced: sent=");
                sb.append(0);
                sb.append(" cloud syncTable=");
                sb.append(valueOf);
                Log.v("CloudNode", sb.toString());
            }
            this.f96565a.mo53682c();
        } catch (axwq | IOException e) {
            this.f96565a.mo53676a(2, elapsedRealtime, e);
            throw e;
        } catch (Throwable th) {
            axwi axwi2 = this.f96565a;
            int i3 = axwi.f96566A;
            axwi2.mo53682c();
            throw th;
        }
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:480:0x0aad */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:374:0x0848 */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:387:0x08be */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:421:0x096f */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:648:0x07e1 */
    /* JADX INFO: additional move instructions added (3) to help type inference */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v15, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v17, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v19, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v35, resolved type: axxv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v37, resolved type: axxv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v39, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v42, resolved type: axxv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v45, resolved type: axxv} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axwh.a(axwl, boolean):void
     arg types: [axwl, int]
     candidates:
      axwh.a(java.lang.String, java.util.List):void
      adzt.a(android.os.Message, long):void
      axwh.a(axwl, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axxv.a(axxi, boolean, java.lang.String):axxr
     arg types: [axxi, int, java.lang.String]
     candidates:
      axxv.a(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String):void
      axxv.a(android.database.sqlite.SQLiteDatabase, axue, java.lang.String):boolean
      axxv.a(axue, android.net.Uri, boolean):com.google.android.gms.common.data.DataHolder
      axxv.a(ssb, boolean, boolean):void
      ayjm.a(ssb, boolean, boolean):void
      axxv.a(axxi, boolean, java.lang.String):axxr */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0281, code lost:
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0284, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0290, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:?, code lost:
        r4 = r0.getMessage();
        r14 = new java.lang.StringBuilder((java.lang.String.valueOf(r11).length() + 60) + java.lang.String.valueOf(r4).length());
        r14.append("failure while trying to revoke node ");
        r14.append(r11);
        r14.append(", ");
        r14.append(r4);
        r14.append(", will try again later");
        android.util.Log.e("CloudNode", r14.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02cc, code lost:
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02cf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02d3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02d4, code lost:
        r3 = r0;
        r1.f96565a.mo53676a(5, r13, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02da, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0323, code lost:
        if (hasMessages(4) == false) goto L_0x0325;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x037a, code lost:
        if (hasMessages(4) == false) goto L_0x037c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x03d6, code lost:
        if (r4 != false) goto L_0x03d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0434, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0436, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0437, code lost:
        r3 = r0;
        r1.f96565a.mo53676a(4, r10, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x043e, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x043f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0440, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0441, code lost:
        if (r4 != false) goto L_0x0443;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:?, code lost:
        r1.f96565a.f96596u.set(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x044b, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x049e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:?, code lost:
        android.util.Log.e("CloudNode", "invalid setting for gms:wearable:service:cloud_sync_disconnected_throttling_schedule", r0);
        r4.f96558i = new long[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x07ef, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x07f0, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:?, code lost:
        r1.f96565a.f96592q = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x07f6, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x0a3d, code lost:
        r0 = e;
        r18 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x0aea, code lost:
        if (hasMessages(4) == false) goto L_0x0aec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:519:0x0b2c, code lost:
        if (hasMessages(4) == false) goto L_0x0b2e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x0b3f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x0b42, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:0x0b43, code lost:
        r18 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x0b48, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:534:0x0b49, code lost:
        r18 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:?, code lost:
        r3.f97769d = android.os.SystemClock.elapsedRealtime();
        r12 = r3.f97768c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:541:0x0b7d, code lost:
        if (r12 != 0) goto L_0x0b7f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:543:0x0b83, code lost:
        if (r3.f97770e != 0) goto L_0x0b85;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x0b85, code lost:
        r3.f97768c = java.lang.Math.min(r12 + r12, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:545:0x0b8d, code lost:
        r6 = (double) r8;
        r8 = r3.f97767b.nextDouble();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:546:0x0b94, code lost:
        java.lang.Double.isNaN(r6);
        java.lang.Double.isNaN(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:548:?, code lost:
        r6 = (long) ((int) java.lang.Math.round(r6 + (r8 * r6)));
        r3.f97770e = r6;
        r3.f97768c = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:549:0x0ba8, code lost:
        r3.f97768c = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:551:0x0bb1, code lost:
        if (android.util.Log.isLoggable(r3.f97766a, 2) != false) goto L_0x0bb3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:552:0x0bb3, code lost:
        r4 = r3.f97766a;
        r6 = r3.f97768c;
        r8 = new java.lang.StringBuilder(62);
        r8.append("RateLimiter: onError, next retry delay is ");
        r8.append(r6);
        android.util.Log.v(r4, r8.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:555:?, code lost:
        r3 = r1.f96565a;
        r3.mo53677a(r3.f96595t.mo54036b());
        r6 = r1.f96565a.f96595t.mo54037c();
        r2 = r2.getMessage();
        r8 = new java.lang.StringBuilder(java.lang.String.valueOf(r2).length() + 57);
        r8.append("caught IOException, retrying in ");
        r8.append(r6);
        r8.append(" ms: ");
        r8.append(r2);
        android.util.Log.w("CloudNode", r8.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:556:0x0c0d, code lost:
        r2 = r1.f96565a;
        r2.f96598w = 0;
        r2.f96586k.mo53757a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:557:0x0c1c, code lost:
        monitor-enter(r1.f96565a.f96597v);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:558:0x0c1d, code lost:
        if (r18 == false) goto L_0x0c1f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:562:0x0c24, code lost:
        if (hasMessages(3) == false) goto L_0x0c26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:564:0x0c2b, code lost:
        if (hasMessages(2) == false) goto L_0x0c2d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:566:0x0c32, code lost:
        if (hasMessages(1) == false) goto L_0x0c34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:568:0x0c39, code lost:
        if (hasMessages(4) == false) goto L_0x0c3b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:569:0x0c3b, code lost:
        r1.f96565a.f96597v.mo49120c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:571:0x0c43, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:572:0x0c44, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:575:0x0c47, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:582:0x0c4c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:583:0x0c4d, code lost:
        r18 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:584:0x0c4f, code lost:
        r2 = r0;
        r4 = r2.f96620a;
        r6 = r2.getMessage();
        r8 = new java.lang.StringBuilder(java.lang.String.valueOf(r6).length() + 37);
        r8.append("aborted sync loop: type ");
        r8.append(r4);
        r8.append(", ");
        r8.append(r6);
        android.util.Log.e("CloudNode", r8.toString());
        r3 = r2.f96620a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:585:0x0c81, code lost:
        if (r3 != 2) goto L_0x0c8f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:586:0x0c83, code lost:
        r1.f96565a.f96588m.mo53663a(r2.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:588:0x0c90, code lost:
        if (r3 == 4) goto L_0x0c92;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:589:0x0c92, code lost:
        r1.f96565a.f96588m.mo53663a(r2.getMessage());
        r1.f96565a.mo53684e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:590:0x0ca2, code lost:
        r2 = r1.f96565a;
        r2.f96598w = 0;
        r3 = p000.axwi.f96566A;
        r2.f96586k.mo53757a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:591:0x0cb3, code lost:
        monitor-enter(r1.f96565a.f96597v);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:592:0x0cb4, code lost:
        if (r18 == false) goto L_0x0cb6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:596:0x0cbb, code lost:
        if (hasMessages(3) == false) goto L_0x0cbd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:598:0x0cc2, code lost:
        if (hasMessages(2) == false) goto L_0x0cc4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:600:0x0cc9, code lost:
        if (hasMessages(1) == false) goto L_0x0ccb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:602:0x0cd0, code lost:
        if (hasMessages(4) == false) goto L_0x0cd2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:603:0x0cd2, code lost:
        r1.f96565a.f96597v.mo49120c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:605:0x0cda, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:606:0x0cdb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:609:0x0cde, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:612:0x0cf1, code lost:
        if (r18 == false) goto L_0x0cf3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:616:0x0cf8, code lost:
        if (hasMessages(3) == false) goto L_0x0cfa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:618:0x0cff, code lost:
        if (hasMessages(2) == false) goto L_0x0d01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:620:0x0d06, code lost:
        if (hasMessages(1) == false) goto L_0x0d08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:622:0x0d0d, code lost:
        if (hasMessages(4) == false) goto L_0x0d0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:623:0x0d0f, code lost:
        r1.f96565a.f96597v.mo49120c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:625:0x0d17, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:626:0x0d18, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:630:0x0d1c, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02e3 A[Catch:{ IOException -> 0x043f, axwq -> 0x0c4c, all -> 0x0b42, axwq -> 0x02d3, IOException -> 0x0b48, all -> 0x0b42, all -> 0x02cf, axwq -> 0x0c4c, IOException -> 0x0b48, all -> 0x0b42 }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0332 A[SYNTHETIC, Splitter:B:164:0x0332] */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x0548 A[Catch:{ IOException -> 0x043f, axwq -> 0x0c4c, all -> 0x0b42, axwq -> 0x02d3, IOException -> 0x0b48, all -> 0x0b42, all -> 0x02cf, axwq -> 0x0c4c, IOException -> 0x0b48, all -> 0x0b42 }] */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x0597 A[Catch:{ IOException -> 0x07ef, axwq -> 0x0c4c, all -> 0x0b42 }] */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x05a0 A[Catch:{ IOException -> 0x07ef, axwq -> 0x0c4c, all -> 0x0b42 }] */
    /* JADX WARNING: Removed duplicated region for block: B:529:0x0b3f A[ExcHandler: axwq (e axwq), PHI: r18 10  PHI: (r18v7 boolean) = (r18v9 boolean), (r18v9 boolean), (r18v12 boolean), (r18v13 boolean), (r18v15 boolean), (r18v20 boolean), (r18v26 boolean) binds: [B:505:0x0afb, B:506:?, B:453:0x0a41, B:480:0x0aad, B:374:0x0848, B:387:0x08be, B:421:0x096f] A[DONT_GENERATE, DONT_INLINE], Splitter:B:421:0x096f] */
    /* JADX WARNING: Removed duplicated region for block: B:530:0x0b42 A[ExcHandler: all (th java.lang.Throwable), PHI: r2 10  PHI: (r2v21 boolean) = (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v47 boolean), (r2v47 boolean), (r2v47 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean) binds: [B:7:0x0019, B:164:0x0332, B:207:0x03be, B:362:0x0801, B:374:0x0848, B:375:?, B:376:0x0866, B:291:0x058f, B:356:0x07f1, B:308:0x0675, B:329:0x0706, B:246:0x047a, B:253:0x04a4, B:213:0x03de, B:235:0x0443, B:218:0x0403, B:219:?, B:221:0x0414, B:192:0x038d, B:134:0x02d2, B:57:0x0140, B:95:0x020a, B:68:0x0184, B:127:0x0292, B:128:?, B:71:0x018c, B:72:?, B:74:0x0196, B:118:0x0287, B:46:0x00ea, B:47:?, B:48:0x0109] A[DONT_GENERATE, DONT_INLINE], Splitter:B:95:0x020a] */
    /* JADX WARNING: Removed duplicated region for block: B:533:0x0b48 A[ExcHandler: IOException (e java.io.IOException), Splitter:B:7:0x0019] */
    /* JADX WARNING: Removed duplicated region for block: B:539:0x0b71 A[SYNTHETIC, Splitter:B:539:0x0b71] */
    /* JADX WARNING: Removed duplicated region for block: B:582:0x0c4c A[Catch:{ all -> 0x0c48, all -> 0x0b3b }, ExcHandler: axwq (e axwq), PHI: r2 10  PHI: (r2v10 boolean) = (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v47 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean) binds: [B:7:0x0019, B:164:0x0332, B:207:0x03be, B:362:0x0801, B:376:0x0866, B:291:0x058f, B:356:0x07f1, B:308:0x0675, B:329:0x0706, B:253:0x04a4, B:213:0x03de, B:235:0x0443, B:218:0x0403, B:221:0x0414, B:192:0x038d, B:134:0x02d2, B:57:0x0140, B:95:0x020a, B:127:0x0292, B:128:?, B:46:0x00ea, B:48:0x0109] A[DONT_GENERATE, DONT_INLINE], Splitter:B:7:0x0019] */
    /* JADX WARNING: Removed duplicated region for block: B:586:0x0c83 A[Catch:{ all -> 0x0c48, all -> 0x0b3b }] */
    /* JADX WARNING: Removed duplicated region for block: B:587:0x0c8f A[Catch:{ all -> 0x0c48, all -> 0x0b3b }] */
    /* JADX WARNING: Removed duplicated region for block: B:592:0x0cb4  */
    /* JADX WARNING: Removed duplicated region for block: B:612:0x0cf1  */
    public final void handleMessage(Message message) {
        boolean z;
        axxv axxv;
        long elapsedRealtime;
        int i;
        boolean z2;
        axxv axxv2;
        boolean z3;
        long elapsedRealtime2;
        long longValue;
        long j;
        Set<String> stringSet;
        int i2 = 1;
        boolean z4 = ayha.m83999e() || chnj.m149030f();
        try {
            if (message.what != 4) {
                long elapsedRealtime3 = SystemClock.elapsedRealtime();
                axwi axwi = this.f96565a;
                int i3 = axwi.f96566A;
                axwi.f96586k.mo53758a("*** Handler");
                axwi axwi2 = this.f96565a;
                axwi2.f96598w = elapsedRealtime3;
                axwi2.f96599x = "setup";
                if (Log.isLoggable("CloudNode", 2)) {
                    Log.v("CloudNode", "sync loop starting");
                }
                if (mo53672a(elapsedRealtime3)) {
                    this.f96565a.mo53683d();
                    String c = this.f96565a.f96578c.mo53805c();
                    if (c == null) {
                        axwi axwi3 = this.f96565a;
                        if (!axwi3.f96577b) {
                            axwi3.f96599x = "connect";
                            String b = ((axwb) axwi3.f96580e).mo6606a();
                            if (bmxx.m108577a(b)) {
                                if (Log.isLoggable("CloudNode", 3)) {
                                    Log.d("CloudNode", "handleConnectToCloud: aborting since the regId isn't set");
                                }
                                throw new axwq(3, "regId not set");
                            } else if ("null".equals(b)) {
                                if (Log.isLoggable("CloudNode", 3)) {
                                    Log.d("CloudNode", "handleConnectToCloud: aborting since the regId is set to null");
                                }
                                throw new axwq(3, "regId is null");
                            } else {
                                long longValue2 = ((axwc) this.f96565a.f96581f).mo6606a().longValue();
                                if (longValue2 == 0) {
                                    if (Log.isLoggable("CloudNode", 3)) {
                                        Log.d("CloudNode", "handleConnectToCloud: aborting since the androidId isn't set");
                                    }
                                    throw new axwq(3, "androidId not set");
                                }
                                if (Log.isLoggable("CloudNode", 2)) {
                                    Log.v("CloudNode", "handleConnectToCloud: requesting creation of a new network");
                                }
                                this.f96565a.mo53683d();
                                long elapsedRealtime4 = SystemClock.elapsedRealtime();
                                axwi axwi4 = this.f96565a;
                                c = axwi4.f96583h.mo53691a(longValue2, b, axzq.m83630a(axwi4.f96578c.mo53804b().getPublic().getEncoded()));
                                this.f96565a.mo53675a(5, elapsedRealtime4, 1);
                                this.f96565a.f96578c.mo53803a(c);
                                mo53668a();
                                this.f96565a.f96601z.mo53568g();
                                if (Log.isLoggable("CloudNode", 2)) {
                                    Log.v("CloudNode", "handleConnectToCloud: connect complete");
                                }
                            }
                        }
                        if (this.f96565a.mo53674a() != null) {
                            if (Log.isLoggable("CloudNode", 2)) {
                                Log.v("CloudNode", "not paired to a network, abandoning sync");
                            }
                            this.f96565a.f96586k.mo53760b("*** Handler");
                            axwi axwi5 = this.f96565a;
                            axwi5.f96598w = 0;
                            axwi5.f96586k.mo53757a();
                            synchronized (this.f96565a.f96597v) {
                                if (!z4) {
                                    try {
                                        if (!hasMessages(3)) {
                                            if (!hasMessages(2)) {
                                                if (!hasMessages(1)) {
                                                }
                                            }
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                this.f96565a.f96597v.mo49120c();
                            }
                            return;
                        } else if (!this.f96565a.mo53681b()) {
                            if (Log.isLoggable("CloudNode", 2)) {
                                Log.v("CloudNode", "cloud sync not enabled, abandoning sync");
                            }
                            this.f96565a.f96586k.mo53760b("*** Handler");
                            axwi axwi6 = this.f96565a;
                            axwi6.f96598w = 0;
                            axwi6.f96586k.mo53757a();
                            synchronized (this.f96565a.f96597v) {
                                if (!z4) {
                                    try {
                                        if (!hasMessages(3)) {
                                            if (!hasMessages(2)) {
                                                if (!hasMessages(1)) {
                                                }
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                this.f96565a.f96597v.mo49120c();
                            }
                            return;
                        } else if (z4) {
                            if (Log.isLoggable("CloudNode", 2)) {
                                Log.v("CloudNode", "cloud sync disabled via gservices, abandoning sync");
                            }
                            this.f96565a.f96586k.mo53760b("*** Handler");
                            axwi axwi7 = this.f96565a;
                            axwi7.f96598w = 0;
                            axwi7.f96586k.mo53757a();
                            synchronized (this.f96565a.f96597v) {
                                try {
                                    this.f96565a.f96597v.mo49120c();
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                            return;
                        } else {
                            String c2 = this.f96565a.f96578c.mo53805c();
                            boolean andSet = this.f96565a.f96596u.getAndSet(false);
                            if (this.f96565a.f96593r == null) {
                            }
                            axwi axwi8 = this.f96565a;
                            axwi8.f96599x = "start sync";
                            String b2 = ((axwb) axwi8.f96580e).mo6606a();
                            if (Log.isLoggable("CloudNode", 2)) {
                                Log.v("CloudNode", "doStartSync: Connect to previously paired network");
                            }
                            this.f96565a.f96597v.mo49111a(60000);
                            long elapsedRealtime5 = SystemClock.elapsedRealtime();
                            axwl b3 = this.f96565a.f96583h.mo53695b(c2, b2);
                            this.f96565a.mo53675a(4, elapsedRealtime5, 1);
                            if (Log.isLoggable("CloudNode", 2)) {
                                Log.v("CloudNode", "doStartSync: complete");
                            }
                            this.f96565a.mo53678a(b3);
                            mo53670a(b3, true);
                            this.f96565a.f96592q = true;
                            this.f96565a.f96594s = true;
                            if (this.f96565a.f96592q) {
                                axwf axwf = this.f96565a.f96588m;
                                String r = chnj.f188812a.mo6606a().mo85441r();
                                if (!r.equals(axwf.f96557h)) {
                                    if (!bmxx.m108577a(r)) {
                                        ArrayList arrayList = new ArrayList();
                                        Scanner scanner = new Scanner(r);
                                        while (scanner.hasNextLong()) {
                                            arrayList.add(Long.valueOf(scanner.nextLong()));
                                            arrayList.add(Long.valueOf(scanner.nextLong()));
                                        }
                                        axwf.f96558i = sqc.m35964b(arrayList);
                                    } else {
                                        axwf.f96558i = new long[]{Long.MAX_VALUE, 0};
                                    }
                                    axwf.f96557h = r;
                                    if (Log.isLoggable("CloudNode", 3)) {
                                        String valueOf = String.valueOf(Arrays.toString(axwf.f96558i));
                                        Log.d("CloudNode", valueOf.length() == 0 ? new String("cloud sync upload configuration updated to: ") : "cloud sync upload configuration updated to: ".concat(valueOf));
                                    }
                                }
                                long currentTimeMillis = System.currentTimeMillis();
                                axwf.f96554e = (currentTimeMillis - axwf.f96553d) / 1000;
                                if (!axwf.f96559j.f96601z.mo53565d()) {
                                    axwf.f96556g = (currentTimeMillis - axwf.f96555f) / 1000;
                                    int i4 = 0;
                                    while (true) {
                                        long[] jArr = axwf.f96558i;
                                        if (i4 >= jArr.length) {
                                            j = -1;
                                            break;
                                        }
                                        long j2 = jArr[i4];
                                        j = jArr[i4 + 1];
                                        if (axwf.f96556g < j2) {
                                            break;
                                        }
                                        i4 += 2;
                                    }
                                    axwf.f96552c = j;
                                } else {
                                    axwf.f96552c = 0;
                                    axwf.f96556g = 0;
                                    axwf.f96555f = currentTimeMillis;
                                    axwf.mo53665b();
                                }
                                long j3 = axwf.f96552c;
                                if (j3 != 0) {
                                    if (j3 == -1) {
                                        z2 = false;
                                    } else if (axwf.f96554e <= j3) {
                                        z2 = false;
                                    }
                                    if (Log.isLoggable("CloudNode", 2)) {
                                        long j4 = axwf.f96556g;
                                        long j5 = axwf.f96554e;
                                        long j6 = axwf.f96552c;
                                        StringBuilder sb = new StringBuilder(143);
                                        sb.append("isReadyToUpload=");
                                        sb.append(z2);
                                        sb.append(", timeSinceConnectedToPeer=");
                                        sb.append(j4);
                                        sb.append(", timeSinceUpload=");
                                        sb.append(j5);
                                        sb.append(", uploadInterval=");
                                        sb.append(j6);
                                        Log.v("CloudNode", sb.toString());
                                    }
                                    if (z2 && this.f96565a.mo53681b()) {
                                        axwi axwi9 = this.f96565a;
                                        axwi9.f96599x = "send data since";
                                        axwi9.f96592q = false;
                                        if (this.f96565a.f96593r != null) {
                                            Log.e("CloudNode", "performSyncWork: there is no cloud sync table, not pushing");
                                        } else {
                                            this.f96565a.mo53683d();
                                            if (!chmi.f188780a.mo6606a().mo85352a()) {
                                                Map map = this.f96565a.f96593r;
                                                sdo.m34966a((Object) c2, (Object) "networkId is null");
                                                sdo.m34966a(map, "syncTable is null");
                                                if (Log.isLoggable("CloudNode", 2)) {
                                                    String valueOf2 = String.valueOf(map);
                                                    StringBuilder sb2 = new StringBuilder(String.valueOf(c2).length() + 41 + String.valueOf(valueOf2).length());
                                                    sb2.append("sendAllDataSynced: networkId=");
                                                    sb2.append(c2);
                                                    sb2.append(", syncTable=");
                                                    sb2.append(valueOf2);
                                                    Log.v("CloudNode", sb2.toString());
                                                }
                                                HashMap hashMap = new HashMap(map);
                                                Map a = this.f96565a.f96582g.mo53733a(hashMap);
                                                ArrayList<axxi> arrayList2 = new ArrayList();
                                                for (Map.Entry entry : a.entrySet()) {
                                                    String str = (String) entry.getKey();
                                                    longValue = ((Long) entry.getValue()).longValue();
                                                    boolean z5 = !hashMap.containsKey(str);
                                                    axwg axwg = new axwg(this, arrayList2);
                                                    this.f96565a.f96582g.mo53738a(str, longValue, -1, z5, axwg);
                                                    hashMap.put(str, Long.valueOf(axwg.f96563b));
                                                }
                                                HashSet hashSet = new HashSet();
                                                for (axxi axxi : arrayList2) {
                                                    hashSet.add(axxi.f96646a.f96377a);
                                                }
                                                try {
                                                    this.f96565a.mo53680a(hashSet);
                                                    Iterator it = arrayList2.iterator();
                                                    while (this.f96565a.mo53681b() && it.hasNext()) {
                                                        if (Log.isLoggable("CloudNode", 2)) {
                                                            Log.v("CloudNode", "sendAllDataSynced: sending batch");
                                                        }
                                                        this.f96565a.mo53683d();
                                                        elapsedRealtime2 = SystemClock.elapsedRealtime();
                                                        axwl a2 = this.f96565a.f96583h.mo53690a(c2, it, (int) chnj.m149033i());
                                                        this.f96565a.mo53675a(2, elapsedRealtime2, 0);
                                                        this.f96565a.mo53678a(a2);
                                                        mo53670a(a2, false);
                                                        if (Log.isLoggable("CloudNode", 2)) {
                                                            String valueOf3 = String.valueOf(a2.f96607b);
                                                            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 52);
                                                            sb3.append("sendAllDataSynced: sent=");
                                                            sb3.append(0);
                                                            sb3.append(" cloud syncTable=");
                                                            sb3.append(valueOf3);
                                                            Log.v("CloudNode", sb3.toString());
                                                        }
                                                    }
                                                    this.f96565a.mo53682c();
                                                    axxv2 = longValue;
                                                } catch (axwq e) {
                                                    e = e;
                                                    Exception exc = e;
                                                    this.f96565a.mo53676a(2, elapsedRealtime2, exc);
                                                    throw exc;
                                                } catch (IOException e2) {
                                                    e = e2;
                                                    Exception exc2 = e;
                                                    this.f96565a.mo53676a(2, elapsedRealtime2, exc2);
                                                    throw exc2;
                                                } catch (Throwable th4) {
                                                    Throwable th5 = th4;
                                                    this.f96565a.mo53682c();
                                                    throw th5;
                                                }
                                            } else {
                                                Map map2 = this.f96565a.f96593r;
                                                sdo.m34966a((Object) c2, (Object) "networkId is null");
                                                sdo.m34966a(map2, "syncTable is null");
                                                if (Log.isLoggable("CloudNode", 2)) {
                                                    String valueOf4 = String.valueOf(map2);
                                                    StringBuilder sb4 = new StringBuilder(String.valueOf(c2).length() + 47 + String.valueOf(valueOf4).length());
                                                    sb4.append("sendAllDataSynced: networkId=");
                                                    sb4.append(c2);
                                                    sb4.append(", cloud syncTable=");
                                                    sb4.append(valueOf4);
                                                    Log.v("CloudNode", sb4.toString());
                                                }
                                                int i5 = (int) chnj.m149033i();
                                                Map a3 = this.f96565a.f96582g.mo53733a(map2);
                                                ArrayList arrayList3 = new ArrayList(i5);
                                                Iterator it2 = a3.entrySet().iterator();
                                                loop8:
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        String str2 = (String) ((Map.Entry) it2.next()).getKey();
                                                        while (true) {
                                                            long longValue3 = ((Long) a3.get(str2)).longValue();
                                                            if (longValue3 == -1) {
                                                                z3 = true;
                                                            } else {
                                                                z3 = false;
                                                            }
                                                            axwg axwg2 = new axwg(this, arrayList3);
                                                            axxv2 = this.f96565a.f96582g;
                                                            axxv2.mo53738a(str2, longValue3, i5 - arrayList3.size(), z3, axwg2);
                                                            if (!this.f96565a.mo53681b()) {
                                                                break loop8;
                                                            }
                                                            a3.put(str2, Long.valueOf(axwg2.f96563b));
                                                            if (arrayList3.size() >= i5) {
                                                                m83375a(c2, arrayList3);
                                                                arrayList3.clear();
                                                            }
                                                        }
                                                    } else {
                                                        axxv2 = axxv2;
                                                        if (!arrayList3.isEmpty()) {
                                                            m83375a(c2, arrayList3);
                                                            axxv2 = axxv2;
                                                        }
                                                    }
                                                }
                                            }
                                            axwf axwf2 = this.f96565a.f96588m;
                                            axwf2.f96553d = System.currentTimeMillis();
                                            axwf2.mo53665b();
                                        }
                                    }
                                }
                                z2 = true;
                                if (Log.isLoggable("CloudNode", 2)) {
                                }
                                axwi axwi92 = this.f96565a;
                                axwi92.f96599x = "send data since";
                                axwi92.f96592q = false;
                                if (this.f96565a.f96593r != null) {
                                }
                            }
                            if (this.f96565a.f96594s) {
                                axwi axwi10 = this.f96565a;
                                axwi10.f96599x = "fetch data";
                                axwi10.f96594s = false;
                                int i6 = 0;
                                axxv = axxv2;
                                while (true) {
                                    if (!this.f96565a.mo53681b()) {
                                        axxv = z4;
                                        break;
                                    }
                                    if (Log.isLoggable("CloudNode", 2)) {
                                        String valueOf5 = String.valueOf(c2);
                                        Log.v("CloudNode", valueOf5.length() == 0 ? new String("Fetching new data from cloud network ") : "Fetching new data from cloud network ".concat(valueOf5));
                                    }
                                    Map f = this.f96565a.f96582g.mo53748f();
                                    this.f96565a.mo53683d();
                                    elapsedRealtime = SystemClock.elapsedRealtime();
                                    axwk a4 = this.f96565a.f96583h.mo53689a(c2, f, chnj.f188812a.mo6606a().mo85448y());
                                    this.f96565a.mo53675a(3, elapsedRealtime, a4.f96604a.size());
                                    List list = a4.f96604a;
                                    if (Log.isLoggable("CloudNode", 3)) {
                                        int size = list.size();
                                        String valueOf6 = String.valueOf(f);
                                        StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf6).length() + 63);
                                        sb5.append("handleFetchNewDataFromCloud: fetched=");
                                        sb5.append(size);
                                        sb5.append(" for syncTable=");
                                        sb5.append(valueOf6);
                                        Log.d("CloudNode", sb5.toString());
                                    }
                                    int size2 = list.size();
                                    axxr[] axxrArr = new axxr[size2];
                                    int i7 = 0;
                                    while (i7 < list.size()) {
                                        z = z4;
                                        axxrArr[i7] = this.f96565a.f96582g.mo53729a((axxi) list.get(i7), false, "cloud");
                                        i7++;
                                        z4 = z;
                                        size2 = size2;
                                    }
                                    HashSet<String> hashSet2 = new HashSet();
                                    HashSet<String> hashSet3 = new HashSet();
                                    int i8 = 0;
                                    z = z;
                                    while (i8 < size2) {
                                        axxr axxr = axxrArr[i8];
                                        if (axxr != null) {
                                            try {
                                                axxs axxs = (axxs) axxr.get();
                                                axxi axxi2 = axxs.f96677a;
                                                if (Log.isLoggable("CloudNode", 2)) {
                                                    String valueOf7 = String.valueOf(axxs.f96677a);
                                                    i = size2;
                                                    z = z4;
                                                    try {
                                                        StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf7).length() + 15);
                                                        sb6.append("Data item set: ");
                                                        sb6.append(valueOf7);
                                                        Log.v("CloudNode", sb6.toString());
                                                    } catch (InterruptedException e3) {
                                                        e = e3;
                                                        Log.w("CloudNode", "request was interrupted", e);
                                                        Thread.currentThread().interrupt();
                                                        i8++;
                                                        z4 = z;
                                                        size2 = i;
                                                    } catch (ExecutionException e4) {
                                                        e = e4;
                                                        try {
                                                            Log.w("CloudNode", "request failed", e);
                                                            i8++;
                                                            z4 = z;
                                                            size2 = i;
                                                        } catch (axwq e5) {
                                                        } catch (IOException e6) {
                                                            e = e6;
                                                            IOException iOException = e;
                                                            try {
                                                                axwi axwi11 = this.f96565a;
                                                                int i9 = axwi.f96566A;
                                                                ayjq ayjq = axwi11.f96595t;
                                                                long w = chnj.f188812a.mo6606a().mo85446w();
                                                                long B = chnj.f188812a.mo6606a().mo85376B();
                                                                long x = chnj.f188812a.mo6606a().mo85447x();
                                                                synchronized (ayjq) {
                                                                }
                                                            } catch (Throwable th6) {
                                                                th = th6;
                                                                Throwable th7 = th;
                                                                axwi axwi12 = this.f96565a;
                                                                axwi12.f96598w = 0;
                                                                int i10 = axwi.f96566A;
                                                                axwi12.f96586k.mo53757a();
                                                                synchronized (this.f96565a.f96597v) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    z = z4;
                                                    i = size2;
                                                }
                                                Set<String> set = axxs.f96678b;
                                                if (set != null) {
                                                    for (String str3 : set) {
                                                        hashSet2.add(str3);
                                                        hashSet3.remove(str3);
                                                    }
                                                }
                                                Set<String> set2 = axxs.f96679c;
                                                if (set2 != null) {
                                                    for (String str4 : set2) {
                                                        if (!hashSet2.contains(str4)) {
                                                            hashSet3.add(str4);
                                                        }
                                                    }
                                                }
                                                Long l = (Long) this.f96565a.f96593r.get(axxi2.f96650e);
                                                if (l != null) {
                                                    if (axxi2.f96651f <= l.longValue()) {
                                                    }
                                                }
                                                this.f96565a.f96593r.put(axxi2.f96650e, Long.valueOf(axxi2.f96651f));
                                            } catch (InterruptedException e7) {
                                                e = e7;
                                                z = z4;
                                                i = size2;
                                                Log.w("CloudNode", "request was interrupted", e);
                                                Thread.currentThread().interrupt();
                                                i8++;
                                                z4 = z;
                                                size2 = i;
                                            } catch (ExecutionException e8) {
                                                e = e8;
                                                z = z4;
                                                i = size2;
                                                Log.w("CloudNode", "request failed", e);
                                                i8++;
                                                z4 = z;
                                                size2 = i;
                                            }
                                        } else {
                                            z = z4;
                                            i = size2;
                                        }
                                        i8++;
                                        z4 = z;
                                        size2 = i;
                                    }
                                    axxv = z4;
                                    for (String str5 : hashSet2) {
                                        this.f96565a.f96590o.mo53660a(new axwx(str5, true));
                                    }
                                    for (String str6 : hashSet3) {
                                        this.f96565a.f96590o.mo53660a(new axwx(str6, false));
                                    }
                                    if (a4.f96605b) {
                                        if (list.isEmpty()) {
                                            Log.w("CloudNode", "server said we have more work to do, but didn't give any more, stopping anyway");
                                            break;
                                        }
                                        i6++;
                                        if (Log.isLoggable("CloudNode", 2)) {
                                            StringBuilder sb7 = new StringBuilder(66);
                                            sb7.append("server said we have more work to do, fetch it, attempt ");
                                            sb7.append(i6);
                                            Log.v("CloudNode", sb7.toString());
                                        }
                                        z4 = axxv;
                                    }
                                }
                            } else {
                                axxv = z4;
                            }
                            axwi axwi13 = this.f96565a;
                            axwi13.f96599x = "download assets";
                            axwi13.f96590o.mo53661a(c2);
                            axwi axwi14 = this.f96565a;
                            axwi14.f96599x = "upload assets";
                            axwi14.f96589n.mo53662a(c2);
                            if (Log.isLoggable("CloudNode", 2)) {
                                Log.v("CloudNode", "sync loop completed");
                            }
                            this.f96565a.f96586k.mo53760b("*** Handler");
                            axwi axwi15 = this.f96565a;
                            axwi15.f96598w = 0;
                            axwi15.f96586k.mo53757a();
                            synchronized (this.f96565a.f96597v) {
                                try {
                                    if (!hasMessages(3) && !hasMessages(2) && !hasMessages(1) && !hasMessages(4)) {
                                        this.f96565a.f96597v.mo49120c();
                                    }
                                } catch (Throwable th8) {
                                    throw th8;
                                }
                            }
                            return;
                        }
                    }
                    axwi axwi16 = this.f96565a;
                    axwi16.f96599x = "revoking nodes";
                    synchronized (axwi16.f96600y) {
                        stringSet = axwi16.f96579d.getStringSet("nodesToRevoke", new HashSet());
                    }
                    if (!stringSet.isEmpty() && Log.isLoggable("CloudNode", 2)) {
                        String valueOf8 = String.valueOf(stringSet);
                        StringBuilder sb8 = new StringBuilder(String.valueOf(valueOf8).length() + 23);
                        sb8.append("found nodes to revoke: ");
                        sb8.append(valueOf8);
                        Log.v("CloudNode", sb8.toString());
                    }
                    Iterator<String> it3 = stringSet.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        String next = it3.next();
                        axwi16.mo53683d();
                        long elapsedRealtime6 = SystemClock.elapsedRealtime();
                        try {
                            axwi16.f96583h.mo53692a(c, next);
                            axwi16.mo53675a(7, elapsedRealtime6, i2);
                            if (Log.isLoggable("CloudNode", 2)) {
                                String valueOf9 = String.valueOf(next);
                                Log.v("CloudNode", valueOf9.length() == 0 ? new String("revoked node ") : "revoked node ".concat(valueOf9));
                            }
                            synchronized (axwi16.f96600y) {
                                if ("cloud".equals(next)) {
                                    Set<String> keySet = axwi16.f96579d.getAll().keySet();
                                    SharedPreferences.Editor edit = axwi16.f96579d.edit();
                                    edit.remove("nodesToRevoke");
                                    edit.remove("cloudSyncId");
                                    for (String str7 : keySet) {
                                        if (str7.startsWith("node_is_enrolled:")) {
                                            edit.remove(str7);
                                        }
                                    }
                                    edit.remove("network_server_assigned").remove("network_id").remove("network_secret");
                                    edit.commit();
                                    if (Log.isLoggable("CloudNode", 3)) {
                                        Log.d("CloudNode", "cleared all clockwork network state");
                                    }
                                } else {
                                    HashSet a5 = bnpf.m110049a((Iterable) axwi16.f96579d.getStringSet("nodesToRevoke", new HashSet()));
                                    if (a5.remove(next)) {
                                        SharedPreferences.Editor putStringSet = axwi16.f96579d.edit().putStringSet("nodesToRevoke", a5);
                                        String valueOf10 = String.valueOf(next);
                                        putStringSet.putInt(valueOf10.length() == 0 ? new String("node_is_enrolled:") : "node_is_enrolled:".concat(valueOf10), 2).commit();
                                    }
                                }
                            }
                        } catch (axwq e9) {
                            e = e9;
                            Exception exc3 = e;
                            axwi16.mo53676a(7, elapsedRealtime6, exc3);
                            throw exc3;
                        } catch (IOException e10) {
                            e = e10;
                            Exception exc32 = e;
                            axwi16.mo53676a(7, elapsedRealtime6, exc32);
                            throw exc32;
                        } catch (Throwable th9) {
                        }
                    }
                    try {
                        if (c.equals(this.f96565a.f96578c.mo53805c())) {
                            this.f96565a.f96599x = "ensure enrolled";
                            mo53671a(c);
                            if (this.f96565a.mo53674a() != null) {
                            }
                        } else {
                            throw new IOException("current network was revoked");
                        }
                    } catch (axwq e11) {
                        e = e11;
                        Exception exc4 = e;
                        this.f96565a.mo53676a(3, elapsedRealtime, exc4);
                        throw exc4;
                    } catch (IOException e12) {
                        e = e12;
                        Exception exc42 = e;
                        this.f96565a.mo53676a(3, elapsedRealtime, exc42);
                        throw exc42;
                    } catch (Throwable th92) {
                    }
                } else {
                    boolean z6 = z4;
                    this.f96565a.f96586k.mo53760b("*** Handler");
                    axwi axwi17 = this.f96565a;
                    axwi17.f96598w = 0;
                    axwi17.f96586k.mo53757a();
                    synchronized (this.f96565a.f96597v) {
                        if (!z6) {
                            try {
                                if (!hasMessages(3)) {
                                    if (!hasMessages(2)) {
                                        if (!hasMessages(1)) {
                                        }
                                    }
                                }
                            } catch (Throwable th10) {
                                throw th10;
                            }
                        }
                        this.f96565a.f96597v.mo49120c();
                    }
                }
            } else {
                z = z4;
                mo53668a();
                axwi axwi18 = this.f96565a;
                axwi18.f96598w = 0;
                int i11 = axwi.f96566A;
                axwi18.f96586k.mo53757a();
                synchronized (this.f96565a.f96597v) {
                    if (!z) {
                        try {
                            if (!hasMessages(3)) {
                                if (!hasMessages(2)) {
                                    if (!hasMessages(1)) {
                                    }
                                }
                            }
                        } catch (Throwable th11) {
                            throw th11;
                        }
                    }
                    this.f96565a.f96597v.mo49120c();
                }
            }
        } catch (IOException e13) {
            e = e13;
            boolean z7 = z4;
            IOException iOException2 = e;
            this.f96565a.f96594s = true;
            throw iOException2;
        } catch (axwq e14) {
        } catch (Throwable th922) {
        }
    }

    /* renamed from: a */
    public final void mo53668a() {
        long ac = chnj.f188812a.mo6606a().mo85404ac();
        int i = 0;
        while (true) {
            long j = (long) i;
            if (j < ac) {
                if (Log.isLoggable("CloudNode", 3)) {
                    StringBuilder sb = new StringBuilder(51);
                    sb.append("doCheckin: retries remaining - ");
                    sb.append(ac - j);
                    Log.d("CloudNode", sb.toString());
                }
                Semaphore semaphore = new Semaphore(1);
                semaphore.acquireUninterruptibly();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.google.android.checkin.CHECKIN_COMPLETE");
                CloudNodeAdapter$EventHandler$1 cloudNodeAdapter$EventHandler$1 = new CloudNodeAdapter$EventHandler$1("wearable", semaphore);
                axwi axwi = this.f96565a;
                int i2 = axwi.f96566A;
                axwi.f96576a.registerReceiver(cloudNodeAdapter$EventHandler$1, intentFilter);
                this.f96565a.f96576a.sendBroadcast(new Intent("android.server.checkin.CHECKIN_NOW").setPackage("com.google.android.gms"));
                try {
                    if (Log.isLoggable("CloudNode", 3)) {
                        Log.d("CloudNode", "Blocking wait for CHECKIN_COMPLETE");
                    }
                    if (!semaphore.tryAcquire(chnj.f188812a.mo6606a().mo85410ai(), TimeUnit.MILLISECONDS)) {
                        i++;
                    } else {
                        return;
                    }
                } catch (InterruptedException e) {
                    Log.w("CloudNode", "Interrupted while waiting for checkin response.", e);
                } finally {
                    this.f96565a.f96576a.unregisterReceiver(cloudNodeAdapter$EventHandler$1);
                }
            } else {
                Log.w("CloudNode", "doCheckin ran out of retry attempts.");
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo53669a(int i) {
        if (!(i == 3 || i == 4)) {
            if (!mo53672a(SystemClock.elapsedRealtime())) {
                return;
            }
            if (i == 1) {
                axwi axwi = this.f96565a;
                int i2 = axwi.f96566A;
                if (!axwi.mo53681b()) {
                    if (Log.isLoggable("CloudNode", 2)) {
                        Log.v("CloudNode", "cloud sync not enabled, abandoning sync");
                        return;
                    }
                    return;
                }
            }
        }
        axwi axwi2 = this.f96565a;
        int i3 = axwi.f96566A;
        synchronized (axwi2.f96597v) {
            this.f96565a.mo53683d();
            this.f96565a.f96585j.removeMessages(i);
            this.f96565a.f96585j.obtainMessage(i).sendToTarget();
        }
    }

    /* renamed from: a */
    public final void mo53670a(axwl axwl, boolean z) {
        if (axwl.f96608c.size() <= 0) {
            return;
        }
        if (z) {
            axwe axwe = this.f96565a.f96589n;
            HashSet hashSet = axwl.f96608c;
            axwe.f96547a.clear();
            axwe.f96547a.addAll(hashSet);
            return;
        }
        Iterator it = axwl.f96608c.iterator();
        while (it.hasNext()) {
            axwx axwx = (axwx) it.next();
            axwe axwe2 = this.f96565a.f96589n;
            if (!axwe2.f96547a.contains(axwx)) {
                axwe2.f96547a.offer(axwx);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo53671a(String str) {
        Iterator it;
        Iterator it2;
        long j;
        axwi axwi = this.f96565a;
        int i = axwi.f96566A;
        if (!axwi.f96577b) {
            int i2 = 2;
            if (Log.isLoggable("CloudNode", 2)) {
                Log.v("CloudNode", "doEnsureOtherNodesEnrolled: starting");
            }
            axxv axxv = this.f96565a.f96578c.f96848b;
            HashMap hashMap = new HashMap();
            Cursor a = axxv.mo53726a(ayha.f97559a, new Uri.Builder().scheme("wear").path("/pairing/public_key").build());
            try {
                a.moveToFirst();
                while (!a.isAfterLast()) {
                    axxf axxf = axxj.m83472a(a).f96647b;
                    hashMap.put(axxf.f96639a, axos.m82822a(axxf.f96642d));
                }
                a.close();
                Iterator it3 = hashMap.entrySet().iterator();
                while (it3.hasNext()) {
                    Map.Entry entry = (Map.Entry) it3.next();
                    String str2 = (String) entry.getKey();
                    axos axos = (axos) entry.getValue();
                    String valueOf = String.valueOf(str2);
                    String str3 = valueOf.length() == 0 ? new String("node_is_enrolled:") : "node_is_enrolled:".concat(valueOf);
                    if (Log.isLoggable("CloudNode", i2)) {
                        String valueOf2 = String.valueOf(str2);
                        Log.v("CloudNode", valueOf2.length() == 0 ? new String("doEnsureOtherNodesEnrolled: found public key for node ") : "doEnsureOtherNodesEnrolled: found public key for node ".concat(valueOf2));
                    }
                    int i3 = this.f96565a.f96579d.getInt(str3, 1);
                    if (i3 == i2) {
                        it = it3;
                    } else if (i3 != 3) {
                        long i4 = axos.mo53347i("androidId");
                        if (i4 != 0) {
                            String c = axos.mo53337c("registrationId");
                            String str4 = c != null ? c : "";
                            byte[] f = axos.mo53343f("encodedPublicKey");
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            try {
                                this.f96565a.mo53683d();
                                it2 = it3;
                                j = elapsedRealtime;
                                try {
                                    this.f96565a.f96583h.mo53693a(str, str2, i4, str4, axzq.m83630a(f));
                                    this.f96565a.mo53675a(6, j, 1);
                                    axzq axzq = this.f96565a.f96578c;
                                    if (axxj.m83471a(axzq.f96848b, str2, "/enrolled") == null) {
                                        axos axos2 = new axos();
                                        axos2.mo53328a("networkId", str);
                                        axxj.m83474a(axzq.f96848b, str2, "/enrolled", axos2);
                                    }
                                    this.f96565a.f96579d.edit().putInt(str3, 2).commit();
                                    if (Log.isLoggable("CloudNode", 2)) {
                                        String valueOf3 = String.valueOf(str2);
                                        Log.v("CloudNode", valueOf3.length() == 0 ? new String("doEnsureOtherNodesEnrolled: successfully enrolled target node ") : "doEnsureOtherNodesEnrolled: successfully enrolled target node ".concat(valueOf3));
                                        it3 = it2;
                                        i2 = 2;
                                    } else {
                                        it3 = it2;
                                        i2 = 2;
                                    }
                                } catch (axwq e) {
                                    e = e;
                                    this.f96565a.mo53676a(6, j, e);
                                    it3 = it2;
                                    i2 = 2;
                                } catch (IOException e2) {
                                    e = e2;
                                    this.f96565a.mo53676a(6, j, e);
                                    throw e;
                                }
                            } catch (axwq e3) {
                                e = e3;
                                it2 = it3;
                                j = elapsedRealtime;
                                this.f96565a.mo53676a(6, j, e);
                                it3 = it2;
                                i2 = 2;
                            } catch (IOException e4) {
                                e = e4;
                                j = elapsedRealtime;
                                this.f96565a.mo53676a(6, j, e);
                                throw e;
                            }
                        } else if (Log.isLoggable("CloudNode", i2)) {
                            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 72);
                            sb.append("doEnsureOtherNodesEnrolled: target node ");
                            sb.append(str2);
                            sb.append(" has no androidId, not enrolling");
                            Log.v("CloudNode", sb.toString());
                        }
                    } else {
                        it = it3;
                    }
                    i2 = 2;
                    if (Log.isLoggable("CloudNode", 2)) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 92);
                        sb2.append("doEnsureOtherNodesEnrolled: enrollment state for node ");
                        sb2.append(str2);
                        sb2.append(" is already ");
                        sb2.append(i3);
                        sb2.append(", not enrolling");
                        Log.v("CloudNode", sb2.toString());
                        it3 = it;
                    } else {
                        it3 = it;
                    }
                }
            } catch (Throwable th) {
                a.close();
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo53672a(long j) {
        if (this.f96565a.f96588m.mo53666c()) {
            if (Log.isLoggable("CloudNode", 2)) {
                Log.v("CloudNode", "In error state, refusing to sync");
            }
            return false;
        } else if (!this.f96565a.mo53685f()) {
            if (Log.isLoggable("CloudNode", 2)) {
                Log.v("CloudNode", "not connected, abandoning sync");
            }
            return false;
        } else {
            axwi axwi = this.f96565a;
            int i = axwi.f96566A;
            if (axwi.f96595t.mo54036b() <= j) {
                return true;
            }
            if (Log.isLoggable("CloudNode", 2)) {
                long b = this.f96565a.f96595t.mo54036b();
                StringBuilder sb = new StringBuilder(51);
                sb.append("backed off, trying again in ");
                sb.append(b - j);
                sb.append(" ms");
                Log.v("CloudNode", sb.toString());
            }
            axwi axwi2 = this.f96565a;
            axwi2.mo53677a(axwi2.f96595t.mo54036b());
            return false;
        }
    }
}
