package p000;

import android.content.Context;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* renamed from: acsp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acsp extends acpn {

    /* renamed from: a */
    private final Context f60692a;

    /* renamed from: b */
    private final acao f60693b;

    /* renamed from: c */
    private final abqv f60694c;

    /* renamed from: d */
    private final NativeIndex f60695d;

    /* renamed from: e */
    private final abzo f60696e;

    /* renamed from: f */
    private final abyp f60697f;

    /* renamed from: n */
    private final abym f60698n;

    /* renamed from: o */
    private final ByteString f60699o;

    /* renamed from: p */
    private final bdsg f60700p;

    public acsp(Context context, acao acao, abqv abqv, NativeIndex nativeIndex, abzo abzo, abyp abyp, abym abym, ByteString bxtx, bdsg bdsg) {
        super(bqbd.USER_ACTIONS_PUSH_NOTIFICATIONS_HANDLE, 2);
        this.f60692a = context;
        this.f60693b = acao;
        this.f60694c = abqv;
        this.f60695d = nativeIndex;
        this.f60696e = abzo;
        this.f60697f = abyp;
        this.f60698n = abym;
        this.f60699o = bxtx;
        this.f60700p = bdsg;
    }

    /* renamed from: a */
    private final void m49812a(Exception exc) {
        absg.m48189a(exc, "User Actions deletion download failed!");
        this.f60697f.mo32456a("ActionDeletionsPushTask", exc, cema.m137239f());
        this.f60698n.mo32453b(4109);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11132a() {
        acsn a;
        absg.m48184a("ActionsDeletionsPushTask#evaluate");
        if (!cenc.m137460e()) {
            absg.m48196c("App history upload disabled by flag.");
            return null;
        }
        try {
            a = acss.m49815a(this.f60692a, this.f60693b, this.f60694c, this.f60695d, this.f60696e, this.f60698n, this.f60700p);
            a.f60689d.mo58337a(this.f60699o).get();
            if (!cenc.m137459d()) {
                absg.m48196c("Action deletions download disabled by flag.");
            } else {
                absg.m48184a("Scheduling one-off task to download deletions.");
                aeat a2 = aeat.m51532a(this.f60692a);
                aebi aebi = new aebi();
                aebi.f63097i = "com.google.android.gms.icing.service.IcingGcmTaskService";
                aebi.f63099k = "action-deletions-download-push-triggered";
                aebi.mo34026a(((Boolean) abzt.f58984d.mo58455c()).booleanValue());
                aebi.mo34024a(0, cdny.m134338c() ? 1 : 0);
                aebi.mo34023a(0);
                aebi.mo34027b(1);
                aebi.mo34004a(cenc.f183045a.mo6606a().mo79411n(), cenc.f183045a.mo6606a().mo79410m());
                a2.mo33984a(aebi.mo33974b());
            }
            this.f60698n.mo32453b(4108);
            a.close();
            return null;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            m49812a(e);
            return null;
        } catch (ExecutionException e2) {
            if (e2.getCause() instanceof bdri) {
                this.f60698n.mo32453b(4110);
                return null;
            }
            m49812a(e2);
            return null;
        } catch (acsr e3) {
            this.f60698n.mo32453b(4114);
            return null;
        } catch (bdrc | IOException e4) {
            m49812a(e4);
            return null;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
