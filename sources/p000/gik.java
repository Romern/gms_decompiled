package p000;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;
import com.google.android.gms.common.Feature;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: gik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class gik {

    /* renamed from: c */
    public static final String[] f18295c = {"com.google", "com.google.work", "cn.google"};

    /* renamed from: d */
    public static final String f18296d = "callerUid";

    /* renamed from: e */
    public static final String f18297e = "androidPackageName";

    /* renamed from: f */
    public static final ComponentName f18298f = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");

    /* renamed from: g */
    public static final sek f18299g = ght.m13171a("GoogleAuthUtil");

    static {
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
    }

    /* renamed from: a */
    public static TokenData m13205a(Bundle bundle) {
        TokenData a = TokenData.m6261a(bundle, "tokenDetails");
        if (a != null) {
            return a;
        }
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        izj c = izj.m16369c(string);
        if (izj.m16367a(c)) {
            sek sek = f18299g;
            String valueOf = String.valueOf(c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
            sb.append("isUserRecoverableError status: ");
            sb.append(valueOf);
            sek.mo25416d("GoogleAuthUtil", sb.toString());
            throw new UserRecoverableAuthException(string, intent);
        } else if (izj.m16368b(c)) {
            throw new IOException(string);
        } else {
            throw new gid(string);
        }
    }

    /* renamed from: b */
    public static String m13211b(Context context, Account account, String str, Bundle bundle) {
        m13208a(account);
        return m13215c(context, account, str, bundle).f9944b;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: c */
    public static TokenData m13215c(Context context, Account account, String str, Bundle bundle) {
        Bundle bundle2;
        sdo.m34973b("Calling this from your main thread can lead to deadlock");
        sdo.m34969a(str, (Object) "Scope cannot be empty or null.");
        m13208a(account);
        m13214b(context);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        String str2 = context.getApplicationInfo().packageName;
        bundle2.putString("clientPackageName", str2);
        if (TextUtils.isEmpty(bundle2.getString(f18297e))) {
            bundle2.putString(f18297e, str2);
        }
        bundle2.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
        bdyx.m91614a(context);
        if (cbyz.m128937c() && m13210a(context)) {
            goh a = goi.m13611a(context);
            sdo.m34966a(account, "Account name cannot be null!");
            sdo.m34969a(str, (Object) "Scope cannot be null!");
            roz b = rpa.m34196b();
            b.f43473b = new Feature[]{ghy.f18278d};
            b.f43472a = new gpp(account, str, bundle2);
            try {
                Bundle bundle3 = (Bundle) m13207a(((rjx) a).mo24732b(b.mo24977a()), "token retrieval");
                m13209a((Object) bundle3);
                return m13205a(bundle3);
            } catch (rjp e) {
                f18299g.mo25416d("Encountered APIException with code %s for %s, falls back to the other branch.", Integer.valueOf(e.mo24655a()), "token retrieval");
            }
        }
        return (TokenData) m13206a(context, f18298f, new gif(account, str, bundle2));
    }

    /* renamed from: d */
    public static String m13216d(Context context, Account account, String str) {
        return m13211b(context, account, str, new Bundle());
    }

    /* renamed from: e */
    public static void m13217e(Context context, String str) {
        sdo.m34973b("Calling this from your main thread can lead to deadlock");
        m13214b(context);
        Bundle bundle = new Bundle();
        String str2 = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str2);
        if (!bundle.containsKey(f18297e)) {
            bundle.putString(f18297e, str2);
        }
        bdyx.m91614a(context);
        if (cbyz.m128937c() && m13210a(context)) {
            goh a = goi.m13611a(context);
            ClearTokenRequest clearTokenRequest = new ClearTokenRequest();
            clearTokenRequest.f10609b = str;
            roz b = rpa.m34196b();
            b.f43473b = new Feature[]{ghy.f18278d};
            b.f43472a = new gpq(clearTokenRequest);
            try {
                m13207a(((rjx) a).mo24732b(b.mo24977a()), "clear token");
                return;
            } catch (rjp e) {
                f18299g.mo25416d("Encountered APIException with code %s for %s, falls back to the other branch.", Integer.valueOf(e.mo24655a()), "clear token");
            }
        }
        m13206a(context, f18298f, new gig(str, bundle));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: f */
    public static String m13218f(Context context, String str) {
        sdo.m34969a(str, (Object) "accountName must be provided");
        sdo.m34973b("Calling this from your main thread can lead to deadlock");
        m13214b(context);
        return m13212b(context, str, "^^_account_id_^^", new Bundle());
    }

    /* renamed from: g */
    public static Account[] m13219g(Context context, String str) {
        sdo.m34977c(str);
        int i = rfj.f42871c;
        rfy.m33555l(context);
        int i2 = Build.VERSION.SDK_INT;
        sdo.m34959a(context);
        ContentProviderClient acquireContentProviderClient = context.getContentResolver().acquireContentProviderClient("com.google.android.gms.auth.accounts");
        if (acquireContentProviderClient != null) {
            try {
                Parcelable[] parcelableArray = acquireContentProviderClient.call("get_accounts", str, new Bundle()).getParcelableArray("accounts");
                Account[] accountArr = new Account[parcelableArray.length];
                for (int i3 = 0; i3 < parcelableArray.length; i3++) {
                    accountArr[i3] = (Account) parcelableArray[i3];
                }
                acquireContentProviderClient.release();
                return accountArr;
            } catch (Exception e) {
                f18299g.mo25418e("GoogleAuthUtil", "Error when getting accounts", e);
                String valueOf = String.valueOf(e.getMessage());
                throw new RemoteException(valueOf.length() == 0 ? new String("Accounts ContentProvider failed: ") : "Accounts ContentProvider failed: ".concat(valueOf));
            } catch (Throwable th) {
                acquireContentProviderClient.release();
                throw th;
            }
        } else {
            throw new RemoteException("The com.google.android.gms.auth.accounts provider is not available.");
        }
    }

    @Deprecated
    /* renamed from: b */
    public static String m13212b(Context context, String str, String str2, Bundle bundle) {
        return m13211b(context, new Account(str, "com.google"), str2, bundle);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: b */
    public static List m13213b(Context context, int i, String str) {
        sdo.m34969a(str, (Object) "accountName must be provided");
        sdo.m34973b("Calling this from your main thread can lead to deadlock");
        m13214b(context);
        AccountChangeEventsRequest accountChangeEventsRequest = new AccountChangeEventsRequest();
        accountChangeEventsRequest.f9912c = str;
        accountChangeEventsRequest.f9911b = i;
        bdyx.m91614a(context);
        if (cbyz.m128936b() && m13210a(context)) {
            goh a = goi.m13611a(context);
            sdo.m34966a(accountChangeEventsRequest, "request cannot be null.");
            roz b = rpa.m34196b();
            b.f43473b = new Feature[]{ghy.f18279e};
            b.f43472a = new gpr(accountChangeEventsRequest);
            try {
                AccountChangeEventsResponse accountChangeEventsResponse = (AccountChangeEventsResponse) m13207a(((rjx) a).mo24732b(b.mo24977a()), "account change events retrieval");
                m13209a(accountChangeEventsResponse);
                return accountChangeEventsResponse.f9915b;
            } catch (rjp e) {
                f18299g.mo25416d("Encountered APIException with code %s for %s, falls back to the other branch.", Integer.valueOf(e.mo24655a()), "account change events retrieval");
            }
        }
        return (List) m13206a(context, f18298f, new gih(accountChangeEventsRequest));
    }

    /* renamed from: a */
    public static Object m13206a(Context context, ComponentName componentName, gij gij) {
        rex rex = new rex();
        sbq a = sbq.m34856a(context);
        try {
            if (a.mo25355a(componentName, rex, "GoogleAuthUtil")) {
                try {
                    Object a2 = gij.mo11906a(rex.mo24567a());
                    a.mo25351a(componentName, rex);
                    return a2;
                } catch (RemoteException | InterruptedException e) {
                    f18299g.mo25414c("GoogleAuthUtil", "Error on service connection.", e);
                    throw new IOException("Error on service connection.", e);
                } catch (Throwable th) {
                    a.mo25351a(componentName, rex);
                    throw th;
                }
            } else {
                throw new IOException("Could not bind to service.");
            }
        } catch (SecurityException e2) {
            f18299g.mo25416d("SecurityException while bind to auth service: %s", e2.getMessage());
            throw new IOException("SecurityException while binding to Auth service.", e2);
        }
    }

    /* renamed from: a */
    public static Object m13207a(aucb aucb, String str) {
        try {
            return aucu.m76782a(aucb);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof rjp) {
                throw ((rjp) cause);
            }
            String format = String.format("Unable to get a result for %s due to ExecutionException.", str);
            f18299g.mo25416d(format, new Object[0]);
            throw new IOException(format, e);
        } catch (InterruptedException e2) {
            String format2 = String.format("Interrupted while waiting for the task of %s to finish.", str);
            f18299g.mo25416d(format2, new Object[0]);
            throw new IOException(format2, e2);
        } catch (CancellationException e3) {
            String format3 = String.format("Canceled while waiting for the task of %s to finish.", str);
            f18299g.mo25416d(format3, new Object[0]);
            throw new IOException(format3, e3);
        }
    }

    /* renamed from: b */
    public static void m13214b(Context context) {
        try {
            rfy.m33555l(context.getApplicationContext());
        } catch (rfw e) {
            throw new gil(e.f42890a, e.getMessage(), new Intent(e.f42912b));
        } catch (rfv e2) {
            throw new gid(e2.getMessage());
        }
    }

    /* renamed from: a */
    private static void m13208a(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        } else if (!TextUtils.isEmpty(account.name)) {
            String[] strArr = f18295c;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                if (!strArr[i].equals(account.type)) {
                    i++;
                } else {
                    return;
                }
            }
            throw new IllegalArgumentException("Account type not supported");
        } else {
            throw new IllegalArgumentException("Account name cannot be empty!");
        }
    }

    /* renamed from: a */
    public static void m13209a(Object obj) {
        if (obj == null) {
            f18299g.mo25416d("GoogleAuthUtil", "Service call returned null.");
            throw new IOException("Service unavailable.");
        }
    }

    /* renamed from: a */
    public static boolean m13210a(Context context) {
        return rfi.f42868a.mo24590b(context) == 0;
    }
}
