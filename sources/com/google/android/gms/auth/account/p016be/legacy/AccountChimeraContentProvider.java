package com.google.android.gms.auth.account.p016be.legacy;

import android.accounts.Account;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import com.google.android.chimera.ContentProvider;

/* renamed from: com.google.android.gms.auth.account.be.legacy.AccountChimeraContentProvider */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountChimeraContentProvider extends ContentProvider {

    /* renamed from: a */
    private static final sek f10004a = ght.m13171a("AccountChimeraContentProvider");

    /* renamed from: b */
    private adyd f10005b;

    /* renamed from: c */
    private rfz f10006c;

    public final Bundle call(String str, String str2, Bundle bundle) {
        Account[] accountArr;
        int length;
        int i;
        bljb a;
        Throwable th;
        String str3 = str;
        String str4 = str2;
        int callingUid = Binder.getCallingUid();
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (this.f10006c.mo24608b(callingUid)) {
                Bundle bundle2 = new Bundle();
                String str5 = null;
                int i2 = 0;
                if ("get_accounts".equals(str3)) {
                    svq b = svr.m36484b(getContext());
                    String[] a2 = b.mo26175a(callingUid);
                    if (!(a2 == null || (length = a2.length) == 0)) {
                        str5 = a2[0];
                        if (length != 1) {
                            String str6 = str5;
                            int i3 = Integer.MAX_VALUE;
                            for (String str7 : a2) {
                                try {
                                    ApplicationInfo a3 = b.mo26172a(str7, i2);
                                    if (a3 != null && (i = a3.targetSdkVersion) < i3) {
                                        str6 = str7;
                                        i3 = i;
                                    }
                                } catch (PackageManager.NameNotFoundException e) {
                                    sek sek = f10004a;
                                    String valueOf = String.valueOf(e);
                                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                                    sb.append("Error while getting ApplicationInfo ");
                                    sb.append(valueOf);
                                    String sb2 = sb.toString();
                                    i2 = 0;
                                    sek.mo25412b(sb2, new Object[0]);
                                }
                            }
                            str5 = str6;
                        }
                    }
                    if (!((ily) ily.f21320d.mo13145b()).mo13133b(callingUid)) {
                        accountArr = this.f10005b.mo33917a(str4, str5);
                    } else {
                        accountArr = this.f10005b.mo33916a(str4);
                    }
                    bundle2.putParcelableArray("accounts", accountArr);
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    return bundle2;
                } else if ("clear_password".equals(str3)) {
                    Account account = (Account) bundle.getParcelable("clear_password");
                    f10004a.mo25414c("Calling clearPassword on account by uid: %d", Integer.valueOf(callingUid));
                    adyd adyd = this.f10005b;
                    a = blkh.m107281a("AccountManager.clearPassword");
                    adyd.f62893a.clearPassword(account);
                    if (a != null) {
                        a.close();
                    }
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    return null;
                } else {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    throw new IllegalArgumentException(String.format("Unsupported method [%s] or argument [%s].", str3, str4));
                }
            } else {
                throw new SecurityException("Caller isn't signed with recognized keys!");
            }
        } catch (Throwable th2) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th2;
        }
        throw th;
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public final String getType(Uri uri) {
        return "text/plain";
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    public final boolean onCreate() {
        Context context = getContext();
        rfz a = rfz.m33557a(context);
        this.f10005b = adyd.m51363a(context);
        this.f10006c = a;
        return true;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new UnsupportedOperationException();
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}
