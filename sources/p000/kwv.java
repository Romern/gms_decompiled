package p000;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.autofill.data.Credential;
import com.google.android.gms.autofill.data.PaymentCard;
import com.google.android.gms.autofill.fill.FillField;
import com.google.android.gms.autofill.fill.FillForm;
import com.google.android.gms.autofill.metrics.MetricsContext;
import com.google.android.gms.autofill.metrics.MetricsContextImpl;
import java.nio.ByteBuffer;
import java.time.Clock;
import java.time.Duration;
import java.time.LocalTime;

/* renamed from: kwv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kwv {

    /* renamed from: a */
    private static final srn f25326a = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: a */
    public static int m18696a() {
        return (int) Duration.between(LocalTime.MIDNIGHT, LocalTime.now(Clock.systemUTC())).toMillis();
    }

    /* renamed from: a */
    private static int m18697a(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i != 3) {
            return i != 4 ? 2 : 6;
        }
        return 5;
    }

    /* renamed from: a */
    public static MetricsContextImpl m18698a(kzx kzx, lbh lbh) {
        return new MetricsContextImpl(m18696a(), kzx, lbh);
    }

    /* renamed from: a */
    public static kzx m18699a(String str, PackageManager packageManager) {
        bxvd da = kzx.f25494d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        str.getClass();
        ((kzx) da.f164949b).f25496a = str;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            int i = packageInfo.versionCode;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((kzx) da.f164949b).f25497b = i;
            if (packageInfo.signatures != null && packageInfo.signatures.length > 0) {
                int i2 = ByteBuffer.wrap(lqr.m19542a(packageInfo.signatures[0])).getInt();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((kzx) da.f164949b).f25498c = i2;
            }
        } catch (PackageManager.NameNotFoundException e) {
        } catch (RuntimeException e2) {
            bnsl bnsl = (bnsl) f25326a.mo68388c();
            bnsl.mo68437a(e2);
            bnsl.mo68405a("Failed to get package info.");
        }
        return (kzx) da.mo74062i();
    }

    /* renamed from: a */
    public static kzz m18700a(MetricsContext metricsContext) {
        bxvd da = kzz.f25505d.mo74144da();
        int a = metricsContext.mo7953a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((kzz) da.f164949b).f25507a = a;
        kzx b = metricsContext.mo7956b();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        b.getClass();
        ((kzz) da.f164949b).f25508b = b;
        lbh c = metricsContext.mo7957c();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        c.getClass();
        ((kzz) da.f164949b).f25509c = c;
        return (kzz) da.mo74062i();
    }

    /* renamed from: a */
    public static laz m18701a(Object obj) {
        if (obj instanceof Credential) {
            return laz.CREDENTIAL;
        }
        if ((obj instanceof kdb) || (obj instanceof PaymentCard)) {
            return laz.PAYMENT_CARD;
        }
        if (obj instanceof kcy) {
            return laz.EMAIL_ADDRESS;
        }
        if (obj instanceof kdf) {
            return laz.PHONE_NUMBER;
        }
        if (obj instanceof kdg) {
            return laz.POSTAL_ADDRESS;
        }
        if (obj instanceof kde) {
            kde kde = (kde) obj;
            if (!kde.f23860b.isEmpty() || !kde.f23861c.isEmpty() || !kde.f23862d.isEmpty()) {
                return laz.PERSON_NAME;
            }
        }
        return laz.UNKNOWN_DATA_TYPE;
    }

    /* renamed from: a */
    public static lbd m18702a(FillField fillField) {
        bxvd da = lbd.f25694g.mo74144da();
        int a = m18697a(fillField.f11632b);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((lbd) da.f164949b).f25696a = lbb.m18870a(a);
        int i = fillField.f11635e;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        lbd lbd = (lbd) da.f164949b;
        lbd.f25700e = i;
        lbd.f25701f = fillField.f11636f.mo3214a();
        bmxv b = fillField.mo7944b();
        if (b.mo66813a()) {
            int c = ((kka) b.mo66814b()).mo14554a().mo68741c();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((lbd) da.f164949b).f25698c = c;
        }
        bnrd a2 = fillField.f11634d.iterator();
        while (a2.hasNext()) {
            da.mo74112u(((kpb) a2.next()).mo3214a());
        }
        return (lbd) da.mo74062i();
    }

    /* renamed from: a */
    public static lbf m18703a(FillForm fillForm) {
        bxvd da = lbf.f25715f.mo74144da();
        String str = fillForm.f11643c.f23841b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        lbf lbf = (lbf) da.f164949b;
        str.getClass();
        lbf.f25718b = str;
        lbf.f25719c = fillForm.f11645e;
        bnre i = fillForm.f11641a.listIterator();
        while (i.hasNext()) {
            da.mo74044d(m18702a((FillField) i.next()));
        }
        return (lbf) da.mo74062i();
    }

    /* renamed from: a */
    public static lbf m18704a(kjp kjp) {
        bxvd da = lbf.f25715f.mo74144da();
        String str = kjp.f24264a.f23841b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        lbf lbf = (lbf) da.f164949b;
        str.getClass();
        lbf.f25718b = str;
        lbf.f25719c = kjp.f24269f;
        bmxv bmxv = kjp.f24268e;
        if (bmxv.mo66813a()) {
            long d = ((kka) bmxv.mo66814b()).mo14554a().mo68742d();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((lbf) da.f164949b).f25720d = d;
            long b = (long) ((kka) bmxv.mo66814b()).mo14555b();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((lbf) da.f164949b).f25721e = b;
        }
        bnre i = kjp.f24265b.listIterator();
        while (i.hasNext()) {
            kjl kjl = (kjl) i.next();
            bxvd da2 = lbd.f25694g.mo74144da();
            int a = m18697a(kjl.mo14516a().f24607f);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ((lbd) da2.f164949b).f25696a = lbb.m18870a(a);
            int d2 = kjl.mo14519d();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ((lbd) da2.f164949b).f25700e = d2;
            lbc c = kjl.mo14518c();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ((lbd) da2.f164949b).f25701f = c.mo3214a();
            bnrd a2 = kjl.mo14517b().iterator();
            while (a2.hasNext()) {
                da2.mo74112u(((kpb) a2.next()).mo3214a());
            }
            bnrd a3 = kjl.mo14520e().values().iterator();
            int i2 = -1;
            kka kka = null;
            while (a3.hasNext()) {
                kka kka2 = (kka) a3.next();
                int b2 = kka2.mo14555b();
                if (i2 < b2) {
                    kka = kka2;
                }
                if (i2 < b2) {
                    i2 = b2;
                }
            }
            bmxv c2 = bmxv.m108567c(kka);
            if (c2.mo66813a()) {
                kka kka3 = (kka) c2.mo66814b();
                int c3 = kka3.mo14554a().mo68741c();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ((lbd) da2.f164949b).f25698c = c3;
                int b3 = kka3.mo14555b();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ((lbd) da2.f164949b).f25699d = b3;
            }
            da.mo74044d((lbd) da2.mo74062i());
        }
        return (lbf) da.mo74062i();
    }

    /* renamed from: a */
    public static lbh m18705a(String str) {
        bxvd da = lbh.f25725b.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        str.getClass();
        ((lbh) da.f164949b).f25727a = str;
        return (lbh) da.mo74062i();
    }

    /* renamed from: a */
    public static boolean m18706a(MetricsContext metricsContext, String str) {
        return metricsContext != null && metricsContext.mo7957c().f25727a.equals(str);
    }
}
