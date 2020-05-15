package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.DailyTotalRequest;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataInsertRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest;
import com.google.android.gms.fitness.request.DataUpdateListenerUnregistrationRequest;
import com.google.android.gms.fitness.request.DataUpdateRequest;
import com.google.android.gms.fitness.request.DebugInfoRequest;
import com.google.android.gms.fitness.request.GetFileUriRequest;
import com.google.android.gms.fitness.request.GetSyncInfoRequest;
import com.google.android.gms.fitness.request.ReadRawRequest;
import com.google.android.gms.fitness.request.ReadStatsRequest;
import com.google.android.gms.fitness.result.DailyTotalResult;
import com.google.android.gms.fitness.result.DebugInfoResult;
import com.google.android.gms.fitness.result.FileUriResult;
import com.google.android.gms.fitness.result.SyncInfoResult;
import com.google.android.gms.fitness.store.listener.DataUpdateListener;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: znd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class znd implements ytv {

    /* renamed from: a */
    final /* synthetic */ zne f55532a;

    public znd(zne zne) {
        this.f55532a = zne;
    }

    /* JADX WARNING: Removed duplicated region for block: B:169:0x0405  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0449  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0469  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0478  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x047b  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0482  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x06c2 A[Catch:{ IOException -> 0x0764, ytw -> 0x0736, all -> 0x0732 }] */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x06cf A[Catch:{ IOException -> 0x0764, ytw -> 0x0736, all -> 0x0732 }] */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x06d0 A[Catch:{ IOException -> 0x0764, ytw -> 0x0736, all -> 0x0732 }] */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x06fe A[Catch:{ IOException -> 0x0764, ytw -> 0x0736, all -> 0x0732 }] */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x0708 A[Catch:{ IOException -> 0x0764, ytw -> 0x0736, all -> 0x0732 }] */
    /* JADX WARNING: Removed duplicated region for block: B:319:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:173:0x0425=Splitter:B:173:0x0425, B:165:0x03ef=Splitter:B:165:0x03ef} */
    /* renamed from: a */
    public final boolean mo30773a(int i, Object obj, ytt ytt) {
        Context context;
        String str;
        ytp ytp;
        Status status;
        caah a;
        ytp ytp2;
        Context context2;
        String str2;
        Status status2;
        Throwable th;
        zcl zcl;
        IOException iOException;
        ytw ytw;
        caae caae;
        String str3;
        Context context3;
        ytp ytp3;
        bngx bngx;
        bngx bngx2;
        ytt ytt2 = ytt;
        switch (i) {
            case 0:
                this.f55532a.mo31268a((DataReadRequest) obj, ytt2.f54617a);
                return true;
            case 1:
                zne zne = this.f55532a;
                DataInsertRequest dataInsertRequest = (DataInsertRequest) obj;
                String str4 = ytt2.f54617a;
                zcl zcl2 = dataInsertRequest.f32213b;
                bxvd da = bpgr.f137526x.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpgr bpgr = (bpgr) da.f164949b;
                str4.getClass();
                bpgr.f137528a |= 1;
                bpgr.f137529b = str4;
                bxvd da2 = bpgd.f137474c.mo74144da();
                bzzv a2 = bzzk.m126356a(dataInsertRequest.f32212a.mo18901a().f32064a);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bpgd bpgd = (bpgd) da2.f164949b;
                bpgd.f137477b = a2.f172235aH;
                bpgd.f137476a |= 1;
                bpgd bpgd2 = (bpgd) da2.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpgr bpgr2 = (bpgr) da.f164949b;
                bpgd2.getClass();
                bpgr2.f137538k = bpgd2;
                bpgr2.f137528a |= 512;
                try {
                    znj znj = zne.f55537g;
                    cadp a3 = ywe.m44938a(dataInsertRequest.f32212a);
                    boolean z = dataInsertRequest.f32214c;
                    znj.mo31272a(str4, a3);
                    znj.m45804a(a3);
                    boolean z2 = !z;
                    bzzy bzzy = (bzzy) bzzz.f172298f.mo74144da();
                    if (bzzy.f164950c) {
                        bzzy.mo74035c();
                        bzzy.f164950c = false;
                    }
                    bzzz bzzz = (bzzz) bzzy.f164949b;
                    str4.getClass();
                    bzzz.f172300a |= 1;
                    bzzz.f172301b = str4;
                    bzzz bzzz2 = (bzzz) bzzy.mo74062i();
                    if (znj.f55553c.mo30720a(str4)) {
                        caae caae2 = a3.f172713b;
                        if (caae2 == null) {
                            caae2 = caae.f172323i;
                        }
                        if ((caae2.f172325a & 64) != 0) {
                            znj.f55554d.mo31366a(a3, z2);
                            status = znj.f55552b;
                            if (status.mo17710c()) {
                                znq.m45815a(zne.f55428a, zne.f55429b);
                            }
                            int i2 = status.f30115i;
                            if (!da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bpgr bpgr3 = (bpgr) da.f164949b;
                            bpgr3.f137528a |= 2;
                            bpgr3.f137530c = i2;
                            zcl2.mo30933a(status);
                            zvm.m46571a(zne.f55428a, zne.f55429b);
                            a = ywb.m44930a(dataInsertRequest.f32212a.mo18901a());
                            if (!bzzn.f172079S.equals(a)) {
                                zvm.m46573b(zne.f55428a, zne.f55429b, cadu.GOAL_UPDATED);
                            } else if (bzzn.f172075O.equals(a)) {
                                zvm.m46573b(zne.f55428a, zne.f55429b, cadu.HEIGHT_UPDATED);
                            } else if (bzzn.f172106as.equals(a)) {
                                zvm.m46573b(zne.f55428a, zne.f55429b, cadu.WEIGHT_UPDATED);
                            }
                            ytp = zne.f55540j;
                            context = zne.f55428a;
                            str = zne.f55429b;
                            ytp.mo30769a(context, str, (bpgr) da.mo74062i());
                            return true;
                        }
                    }
                    a3 = yyl.m45029a(a3, bzzz2);
                    znj.f55554d.mo31366a(a3, z2);
                    status = znj.f55552b;
                    if (status.mo17710c()) {
                    }
                    int i22 = status.f30115i;
                    if (!da.f164950c) {
                    }
                    bpgr bpgr32 = (bpgr) da.f164949b;
                    bpgr32.f137528a |= 2;
                    bpgr32.f137530c = i22;
                    zcl2.mo30933a(status);
                    zvm.m46571a(zne.f55428a, zne.f55429b);
                    a = ywb.m44930a(dataInsertRequest.f32212a.mo18901a());
                    if (!bzzn.f172079S.equals(a)) {
                    }
                    ytp = zne.f55540j;
                    context = zne.f55428a;
                    str = zne.f55429b;
                } catch (IOException e) {
                    IOException iOException2 = e;
                    bnsl bnsl = (bnsl) zne.f55533d.mo68387b();
                    bnsl.mo68437a(iOException2);
                    bnsl.mo68405a("Error inserting data.");
                    zcl2.mo30933a(new Status(5008));
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpgr bpgr4 = (bpgr) da.f164949b;
                    bpgr4.f137528a |= 2;
                    bpgr4.f137530c = 5008;
                    ytp = zne.f55540j;
                    context = zne.f55428a;
                    str = zne.f55429b;
                } catch (ytw e2) {
                    ytw ytw2 = e2;
                    zcl2.mo30933a(new Status(ytw2.f54623a, ytw2.f54624b));
                    int i3 = ytw2.f54623a;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpgr bpgr5 = (bpgr) da.f164949b;
                    bpgr5.f137528a |= 2;
                    bpgr5.f137530c = i3;
                    ytp = zne.f55540j;
                    context = zne.f55428a;
                    str = zne.f55429b;
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    zne.f55540j.mo30769a(zne.f55428a, zne.f55429b, (bpgr) da.mo74062i());
                    throw th3;
                }
                ytp.mo30769a(context, str, (bpgr) da.mo74062i());
                return true;
            case 2:
                this.f55532a.mo31267a((DataDeleteRequest) obj, ytt2.f54617a);
                return true;
            case 3:
                srn srn = zne.f55533d;
                zcm zcm = ((GetSyncInfoRequest) obj).f32259a;
                SyncInfoResult syncInfoResult = new SyncInfoResult(Status.f30109c, -1, null);
                Parcel bj = zcm.mo8529bj();
                dcl.m8165a(bj, syncInfoResult);
                zcm.mo8530c(1, bj);
                return true;
            case 4:
                this.f55532a.mo31270a((ReadStatsRequest) obj);
                return true;
            case 5:
                this.f55532a.mo31269a((ReadRawRequest) obj);
                return true;
            case 6:
                zne zne2 = this.f55532a;
                DailyTotalRequest dailyTotalRequest = (DailyTotalRequest) obj;
                String str5 = ytt2.f54617a;
                zaw zaw = dailyTotalRequest.f32201c;
                bxvd da3 = bpge.f137478d.mo74144da();
                boolean z3 = dailyTotalRequest.f32200b;
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bpge bpge = (bpge) da3.f164949b;
                bpge.f137480a |= 2;
                bpge.f137482c = z3;
                DataType dataType = dailyTotalRequest.f32199a;
                if (dataType != null) {
                    bzzv a4 = bzzk.m126356a(dataType.f32064a);
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bpge bpge2 = (bpge) da3.f164949b;
                    bpge2.f137481b = a4.f172235aH;
                    bpge2.f137480a |= 1;
                }
                bxvd da4 = bpgr.f137526x.mo74144da();
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                bpgr bpgr6 = (bpgr) da4.f164949b;
                str5.getClass();
                bpgr6.f137528a |= 1;
                bpgr6.f137529b = str5;
                bpge bpge3 = (bpge) da3.mo74062i();
                bpge3.getClass();
                bpgr6.f137542o = bpge3;
                bpgr6.f137528a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                try {
                    zne2.mo31266a(dailyTotalRequest, str5, zaw);
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    bpgr bpgr7 = (bpgr) da4.f164949b;
                    bpgr7.f137528a |= 2;
                    bpgr7.f137530c = 0;
                    ytp2 = zne2.f55540j;
                    context2 = zne2.f55428a;
                    str2 = zne2.f55429b;
                } catch (IOException e3) {
                    IOException iOException3 = e3;
                    bnsl bnsl2 = (bnsl) zne.f55533d.mo68387b();
                    bnsl2.mo68437a(iOException3);
                    bnsl2.mo68405a("Error reading totals.");
                    zaw.mo30898a(DailyTotalResult.m23712a(new Status(5008), dataType));
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    bpgr bpgr8 = (bpgr) da4.f164949b;
                    bpgr8.f137528a |= 2;
                    bpgr8.f137530c = 5008;
                    ytp2 = zne2.f55540j;
                    context2 = zne2.f55428a;
                    str2 = zne2.f55429b;
                } catch (Throwable th4) {
                    Throwable th5 = th4;
                    zne2.f55540j.mo30769a(zne2.f55428a, zne2.f55429b, (bpgr) da4.mo74062i());
                    throw th5;
                }
                ytp2.mo30769a(context2, str2, (bpgr) da4.mo74062i());
                return true;
            case 7:
                srn srn2 = zne.f55533d;
                ((DataInsertRequest) obj).f32213b.mo30933a(Status.f30107a);
                return true;
            case 8:
                zne zne3 = this.f55532a;
                DataUpdateRequest dataUpdateRequest = (DataUpdateRequest) obj;
                String str6 = ytt2.f54617a;
                bxvd da5 = bpgr.f137526x.mo74144da();
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                bpgr bpgr9 = (bpgr) da5.f164949b;
                str6.getClass();
                bpgr9.f137528a |= 1;
                bpgr9.f137529b = str6;
                bxvd da6 = bpgh.f137489c.mo74144da();
                bzzv a5 = bzzk.m126356a(dataUpdateRequest.f32252c.mo18901a().f32064a);
                if (da6.f164950c) {
                    da6.mo74035c();
                    da6.f164950c = false;
                }
                bpgh bpgh = (bpgh) da6.f164949b;
                bpgh.f137492b = a5.f172235aH;
                bpgh.f137491a |= 1;
                bpgh bpgh2 = (bpgh) da6.mo74062i();
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                bpgr bpgr10 = (bpgr) da5.f164949b;
                bpgh2.getClass();
                bpgr10.f137540m = bpgh2;
                bpgr10.f137528a |= 2048;
                try {
                    znj znj2 = zne3.f55537g;
                    cadp a6 = ywe.m44938a(dataUpdateRequest.f32252c);
                    znj2.mo31272a(str6, a6);
                    long j = dataUpdateRequest.f32250a;
                    long j2 = dataUpdateRequest.f32251b;
                    Iterator it = dataUpdateRequest.f32252c.mo18904b().iterator();
                    while (it.hasNext()) {
                        DataPoint dataPoint = (DataPoint) it.next();
                        long b = dataPoint.mo18896b(TimeUnit.MILLISECONDS);
                        Iterator it2 = it;
                        long convert = TimeUnit.MILLISECONDS.convert(dataPoint.f31993b, TimeUnit.NANOSECONDS);
                        if (b > convert || ((b != 0 && b < j) || ((b != 0 && b > j2) || convert > j2 || convert < j))) {
                            ((bnsl) znj.f55551a.mo68388c()).mo68426a("Data Point's startTimeMillis %d, endTimeMillis %d should lie between timeRange provided in the request. StartTimeMillis %d, EndTimeMillis: %d", Long.valueOf(b), Long.valueOf(convert), Long.valueOf(j), Long.valueOf(j2));
                            throw new ytw(5019, null);
                        }
                        it = it2;
                    }
                    znj.m45804a(a6);
                    caae caae3 = a6.f172713b;
                    if (caae3 != null) {
                        caae = caae3;
                    } else {
                        caae = caae.f172323i;
                    }
                    bzzy bzzy2 = (bzzy) bzzz.f172298f.mo74144da();
                    if (bzzy2.f164950c) {
                        bzzy2.mo74035c();
                        bzzy2.f164950c = false;
                    }
                    bzzz bzzz3 = (bzzz) bzzy2.f164949b;
                    str6.getClass();
                    bzzz3.f172300a |= 1;
                    bzzz3.f172301b = str6;
                    znj2.f55554d.mo31368a(caae, TimeUnit.MILLISECONDS.toNanos(dataUpdateRequest.f32250a), TimeUnit.MILLISECONDS.toNanos(dataUpdateRequest.f32251b), yyl.m45029a(a6, (bzzz) bzzy2.mo74062i()));
                    status2 = znj.f55552b;
                    try {
                        zvm.m46571a(zne3.f55428a, zne3.f55429b);
                        ytp ytp4 = zne3.f55540j;
                        Context context4 = zne3.f55428a;
                        String str7 = zne3.f55429b;
                        int i4 = status2 != null ? status2.f30115i : 13;
                        if (da5.f164950c) {
                            da5.mo74035c();
                            da5.f164950c = false;
                        }
                        bpgr bpgr11 = (bpgr) da5.f164949b;
                        bpgr11.f137528a |= 2;
                        bpgr11.f137530c = i4;
                        ytp4.mo30769a(context4, str7, (bpgr) da5.mo74062i());
                    } catch (IOException e4) {
                        iOException = e4;
                        bnsl bnsl3 = (bnsl) zne.f55533d.mo68387b();
                        bnsl3.mo68437a(iOException);
                        bnsl3.mo68405a("Error updating data.");
                        Status status3 = new Status(5008);
                        ytp ytp5 = zne3.f55540j;
                        Context context5 = zne3.f55428a;
                        String str8 = zne3.f55429b;
                        int i5 = status3.f30115i;
                        if (da5.f164950c) {
                        }
                        bpgr bpgr12 = (bpgr) da5.f164949b;
                        bpgr12.f137528a |= 2;
                        bpgr12.f137530c = i5;
                        ytp5.mo30769a(context5, str8, (bpgr) da5.mo74062i());
                        status2 = status3;
                        zcl = dataUpdateRequest.f32253d;
                        if (zcl == null) {
                        }
                    } catch (ytw e5) {
                        ytw = e5;
                        try {
                            Status status4 = new Status(ytw.f54623a, ytw.f54624b);
                            ytp ytp6 = zne3.f55540j;
                            Context context6 = zne3.f55428a;
                            String str9 = zne3.f55429b;
                            int i6 = status4.f30115i;
                            if (da5.f164950c) {
                            }
                            bpgr bpgr13 = (bpgr) da5.f164949b;
                            bpgr13.f137528a |= 2;
                            bpgr13.f137530c = i6;
                            ytp6.mo30769a(context6, str9, (bpgr) da5.mo74062i());
                            status2 = status4;
                            zcl = dataUpdateRequest.f32253d;
                            if (zcl == null) {
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            ytp ytp7 = zne3.f55540j;
                            Context context7 = zne3.f55428a;
                            String str10 = zne3.f55429b;
                            if (status2 != null) {
                            }
                            if (da5.f164950c) {
                            }
                            bpgr bpgr14 = (bpgr) da5.f164949b;
                            bpgr14.f137528a |= 2;
                            bpgr14.f137530c = r9;
                            ytp7.mo30769a(context7, str10, (bpgr) da5.mo74062i());
                            throw th;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        ytp ytp72 = zne3.f55540j;
                        Context context72 = zne3.f55428a;
                        String str102 = zne3.f55429b;
                        if (status2 != null) {
                        }
                        if (da5.f164950c) {
                        }
                        bpgr bpgr142 = (bpgr) da5.f164949b;
                        bpgr142.f137528a |= 2;
                        bpgr142.f137530c = r9;
                        ytp72.mo30769a(context72, str102, (bpgr) da5.mo74062i());
                        throw th;
                    }
                } catch (IOException e6) {
                    iOException = e6;
                    status2 = null;
                    bnsl bnsl32 = (bnsl) zne.f55533d.mo68387b();
                    bnsl32.mo68437a(iOException);
                    bnsl32.mo68405a("Error updating data.");
                    Status status32 = new Status(5008);
                    ytp ytp52 = zne3.f55540j;
                    Context context52 = zne3.f55428a;
                    String str82 = zne3.f55429b;
                    int i52 = status32.f30115i;
                    if (da5.f164950c) {
                        da5.mo74035c();
                        da5.f164950c = false;
                    }
                    bpgr bpgr122 = (bpgr) da5.f164949b;
                    bpgr122.f137528a |= 2;
                    bpgr122.f137530c = i52;
                    ytp52.mo30769a(context52, str82, (bpgr) da5.mo74062i());
                    status2 = status32;
                    zcl = dataUpdateRequest.f32253d;
                    if (zcl == null) {
                    }
                } catch (ytw e7) {
                    ytw = e7;
                    status2 = null;
                    Status status42 = new Status(ytw.f54623a, ytw.f54624b);
                    ytp ytp62 = zne3.f55540j;
                    Context context62 = zne3.f55428a;
                    String str92 = zne3.f55429b;
                    int i62 = status42.f30115i;
                    if (da5.f164950c) {
                        da5.mo74035c();
                        da5.f164950c = false;
                    }
                    bpgr bpgr132 = (bpgr) da5.f164949b;
                    bpgr132.f137528a |= 2;
                    bpgr132.f137530c = i62;
                    ytp62.mo30769a(context62, str92, (bpgr) da5.mo74062i());
                    status2 = status42;
                    zcl = dataUpdateRequest.f32253d;
                    if (zcl == null) {
                    }
                } catch (Throwable th8) {
                    th = th8;
                    status2 = null;
                    ytp ytp722 = zne3.f55540j;
                    Context context722 = zne3.f55428a;
                    String str1022 = zne3.f55429b;
                    int i7 = status2 != null ? status2.f30115i : 13;
                    if (da5.f164950c) {
                        da5.mo74035c();
                        da5.f164950c = false;
                    }
                    bpgr bpgr1422 = (bpgr) da5.f164949b;
                    bpgr1422.f137528a |= 2;
                    bpgr1422.f137530c = i7;
                    ytp722.mo30769a(context722, str1022, (bpgr) da5.mo74062i());
                    throw th;
                }
                zcl = dataUpdateRequest.f32253d;
                if (zcl == null) {
                    return true;
                }
                zcl.mo30933a(status2);
                return true;
            case 9:
                zne zne4 = this.f55532a;
                DataUpdateListenerRegistrationRequest dataUpdateListenerRegistrationRequest = (DataUpdateListenerRegistrationRequest) obj;
                String str11 = ytt2.f54617a;
                zcl zcl3 = dataUpdateListenerRegistrationRequest.f32247d;
                bxvd da7 = bpgr.f137526x.mo74144da();
                if (da7.f164950c) {
                    da7.mo74035c();
                    da7.f164950c = false;
                }
                bpgr bpgr15 = (bpgr) da7.f164949b;
                str11.getClass();
                bpgr15.f137528a |= 1;
                bpgr15.f137529b = str11;
                bpgg bpgg = bpgg.f137487a;
                if (da7.f164950c) {
                    da7.mo74035c();
                    da7.f164950c = false;
                }
                bpgr bpgr16 = (bpgr) da7.f164949b;
                bpgg.getClass();
                bpgr16.f137541n = bpgg;
                bpgr16.f137528a |= 4096;
                try {
                    String str12 = zne4.f55429b;
                    znj znj3 = zne4.f55537g;
                    DataSource dataSource = dataUpdateListenerRegistrationRequest.f32244a;
                    if (dataSource == null) {
                        if (dataUpdateListenerRegistrationRequest.f32245b == null) {
                            throw new ytw(10, "Either dataSource or dataType should be set for registering listeners");
                        }
                    }
                    if (dataUpdateListenerRegistrationRequest.f32246c != null) {
                        if (dataSource != null) {
                            bngx = yvx.m44924a(bngx.m109356a(dataSource));
                        } else {
                            bngx = bngx.m109376e();
                        }
                        DataType dataType2 = dataUpdateListenerRegistrationRequest.f32245b;
                        if (dataType2 != null) {
                            bngx2 = ywb.m44928a((List) bngx.m109356a(dataType2));
                        } else {
                            bngx2 = bngx.m109376e();
                        }
                        List<caae> a7 = znj3.mo31271a(bngx, bngx2, str11);
                        HashSet hashSet = new HashSet();
                        for (caae caae4 : a7) {
                            caah caah = caae4.f172330f;
                            if (caah == null) {
                                caah = caah.f172333d;
                            }
                            if (!znj3.f55557g.contains(caah)) {
                                hashSet.add(caah);
                            }
                        }
                        if (hashSet.isEmpty()) {
                            znj3.mo31273a(str11, a7);
                            zsm zsm = zne4.f55538h;
                            DataSource dataSource2 = dataUpdateListenerRegistrationRequest.f32244a;
                            DataType dataType3 = dataUpdateListenerRegistrationRequest.f32245b;
                            PendingIntent pendingIntent = dataUpdateListenerRegistrationRequest.f32246c;
                            for (DataUpdateListener dataUpdateListener : zsm.mo31438a(str12, str11, pendingIntent)) {
                                zsm.f55816m.mo30752b(dataUpdateListener);
                            }
                            zsm.f55816m.mo30750a(new DataUpdateListener(str12, str11, dataSource2, dataType3, pendingIntent));
                            Status status5 = Status.f30107a;
                            if (zcl3 != null) {
                                zcl3.mo30933a(status5);
                            }
                            if (status5.mo17710c()) {
                                if (zne4.mo31245d()) {
                                    zne4.mo31246e();
                                }
                            }
                            int i8 = status5.f30115i;
                            if (da7.f164950c) {
                                da7.mo74035c();
                                da7.f164950c = false;
                            }
                            bpgr bpgr17 = (bpgr) da7.f164949b;
                            bpgr17.f137528a |= 2;
                            bpgr17.f137530c = i8;
                            ytp3 = zne4.f55540j;
                            context3 = zne4.f55428a;
                            str3 = zne4.f55429b;
                            ytp3.mo30769a(context3, str3, (bpgr) da7.mo74062i());
                            return true;
                        }
                        throw new ytw(5023, String.format("Following dataTypes are not allowed for registering listeners: %s", hashSet));
                    }
                    throw new ytw(10, "PendingIntent must be set for registering listeners");
                } catch (IOException | ytw e8) {
                    Throwable th9 = e8;
                    bnsl bnsl4 = (bnsl) zne.f55533d.mo68387b();
                    bnsl4.mo68437a(th9);
                    bnsl4.mo68405a("Error registering data update listener.");
                    Status status6 = new Status(5008);
                    if (zcl3 != null) {
                        zcl3.mo30933a(status6);
                    }
                    int i9 = status6.f30115i;
                    if (da7.f164950c) {
                        da7.mo74035c();
                        da7.f164950c = false;
                    }
                    bpgr bpgr18 = (bpgr) da7.f164949b;
                    bpgr18.f137528a |= 2;
                    bpgr18.f137530c = i9;
                    ytp3 = zne4.f55540j;
                    context3 = zne4.f55428a;
                    str3 = zne4.f55429b;
                } catch (Throwable th10) {
                    Throwable th11 = th10;
                    zne4.f55540j.mo30769a(zne4.f55428a, zne4.f55429b, (bpgr) da7.mo74062i());
                    throw th11;
                }
            case 10:
                zne zne5 = this.f55532a;
                DataUpdateListenerUnregistrationRequest dataUpdateListenerUnregistrationRequest = (DataUpdateListenerUnregistrationRequest) obj;
                String str13 = ytt2.f54617a;
                zcl zcl4 = dataUpdateListenerUnregistrationRequest.f32249b;
                bxvd da8 = bpgr.f137526x.mo74144da();
                if (da8.f164950c) {
                    da8.mo74035c();
                    da8.f164950c = false;
                }
                bpgr bpgr19 = (bpgr) da8.f164949b;
                str13.getClass();
                bpgr19.f137528a |= 1;
                bpgr19.f137529b = str13;
                bpgg bpgg2 = bpgg.f137487a;
                if (da8.f164950c) {
                    da8.mo74035c();
                    da8.f164950c = false;
                }
                bpgr bpgr20 = (bpgr) da8.f164949b;
                bpgg2.getClass();
                bpgr20.f137541n = bpgg2;
                bpgr20.f137528a |= 4096;
                zne5.f55538h.mo31439b(zne5.f55429b, str13, dataUpdateListenerUnregistrationRequest.f32248a);
                Status status7 = new Status(-5003);
                ytp ytp8 = zne5.f55540j;
                Context context8 = zne5.f55428a;
                String str14 = zne5.f55429b;
                int i10 = status7.f30115i;
                if (da8.f164950c) {
                    da8.mo74035c();
                    da8.f164950c = false;
                }
                bpgr bpgr21 = (bpgr) da8.f164949b;
                bpgr21.f137528a |= 2;
                bpgr21.f137530c = i10;
                ytp8.mo30769a(context8, str14, (bpgr) da8.mo74062i());
                if (zcl4 != null) {
                    zcl4.mo30933a(status7);
                }
                if (status7.mo17710c() && !zne5.mo31245d()) {
                    zne5.mo31247f();
                }
                return true;
            case 11:
                srn srn3 = zne.f55533d;
                zbd zbd = ((GetFileUriRequest) obj).f32257a;
                FileUriResult fileUriResult = new FileUriResult(null, Status.f30109c);
                Parcel bj2 = zbd.mo8529bj();
                dcl.m8165a(bj2, fileUriResult);
                zbd.mo8530c(1, bj2);
                return true;
            case 12:
                srn srn4 = zne.f55533d;
                zbc zbc = ((DebugInfoRequest) obj).f32254a;
                DebugInfoResult debugInfoResult = new DebugInfoResult(Status.f30109c, new Bundle());
                Parcel bj3 = zbc.mo8529bj();
                dcl.m8165a(bj3, debugInfoResult);
                zbc.mo8530c(1, bj3);
                return true;
            default:
                return false;
        }
    }
}
