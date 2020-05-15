package com.google.android.gms.tapandpay.notifications;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TapAndPayGcmRegistrationTaskOperation implements aspm {

    /* renamed from: a */
    private static final srn f108614a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    private static int m93074a(atar atar, String str, Context context) {
        boolean z;
        synchronized (TapAndPayGcmRegistrationTaskOperation.class) {
            String b = askc.m74272b();
            HashMap hashMap = new HashMap();
            Cursor rawQuery = asko.m74292a(context).mo49214a().rawQuery("SELECT account_id, gcm_id from Wallets WHERE wallet_id IS NOT NULL AND environment = ?;", new String[]{b});
            while (rawQuery.moveToNext()) {
                try {
                    hashMap.put(rawQuery.getString(0), rawQuery.getString(1));
                } catch (Throwable th) {
                    bqye.m113761a(th, th);
                }
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            boolean z2 = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                String str2 = (String) entry.getKey();
                String a = asjg.m74211a(context, str2);
                if (a == null) {
                    bnsl bnsl = (bnsl) f108614a.mo68388c();
                    bnsl.mo68432a("com.google.android.gms.tapandpay.notifications.TapAndPayGcmRegistrationTaskOperation", "a", 87, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Couldn't find device account for account id, not registering gcm id");
                } else if (!str.equals((String) entry.getValue())) {
                    z2 &= atar.mo49768a(new askf(str2, a, b, context), str);
                }
            }
            z = !z2;
        }
        return z ? 1 : 0;
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
        if (r1.mo49768a(r4, r2) == false) goto L_0x001d;
     */
    /* renamed from: a */
    public static void m93075a(askf askf) {
        Context context = askf.f89126d;
        atar atar = new atar();
        String a = aaks.m21407a(askf.f89126d);
        if (TextUtils.isEmpty(a)) {
            spn.m35859a();
        }
        aspj.m74419a(context);
        aspj.m74420b(context);
    }

    /* renamed from: a */
    public final int mo49332a(aecc aecc, Context context) {
        Throwable th;
        boolean z;
        aecc aecc2 = aecc;
        Context context2 = context;
        int i = 0;
        if (!"immediate".equals(aecc2.f63128a) && !"periodic".equals(aecc2.f63128a)) {
            String str = aecc2.f63128a;
            return 0;
        } else if (!ssk.m36235a(context)) {
            return 1;
        } else {
            try {
                atar atar = new atar();
                String a = aaks.m21407a(context);
                if (!TextUtils.isEmpty(a)) {
                    synchronized (TapAndPayGcmRegistrationTaskOperation.class) {
                        String b = askc.m74272b();
                        HashMap hashMap = new HashMap();
                        Cursor rawQuery = asko.m74292a(context).mo49214a().rawQuery("SELECT account_id, gcm_id from Wallets WHERE wallet_id IS NOT NULL AND environment = ?;", new String[]{b});
                        while (rawQuery.moveToNext()) {
                            try {
                                hashMap.put(rawQuery.getString(i), rawQuery.getString(1));
                                i = 0;
                            } catch (Throwable th2) {
                                bqye.m113761a(th, th2);
                            }
                        }
                        if (rawQuery != null) {
                            rawQuery.close();
                        }
                        boolean z2 = true;
                        for (Map.Entry entry : hashMap.entrySet()) {
                            String str2 = (String) entry.getKey();
                            String a2 = asjg.m74211a(context2, str2);
                            if (a2 == null) {
                                bnsl bnsl = (bnsl) f108614a.mo68388c();
                                bnsl.mo68432a("com.google.android.gms.tapandpay.notifications.TapAndPayGcmRegistrationTaskOperation", "a", 87, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl.mo68405a("Couldn't find device account for account id, not registering gcm id");
                            } else if (!a.equals((String) entry.getValue())) {
                                z2 &= atar.mo49768a(new askf(str2, a2, b, context2), a);
                            }
                        }
                        z = true ^ z2;
                    }
                    return z ? 1 : 0;
                }
                bnsl bnsl2 = (bnsl) f108614a.mo68388c();
                bnsl2.mo68432a("com.google.android.gms.tapandpay.notifications.TapAndPayGcmRegistrationTaskOperation", "a", 56, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("No gcm id available, rescheduling");
                return 1;
            } catch (asks e) {
                bnsl bnsl3 = (bnsl) f108614a.mo68388c();
                bnsl3.mo68437a(e);
                bnsl3.mo68432a("com.google.android.gms.tapandpay.notifications.TapAndPayGcmRegistrationTaskOperation", "a", 61, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("Error registering gcm id");
                return 2;
            }
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo49333a(Context context) {
        aspj.m74419a(context);
        aspj.m74420b(context);
    }
}
