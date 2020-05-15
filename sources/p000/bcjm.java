package p000;

import android.content.Context;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: bcjm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcjm {

    /* renamed from: a */
    public final Context f104332a;

    /* renamed from: b */
    public final bceq f104333b;

    /* renamed from: c */
    public final bcfx f104334c;

    /* renamed from: d */
    public final bckh f104335d;

    /* renamed from: e */
    public bbxv f104336e;

    /* renamed from: f */
    public final Map f104337f = new HashMap();

    /* renamed from: g */
    public azbs f104338g;

    public bcjm(Context context, bceq bceq) {
        bckh bckh = new bckh(context);
        Context applicationContext = context.getApplicationContext();
        this.f104332a = applicationContext;
        this.f104335d = bckh;
        this.f104333b = bceq;
        this.f104334c = bcfx.m88929a(applicationContext);
    }

    /* renamed from: a */
    public static final bqgg m89148a(bqeh bqeh) {
        try {
            return bqeh.mo6375a(null);
        } catch (Exception e) {
            return bqga.m112777a((Throwable) e);
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        bckh bckh = this.f104335d;
        bckh.f104371a.unregisterReceiver(bckh.f104372b);
        try {
            chqp chqp = bckh.f104373c;
            if (chqp instanceof chsz) {
                ((chsz) chqp).mo85624c();
            }
        } catch (Exception e) {
            bbos.m88292b("StubFactory", "Failed to shutdown", e);
        }
    }

    /* renamed from: a */
    private final bqgg m89149a(bqgg bqgg, ContactId contactId, boolean z) {
        return bqga.m112783b(bqgg).mo69214a(new bcip(this, bqgg, contactId, z), bqfb.INSTANCE);
    }

    /* renamed from: a */
    private final bqgg m89150a(UUID uuid, int i, bcnl bcnl, bqgg bqgg, ContactId contactId, bcej bcej, boolean z, bcoh bcoh, bcoz bcoz) {
        bqgg bqgg2;
        bqgg bqgg3;
        int i2 = i;
        ContactId contactId2 = contactId;
        boolean z2 = z;
        bcoh bcoh2 = bcoh;
        bbov.m88299a();
        if (((Boolean) bbqt.m88417a(this.f104332a).f103116aK.mo58455c()).booleanValue()) {
            return mo56934a(bcoh, contactId, new bcjb(this, uuid, i, bcnl, z, bqgg, contactId, bcoh, bcoz), i, bcej, z);
        }
        bbov.m88299a();
        if (this.f104336e == null) {
            return bqga.m112777a((Throwable) new RuntimeException("tachyonRegistrationHandler is null"));
        }
        if (this.f104338g == null) {
            return bqga.m112777a((Throwable) new RuntimeException("oAuthTokenProvider is null"));
        }
        if (z2) {
            bqgg2 = mo56937a(bqgg, contactId2);
        } else {
            bqgg2 = bqgg;
        }
        bqgg a = mo56938a(mo56939a(uuid, i, bcnl, bqgg2, bcoh, bcoz), contactId2, 6);
        if (i2 == 1 || i2 == 2) {
            bqgg3 = m89149a(a, contactId2, z2);
        } else if (i2 == 0 && bcoh2 != null) {
            bqgg3 = mo56936a(a, bcoh2, z2);
        } else {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Invalid RequestType: ");
            sb.append(i2);
            return bqga.m112777a((Throwable) new RuntimeException(sb.toString()));
        }
        bqgg a2 = bqga.m112783b(bqgg3).mo69214a(new bciz(this, bqgg3, uuid, i, bcnl, z, bqgg, contactId, bcoh, bcoz, a), bqfb.INSTANCE);
        if (((bcef) bcej).f104027a.mo56724a() == 0) {
            return a2;
        }
        return mo56935a(a2, new bcji(this, bcej, uuid, i, bcnl, z, bqgg, contactId, bcoh, bcoz));
    }

    /* renamed from: a */
    private final bqgg m89151a(UUID uuid, bmxj bmxj, bcoh bcoh) {
        bqgg a = bqga.m112771a(new bcim(this, bcoh), bqfb.INSTANCE);
        return bqga.m112786c(a).mo69214a(new bcin(this, a, bmxj, uuid, bcoh), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo56934a(bcoh bcoh, ContactId contactId, bqeh bqeh, int i, bcej bcej, boolean z) {
        if (this.f104336e == null) {
            return bqga.m112777a((Throwable) new RuntimeException("tachyonRegistrationHandler is null"));
        }
        if (this.f104338g == null) {
            return bqga.m112777a((Throwable) new RuntimeException("oAuthTokenProvider is null"));
        }
        bqgg a = mo56938a(m89148a(bqeh), contactId, 6);
        if (z) {
            bqgg a2 = bqga.m112783b(a).mo69214a(new bcis(this, a, contactId, bcoh), bqfb.INSTANCE);
            a = bqga.m112783b(a2).mo69214a(new bcjc(this, a2, bqeh, a), bqfb.INSTANCE);
        }
        if (i == 0 && bcoh != null) {
            bqgg a3 = bqga.m112783b(a).mo69214a(new bcit(this, a, bcoh), bqfb.INSTANCE);
            bqgg a4 = bqga.m112783b(a3).mo69216a(new bciu(a3), bqfb.INSTANCE);
            a = bqga.m112783b(a4).mo69214a(new bcjd(this, a4, bqeh, a), bqfb.INSTANCE);
        } else if (!(i == 1 || i == 2)) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Invalid RequestType: 0");
            return bqga.m112777a((Throwable) new RuntimeException(sb.toString()));
        }
        return ((bcef) bcej).f104027a.mo56724a() != 0 ? mo56935a(a, new bcjj(this, bcej, bqeh)) : a;
    }

    /* renamed from: a */
    public final bqgg mo56935a(bqgg bqgg, bceh bceh) {
        return bqga.m112783b(bqgg).mo69214a(new bciv(this, bqgg, bceh), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo56936a(bqgg bqgg, bcoh bcoh, boolean z) {
        bqgg a = m89149a(bqgg, bcoh.mo57058b().mo57074e(), z);
        bqgg a2 = bqga.m112783b(a).mo69214a(new bciq(this, a, bcoh), bqfb.INSTANCE);
        return bqga.m112783b(a2).mo69216a(new bcir(a2), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo56937a(bqgg bqgg, ContactId contactId) {
        return bqga.m112771a(new bcil(this, contactId, bqgg), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo56938a(bqgg bqgg, ContactId contactId, int i) {
        return bqga.m112783b(bqgg).mo69214a(new bcie(this, bqgg, i, contactId), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo56939a(UUID uuid, int i, bcnl bcnl, bqgg bqgg, bcoh bcoh, bcoz bcoz) {
        bqgg bqgg2;
        if (i == 1) {
            bcnl.getClass();
            bqgg2 = (bqgg) new bcje(bcnl).apply((cbmo) bcka.m89175a(this.f104332a, uuid).mo74062i());
        } else if (i == 0 && bcoh != null) {
            bcnl.getClass();
            bqgg2 = m89151a(uuid, new bcjf(bcnl), bcoh);
        } else if (i != 2 || bcoh == null || bcoz == null) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Invalid RequestType: ");
            sb.append(i);
            return bqga.m112777a((Throwable) new RuntimeException(sb.toString()));
        } else {
            bcnl.getClass();
            bcjg bcjg = new bcjg(bcnl);
            bxvd a = bcka.m89176a(this.f104332a, bqce.m112561a(bcoz.mo57131a()), uuid);
            cbma a2 = bclg.m89237a(bcoh.mo57058b().mo57074e());
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            cbmo cbmo = cbmo.f177654h;
            a2.getClass();
            ((cbmo) a.f164949b).f177662g = a2;
            bqgg2 = (bqgg) bcjg.apply((cbmo) a.mo74062i());
        }
        bqgy c = bqgy.m112818c();
        bqgg a3 = bqdx.m112673a(bqdx.m112674a(bqgg2, new bcif(uuid, c, bcnl, bqgg), bqfb.INSTANCE), new bcig(uuid, bcnl), bqfb.INSTANCE);
        return bqga.m112783b(a3).mo69214a(new bcih(this, c, a3, bcnl, uuid), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo56940a(UUID uuid, bbua bbua, bcmw bcmw, bqgg bqgg, bcoh bcoh) {
        bbov.m88299a();
        if (bcoh != null) {
            bcmw.getClass();
            bqgg a = m89151a(uuid, new bcii(), bcoh);
            bqgy c = bqgy.m112818c();
            bqgg a2 = bqdx.m112674a(a, new bcij(this, bcmw, bqgg, c, bbua, uuid), bqfb.INSTANCE);
            return bqga.m112783b(a2).mo69214a(new bcik(this, c, a2, bcmw, uuid), bqfb.INSTANCE);
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("Invalid RequestType: 0");
        return bqga.m112777a((Throwable) new RuntimeException(sb.toString()));
    }

    /* renamed from: a */
    public final bqgg mo56941a(UUID uuid, bcnl bcnl, bqgg bqgg, bcoh bcoh, bcej bcej, boolean z) {
        return m89150a(uuid, 0, bcnl, bqgg, bcoh.mo57058b().mo57074e(), bcej, z, bcoh, null);
    }

    /* renamed from: a */
    public final bqgg mo56942a(UUID uuid, bcnl bcnl, bqgg bqgg, bcoh bcoh, bcoz bcoz, bcej bcej) {
        return m89150a(uuid, 2, bcnl, bqgg, bcoh.mo57058b().mo57074e(), bcej, true, bcoh, bcoz);
    }

    /* renamed from: a */
    public final bqgg mo56943a(UUID uuid, bcnl bcnl, bqgg bqgg, ContactId contactId, bcej bcej, boolean z) {
        return m89150a(uuid, 1, bcnl, bqgg, contactId, bcej, z, null, null);
    }
}
