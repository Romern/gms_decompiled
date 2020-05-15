package p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraService;

/* renamed from: atuz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atuz extends atvb {

    /* renamed from: b */
    private static final srn f90971b = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    final atgf f90972a;

    /* renamed from: c */
    private final askf f90973c;

    public atuz(askf askf, Messenger messenger, TokenizePanChimeraService tokenizePanChimeraService) {
        super(tokenizePanChimeraService);
        sdo.m34959a(askf);
        sdo.m34959a(messenger);
        this.f90973c = askf;
        this.f90986e = messenger;
        this.f90972a = atgf.m75807a(askf.f89126d);
    }

    /* renamed from: a */
    public static Message m76430a(AccountInfo accountInfo, String str, Handler handler) {
        return m76438a(20, new Bundle(), accountInfo, str, handler);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            this.f90972a.mo49943b(this.f90973c.f89124b);
            return true;
        } catch (bres e) {
            bnsl bnsl = (bnsl) f90971b.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atuz", "a", 53, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error while getting MFI cards list.");
            this.f90988g = atgh.m75822b(e);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Boolean mo50217a(Void... voidArr) {
        try {
            this.f90972a.mo49943b(this.f90973c.f89124b);
            return true;
        } catch (bres e) {
            bnsl bnsl = (bnsl) f90971b.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atuz", "a", 53, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error while getting MFI cards list.");
            this.f90988g = atgh.m75822b(e);
            return false;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo50195a(Object obj) {
        Message message;
        if (!((Boolean) obj).booleanValue()) {
            message = Message.obtain((Handler) null, this.f90988g);
        } else {
            message = Message.obtain((Handler) null, 20001);
        }
        try {
            this.f90986e.send(message);
        } catch (RemoteException e) {
        }
    }
}
