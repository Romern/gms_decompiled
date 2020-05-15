package p000;

import android.content.Context;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* renamed from: acsg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acsg extends acpn {

    /* renamed from: a */
    private final Context f60664a;

    /* renamed from: b */
    private final acao f60665b;

    /* renamed from: c */
    private final abqv f60666c;

    /* renamed from: d */
    private final NativeIndex f60667d;

    /* renamed from: e */
    private final abzo f60668e;

    /* renamed from: f */
    private final abyp f60669f;

    /* renamed from: n */
    private final abym f60670n;

    /* renamed from: o */
    private final bdsg f60671o;

    /* renamed from: p */
    private final bdrw f60672p;

    public acsg(Context context, acao acao, abqv abqv, NativeIndex nativeIndex, abzo abzo, abyp abyp, abym abym, bdsg bdsg, bdrw bdrw) {
        super(bqbd.USER_ACTIONS_SYNC_DELETION_DOWNLOADS);
        this.f60664a = context;
        this.f60665b = acao;
        this.f60666c = abqv;
        this.f60667d = nativeIndex;
        this.f60668e = abzo;
        this.f60669f = abyp;
        this.f60670n = abym;
        this.f60671o = bdsg;
        this.f60672p = bdrw;
    }

    /* renamed from: a */
    private final void m49796a(Exception exc) {
        absg.m48189a(exc, "User Actions deletion download failed!");
        this.f60669f.mo32456a("ActionDeletionsDownloadTask", exc, cema.m137239f());
        this.f60670n.mo32453b(4106);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo32291b() {
        acsm acsm;
        acsj acsj;
        absg.m48185a("ActionDeletionsDownloadTask#runAwake reason=%d", Integer.valueOf(this.f60672p.ordinal()));
        try {
            acsn a = acss.m49815a(this.f60664a, this.f60665b, this.f60666c, this.f60667d, this.f60668e, this.f60670n, this.f60671o);
            try {
                bdrw bdrw = this.f60672p;
                if (((Boolean) a.f60689d.mo58334a().get()).booleanValue()) {
                    acsm = new acsm(a);
                    acsj = new acsj(bqcn.m112585b(cenc.f183045a.mo6606a().mo79409l()));
                    bdry bdry = a.f60689d;
                    bdrv d = bdrx.m91364d();
                    d.mo58341a(bdrw);
                    d.mo58340a(cenc.m137457b());
                    bqdf.m112620a(bdry.mo58336a(d.mo58339a(), acsj, a.f60690e), Exception.class, new acsi(a), a.f60690e).get();
                    try {
                        acsj.mo33058a(acsm);
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    if (th != null) {
                        throw new ExecutionException(th);
                    }
                }
                this.f60670n.mo32453b(4105);
                a.close();
                return;
            } catch (Throwable th2) {
                a.close();
                throw th2;
            }
            throw th;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            m49796a(e);
        } catch (ExecutionException e2) {
            if (e2.getCause() instanceof bdri) {
                this.f60670n.mo32453b(4107);
            } else {
                m49796a(e2);
            }
        } catch (acsr e3) {
            this.f60670n.mo32453b(4114);
        } catch (bdrc | IOException e4) {
            m49796a(e4);
        } catch (Throwable th3) {
            bqye.m113761a(th2, th3);
        }
    }
}
