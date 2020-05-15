package p000;

import android.app.PendingIntent;
import com.felicanetworks.mfc.MfiClientAccess;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;

/* renamed from: adbe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adbe extends Exception {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public final int f61236a;

    /* renamed from: b */
    public final bmxv f61237b;

    public adbe(String str, Throwable th, int i, bmxv bmxv) {
        super(str, th);
        this.f61236a = i;
        this.f61237b = bmxv;
    }

    /* renamed from: a */
    public static adbd m50105a() {
        return new adbd();
    }

    /* renamed from: b */
    public final Status mo33302b() {
        return new Status(this.f61236a, getMessage(), (PendingIntent) this.f61237b.mo66815c());
    }

    /* renamed from: c */
    public final bqhh mo33303c() {
        return new bqhh(this);
    }

    /* renamed from: a */
    public static adbe m50106a(int i) {
        return new adbe(null, null, i, bmvz.f131120a);
    }

    /* renamed from: a */
    public static adbe m50107a(gid gid) {
        int i;
        adbd a = m50105a();
        a.f61232a = "Authentication failure.";
        izj c = izj.m16369c(gid.getMessage());
        if (!izj.m16367a(c)) {
            i = izj.m16368b(c) ? 23001 : 23002;
        } else {
            i = 23000;
        }
        a.f61234c = i;
        a.f61233b = gid;
        return a.mo33301a();
    }

    /* renamed from: a */
    public static adbe m50108a(String str, int i) {
        return new adbe(str, null, i, bmvz.f131120a);
    }

    /* renamed from: a */
    public static adbe m50109a(Throwable th) {
        if (th instanceof adbe) {
            return (adbe) th;
        }
        if (th instanceof rjp) {
            if (th instanceof rki) {
                rki rki = (rki) th;
                return m50110a(new Status(rki.mo24655a(), rki.getMessage(), rki.mo24809c()));
            }
            rjp rjp = (rjp) th;
            return m50110a(new Status(rjp.mo24655a(), rjp.getMessage()));
        } else if ((th instanceof bqhh) || (th instanceof ExecutionException)) {
            return m50109a(th.getCause());
        } else {
            return new adbe(MfiClientAccess.EXC_UNKNOWN_ERROR, th, 8, bmvz.f131120a);
        }
    }

    /* renamed from: a */
    public static adbe m50110a(rkk rkk) {
        return new adbe(rkk.mo7183bo().f30116j, null, rkk.mo7183bo().f30115i, bmxv.m108567c(rkk.mo7183bo().f30117k));
    }
}
