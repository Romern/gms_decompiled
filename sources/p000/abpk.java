package p000;

import android.content.Context;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* renamed from: abpk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abpk extends acpn {

    /* renamed from: a */
    private final Context f57855a;

    /* renamed from: b */
    private final acrl f57856b;

    /* renamed from: c */
    private final abzo f57857c;

    /* renamed from: d */
    private final abyx f57858d;

    /* renamed from: e */
    private final acao f57859e;

    /* renamed from: f */
    private final NativeIndex f57860f;

    /* renamed from: n */
    private final abym f57861n;

    /* renamed from: o */
    private final abqv f57862o;

    /* renamed from: p */
    private final abyp f57863p;

    /* renamed from: q */
    private final bdwt f57864q;

    /* renamed from: r */
    private final bdsg f57865r;

    public abpk(Context context, acrl acrl, abzo abzo, abyx abyx, acao acao, NativeIndex nativeIndex, abym abym, abqv abqv, abyp abyp, bdwt bdwt, bdsg bdsg) {
        super(bqbd.APP_HISTORY_EVENT_UPLOAD, 2);
        this.f57855a = context;
        this.f57856b = acrl;
        this.f57857c = abzo;
        this.f57858d = abyx;
        this.f57859e = acao;
        this.f57860f = nativeIndex;
        this.f57861n = abym;
        this.f57862o = abqv;
        this.f57863p = abyp;
        this.f57864q = bdwt;
        this.f57865r = bdsg;
    }

    /* renamed from: a */
    public static void m48040a(Context context) {
        aeat a = aeat.m51532a(context);
        aebi aebi = new aebi();
        aebi.f63097i = "com.google.android.gms.icing.service.IcingGcmTaskService";
        aebi.f63099k = "app-history-upload";
        aebi.mo34026a(((Boolean) abzt.f58984d.mo58455c()).booleanValue());
        aebi.mo34027b(0);
        aebi.mo34004a(((Long) abzt.f58849Q.mo58455c()).longValue(), ((Long) abzt.f58850R.mo58455c()).longValue());
        a.mo33984a(aebi.mo33974b());
    }

    /* renamed from: a */
    private final void m48041a(Exception exc) {
        absg.m48189a(exc, "User Actions upload failed!");
        this.f57863p.mo32456a("AppHistoryEventUploadTask uploadUserActions", exc, cema.m137239f());
        this.f57861n.mo32453b(4103);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11132a() {
        acsx a;
        acsn a2;
        if (!((Boolean) abzt.f58847O.mo58455c()).booleanValue()) {
            absg.m48196c("App history upload disabled by flag.");
            return null;
        } else if (!cenc.m137460e()) {
            return null;
        } else {
            try {
                a = acss.m49816a(this.f57855a, this.f57858d, this.f57859e, this.f57856b, this.f57857c, this.f57862o, this.f57860f, this.f57861n, this.f57864q);
                try {
                    a2 = acss.m49815a(this.f57855a, this.f57859e, this.f57862o, this.f57860f, this.f57857c, this.f57861n, this.f57865r);
                    a2.f60689d.mo58335a(cenc.m137457b()).get();
                    a2.close();
                    bqdx.m112674a(a.f60712g, new acsv(), a.f60713h).get();
                    this.f57861n.mo32453b(4102);
                } catch (ExecutionException e) {
                    if (e.getCause() instanceof bdri) {
                        this.f57861n.mo32453b(4107);
                    } else {
                        m48041a(e);
                    }
                } catch (Throwable th) {
                    bqye.m113761a(th, th);
                }
                a.close();
                return null;
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                m48041a(e2);
                return null;
            } catch (ExecutionException e3) {
                if (e3.getCause() instanceof bdri) {
                    this.f57861n.mo32453b(4104);
                    return null;
                }
                m48041a(e3);
                return null;
            } catch (acsr e4) {
                this.f57861n.mo32453b(4114);
                return null;
            } catch (bdrc | IOException e5) {
                m48041a(e5);
                return null;
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
            }
        }
        throw th;
        throw th;
    }
}
