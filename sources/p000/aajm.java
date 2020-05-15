package p000;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;

/* renamed from: aajm */
public final /* synthetic */ class aajm implements aajs {

    /* renamed from: a */
    private final aajt f28288a;

    /* renamed from: b */
    private final blmp f28289b;

    /* renamed from: c */
    private final long f28290c;

    public aajm(aajt aajt, blmp blmp, long j) {
        this.f28288a = aajt;
        this.f28289b = blmp;
        this.f28290c = j;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aajt.a(blmp, long, boolean):aucb
     arg types: [blmp, long, int]
     candidates:
      aajt.a(blmo, java.lang.String, java.lang.String):void
      aajt.a(android.content.Intent, blmp, aaob):aucb
      aajt.a(blmp, long, boolean):aucb */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01a3, code lost:
        if (p000.bmyx.m108640a(',').mo66925c((java.lang.CharSequence) p000.cebv.f182235a.mo78741b().mo78745d()).contains(java.lang.Integer.toString(r6.suppressedVisualEffects)) == false) goto L_0x01a5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02fc  */
    /* renamed from: a */
    public final aucb mo16903a() {
        NotificationManager notificationManager;
        aajt aajt = this.f28288a;
        blmp blmp = this.f28289b;
        long j = this.f28290c;
        aamh a = aamh.m21512a(blmp);
        boolean z = true;
        if (ceed.m136387b() || ceed.m136388c()) {
            aamf aamf = aajt.f28311n;
            int i = Build.VERSION.SDK_INT;
            try {
                PackageInfo b = a.mo17017b(aamf, 0);
                if (((AppOpsManager) aamf.mo17012b(a.f28458b).getSystemService(AppOpsManager.class)).checkOpNoThrow("android:run_any_in_background", b.applicationInfo.uid, b.applicationInfo.packageName) != 0) {
                    if (ceed.m136388c()) {
                        aaml aaml = aajt.f28308k;
                        String str = blmp.f126873h;
                        int i2 = blmp.f126882q;
                        bxvd da = aaqk.f28904k.mo74144da();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        aaqk aaqk = (aaqk) da.f164949b;
                        aaqk.f28906a |= 8;
                        aaqk.f28912g = i2;
                        aaqk.f28907b = 13;
                        aaqk.f28908c = true;
                        aaml.mo17034a(a, str, da);
                    }
                    if (ceed.m136387b()) {
                        aajt.f28308k.mo17033a(a, blmp.f126873h, blmp.f126882q, aaqi.APP_RESTRICTED);
                        return aucu.m76778a((Object) null);
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        if (cecz.f182285a.mo6606a().mo78846n()) {
            aajt.f28306i.mo17046a(aajt, aajt.f28307j, a);
        }
        aaod aaod = aajt.f28312o;
        int i3 = Build.VERSION.SDK_INT;
        if (cecz.f182285a.mo6606a().mo78847o()) {
            aaoc aaoc = new aaoc(blmp);
            if (aaoc.f28676b.mo69847b("gcm.n.e") && !aaoc.f28676b.mo69847b("gcm.n.dnp") && TextUtils.isEmpty(aaoc.f28676b.mo69845a("gcm.n.image"))) {
                aamh aamh = aaoc.f28675a.f28674c;
                Context b2 = aaod.f28677a.mo17012b(aamh.f28458b);
                Context a2 = aaod.f28677a.mo17010a(aamh.f28458b, aamh.f28457a);
                NotificationManager notificationManager2 = (NotificationManager) b2.getSystemService(NotificationManager.class);
                if (notificationManager2.canNotifyAsPackage(aamh.f28457a) && aaod.f28678b.mo16986a(aamh) <= 0) {
                    String a3 = aaoc.f28676b.mo69845a("gcm.n.android_channel_id");
                    if (!(TextUtils.isEmpty(a3) || (notificationManager = (NotificationManager) a2.getSystemService(NotificationManager.class)) == null || notificationManager.getNotificationChannel(a3) == null)) {
                        brsx a4 = brsy.m114542a(b2, aamh.f28457a, aaoc.f28676b, a3, a2.getResources(), a2.getPackageManager(), Bundle.EMPTY);
                        notificationManager2.notifyAsPackage(aamh.f28457a, a4.f143307b, 0, a4.f143306a.mo13629b());
                        return aucu.m76778a((Object) null);
                    }
                }
            }
        }
        aalx aalx = aajt.f28307j;
        int i4 = Build.VERSION.SDK_INT;
        if (blmp.f126882q >= 10) {
            if (!cebv.f182235a.mo6606a().mo78743b()) {
                Context context = aalx.f28422a;
                int i5 = Build.VERSION.SDK_INT;
                if (sex.m35104a(context).mo25451d() != 1) {
                    Context context2 = aalx.f28422a;
                    int i6 = Build.VERSION.SDK_INT;
                    sex a5 = sex.m35104a(context2);
                    int i7 = Build.VERSION.SDK_INT;
                    NotificationManager.Policy notificationPolicy = a5.f44099a.getNotificationPolicy();
                    if (notificationPolicy != null) {
                    }
                }
            }
            if (aalx.mo16987a() != null) {
                aamh a6 = aamh.m21512a(blmp);
                int a7 = aajg.m21332a(aakb.m21381a().f28351l.mo17012b(a6.f28458b), a6);
                bxvd da2 = aaqk.f28904k.mo74144da();
                String str2 = blmp.f126873h;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                aaqk aaqk2 = (aaqk) da2.f164949b;
                str2.getClass();
                int i8 = aaqk2.f28906a | 1;
                aaqk2.f28906a = i8;
                aaqk2.f28909d = str2;
                String str3 = a6.f28457a;
                str3.getClass();
                int i9 = i8 | 2;
                aaqk2.f28906a = i9;
                aaqk2.f28910e = str3;
                int i10 = a6.f28458b;
                int i11 = i9 | 4;
                aaqk2.f28906a = i11;
                aaqk2.f28911f = i10;
                int i12 = blmp.f126882q;
                int i13 = i11 | 8;
                aaqk2.f28906a = i13;
                aaqk2.f28912g = i12;
                aaqk2.f28906a = i13 | 16;
                aaqk2.f28913h = a7;
                Map.Entry b3 = aalx.mo16989b(a6);
                if (b3 == null) {
                    aalx.f28424c.mo16934a(da2, aaqd.APP_WAS_IN_HIGH_USAGE_BUCKET);
                    z = false;
                } else {
                    int intValue = ((Integer) b3.getValue()).intValue();
                    long currentTimeMillis = System.currentTimeMillis();
                    aamj b4 = aalx.f28423b.mo17027b(a6);
                    if (aalx.mo16988a(a6, currentTimeMillis)) {
                        aalx.f28423b.mo17026a(a6, new aamj(currentTimeMillis, 1));
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        aaqk aaqk3 = (aaqk) da2.f164949b;
                        aaqk3.f28906a |= 32;
                        aaqk3.f28914i = intValue;
                        aalx.f28424c.mo16934a(da2, aaqd.APP_WAS_WITHIN_QUOTA);
                        z = false;
                    } else if (intValue > aalx.f28423b.mo17027b(a6).f28462c) {
                        int i14 = intValue - b4.f28462c;
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        aaqk aaqk4 = (aaqk) da2.f164949b;
                        aaqk4.f28906a |= 32;
                        aaqk4.f28914i = i14;
                        aalx.f28424c.mo16934a(da2, aaqd.APP_WAS_WITHIN_QUOTA);
                        aalx.f28423b.mo17026a(a6, new aamj(b4.f28461b, b4.f28462c + 1));
                        z = false;
                    } else {
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        aaqk aaqk5 = (aaqk) da2.f164949b;
                        aaqk5.f28906a |= 32;
                        aaqk5.f28914i = 0;
                        aalx.f28424c.mo16934a(da2, aaqd.REDUCED_MESSAGE_PRIORITY);
                    }
                }
                if (z) {
                    bxvd bxvd = (bxvd) blmp.mo74142c(5);
                    bxvd.mo73625a((GeneratedMessageLite) blmp);
                    blmo blmo = (blmo) bxvd;
                    if (blmo.f164950c) {
                        blmo.mo74035c();
                        blmo.f164950c = false;
                    }
                    blmp blmp2 = (blmp) blmo.f164949b;
                    blmp blmp3 = blmp.f126864r;
                    blmp2.f126866a |= 134217728;
                    blmp2.f126882q = 17;
                    blmp = (blmp) blmo.mo74062i();
                }
                if ((z && blmp.f126882q >= 10) || !aajt.m21357d() || !aame.m21504b(aajt.f28298a) || !aajt.f28306i.mo17052a(blmp)) {
                    return aajt.mo16909a(blmp, j, false);
                }
                if (z) {
                    aajt.f28309l.mo24383c("USAGE_QUOTA_PRIORITY_REDUCED_AND_WRITTEN_TO_DOZE_QUEUE").mo24359a();
                }
                return aucu.m76778a((Object) null);
            }
        }
        z = false;
        if (z) {
        }
        if (z) {
        }
        if (z) {
        }
        return aucu.m76778a((Object) null);
    }
}
