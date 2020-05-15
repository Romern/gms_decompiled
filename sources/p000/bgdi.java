package p000;

import android.app.PendingIntent;
import com.google.android.location.internal.server.GoogleLocationChimeraService;
import java.util.Collections;
import java.util.List;

/* renamed from: bgdi */
public final /* synthetic */ class bgdi implements Runnable {

    /* renamed from: a */
    private final bgdo f116112a;

    /* renamed from: b */
    private final PendingIntent f116113b;

    /* renamed from: c */
    private final String f116114c;

    /* renamed from: d */
    private final long f116115d;

    /* renamed from: e */
    private final boolean f116116e;

    /* renamed from: f */
    private final long f116117f;

    /* renamed from: g */
    private final boolean f116118g;

    /* renamed from: h */
    private final bhcv f116119h;

    /* renamed from: i */
    private final boolean f116120i;

    public bgdi(bgdo bgdo, PendingIntent pendingIntent, String str, long j, boolean z, long j2, boolean z2, bhcv bhcv, boolean z3) {
        this.f116112a = bgdo;
        this.f116113b = pendingIntent;
        this.f116114c = str;
        this.f116115d = j;
        this.f116116e = z;
        this.f116117f = j2;
        this.f116118g = z2;
        this.f116119h = bhcv;
        this.f116120i = z3;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:7:0x007a */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:34:0x013c */
    /* JADX WARN: Type inference failed for: r16v0, assign insn: PHI: (r16v0 ?) = (r16v7 ?), (r16v6 ?) binds: [B:34:0x013c, B:7:0x007a] */
    /* JADX WARN: Type inference failed for: r16v6, types: [int], assign insn: 0x003b: INVOKE  (r16v6 ? I:int) = (r16v5 java.lang.String) type: VIRTUAL call: java.lang.String.length():int */
    /* JADX WARN: Type inference failed for: r16v7, assign insn: 0x0127: MOVE  (r16v7 ? I:?[OBJECT, ARRAY]) = (r6v1 java.lang.Object) */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    public final void run() {
        Object obj;
        long j;
        long j2;
        boolean z;
        boolean z2;
        GoogleLocationChimeraService googleLocationChimeraService;
        bgdo bgdo = this.f116112a;
        PendingIntent pendingIntent = this.f116113b;
        String str = this.f116114c;
        long j3 = this.f116115d;
        boolean z3 = this.f116116e;
        long j4 = this.f116117f;
        boolean z4 = this.f116118g;
        bhcv bhcv = this.f116119h;
        boolean z5 = this.f116120i;
        Object obj2 = bgdo.f116149e;
        synchronized (obj2) {
            try {
                String hexString = Integer.toHexString(pendingIntent.hashCode());
                String targetPackage = pendingIntent.getTargetPackage();
                int length = String.valueOf(hexString).length() + 100 + String.valueOf(targetPackage).length();
                ? r16 = String.valueOf(str).length();
                StringBuilder sb = new StringBuilder(length + r16);
                sb.append("adding location pendingIntent=");
                sb.append(hexString);
                sb.append(", packageName=");
                sb.append(targetPackage);
                sb.append(", tag=");
                sb.append(str);
                sb.append(", periodMillis=");
                sb.append(j3);
                sb.append(", trigger=");
                sb.append(z3);
                sb.toString();
                Object obj3 = obj2;
                if (!ceze.m138458c()) {
                    try {
                        j = Math.max(j3, 5000L);
                    } catch (Throwable th) {
                        th = th;
                        obj = r16;
                        throw th;
                    }
                } else {
                    j = Math.max(j3, 1000L);
                }
                bgcg bgcg = bgdo.f116155l;
                GoogleLocationChimeraService googleLocationChimeraService2 = bgdo.f116145a;
                bgns d = bgdo.mo62683d();
                bfor bfor = bgcg.f116032c;
                if (bfor == null) {
                    googleLocationChimeraService = googleLocationChimeraService2;
                    j2 = j4;
                    z2 = z5;
                    z = z4;
                } else {
                    int hashCode = pendingIntent.hashCode();
                    List singletonList = bhcv == null ? Collections.singletonList(pendingIntent.getTargetPackage()) : bhcv.mo63560c();
                    bfos bfos = bfos.LOCATION_PENDING_INTENT_ADDED;
                    long b = bfor.mo62055b();
                    StringBuilder sb2 = new StringBuilder();
                    if (str != null) {
                        sb2.append(str);
                    }
                    googleLocationChimeraService = googleLocationChimeraService2;
                    sb2.append("/");
                    if (singletonList != null) {
                        int i = 0;
                        while (true) {
                            z2 = z5;
                            if (i >= singletonList.size()) {
                                break;
                            }
                            if (i != 0) {
                                sb2.append(",");
                            }
                            String str2 = (String) singletonList.get(i);
                            sb2.append("");
                            i++;
                            z5 = z2;
                        }
                    } else {
                        z2 = z5;
                    }
                    z = z4;
                    j2 = j4;
                    bfor.mo62047a(new bgdc(bfos, b, sb2.toString(), hashCode, (int) Math.min(j / 1000, 2147483647L), z3 ? 1 : 0, hashCode, j, str, singletonList));
                }
                r16 = obj3;
                bgdo bgdo2 = bgdo;
                GoogleLocationChimeraService googleLocationChimeraService3 = googleLocationChimeraService;
                boolean z6 = z3;
                bgce bgce = (bgce) bgcg.f116030a.put(pendingIntent, new bgce(bgcg, pendingIntent, j, j2, d, z, bhcv, z2, str));
                if (bgce != null) {
                    bgce.mo62594a();
                }
                bgcg.mo62638a(bgcg.f116030a.values());
                bfnc bfnc = bgcg.f116038i;
                if (bfnc != null) {
                    bgcg.mo62637a(googleLocationChimeraService3, new bfnc[]{bfnc});
                }
                bgdo2.mo62675a(bgdo2.f116155l.f116036g);
                bgdo2.mo62682c(z6);
            } catch (Throwable th2) {
                th = th2;
                obj = obj2;
                throw th;
            }
        }
    }
}
