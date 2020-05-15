package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: hum */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hum extends aaab {

    /* renamed from: a */
    public static final sbw f20450a = new sbw("AuthEarlyUpdate", "[EURequestFeaturesOperation]");

    /* renamed from: b */
    private final int f20451b;

    /* renamed from: c */
    private final rnt f20452c;

    /* renamed from: d */
    private final Bundle f20453d;

    /* renamed from: e */
    private final hud f20454e;

    @Deprecated
    public hum(hud hud, int i) {
        super(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_FILTER, "AuthEarlyUpdate");
        sdo.m34959a(hud);
        this.f20454e = hud;
        this.f20451b = i;
        this.f20452c = null;
        this.f20453d = null;
    }

    /* renamed from: a */
    private static final boei m14881a(int i, int i2, long j, hul hul, int i3) {
        bxvd da = boei.f132795k.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boei boei = (boei) da.f164949b;
        boei.f132799c = i - 1;
        int i4 = boei.f132797a | 2;
        boei.f132797a = i4;
        int i5 = i4 | 1;
        boei.f132797a = i5;
        boei.f132798b = i2;
        int i6 = i5 | 16;
        boei.f132797a = i6;
        boei.f132802f = j;
        int i7 = hul.f20449b;
        int i8 = i7 - 1;
        if (i7 != 0) {
            boei.f132804h = i8;
            int i9 = i6 | 64;
            boei.f132797a = i9;
            long j2 = hul.f20448a;
            int i10 = i9 | 32;
            boei.f132797a = i10;
            boei.f132803g = (int) j2;
            boei.f132805i = i3 - 1;
            boei.f132797a = i10 | 128;
            return (boei) da.mo74062i();
        }
        throw null;
    }

    public hum(rnt rnt, int i, Bundle bundle) {
        super(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_FILTER, "AuthEarlyUpdate");
        sdo.m34959a(rnt);
        this.f20452c = rnt;
        this.f20451b = i;
        this.f20454e = null;
        this.f20453d = bundle;
    }

    /* renamed from: a */
    static hul m14882a(aney aney) {
        int i;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        aucb a = aney.mo41758a("com.google.android.gms.auth_api_early_update", 201515033, new String[]{"ANDROID_AUTH"}, null, "");
        a.mo50373a(huj.f20446a);
        a.mo50372a(huk.f20447a);
        try {
            if (ccdm.m129310d()) {
                aucu.m76783a(a, ccdm.f178789a.mo6606a().mo75803h(), TimeUnit.MILLISECONDS);
            } else {
                aucu.m76782a(a);
            }
            if (a.mo50384b()) {
                i = 2;
            } else {
                i = 6;
            }
        } catch (ExecutionException e) {
            f20450a.mo25372b("AuthEarlyUpdate", "Failed to sync Phenotype flags.");
            i = 4;
        } catch (TimeoutException e2) {
            f20450a.mo25372b("AuthEarlyUpdate", "Failed to sync Phenotype flags.");
            i = 3;
        } catch (InterruptedException e3) {
            f20450a.mo25372b("AuthEarlyUpdate", "Failed to sync Phenotype flags.");
            i = 5;
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        hul hul = new hul();
        hul.f20448a = elapsedRealtime2 - elapsedRealtime;
        hul.f20449b = i;
        return hul;
    }

    /* renamed from: a */
    private final void m14883a(Status status, boolean z) {
        hud hud = this.f20454e;
        if (hud != null) {
            hud.mo12725a(status, z);
        }
        rnt rnt = this.f20452c;
        if (rnt != null) {
            rnt.mo11797a(status);
        }
    }

    /* renamed from: a */
    private final void m14884a(hua hua, int i, int i2, long j, Context context, int i3, hul hul, int i4) {
        boei a = m14881a(i, i2, j, hul, i4);
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boei boei = (boei) bxvd.f164949b;
        boei boei2 = boei.f132795k;
        boei.f132806j = i3 - 1;
        boei.f132797a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        boei boei3 = (boei) bxvd.mo74062i();
        bxvd bxvd2 = (bxvd) boei3.mo74142c(5);
        bxvd2.mo73625a((GeneratedMessageLite) boei3);
        m14885a(hua, bxvd2, context);
    }

    /* renamed from: a */
    private final void m14885a(hua hua, bxvd bxvd, Context context) {
        hua.mo12717a(hua.mo12716a(2, this.f20451b, bxvd, context));
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0241  */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        String str;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        Context context2 = context;
        hua hua = new hua(context2);
        hug a = hug.m14870a(context);
        aney a2 = anef.m64089a(context);
        huh huh = new huh();
        hul a3 = m14882a(a2);
        int i5 = 2;
        int i6 = 0;
        if (a.mo12727b()) {
            f20450a.mo25371b("Sidecar was already updated before requestFeatures() call!");
            bxvd da = boei.f132795k.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boei boei = (boei) da.f164949b;
            boei.f132799c = 4;
            boei.f132797a |= 2;
            bxvd da2 = bofp.f132931c.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bofp bofp = (bofp) da2.f164949b;
            bofp.f132934b = 2;
            bofp.f132933a |= 1;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boei boei2 = (boei) da.f164949b;
            bofp bofp2 = (bofp) da2.mo74062i();
            bofp2.getClass();
            boei2.f132801e = bofp2;
            boei2.f132797a |= 8;
            int i7 = (int) a3.f20448a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boei boei3 = (boei) da.f164949b;
            int i8 = boei3.f132797a | 32;
            boei3.f132797a = i8;
            boei3.f132803g = i7;
            int i9 = a3.f20449b;
            int i10 = i9 - 1;
            if (i9 != 0) {
                boei3.f132804h = i10;
                boei3.f132797a = i8 | 64;
                boei boei4 = (boei) da.mo74062i();
                bxvd bxvd = (bxvd) boei4.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) boei4);
                m14885a(hua, bxvd, context2);
                m14883a(Status.f30107a, true);
                return;
            }
            throw null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        hug.f20436a.mo25371b("Performing requestFeature()");
        ModuleManager.FeatureRequest c = hug.m14871c();
        c.setUrgent(huh);
        if (ccdm.f178789a.mo6606a().mo75801f()) {
            c.requestFeatureAtVersion("auth_suw", 201516033);
        } else {
            c.requestFeatureAtLatestVersion("auth_suw");
        }
        if (a.f20438b.requestFeatures(c)) {
            long f = ccdm.m129312f();
            Bundle bundle = this.f20453d;
            if (bundle != null) {
                f = bundle.getLong("timeout_for_request_feature_in_ms", f);
            }
            boolean e = ccdm.f178789a.mo6606a().mo75800e();
            boolean d = ccdm.m129310d();
            long a4 = hug.m14869a(f);
            hul hul = a3;
            long min = Math.min(ccdm.f178789a.mo6606a().mo75797b(), a4);
            if (!e) {
                try {
                    huh.mo12729a(a4, TimeUnit.MILLISECONDS);
                    if (a.mo12727b()) {
                        str = "auth_suw";
                    } else {
                        str = "auth_suw";
                        i6 = 30501;
                    }
                } catch (InterruptedException e2) {
                    str = "auth_suw";
                    f20450a.mo25372b("AuthEarlyUpdate", "waitUntilSidecarUpdated() call was interrupted!");
                    z = true;
                    i6 = 30500;
                    if (!d) {
                    }
                    String str2 = "AuthEarlyUpdate";
                    int elapsedRealtime2 = (int) (SystemClock.elapsedRealtime() - elapsedRealtime);
                    if (i6 != 0) {
                    }
                }
            } else {
                str = "auth_suw";
                long j = a4;
                while (j > 0) {
                    try {
                        if (huh.mo12729a(Math.min(j, min), TimeUnit.MILLISECONDS) || a.mo12727b()) {
                            break;
                        }
                        j = a4 - (SystemClock.elapsedRealtime() - elapsedRealtime);
                    } catch (InterruptedException e3) {
                        f20450a.mo25372b("AuthEarlyUpdate", "waitUntilSidecarUpdated() call was interrupted!");
                        z = true;
                        i6 = 30500;
                        if (!d) {
                        }
                        String str22 = "AuthEarlyUpdate";
                        int elapsedRealtime22 = (int) (SystemClock.elapsedRealtime() - elapsedRealtime);
                        if (i6 != 0) {
                        }
                    }
                }
                i6 = !a.mo12727b() ? a4 - (SystemClock.elapsedRealtime() - elapsedRealtime) > 0 ? 30502 : 30501 : 0;
            }
            z = false;
            if (!d) {
                i5 = 1;
                i2 = 1;
                i = 1;
            } else if (!z) {
                long elapsedRealtime3 = a4 - (SystemClock.elapsedRealtime() - elapsedRealtime);
                int d2 = a.mo12728d();
                if (d2 == 2) {
                    i = d2;
                    i2 = 1;
                    i6 = 0;
                } else {
                    i = d2;
                    if (elapsedRealtime3 > 0) {
                        i5 = 4;
                        i2 = 4;
                        i6 = 30502;
                    } else {
                        i5 = 3;
                        i2 = 1;
                        i6 = 30501;
                    }
                }
            } else {
                i5 = 4;
                i2 = 5;
                i6 = 30500;
                i = 1;
            }
            String str222 = "AuthEarlyUpdate";
            int elapsedRealtime222 = (int) (SystemClock.elapsedRealtime() - elapsedRealtime);
            if (i6 != 0) {
                f20450a.mo25372b(str222, "Sidecar was not updated after requestFeatures() call! Need to wait longer or something is wrong!");
                if (d) {
                    i4 = i5;
                    i3 = elapsedRealtime222;
                } else if (a4 < ((long) elapsedRealtime222)) {
                    i3 = (int) a4;
                    i4 = 3;
                } else {
                    i3 = elapsedRealtime222;
                    i4 = 4;
                }
                huh huh2 = new huh();
                hug.f20436a.mo25371b("Performing unrequestFeature()");
                ModuleManager.FeatureRequest c2 = hug.m14871c();
                c2.unrequestFeature(str);
                c2.setUrgent(huh2);
                if (!a.f20438b.requestFeatures(c2)) {
                    f20450a.mo25372b(str222, "Sidecar unrequest feature failed!");
                }
                try {
                    huh2.mo12729a(ccdm.f178789a.mo6606a().mo75804i(), TimeUnit.MILLISECONDS);
                } catch (InterruptedException e4) {
                    f20450a.mo25372b(str222, "unrequestFeature() call was interrupted!");
                }
                m14884a(hua, i4, i3, currentTimeMillis, context, i2, hul, i);
                m14883a(new Status(i6), false);
                f20450a.mo25371b("Sidecar was not updated");
                return;
            }
            boei a5 = m14881a(2, elapsedRealtime222, currentTimeMillis, hul, i);
            bxvd bxvd2 = (bxvd) a5.mo74142c(5);
            bxvd2.mo73625a((GeneratedMessageLite) a5);
            m14885a(hua, bxvd2, context);
            f20450a.mo25371b("Sidecar were successfully updated after requestFeatures() call!");
            m14883a(Status.f30107a, true);
            return;
        }
        m14883a(new Status(30502), false);
        m14884a(hua, 4, (int) (SystemClock.elapsedRealtime() - elapsedRealtime), currentTimeMillis, context, 3, a3, 1);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        m14883a(status, false);
    }
}
