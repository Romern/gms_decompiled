package p000;

import com.google.android.libraries.messaging.lighter.model.C$AutoValue_ContactId;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.UUID;

/* renamed from: bbww */
final /* synthetic */ class bbww implements bqeg {

    /* renamed from: a */
    private final bbxm f103638a;

    /* renamed from: b */
    private final ContactId f103639b;

    /* renamed from: c */
    private final bcej f103640c;

    public bbww(bbxm bbxm, ContactId contactId, bcej bcej) {
        this.f103638a = bbxm;
        this.f103639b = contactId;
        this.f103640c = bcej;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bcjm.a(java.util.UUID, bcnl, bqgg, com.google.android.libraries.messaging.lighter.model.ContactId, bcej, boolean):bqgg
     arg types: [java.util.UUID, bcni, bqgg, com.google.android.libraries.messaging.lighter.model.ContactId, bcej, int]
     candidates:
      bcjm.a(bcoh, com.google.android.libraries.messaging.lighter.model.ContactId, bqeh, int, bcej, boolean):bqgg
      bcjm.a(java.util.UUID, int, bcnl, bqgg, bcoh, bcoz):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcej, boolean):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcoz, bcej):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, com.google.android.libraries.messaging.lighter.model.ContactId, bcej, boolean):bqgg */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bcjm.a(java.util.UUID, bcnl, bqgg, com.google.android.libraries.messaging.lighter.model.ContactId, bcej, boolean):bqgg
     arg types: [java.util.UUID, bcnc, bqgg, com.google.android.libraries.messaging.lighter.model.ContactId, bcej, int]
     candidates:
      bcjm.a(bcoh, com.google.android.libraries.messaging.lighter.model.ContactId, bqeh, int, bcej, boolean):bqgg
      bcjm.a(java.util.UUID, int, bcnl, bqgg, bcoh, bcoz):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcej, boolean):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcoz, bcej):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, com.google.android.libraries.messaging.lighter.model.ContactId, bcej, boolean):bqgg */
    /* renamed from: a */
    public final bqgg mo7073a() {
        bbxm bbxm = this.f103638a;
        ContactId contactId = this.f103639b;
        bcej bcej = this.f103640c;
        bcky bcky = bbxm.f103688n;
        azbk azbk = bbxm.f103686l;
        azbl azbl = bbxm.f103687m;
        if (((C$AutoValue_ContactId) contactId).f111336c != ContactId.ContactType.EMAIL) {
            return bcky.f104427a.mo56943a(UUID.randomUUID(), (bcnl) new bcnc(contactId, bcky.f104428b, azbk, azbl, bcky.m89212a()), bcky.f104427a.f104335d.mo56959a(), contactId, bcej, false);
        }
        return bcky.f104427a.mo56943a(UUID.randomUUID(), (bcnl) new bcni(contactId, bcky.f104428b, azbk, azbl, bcky.m89212a()), bcky.f104427a.f104335d.mo56959a(), contactId, bcej, true);
    }
}
