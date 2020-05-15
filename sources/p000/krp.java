package p000;

import android.content.Context;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.autofill.AutofillManager;
import com.android.volley.RequestQueue;
import com.google.android.gms.autofill.events.PackageEventBroadcastReceiver;
import com.google.android.gms.autofill.operation.UserFieldTypeManager;
import java.io.File;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: krp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class krp {

    /* renamed from: a */
    public static final /* synthetic */ int f24894a = 0;

    /* renamed from: b */
    private static final srn f24895b = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: a */
    static aeeh m18448a(Context context, cijl cijl, cijl cijl2, ayte ayte) {
        aeet a = aeet.m51742a();
        a.mo34098a(context);
        if (ccip.m129874n()) {
            a.mo34097a((aeez) cijl.mo6445a());
        } else {
            a.mo34101a(krj.f24889a);
            a.mo34103a(bnhe.m109408a(kbb.SYNC_ID_PREDICTIONS_DOWNLOAD, aeeg.m51722a("com.google.android.gms.autofill.events.AutofillGcmTaskService", "PredictionDataSync", "AutofillOneOff")));
        }
        cijl2.getClass();
        a.mo34102a(new krk(cijl2));
        a.mo34096a(new kro());
        a.mo34099a(ayte);
        a.mo34105a(snp.m35702a(10));
        if (!ccip.f179070a.mo6606a().mo76050m()) {
            return a.mo34106b();
        }
        a.mo34104a("autofill");
        a.mo34100a(adzg.f62956a);
        return a.mo34095a(kbd.f23688b);
    }

    /* renamed from: b */
    static adyd m18470b(Context context) {
        return adyd.m51363a(context);
    }

    /* renamed from: c */
    static PackageManager m18475c(Context context) {
        return context.getPackageManager();
    }

    /* renamed from: d */
    static kra m18477d() {
        String str;
        Locale locale = Locale.getDefault();
        if (locale != null) {
            str = locale.getCountry();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        return new kra(str);
    }

    /* renamed from: e */
    static klj m18479e() {
        return new klh();
    }

    /* renamed from: f */
    public static UserFieldTypeManager m18481f() {
        return new UserFieldTypeManager();
    }

    /* renamed from: g */
    public static bmxv m18483g() {
        return bmvz.f131120a;
    }

    /* renamed from: h */
    static RequestQueue m18485h() {
        return rpr.m34216b().getRequestQueue();
    }

    /* renamed from: j */
    public static lrc m18488j(Context context) {
        return lrc.m19570a(context);
    }

    /* renamed from: k */
    static bmxv m18489k(Context context) {
        String h = spn.m35895h(context, "com.google.android.gms");
        return h != null ? bmxv.m108566b(new bbhh("AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk", "com.google.android.gms", h)) : bmvz.f131120a;
    }

    /* renamed from: l */
    public static befa m18490l(Context context) {
        return new befa(Collections.singletonList(beff.m94940a(context).mo60653a()));
    }

    /* renamed from: m */
    public static bmxv m18491m(Context context) {
        return ccji.f179164a.mo6606a().mo76129k() ? bmxv.m108566b(new kye(context)) : bmvz.f131120a;
    }

    /* renamed from: n */
    public static aeat m18492n(Context context) {
        return aeat.m51532a(context);
    }

    /* renamed from: b */
    public static bmxv m18471b(Context context, befa befa) {
        return bmxv.m108566b(new kyi(afkf.m53198a(context), befa));
    }

    /* renamed from: c */
    static bmzq m18476c() {
        return new lqs();
    }

    /* renamed from: e */
    static qws m18480e(Context context) {
        qws qws = new qws(context, "AUTOFILL_WITH_GOOGLE", null);
        qws.mo24337a(cagz.UNMETERED_OR_DAILY);
        return qws;
    }

    /* renamed from: f */
    static qws m18482f(Context context) {
        qws qws = new qws(context, "AUTOFILL_WITH_GOOGLE_CROWDSOURCING", null);
        qws.mo24337a(cagz.UNMETERED_OR_DAILY);
        return qws;
    }

    /* renamed from: g */
    static kqv m18484g(Context context) {
        return new kqx(context);
    }

    /* renamed from: h */
    static ked m18486h(Context context) {
        return new ked(context);
    }

    /* renamed from: i */
    static bmxv m18487i(Context context) {
        int i = Build.VERSION.SDK_INT;
        return cckh.f179230a.mo6606a().mo76177b() ? bmxv.m108566b(new keg(context)) : bmvz.f131120a;
    }

    /* renamed from: b */
    static Executor m18472b() {
        return snp.m35702a(10);
    }

    /* renamed from: b */
    static lef m18473b(qws qws) {
        return new ldl(qws);
    }

    /* renamed from: b */
    public static lij m18474b(lif lif) {
        return new lij(bqgs.m112811a((ExecutorService) snp.m35702a(9)), lif, "pending_username.pb", new lii(lgs.f26054d));
    }

    /* renamed from: d */
    static wwr m18478d(Context context) {
        return wvu.m42361a(context);
    }

    /* renamed from: a */
    static aeez m18449a() {
        aeey aeey = new aeey(kbb.SYNC_ID_UNKNOWN);
        aeey.mo34110a(kbb.SYNC_ID_PREDICTIONS_DOWNLOAD, aeeg.m51723a("com.google.android.gms.autofill.events.AutofillGcmTaskService", "PredictionDataSync", "AutofillOneOff", kri.f24888a));
        return aeey.mo34109a();
    }

    /* renamed from: a */
    static AutofillManager m18450a(Context context) {
        return (AutofillManager) context.getSystemService(AutofillManager.class);
    }

    /* renamed from: a */
    public static bmxv m18451a(Context context, ayte ayte, cijl cijl) {
        if (ccjs.m130140b() && ccjs.m130143e()) {
            File file = new File(context.getCacheDir(), "autofill_infinite_data_cache");
            if (!file.isDirectory() && !file.mkdir()) {
                ((bnsl) f24895b.mo68388c()).mo68405a("Could not create cache directory for LocalStoreDataAccessor");
            } else if (!ccjs.f179198a.mo6606a().mo76157i()) {
                return bmxv.m108566b(new bbgf(snp.m35702a(9), file, ((int) ccjs.m130141c()) * 1024));
            } else {
                beme b = ((kts) cijl).mo6445a();
                int c = ((int) ccjs.m130141c()) * 1024;
                bmzi bmzi = krn.f24893a;
                srn srn = f24895b;
                boolean e = ccjs.f179198a.mo6606a().mo76153e();
                boolean g = ccjs.f179198a.mo6606a().mo76155g();
                benk a = benl.m95319a("evict_full_cache_trigger");
                a.mo60821a("AFTER INSERT ON infinite_data_cache");
                bbgt.m88000a(a, c);
                benl a2 = a.mo60820a();
                benk a3 = benl.m95319a("recursive_eviction_trigger");
                a3.mo60821a("AFTER DELETE ON infinite_data_cache");
                bbgt.m88000a(a3, c);
                benl a4 = a3.mo60820a();
                benh benh = new benh();
                benh.mo60819a("recursive_triggers = 1");
                benh.mo60819a("synchronous = 0");
                if (e) {
                    benh.f111874a.f111876b = 3;
                }
                beng beng = new beng();
                beng.mo60818a("CREATE TABLE infinite_data_cache(key_data BLOB PRIMARY KEY, value_state_data STRING NOT NULL, value_data BLOB, write_ms INTEGER NOT NULL, access_ms INTEGER NOT NULL)");
                beng.mo60818a("CREATE INDEX access ON infinite_data_cache(access_ms)");
                beng.mo60818a("CREATE INDEX write ON infinite_data_cache(write_ms)");
                beng.mo60817a(a2);
                beng.mo60817a(a4);
                beng.f111872c = benh.f111874a;
                if (beng.f111872c == null) {
                    beng.f111872c = new benh().f111874a;
                }
                benm benm = new benm(beng.f111873d, beng.f111870a.mo67664a(), beng.f111871b.mo67664a(), beng.f111872c);
                bqeg bqeg = bbgk.f102589a;
                String absolutePath = file.getAbsolutePath();
                Context context2 = (Context) ((cayz) b.f111815a).f176439a;
                bmxy.m108581a(context2);
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ((cayz) b.f111816b).f176439a;
                bmxy.m108581a(scheduledExecutorService);
                benc benc = (benc) b.f111817c.mo6445a();
                bmxy.m108581a(benc);
                bmxy.m108581a(bqeg);
                bmxy.m108581a(benm);
                bmxy.m108581a(absolutePath);
                bmzi a5 = bmzn.m108681a((bmzi) new bbgl(new bemd(new bend(context2, scheduledExecutorService, benc, bqeg, benm, absolutePath)), file, srn));
                if (g) {
                    a5.mo6606a();
                }
                return bmxv.m108566b(new bbgt(a5, ayte, bmzi));
            }
        }
        return bmvz.f131120a;
    }

    /* renamed from: a */
    public static bmxv m18452a(Context context, bmxv bmxv, cijl cijl) {
        if (!ccjs.m130140b() || !ccjs.m130143e() || !bmxv.mo66813a()) {
            return bmvz.f131120a;
        }
        bbhl bbhl = new bbhl();
        bqgj a = snp.m35702a(9);
        bmxy.m108581a(a);
        bbhl.f102652a = a;
        bmzi bmzi = krl.f24891a;
        bmxy.m108581a(bmzi);
        bbhl.f102653b = bmzi;
        bmzi a2 = bmzn.m108681a((bmzi) new krm(context));
        bmxy.m108581a(a2);
        bbhl.f102654c = a2;
        bbhh bbhh = (bbhh) bmxv.mo66814b();
        bmxy.m108581a(bbhh);
        bbhl.f102657f = bbhh;
        bmxy.m108581a("autofill-truth-data");
        bbhl.f102656e = "autofill-truth-data";
        if (ccip.m129868h()) {
            bbhl.f102655d = ((aeeh) cijl.mo6445a()).mo34089g(kbb.SYNC_ID_PREDICTIONS_DOWNLOAD);
        }
        return bmxv.m108566b(new bbhp(bbhl));
    }

    /* renamed from: a */
    public static bmxv m18453a(Context context, lhi lhi) {
        return bmxv.m108566b(new kyd(lhi, context));
    }

    /* renamed from: a */
    public static bmxv m18454a(ayte ayte, bmxv bmxv, bmxv bmxv2) {
        if (!bmxv.mo66813a() || !bmxv2.mo66813a()) {
            return bmvz.f131120a;
        }
        snp.m35702a(9);
        return bmxv.m108566b(new kzm(ayte, (bbhp) bmxv.mo66814b(), (bbgj) bmxv2.mo66814b()));
    }

    /* renamed from: a */
    public static bmxv m18455a(kpk kpk, bmxv bmxv) {
        return bmxv.mo66813a() ? bmxv.m108566b(new kzs(kpk, bngx.m109356a((kzn) bmxv.mo66814b()))) : bmvz.f131120a;
    }

    /* renamed from: a */
    static bmxv m18456a(kpk kpk, bmxv bmxv, kkp kkp) {
        return !ccip.m129873m() ? bmxv.m108566b(kkq.m18096a(bmxv, bmvz.f131120a, kpk, kkp)) : bmvz.f131120a;
    }

    /* renamed from: a */
    static bngm m18457a(lrc lrc, Context context, kpk kpk, ked ked, kds kds, bmxv bmxv, lhi lhi) {
        bngs bngs = new bngs();
        bngs.mo67667b((Object[]) new kdn[]{new kdo(), new kdr(lrc, kpk, lhi, context), new kdq(context), kds, new kdt(lrc), new kdu(), ked});
        if (bmxv.mo66813a()) {
            bngs.mo67668c((kdn) bmxv.mo66814b());
        }
        return bngs.mo67664a();
    }

    /* renamed from: a */
    public static bnhe m18458a(bmxv bmxv) {
        if (bmxv.mo66813a()) {
            return bnhe.m109408a("PredictionDataSync", (kpy) bmxv.mo66814b());
        }
        return bnoj.f131912b;
    }

    /* renamed from: a */
    static kds m18459a(ked ked, Context context) {
        return new kds(ked, context);
    }

    /* renamed from: a */
    public static keu m18460a(Context context, ayte ayte) {
        return new keu(context, snp.m35702a(9), ayte);
    }

    /* renamed from: a */
    static kkp m18461a(lhi lhi, klj klj) {
        kko H = kkp.m18061H();
        H.mo14637a(ccji.f179164a.mo6606a().mo76137s());
        H.mo14643f(ccji.f179164a.mo6606a().mo76120b());
        H.mo14650m(ccji.f179164a.mo6606a().mo76125g());
        H.mo14644g(ccji.f179164a.mo6606a().mo76121c());
        H.mo14645h(cciw.f179109a.mo6606a().mo76074g());
        H.mo14632B(ccji.f179164a.mo6606a().mo76139u());
        H.mo14656s(ccji.f179164a.mo6606a().mo76132n());
        H.mo14662y(ccji.m130073d());
        H.mo14649l(ccji.f179164a.mo6606a().mo76127i());
        H.mo14631A(ccji.f179164a.mo6606a().mo76138t());
        H.mo14652o(ccji.f179164a.mo6606a().mo76130l());
        H.mo14661x(ccji.f179164a.mo6606a().mo76119a());
        H.mo14654q(ccji.f179164a.mo6606a().mo76131m());
        H.mo14646i(ccji.m130071b());
        H.mo14657t(ccji.f179164a.mo6606a().mo76134p());
        H.mo14651n(ccji.m130073d());
        H.mo14659v(cciw.f179109a.mo6606a().mo76075h());
        H.mo14660w(lhi.mo15089i());
        H.mo14658u(lhi.mo15089i());
        H.mo14641d(!ccip.m129873m());
        H.mo14634a((int) ccjc.f179140a.mo6606a().mo76100d());
        H.mo14642e(ccji.f179164a.mo6606a().mo76133o());
        H.mo14635a(ccjs.f179198a.mo6606a().mo76158j());
        H.mo14638a(cciw.f179109a.mo6606a().mo76068a());
        H.mo14639b(cciw.f179109a.mo6606a().mo76073f());
        H.mo14636a(klj);
        H.mo14655r(ccji.f179164a.mo6606a().mo76135q());
        H.mo14647j(ccji.f179164a.mo6606a().mo76123e());
        H.mo14653p(ccji.m130071b());
        H.mo14648k(ccji.f179164a.mo6606a().mo76124f());
        H.mo14663z(ccji.m130072c());
        H.mo14640c(cciw.f179109a.mo6606a().mo76092y());
        return H.mo14633a();
    }

    /* renamed from: a */
    static kpk m18462a(PackageManager packageManager) {
        return new kpl(packageManager);
    }

    /* renamed from: a */
    public static kpv m18463a(Context context, cijl cijl, cijl cijl2, bmxv bmxv, lho lho) {
        bngx bngx;
        if (bmxv.mo66813a()) {
            bngx = bngx.m109356a((kzn) bmxv.mo66814b());
        } else {
            bngx = bngx.m109376e();
        }
        kpt kpt = new kpt(bngx, lho, cijl, cijl2);
        PackageInstaller packageInstaller = context.getPackageManager().getPackageInstaller();
        return new kpv(context, new PackageEventBroadcastReceiver(kpt), packageInstaller, new kpw(kpt, packageInstaller));
    }

    /* renamed from: a */
    static kqn m18464a(bngm bngm, Context context, kqv kqv, lhi lhi) {
        bnha h = bnhe.m109414h();
        bnrd a = bngm.iterator();
        while (a.hasNext()) {
            kdn kdn = (kdn) a.next();
            h.mo67695b(kdn.mo14410a(), kdn);
        }
        h.mo67695b(kcp.class, new kdp());
        return new kqy(h.mo67618b(), context, kqv, lhi);
    }

    /* renamed from: a */
    static kwu m18465a(qws qws) {
        return new kxs(qws);
    }

    /* renamed from: a */
    public static kym m18466a(Context context, befa befa, bmxv bmxv, bmxv bmxv2, bmxv bmxv3, bmxv bmxv4) {
        if (!bmxv.mo66813a() && !bmxv2.mo66813a()) {
            return new kym(afkf.m53198a(context), befa);
        }
        bngs j = bngx.m109377j();
        if (bmxv3.mo66813a()) {
            j.mo67668c((kyo) bmxv3.mo66814b());
        }
        if (bmxv2.mo66813a()) {
            j.mo67668c((kyo) bmxv2.mo66814b());
        }
        if (bmxv.mo66813a()) {
            j.mo67668c((kyo) bmxv.mo66814b());
        }
        if (bmxv4.mo66813a()) {
            j.mo67668c((kyo) bmxv4.mo66814b());
        }
        return new kym(j.mo67664a());
    }

    /* renamed from: a */
    static kyq m18467a(AutofillManager autofillManager) {
        return new kyq(autofillManager);
    }

    /* renamed from: a */
    public static lif m18468a(Context context, befa befa) {
        return new lid(context, befa);
    }

    /* renamed from: a */
    public static lij m18469a(lif lif) {
        return new lij(bqgs.m112811a((ExecutorService) snp.m35702a(9)), lif, "whitelist.pb", new lii(kbo.f23701d));
    }
}
