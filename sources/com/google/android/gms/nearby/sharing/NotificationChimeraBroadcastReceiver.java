package com.google.android.gms.nearby.sharing;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.text.DateFormat;
import java.util.Date;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NotificationChimeraBroadcastReceiver extends IntentOperation {

    /* renamed from: a */
    public ahgp f80923a;

    /* renamed from: b */
    private ajty f80924b;

    /* renamed from: c */
    private ajwp f80925c;

    public NotificationChimeraBroadcastReceiver() {
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        this.f80924b = ahcb.m55442c(this);
        this.f80923a = ahgp.m55715a(this);
        this.f80925c = ajwp.m59150a(getApplicationContext());
    }

    public final void onHandleIntent(Intent intent) {
        if (!cfov.m142066s()) {
            return;
        }
        if (intent.getAction() == null) {
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Received unexpected broadcast with no action");
        } else if (!"com.google.android.gms.nearby.sharing.ACTION_DISMISS".equals(intent.getAction()) || !"nearby_sharing_alert".equals(intent.getStringExtra("channel_id"))) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("share_target_bytes");
            if (byteArrayExtra != null) {
                try {
                    ShareTarget shareTarget = (ShareTarget) akik.m59825a(byteArrayExtra, ShareTarget.CREATOR);
                    char c = 65535;
                    int intExtra = intent.getIntExtra("notification_id", -1);
                    String action = intent.getAction();
                    switch (action.hashCode()) {
                        case -1796513094:
                            if (action.equals("com.google.android.gms.nearby.sharing.ACTION_DISMISS")) {
                                c = 3;
                                break;
                            }
                            break;
                        case -1258243400:
                            if (action.equals("com.google.android.gms.nearby.sharing.ACTION_ACCEPT")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -1202506710:
                            if (action.equals("com.google.android.gms.nearby.sharing.ACTION_CANCEL")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -769492657:
                            if (action.equals("com.google.android.gms.nearby.sharing.ACTION_REJECT")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 119790586:
                            if (action.equals("com.google.android.gms.nearby.sharing.ACTION_OPEN")) {
                                c = 4;
                                break;
                            }
                            break;
                    }
                    if (c != 0) {
                        if (c == 1) {
                            this.f80924b.mo38911d(shareTarget);
                        } else if (c == 2 || c == 3) {
                            this.f80924b.mo38907b(shareTarget);
                        } else if (c == 4) {
                            this.f80924b.mo38909c(shareTarget);
                        }
                        this.f80923a.mo36453a("nearby_sharing", intExtra);
                        return;
                    }
                    this.f80924b.mo38897a(shareTarget).mo50372a(new ajmy(this, intExtra));
                } catch (IllegalArgumentException e) {
                    bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
                    bnsl.mo68437a(e);
                    bnsl.mo68405a("Received unexpected broadcast with invalid share target");
                }
            } else {
                ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Received unexpected broadcast with no share target");
            }
        } else {
            ajwp ajwp = this.f80925c;
            ajwp.mo39010c().edit().putLong("most_recent_notification_dismissed_timestamp", ajwp.f71451a.mo20505a()).apply();
            String format = DateFormat.getDateTimeInstance().format(new Date(System.currentTimeMillis() + cfov.m142072y()));
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl2.mo68432a("ajwp", "a", 76, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("User dismissed the fast init notification. Not showing the notification until %s.", format);
        }
    }

    NotificationChimeraBroadcastReceiver(ajty ajty, ahgp ahgp, ajwp ajwp) {
        this.f80924b = ajty;
        this.f80923a = ahgp;
        this.f80925c = ajwp;
    }
}
