package com.google.android.gms.tapandpay.hce.service;

import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.chimera.HostApduService;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TpHceChimeraService extends HostApduService implements asud {

    /* renamed from: a */
    private static final srn f108517a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    private asue f108518b;

    public final void onCreate() {
        bnsl a = f108517a.mo26019b(aske.m74275a());
        a.mo68432a("com.google.android.gms.tapandpay.hce.service.TpHceChimeraService", "onCreate", 52, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        a.mo68405a("onCreate");
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (this.f108518b == null) {
            asuc instance = asuc.getInstance();
            this.f108518b = instance;
            asuc asuc = instance;
            asuc.f89742a.execute(new astw(asuc, getApplicationContext()));
        }
    }

    public final void onDeactivated(int i) {
        bnsl a = f108517a.mo26019b(aske.m74275a());
        a.mo68432a("com.google.android.gms.tapandpay.hce.service.TpHceChimeraService", "onDeactivated", 75, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        a.mo68409a("onDeactivated reason: %s", i);
        int i2 = Build.VERSION.SDK_INT;
        if (!cgwn.f187872a.mo6606a().mo84623d()) {
            asue asue = this.f108518b;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            asuc asuc = (asuc) asue;
            asuc.f89743b = elapsedRealtime;
            asuc.f89742a.execute(new asua(asuc, getApplicationContext(), i, elapsedRealtime));
            return;
        }
        throw new RuntimeException("Simulated crash");
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i = Build.VERSION.SDK_INT;
        try {
            String a = asix.m74199a(this, askc.m74272b());
            if (a != null) {
                String b = askc.m74272b();
                atds a2 = atds.m75666a(new askf(a, (String) bmxu.m108565a(asjg.m74212a(a), "unknown"), b, this));
                asts asts = new asts();
                if (strArr.length == 0 || strArr[0].equals("cards")) {
                    printWriter.println("User's cards:");
                    try {
                        for (CardInfo cardInfo : a2.mo49845a().f108369a) {
                            printWriter.println(cardInfo);
                        }
                    } catch (asks e) {
                    }
                }
                if (strArr.length == 0 || strArr[0].equals("bundles")) {
                    printWriter.println("User bundles:");
                    try {
                        List b2 = asts.mo49780b(this, b);
                        int size = b2.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            Pair pair = (Pair) b2.get(i2);
                            try {
                                printWriter.println(atbm.m75384a((askf) pair.first, (String) pair.second));
                            } catch (asks | atdb | aths e2) {
                            }
                        }
                    } catch (asks e3) {
                    }
                }
            } else {
                printWriter.println("No active account id");
            }
        } catch (asks e4) {
            printWriter.println("Unable to read active account id");
        }
    }

    public final byte[] processCommandApdu(byte[] bArr, Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
        asue asue = this.f108518b;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        asuc asuc = (asuc) asue;
        asuc.f89742a.execute(new astz(asuc, getApplicationContext(), bArr, elapsedRealtime, this));
        return null;
    }
}
