package p000;

import android.content.Context;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;

/* renamed from: vyc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vyc {

    /* renamed from: e */
    private static WeakReference f50219e = null;

    /* renamed from: a */
    public final vya f50220a;

    /* renamed from: b */
    public final vyl f50221b;

    /* renamed from: c */
    public final vyz f50222c;

    /* renamed from: d */
    public final vwf f50223d;

    public vyc(vya vya, vyl vyl, vyz vyz, vwf vwf) {
        this.f50220a = vya;
        this.f50221b = vyl;
        this.f50222c = vyz;
        this.f50223d = vwf;
    }

    /* renamed from: a */
    public static synchronized vyc m41575a(Context context) {
        vyu vyu;
        synchronized (vyc.class) {
            if (f50219e != null) {
                if (f50219e.get() != null) {
                    vyc vyc = (vyc) f50219e.get();
                    return vyc;
                }
            }
            vwf a = vwf.m41483a(context);
            if (cdrn.f181605a.mo6606a().mo78216b()) {
                vyu = new vyu();
            } else {
                vyu = new vyg(context);
            }
            vyn vyn = new vyn(context);
            vyz vyz = new vyz(context, new vyv(context), vyu, a, new vxk());
            vyc vyc2 = new vyc(new vya(context, vyn), new vyl(context), vyz, a);
            f50219e = new WeakReference(vyc2);
            return vyc2;
        }
    }

    /* renamed from: a */
    public final vza mo28950a(String str, String str2, vyo vyo, abpc abpc, DroidGuardResultsRequest droidGuardResultsRequest) {
        vyj vyj;
        vym vym = new vym(str2);
        try {
            vyj = this.f50221b.mo28959a(vym);
        } catch (vxy e) {
            this.f50223d.mo28911a(e);
            vyj = null;
        }
        if (vyj == null) {
            vxz a = this.f50220a.mo28947a(str2);
            vvz vvz = ((vvt) a.f50215a.f164949b).f50054b;
            if (vvz == null) {
                vvz = vvz.f50100d;
            }
            bxvd bxvd = (bxvd) vvz.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) vvz);
            if (str != null) {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                vvz vvz2 = (vvz) bxvd.f164949b;
                str.getClass();
                vvz2.f50102a |= 2;
                vvz2.f50104c = str;
            }
            bxvd bxvd2 = a.f50215a;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            vvt vvt = (vvt) bxvd2.f164949b;
            vvz vvz3 = (vvz) bxvd.mo74062i();
            vvt vvt2 = vvt.f50051p;
            vvz3.getClass();
            vvt.f50054b = vvz3;
            vvt.f50053a |= 1;
            a.mo28946a(this.f50222c);
            vyi a2 = this.f50220a.mo28949a(a.mo28945a(), abpc);
            mo28952a(a2);
            vyj = a2.f50231b;
            try {
                this.f50221b.mo28960a(vym, vyj);
            } catch (vxy e2) {
                this.f50223d.mo28911a(e2);
            }
        }
        return this.f50222c.mo28988a(str2, vyj, vyo, droidGuardResultsRequest);
    }

    /* renamed from: a */
    public final vza mo28951a(String str, vyo vyo, DroidGuardResultsRequest droidGuardResultsRequest) {
        vyj a = this.f50221b.mo28959a(new vym("fast"));
        if (a != null) {
            return this.f50222c.mo28988a(str, a, vyo, droidGuardResultsRequest);
        }
        throw new vyb();
    }

    /* renamed from: a */
    public final void mo28952a(vyi vyi) {
        FileOutputStream fileOutputStream;
        byte[] bArr = vyi.f50232c;
        if (bArr != null) {
            vyz vyz = this.f50222c;
            vyy vyy = vyi.f50230a;
            File a = vyv.m41612a(vyz.f50263b);
            try {
                fileOutputStream = new FileOutputStream(a);
                fileOutputStream.write(bArr);
                fileOutputStream.close();
                vyz.f50264c.mo28982a(vyy, vyx.m41621a(a));
                a.delete();
                return;
            } catch (Exception e) {
                try {
                    throw new vzb("VM couldn't be stored", e);
                } catch (Throwable th) {
                    a.delete();
                    throw th;
                }
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
            }
        } else {
            return;
        }
        throw th;
    }
}
