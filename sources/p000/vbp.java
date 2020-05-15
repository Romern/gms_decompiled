package p000;

import android.os.SystemClock;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.internal.model.Change;
import com.google.android.gms.drive.internal.model.ChangeList;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: vbp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vbp implements Runnable {

    /* renamed from: a */
    final /* synthetic */ uzx f48935a;

    /* renamed from: b */
    final /* synthetic */ String f48936b;

    /* renamed from: c */
    final /* synthetic */ boolean f48937c;

    /* renamed from: d */
    final /* synthetic */ bqgy f48938d;

    /* renamed from: e */
    final /* synthetic */ bqgy f48939e;

    /* renamed from: f */
    final /* synthetic */ bqgy f48940f;

    /* renamed from: g */
    final /* synthetic */ vbq f48941g;

    /* renamed from: h */
    final /* synthetic */ vbo f48942h;

    public vbp(vbq vbq, uzx uzx, String str, boolean z, vbo vbo, bqgy bqgy, bqgy bqgy2, bqgy bqgy3) {
        this.f48941g = vbq;
        this.f48935a = uzx;
        this.f48936b = str;
        this.f48937c = z;
        this.f48942h = vbo;
        this.f48938d = bqgy;
        this.f48939e = bqgy2;
        this.f48940f = bqgy3;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: vkv.a(java.lang.Class, boolean):java.lang.String
     arg types: [java.lang.Class, int]
     candidates:
      vkv.a(java.lang.String, boolean):com.google.android.gms.drive.internal.model.FileLocalId
      vkv.a(com.google.android.gms.common.internal.ClientContext, com.google.android.gms.drive.internal.model.File):vkr
      vkv.a(com.google.android.gms.common.internal.ClientContext, int):vla
      vkv.a(int, com.google.android.gms.drive.internal.model.Permission):void
      vkv.a(java.lang.Class, boolean):java.lang.String */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02bf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02c4, code lost:
        r4 = "Error fetching page";
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0251, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0253, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0255, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x026b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x026d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0275, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0276, code lost:
        r17 = "Error fetching page";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02aa, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02bf A[ExcHandler: gid | InterruptedException | vbl (r0v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0004] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0251 A[Catch:{ gid -> 0x0255, InterruptedException -> 0x0253, vbl -> 0x0251, ExecutionException -> 0x02aa, VolleyError -> 0x024f }, ExcHandler: vbl (e vbl), PHI: r1 r17 10  PHI: (r1v8 vbp) = (r1v10 vbp), (r1v0 vbp), (r1v0 vbp), (r1v0 vbp), (r1v0 vbp) binds: [B:62:0x0211, B:22:0x00f0, B:25:0x0110, B:26:?, B:27:0x0112] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r17v5 java.lang.String) = (r17v7 java.lang.String), (r17v9 java.lang.String), (r17v9 java.lang.String), (r17v9 java.lang.String) binds: [B:62:0x0211, B:25:0x0110, B:26:?, B:27:0x0112] A[DONT_GENERATE, DONT_INLINE], Splitter:B:25:0x0110] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0253 A[Catch:{ gid -> 0x0255, InterruptedException -> 0x0253, vbl -> 0x0251, ExecutionException -> 0x02aa, VolleyError -> 0x024f }, ExcHandler: InterruptedException (e java.lang.InterruptedException), PHI: r1 r17 10  PHI: (r1v7 vbp) = (r1v10 vbp), (r1v0 vbp), (r1v0 vbp), (r1v0 vbp), (r1v0 vbp) binds: [B:62:0x0211, B:22:0x00f0, B:25:0x0110, B:26:?, B:27:0x0112] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r17v4 java.lang.String) = (r17v7 java.lang.String), (r17v9 java.lang.String), (r17v9 java.lang.String), (r17v9 java.lang.String) binds: [B:62:0x0211, B:25:0x0110, B:26:?, B:27:0x0112] A[DONT_GENERATE, DONT_INLINE], Splitter:B:25:0x0110] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0255 A[Catch:{ gid -> 0x0255, InterruptedException -> 0x0253, vbl -> 0x0251, ExecutionException -> 0x02aa, VolleyError -> 0x024f }, ExcHandler: gid (e gid), PHI: r1 r17 10  PHI: (r1v6 vbp) = (r1v10 vbp), (r1v0 vbp), (r1v0 vbp), (r1v0 vbp), (r1v0 vbp) binds: [B:62:0x0211, B:22:0x00f0, B:25:0x0110, B:26:?, B:27:0x0112] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r17v3 java.lang.String) = (r17v7 java.lang.String), (r17v9 java.lang.String), (r17v9 java.lang.String), (r17v9 java.lang.String) binds: [B:62:0x0211, B:25:0x0110, B:26:?, B:27:0x0112] A[DONT_GENERATE, DONT_INLINE], Splitter:B:25:0x0110] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02aa A[ExcHandler: ExecutionException (e java.util.concurrent.ExecutionException), PHI: r1 10  PHI: (r1v3 vbp) = (r1v0 vbp), (r1v10 vbp), (r1v0 vbp), (r1v0 vbp), (r1v0 vbp), (r1v0 vbp) binds: [B:1:0x0004, B:62:0x0211, B:22:0x00f0, B:25:0x0110, B:26:?, B:27:0x0112] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x0004] */
    public final void run() {
        String str;
        vkw vkw;
        String str2;
        Object obj;
        String str3;
        vbp vbp = this;
        try {
            uzz uzz = uzz.CHANGELOG;
            int ordinal = vbp.f48935a.f48787c.ordinal();
            if (ordinal == 0) {
                uzv uzv = (uzv) vbp.f48935a;
                vbq vbq = vbp.f48941g;
                vkv vkv = vbq.f48944b;
                ClientContext clientContext = vbq.f48946d;
                Set set = uzv.f48785b;
                String str4 = vbp.f48936b;
                long j = uzv.f48784a;
                boolean z = vbp.f48937c;
                vbo vbo = vbp.f48942h;
                vks vks = vbq.f48950h;
                sdo.m34959a(vbo);
                sdo.m34970a(vkv.m40744a(clientContext));
                vla a = vkv.mo28605a(clientContext, 2826);
                shc shc = new shc();
                shc.mo25530a(vkv.m40740a(ChangeList.class, true));
                Boolean bool = vks.f49403e;
                String a2 = vkv.mo28598a(set);
                str = "Error fetching page";
                Boolean bool2 = vks.f49402d;
                try {
                    Boolean bool3 = vks.f49401c;
                    String a3 = vks.mo28592a();
                    if (((Boolean) twy.f46864av.mo58455c()).booleanValue()) {
                        str2 = DriveSpace.f30738e;
                    } else {
                        str2 = null;
                    }
                    Long valueOf = Long.valueOf(j);
                    Integer num = vks.f49400b;
                    vbo vbo2 = vbo;
                    StringBuilder sb = new StringBuilder("changes");
                    shc.mo25531a(sb);
                    shd.m35269a(sb, "allProperties", String.valueOf((Object) true));
                    if (bool != null) {
                        shd.m35269a(sb, "errorRecovery", String.valueOf(bool));
                    }
                    if (a2 != null) {
                        shd.m35269a(sb, "fileScopeAppIds", shd.m35267a(a2));
                    }
                    shd.m35269a(sb, "includeDeleted", String.valueOf((Object) true));
                    shd.m35269a(sb, "includeSubscribed", String.valueOf((Object) true));
                    shd.m35269a(sb, "maxResults", String.valueOf((Object) 100));
                    if (bool2 != null) {
                        shd.m35269a(sb, "mutationPrecondition", String.valueOf(bool2));
                    }
                    if (bool3 != null) {
                        shd.m35269a(sb, "openDrive", String.valueOf(bool3));
                    }
                    if (str4 != null) {
                        shd.m35269a(sb, "pageToken", shd.m35267a(str4));
                    }
                    if (a3 != null) {
                        shd.m35269a(sb, "reason", shd.m35267a(a3));
                    }
                    if (str2 != null) {
                        shd.m35269a(sb, "spaces", shd.m35267a(str2));
                    }
                    shd.m35269a(sb, "startChangeId", String.valueOf(valueOf));
                    if (num != null) {
                        shd.m35269a(sb, "syncType", String.valueOf(num));
                    }
                    ChangeList changeList = (ChangeList) a.mo28608a(clientContext, sb.toString(), ChangeList.class, z, vbo2);
                    ArrayList arrayList = new ArrayList();
                    for (Change change : changeList.f30954b) {
                        if (change.f30949b) {
                            obj = new vky(change.f30951d);
                        } else {
                            obj = new vkt(change.f30950c, clientContext, null);
                        }
                        arrayList.add(obj);
                    }
                    vkw = new vkw(arrayList, changeList.f30956d, Long.valueOf(changeList.f30955c));
                } catch (VolleyError e) {
                    e = e;
                    VolleyError volleyError = e;
                    vpg.m41006a(volleyError);
                    throw volleyError;
                } catch (gid e2) {
                    e = e2;
                    vbp = this;
                    Throwable th = e;
                    String str5 = str;
                    vbq.f48943a.mo25376c(str5);
                    vbp.f48940f.mo69136a(th);
                    vbp.f48939e.mo69136a(th);
                    return;
                } catch (InterruptedException e3) {
                    e = e3;
                    vbp = this;
                    Throwable th2 = e;
                    String str52 = str;
                    vbq.f48943a.mo25376c(str52);
                    vbp.f48940f.mo69136a(th2);
                    vbp.f48939e.mo69136a(th2);
                    return;
                } catch (vbl e4) {
                    e = e4;
                    vbp = this;
                    Throwable th22 = e;
                    String str522 = str;
                    vbq.f48943a.mo25376c(str522);
                    vbp.f48940f.mo69136a(th22);
                    vbp.f48939e.mo69136a(th22);
                    return;
                } catch (ExecutionException e5) {
                    e = e5;
                    vbp = this;
                    vbp.f48940f.mo69136a(e.getCause());
                    vbp.f48939e.mo69136a(e.getCause());
                    return;
                }
            } else if (ordinal == 1) {
                vbq vbq2 = vbp.f48941g;
                vkv vkv2 = vbq2.f48944b;
                ClientContext clientContext2 = vbq2.f48946d;
                String str6 = vbp.f48936b;
                boolean z2 = ((uzw) vbp.f48935a).f48786a;
                boolean z3 = vbp.f48937c;
                vbo vbo3 = vbp.f48942h;
                vks vks2 = vbq2.f48950h;
                if (z2) {
                    str3 = vkv.f49413b;
                } else {
                    str3 = vkv.f49414c;
                }
                vkw = vkv2.mo28603a(clientContext2, null, str6, str3, DriveSpace.f30734a.f30740f, null, z3, vbo3, vks2, 2823);
                str = "Error fetching page";
            } else if (ordinal == 2) {
                vab vab = (vab) vbp.f48935a;
                vbq vbq3 = vbp.f48941g;
                vkw = vbq3.f48944b.mo28604a(vbq3.f48946d, vbq3.f48947e, vbp.f48936b, vab.f48799a, vab.f48800b, vab.f48801d, vbp.f48937c, vbp.f48942h, vbq3.f48950h);
                str = "Error fetching page";
            } else if (ordinal == 3) {
                vbq vbq4 = vbp.f48941g;
                vkw = vbq4.f48944b.mo28604a(vbq4.f48946d, ((uzu) vbp.f48935a).f48783a, vbp.f48936b, null, DriveSpace.f30735b.f30740f, null, vbp.f48937c, vbp.f48942h, vbp.f48941g.f48950h);
                str = "Error fetching page";
            } else if (ordinal == 4) {
                vbq vbq5 = vbp.f48941g;
                vkw = vbq5.f48944b.mo28603a(vbq5.f48946d, null, vbp.f48936b, null, DriveSpace.f30736c.f30740f, null, vbp.f48937c, vbp.f48942h, vbq5.f48950h, 2824);
                str = "Error fetching page";
            } else {
                vbq.f48943a.mo25374b("ResultsPageProducer", "Unexpected feed type: %s", vbp.f48935a.f48787c);
                throw new vbl(vbp.f48941g.f48948f);
            }
            vbp = this;
            vbp.f48938d.get();
            vbq vbq6 = vbp.f48941g;
            vbq6.f48952j += vkw.f49421a.size();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            BlockingQueue blockingQueue = vbq6.f48945c;
            int i = vbq6.f48949g;
            sdo.m34959a(vkw);
            blockingQueue.offer(new vbr(i, vkw, null, null), Long.MAX_VALUE, TimeUnit.SECONDS);
            vbq6.f48951i += SystemClock.elapsedRealtime() - elapsedRealtime;
            vbp.f48939e.mo69138b((Object) null);
        } catch (gid e6) {
        } catch (InterruptedException e7) {
        } catch (vbl e8) {
        } catch (ExecutionException e9) {
        } catch (VolleyError e10) {
            e = e10;
            VolleyError volleyError2 = e;
            vbq.f48943a.mo25376c(str);
            NetworkResponse networkResponse = volleyError2.networkResponse;
            if (networkResponse != null) {
                vbl vbl = new vbl(vbp.f48941g.f48948f);
                vbp.f48940f.mo69136a((Throwable) vbl);
                vbp.f48939e.mo69136a((Throwable) vbl);
                return;
            }
            vbp.f48940f.mo69136a((Throwable) volleyError2);
            vbp.f48939e.mo69136a((Throwable) volleyError2);
        }
    }
}
