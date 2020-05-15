package p000;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.auth.GetAccountsRequest;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.Feature;
import java.util.List;

/* renamed from: gie */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gie extends gik {

    /* renamed from: a */
    public static final String f18285a = gik.f18296d;

    /* renamed from: b */
    public static final String f18286b = gik.f18297e;

    /* renamed from: a */
    public static String m13187a(Context context, Account account, String str) {
        return gik.m13216d(context, account, str);
    }

    @Deprecated
    /* renamed from: a */
    public static void m13192a(Context context, String str) {
        AccountManager.get(context).invalidateAuthToken("com.google", str);
    }

    /* renamed from: b */
    public static String m13194b(Context context, Account account, String str) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("handle_notification", true);
        try {
            TokenData c = gik.m13215c(context, account, str, bundle);
            rfy.m33551h(context);
            return c.f9944b;
        } catch (gil e) {
            rfx.m33533a(e.f18300a, context);
            Log.w("GoogleAuthUtil", "Error when getting token", e);
            throw new C1020gis("User intervention required. Notification has been pushed.");
        } catch (UserRecoverableAuthException e2) {
            rfy.m33551h(context);
            Log.w("GoogleAuthUtil", "Error when getting token", e2);
            throw new C1020gis("User intervention required. Notification has been pushed.");
        }
    }

    /* renamed from: c */
    public static TokenData m13197c(Context context, Account account, String str) {
        return gik.m13215c(context, account, str, null);
    }

    /* renamed from: d */
    public static Account[] m13199d(Context context, String str) {
        return gik.m13219g(context, str);
    }

    /* renamed from: a */
    public static String m13188a(Context context, Account account, String str, Bundle bundle) {
        return gik.m13211b(context, account, str, bundle);
    }

    /* renamed from: c */
    public static String m13198c(Context context, String str) {
        return gik.m13218f(context, str);
    }

    @Deprecated
    /* renamed from: a */
    public static String m13189a(Context context, String str, String str2) {
        return gik.m13216d(context, new Account(str, "com.google"), str2);
    }

    @Deprecated
    /* renamed from: a */
    public static String m13190a(Context context, String str, String str2, Bundle bundle) {
        return gik.m13212b(context, str, str2, bundle);
    }

    /* renamed from: a */
    public static List m13191a(Context context, int i, String str) {
        return gik.m13213b(context, i, str);
    }

    /* renamed from: a */
    public static Account[] m13193a(Context context, String str, String[] strArr) {
        sdo.m34959a(context);
        sdo.m34977c(str);
        gik.m13214b(context);
        bdyx.m91614a(context);
        if (cbyz.m128936b() && gik.m13210a(context)) {
            goh a = goi.m13611a(context);
            GetAccountsRequest getAccountsRequest = new GetAccountsRequest(str, strArr);
            sdo.m34966a(getAccountsRequest, "request cannot be null.");
            roz b = rpa.m34196b();
            b.f43473b = new Feature[]{ghy.f18279e};
            b.f43472a = new gps(getAccountsRequest);
            try {
                List list = (List) gik.m13207a(((rjx) a).mo24732b(b.mo24977a()), "Accounts retrieval");
                gik.m13209a(list);
                return (Account[]) list.toArray(new Account[0]);
            } catch (rjp e) {
                gik.f18299g.mo25416d("Encountered APIException with code %s for %s, falls back to the other branch.", Integer.valueOf(e.mo24655a()), "Accounts retrieval");
            }
        }
        return (Account[]) gik.m13206a(context, gik.f18298f, new gii(str, strArr));
    }

    @Deprecated
    /* renamed from: b */
    public static String m13195b(Context context, String str, String str2) {
        return m13194b(context, new Account(str, "com.google"), str2);
    }

    /* renamed from: b */
    public static void m13196b(Context context, String str) {
        gik.m13217e(context, str);
    }
}
