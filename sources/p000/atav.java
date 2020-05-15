package p000;

import com.google.android.gms.notifications.Identifier;
import com.google.android.gms.notifications.ReadStateUpdate;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: atav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atav {

    /* renamed from: a */
    private static final srn f89975a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    private final String f89976b;

    /* renamed from: c */
    private final String f89977c;

    /* renamed from: d */
    private final ReadStateUpdate f89978d;

    /* renamed from: e */
    private final rjx f89979e;

    public atav(askf askf, blci blci, int i) {
        long j;
        String str;
        this.f89976b = askf.f89124b;
        this.f89977c = askf.f89123a;
        String str2 = blci.f125927c;
        String str3 = blci.f125926b;
        int i2 = blci.f125925a;
        if ((i2 & 128) != 0) {
            j = blci.f125929e;
        } else {
            j = 0;
        }
        if ((i2 & 4) != 0) {
            blde blde = blci.f125928d;
            str = (blde == null ? blde.f126049d : blde).f126052b;
        } else {
            str = null;
        }
        Identifier identifier = new Identifier(1, str2, str3, j, str, null);
        int i3 = i - 1;
        if (i != 0) {
            this.f89978d = new ReadStateUpdate(1, i3, identifier);
            this.f89979e = akno.m60093a(askf.f89126d.getApplicationContext());
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo49773a() {
        try {
            rjx rjx = this.f89979e;
            String str = this.f89976b;
            String str2 = this.f89977c;
            ReadStateUpdate readStateUpdate = this.f89978d;
            roz b = rpa.m34196b();
            b.f43472a = new akos(str, str2, readStateUpdate);
            aucu.m76783a(rjx.mo24732b(b.mo24977a()), 10, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            bnsl bnsl = (bnsl) f89975a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atav", "a", 49, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to update Guns read state");
        }
    }
}
