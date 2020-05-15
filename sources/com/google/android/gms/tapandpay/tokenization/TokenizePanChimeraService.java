package com.google.android.gms.tapandpay.tokenization;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.IBinder;
import android.os.Messenger;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TokenizePanChimeraService extends Service {

    /* renamed from: a */
    public static final srn f108922a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: e */
    public static atrl f108923e = atrl.f90709a;

    /* renamed from: b */
    public int f108924b = 0;

    /* renamed from: c */
    public ConnectivityManager f108925c;

    /* renamed from: d */
    final Messenger f108926d = new Messenger(new atrm(this));

    /* renamed from: a */
    public final void mo59486a() {
        int i = this.f108924b - 1;
        this.f108924b = i;
        if (i == 0) {
            stopSelf();
        }
    }

    public final IBinder onBind(Intent intent) {
        return this.f108926d.getBinder();
    }

    public final void onCreate() {
        super.onCreate();
        if (this.f108925c == null) {
            this.f108925c = (ConnectivityManager) getSystemService("connectivity");
        }
    }
}
