package p000;

import com.google.android.libraries.messaging.lighter.model.C$AutoValue_ContactId;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.security.KeyPair;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: bcju */
public final /* synthetic */ class bcju implements Callable {

    /* renamed from: a */
    private final bcjz f104347a;

    /* renamed from: b */
    private final cbmo f104348b;

    /* renamed from: c */
    private final ContactId f104349c;

    /* renamed from: d */
    private final bqgg f104350d;

    /* renamed from: e */
    private final bqgg f104351e;

    /* renamed from: f */
    private final bqgg f104352f;

    public bcju(bcjz bcjz, cbmo cbmo, ContactId contactId, bqgg bqgg, bqgg bqgg2, bqgg bqgg3) {
        this.f104347a = bcjz;
        this.f104348b = cbmo;
        this.f104349c = contactId;
        this.f104350d = bqgg;
        this.f104351e = bqgg2;
        this.f104352f = bqgg3;
    }

    public final Object call() {
        bcjz bcjz = this.f104347a;
        cbmo cbmo = this.f104348b;
        ContactId contactId = this.f104349c;
        bqgg bqgg = this.f104350d;
        bqgg bqgg2 = this.f104351e;
        bqgg bqgg3 = this.f104352f;
        bxvd da = cbln.f177535e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbmo.getClass();
        ((cbln) da.f164949b).f177537a = cbmo;
        String str = ((C$AutoValue_ContactId) contactId).f111335b;
        cbln cbln = (cbln) da.f164949b;
        str.getClass();
        cbln.f177540d = str;
        cbln.f177539c = 0;
        cbld a = bcjz.mo56952a((String) bqga.m112780a((Future) bqgg), (String) bqga.m112780a((Future) bqgg2), ((KeyPair) bqga.m112780a((Future) bqgg3)).getPublic());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((cbln) da.f164949b).f177538b = a;
        return (cbln) da.mo74062i();
    }
}
