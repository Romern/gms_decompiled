package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import java.util.Set;

/* renamed from: ajer */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajer extends buqn {

    /* renamed from: a */
    final /* synthetic */ bzcj f70471a;

    /* renamed from: b */
    final /* synthetic */ bzck f70472b;

    /* renamed from: c */
    final /* synthetic */ ajes f70473c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajer(ajes ajes, String str, bzcj bzcj, bzck bzck) {
        super(str);
        this.f70473c = ajes;
        this.f70471a = bzcj;
        this.f70472b = bzck;
    }

    public final void run() {
        ajes ajes = this.f70473c;
        aiyx aiyx = ajes.f70475b;
        ClientAppIdentifier clientAppIdentifier = ajes.f70474a;
        bzcj bzcj = this.f70471a;
        bzck bzck = this.f70472b;
        Set set = ajes.f70477d;
        aiyx.f70119e.mo72984b();
        bnsl bnsl = (bnsl) ahfq.f67120a.mo68390d();
        bnsl.mo68432a("aiyx", "a", 145, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68426a("%s response succeeded for %s [%dms], addresses %s", "CopresenceLogger: ", clientAppIdentifier, Long.valueOf(aiyx.mo38312a((bxxc) bzcj)), set);
        aiyx.mo38317a(aiyx.mo38313a(clientAppIdentifier, bzcj, bzck, BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, set));
        aiyx.mo38322b(bzcj);
    }
}
