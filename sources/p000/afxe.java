package p000;

import android.accounts.Account;
import com.google.android.gms.mdisync.CallerInfo;
import com.google.android.gms.mdisync.internal.SyncRequest;
import com.google.android.gms.mdisync.internal.TeleportingSyncRequest;
import java.util.concurrent.Executor;

/* renamed from: afxe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afxe extends afvp implements aaai {

    /* renamed from: a */
    private static final bnsn f64909a = afvx.m53604b();

    /* renamed from: b */
    private final aaag f64910b;

    /* renamed from: c */
    private final afxn f64911c;

    /* renamed from: d */
    private final String f64912d;

    public afxe(aaag aaag, afxn afxn, String str) {
        this.f64910b = aaag;
        this.f64911c = afxn;
        this.f64912d = str;
    }

    /* renamed from: a */
    public final void mo35037a(afvo afvo, SyncRequest syncRequest, CallerInfo callerInfo) {
        bnsi d = f64909a.mo68390d();
        d.mo68432a("afxe", "a", 40, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68426a("Received request for operation '%d' from package '%s', instance id '%s', version '%d'...", Integer.valueOf(syncRequest.f80029a.f64622e), this.f64912d, callerInfo.f80027a, Long.valueOf(callerInfo.f80028b));
        aaag aaag = this.f64910b;
        afxn afxn = this.f64911c;
        afxv afxv = (afxv) afxn.f64935a.mo6445a();
        afxn.m53651a(afxv, 1);
        aecs aecs = (aecs) afxn.f64936b.mo6445a();
        afxn.m53651a(aecs, 2);
        cijl cijl = afxn.f64937c;
        Executor b = afuo.m53573b();
        afxn.m53651a(b, 3);
        afwa afwa = (afwa) afxn.f64938d.mo6445a();
        afxn.m53651a(afwa, 4);
        afvy afvy = (afvy) afxn.f64939e.mo6445a();
        afxn.m53651a(afvy, 5);
        String str = (String) ((cayz) afxn.f64940f).f176439a;
        afxn.m53651a(str, 6);
        Account account = (Account) ((cayz) afxn.f64941g).f176439a;
        afxn.m53651a(account, 7);
        afxn.m53651a(afvo, 8);
        afxn.m53651a(syncRequest, 9);
        afxn.m53651a(callerInfo, 10);
        aaag.mo16658a(new afxm(afxv, aecs, b, afwa, afvy, str, account, afvo, syncRequest, callerInfo));
        bnsi d2 = f64909a.mo68390d();
        d2.mo68432a("afxe", "a", 49, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d2.mo68409a("Operation '%s' dispatched!", syncRequest.f80029a.f64622e);
    }

    /* renamed from: a */
    public final void mo35038a(afvo afvo, TeleportingSyncRequest teleportingSyncRequest, CallerInfo callerInfo) {
        mo35037a(afvo, teleportingSyncRequest.f80033a, callerInfo);
    }
}
