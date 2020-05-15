package com.google.android.gms.thunderbird;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class EmergencyPersistentChimeraService extends Service implements auhw {

    /* renamed from: a */
    private sns f109057a;

    /* renamed from: b */
    private Handler f109058b;

    /* renamed from: c */
    private auhy f109059c;

    /* renamed from: d */
    private auie f109060d;

    /* renamed from: a */
    private static boolean m93347a() {
        int i = Build.VERSION.SDK_INT;
        return cgyq.f188062a.mo6606a().mo84778v() && !TextUtils.isEmpty(cgyq.m147650h());
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        this.f109057a = new sns(9);
        this.f109058b = new snr(this.f109057a);
    }

    public final void onDestroy() {
        auhy auhy = this.f109059c;
        if (auhy != null) {
            auhy.f91856b.getContentResolver().unregisterContentObserver(auhy.f91857c);
        }
        auie auie = this.f109060d;
        if (auie != null) {
            auie.mo50549a();
        }
        sns sns = this.f109057a;
        if (sns != null) {
            sns.quit();
            this.f109057a = null;
        }
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        auie auie;
        int i3 = Build.VERSION.SDK_INT;
        if (this.f109059c != null) {
            int i4 = Build.VERSION.SDK_INT;
        } else {
            if (auho.m77070a()) {
                Log.d("Thunderbird", "starting outgoing sms listener");
            }
            auhy auhy = new auhy(this, this.f109058b, this);
            this.f109059c = auhy;
            auhy.mo50546a();
        }
        if (m93347a() && this.f109060d == null) {
            if (auho.m77070a()) {
                Log.d("Thunderbird", "starting location warm-up listener");
            }
            auie auie2 = new auie(this, this.f109058b);
            this.f109060d = auie2;
            if (auie2.f91870b.length > 0) {
                auie2.f91871c.mo25945a(auie2);
            }
        } else if (!m93347a() && (auie = this.f109060d) != null) {
            auie.mo50549a();
            this.f109060d = null;
        }
        if (this.f109059c != null || this.f109060d != null) {
            return 1;
        }
        stopSelf();
        return 1;
    }

    /* renamed from: a */
    public final void mo50545a(String str) {
        boolean z;
        Intent startIntent = IntentOperation.getStartIntent(this, OutgoingEmergencyIntentOperation.class, "thunderbird.intent.action.NEW_OUTGOING_SMS");
        if (startIntent != null) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108600b(z);
        startIntent.putExtra("android.intent.extra.PHONE_NUMBER", str);
        startService(startIntent);
    }
}
