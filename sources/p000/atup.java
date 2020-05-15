package p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraService;

/* renamed from: atup */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atup extends atvb {

    /* renamed from: a */
    private static final srn f90922a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    private final askf f90923b;

    /* renamed from: c */
    private final String f90924c;

    /* renamed from: h */
    private final atgf f90925h;

    /* renamed from: i */
    private final atgn f90926i;

    public atup(askf askf, Messenger messenger, TokenizePanChimeraService tokenizePanChimeraService, String str, atgn atgn) {
        super(tokenizePanChimeraService);
        sdo.m34959a(askf);
        sdo.m34959a(messenger);
        this.f90923b = askf;
        this.f90986e = messenger;
        this.f90924c = str;
        this.f90926i = atgn;
        this.f90925h = atgf.m75807a(askf.f89126d);
    }

    /* renamed from: a */
    public static Message m76401a(AccountInfo accountInfo, String str, Handler handler, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("data_bundle_type", str2);
        return m76438a(19, bundle, accountInfo, str, handler);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            this.f90925h.mo49943b(this.f90923b.f89124b);
        } catch (bres e) {
            bnsl bnsl = (bnsl) f90922a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atup", "a", 71, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error while getting MFI cards list.");
        }
        atgt a = atgt.m75868a(this.f90924c);
        if (a != atgt.ID || cgwn.f187872a.mo6606a().mo84634o()) {
            bnsl bnsl2 = (bnsl) f90922a.mo68390d();
            bnsl2.mo68432a("atup", "a", 83, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Reading default card data for %s", a);
            try {
                int a2 = this.f90926i.mo49944a(a);
                bnsl bnsl3 = (bnsl) f90922a.mo68390d();
                bnsl3.mo68432a("atup", "a", 86, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68420a("Default card status %s", String.valueOf(a2));
                return Integer.valueOf(a2);
            } catch (bres e2) {
                bnsl bnsl4 = (bnsl) f90922a.mo68388c();
                bnsl4.mo68437a(e2);
                bnsl4.mo68432a("atup", "a", 89, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68405a("Error while reading MFI default card.");
                this.f90988g = atgh.m75822b(e2);
                return null;
            } catch (asks e3) {
                bnsl bnsl5 = (bnsl) f90922a.mo68387b();
                bnsl5.mo68437a(e3);
                bnsl5.mo68432a("atup", "a", 92, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl5.mo68420a("SQLite error while reading default card for %s", a);
                this.f90988g = 101;
                return null;
            }
        } else {
            this.f90988g = 102;
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Integer mo50199a(Void... voidArr) {
        try {
            this.f90925h.mo49943b(this.f90923b.f89124b);
        } catch (bres e) {
            bnsl bnsl = (bnsl) f90922a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atup", "a", 71, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error while getting MFI cards list.");
        }
        atgt a = atgt.m75868a(this.f90924c);
        if (a != atgt.ID || cgwn.f187872a.mo6606a().mo84634o()) {
            bnsl bnsl2 = (bnsl) f90922a.mo68390d();
            bnsl2.mo68432a("atup", "a", 83, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Reading default card data for %s", a);
            try {
                int a2 = this.f90926i.mo49944a(a);
                bnsl bnsl3 = (bnsl) f90922a.mo68390d();
                bnsl3.mo68432a("atup", "a", 86, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68420a("Default card status %s", String.valueOf(a2));
                return Integer.valueOf(a2);
            } catch (bres e2) {
                bnsl bnsl4 = (bnsl) f90922a.mo68388c();
                bnsl4.mo68437a(e2);
                bnsl4.mo68432a("atup", "a", 89, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68405a("Error while reading MFI default card.");
                this.f90988g = atgh.m75822b(e2);
                return null;
            } catch (asks e3) {
                bnsl bnsl5 = (bnsl) f90922a.mo68387b();
                bnsl5.mo68437a(e3);
                bnsl5.mo68432a("atup", "a", 92, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl5.mo68420a("SQLite error while reading default card for %s", a);
                this.f90988g = 101;
                return null;
            }
        } else {
            this.f90988g = 102;
            return null;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo50195a(Object obj) {
        Message message;
        Integer num = (Integer) obj;
        if (num == null) {
            try {
                message = Message.obtain((Handler) null, this.f90988g);
            } catch (RemoteException e) {
                return;
            }
        } else {
            Bundle bundle = new Bundle();
            bundle.putSerializable("data_felica_current_default", num);
            message = Message.obtain((Handler) null, 19001);
            message.setData(bundle);
        }
        this.f90986e.send(message);
    }
}
