package com.google.android.gms.magictether.host;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiConfiguration;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.auth.proximity.RemoteDevice;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ConnectTetheringResponder$TetheringResultReceiver extends ResultReceiver {

    /* renamed from: a */
    public boolean f79806a = false;

    /* renamed from: b */
    private final Context f79807b;

    /* renamed from: c */
    private final RemoteDevice f79808c;

    /* renamed from: d */
    private final afbf f79809d;

    /* renamed from: e */
    private final afby f79810e;

    /* renamed from: f */
    private final afca f79811f;

    /* renamed from: g */
    private final afat f79812g;

    public ConnectTetheringResponder$TetheringResultReceiver(Context context, afat afat, RemoteDevice remoteDevice, afbf afbf, afby afby) {
        super(new adzt());
        this.f79807b = context;
        this.f79812g = afat;
        this.f79808c = remoteDevice;
        this.f79809d = afbf;
        this.f79810e = afby;
        this.f79811f = afbz.m52827a(afby);
    }

    /* renamed from: a */
    private static final void m67135a() {
        try {
            rpr b = rpr.m34216b();
            Intent flags = new Intent().setClassName(b, "com.google.android.gms.magictether.host.ProvisioningFailedDialogActivity").setFlags(268435456);
            String string = b.getString(C0126R.string.magictether_provisioning_failed_host_dialog_title);
            String string2 = b.getString(C0126R.string.magictether_provisioning_failed_host_dialog_content);
            flags.putExtra("dialog_content_title", string);
            flags.putExtra("dialog_content_message", string2);
            PendingIntent.getActivity(b, 0, flags, 134217728).send();
        } catch (PendingIntent.CanceledException e) {
            afaa.f64073f.mo25418e("Failed to show \"provisioning failed\" dialog.", new Object[0]);
        }
    }

    /* access modifiers changed from: protected */
    public final void onReceiveResult(int i, Bundle bundle) {
        sek sek = afaa.f64073f;
        if (i == 0) {
            new afai(this.f79807b).mo34694b("com.google.android.gms.magictether.HAS_FINISHED_FIRST_TIME_SETUP", true);
        }
        if (!this.f79806a) {
            bxvd da = afbe.f64117f.mo74144da();
            afbf afbf = this.f79809d;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            afbe afbe = (afbe) da.f164949b;
            afbf.getClass();
            afbe.f64123e = afbf;
            afbe.f64119a |= 8;
            afaq a = afap.m52790a(rpr.m34216b());
            if (i == 0) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                afbe afbe2 = (afbe) da.f164949b;
                afbe2.f64120b = 1;
                afbe2.f64119a |= 1;
                WifiConfiguration a2 = this.f79810e.mo34730a();
                String str = a2.SSID;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                afbe afbe3 = (afbe) da.f164949b;
                str.getClass();
                afbe3.f64119a = 2 | afbe3.f64119a;
                afbe3.f64121c = str;
                String str2 = a2.preSharedKey;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                afbe afbe4 = (afbe) da.f164949b;
                str2.getClass();
                afbe4.f64119a |= 4;
                afbe4.f64122d = str2;
                AutoDisconnectIntentOperation.m67134a(this.f79808c.f11138b);
                afcg.m52833a().mo34740a(ApDisablingIntentOperation.m67131a(rpr.m34216b()));
                a.mo34715a(true);
            } else {
                if (i == 1) {
                    a.mo34715a(false);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    afbe afbe5 = (afbe) da.f164949b;
                    afbe5.f64120b = 2;
                    afbe5.f64119a = 1 | afbe5.f64119a;
                } else if (i == 2) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    afbe afbe6 = (afbe) da.f164949b;
                    afbe6.f64120b = 6;
                    afbe6.f64119a = 1 | afbe6.f64119a;
                } else if (i != 3) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    afbe afbe7 = (afbe) da.f164949b;
                    afbe7.f64120b = 0;
                    afbe7.f64119a = 1 | afbe7.f64119a;
                } else {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    afbe afbe8 = (afbe) da.f164949b;
                    afbe8.f64120b = 7;
                    afbe8.f64119a = 1 | afbe8.f64119a;
                }
                m67135a();
                this.f79811f.mo34736b();
            }
            this.f79812g.mo34717a((afbe) da.mo74062i());
            return;
        }
        afal.m52785a(this.f79807b).mo34712a();
        this.f79811f.mo34736b();
    }
}
