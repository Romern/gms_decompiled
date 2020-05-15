package p000;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.ContentProvider;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.provider.PlusChimeraContentProvider;
import java.io.IOException;
import java.util.List;

/* renamed from: aoaz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoaz implements aoay {
    /* renamed from: a */
    public static ConnectionResult m65723a(Context context, ClientContext clientContext, boolean z, boolean z2) {
        anui anui = new anui(context, clientContext);
        if (z) {
            anui.mo42291b();
            anui.f77744a = 2;
        }
        if (z2) {
            anui.f77744a = 0;
        }
        return m65724a(context, clientContext.f30215e, 4, anui.mo42290a());
    }

    /* renamed from: a */
    public static ConnectionResult m65724a(Context context, String str, int i, Intent intent) {
        PendingIntent pendingIntent;
        if (intent != null) {
            intent.putExtra("com.google.android.gms.plus.intent.extra.AUTHENTICATED_CALLING_PACKAGE", str);
            pendingIntent = PendingIntent.getActivity(context, 0, intent, 134217728);
        } else {
            pendingIntent = null;
        }
        return new ConnectionResult(i, pendingIntent);
    }

    /* renamed from: a */
    public final ConnectionResult mo42518a(Context context, ClientContext clientContext, String[] strArr) {
        Account account;
        SQLiteDatabase writableDatabase;
        String str = clientContext.f30215e;
        String b = clientContext.mo17802b();
        List d = soz.m35801d(context, str);
        int size = d.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                account = null;
                break;
            }
            account = (Account) d.get(i);
            if (b.equals(account.name)) {
                break;
            }
            i++;
        }
        if (account == null) {
            return new ConnectionResult(8, null);
        }
        try {
            Boolean bool = (Boolean) adyd.m51363a(context).mo33906a(account, strArr, (AccountManagerCallback) null).getResult();
            if (bool != null && !bool.booleanValue()) {
                ContentResolver contentResolver = context.getContentResolver();
                String b2 = clientContext.mo17802b();
                ContentProviderClient acquireContentProviderClient = contentResolver.acquireContentProviderClient("com.google.android.gms.plus");
                try {
                    PlusChimeraContentProvider plusChimeraContentProvider = (PlusChimeraContentProvider) ContentProvider.getLocalContentProvider(acquireContentProviderClient);
                    writableDatabase = plusChimeraContentProvider.f82604b.getWritableDatabase();
                    writableDatabase.beginTransactionWithListener(plusChimeraContentProvider);
                    plusChimeraContentProvider.mo46635a(b2, writableDatabase);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    acquireContentProviderClient.release();
                } catch (Throwable th) {
                    acquireContentProviderClient.release();
                    throw th;
                }
            }
            if (bool != null) {
                if (bool.booleanValue()) {
                    return ConnectionResult.f30063a;
                }
            }
            anui anui = new anui(context, clientContext);
            anui.f77744a = 1;
            return m65724a(context, clientContext.f30215e, 4, anui.mo42290a());
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            return new ConnectionResult(8, null);
        }
    }

    /* renamed from: a */
    public final ConnectionResult mo42519a(Context context, String str, int i, String str2, String str3, String[] strArr) {
        Bundle bundle = new Bundle();
        bundle.putString(gie.f18286b, str);
        bundle.putBoolean("suppressProgressScreen", true);
        if (strArr != null) {
            bundle.putString("request_visible_actions", TextUtils.join(" ", strArr));
        }
        bundle.putInt(gie.f18285a, i);
        if (str2 != null) {
            try {
                gie.m13190a(context, str3, str2, bundle);
            } catch (gid e) {
                aoam.m65704a(context.getContentResolver(), str3, str);
                throw e;
            }
        }
        return ConnectionResult.f30063a;
    }
}
