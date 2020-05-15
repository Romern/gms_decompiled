package com.google.android.gms.auth.account;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AuthInitIntentOperation extends qlf {

    /* renamed from: a */
    protected static final String[] f9951a = {"com.google.android.gms.auth.setup.devicesignals.LockScreenReceiver", "com.google.android.gms.auth.account.accounttransfer.AccountTransferReceiver", "com.google.android.gms.auth.account.data.WorkAccountStoreReceiver", "com.google.android.gms.auth.frp.FreUnlockActivity", "com.google.android.gms.auth.uiflows.addaccount.FinishSessionActivity", "com.google.android.gms.auth.uiflows.addaccount.DmSetScreenlockActivity", "com.google.android.gms.auth.uiflows.addaccount.UncertifiedNotificationActivity", "com.google.android.gms.auth.uiflows.consent.BrowserConsentActivity", "com.google.android.gms.auth.uiflows.factoryreset.PreFactoryResetActivity", "com.google.android.gms.auth.uiflows.removeaccount.GetAccountRemovalAllowedActivity", "com.google.android.gms.auth.account.mdm.GcmReceiverService", "com.google.android.gms.auth.account.visibility.RequestAccountsAccessActivity"};

    /* renamed from: b */
    protected static final String[] f9952b = {"com.google.android.gms.auth.uiflows.addaccount.DmDownloadInstallActivity", "com.google.android.gms.auth.uiflows.addaccount.GoogleServicesActivity"};

    /* renamed from: c */
    private static final gim[] f9953c = {jut.f23268a, jdw.f22237a, gki.f18394a, gle.f18457a, gsc.f18934a, glg.f18460a, gln.f18476a};

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        gim[] gimArr = f9953c;
        String action = intent.getAction();
        StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 59);
        sb.append("Initializing Auth, action is ");
        sb.append(action);
        sb.append(" ,InitRuntimeState=");
        sb.append(i);
        sb.toString();
        int i2 = i & 2;
        int i3 = i & 12;
        for (int i4 = 0; i4 < 7; i4++) {
            gim gim = gimArr[i4];
            if (i2 > 0) {
                gim.mo11908b(this);
            }
            if (i3 > 0) {
                gim.mo11907a(this);
            }
            if (i2 > 0 || i3 > 0) {
                gim.mo11909c(this);
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.auth.account.AuthInitIntentOperation, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6268a(Intent intent, boolean z) {
        bmxr a = bmxr.m108544a("; ").mo66873a();
        String[] strArr = f9951a;
        String a2 = a.mo66876a((Object[]) strArr);
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 33);
        sb.append("Enabling ");
        sb.append(strArr.length);
        sb.append(" components: ");
        sb.append(a2);
        sb.toString();
        for (String str : f9951a) {
            spn.m35856a((Context) this, str, true);
        }
        String[] strArr2 = f9952b;
        String a3 = a.mo66876a((Object[]) strArr2);
        StringBuilder sb2 = new StringBuilder(String.valueOf(a3).length() + 34);
        sb2.append("Disabling ");
        sb2.append(strArr2.length);
        sb2.append(" components: ");
        sb2.append(a3);
        sb2.toString();
        for (String str2 : f9952b) {
            spn.m35856a((Context) this, str2, false);
        }
    }
}
