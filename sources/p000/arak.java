package p000;

import android.app.PendingIntent;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferProgress;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorAnnotatedData;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.SourceAccountExportController$ExportReceiver;
import com.google.android.gms.smartdevice.d2d.data.AccountTransferPayload;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: arak */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arak implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String[] f87203a;

    /* renamed from: b */
    final /* synthetic */ SourceAccountExportController$ExportReceiver f87204b;

    public arak(SourceAccountExportController$ExportReceiver sourceAccountExportController$ExportReceiver, String[] strArr) {
        this.f87204b = sourceAccountExportController$ExportReceiver;
        this.f87203a = strArr;
    }

    public final void run() {
        int i;
        if (cgqs.m146607m()) {
            aral aral = this.f87204b.f107912a;
            String[] strArr = this.f87203a;
            if (strArr != null && aral.f87211g.containsAll(Arrays.asList(strArr))) {
                aral.f87205a.logVerbose("Skipping broadcast. Already processed %s", Arrays.toString(this.f87203a));
                return;
            }
        }
        aral.f87205a.logVerbose("Handling authenticatorIds %s", Arrays.toString(this.f87203a));
        aral aral2 = this.f87204b.f107912a;
        gtq gtq = new gtq();
        gtq.mo12204a(2);
        aucb a = aral2.f87207c.mo12200a(gtq.mo12203a());
        Status a2 = ascs.m73792a(a);
        AccountTransferMsg accountTransferMsg = a2.mo17710c() ? (AccountTransferMsg) a.mo50386d() : null;
        aral.f87205a.logVerbose("exportAccounts(RETRIEVE_DATA) %s", a2);
        if (a2.f30115i == 20501) {
            aral.f87205a.logVerbose("No data available", new Object[0]);
        } else if (accountTransferMsg != null) {
            ArrayList arrayList = accountTransferMsg.f10042c;
            ArrayList arrayList2 = new ArrayList();
            AccountTransferProgress accountTransferProgress = accountTransferMsg.f10044e;
            if (accountTransferProgress == null || aral2.f87212h != 0) {
                i = 0;
            } else {
                aral2.f87212h = ((C1245ok) accountTransferProgress.mo7386b()).f26809h;
                i = 0;
            }
            while (i < arrayList.size()) {
                AuthenticatorAnnotatedData authenticatorAnnotatedData = (AuthenticatorAnnotatedData) arrayList.get(i);
                aral2.f87211g.add(authenticatorAnnotatedData.f10058f);
                AuthenticatorTransferInfo authenticatorTransferInfo = authenticatorAnnotatedData.f10055c;
                aral2.f87210f.add(authenticatorTransferInfo.f10062c);
                PendingIntent pendingIntent = authenticatorTransferInfo.f10065f;
                aral.f87205a.mo25412b("Processing %s, status %d", authenticatorTransferInfo.f10062c, Integer.valueOf(authenticatorTransferInfo.f10063d));
                if (pendingIntent != null) {
                    aral.f87205a.mo25409a("Found pendingIntent %s", pendingIntent);
                    aral2.f87209e.incrementAndGet();
                    aral2.f87206b.mo48338a();
                    aral2.f87206b.mo48340a(pendingIntent);
                } else {
                    arrayList2.add(authenticatorAnnotatedData);
                }
                i++;
            }
            MessagePayload messagePayload = new MessagePayload();
            gtq gtq2 = new gtq();
            gtq2.mo12206a(arrayList2);
            gtq2.mo12205a(accountTransferProgress);
            messagePayload.mo59097a(new AccountTransferPayload(gtq2.mo12203a()));
            aral2.f87206b.mo48341a(messagePayload);
        } else {
            aral2.mo48336a("Retrieved data was null");
        }
    }
}
