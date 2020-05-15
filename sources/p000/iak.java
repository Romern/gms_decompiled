package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.cast.JGCastService;
import com.google.android.gms.common.api.Status;

/* renamed from: iak */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iak extends hyt implements aaai {

    /* renamed from: a */
    private static final sek f20634a = new sek("SmsRetrieverStub");

    /* renamed from: b */
    private static final ibh f20635b = new ibh();

    /* renamed from: c */
    private final Context f20636c;

    /* renamed from: d */
    private final String f20637d;

    public iak(Context context, String str) {
        iax iax = hzi.f20589a;
        this.f20636c = context.getApplicationContext();
        this.f20637d = str;
    }

    /* renamed from: a */
    private static final void m15132a(hyy hyy, int i, String str) {
        try {
            hyy.mo12826a(new Status(i, str));
        } catch (RemoteException e) {
            f20634a.mo25417e("RemoteException", e, new Object[0]);
        }
    }

    /* renamed from: b */
    public final void mo12822b(rnt rnt) {
        f20634a.mo25412b("startSmsCodeBrowser", new Object[0]);
        try {
            if (!ccef.f178828a.mo6606a().mo75828a()) {
                rnt.mo11797a(new Status(17, "Feature is not enabled."));
            } else {
                rnt.mo11797a(Status.f30107a);
            }
        } catch (RemoteException e) {
            f20634a.mo25417e("RemoteException", e, new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12861a(Context context, int i) {
        f20635b.mo12887a(context, ibh.m15172a(this.f20637d, i));
    }

    /* renamed from: a */
    public final void mo12817a(hyo hyo) {
        f20634a.mo25412b("checkAutofillPermissionState", new Object[0]);
        try {
            if (!cceb.m129359c()) {
                hyo.mo12815a(new Status(17, "Feature is not enabled."), 0);
                return;
            }
            int i = Build.VERSION.SDK_INT;
            if (cceb.m129358b()) {
                if (ibb.m15154a(this.f20637d)) {
                    f20634a.mo25412b("checkAutofillPermissionState: caller is an eligible 1P app.", new Object[0]);
                    f20635b.mo12886a(this.f20636c, ibh.m15186e(this.f20637d, 0));
                    hyo.mo12815a(Status.f30107a, new iac(this.f20636c).mo12853a());
                }
            }
            if (!ibb.m15153a(this.f20636c, this.f20637d)) {
                f20635b.mo12886a(this.f20636c, ibh.m15186e(this.f20637d, 10));
                hyo.mo12815a(new Status(36501), 0);
                return;
            }
            f20635b.mo12886a(this.f20636c, ibh.m15186e(this.f20637d, 0));
            hyo.mo12815a(Status.f30107a, new iac(this.f20636c).mo12853a());
        } catch (RemoteException e) {
            f20634a.mo25417e("RemoteException", e, new Object[0]);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009d, code lost:
        p000.iak.f20634a.mo25417e("RemoteException", r0, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00bf, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c7, code lost:
        p000.iak.f20634a.mo25417e("AppCodeCollisionException", r0, new java.lang.Object[0]);
        r0 = r0.getMessage();
        mo12861a(r1.f20636c, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00db, code lost:
        if (r0 != null) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00de, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00df, code lost:
        m15132a(r2, 13, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e6, code lost:
        p000.iak.f20634a.mo25417e("NameNotFoundException", r0, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f0, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009c A[ExcHandler: RemoteException (r0v10 'e' android.os.RemoteException A[CUSTOM_DECLARE]), Splitter:B:1:0x001d] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c6 A[ExcHandler: iaw (r0v3 'e' iaw A[CUSTOM_DECLARE]), Splitter:B:1:0x001d] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e5 A[ExcHandler: NameNotFoundException (r0v2 'e' android.content.pm.PackageManager$NameNotFoundException A[CUSTOM_DECLARE]), Splitter:B:1:0x001d] */
    /* renamed from: a */
    public final void mo12818a(hyy hyy) {
        hyy hyy2 = hyy;
        String str = "";
        int i = 0;
        f20634a.mo25412b("startSmsRetriever", new Object[0]);
        f20635b.mo12887a(this.f20636c, ibh.m15171a(this.f20637d));
        try {
            String str2 = this.f20637d;
            long currentTimeMillis = System.currentTimeMillis();
            Context context = this.f20636c;
            String str3 = this.f20637d;
            iax iax = hzi.f20589a;
            PackageManager packageManager = context.getPackageManager();
            svq b = svr.m36484b(context);
            String a = iax.mo12870a(b, str3);
            iax.f20660a.mo25412b("appCode: %s", a);
            for (PackageInfo packageInfo : packageManager.getInstalledPackages(128)) {
                String str4 = packageInfo.packageName;
                if (!str3.equals(str4)) {
                    if (a.equals(iax.mo12870a(b, str4))) {
                        iax.f20660a.mo25412b("Found appCode collision with other package name: %s", str4);
                        throw new iaw("AppCode collides with other installed app.");
                    }
                }
            }
            hzw.m15101a(this.f20636c, new hzz(str2, currentTimeMillis, new hyl(bnic.m109489a(a))));
            hyy2.mo12826a(Status.f30107a);
        } catch (PackageManager.NameNotFoundException e) {
        } catch (iaw e2) {
        } catch (iay e3) {
            e = e3;
            i = 0;
            f20634a.mo25417e("AppSecurityException", e, new Object[i]);
            String message = e.getMessage();
            mo12861a(this.f20636c, 2);
            if (message != null) {
            }
            m15132a(hyy2, 10, str);
        } catch (RemoteException e4) {
        }
    }

    /* renamed from: a */
    public final void mo12819a(String str, hyr hyr) {
        f20634a.mo25412b("checkOngoingSmsRequest", new Object[0]);
        try {
            if (!cceb.m129359c()) {
                hyr.mo12816a(new Status(17, "Feature is not enabled."), false);
                return;
            }
            int i = Build.VERSION.SDK_INT;
            if (cceb.m129358b()) {
                if (ibb.m15154a(this.f20637d)) {
                    f20634a.mo25412b("checkOngoingSmsRequest: caller is an eligible 1P app.", new Object[0]);
                    f20635b.mo12886a(this.f20636c, ibh.m15189f(this.f20637d, 0));
                    hyr.mo12816a(Status.f30107a, hzw.m15104b(this.f20636c, str));
                }
            }
            if (!ibb.m15153a(this.f20636c, this.f20637d)) {
                f20635b.mo12886a(this.f20636c, ibh.m15189f(this.f20637d, 10));
                hyr.mo12816a(new Status(36501), false);
                return;
            }
            f20635b.mo12886a(this.f20636c, ibh.m15189f(this.f20637d, 0));
            hyr.mo12816a(Status.f30107a, hzw.m15104b(this.f20636c, str));
        } catch (RemoteException e) {
            f20634a.mo25417e("RemoteException", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo12820a(String str, hyy hyy) {
        f20634a.mo25412b("startWithConsentPrompt", new Object[0]);
        hzw.m15103a(this.f20636c, this.f20637d, str);
        try {
            hyy.mo12826a(Status.f30107a);
        } catch (RemoteException e) {
            f20634a.mo25417e("RemoteException", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo12821a(rnt rnt) {
        f20634a.mo25412b("startSmsCodeAutofill", new Object[0]);
        try {
            if (cceb.m129359c()) {
                int i = Build.VERSION.SDK_INT;
                if (!ibb.m15153a(this.f20636c, this.f20637d)) {
                    f20635b.mo12886a(this.f20636c, ibh.m15180c(this.f20637d, 10));
                    rnt.mo11797a(new Status(36501));
                    return;
                }
                int a = new iac(this.f20636c).mo12853a();
                if (a == 0) {
                    if (!cceb.m129361e()) {
                        f20635b.mo12886a(this.f20636c, ibh.m15180c(this.f20637d, 0));
                    } else {
                        f20635b.mo12886a(this.f20636c, ibh.m15180c(this.f20637d, 14));
                    }
                    rnt.mo11797a(new Status(6, null, spn.m35844a(this.f20636c, spn.m35845a(new Intent("com.google.android.gms.auth.api.phone.ACTION_AUTOFILL_CONSENT")), (int) JGCastService.FLAG_PRIVATE_DISPLAY)));
                } else if (a != 1) {
                    f20635b.mo12886a(this.f20636c, ibh.m15180c(this.f20637d, 11));
                    rnt.mo11797a(new Status(36502));
                } else {
                    f20635b.mo12886a(this.f20636c, ibh.m15180c(this.f20637d, 0));
                    hzw.m15102a(this.f20636c, this.f20637d);
                    rnt.mo11797a(Status.f30107a);
                }
            } else {
                rnt.mo11797a(new Status(17, "Feature is not enabled."));
            }
        } catch (RemoteException e) {
            f20634a.mo25417e("RemoteException", e, new Object[0]);
        }
    }
}
