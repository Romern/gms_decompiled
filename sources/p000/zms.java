package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.data.Goal;
import com.google.android.gms.fitness.request.GoalsReadRequest;
import com.google.android.gms.fitness.result.GoalsResult;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: zms */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zms implements ytv {

    /* renamed from: a */
    final /* synthetic */ zmt f55494a;

    public zms(zmt zmt) {
        this.f55494a = zmt;
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:11:0x0068 */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:169:0x02a1 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:181:0x02cf */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:161:0x025e */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:219:0x035a */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String], assign insn: 0x0000: CONST_STR  (r1v0 ? I:java.lang.String) =  "Error reading goals." */
    /* JADX WARN: Type inference failed for: r16v6, types: [long], assign insn: 0x0055: INVOKE  (r16v6 ? I:long) =  type: STATIC call: java.lang.System.currentTimeMillis():long */
    /* JADX WARN: Type inference failed for: r16v7, assign insn: PHI: (r16v7 ?) = (r16v6 ?), (r16v13 ?), (r16v13 ?), (r16v20 ?), (r16v20 ?), (r16v20 ?), (r16v20 ?), (r16v20 ?) binds: [B:11:0x0068, B:169:0x02a1, B:181:0x02cf, B:219:0x035a, B:192:0x0303, B:193:?, B:197:0x0317, B:198:?] */
    /* JADX WARN: Type inference failed for: r1v11, assign insn: PHI: (r1v11 ?) = (r1v0 ?), (r1v16 ?), (r1v20 ?), (r1v25 ?), (r1v25 ?), (r1v25 ?), (r1v25 ?), (r1v25 ?) binds: [B:11:0x0068, B:169:0x02a1, B:181:0x02cf, B:219:0x035a, B:192:0x0303, B:193:?, B:197:0x0317, B:198:?] */
    /* JADX WARN: Type inference failed for: r16v8, assign insn: PHI: (r16v8 ?) = (r16v6 ?), (r16v13 ?), (r16v13 ?), (r16v20 ?), (r16v20 ?), (r16v20 ?) binds: [B:11:0x0068, B:169:0x02a1, B:181:0x02cf, B:219:0x035a, B:197:0x0317, B:198:?] */
    /* JADX WARN: Type inference failed for: r1v12, assign insn: PHI: (r1v12 ?) = (r1v0 ?), (r1v16 ?), (r1v20 ?), (r1v25 ?), (r1v25 ?), (r1v25 ?) binds: [B:11:0x0068, B:169:0x02a1, B:181:0x02cf, B:219:0x035a, B:197:0x0317, B:198:?] */
    /* JADX WARN: Type inference failed for: r1v15, assign insn: PHI: (r1v15 ?) = (r1v0 ?), (r1v26 ?) binds: [B:24:?, B:199:0x031f] */
    /* JADX WARN: Type inference failed for: r1v16, assign insn: PHI: (r1v16 ?) = (r1v23 ?), (r1v33 ?) binds: [B:162:?, B:27:0x00a7] */
    /* JADX WARN: Type inference failed for: r16v13, assign insn: 0x029f: MOVE  (r16v13 ? I:?[OBJECT, ARRAY]) = (r1v16 ? I:?[OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r1v20, types: [zbe], assign insn: 0x02cd: MOVE  (r1v20 ? I:?[OBJECT, ARRAY]) = (r20v3 zbe) */
    /* JADX WARN: Type inference failed for: r16v14, assign insn: PHI: (r16v14 ?) = (r16v13 ?), (r16v13 ?), (r16v18 ?) binds: [B:172:0x02af, B:173:?, B:161:0x025e] */
    /* JADX WARN: Type inference failed for: r16v15, assign insn: PHI: (r16v15 ?) = (r16v13 ?), (r16v13 ?), (r16v18 ?) binds: [B:172:0x02af, B:173:?, B:161:0x025e] */
    /* JADX WARN: Type inference failed for: r16v18, assign insn: 0x025c: MOVE  (r16v18 ? I:?[OBJECT, ARRAY]) = (r1v16 ? I:?[OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r1v23, assign insn: 0x027e: MOVE  (r1v23 ? I:?[OBJECT, ARRAY]) = (r16v18 ? I:?[OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r16v20, assign insn: 0x02dd: MOVE  (r16v20 ? I:?[OBJECT, ARRAY]) = (r1v15 ? I:?[OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r1v25, assign insn: 0x02df: MOVE  (r1v25 ? I:?[OBJECT, ARRAY]) = (r20v3 zbe) */
    /* JADX WARN: Type inference failed for: r1v26, assign insn: 0x0323: MOVE  (r1v26 ? I:?[OBJECT, ARRAY]) = (r16v20 ? I:?[OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r1v28, assign insn: PHI: (r1v28 ?) = (r1v16 ?), (r1v16 ?), (r1v16 ?), (r1v16 ?), (r1v16 ?), (r1v16 ?), (r1v16 ?), (r1v16 ?), (r1v16 ?), (r1v16 ?), (r1v16 ?), (r1v16 ?), (r1v0 ?), (r1v0 ?) binds: [B:30:0x00ba, B:31:?, B:48:0x0103, B:64:0x013f, B:65:?, B:154:0x023d, B:147:0x0232, B:148:?, B:118:0x01e7, B:68:0x0149, B:53:0x0110, B:34:0x00df, B:15:0x007b, B:16:?] */
    /* JADX WARN: Type inference failed for: r1v30, assign insn: PHI: (r1v30 ?) = (r1v16 ?), (r1v16 ?), (r1v16 ?), (r1v16 ?), (r1v16 ?), (r1v0 ?), (r1v0 ?) binds: [B:147:0x0232, B:148:?, B:68:0x0149, B:53:0x0110, B:34:0x00df, B:15:0x007b, B:16:?] */
    /* JADX WARN: Type inference failed for: r1v33, assign insn: ?: MOVE  (r1v33 ?) = (r1v15 ?) */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable
     arg types: [java.util.ArrayList, zmu]
     candidates:
      bnjd.b(java.lang.Iterable, int):java.lang.Object
      bnjd.b(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0087, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008a, code lost:
        r2 = r0;
        r16 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0091, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0092, code lost:
        r3 = r0;
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x037a, code lost:
        r0 = e;
        r16 = r16;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x037c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x037d, code lost:
        r16 = r1;
        r1 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0384, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0387, code lost:
        r16 = r1;
        r1 = r15;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0244 A[Catch:{ ytw -> 0x0091, IOException | IllegalStateException -> 0x0297 }] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0246 A[Catch:{ ytw -> 0x0091, IOException | IllegalStateException -> 0x0297 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0091 A[ExcHandler: ytw (r0v24 'e' ytw A[CUSTOM_DECLARE]), PHI: r1 r20 10  PHI: (r1v28 ?) = (r1v16 ?), (r1v16 ?), (r1v16 ?), (r1v16 ?), (r1v16 ?), (r1v16 ?), (r1v16 ?), (r1v16 ?), (r1v16 ?), (r1v16 ?), (r1v16 ?), (r1v16 ?), (r1v0 ?), (r1v0 ?) binds: [B:30:0x00ba, B:31:?, B:48:0x0103, B:64:0x013f, B:65:?, B:154:0x023d, B:147:0x0232, B:148:?, B:118:0x01e7, B:68:0x0149, B:53:0x0110, B:34:0x00df, B:15:0x007b, B:16:?] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r20v6 zbe) = (r20v3 zbe), (r20v3 zbe), (r20v3 zbe), (r20v3 zbe), (r20v3 zbe), (r20v3 zbe), (r20v3 zbe), (r20v3 zbe), (r20v3 zbe), (r20v3 zbe), (r20v3 zbe), (r20v3 zbe), (r20v0 zbe), (r20v0 zbe) binds: [B:30:0x00ba, B:31:?, B:48:0x0103, B:64:0x013f, B:65:?, B:154:0x023d, B:147:0x0232, B:148:?, B:118:0x01e7, B:68:0x0149, B:53:0x0110, B:34:0x00df, B:15:0x007b, B:16:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:15:0x007b] */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x037a A[ExcHandler: ytw (e ytw), PHI: r1 r16 10  PHI: (r1v11 ?) = (r1v0 ?), (r1v16 ?), (r1v20 ?), (r1v25 ?), (r1v25 ?), (r1v25 ?), (r1v25 ?), (r1v25 ?) binds: [B:11:0x0068, B:169:0x02a1, B:181:0x02cf, B:219:0x035a, B:192:0x0303, B:193:?, B:197:0x0317, B:198:?] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r16v7 ?) = (r16v6 ?), (r16v13 ?), (r16v13 ?), (r16v20 ?), (r16v20 ?), (r16v20 ?), (r16v20 ?), (r16v20 ?) binds: [B:11:0x0068, B:169:0x02a1, B:181:0x02cf, B:219:0x035a, B:192:0x0303, B:193:?, B:197:0x0317, B:198:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:181:0x02cf] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0384 A[ExcHandler: IOException | IllegalStateException (e java.lang.Throwable), Splitter:B:4:0x0015] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public final boolean mo30773a(int i, Object obj, ytt ytt) {
        ytw ytw;
        String str;
        zbe zbe;
        String str2;
        Throwable th;
        zbe zbe2;
        String str3;
        zbe zbe3;
        Status status;
        ArrayList arrayList;
        List list;
        String str4;
        boolean z;
        boolean z2;
        boolean z3;
        double d;
        boolean z4;
        int a;
        ? r1 = "Error reading goals.";
        if (i != 0) {
            return false;
        }
        zmt zmt = this.f55494a;
        GoalsReadRequest goalsReadRequest = (GoalsReadRequest) obj;
        String str5 = ytt.f54617a;
        zbe zbe4 = goalsReadRequest.f32263d;
        try {
            zmv zmv = zmt.f55496e;
            ArrayList arrayList2 = new ArrayList(goalsReadRequest.f32260a);
            arrayList2.add(ywb.m44931a(bzzn.f172115i));
            Status b = zmv.f55501b.mo30725b(str5, ywb.m44929a((Collection) arrayList2), 1);
            if (b.mo17710c()) {
                ygb a2 = ygc.m44027a(str5);
                a2.f53748b = true;
                a2.f53749c = ygv.f53779i;
                ygc a3 = a2.mo30460a();
                znm znm = zmv.f55502c;
                cadl cadl = cadl.UNKNOWN_BUCKET;
                bngx e = bngx.m109376e();
                bngx a4 = bngx.m109356a(bzzn.f172079S);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                String currentTimeMillis = System.currentTimeMillis();
                zbe3 = zbe4;
                try {
                    List<cadp> a5 = znm.mo31274a(str5, cadl, e, a4, a3, timeUnit, currentTimeMillis, Long.MAX_VALUE, 0);
                    ArrayList<cadn> arrayList3 = new ArrayList();
                    for (cadp cadp : a5) {
                        try {
                            arrayList3.addAll(cadp.f172714c);
                        } catch (ytw e2) {
                        } catch (IOException | IllegalStateException e3) {
                            e = e3;
                            str4 = r1;
                            th = e;
                            String str6 = str4;
                            zbe2 = zbe3;
                            str2 = str6;
                            bnsl bnsl = (bnsl) zmt.f55495d.mo68387b();
                            bnsl.mo68437a(th);
                            bnsl.mo68405a(str2);
                            zbe2.mo30901a(GoalsResult.m23724a(new Status(5008)));
                            return true;
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (cadn cadn : arrayList3) {
                        currentTimeMillis = r1;
                        r1 = zbe3;
                        ByteString bxtx = ((caaw) cadn.f172704d.get(0)).f172388h;
                        bxus c = bxus.m123744c();
                        cadh cadh = cadh.f172669j;
                        try {
                            bxuc h = bxtx.mo73764h();
                            GeneratedMessageLite GeneratedMessageLite = (GeneratedMessageLite) cadh.mo74142c(4);
                            bxxv a6 = bxxm.f165037a.mo74228a(GeneratedMessageLite);
                            a6.mo74220a(GeneratedMessageLite, bxud.m123454a(h), c);
                            a6.mo74225d(GeneratedMessageLite);
                            h.mo73787a(0);
                            GeneratedMessageLite.m124027b(GeneratedMessageLite);
                            arrayList4.add((cadh) GeneratedMessageLite);
                            zbe3 = r1;
                            r1 = currentTimeMillis;
                        } catch (IOException e4) {
                            IOException iOException = e4;
                            if (!(iOException.getCause() instanceof bxwf)) {
                                throw new bxwf(iOException.getMessage());
                            }
                            throw ((bxwf) iOException.getCause());
                        } catch (RuntimeException e5) {
                            RuntimeException runtimeException = e5;
                            if (runtimeException.getCause() instanceof bxwf) {
                                throw ((bxwf) runtimeException.getCause());
                            }
                            throw runtimeException;
                        } catch (ytw e6) {
                        } catch (bxwf e7) {
                            throw e7;
                        } catch (bxwf e8) {
                            throw e8;
                        }
                    }
                    status = zmv.f55500a;
                    arrayList = new ArrayList();
                    Iterator it = arrayList4.iterator();
                    r1 = r1;
                    while (it.hasNext()) {
                        cadh cadh2 = (cadh) it.next();
                        yxa yxa = new yxa();
                        yxa.f54718a = TimeUnit.NANOSECONDS.toNanos(cadh2.f172672b);
                        yxa.f54719b = TimeUnit.NANOSECONDS.toNanos(cadh2.f172673c);
                        if ((cadh2.f172671a & 128) != 0) {
                            cadg cadg = cadh2.f172679i;
                            if (cadg == null) {
                                cadg = cadg.f172664c;
                            }
                            int i2 = (int) cadg.f172667b;
                            cadg cadg2 = cadh2.f172679i;
                            if (cadg2 == null) {
                                cadg2 = cadg.f172664c;
                            }
                            int a7 = cadf.m126494a(cadg2.f172666a);
                            if (a7 == 0) {
                                a7 = 1;
                            }
                            yxa.f54721d = new Goal.Recurrence(i2, a7 - 1);
                        }
                        for (cada cada : cadh2.f172675e) {
                            if (cada.f172646a.equals(bzzj.f172035b.f172342b) && (a = cacz.m126488a(cada.f172648c)) != 0 && a == 2) {
                                caaw caaw = cada.f172647b;
                                if (caaw == null) {
                                    caaw = caaw.f172379i;
                                }
                                yue.m44849a(Integer.valueOf(caaw.f172382b), yxa.f54720c);
                            }
                        }
                        int i3 = cadh2.f172671a;
                        if ((i3 & 16) != 0) {
                            if (bzzn.f172115i.f172336b.equals(cadh2.f172674d)) {
                                cadb cadb = cadh2.f172676f;
                                if (cadb == null) {
                                    cadb = cadb.f172650b;
                                }
                                cada cada2 = cadb.f172652a;
                                if (cada2 == null) {
                                    cada2 = cada.f172644d;
                                }
                                caaw caaw2 = cada2.f172647b;
                                if (caaw2 == null) {
                                    caaw2 = caaw.f172379i;
                                }
                                Goal.DurationObjective durationObjective = new Goal.DurationObjective(TimeUnit.MILLISECONDS.toNanos((long) caaw2.f172382b));
                                if (yxa.f54722e == 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                sdo.m34971a(z4, (Object) "Objective already set.");
                                sdo.checkIfNull(durationObjective, "Attempting to use a null objective");
                                yxa.f54722e = 2;
                                yxa.f54724g = durationObjective;
                            } else {
                                cadb cadb2 = cadh2.f172676f;
                                if (cadb2 == null) {
                                    cadb2 = cadb.f172650b;
                                }
                                cada cada3 = cadb2.f172652a;
                                if (cada3 == null) {
                                    cada3 = cada.f172644d;
                                }
                                caaw caaw3 = cada3.f172647b;
                                if (caaw3 == null) {
                                    caaw3 = caaw.f172379i;
                                }
                                if ((caaw3.f172381a & 2) != 0) {
                                    d = caaw3.f172383c;
                                } else {
                                    d = (double) caaw3.f172382b;
                                }
                                yxa.mo30820a(new Goal.MetricObjective(cadh2.f172674d, d, 0.0d));
                            }
                        } else if ((i3 & 32) != 0) {
                            cadc cadc = cadh2.f172677g;
                            if (cadc == null) {
                                cadc = cadc.f172654b;
                            }
                            Goal.FrequencyObjective frequencyObjective = new Goal.FrequencyObjective(cadc.f172656a);
                            if (yxa.f54722e == 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            sdo.m34971a(z3, (Object) "Objective already set.");
                            sdo.checkIfNull(frequencyObjective, "Attempting to use a null objective");
                            yxa.f54722e = 3;
                            yxa.f54725h = frequencyObjective;
                        } else if ((i3 & 64) != 0) {
                            cadd cadd = cadh2.f172678h;
                            if (cadd == null) {
                                cadd = cadd.f172658c;
                            }
                            cada cada4 = cadd.f172660a;
                            if (cada4 == null) {
                                cada4 = cada.f172644d;
                            }
                            caaw caaw4 = cada4.f172647b;
                            if (caaw4 == null) {
                                caaw4 = caaw.f172379i;
                            }
                            cadd cadd2 = cadh2.f172678h;
                            if (cadd2 == null) {
                                cadd2 = cadd.f172658c;
                            }
                            caaw caaw5 = cadd2.f172661b;
                            if (caaw5 == null) {
                                caaw5 = caaw.f172379i;
                            }
                            yxa.mo30820a(new Goal.MetricObjective(cadh2.f172674d, caaw4.f172383c, caaw5.f172383c));
                        } else {
                            throw new IllegalArgumentException(String.format("Invalid goal proto:\n%s ", cadh2));
                        }
                        if (yxa.f54718a > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        sdo.m34971a(z, (Object) "Create time should be specified.");
                        long j = yxa.f54719b;
                        if (j != 0) {
                            if (j <= yxa.f54718a) {
                                z2 = false;
                                sdo.m34971a(z2, (Object) "End time should be later than create time.");
                                sdo.m34971a(yxa.f54722e == 0, (Object) "Objective should be specified.");
                                Iterator it2 = it;
                                currentTimeMillis = r1;
                                arrayList.add(new Goal(yxa.f54718a, yxa.f54719b, yxa.f54720c, yxa.f54721d, yxa.f54722e, yxa.f54723f, yxa.f54724g, yxa.f54725h));
                                it = it2;
                                r1 = currentTimeMillis;
                            }
                        }
                        z2 = true;
                        sdo.m34971a(z2, (Object) "End time should be later than create time.");
                        sdo.m34971a(yxa.f54722e == 0, (Object) "Objective should be specified.");
                        Iterator it22 = it;
                        currentTimeMillis = r1;
                        try {
                            arrayList.add(new Goal(yxa.f54718a, yxa.f54719b, yxa.f54720c, yxa.f54721d, yxa.f54722e, yxa.f54723f, yxa.f54724g, yxa.f54725h));
                            it = it22;
                            r1 = currentTimeMillis;
                        } catch (ytw e9) {
                            ytw = e9;
                            str = currentTimeMillis;
                        } catch (IOException | IllegalStateException e10) {
                            e = e10;
                            str4 = currentTimeMillis;
                            th = e;
                            String str62 = str4;
                            zbe2 = zbe3;
                            str2 = str62;
                            bnsl bnsl2 = (bnsl) zmt.f55495d.mo68387b();
                            bnsl2.mo68437a(th);
                            bnsl2.mo68405a(str2);
                            zbe2.mo30901a(GoalsResult.m23724a(new Status(5008)));
                            return true;
                        }
                    }
                    currentTimeMillis = r1;
                } catch (ytw e11) {
                    e = e11;
                    currentTimeMillis = r1;
                    zbe = zbe3;
                    String str7 = currentTimeMillis;
                    ytw = e;
                    str = str7;
                    bnsl bnsl3 = (bnsl) zmt.f55495d.mo68387b();
                    bnsl3.mo68437a(ytw);
                    bnsl3.mo68405a(str);
                    zbe.mo30901a(GoalsResult.m23724a(new Status(ytw.f54623a, ytw.f54624b)));
                    return true;
                } catch (IOException e12) {
                    e = e12;
                    currentTimeMillis = r1;
                    zbe2 = zbe3;
                    str3 = currentTimeMillis;
                    th = e;
                    str2 = str3;
                    bnsl bnsl22 = (bnsl) zmt.f55495d.mo68387b();
                    bnsl22.mo68437a(th);
                    bnsl22.mo68405a(str2);
                    zbe2.mo30901a(GoalsResult.m23724a(new Status(5008)));
                    return true;
                } catch (IllegalStateException e13) {
                    e = e13;
                    currentTimeMillis = r1;
                    zbe2 = zbe3;
                    str3 = currentTimeMillis;
                    th = e;
                    str2 = str3;
                    bnsl bnsl222 = (bnsl) zmt.f55495d.mo68387b();
                    bnsl222.mo68437a(th);
                    bnsl222.mo68405a(str2);
                    zbe2.mo30901a(GoalsResult.m23724a(new Status(5008)));
                    return true;
                }
                try {
                    List list2 = goalsReadRequest.f32260a;
                    List a8 = goalsReadRequest.mo19050a();
                    if (!goalsReadRequest.f32261b.isEmpty()) {
                        list = goalsReadRequest.f32261b;
                    } else {
                        list = null;
                    }
                    GoalsResult goalsResult = new GoalsResult(status, bngx.m109355a(bnjd.m109586b((Iterable) arrayList, (bmxz) new zmu(a8, list, list2))));
                    r1 = zbe3;
                    try {
                        r1.mo30901a(goalsResult);
                        return true;
                    } catch (ytw e62) {
                    } catch (IOException | IllegalStateException e14) {
                        e = e14;
                        str3 = currentTimeMillis;
                        zbe2 = r1;
                        th = e;
                        str2 = str3;
                        bnsl bnsl2222 = (bnsl) zmt.f55495d.mo68387b();
                        bnsl2222.mo68437a(th);
                        bnsl2222.mo68405a(str2);
                        zbe2.mo30901a(GoalsResult.m23724a(new Status(5008)));
                        return true;
                    }
                } catch (ytw e15) {
                    e = e15;
                    zbe = zbe3;
                    String str72 = currentTimeMillis;
                    ytw = e;
                    str = str72;
                    bnsl bnsl32 = (bnsl) zmt.f55495d.mo68387b();
                    bnsl32.mo68437a(ytw);
                    bnsl32.mo68405a(str);
                    zbe.mo30901a(GoalsResult.m23724a(new Status(ytw.f54623a, ytw.f54624b)));
                    return true;
                } catch (IOException e16) {
                    e = e16;
                    zbe2 = zbe3;
                    str3 = currentTimeMillis;
                    th = e;
                    str2 = str3;
                    bnsl bnsl22222 = (bnsl) zmt.f55495d.mo68387b();
                    bnsl22222.mo68437a(th);
                    bnsl22222.mo68405a(str2);
                    zbe2.mo30901a(GoalsResult.m23724a(new Status(5008)));
                    return true;
                } catch (IllegalStateException e17) {
                    e = e17;
                    zbe2 = zbe3;
                    str3 = currentTimeMillis;
                    th = e;
                    str2 = str3;
                    bnsl bnsl222222 = (bnsl) zmt.f55495d.mo68387b();
                    bnsl222222.mo68437a(th);
                    bnsl222222.mo68405a(str2);
                    zbe2.mo30901a(GoalsResult.m23724a(new Status(5008)));
                    return true;
                }
            } else {
                throw new ytw(b.f30115i, b.f30116j);
            }
        } catch (ytw e18) {
            str = r1;
            zbe = zbe4;
            ytw = e18;
            bnsl bnsl322 = (bnsl) zmt.f55495d.mo68387b();
            bnsl322.mo68437a(ytw);
            bnsl322.mo68405a(str);
            zbe.mo30901a(GoalsResult.m23724a(new Status(ytw.f54623a, ytw.f54624b)));
            return true;
        } catch (IOException | IllegalStateException e19) {
        }
        zbe = zbe3;
        bnsl bnsl3222 = (bnsl) zmt.f55495d.mo68387b();
        bnsl3222.mo68437a(ytw);
        bnsl3222.mo68405a(str);
        zbe.mo30901a(GoalsResult.m23724a(new Status(ytw.f54623a, ytw.f54624b)));
        return true;
    }
}
