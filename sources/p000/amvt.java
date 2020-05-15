package p000;

import android.accounts.Account;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.provider.ContactsContract;
import android.util.Log;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: amvt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amvt {

    /* renamed from: a */
    public static final String[] f76137a = {"_count"};

    /* renamed from: b */
    public final amvv f76138b;

    /* renamed from: c */
    public final amvu f76139c;

    /* renamed from: d */
    public final amvu f76140d;

    /* renamed from: e */
    public final amvu f76141e;

    /* renamed from: f */
    private final ContentResolver f76142f;

    /* renamed from: g */
    private final amwn f76143g;

    public amvt(Account account, ContentResolver contentResolver, anaz anaz) {
        this(account, contentResolver, anaz, true);
    }

    /* renamed from: a */
    public static int m63469a(ContentResolver contentResolver, Uri uri, String str, String[] strArr) {
        Cursor query = contentResolver.query(uri, new String[]{"_count"}, str, strArr, null);
        if (query != null) {
            try {
                query.moveToLast();
                return query.getInt(0);
            } finally {
                query.close();
            }
        } else {
            throw new RemoteException("Unable to query CP2");
        }
    }

    /* renamed from: b */
    public final void mo41451b() {
        synchronized (this.f76143g) {
            m63473a(this.f76142f, this.f76143g);
        }
    }

    public amvt(Account account, ContentResolver contentResolver, anaz anaz, boolean z) {
        this.f76143g = new amwn();
        this.f76139c = new amvu(m63472a(ContactsContract.Groups.CONTENT_URI, account, z), this.f76143g, anaz);
        this.f76138b = new amvv(account, z, contentResolver, this.f76143g, anaz);
        this.f76140d = new amvu(m63472a(ContactsContract.Data.CONTENT_URI, account, z), this.f76143g, anaz);
        this.f76141e = new amvu(m63472a(ContactsContract.Data.CONTENT_URI, account, z), this.f76143g, anaz);
        this.f76142f = contentResolver;
    }

    /* renamed from: a */
    public static Uri m63470a(Uri uri) {
        return uri.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build();
    }

    /* renamed from: a */
    public static Uri m63471a(Uri uri, Account account) {
        return m63472a(uri, account, true);
    }

    /* renamed from: a */
    public static Uri m63472a(Uri uri, Account account, boolean z) {
        if (account == null) {
            return uri;
        }
        Uri.Builder appendQueryParameter = uri.buildUpon().appendQueryParameter("account_name", account.name).appendQueryParameter("account_type", account.type);
        if (z) {
            appendQueryParameter.appendQueryParameter("caller_is_syncadapter", "true");
        }
        return appendQueryParameter.build();
    }

    /* renamed from: a */
    public static void m63473a(ContentResolver contentResolver, amwn amwn) {
        if (!amwn.mo41499c()) {
            int d = amwn.mo41500d();
            try {
                int length = m63474a(contentResolver, amwn.mo41498b()).length;
            } catch (RemoteException e) {
                Log.e("FSA2_DatabaseHelper", "Failed to apply at least one operation", e);
                throw new amyc(e);
            } catch (OperationApplicationException e2) {
                int numSuccessfulYieldPoints = e2.getNumSuccessfulYieldPoints();
                Log.e("FSA2_DatabaseHelper", String.format(Locale.US, "Failed to apply %d of the %d operations", Integer.valueOf(d - numSuccessfulYieldPoints), Integer.valueOf(d)), e2);
                throw new amyc(e2);
            }
        }
    }

    /* renamed from: a */
    public static ContentProviderResult[] m63474a(ContentResolver contentResolver, ArrayList arrayList) {
        return contentResolver.applyBatch("com.android.contacts", arrayList);
    }

    /* renamed from: a */
    public final void mo41449a() {
        amig.m62939a();
        int intValue = Integer.valueOf((int) cfvk.f185780a.mo6606a().mo83036m()).intValue();
        synchronized (this.f76143g) {
            if (this.f76143g.mo41500d() >= intValue) {
                mo41451b();
            }
        }
    }

    /* renamed from: a */
    public final void mo41450a(ContentProviderOperation.Builder builder) {
        this.f76143g.mo41496a(builder, true);
    }
}
