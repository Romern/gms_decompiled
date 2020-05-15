package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.SourceAccountExportController$ExportReceiver;
import com.google.android.gms.smartdevice.d2d.data.AccountTransferPayload;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: aral */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aral {

    /* renamed from: a */
    public static final sek f87205a = ascp.m73787a("D2D", "SourceAccountExportController");

    /* renamed from: b */
    public final aram f87206b;

    /* renamed from: c */
    public final gto f87207c;

    /* renamed from: d */
    public final ExecutorService f87208d;

    /* renamed from: e */
    public final AtomicInteger f87209e;

    /* renamed from: f */
    public final Set f87210f = new HashSet();

    /* renamed from: g */
    public final Set f87211g = new HashSet();

    /* renamed from: h */
    public int f87212h;

    /* renamed from: i */
    private final Context f87213i;

    /* renamed from: j */
    private final armh f87214j;

    /* renamed from: k */
    private BroadcastReceiver f87215k;

    public aral(Context context, armh armh, aram aram, boolean z, boolean z2) {
        sdo.m34959a(context);
        this.f87213i = context;
        sdo.m34959a(armh);
        this.f87214j = armh;
        sdo.m34959a(aram);
        this.f87206b = aram;
        this.f87209e = new AtomicInteger();
        this.f87208d = arpy.m73286a();
        this.f87207c = gsw.m13840a(context, argx.m72748a(context, z, z2));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final synchronized void mo48334a() {
        boolean z;
        String str;
        f87205a.mo25409a("Using exportAccounts()", new Object[0]);
        this.f87210f.clear();
        this.f87214j.mo48651d(3);
        if (this.f87215k == null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(z, (Object) "cleanup() must be called before retrying startAccountExport()");
        if (cgrq.m146758c()) {
            str = this.f87213i.getResources().getQuantityString(C0126R.plurals.smartdevice_d2d_copying_accounts, adyd.m51363a(this.f87213i).mo33916a("com.google").length);
        } else {
            str = this.f87213i.getString(C0126R.string.smartdevice_d2d_target_copying_accounts);
        }
        MessagePayload messagePayload = new MessagePayload();
        messagePayload.mo59104e(str);
        this.f87206b.mo48341a(messagePayload);
        this.f87206b.mo48342a(str);
        gtq gtq = new gtq();
        gtq.mo12204a(1);
        AccountTransferMsg a = gtq.mo12203a();
        this.f87215k = new SourceAccountExportController$ExportReceiver(this);
        this.f87213i.registerReceiver(this.f87215k, new IntentFilter("com.google.android.gms.auth.ACCOUNT_DATA_AVAILABLE_FOR_SETUP"));
        Status a2 = ascs.m73792a(this.f87207c.mo12200a(a));
        f87205a.mo25412b("exportAccounts(START_SESSION) status %s", a2);
        if (!a2.mo17710c()) {
            mo48336a("exportAccounts(START_SESSION) failed");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0079, code lost:
        return;
     */
    /* renamed from: b */
    public final synchronized void mo48337b() {
        if (this.f87215k != null) {
            f87205a.mo25412b("exportAccounts(END_SESSION) %s", this);
            armh armh = this.f87214j;
            int i = this.f87212h;
            int size = this.f87210f.size();
            bxvd bxvd = armh.f87900f;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bovd bovd = (bovd) bxvd.f164949b;
            bovd bovd2 = bovd.f134997d;
            int i2 = bovd.f134999a | 1;
            bovd.f134999a = i2;
            bovd.f135000b = i;
            bovd.f134999a = i2 | 2;
            bovd.f135001c = size;
            this.f87212h = 0;
            this.f87210f.clear();
            gtq gtq = new gtq();
            gtq.mo12204a(4);
            Status a = ascs.m73792a(this.f87207c.mo12200a(gtq.mo12203a()));
            if (!a.mo17710c()) {
                f87205a.mo25418e("error ending session %s", a);
            }
            BroadcastReceiver broadcastReceiver = this.f87215k;
            if (broadcastReceiver != null) {
                this.f87213i.unregisterReceiver(broadcastReceiver);
                this.f87215k = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo48335a(AccountTransferPayload accountTransferPayload) {
        f87205a.mo25409a("Importing authenticator data", new Object[0]);
        AccountTransferMsg b = accountTransferPayload.mo59088b();
        if (b == null) {
            mo48336a("AccountTransferMsg is null");
            return;
        }
        gtq gtq = new gtq();
        gtq.mo12204a(3);
        gtq.mo12205a(b.f10044e);
        gtq.mo12206a(b.f10042c);
        Status a = ascs.m73792a(this.f87207c.mo12200a(gtq.mo12203a()));
        f87205a.mo25409a("importAccounts status = %s", a);
        if (!a.mo17710c()) {
            mo48336a("Failure importing data from target");
        }
    }

    /* renamed from: a */
    public final void mo48336a(String str) {
        f87205a.mo25418e(str, new Object[0]);
        this.f87206b.mo48339a(10579, str);
    }
}
