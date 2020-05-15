package p000;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: ugo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ugo extends ugi {

    /* renamed from: f */
    private static final sbw f47556f = new sbw("MultipartUploader", "");

    /* renamed from: g */
    private String f47557g;

    private ugo(Context context, ugt ugt, ufb ufb, ugv ugv) {
        super(context, ugt, ufb, ugv);
    }

    /* renamed from: a */
    public static ugo m38354a(Context context, ugt ugt, ufb ufb, ugv ugv) {
        if (ugt.f47566e <= 4194304) {
            return new ugo(context, ugt, ufb, ugv);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo27326c() {
        return "multipart";
    }

    /* renamed from: e */
    public final bngx mo27329e() {
        String str = this.f47557g;
        return str != null ? bngx.m109356a(str) : bngx.m109376e();
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e6 A[Catch:{ all -> 0x00fe }] */
    /* renamed from: a */
    public final vkr mo27328a(ugs ugs, vfk vfk, ClientContext clientContext) {
        vpz vpz;
        this.f47530e = 3;
        ugs.mo27021a(this.f47527b.f47566e);
        ugm ugm = null;
        try {
            ugm a = ugl.m38339a(this.f47526a, mo27325b(), mo27327d(), clientContext, vfk);
            String str = this.f47527b.f47567f;
            if (str != null) {
                a.mo27336a("If-Match", str);
            }
            a.mo27341c(this.f47527b.f47563b);
            try {
                vpz = this.f47527b.mo27348a();
                try {
                    String b = this.f47527b.mo27350b();
                    a.mo27345f();
                    a.mo27339b(b);
                    srz.m36172a(vpz, a.mo27344e());
                    a.f47547a++;
                    vpz.mo28736a();
                    srz.m36171a((Closeable) vpz);
                } catch (Throwable th) {
                    th = th;
                    srz.m36171a((Closeable) vpz);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                vpz = null;
                srz.m36171a((Closeable) vpz);
                throw th;
            }
            try {
                int a2 = a.mo27334a();
                f47556f.mo25369a("HTTP upload status %d", Integer.valueOf(a2));
                this.f47557g = a.mo27335a("X-GUploader-UploadID");
                if (a2 != 201) {
                    if (a2 != 200) {
                        vpf a3 = vpg.m41004a(a.mo27340c());
                        vpg.m41005a(a2, a3);
                        if (a2 != this.f47527b.f47569h.intValue()) {
                            StringBuilder sb = new StringBuilder(37);
                            sb.append("Upload failed HTTP status ");
                            sb.append(a2);
                            throw new ugr(sb.toString(), new uaf(tyv.m37778a(a2, a3), a2, a3));
                        }
                        throw new ugq("Conflict uploading");
                    }
                }
                ugs.mo27020a();
                vkt vkt = new vkt(ugv.m38380a(a.mo27338b()), clientContext, a.mo27335a("X-Server-Object-Version"));
                srz.m36171a(a);
                return vkt;
            } catch (IOException e) {
                e = e;
                ugm = a;
                try {
                    if (e.getClass() != null) {
                    }
                    throw new ugr("Upload exception", e);
                } catch (Throwable th3) {
                    th = th3;
                    srz.m36171a(ugm);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                ugm = a;
                srz.m36171a(ugm);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            if (e.getClass() != null) {
                if (e.getClass().equals(vex.class)) {
                    throw ((vex) e);
                }
            }
            throw new ugr("Upload exception", e);
        } catch (Throwable th5) {
            th = th5;
            srz.m36171a(ugm);
            throw th;
        }
    }
}
