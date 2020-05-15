package p000;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import com.google.android.gms.udc.UdcCacheRequest;
import com.google.android.gms.udc.UdcCacheResponse;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: asid */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class asid {

    /* renamed from: a */
    public static final /* synthetic */ int f89002a = 0;

    static {
        rjo rjo = auzz.f92845a;
    }

    /* renamed from: a */
    protected static void m74162a(Context context, bxvd bxvd) {
        boolean z;
        Bundle applicationRestrictions;
        bxvd da = bpwg.f139467r.mo74144da();
        int i = Build.VERSION.SDK_INT;
        UserManager userManager = (UserManager) context.getSystemService("user");
        if (userManager == null || (applicationRestrictions = userManager.getApplicationRestrictions(context.getPackageName())) == null) {
            z = false;
        } else {
            z = "true".equals(applicationRestrictions.getString("restricted_profile"));
        }
        boolean z2 = !z;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpwg bpwg = (bpwg) da.f164949b;
        bpwg.f139469a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        bpwg.f139484p = z2;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpwi bpwi = (bpwi) bxvd.f164949b;
        bpwg bpwg2 = (bpwg) da.mo74062i();
        bpwi bpwi2 = bpwi.f139493h;
        bpwg2.getClass();
        bpwi.f139498d = bpwg2;
        bpwi.f139495a |= 4;
        String packageName = context.getPackageName();
        AccountManager accountManager = AccountManager.get(context);
        int i2 = Build.VERSION.SDK_INT;
        List asList = Arrays.asList(accountManager.getAccountsByTypeForPackage("com.google", packageName));
        int size = asList.size();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        ((bpwi) bxvd.f164949b).f139501g = bxvk.m124030de();
        for (int i3 = 0; i3 < size; i3++) {
            Account account = (Account) asList.get(i3);
            if (((Boolean) asie.f89003a.mo58455c()).booleanValue()) {
                m74163a(auzz.m78131a(context, new auzy(account)), bxvd);
            }
        }
    }

    /* renamed from: a */
    protected static void m74163a(rjx rjx, bxvd bxvd) {
        boolean z;
        try {
            UdcCacheResponse udcCacheResponse = (UdcCacheResponse) aucu.m76783a(rjx.mo24689a(new UdcCacheRequest(new int[]{7, 8, 9, 10})), 10, TimeUnit.SECONDS);
            if (udcCacheResponse != null) {
                bxvd da = bpwh.f139486f.mo74144da();
                for (UdcCacheResponse.UdcSetting udcSetting : udcCacheResponse.f109350a) {
                    if (udcSetting.f109355b == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    switch (udcSetting.f109354a) {
                        case 7:
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bpwh bpwh = (bpwh) da.f164949b;
                            bpwh.f139488a |= 4;
                            bpwh.f139491d = z;
                            break;
                        case 8:
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bpwh bpwh2 = (bpwh) da.f164949b;
                            bpwh2.f139488a |= 1;
                            bpwh2.f139489b = z;
                            break;
                        case 9:
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bpwh bpwh3 = (bpwh) da.f164949b;
                            bpwh3.f139488a |= 8;
                            bpwh3.f139492e = z;
                            break;
                        case 10:
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bpwh bpwh4 = (bpwh) da.f164949b;
                            bpwh4.f139488a |= 2;
                            bpwh4.f139490c = z;
                            break;
                    }
                }
                bpwh bpwh5 = (bpwh) da.mo74062i();
                if (!bpwh5.equals(bpwh.f139486f)) {
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bpwi bpwi = (bpwi) bxvd.f164949b;
                    bpwi bpwi2 = bpwi.f139493h;
                    bpwh5.getClass();
                    if (!bpwi.f139501g.mo73666a()) {
                        bpwi.f139501g = bxvk.m124021a(bpwi.f139501g);
                    }
                    bpwi.f139501g.add(bpwh5);
                }
            }
        } catch (ExecutionException | TimeoutException e) {
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
        }
    }
}
