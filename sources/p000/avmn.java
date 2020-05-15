package p000;

import android.content.Context;
import android.os.Build;
import android.os.SystemProperties;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.update.control.ChimeraGcmTaskService;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: avmn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avmn {

    /* renamed from: a */
    public static final avti f93395a = new avtk("control.config_update.last_config_update_timestamp", 0L);

    /* renamed from: b */
    public static final avsz f93396b = new avmm();

    /* renamed from: e */
    private static final Logger f93397e = avpq.m79017d("ConfigUpdateControl");

    /* renamed from: f */
    private static final avtj f93398f = new avtj("control.config_update.last_config_request_properties", cafi.f172907e);

    /* renamed from: g */
    private static final avtj f93399g = new avtj("control.config_update.last_get_config_request", cbbf.f176550e);

    /* renamed from: h */
    private static final avti f93400h = new avtk("control.config_update.config_update_check_period", -1L);

    /* renamed from: i */
    private static final avti f93401i = new avtk("control.config_update.config_update_check_flex", -1L);

    /* renamed from: c */
    public final bqgj f93402c = snp.m35702a(9);

    /* renamed from: d */
    public final avtn f93403d;

    /* renamed from: j */
    private final avms f93404j = ((avms) avms.f93422b.mo51589b());

    /* renamed from: k */
    private final cbbe f93405k;

    /* renamed from: l */
    private final String f93406l;

    /* renamed from: m */
    private final Context f93407m;

    public avmn(Context context) {
        bxvd da = cbbe.f176543f.mo74144da();
        String str = Build.DEVICE;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        str.getClass();
        ((cbbe) da.f164949b).f176545a = str;
        String str2 = Build.FINGERPRINT;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        str2.getClass();
        ((cbbe) da.f164949b).f176546b = str2;
        String str3 = Build.BOOTLOADER;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        str3.getClass();
        ((cbbe) da.f164949b).f176547c = str3;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(Build.TIME);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((cbbe) da.f164949b).f176549e = seconds;
        if (Build.getRadioVersion() != null) {
            String radioVersion = Build.getRadioVersion();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            radioVersion.getClass();
            ((cbbe) da.f164949b).f176548d = radioVersion;
        }
        this.f93405k = (cbbe) da.mo74062i();
        int i = Build.VERSION.SDK_INT;
        this.f93406l = Locale.getDefault().toLanguageTag();
        this.f93403d = (avtn) avtn.f93892a.mo51589b();
        this.f93407m = context;
    }

    /* renamed from: a */
    private static final cafj m78805a(String str) {
        bxvd da = cafj.f172913e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cafj cafj = (cafj) da.f164949b;
        str.getClass();
        cafj.f172915a |= 1;
        cafj.f172916b = str;
        bmxv c = bmxv.m108567c(bmxx.m108579c(SystemProperties.get(String.format("ro.%s.build.fingerprint", str))));
        bmxv bmxv = bmvz.f131120a;
        try {
            String str2 = SystemProperties.get(String.format("ro.%s.build.date.utc", str));
            if (!bmxx.m108577a(str2)) {
                bmxv = bmxv.m108566b(Long.valueOf(Long.parseLong(str2)));
            }
        } catch (NumberFormatException e) {
            bmxv = bmvz.f131120a;
        }
        if (c.mo66813a()) {
            String str3 = (String) c.mo66814b();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cafj cafj2 = (cafj) da.f164949b;
            str3.getClass();
            cafj2.f172915a |= 2;
            cafj2.f172917c = str3;
        }
        if (bmxv.mo66813a()) {
            long longValue = ((Long) bmxv.mo66814b()).longValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cafj cafj3 = (cafj) da.f164949b;
            cafj3.f172915a |= 4;
            cafj3.f172918d = longValue;
        }
        return (cafj) da.mo74062i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo51385b() {
        this.f93402c.execute(new avmk(this));
    }

    /* renamed from: c */
    public final void mo51386c() {
        if (cfsg.m142817d() != ((Long) this.f93403d.mo51607b(f93400h)).longValue() || cfsg.m142816c() != ((Long) this.f93403d.mo51607b(f93401i)).longValue()) {
            f93397e.mo25412b("Scheduling config update check task with %d seconds period and %d seconds flex.", Long.valueOf(cfsg.m142817d()), Long.valueOf(cfsg.m142816c()));
            Context context = this.f93407m;
            ChimeraGcmTaskService.f109491a.mo25414c("Scheduling task: %s.", "CheckConfigUpdate");
            aebl aebl = new aebl();
            aebl.f63097i = "com.google.android.gms.update.SystemUpdateGcmTaskService";
            aebl.f63099k = "CheckConfigUpdate";
            aebl.f63070a = cfsg.m142817d();
            aebl.f63071b = cfsg.m142816c();
            aebl.f63102n = true;
            aebl.mo34023a(2);
            aebl.mo34024a(0, cdny.m134338c() ? 1 : 0);
            aebl.mo34027b(1);
            aeat.m51532a(context).mo33984a(aebl.mo33974b());
            this.f93403d.mo51605a(f93400h.mo51602b(Long.valueOf(cfsg.m142817d())));
            this.f93403d.mo51605a(f93401i.mo51602b(Long.valueOf(cfsg.m142816c())));
        }
    }

    /* renamed from: d */
    public final chuv mo51387d() {
        chuv chuv;
        bxvd da = cbbf.f176550e.mo74144da();
        String a = cfsp.f185657a.mo6606a().mo82682a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((cbbf) da.f164949b).f176553b = a;
        String b = cfsp.f185657a.mo6606a().mo82683b();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbbf cbbf = (cbbf) da.f164949b;
        b.getClass();
        cbbf.f176552a = b;
        cbbe cbbe = this.f93405k;
        cbbe.getClass();
        cbbf.f176555d = cbbe;
        String str = this.f93406l;
        str.getClass();
        cbbf.f176554c = str;
        cbbf cbbf2 = (cbbf) da.mo74062i();
        avlp avlp = new avlp(this.f93407m, cfrx.f185535a.mo6606a().mo82587a(), (int) cfrx.f185535a.mo6606a().mo82588b());
        try {
            avlp.f93322a.mo25412b("Sent GetConfigRequest: %s.", cbbf2);
            avlo avlo = avlp.f93323b;
            ClientContext clientContext = avlp.f93324c;
            if (avlo.f93320b == null) {
                avlo.f93320b = chtv.m149566a(chtu.UNARY, "google.internal.android.ota.download.configdelivery.v1.ConfigDeliveryService/GetConfig", ciie.m150370a(cbbf.f176550e), ciie.m150370a(cbbg.f176556d));
            }
            cbbg cbbg = (cbbg) avlo.f93321a.mo25553a(avlo.f93320b, clientContext, cbbf2, 10000, TimeUnit.MILLISECONDS);
            cbbi cbbi = cbbg.f176558a;
            if (cbbi == null) {
                cbbi = cbbi.f176567e;
            }
            this.f93403d.mo51605a(avma.f93355a.f93338a.mo51602b(cbbi.f176569a));
            this.f93403d.mo51605a(avma.f93357c.f93338a.mo51602b(cbbi.f176570b));
            this.f93403d.mo51605a(avma.f93359e.f93338a.mo51602b(cbbi.f176572d));
            this.f93403d.mo51605a(avma.f93360f.f93338a.mo51602b(cbbi.f176571c));
            cbbh cbbh = cbbg.f176559b;
            if (cbbh == null) {
                cbbh = cbbh.f176561e;
            }
            this.f93403d.mo51605a(avma.f93358d.f93338a.mo51602b(cbbh.f176563a));
            this.f93403d.mo51605a(avma.f93363i.f93338a.mo51602b(cbbh.f176565c));
            this.f93403d.mo51605a(avlt.f93333f.f93338a.mo51602b(cbbh.f176566d));
            this.f93403d.mo51605a(avma.f93356b.f93338a.mo51602b(Long.valueOf(cbbh.f176564b)));
            cbbd cbbd = cbbg.f176560c;
            if (cbbd == null) {
                cbbd = cbbd.f176530l;
            }
            this.f93403d.mo51605a(avme.f93383e.f93338a.mo51602b(Long.valueOf((long) cbbd.f176532a)));
            avtn avtn = this.f93403d;
            avtc[] avtcArr = new avtc[1];
            avtcArr[0] = avma.f93361g.f93338a.mo51602b(!cbbd.f176533b ? "" : "yes");
            avtn.mo51605a(avtcArr);
            avtn avtn2 = this.f93403d;
            avtc[] avtcArr2 = new avtc[1];
            avti avti = avma.f93362h.f93338a;
            cbbd cbbd2 = cbbg.f176560c;
            if (cbbd2 == null) {
                cbbd2 = cbbd.f176530l;
            }
            avtcArr2[0] = avti.mo51602b(Boolean.valueOf(cbbd2.f176534c));
            avtn2.mo51605a(avtcArr2);
            avtn avtn3 = this.f93403d;
            avtc[] avtcArr3 = new avtc[1];
            avti avti2 = avlt.f93328a.f93338a;
            cbbd cbbd3 = cbbg.f176560c;
            if (cbbd3 == null) {
                cbbd3 = cbbd.f176530l;
            }
            avtcArr3[0] = avti2.mo51602b(Long.valueOf(cbbd3.f176535d));
            avtn3.mo51605a(avtcArr3);
            avtn avtn4 = this.f93403d;
            avtc[] avtcArr4 = new avtc[1];
            avti avti3 = avlt.f93329b.f93338a;
            cbbd cbbd4 = cbbg.f176560c;
            if (cbbd4 == null) {
                cbbd4 = cbbd.f176530l;
            }
            avtcArr4[0] = avti3.mo51602b(Long.valueOf(cbbd4.f176536e));
            avtn4.mo51605a(avtcArr4);
            avtn avtn5 = this.f93403d;
            avtc[] avtcArr5 = new avtc[1];
            avti avti4 = avlt.f93331d.f93338a;
            cbbd cbbd5 = cbbg.f176560c;
            if (cbbd5 == null) {
                cbbd5 = cbbd.f176530l;
            }
            avtcArr5[0] = avti4.mo51602b(Long.valueOf((long) cbbd5.f176537f));
            avtn5.mo51605a(avtcArr5);
            this.f93403d.mo51605a(avlt.f93330c.f93338a.mo51602b(cbbd.f176538g));
            this.f93403d.mo51605a(avlw.f93341b.f93338a.mo51602b(Long.valueOf((long) cbbd.f176539h)));
            this.f93403d.mo51605a(avlw.f93342c.f93338a.mo51602b(Long.valueOf((long) cbbd.f176540i)));
            this.f93403d.mo51605a(avlt.f93334g.f93338a.mo51602b(Long.valueOf((long) cbbd.f176541j)));
            this.f93403d.mo51605a(avlw.f93340a.f93338a.mo51602b(cbbd.f176542k));
            this.f93404j.mo51399a(10);
            chuv = chuv.m149607a(chus.OK);
            this.f93403d.mo51605a(f93395a.mo51602b(Long.valueOf(System.currentTimeMillis())));
            this.f93403d.mo51605a(f93399g.mo51602b(bmxv.m108566b(cbbf2)));
        } catch (chuw e) {
            f93397e.mo25417e("Status exception when retrieving config.", e, new Object[0]);
            chuv = e.f189236a;
            this.f93403d.mo51605a(f93399g.mo51602b(bmxv.m108566b(cbbf2)));
        } catch (gid e2) {
            f93397e.mo25417e("Auth exception when retrieving config.", e2, new Object[0]);
            chuv = chuv.m149607a(chus.UNAUTHENTICATED).mo85690b(bmxx.m108578b(e2.getMessage()));
            this.f93403d.mo51605a(f93399g.mo51602b(bmxv.m108566b(cbbf2)));
        } catch (Throwable th) {
            this.f93403d.mo51605a(f93399g.mo51602b(bmxv.m108566b(cbbf2)));
            avlp.mo51357a();
            throw th;
        }
        avlp.mo51357a();
        f93397e.mo25414c("Update config retrieval finished with status: %s.", chuv);
        return chuv;
    }

    /* renamed from: a */
    public final cafi mo51382a(boolean z) {
        bmxv bmxv = (bmxv) this.f93403d.mo51607b(f93399g);
        bmxv bmxv2 = (bmxv) this.f93403d.mo51607b(f93398f);
        bxvd da = cafi.f172907e.mo74144da();
        if (bmxv.mo66813a() && bmxv2.mo66813a()) {
            cbbe cbbe = this.f93405k;
            cbbe cbbe2 = ((cbbf) bmxv.mo66814b()).f176555d;
            if (cbbe2 == null) {
                cbbe2 = cbbe.f176543f;
            }
            if (cbbe.equals(cbbe2)) {
                z = z || ((cafi) bmxv2.mo66814b()).f172910b;
            }
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cafi cafi = (cafi) da.f164949b;
        cafi.f172909a |= 1;
        cafi.f172910b = z;
        cafj a = m78805a("system");
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cafi cafi2 = (cafi) da.f164949b;
        a.getClass();
        cafi2.f172911c = a;
        cafi2.f172909a |= 2;
        cafj a2 = m78805a("vendor");
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cafi cafi3 = (cafi) da.f164949b;
        a2.getClass();
        cafi3.f172912d = a2;
        cafi3.f172909a |= 4;
        return (cafi) da.mo74062i();
    }

    /* renamed from: a */
    public final chuv mo51383a() {
        return mo51384a(mo51382a(false));
    }

    /* renamed from: a */
    public final chuv mo51384a(cafi cafi) {
        aney a = anef.m64089a(this.f93407m);
        try {
            aucu.m76782a(a.mo41761a("com.google.android.gms.update", cafi.serializeToBytes()));
            f93397e.mo25412b("Set phenotype request property: %s.", cafi);
            Configurations configurations = (Configurations) aucu.m76782a(a.mo41758a("com.google.android.gms.update", 201515033, new String[]{"ANDROID_OTA"}, cafi.serializeToBytes(), ""));
            f93397e.mo25412b("Received new Phenotype snapshot: %s", configurations.f82074a);
            aucu.m76782a(a.mo41759a("com.google.android.gms.update", ""));
            f93397e.mo25412b("Committed to latest snapshot: %s", configurations.f82074a);
            this.f93403d.mo51605a(f93398f.mo51602b(bmxv.m108566b(cafi)));
            return mo51387d();
        } catch (InterruptedException | ExecutionException e) {
            f93397e.mo25417e("Unable to sync latest phenotype config with user-initiated property.", e, new Object[0]);
            this.f93403d.mo51605a(f93398f.mo51602b(bmxv.m108566b(cafi)));
            return chuv.m149607a(chus.INTERNAL);
        } catch (Throwable th) {
            this.f93403d.mo51605a(f93398f.mo51602b(bmxv.m108566b(cafi)));
            throw th;
        }
    }
}
