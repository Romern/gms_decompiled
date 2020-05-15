package com.google.android.gms.smartdevice.fastpair;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.smartdevice.setup.p066ui.DiscoveryChimeraActivity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NotificationBehaviorIntentOperation extends IntentOperation {

    /* renamed from: b */
    private static final sek f108073b = ascp.m73787a("Fastpair", "NotificationBehaviorIntentOperation");

    /* renamed from: a */
    bxvd f108074a = bowb.f135084g.mo74144da();

    /* renamed from: a */
    public static PendingIntent m92772a(Context context, String str, int i, byte[] bArr, byte[] bArr2) {
        Intent startIntent = IntentOperation.getStartIntent(context, NotificationBehaviorIntentOperation.class, str);
        bmxy.m108582a(startIntent, "Error getting NotificationBehaviorIntentOperation.");
        startIntent.putExtra("key_for_notification_id", i);
        startIntent.putExtra("key_for_notification_log", bArr);
        if (bArr2 != null) {
            startIntent.putExtra("key_for_fastpair_code", bArr2);
        }
        PendingIntent pendingIntent = IntentOperation.getPendingIntent(context, NotificationBehaviorIntentOperation.class, startIntent, 0, 134217728);
        bmxy.m108582a(pendingIntent, "Getting null PendingIntent.");
        return pendingIntent;
    }

    public final void onHandleIntent(Intent intent) {
        sek sek = f108073b;
        String valueOf = String.valueOf(intent.getAction());
        sek.mo25409a(valueOf.length() == 0 ? new String("onHandleIntent(). Action: ") : "onHandleIntent(). Action: ".concat(valueOf), new Object[0]);
        String action = intent.getAction();
        try {
            bowb bowb = (bowb) GeneratedMessageLite.m124014a(bowb.f135084g, intent.getByteArrayExtra("key_for_notification_log"));
            bxvd bxvd = (bxvd) bowb.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) bowb);
            this.f108074a = bxvd;
        } catch (bxwf e) {
            f108073b.mo25410a((Throwable) e);
        }
        bovz bovz = ((bowb) this.f108074a.f164949b).f135089d;
        if (bovz == null) {
            bovz = bovz.f135078d;
        }
        bxvd bxvd2 = (bxvd) bovz.mo74142c(5);
        bxvd2.mo73625a((GeneratedMessageLite) bovz);
        if ("com.google.android.gms.smartdevice.fastpair.DISMISS".equals(action)) {
            f108073b.mo25412b("Notification gets dismissed.", new Object[0]);
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bovz bovz2 = (bovz) bxvd2.f164949b;
            bovz2.f135081b = 2;
            bovz2.f135080a |= 1;
            bxvd bxvd3 = this.f108074a;
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            bowb bowb2 = (bowb) bxvd3.f164949b;
            bovz bovz3 = (bovz) bxvd2.mo74062i();
            bowb bowb3 = bowb.f135084g;
            bovz3.getClass();
            bowb2.f135089d = bovz3;
            bowb2.f135086a |= 4;
            mo59138a(this.f108074a);
            return;
        }
        sex a = sex.m35104a(this);
        int intExtra = intent.getIntExtra("key_for_notification_id", 0);
        if (!(a == null || intExtra == 0)) {
            a.mo25440a(intExtra);
        }
        if ("com.google.android.gms.smartdevice.fastpair.OPEN".equals(action)) {
            f108073b.mo25412b("Notification gets clicked.", new Object[0]);
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bovz bovz4 = (bovz) bxvd2.f164949b;
            bovz4.f135081b = 1;
            bovz4.f135080a |= 1;
        } else if ("com.google.android.gms.smartdevice.fastpair.OPEN_ACTION".equals(action)) {
            f108073b.mo25412b("Notification action gets clicked.", new Object[0]);
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bovz bovz5 = (bovz) bxvd2.f164949b;
            bovz5.f135081b = 3;
            bovz5.f135080a |= 1;
        }
        byte[] byteArrayExtra = intent.getByteArrayExtra("key_for_fastpair_code");
        bxvd bxvd4 = this.f108074a;
        if (bxvd4.f164950c) {
            bxvd4.mo74035c();
            bxvd4.f164950c = false;
        }
        bowb bowb4 = (bowb) bxvd4.f164949b;
        bovz bovz6 = (bovz) bxvd2.mo74062i();
        bowb bowb5 = bowb.f135084g;
        bovz6.getClass();
        bowb4.f135089d = bovz6;
        bowb4.f135086a |= 4;
        Intent a2 = DiscoveryChimeraActivity.m92955a(this);
        a2.putExtra("android.intent.extra.REFERRER_NAME", "fastpair");
        if (byteArrayExtra != null) {
            a2.putExtra("key_for_fastpair_code", byteArrayExtra);
        }
        a2.addFlags(536870912);
        a2.addFlags(268435456);
        startActivity(a2);
        mo59138a(this.f108074a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo59138a(bxvd bxvd) {
        qws qws = new qws(this, "SMART_SETUP", null);
        f108073b.mo25409a(((bowb) bxvd.mo74062i()).toString(), new Object[0]);
        if (cgqa.m146531b()) {
            bxvd da = bovc.f134986j.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bovc bovc = (bovc) da.f164949b;
            bowb bowb = (bowb) bxvd.mo74062i();
            bowb.getClass();
            bovc.f134996i = bowb;
            bovc.f134988a |= 128;
            qws.mo24333a((bovc) da.mo74062i()).mo24327b();
            return;
        }
        qws.mo24335a(((bowb) bxvd.mo74062i()).mo73642k()).mo24327b();
    }
}
