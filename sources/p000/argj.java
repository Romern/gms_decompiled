package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.smartdevice.d2d.AccountTransferResult;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.d2d.utils.ProxyResultReceiver;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: argj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class argj implements ardz {

    /* renamed from: a */
    final /* synthetic */ argm f87660a;

    /* renamed from: b */
    private String f87661b;

    /* renamed from: c */
    private String f87662c;

    public argj(argm argm) {
        this.f87660a = argm;
    }

    /* renamed from: a */
    public final void mo48453a() {
        argm.f87667h.mo25409a("onCompleted called.", new Object[0]);
        argm argm = this.f87660a;
        if (argm.f87687r) {
            argm.f87688s = ((sny) argm.f87685p).schedule(new argh(this), cgps.m146494f(), TimeUnit.MILLISECONDS);
            return;
        }
        argm.mo48517a((List) argm.f87684o);
    }

    /* renamed from: b */
    public final void mo48460b(List list) {
        argm argm = this.f87660a;
        Context context = argm.f87678i;
        ProxyResultReceiver proxyResultReceiver = argm.f87682m;
        Context applicationContext = context.getApplicationContext();
        Intent intent = new Intent();
        intent.setClassName(context.getApplicationContext(), "com.google.android.gms.smartdevice.d2d.ui.TargetDirectTransferActivity");
        intent.addFlags(268468224);
        intent.putExtra("resultReceiver", proxyResultReceiver);
        intent.putExtra("extraAccountChallengeData", new ArrayList(list));
        PendingIntent activity = PendingIntent.getActivity(applicationContext, 8, intent, 134217728);
        argm.f87667h.mo25409a("Sending pending intent to listener", new Object[0]);
        argm.f87680k.mo48307a(activity);
    }

    /* renamed from: a */
    public final void mo48454a(int i, String str) {
        this.f87660a.mo48518b(i, str);
    }

    /* renamed from: a */
    public final void mo48455a(PendingIntent pendingIntent) {
        argm argm = this.f87660a;
        argm.f87667h.mo25409a("Sending pending intent (3pmfm) to listener", new Object[0]);
        argm.f87680k.mo48307a(pendingIntent);
    }

    /* renamed from: a */
    public final void mo48456a(BootstrapAccount bootstrapAccount) {
        this.f87660a.f87684o.add(new AccountTransferResult(bootstrapAccount, 2));
    }

    /* renamed from: a */
    public final void mo48457a(MessagePayload messagePayload) {
        this.f87660a.mo48252b(messagePayload);
    }

    /* renamed from: a */
    public final void mo48458a(String str, String str2) {
        argm.f87667h.mo25409a("onRestoreAccountInformationAvailable.", new Object[0]);
        if (this.f87660a.mo48520g()) {
            this.f87661b = str;
            this.f87660a.f87686q.f87100b = str2;
            if (!TextUtils.isEmpty(str)) {
                this.f87660a.f87686q.f87101c = new BootstrapAccount(str, "com.google");
            }
            this.f87662c = str2;
        }
    }

    /* renamed from: a */
    public final void mo48459a(List list) {
        this.f87660a.mo48516a(new ArrayList(list));
        if (this.f87660a.mo48520g()) {
            aqzq aqzq = this.f87660a.f87680k;
            ArrayList arrayList = new ArrayList(list);
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("accounts", arrayList);
            bundle.putBoolean("deviceOwnerSet", this.f87660a.f87690u.mo59041c().mo48320a(2));
            bundle.putString("restoreAccount", this.f87661b);
            bundle.putString("restoreToken", this.f87662c);
            BootstrapProgressResult bootstrapProgressResult = new BootstrapProgressResult(4, bundle);
            try {
                if (aqzq.f87169b.mo66813a()) {
                    ((arij) aqzq.f87169b.mo66814b()).mo48565a(bootstrapProgressResult);
                }
            } catch (RemoteException e) {
                aqzq.f87168a.mo25410a((Throwable) e);
            }
        }
    }
}
