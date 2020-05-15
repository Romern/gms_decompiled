package p000;

import android.app.PendingIntent;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorAnnotatedData;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.TargetAccountImportController$ChallengeIntentHelper;
import com.google.android.gms.smartdevice.d2d.TargetAccountImportController$ImportReceiver;
import com.google.android.gms.smartdevice.d2d.data.AccountTransferPayload;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.d2d.p065ui.ForwardingChimeraActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: ardx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ardx implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String[] f87478a;

    /* renamed from: b */
    final /* synthetic */ TargetAccountImportController$ImportReceiver f87479b;

    public ardx(TargetAccountImportController$ImportReceiver targetAccountImportController$ImportReceiver, String[] strArr) {
        this.f87479b = targetAccountImportController$ImportReceiver;
        this.f87478a = strArr;
    }

    public final void run() {
        if (cgqs.m146607m()) {
            ardy ardy = this.f87479b.f107935a;
            String[] strArr = this.f87478a;
            Logger Logger = ardy.f87480a;
            if (strArr != null) {
                HashSet a = bnpf.m110048a(strArr.length);
                Collections.addAll(a, strArr);
                if (ardy.f87484e.containsAll(a)) {
                    ardy.f87480a.logVerbose("Skipping broadcast. %s already processed", Arrays.toString(this.f87478a));
                    return;
                }
            }
        }
        ardy.f87480a.logVerbose("Handling authenticatorIds %s", Arrays.toString(this.f87478a));
        ardy ardy2 = this.f87479b.f107935a;
        sdo.m34964a(ardy2.f87481b);
        ardy2.f87487h.mo48752c();
        ardy.f87480a.logVerbose("Additional info requested, importAccount(RETRIEVE_DATA)", new Object[0]);
        gtq gtq = new gtq();
        gtq.mo12204a(2);
        aucb b = ardy2.f87482c.mo12202b(gtq.mo12203a());
        Status a2 = ascs.m73792a(b);
        if (!a2.mo17710c()) {
            int i = a2.f30115i;
            StringBuilder sb = new StringBuilder(46);
            sb.append("importAccount(RETRIEVE_DATA) error ");
            sb.append(i);
            String sb2 = sb.toString();
            ardy.f87480a.mo25418e(sb2, new Object[0]);
            ardy2.f87483d.mo48454a(10579, sb2);
            return;
        }
        AccountTransferMsg accountTransferMsg = (AccountTransferMsg) b.mo50386d();
        if (ardy2.mo48452c(accountTransferMsg)) {
            return;
        }
        if (accountTransferMsg == null) {
            ardy.f87480a.mo25418e("AccountTransferMsg was null", new Object[0]);
            return;
        }
        ArrayList arrayList = accountTransferMsg.f10042c;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                AuthenticatorAnnotatedData authenticatorAnnotatedData = (AuthenticatorAnnotatedData) arrayList.get(i2);
                String str = authenticatorAnnotatedData.f10058f;
                ardy.f87480a.logVerbose("Processing authenticator data with id(%s)", str);
                ardy2.f87484e.add(str);
                AuthenticatorTransferInfo authenticatorTransferInfo = authenticatorAnnotatedData.f10055c;
                ardy.f87480a.mo25412b("Processing %s, status - %d", authenticatorTransferInfo.f10062c, Integer.valueOf(authenticatorTransferInfo.f10063d));
                int i3 = authenticatorTransferInfo.f10063d;
                if (i3 == 3) {
                    arrayList2.add(authenticatorAnnotatedData);
                } else if (i3 == 4) {
                    TargetAccountImportController$ChallengeIntentHelper targetAccountImportController$ChallengeIntentHelper = ardy2.f87486g;
                    PendingIntent a3 = ForwardingChimeraActivity.m92735a(targetAccountImportController$ChallengeIntentHelper.f107930a, targetAccountImportController$ChallengeIntentHelper, authenticatorTransferInfo.f10065f);
                    if (targetAccountImportController$ChallengeIntentHelper.f107934e) {
                        ardy.f87480a.logVerbose("Queuing additional challenge request", new Object[0]);
                        targetAccountImportController$ChallengeIntentHelper.f107931b.add(a3);
                    } else {
                        targetAccountImportController$ChallengeIntentHelper.f107932c.mo48751b();
                        targetAccountImportController$ChallengeIntentHelper.f107934e = true;
                        targetAccountImportController$ChallengeIntentHelper.f107933d.mo48455a(a3);
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                gtq gtq2 = new gtq();
                gtq2.mo12206a(arrayList2);
                gtq2.mo12205a(accountTransferMsg.f10044e);
                AccountTransferPayload accountTransferPayload = new AccountTransferPayload(gtq2.mo12203a());
                MessagePayload messagePayload = new MessagePayload();
                messagePayload.mo59097a(accountTransferPayload);
                ardy2.f87483d.mo48457a(messagePayload);
                return;
            }
            return;
        }
        ardy.f87480a.logVerbose("No authenticator data to process", new Object[0]);
    }
}
