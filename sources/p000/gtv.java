package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Process;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorAnnotatedData;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo;
import com.google.android.gms.common.api.Status;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: gtv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gtv {

    /* renamed from: a */
    public static final sbw f19004a = new sbw("AccountTransfer", "[ATUtil]");

    /* renamed from: a */
    public static String m13886a(String str, String str2, Context context) {
        ConcurrentMap concurrentMap;
        String str3;
        gub a = gub.m13906a();
        synchronized (a.f19032k) {
            if (a.f19025d == null) {
                a.f19025d = new ConcurrentHashMap();
            }
            concurrentMap = a.f19025d;
        }
        if (concurrentMap.containsKey(str)) {
            return (String) concurrentMap.get(str);
        }
        try {
            str3 = spn.m35882e(context, str2);
        } catch (PackageManager.NameNotFoundException e) {
            str3 = null;
        }
        concurrentMap.put(str, str3);
        return str3;
    }

    /* renamed from: a */
    public static void m13887a() {
        synchronized (gub.f19021a) {
            gub.f19022b = null;
        }
        synchronized (gty.f19008b) {
            gty.f19009c = null;
        }
    }

    /* renamed from: a */
    public static void m13888a(Context context, long j, AuthenticatorAnnotatedData authenticatorAnnotatedData, int i) {
        gtx gtx = new gtx(j, authenticatorAnnotatedData);
        String str = authenticatorAnnotatedData.f10055c.f10062c;
        gub.m13906a().mo12230c().put(str, gtx);
        String str2 = authenticatorAnnotatedData.f10057e;
        sbw sbw = f19004a;
        String valueOf = String.valueOf(str2);
        sbw.mo25379d(valueOf.length() == 0 ? new String("notifyAuthenticator() foreground for package:") : "notifyAuthenticator() foreground for package:".concat(valueOf));
        Intent intent = new Intent();
        intent.setFlags(268435456);
        intent.setAction(i != 1 ? "com.google.android.gms.auth.ACCOUNT_EXPORT_DATA_AVAILABLE" : "com.google.android.gms.auth.ACCOUNT_IMPORT_DATA_AVAILABLE");
        intent.setPackage(str2);
        intent.putExtra("key_extra_account_type", str);
        context.sendBroadcast(intent);
    }

    /* renamed from: a */
    public static void m13889a(guk guk) {
        guk.mo12195a(new Status(20502), (AccountTransferMsg) null);
    }

    /* renamed from: a */
    public static void m13890a(guk guk, boolean z) {
        Status status = new Status(20502);
        if (z) {
            guk.mo12241a(status, (AuthenticatorTransferInfo) null);
        } else {
            guk.mo12196a(status);
        }
    }

    /* renamed from: a */
    public static boolean m13891a(int i) {
        return i == Process.myUid();
    }

    /* renamed from: a */
    public static boolean m13892a(Context context, String str, int i) {
        Map map;
        gub a = gub.m13906a();
        synchronized (a.f19032k) {
            a.mo12228b(context);
            map = a.f19024c;
        }
        int intValue = ((Integer) map.get(str)).intValue();
        if (intValue == i) {
            return true;
        }
        String nameForUid = context.getPackageManager().getNameForUid(i);
        f19004a.mo25377c("AccountTransfer", String.format("Security Exception. Account type %s belonging to package %s and uid %d is not associated with the calling uid %d belonging to package %s", str, (String) gub.m13906a().mo12225a(context).get(str), Integer.valueOf(intValue), Integer.valueOf(i), nameForUid));
        return false;
    }

    /* renamed from: a */
    public static boolean m13893a(AuthenticatorAnnotatedData authenticatorAnnotatedData, Context context) {
        String str = authenticatorAnnotatedData.f10055c.f10062c;
        String str2 = (String) gub.m13906a().mo12225a(context).get(str);
        String a = m13886a(str, str2, context);
        return str2 != null && str2.equals(authenticatorAnnotatedData.f10057e) && a != null && a.equals(authenticatorAnnotatedData.f10056d);
    }

    /* renamed from: a */
    public static boolean m13894a(String str, int i, Context context) {
        return gub.m13906a().mo12226a(context, i).contains(str);
    }
}
