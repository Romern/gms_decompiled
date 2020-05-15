package p000;

import java.util.UUID;

/* renamed from: bbrd */
final /* synthetic */ class bbrd implements bqeh {

    /* renamed from: a */
    private final bbrr f103201a;

    /* renamed from: b */
    private final bcoh f103202b;

    /* renamed from: c */
    private final String f103203c;

    /* renamed from: d */
    private final bcej f103204d;

    public bbrd(bbrr bbrr, bcoh bcoh, String str, bcej bcej) {
        this.f103201a = bbrr;
        this.f103202b = bcoh;
        this.f103203c = str;
        this.f103204d = bcej;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcej, boolean):bqgg
     arg types: [java.util.UUID, bcmk, bqgg, bcoh, bcej, int]
     candidates:
      bcjm.a(bcoh, com.google.android.libraries.messaging.lighter.model.ContactId, bqeh, int, bcej, boolean):bqgg
      bcjm.a(java.util.UUID, int, bcnl, bqgg, bcoh, bcoz):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcoz, bcej):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, com.google.android.libraries.messaging.lighter.model.ContactId, bcej, boolean):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcej, boolean):bqgg */
    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbrr bbrr = this.f103201a;
        bcoh bcoh = this.f103202b;
        String str = this.f103203c;
        bcej bcej = this.f103204d;
        Integer num = (Integer) obj;
        bcki bcki = bbrr.f103238f;
        bmxy.m108581a(num);
        return bcki.f104374a.mo56941a(UUID.randomUUID(), (bcnl) new bcmk(bcoh, num.intValue(), str), bcki.f104374a.f104335d.mo56961c(), bcoh, bcej, true);
    }
}
