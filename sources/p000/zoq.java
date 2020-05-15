package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.data.SessionDataSet;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import com.google.android.gms.fitness.request.SessionReadRequest;
import com.google.android.gms.fitness.request.SessionRegistrationRequest;
import com.google.android.gms.fitness.request.SessionStartRequest;
import com.google.android.gms.fitness.request.SessionStopRequest;
import com.google.android.gms.fitness.request.SessionUnregistrationRequest;
import com.google.android.gms.fitness.result.SessionReadResult;
import com.google.android.gms.fitness.result.SessionStopResult;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: zoq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zoq implements ytv {

    /* renamed from: a */
    final /* synthetic */ zor f55619a;

    public zoq(zor zor) {
        this.f55619a = zor;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: zpc.a(zrc, cadz):void
     arg types: [zre, cadz]
     candidates:
      zpc.a(cadz, caaq):cadp
      zpc.a(cadz, cadz):cadz
      zpc.a(zre, cadz):void
      zpc.a(zrc, cadz):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: zrc.a(java.util.List, boolean):bngx
     arg types: [bxwc, int]
     candidates:
      zrc.a(caae, long):int
      zrc.a(caae, int):long
      zrc.a(cadp, boolean):cadp
      zrj.a(cadz, int):boolean
      zra.a(int, long):bngx
      zrc.a(java.util.List, boolean):bngx */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: zrc.a(java.util.List, boolean):bngx
     arg types: [bngx, int]
     candidates:
      zrc.a(caae, long):int
      zrc.a(caae, int):long
      zrc.a(cadp, boolean):cadp
      zrj.a(cadz, int):boolean
      zra.a(int, long):bngx
      zrc.a(java.util.List, boolean):bngx */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x053f A[Catch:{ IOException -> 0x05a7, ytw -> 0x0579, all -> 0x0576 }] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0540 A[Catch:{ IOException -> 0x05a7, ytw -> 0x0579, all -> 0x0576 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x02ec A[Catch:{ IOException -> 0x0329, all -> 0x0326 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x02ed A[Catch:{ IOException -> 0x0329, all -> 0x0326 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0303 A[Catch:{ IOException -> 0x0329, all -> 0x0326 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0304 A[Catch:{ IOException -> 0x0329, all -> 0x0326 }] */
    /* renamed from: a */
    public final boolean mo30773a(int i, Object obj, ytt ytt) {
        ytp ytp;
        Context context;
        String str;
        Context context2;
        ytp ytp2;
        String str2;
        Context context3;
        ytp ytp3;
        String str3;
        Status status;
        Context context4;
        ytp ytp4;
        String str4;
        SessionReadResult sessionReadResult;
        bxvd da;
        String str5;
        int i2 = i;
        ytt ytt2 = ytt;
        if (i2 == 0) {
            zor zor = this.f55619a;
            SessionStartRequest sessionStartRequest = (SessionStartRequest) obj;
            String str6 = ytt2.f54617a;
            bxvd da2 = bpgr.f137526x.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpgr bpgr = (bpgr) da2.f164949b;
            str6.getClass();
            bpgr.f137528a |= 1;
            bpgr.f137529b = str6;
            bxvd da3 = bpgo.f137518c.mo74144da();
            int i3 = sessionStartRequest.f32304a.f32171f;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bpgo bpgo = (bpgo) da3.f164949b;
            bpgo.f137520a |= 1;
            bpgo.f137521b = i3;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpgr bpgr2 = (bpgr) da2.f164949b;
            bpgo bpgo2 = (bpgo) da3.mo74062i();
            bpgo2.getClass();
            bpgr2.f137531d = bpgo2;
            bpgr2.f137528a = 4 | bpgr2.f137528a;
            try {
                Status a = zor.mo31298a(sessionStartRequest, str6);
                sessionStartRequest.f32305b.mo30933a(a);
                int i4 = a.f30115i;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bpgr bpgr3 = (bpgr) da2.f164949b;
                bpgr3.f137528a |= 2;
                bpgr3.f137530c = i4;
                ytp = zor.f55626j;
                context = zor.f55428a;
                str = zor.f55429b;
            } catch (IOException e) {
                sessionStartRequest.f32305b.mo30933a(new Status(5008));
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bpgr bpgr4 = (bpgr) da2.f164949b;
                bpgr4.f137528a |= 2;
                bpgr4.f137530c = 5008;
                ytp = zor.f55626j;
                context = zor.f55428a;
                str = zor.f55429b;
            } catch (Throwable th) {
                Throwable th2 = th;
                zor.f55626j.mo30769a(zor.f55428a, zor.f55429b, (bpgr) da2.mo74062i());
                throw th2;
            }
            ytp.mo30769a(context, str, (bpgr) da2.mo74062i());
            return true;
        } else if (i2 == 1) {
            zor zor2 = this.f55619a;
            SessionStopRequest sessionStopRequest = (SessionStopRequest) obj;
            String str7 = ytt2.f54617a;
            zci zci = sessionStopRequest.f32308c;
            bxvd da4 = bpgr.f137526x.mo74144da();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bpgr bpgr5 = (bpgr) da4.f164949b;
            str7.getClass();
            bpgr5.f137528a |= 1;
            bpgr5.f137529b = str7;
            bpgp bpgp = bpgp.f137522a;
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bpgr bpgr6 = (bpgr) da4.f164949b;
            bpgp.getClass();
            bpgr6.f137532e = bpgp;
            bpgr6.f137528a |= 8;
            try {
                SessionStopResult a2 = zor2.mo31299a(sessionStopRequest, str7);
                zci.mo30932a(a2);
                int i5 = a2.f32362a.f30115i;
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                bpgr bpgr7 = (bpgr) da4.f164949b;
                bpgr7.f137528a |= 2;
                bpgr7.f137530c = i5;
                zvm.m46573b(zor2.f55428a, zor2.f55429b, cadu.SESSION_INSERTED);
                ytp2 = zor2.f55626j;
                context2 = zor2.f55428a;
                str2 = zor2.f55429b;
            } catch (IOException e2) {
                zci.mo30932a(SessionStopResult.m23730a(new Status(5008)));
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                bpgr bpgr8 = (bpgr) da4.f164949b;
                bpgr8.f137528a |= 2;
                bpgr8.f137530c = 5008;
                ytp2 = zor2.f55626j;
                context2 = zor2.f55428a;
                str2 = zor2.f55429b;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                zor2.f55626j.mo30769a(zor2.f55428a, zor2.f55429b, (bpgr) da4.mo74062i());
                throw th4;
            }
            ytp2.mo30769a(context2, str2, (bpgr) da4.mo74062i());
            return true;
        } else if (i2 == 2) {
            zor zor3 = this.f55619a;
            SessionInsertRequest sessionInsertRequest = (SessionInsertRequest) obj;
            String str8 = ytt2.f54617a;
            zcl zcl = sessionInsertRequest.f32291d;
            if (zcl == null) {
                return true;
            }
            bxvd da5 = bpgr.f137526x.mo74144da();
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            bpgr bpgr9 = (bpgr) da5.f164949b;
            str8.getClass();
            bpgr9.f137528a |= 1;
            bpgr9.f137529b = str8;
            bxvd da6 = bpgl.f137508c.mo74144da();
            int i6 = sessionInsertRequest.f32288a.f32171f;
            if (da6.f164950c) {
                da6.mo74035c();
                da6.f164950c = false;
            }
            bpgl bpgl = (bpgl) da6.f164949b;
            bpgl.f137510a |= 1;
            bpgl.f137511b = i6;
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            bpgr bpgr10 = (bpgr) da5.f164949b;
            bpgl bpgl2 = (bpgl) da6.mo74062i();
            bpgl2.getClass();
            bpgr10.f137533f = bpgl2;
            bpgr10.f137528a |= 16;
            try {
                if (cdyr.m135341c()) {
                    status = zor3.f55623g.mo30730c(str8, stc.m36282a("https://www.googleapis.com/auth/fitness.activity.write"));
                    if (!status.mo17710c()) {
                        zcl.mo30933a(status);
                        int i7 = status.f30115i;
                        if (!da5.f164950c) {
                            da5.mo74035c();
                            da5.f164950c = false;
                        }
                        bpgr bpgr11 = (bpgr) da5.f164949b;
                        bpgr11.f137528a |= 2;
                        bpgr11.f137530c = i7;
                        ytp3 = zor3.f55626j;
                        context3 = zor3.f55428a;
                        str3 = zor3.f55429b;
                        ytp3.mo30769a(context3, str3, (bpgr) da5.mo74062i());
                        return true;
                    }
                }
                zos zos = zor3.f55625i;
                List<DataSet> list = sessionInsertRequest.f32289b;
                bngs b = bngx.m109371b(list.size());
                for (DataSet dataSet : list) {
                    b.mo67668c(ywe.m44938a(dataSet));
                }
                bngx a3 = b.mo67664a();
                List<DataPoint> list2 = sessionInsertRequest.f32290c;
                bngs b2 = bngx.m109371b(list2.size());
                for (DataPoint dataPoint : list2) {
                    b2.mo67668c(ywd.m44935a(dataPoint));
                }
                bngx a4 = b2.mo67664a();
                bnia c = bnic.m109499c(sessionInsertRequest.f32289b.size() + sessionInsertRequest.f32290c.size());
                bnre i8 = a3.listIterator();
                while (i8.hasNext()) {
                    caae caae = ((cadp) i8.next()).f172713b;
                    if (caae == null) {
                        caae = caae.f172323i;
                    }
                    c.mo67629b(caae);
                }
                bnre i9 = a4.listIterator();
                while (i9.hasNext()) {
                    caae caae2 = ((cadn) i9.next()).f172705e;
                    if (caae2 == null) {
                        caae2 = caae.f172323i;
                    }
                    c.mo67629b(caae2);
                }
                Status a5 = zos.f55630d.mo30717a(str8, c.mo67751a(), 2);
                if (a5.mo17710c()) {
                    bzzy bzzy = (bzzy) bzzz.f172298f.mo74144da();
                    if (bzzy.f164950c) {
                        bzzy.mo74035c();
                        bzzy.f164950c = false;
                    }
                    bzzz bzzz = (bzzz) bzzy.f164949b;
                    str8.getClass();
                    bzzz.f172300a |= 1;
                    bzzz.f172301b = str8;
                    bzzz bzzz2 = (bzzz) bzzy.mo74062i();
                    cadz a6 = yym.m45034a(ywf.m44941a(sessionInsertRequest.f32288a), bzzz2);
                    cadz a7 = zpc.m45934a(a6, zos.f55629c, str8);
                    if (a7 == null) {
                        zos.f55629c.mo31394b(a6, 17);
                        zpc.m45938a(zos.f55629c, a6);
                        zos.mo31300a(a6.f172779e, a6.f172780f);
                    } else {
                        cadz a8 = zpc.m45933a(a6, a7);
                        zos.f55629c.mo31395c(a8, 17);
                        long j = a7.f172780f;
                        long j2 = a8.f172780f;
                        if (j < j2) {
                            zos.mo31300a(j, j2);
                        }
                        zre zre = zos.f55629c;
                        zpc.m45937a((zrc) zre, a7);
                        zpc.m45938a(zre, a8);
                    }
                    bnre i10 = a3.listIterator();
                    while (i10.hasNext()) {
                        zos.f55629c.mo31361a((List) yyl.m45029a((cadp) i10.next(), bzzz2).f172714c, true);
                    }
                    zos.f55629c.mo31361a((List) a4, true);
                    status = zos.f55628b;
                    if (status.mo17710c()) {
                        zvm.m46571a(zor3.f55428a, zor3.f55429b);
                        zvm.m46573b(zor3.f55428a, zor3.f55429b, cadu.SESSION_INSERTED);
                    }
                    zcl.mo30933a(status);
                    int i72 = status.f30115i;
                    if (!da5.f164950c) {
                    }
                    bpgr bpgr112 = (bpgr) da5.f164949b;
                    bpgr112.f137528a |= 2;
                    bpgr112.f137530c = i72;
                    ytp3 = zor3.f55626j;
                    context3 = zor3.f55428a;
                    str3 = zor3.f55429b;
                    ytp3.mo30769a(context3, str3, (bpgr) da5.mo74062i());
                    return true;
                }
                bnsl bnsl = (bnsl) zos.f55627a.mo68388c();
                bnsl.mo68432a("zos", "a", 125, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68424a("App %s does not have access to data types in request %s", str8, sessionInsertRequest);
                throw new ytw(a5.f30115i, a5.f30116j);
            } catch (IOException e3) {
                zcl.mo30933a(new Status(5008));
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                bpgr bpgr12 = (bpgr) da5.f164949b;
                bpgr12.f137528a |= 2;
                bpgr12.f137530c = 5008;
                ytp3 = zor3.f55626j;
                context3 = zor3.f55428a;
                str3 = zor3.f55429b;
            } catch (ytw e4) {
                ytw ytw = e4;
                zcl.mo30933a(new Status(ytw.f54623a, ytw.f54624b));
                int i11 = ytw.f54623a;
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                bpgr bpgr13 = (bpgr) da5.f164949b;
                bpgr13.f137528a |= 2;
                bpgr13.f137530c = i11;
                ytp3 = zor3.f55626j;
                context3 = zor3.f55428a;
                str3 = zor3.f55429b;
            } catch (Throwable th5) {
                Throwable th6 = th5;
                zor3.f55626j.mo30769a(zor3.f55428a, zor3.f55429b, (bpgr) da5.mo74062i());
                throw th6;
            }
        } else if (i2 == 3) {
            zor zor4 = this.f55619a;
            SessionReadRequest sessionReadRequest = (SessionReadRequest) obj;
            String str9 = ytt2.f54617a;
            zch zch = sessionReadRequest.f32301j;
            if (zch == null) {
                return true;
            }
            bxvd da7 = bpgr.f137526x.mo74144da();
            if (da7.f164950c) {
                da7.mo74035c();
                da7.f164950c = false;
            }
            bpgr bpgr14 = (bpgr) da7.f164949b;
            str9.getClass();
            bpgr14.f137528a |= 1;
            bpgr14.f137529b = str9;
            bpgm bpgm = bpgm.f137512c;
            if (da7.f164950c) {
                da7.mo74035c();
                da7.f164950c = false;
            }
            bpgr bpgr15 = (bpgr) da7.f164949b;
            bpgm.getClass();
            bpgr15.f137534g = bpgm;
            bpgr15.f137528a |= 32;
            try {
                if (cdyr.m135341c()) {
                    Status c2 = zor4.f55623g.mo30730c(str9, stc.m36282a("https://www.googleapis.com/auth/fitness.activity.read"));
                    if (!c2.mo17710c()) {
                        sessionReadResult = SessionReadResult.m23728a(c2);
                        zch.mo30931a(sessionReadResult);
                        da = bpgm.f137512c.mo74144da();
                        int size = sessionReadResult.f32359a.size();
                        if (!da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bpgm bpgm2 = (bpgm) da.f164949b;
                        bpgm2.f137514a |= 1;
                        bpgm2.f137515b = size;
                        if (!da7.f164950c) {
                            da7.mo74035c();
                            da7.f164950c = false;
                        }
                        bpgr bpgr16 = (bpgr) da7.f164949b;
                        bpgm bpgm3 = (bpgm) da.mo74062i();
                        bpgm3.getClass();
                        bpgr16.f137534g = bpgm3;
                        bpgr16.f137528a |= 32;
                        ytp4 = zor4.f55626j;
                        context4 = zor4.f55428a;
                        str4 = zor4.f55429b;
                        ytp4.mo30769a(context4, str4, (bpgr) da7.mo74062i());
                        return true;
                    }
                }
                zqx zqx = zor4.f55624h;
                bngx<caae> a9 = yvx.m44924a(sessionReadRequest.f32297f);
                bngx<caah> a10 = ywb.m44928a(sessionReadRequest.f32296e);
                bngs b3 = bngx.m109371b(a9.size() + a10.size());
                for (caae caae3 : a9) {
                    b3.mo67668c(zqx.mo30458a(caae3, str9));
                }
                for (caah caah : a10) {
                    b3.mo67668c(zqx.mo30459a(caah));
                }
                bngx a11 = b3.mo67664a();
                Status a12 = zor4.f55623g.mo30717a(str9, bnic.m109495a((Collection) a11), 1);
                if (!a12.mo17710c()) {
                    bnsl bnsl2 = (bnsl) zor.f55620d.mo68388c();
                    bnsl2.mo68432a("zor", "a", 415, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68424a("App %s does not have access to dataSources: %s", str9, yyd.m44991b(a11));
                    sessionReadResult = SessionReadResult.m23728a(a12);
                } else {
                    if (!sessionReadRequest.f32298g) {
                        str5 = str9;
                    } else {
                        str5 = null;
                    }
                    ArrayList arrayList = new ArrayList();
                    bnre i12 = zor4.f55622f.mo31392a(str5, sessionReadRequest.f32292a, sessionReadRequest.f32293b, TimeUnit.MILLISECONDS.convert(sessionReadRequest.f32294c, TimeUnit.MILLISECONDS), TimeUnit.MILLISECONDS.convert(sessionReadRequest.f32295d, TimeUnit.MILLISECONDS)).listIterator();
                    while (i12.hasNext()) {
                        cadz cadz = (cadz) i12.next();
                        if (!sessionReadRequest.f32300i.contains(yym.m45036a(cadz))) {
                            arrayList.add(cadz);
                        }
                    }
                    bngx a13 = ywf.m44940a(arrayList);
                    boolean z = sessionReadRequest.f32299h;
                    bngs b4 = bngx.m109371b(a13.size() * a11.size());
                    bnre i13 = a13.listIterator();
                    while (i13.hasNext()) {
                        Session session = (Session) i13.next();
                        zqx zqx2 = zor4.f55624h;
                        long nanos = TimeUnit.MILLISECONDS.toNanos(session.f32166a);
                        long nanos2 = TimeUnit.MILLISECONDS.toNanos(session.f32167b);
                        ygb a14 = ygc.m44027a(str9);
                        a14.f53748b = z;
                        bnre i14 = zqx2.mo30457a(a11, nanos, nanos2, -1, a14.mo30460a()).listIterator();
                        while (i14.hasNext()) {
                            b4.mo67668c(new SessionDataSet(session, ywe.m44939a((cadp) i14.next(), str9)));
                        }
                    }
                    sessionReadResult = new SessionReadResult(a13, b4.mo67664a(), Status.f30107a);
                }
                zch.mo30931a(sessionReadResult);
                da = bpgm.f137512c.mo74144da();
                int size2 = sessionReadResult.f32359a.size();
                if (!da.f164950c) {
                }
                bpgm bpgm22 = (bpgm) da.f164949b;
                bpgm22.f137514a |= 1;
                bpgm22.f137515b = size2;
                if (!da7.f164950c) {
                }
                bpgr bpgr162 = (bpgr) da7.f164949b;
                bpgm bpgm32 = (bpgm) da.mo74062i();
                bpgm32.getClass();
                bpgr162.f137534g = bpgm32;
                bpgr162.f137528a |= 32;
                ytp4 = zor4.f55626j;
                context4 = zor4.f55428a;
                str4 = zor4.f55429b;
            } catch (IOException e5) {
                zch.mo30931a(SessionReadResult.m23728a(new Status(5008)));
                ytp4 = zor4.f55626j;
                context4 = zor4.f55428a;
                str4 = zor4.f55429b;
            } catch (Throwable th7) {
                Throwable th8 = th7;
                zor4.f55626j.mo30769a(zor4.f55428a, zor4.f55429b, (bpgr) da7.mo74062i());
                throw th8;
            }
            ytp4.mo30769a(context4, str4, (bpgr) da7.mo74062i());
            return true;
        } else if (i2 == 4) {
            zor zor5 = this.f55619a;
            SessionRegistrationRequest sessionRegistrationRequest = (SessionRegistrationRequest) obj;
            zcl zcl2 = sessionRegistrationRequest.f32303b;
            String str10 = ytt2.f54617a;
            Status c3 = zor5.f55623g.mo30730c(str10, stc.m36282a("https://www.googleapis.com/auth/fitness.activity.read"));
            if (c3.mo17710c()) {
                zor5.f55621e.mo31307a(str10, sessionRegistrationRequest.f32302a, new ClientIdentity(ytt2.f54618b, ytt2.f54617a), true);
                c3 = Status.f30107a;
            }
            zcl2.mo30933a(c3);
            ytp ytp5 = zor5.f55626j;
            Context context5 = zor5.f55428a;
            String str11 = zor5.f55429b;
            bxvd da8 = bpgr.f137526x.mo74144da();
            int i15 = c3.f30115i;
            if (da8.f164950c) {
                da8.mo74035c();
                da8.f164950c = false;
            }
            bpgr bpgr17 = (bpgr) da8.f164949b;
            int i16 = 2 | bpgr17.f137528a;
            bpgr17.f137528a = i16;
            bpgr17.f137530c = i15;
            String str12 = ytt2.f54617a;
            str12.getClass();
            bpgr17.f137528a = i16 | 1;
            bpgr17.f137529b = str12;
            bpgn bpgn = bpgn.f137516a;
            if (da8.f164950c) {
                da8.mo74035c();
                da8.f164950c = false;
            }
            bpgr bpgr18 = (bpgr) da8.f164949b;
            bpgn.getClass();
            bpgr18.f137535h = bpgn;
            bpgr18.f137528a |= 64;
            ytp5.mo30769a(context5, str11, (bpgr) da8.mo74062i());
            if (c3.mo17710c() && zor5.mo31245d()) {
                zor5.mo31246e();
            }
            return true;
        } else if (i2 != 5) {
            return false;
        } else {
            zor zor6 = this.f55619a;
            SessionUnregistrationRequest sessionUnregistrationRequest = (SessionUnregistrationRequest) obj;
            zcl zcl3 = sessionUnregistrationRequest.f32310b;
            zor6.f55621e.mo31306a(ytt2.f54617a, sessionUnregistrationRequest.f32309a);
            Status status2 = Status.f30107a;
            zcl3.mo30933a(status2);
            ytp ytp6 = zor6.f55626j;
            Context context6 = zor6.f55428a;
            String str13 = zor6.f55429b;
            bxvd da9 = bpgr.f137526x.mo74144da();
            int i17 = status2.f30115i;
            if (da9.f164950c) {
                da9.mo74035c();
                da9.f164950c = false;
            }
            bpgr bpgr19 = (bpgr) da9.f164949b;
            int i18 = 2 | bpgr19.f137528a;
            bpgr19.f137528a = i18;
            bpgr19.f137530c = i17;
            String str14 = ytt2.f54617a;
            str14.getClass();
            bpgr19.f137528a = i18 | 1;
            bpgr19.f137529b = str14;
            bpgq bpgq = bpgq.f137524a;
            if (da9.f164950c) {
                da9.mo74035c();
                da9.f164950c = false;
            }
            bpgr bpgr20 = (bpgr) da9.f164949b;
            bpgq.getClass();
            bpgr20.f137536i = bpgq;
            bpgr20.f137528a |= 128;
            ytp6.mo30769a(context6, str13, (bpgr) da9.mo74062i());
            if (status2.mo17710c() && !zor6.mo31245d()) {
                zor6.mo31247f();
            }
            return true;
        }
    }
}
