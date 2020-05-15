package p000;

import android.accounts.Account;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferProgress;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorAnnotatedData;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.TargetAccountImportController$ChallengeIntentHelper;
import com.google.android.gms.smartdevice.d2d.TargetAccountImportController$ImportReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: ardy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ardy {

    /* renamed from: a */
    public static final Logger f87480a = ascp.m73787a("D2D", "TargetAccountImportController");

    /* renamed from: b */
    public final Handler f87481b;

    /* renamed from: c */
    public final gto f87482c;

    /* renamed from: d */
    public final ardz f87483d;

    /* renamed from: e */
    public final Set f87484e = new HashSet();

    /* renamed from: f */
    public boolean f87485f;

    /* renamed from: g */
    public final TargetAccountImportController$ChallengeIntentHelper f87486g;

    /* renamed from: h */
    public final arqm f87487h;

    /* renamed from: i */
    public AccountTransferMsg f87488i;

    /* renamed from: j */
    private final Context f87489j;

    /* renamed from: k */
    private final armn f87490k;

    /* renamed from: l */
    private final Set f87491l = new HashSet();

    /* renamed from: m */
    private BroadcastReceiver f87492m;

    public ardy(Context context, Handler handler, armn armn, ardz ardz, boolean z) {
        sdo.m34959a(context);
        this.f87489j = context;
        sdo.m34959a((Object) handler);
        this.f87481b = handler;
        sdo.m34959a(armn);
        this.f87490k = armn;
        sdo.m34959a(ardz);
        this.f87483d = ardz;
        this.f87487h = new arqm(snp.m35704b(10), new sty(handler), cgqs.f187523a.mo6606a().mo84314a(), new ardv(this));
        this.f87486g = new TargetAccountImportController$ChallengeIntentHelper(context, handler, this.f87487h, ardz);
        this.f87482c = gsw.m13840a(context, argx.m72748a(context, false, z));
    }

    /* renamed from: b */
    public static boolean m72570b(AccountTransferMsg accountTransferMsg) {
        AccountTransferProgress accountTransferProgress;
        List list;
        return (accountTransferMsg == null || (accountTransferProgress = accountTransferMsg.f10044e) == null || (list = accountTransferProgress.f10049d) == null || !list.contains("com.google")) ? false : true;
    }

    /* renamed from: c */
    private final void m72571c() {
        AccountTransferMsg accountTransferMsg = this.f87488i;
        if (accountTransferMsg == null) {
            f87480a.mo25418e("Cannot log - no previous transfer message", new Object[0]);
        } else {
            AccountTransferProgress accountTransferProgress = accountTransferMsg.f10044e;
            if (accountTransferProgress != null) {
                armn armn = this.f87490k;
                int size = this.f87491l.size();
                int a = arpz.m73287a(accountTransferProgress.f10049d);
                int a2 = arpz.m73287a(accountTransferProgress.f10051f);
                int a3 = arpz.m73287a(accountTransferProgress.f10050e);
                bxvd bxvd = armn.f87918i.f87928a.mo48640b().f87892b;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bowd bowd = (bowd) bxvd.f164949b;
                bowd bowd2 = bowd.f135096f;
                int i = bowd.f135098a | 1;
                bowd.f135098a = i;
                bowd.f135099b = size;
                int i2 = i | 2;
                bowd.f135098a = i2;
                bowd.f135100c = a;
                int i3 = i2 | 4;
                bowd.f135098a = i3;
                bowd.f135101d = a2;
                bowd.f135098a = i3 | 8;
                bowd.f135102e = a3;
            } else {
                f87480a.mo25418e("Cannot log - last transfer message has no progress", new Object[0]);
            }
        }
        this.f87487h.mo48751b();
        if (this.f87485f) {
            this.f87485f = false;
            f87480a.mo25412b("importAccounts(END_SESSION)", new Object[0]);
            gtq gtq = new gtq();
            gtq.mo12204a(4);
            Status a4 = ascs.m73792a(this.f87482c.mo12202b(gtq.mo12203a()));
            if (!a4.mo17710c()) {
                f87480a.mo25418e("Error ending session %d", Integer.valueOf(a4.f30115i));
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo48449a() {
        if (this.f87492m != null) {
            m72571c();
            try {
                this.f87489j.unregisterReceiver(this.f87492m);
            } catch (IllegalArgumentException e) {
                f87480a.mo25410a((Throwable) e);
            }
            this.f87492m = null;
        }
        this.f87491l.clear();
    }

    /* renamed from: b */
    public final void mo48451b() {
        Account[] a = asbs.m73758a(this.f87489j).mo33916a("com.google");
        int length = a.length;
        ArrayList arrayList = new ArrayList(length);
        for (Account account : a) {
            Bundle bundle = new Bundle();
            bundle.putString("name", account.name);
            arrayList.add(bundle);
        }
        this.f87487h.mo48751b();
        this.f87483d.mo48459a(arrayList);
        this.f87483d.mo48453a();
    }

    /* renamed from: a */
    public final void mo48450a(AccountTransferMsg accountTransferMsg) {
        AccountTransferMsg accountTransferMsg2;
        sdo.m34964a(this.f87481b);
        int i = 3;
        this.f87490k.mo48663b(3);
        if (!this.f87486g.f107934e) {
            arqm arqm = this.f87487h;
            if (arqm.f88128e) {
                arqm.mo48750a();
            } else {
                arqm.mo48752c();
            }
        }
        this.f87485f = true;
        ArrayList arrayList = accountTransferMsg.f10042c;
        int a = arpz.m73287a(arrayList);
        for (int i2 = 0; i2 < a; i2++) {
            this.f87491l.add(((AuthenticatorAnnotatedData) arrayList.get(i2)).f10055c.f10062c);
        }
        if (this.f87492m == null) {
            this.f87492m = new TargetAccountImportController$ImportReceiver(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.gms.auth.ACCOUNT_DATA_AVAILABLE_FOR_SETUP");
            intentFilter.addAction("com.google.android.gms.smartdevice.setup.IMPORT_CHALLENGE_COMPLETE");
            intentFilter.addAction("com.google.android.gms.smartdevice.setup.RESTORE_DATA");
            this.f87489j.registerReceiver(this.f87492m, intentFilter);
            f87480a.mo25412b("importAccount(START_SESSION, data) size = %s", Integer.valueOf(a));
            i = 1;
        } else {
            f87480a.logVerbose("importAccounts(DEPOSIT_DATA, data) size = %s", Integer.valueOf(a));
        }
        gtq gtq = new gtq();
        gtq.mo12204a(i);
        gtq.mo12206a(accountTransferMsg.f10042c);
        gtq.mo12205a(accountTransferMsg.f10044e);
        aucb b = this.f87482c.mo12202b(gtq.mo12203a());
        Status a2 = ascs.m73792a(b);
        if (a2.mo17710c()) {
            accountTransferMsg2 = (AccountTransferMsg) b.mo50386d();
        } else {
            accountTransferMsg2 = null;
        }
        f87480a.logVerbose("importAccount() %s", a2);
        mo48452c(accountTransferMsg2);
    }

    /* renamed from: c */
    public final boolean mo48452c(AccountTransferMsg accountTransferMsg) {
        AccountTransferProgress accountTransferProgress;
        if (!(accountTransferMsg == null || (accountTransferProgress = accountTransferMsg.f10044e) == null)) {
            f87480a.logVerbose("checking progress %s", accountTransferProgress);
            this.f87488i = accountTransferMsg;
            for (String str : accountTransferProgress.mo7386b().values()) {
                if (!"in_progress".equals(str)) {
                    if ("registered".equals(str)) {
                    }
                }
            }
            m72571c();
            if (!m72570b(accountTransferMsg)) {
                this.f87483d.mo48454a(10579, "Google authenticator failed to import");
            } else {
                mo48451b();
            }
            return true;
        }
        return false;
    }
}
