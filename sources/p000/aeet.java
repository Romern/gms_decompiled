package p000;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* renamed from: aeet */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeet {

    /* renamed from: b */
    private static final Pattern f63286b = Pattern.compile("[a-z]+");

    /* renamed from: a */
    public bbio f63287a;

    /* renamed from: c */
    private Context f63288c;

    /* renamed from: d */
    private bmxj f63289d;

    /* renamed from: e */
    private bnhe f63290e;

    /* renamed from: f */
    private bmzi f63291f;

    /* renamed from: g */
    private beju f63292g;

    /* renamed from: h */
    private String f63293h;

    /* renamed from: i */
    private Executor f63294i;

    /* renamed from: j */
    private ayte f63295j;

    /* renamed from: k */
    private aeev f63296k;

    private aeet() {
    }

    /* renamed from: a */
    private static aeeo m51741a(Context context, String str, String str2, ayte ayte, bmxj bmxj) {
        return new aeeo(context, str, str2, ayte, bmxj);
    }

    /* renamed from: b */
    private static final bats m51745b(aeev aeev) {
        sgj sgj = sgj.MDI_SYNC;
        bbis bbis = new bbis();
        aeev.getClass();
        aeem aeem = new aeem();
        aeev.getClass();
        return adzc.m51462a("GmsSyncPolicyEngine", sgj, bbis, aeem, new aeen());
    }

    /* renamed from: c */
    private final void m51748c() {
        m51744a(this.f63288c, "setContext");
        m51744a(this.f63290e, "setTaskConfigMap");
        m51744a(this.f63291f, "setGmsTaskScheduler");
        m51744a(this.f63294i, "setScheduleExecutor");
        if (this.f63289d != null) {
            bnrd a = this.f63290e.values().iterator();
            while (a.hasNext()) {
                aeeg aeeg = (aeeg) a.next();
                if (aeeg.mo34056d() != null) {
                    String valueOf = String.valueOf(aeeg);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 67);
                    sb.append("Both policiesMap and TaskConfig.policySupplier are set! taskConfig=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            return;
        }
        bnrd a2 = this.f63290e.values().iterator();
        while (a2.hasNext()) {
            aeeg aeeg2 = (aeeg) a2.next();
            if (aeeg2.mo34056d() == null) {
                String valueOf2 = String.valueOf(aeeg2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 38);
                sb2.append("TaskConfig is missing policySupplier: ");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    /* renamed from: d */
    private final ayte m51749d() {
        ayte ayte = this.f63295j;
        return ayte == null ? new aytg() : ayte;
    }

    /* renamed from: e */
    private final aeev m51750e() {
        aeev aeev = this.f63296k;
        return aeev == null ? new aeev() : aeev;
    }

    /* renamed from: a */
    public final void mo34097a(aeez aeez) {
        this.f63290e = aeez.f63301a;
    }

    /* renamed from: a */
    public static aeet m51742a() {
        return new aeet();
    }

    /* renamed from: a */
    private final bmxj m51743a(Context context, aeev aeev) {
        return new aeel(m51746b(context, aeev));
    }

    /* renamed from: b */
    private final bbio m51746b(Context context, aeev aeev) {
        bbio bbio = this.f63287a;
        return bbio == null ? new bbio(context, new aeer(aeev)) : bbio;
    }

    /* renamed from: a */
    private static void m51744a(Object obj, String str) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(str.length() + 28);
            sb.append("Must call ");
            sb.append(str);
            sb.append("() before build().");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public final aecs mo34095a(bxvq bxvq) {
        String str;
        String str2;
        m51748c();
        m51744a(this.f63292g, "setProtoDataStoreFactory");
        m51744a(this.f63293h, "setModuleName");
        Context context = this.f63288c;
        aeev e = m51750e();
        bats b = m51745b(e);
        Executor executor = this.f63294i;
        aeej aeej = new aeej(context, executor);
        ayte d = m51749d();
        bbob a = bboc.m88268a(bxvq);
        a.f103003c = d;
        a.mo56269a(this.f63292g);
        a.f103004d = srn.m36126a("SyncMetadataManager", sgj.MDI_SYNC);
        bboc a2 = a.mo56268a();
        bmxj bmxj = this.f63289d;
        bnhe bnhe = this.f63290e;
        bmzi bmzi = this.f63291f;
        bbiv b2 = m51747b(context);
        aeeo a3 = m51741a(context, this.f63293h, "syncPolicyEngine", d, m51743a(context, e));
        aees aees = new aees(context, this.f63293h, "syncPolicyEngine");
        String packageName = context.getPackageName();
        if (!aeev.m51768e()) {
            str = "syncPolicyEngine";
        } else {
            str = this.f63293h;
        }
        if (!aeev.m51768e()) {
            str2 = this.f63293h;
        } else {
            str2 = "";
        }
        bbio b3 = m51746b(context, e);
        b3.getClass();
        return new aeed(e, b, bmxj, bnhe, bmzi, executor, b2, a3, aeej, a2, aees, new bbiw(packageName, str, str2, new aeek(b3), new bbis()));
    }

    /* renamed from: b */
    private static final bbiv m51747b(Context context) {
        return new bbiv(context);
    }

    /* renamed from: b */
    public final aeeh mo34106b() {
        m51748c();
        aeev e = m51750e();
        return new aeed(e, m51745b(e), this.f63289d, this.f63290e, this.f63291f, this.f63294i, m51747b(this.f63288c), m51741a(this.f63288c, this.f63293h, "syncPolicyEngine", m51749d(), m51743a(this.f63288c, e)), aeei.f63269a, null, null, null);
    }

    /* renamed from: a */
    public final void mo34096a(aeev aeev) {
        bmxy.m108581a(aeev);
        this.f63296k = aeev;
    }

    /* renamed from: a */
    public final void mo34098a(Context context) {
        bmxy.m108581a(context);
        this.f63288c = context;
    }

    /* renamed from: a */
    public final void mo34099a(ayte ayte) {
        bmxy.m108581a(ayte);
        this.f63295j = ayte;
    }

    /* renamed from: a */
    public final void mo34100a(beju beju) {
        bmxy.m108581a(beju);
        this.f63292g = beju;
    }

    @Deprecated
    /* renamed from: a */
    public final void mo34101a(bmxj bmxj) {
        bmxy.m108581a(bmxj);
        this.f63289d = bmxj;
    }

    /* renamed from: a */
    public final void mo34102a(bmzi bmzi) {
        bmxy.m108581a(bmzi);
        this.f63291f = bmzi;
    }

    @Deprecated
    /* renamed from: a */
    public final void mo34103a(bnhe bnhe) {
        bmxy.m108581a(bnhe);
        this.f63290e = bnhe;
    }

    /* renamed from: a */
    public final void mo34104a(String str) {
        bmxy.m108588a(f63286b.matcher(str).matches());
        this.f63293h = str;
    }

    /* renamed from: a */
    public final void mo34105a(Executor executor) {
        bmxy.m108581a(executor);
        this.f63294i = executor;
    }
}
