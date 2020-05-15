package p000;

import android.app.KeyguardManager;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.fido.fido2.pollux.CableAuthenticatorScan$2;
import com.google.android.gms.fido.fido2.pollux.UserApprovalPromptController$1;

/* renamed from: xsx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xsx implements bqfp {

    /* renamed from: a */
    final /* synthetic */ CableAuthenticatorScan$2 f53009a;

    public xsx(CableAuthenticatorScan$2 cableAuthenticatorScan$2) {
        this.f53009a = cableAuthenticatorScan$2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: xdx.a(xjx, boolean):java.security.Signature
     arg types: [xjx, int]
     candidates:
      xdx.a(java.lang.String, xkb):boolean
      xdx.a(xkb, java.lang.String):boolean
      xdx.a(xjx, boolean):java.security.Signature */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Intent intent;
        xjm xjm = (xjm) obj;
        if (xjm == null) {
            xsz.f53015k.mo25414c("Unable to resolve the scan result.", new Object[0]);
            xsz xsz = this.f53009a.f31848a;
            xsz.f53022g.mo30194a(xsz.f53016a, xaj.TYPE_CABLE_CLIENT_EID_INVALID);
            return;
        }
        xsz xsz2 = this.f53009a.f31848a;
        sek sek = xsz.f53015k;
        if (!xsz2.f53021f.compareAndSet(xsy.SCANNING, xsy.SCAN_COMPLETED)) {
            xsz.f53015k.mo25414c("Ignore the current session since another session is running.", new Object[0]);
            xsz xsz3 = this.f53009a.f31848a;
            xsz3.f53022g.mo30194a(xsz3.f53016a, xaj.TYPE_CABLE_CLIENT_EID_RESOLVED);
            return;
        }
        this.f53009a.f31848a.f53016a.f53296b = xjm.f52427b;
        xsz xsz4 = this.f53009a.f31848a;
        xsz4.f53022g.mo30194a(xsz4.f53016a, xaj.TYPE_CABLE_CLIENT_EID_RESOLVED);
        xta xta = this.f53009a.f31848a.f53025j;
        xtk.f53046k.mo25414c("  Client found, isSilentFlow=%s", Boolean.valueOf(xta.f53026a.f53056j));
        xtk xtk = xta.f53026a;
        if (!xtk.f53056j) {
            if (xtk.f53052f == xtj.SCANNING_FOR_CLIENT) {
                z = true;
            } else {
                z = false;
            }
            sdo.m34970a(z);
            xtk.f53052f = xtj.WAITING_FOR_USER_APPROVAL;
            xtk.f53046k.mo25414c("State: WAITING_FOR_USER_APPROVAL", new Object[0]);
            if (!((Boolean) xmn.f52752b.mo58455c()).booleanValue() || !xjm.f52430e.mo66813a() || !xka.STRONGBOX_KEY.equals(((xjx) xjm.f52430e.mo66814b()).mo29847a())) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                try {
                    xtk.f53050d.mo29670a((xjx) xjm.f52430e.mo66814b(), true);
                } catch (xma e) {
                    xtk.f53046k.mo25417e("Error initializing signature for StrongBox key", e, new Object[0]);
                    z3 = false;
                }
            }
            z3 = z2;
            Context context = xtk.f53047a;
            xtk.f53053g = new xuh(xtk.f53048b, context, new xtb(xtk, xjm), xjm.f52431f, new xug(context), z3, xtk.f53051e);
            xuh xuh = xtk.f53053g;
            if (xuh.f53159g == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            sdo.m34970a(z4);
            KeyguardManager keyguardManager = (KeyguardManager) xuh.f53154b.getSystemService("keyguard");
            if (keyguardManager == null || !keyguardManager.isKeyguardLocked()) {
                xuh.mo30155b();
            } else {
                if (xuh.f53158f == null) {
                    xuh.f53158f = new UserApprovalPromptController$1(xuh, "fido");
                    xuh.f53152i.mo25414c("Registering screenUnlockReceiver.", new Object[0]);
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.USER_PRESENT");
                    xuh.f53154b.registerReceiver(xuh.f53158f, intentFilter);
                }
                if (cdwo.f181843a.mo6606a().mo78398b()) {
                    intent = new Intent().setClassName("com.google.android.gms", "DUMMY_CLASS");
                } else {
                    intent = new Intent();
                }
                PendingIntent broadcast = PendingIntent.getBroadcast(xuh.f53154b, 0, intent, 201326592);
                xug xug = xuh.f53155c;
                bmxv b = bmxv.m108566b(xuh.f53156d);
                xug.f53149c.mo25412b("showNotification", new Object[0]);
                Bundle bundle = new Bundle();
                int i = Build.VERSION.SDK_INT;
                bundle.putString("android.substName", xug.f53150a.getString(C0126R.string.common_google));
                String string = xug.f53150a.getString(C0126R.string.fido_paask_notification_title);
                C1102je jeVar = new C1102je(xug.f53150a, "fido.pollux_notification_channel");
                jeVar.mo13630b(qkj.m32287a(xug.f53150a, C0126R.C0127drawable.quantum_ic_lock_grey600_24));
                jeVar.mo13640e(string);
                jeVar.mo13632b((String) ((bmyg) b).f131198a);
                jeVar.mo13621a(BitmapFactory.decodeResource(xug.f53150a.getResources(), C0126R.C0127drawable.product_logo_googleg_color_48));
                jeVar.f22270v = bundle;
                jeVar.mo13627a(true);
                jeVar.f22272x = 1;
                int i2 = Build.VERSION.SDK_INT;
                sex.m35104a(xug.f53150a).mo25442a(new NotificationChannel("fido.pollux_notification_channel", xug.f53150a.getString(C0126R.string.fido_paask_notification_channel), 3));
                jeVar.f22254f = broadcast;
                xug.f53151b.mo25459a("PolluxNotifications", 1, jeVar.mo13629b());
                xuh.f53159g = 2;
                xuh.f53157e.mo30194a(xuh.f53153a, xaj.TYPE_USER_SHOWN_NOTIFICATION);
            }
            xtk.mo30120a(180000, xaj.TYPE_TIMEOUT_USER_INTERACTION_DURATION_EXCEEDED);
        } else {
            xtk.mo30121a(xjm);
        }
        this.f53009a.f31848a.mo30114a();
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        if (th instanceof iot) {
            iot iot = (iot) th;
            sek sek = xsz.f53015k;
            String valueOf = String.valueOf(iov.m15809b(iot.mo24655a()));
            sek.mo25417e(valueOf.length() == 0 ? new String("Error using v2 credentials: ") : "Error using v2 credentials: ".concat(valueOf), iot, new Object[0]);
            return;
        }
        xsz.f53015k.mo25417e("Error when creating CableAuthenticationData", th, new Object[0]);
    }
}
