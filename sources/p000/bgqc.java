package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Process;
import com.google.android.gms.common.internal.ClientContext;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bgqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgqc extends shl implements bgpv {

    /* renamed from: a */
    public static final srn f117262a = srn.m36126a("QuakeGrpcServer", sgj.LOCATION);

    /* renamed from: g */
    public final ThreadPoolExecutor f117263g = new soc(10, new LinkedBlockingQueue(4), bgpx.f117252a);

    /* renamed from: h */
    public final aepr f117264h;

    /* renamed from: j */
    public final AtomicReference f117265j = new AtomicReference();

    /* renamed from: k */
    public final AtomicReference f117266k = new AtomicReference(bxtx.f164797b);

    public bgqc(Context context) {
        super(context, cezv.m138514i(), 443, Process.myUid(), 1536);
        mo25556a("X-Android-Package", context.getPackageName());
        mo25556a("X-Android-Cert", spn.m35895h(context, context.getPackageName()));
        this.f117264h = new aepr(this);
        cezv.m138514i();
    }

    /* renamed from: a */
    public final void mo63093a(long j, bgqb bgqb) {
        this.f117263g.execute(new bgqa(this, j, bgqb));
    }

    /* renamed from: c */
    public final ClientContext mo63094c() {
        Context context = this.f44453i;
        List d = soz.m35801d(context, context.getPackageName());
        if (d.isEmpty()) {
            return null;
        }
        ClientContext clientContext = new ClientContext();
        clientContext.f30215e = this.f44453i.getPackageName();
        clientContext.f30216f = this.f44453i.getPackageName();
        clientContext.f30212b = Process.myUid();
        clientContext.f30214d = (Account) d.get(0);
        clientContext.f30213c = (Account) d.get(0);
        clientContext.mo17806d(cezv.m138512g());
        return clientContext;
    }

    /* renamed from: d */
    public final void mo63095d() {
        mo25559b("x-goog-skey");
    }
}
