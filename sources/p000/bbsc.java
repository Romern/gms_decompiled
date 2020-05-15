package p000;

import android.content.Context;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* renamed from: bbsc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbsc implements bbpg {

    /* renamed from: a */
    public final Context f103273a;

    /* renamed from: b */
    public final bqgj f103274b;

    /* renamed from: c */
    public final bcfx f103275c;

    /* renamed from: d */
    public final Object f103276d = new Object();

    /* renamed from: e */
    public final Object f103277e = new Object();

    /* renamed from: f */
    public final Random f103278f;

    /* renamed from: g */
    final Map f103279g = new HashMap();

    /* renamed from: h */
    final Map f103280h = new HashMap();

    /* renamed from: i */
    public final bckj f103281i;

    /* renamed from: j */
    private final bbyw f103282j;

    public bbsc(Context context, bbyw bbyw, bckj bckj, bcfx bcfx) {
        this.f103273a = context;
        this.f103282j = bbyw;
        this.f103281i = bckj;
        this.f103275c = bcfx;
        this.f103274b = bboz.m88304a().f103024a;
        this.f103278f = new Random();
    }

    /* renamed from: a */
    public final bdal mo56391a(bcoh bcoh) {
        return this.f103282j.mo56561a(bcoh);
    }

    /* renamed from: a */
    public final bdar mo56305a(bcoh bcoh, ContactId contactId) {
        return mo56392a(bcoh, contactId, bbrs.f103241a);
    }

    /* renamed from: a */
    public final bdar mo56392a(bcoh bcoh, ContactId contactId, bmxz bmxz) {
        return bdak.m90446a(mo56391a(bcoh).mo56609a(contactId), new bbrt(this, contactId, bmxz, bcoh));
    }

    /* renamed from: a */
    public final void mo56393a(bcoh bcoh, bcsj bcsj) {
        if (bcsj.mo57305d().mo66813a()) {
            bcfx bcfx = this.f103275c;
            bcnr q = bcns.m89409q();
            q.mo57011b(37);
            q.mo57012b(bcoh.mo57058b().mo57074e());
            q.mo57010a(bcoh.mo57059c().mo73781l());
            q.mo57007a(bcsj.mo57302a());
            bcfx.mo56753a(q.mo57002a());
            bqgg b = this.f103274b.mo25819b(new bbqd(this.f103273a, (String) bcsj.mo57305d().mo66814b()));
            bqga.m112781a(b, new bbsb(this, bcoh, bcsj), bqfb.INSTANCE);
            bqdx.m112673a(b, new bbry(this, bcsj, bcoh), bqfb.INSTANCE);
        }
    }
}
