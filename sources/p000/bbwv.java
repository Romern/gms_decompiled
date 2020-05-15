package p000;

import android.content.Context;
import com.google.android.libraries.messaging.lighter.model.Notification;

/* renamed from: bbwv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbwv implements bbpm {

    /* renamed from: a */
    public static final /* synthetic */ int f103635a = 0;

    /* renamed from: b */
    private final bbyw f103636b;

    /* renamed from: c */
    private final bqgj f103637c = bboz.m88304a().f103024a;

    static {
        bnhe.m109411a(10, 133, 30, 134, 40, 135, 20, 136);
        bnhe.m109411a(10, 137, 30, 138, 40, 139, 20, 140);
    }

    public bbwv(Context context, bbyw bbyw) {
        this.f103636b = bbyw;
        bcfx.m88929a(context);
    }

    /* renamed from: a */
    public final bdar mo56333a(bcoh bcoh) {
        return bdak.m90446a(mo56478b(bcoh).mo56656d(), new bbws());
    }

    /* renamed from: b */
    public final bdal mo56478b(bcoh bcoh) {
        return this.f103636b.mo56561a(bcoh);
    }

    /* renamed from: a */
    public final void mo56334a(bcoh bcoh, bngx bngx) {
        this.f103637c.mo25812a(new bbwt(this, bcoh, bngx));
    }

    /* renamed from: a */
    public final void mo56335a(bcoh bcoh, Notification notification) {
        this.f103637c.mo25812a(new bbwu(this, bcoh, notification));
    }
}
