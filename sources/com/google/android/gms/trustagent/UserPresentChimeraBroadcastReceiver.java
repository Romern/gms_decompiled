package com.google.android.gms.trustagent;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Map;
import java.util.Random;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UserPresentChimeraBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: b */
    private static final aunx f109140b = new aunx("TrustAgent", "UserPresentChimeraBroadcastReceiver");

    /* renamed from: c */
    private SharedPreferences f109141c;

    /* renamed from: a */
    private final void m93411a(boolean z, long j, boolean z2) {
        SharedPreferences.Editor edit = this.f109141c.edit();
        edit.putBoolean("coffee_last_known_is_keyguard_secure", z);
        edit.putLong("coffee_last_is_keyguard_secure_set_timestamp_seconds", j);
        edit.putBoolean("coffee_last_is_keyguard_secure_set_timestamp_confirmed", z2);
        if (!z) {
            edit.remove("screen_lock_set_from");
        }
        edit.apply();
    }

    public final void onReceive(Context context, Intent intent) {
        bohi bohi;
        int i = Build.VERSION.SDK_INT;
        if (cgzt.m147784i() && ((double) new Random().nextFloat()) < cgzt.m147785j()) {
            f109140b.mo50711a("Received %s.", intent);
            aurj a = aurj.m77699a();
            bogj bogj = (bogj) bohi.f133070z.mo74144da();
            this.f109141c = aupo.m77578a(context);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f109141c.getLong("coffee_last_log_trustlet_configuration_key", 0) >= ((long) ((int) cgzt.f188132a.mo6606a().mo84833r()))) {
                synchronized (a.f92324a) {
                    bohi = a.f92326c;
                }
                bxvd bxvd = (bxvd) bohi.mo74142c(5);
                bxvd.mo73625a((bxvk) bohi);
                bogj = (bogj) bxvd;
                bxvd da = bogx.f133038d.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bogx bogx = (bogx) da.f164949b;
                bogx.f133040a |= 1;
                bogx.f133041b = true;
                for (Map.Entry<String, ?> entry : this.f109141c.getAll().entrySet()) {
                    if (entry.getKey().startsWith("promotion_status_for_")) {
                        int a2 = bogv.m111189a(Integer.parseInt(entry.getKey().substring(21)));
                        int a3 = bogz.m111193a(((Integer) entry.getValue()).intValue());
                        bxvd da2 = bogw.f133033d.mo74144da();
                        if (a2 == 0) {
                            a2 = 1;
                        }
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bogw bogw = (bogw) da2.f164949b;
                        bogw.f133036b = a2 - 1;
                        int i2 = bogw.f133035a | 1;
                        bogw.f133035a = i2;
                        if (a3 == 0) {
                            a3 = 1;
                        }
                        bogw.f133037c = a3 - 1;
                        bogw.f133035a = i2 | 2;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bogx bogx2 = (bogx) da.f164949b;
                        bogw bogw2 = (bogw) da2.mo74062i();
                        bogw2.getClass();
                        if (!bogx2.f133042c.mo73666a()) {
                            bogx2.f133042c = bxvk.m124021a(bogx2.f133042c);
                        }
                        bogx2.f133042c.add(bogw2);
                    }
                }
                if (bogj.f164950c) {
                    bogj.mo74035c();
                    bogj.f164950c = false;
                }
                bohi bohi2 = (bohi) bogj.f164949b;
                bogx bogx3 = (bogx) da.mo74062i();
                bogx3.getClass();
                bohi2.f133094x = bogx3;
                bohi2.f133071a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                this.f109141c.edit().putLong("coffee_last_log_trustlet_configuration_key", currentTimeMillis).apply();
            }
            boolean isKeyguardSecure = ((KeyguardManager) context.getSystemService("keyguard")).isKeyguardSecure();
            if (bogj.f164950c) {
                bogj.mo74035c();
                bogj.f164950c = false;
            }
            bohi bohi3 = (bohi) bogj.f164949b;
            bohi3.f133072b = 99;
            bohi3.f133071a |= 1;
            boolean c = a.mo50826c();
            if (bogj.f164950c) {
                bogj.mo74035c();
                bogj.f164950c = false;
            }
            bohi bohi4 = (bohi) bogj.f164949b;
            int i3 = bohi4.f133071a | 128;
            bohi4.f133071a = i3;
            bohi4.f133078h = c;
            bohi4.f133071a = i3 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            bohi4.f133079i = isKeyguardSecure;
            boolean b = a.mo50825b();
            if (bogj.f164950c) {
                bogj.mo74035c();
                bogj.f164950c = false;
            }
            bohi bohi5 = (bohi) bogj.f164949b;
            bohi5.f133071a |= 512;
            bohi5.f133080j = b;
            boolean d = a.mo50827d();
            if (bogj.f164950c) {
                bogj.mo74035c();
                bogj.f164950c = false;
            }
            bohi bohi6 = (bohi) bogj.f164949b;
            bohi6.f133071a |= 2048;
            bohi6.f133087q = d;
            String string = this.f109141c.getString("screen_lock_set_from", "");
            if (string != null) {
                if (bogj.f164950c) {
                    bogj.mo74035c();
                    bogj.f164950c = false;
                }
                bohi bohi7 = (bohi) bogj.f164949b;
                string.getClass();
                bohi7.f133071a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                bohi7.f133093w = string;
            } else {
                if (bogj.f164950c) {
                    bogj.mo74035c();
                    bogj.f164950c = false;
                }
                bohi bohi8 = (bohi) bogj.f164949b;
                bohi8.f133071a &= -131073;
                bohi8.f133093w = bohi.f133070z.f133093w;
            }
            if (!this.f109141c.contains("coffee_last_known_is_keyguard_secure")) {
                m93411a(isKeyguardSecure, System.currentTimeMillis() / 1000, false);
            } else if (isKeyguardSecure != this.f109141c.getBoolean("coffee_last_known_is_keyguard_secure", false)) {
                long currentTimeMillis2 = (System.currentTimeMillis() / 1000) - this.f109141c.getLong("coffee_last_is_keyguard_secure_set_timestamp_seconds", 0);
                boolean z = this.f109141c.getBoolean("coffee_last_is_keyguard_secure_set_timestamp_confirmed", false);
                bxvd da3 = boha.f133044e.mo74144da();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                boha boha = (boha) da3.f164949b;
                int i4 = boha.f133046a | 1;
                boha.f133046a = i4;
                boha.f133047b = isKeyguardSecure;
                int i5 = i4 | 2;
                boha.f133046a = i5;
                boha.f133048c = currentTimeMillis2;
                boha.f133046a = i5 | 4;
                boha.f133049d = z;
                if (bogj.f164950c) {
                    bogj.mo74035c();
                    bogj.f164950c = false;
                }
                bohi bohi9 = (bohi) bogj.f164949b;
                boha boha2 = (boha) da3.mo74062i();
                boha2.getClass();
                bohi9.f133092v = boha2;
                bohi9.f133071a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                m93411a(isKeyguardSecure, System.currentTimeMillis() / 1000, true);
            }
            aupk.m77567a(context, (bohi) bogj.mo74062i());
        }
        aulj a4 = aulj.m77263a();
        synchronized (a4.f92037c) {
            if (a4.f92036b) {
                a4.mo50655b();
            }
        }
    }
}
