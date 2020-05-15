package p000;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferProgress;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorAnnotatedData;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo;
import com.google.android.gms.auth.api.accounttransfer.DeviceAuthInfo;
import com.google.android.gms.auth.api.accounttransfer.PurgeAccountTransferDataChimeraService;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: guz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class guz extends guy {

    /* renamed from: i */
    private static final sbw f19053i = new sbw("AccountTransfer", "[ATSetupBaseOperation]");

    /* renamed from: e */
    final AccountTransferMsg f19054e;

    /* renamed from: f */
    ayky f19055f = null;

    /* renamed from: g */
    final DeviceAuthInfo f19056g;

    /* renamed from: h */
    final ArrayList f19057h;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: gvh.a(android.content.Context, boolean, int):void
     arg types: [android.content.Context, int, int]
     candidates:
      gvh.a(android.content.Context, java.util.Map, int):void
      gvh.a(android.content.Context, boolean, int):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6502a(Context context) {
        AccountTransferProgress accountTransferProgress;
        bnhe bnhe;
        if (this.f19055f == null) {
            this.f19055f = ayky.m84210a(snp.m35703a(1, 10), rqz.m34281b(context), rqz.m34280a(context));
        }
        f19053i.mo25379d("execute()");
        if (mo12255c()) {
            f19053i.mo25372b("AccountTransfer", "Invalid request or Security issue");
            return;
        }
        int i = this.f19054e.f10043d;
        if (i == 1) {
            mo12253b(context);
        } else if (i == 2) {
            f19053i.mo25379d("retrieveData()");
            guc a = gvj.m14011a(context);
            if (a == null) {
                sbw sbw = f19053i;
                int i2 = this.f19051c;
                StringBuilder sb = new StringBuilder(45);
                sb.append("No data available for sessionType:");
                sb.append(i2);
                sbw.mo25377c("AccountTransfer", sb.toString());
                this.f19049a.mo12195a(new Status(20501), (AccountTransferMsg) null);
                return;
            }
            gty a2 = gty.m13895a();
            Map map = a.f19037b;
            int i3 = this.f19051c;
            synchronized (a2.f19010d) {
                a2.mo12217a(context, i3);
                if (i3 != 1) {
                    a2.mo12218a(context, map, a2.f19011e, i3);
                    accountTransferProgress = new AccountTransferProgress(a2.f19011e);
                } else {
                    a2.mo12218a(context, map, a2.f19012f, i3);
                    accountTransferProgress = new AccountTransferProgress(a2.f19012f);
                }
            }
            gtq gtq = new gtq();
            gtq.mo12206a(a.f19036a);
            gtq.mo12205a(accountTransferProgress);
            this.f19049a.mo12195a(Status.f30107a, gtq.mo12203a());
            gvj.m14013a(context, a.f19038c);
        } else if (i == 3) {
            mo12254c(context);
        } else if (i != 4) {
            StringBuilder sb2 = new StringBuilder(46);
            sb2.append("Invalid AccountTransferRequestType:");
            sb2.append(i);
            String sb3 = sb2.toString();
            f19053i.mo25380d("AccountTransfer", sb3, new IllegalArgumentException(sb3));
        } else {
            if (this.f19055f == null) {
                this.f19055f = ayky.m84210a(snp.m35703a(1, 10), rqz.m34281b(context), rqz.m34280a(context));
            }
            f19053i.mo25379d("endSession()");
            gty a3 = gty.m13895a();
            if (this.f19051c == 2) {
                bnhe = bnhe.m109413a(a3.f19011e);
            } else {
                bnhe = bnhe.m109413a(a3.f19012f);
            }
            if (bnhe != null) {
                int size = bnhe.size();
                Iterator it = bnhe.values().iterator();
                String str = "SUCCESS";
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String str2 = (String) it.next();
                    if ("in_progress".equals(str2)) {
                        str = "STOPPED";
                        break;
                    } else if ("failed".equals(str2)) {
                        str = "ERROR";
                    }
                }
                this.f19055f.mo54074a(mo12251a(), str, size);
            } else {
                this.f19055f.mo54074a(mo12251a(), "ERROR", -1);
            }
            gtv.m13887a();
            gvh.m14001a(context, false, this.f19051c);
            mo12252b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12252b() {
        this.f19049a.mo12195a(Status.f30107a, (AccountTransferMsg) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo12254c(Context context) {
        AccountTransferProgress accountTransferProgress;
        f19053i.mo25379d("depositData()");
        AccountTransferProgress accountTransferProgress2 = this.f19054e.f10044e;
        gty a = gty.m13895a();
        int i = this.f19051c;
        synchronized (a.f19010d) {
            a.mo12217a(context, i);
            Map b = accountTransferProgress2.mo7386b();
            if (i != 1) {
                a.mo12218a(context, b, a.f19011e, i);
            } else {
                a.mo12218a(context, b, a.f19012f, i);
            }
        }
        ArrayList arrayList = this.f19054e.f10042c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AuthenticatorAnnotatedData authenticatorAnnotatedData = (AuthenticatorAnnotatedData) arrayList.get(i2);
            AuthenticatorTransferInfo authenticatorTransferInfo = authenticatorAnnotatedData.f10055c;
            int i3 = authenticatorTransferInfo.f10063d;
            if (i3 != 2) {
                if (i3 == 3) {
                    String str = authenticatorTransferInfo.f10062c;
                    boolean containsKey = gub.m13906a().mo12225a(context).containsKey(str);
                    if (!containsKey && this.f19051c == 2) {
                        String format = String.format("accountType %s not found", str);
                        f19053i.mo25380d("AccountTransfer", format, new IllegalArgumentException(format));
                    } else {
                        long a2 = gvj.m14007a(context, authenticatorAnnotatedData);
                        if (a2 >= 0 && containsKey) {
                            gtv.m13888a(context, a2, authenticatorAnnotatedData, this.f19051c);
                        }
                    }
                } else if (!(i3 == 4 || i3 == 5 || i3 == 6)) {
                    String format2 = String.format("Should not have happened. AuthenticatorTransferStatus %d for a message sent by Setup wasn't expected in depositData", Integer.valueOf(i3));
                    f19053i.mo25380d("AccountTransfer", format2, new IllegalArgumentException(format2));
                }
            }
            f19053i.mo25379d(String.format("Encountered AuthenticatorTransferStatus %d for a message sent by Setup. Won't store data.", Integer.valueOf(i3)));
        }
        gty a3 = gty.m13895a();
        int i4 = this.f19051c;
        synchronized (a3.f19010d) {
            a3.mo12217a(context, i4);
            if (i4 != 1) {
                accountTransferProgress = new AccountTransferProgress(a3.f19011e);
            } else {
                a3.mo12216a(context);
                accountTransferProgress = new AccountTransferProgress(a3.f19012f);
            }
        }
        gtq gtq = new gtq();
        gtq.mo12205a(accountTransferProgress);
        this.f19049a.mo12195a(Status.f30107a, gtq.mo12203a());
    }

    public guz(int i, guk guk, String str, AccountTransferMsg accountTransferMsg, DeviceAuthInfo deviceAuthInfo, ArrayList arrayList, int i2) {
        super(i, guk, str, i2, true);
        sdo.m34959a(accountTransferMsg);
        this.f19054e = accountTransferMsg;
        this.f19056g = deviceAuthInfo;
        this.f19057h = arrayList;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: gvh.a(android.content.Context, boolean, int):void
     arg types: [android.content.Context, int, int]
     candidates:
      gvh.a(android.content.Context, java.util.Map, int):void
      gvh.a(android.content.Context, boolean, int):void */
    /* renamed from: b */
    public void mo12253b(Context context) {
        if (this.f19055f == null) {
            this.f19055f = ayky.m84210a(snp.m35703a(1, 10), rqz.m34281b(context), rqz.m34280a(context));
        }
        ayky ayky = this.f19055f;
        ((beon) ayky.f97879b.mo6606a()).mo60861b(mo12251a());
        PurgeAccountTransferDataChimeraService.f10078a.mo25371b("Scheduling Cleanup Task");
        aeat a = aeat.m51532a(context);
        long c = cccc.f178738a.mo6606a().mo75759c();
        aebi aebi = new aebi();
        aebi.mo34004a(c, cccc.f178738a.mo6606a().mo75758b() + c);
        aebi.f63099k = "PurgeATDataService";
        aebi.f63097i = "com.google.android.gms.auth.api.accounttransfer.PurgeAccountTransferDataService";
        aebi.mo34024a(0, cdny.m134338c() ? 1 : 0);
        aebi.f63102n = true;
        aebi.mo34023a(2);
        aebi.mo34027b(1);
        a.mo33984a(aebi.mo33974b());
        gtv.m13887a();
        f19053i.mo25379d(String.format("startSession() type:%s", Integer.valueOf(this.f19051c)));
        gvh.m14001a(context, true, this.f19051c);
        gub a2 = gub.m13906a();
        if (this.f19051c != 1) {
            synchronized (a2.f19032k) {
                a2.f19031j = true;
            }
        } else {
            synchronized (a2.f19032k) {
                a2.f19030i = true;
            }
        }
        gty a3 = gty.m13895a();
        AccountTransferProgress accountTransferProgress = this.f19054e.f10044e;
        int i = this.f19051c;
        gty.f19007a.mo25379d("onCreateSession()");
        synchronized (a3.f19010d) {
            if (i != 1) {
                Set<String> a4 = gto.m13877a(context);
                a3.f19011e = new C1223np(((C1225nr) a4).f26758b);
                if (a4.isEmpty()) {
                    gty.f19007a.mo25372b("AccountTransfer", "No accounts found for exporting!!");
                } else {
                    for (String str : a4) {
                        a3.f19011e.put(str, "registered");
                    }
                    SharedPreferences.Editor edit = gvh.m13996a(context).edit();
                    edit.putStringSet("key_export_all_accounts_progress", a4);
                    for (String str2 : a4) {
                        edit.putString(gvh.m13999a(str2, 2), "registered");
                    }
                    edit.apply();
                }
            } else {
                a3.f19012f = accountTransferProgress.mo7386b();
                a3.mo12216a(context);
                Map map = a3.f19012f;
                Set keySet = map.keySet();
                SharedPreferences.Editor edit2 = gvh.m13996a(context).edit();
                edit2.putStringSet("key_import_all_accounts_progress", keySet);
                for (Map.Entry entry : map.entrySet()) {
                    edit2.putString(gvh.m13999a((String) entry.getKey(), 1), (String) entry.getValue());
                }
                edit2.apply();
            }
        }
        DeviceAuthInfo deviceAuthInfo = this.f19056g;
        String a5 = gvh.m13998a(this.f19051c);
        SharedPreferences.Editor edit3 = gvh.m13996a(context).edit();
        edit3.putLong(a5.concat("_age"), deviceAuthInfo.f10071d);
        edit3.putBoolean(a5.concat("_unlocked"), deviceAuthInfo.f10070c);
        edit3.apply();
        ArrayList arrayList = this.f19057h;
        int i2 = this.f19051c;
        SharedPreferences.Editor edit4 = gvh.m13996a(context).edit();
        edit4.putStringSet(gvh.m14002b(i2), new HashSet(arrayList));
        edit4.apply();
        gub a6 = gub.m13906a();
        int i3 = this.f19051c;
        DeviceAuthInfo deviceAuthInfo2 = this.f19056g;
        ArrayList arrayList2 = this.f19057h;
        if (i3 != 1) {
            synchronized (a6.f19032k) {
                a6.f19029h = deviceAuthInfo2;
                a6.f19027f = new HashSet(arrayList2);
            }
            return;
        }
        synchronized (a6.f19032k) {
            a6.f19028g = deviceAuthInfo2;
            a6.f19026e = new HashSet(arrayList2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo12255c() {
        if (!gtv.m13891a(this.f19050b)) {
            this.f19049a.mo12195a(new Status(20500), (AccountTransferMsg) null);
            return true;
        }
        AccountTransferMsg accountTransferMsg = this.f19054e;
        if (accountTransferMsg.f10043d != 3) {
            return false;
        }
        ArrayList arrayList = accountTransferMsg.f10042c;
        if (arrayList != null && !arrayList.isEmpty()) {
            return false;
        }
        gtv.m13889a(this.f19049a);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        sbw sbw = f19053i;
        String valueOf = String.valueOf(status);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 51);
        sb.append("Encountered failure. Inside onFailure with status: ");
        sb.append(valueOf);
        sbw.mo25377c("AccountTransfer", sb.toString());
        this.f19049a.mo12195a(status, (AccountTransferMsg) null);
    }
}
