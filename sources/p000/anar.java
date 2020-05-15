package p000;

import android.content.ContentProviderClient;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: anar */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anar {

    /* renamed from: a */
    public static final String[] f76503a = {"_id", "raw_contact_id", "data_sync1", "data_version", "data14", "data_sync4"};

    /* renamed from: b */
    public static final String[] f76504b = {"vnd.android.cursor.item/photo"};

    /* renamed from: c */
    private final Context f76505c;

    public anar(Context context) {
        this.f76505c = context;
    }

    /* renamed from: a */
    public static String m63855a(String[] strArr) {
        return strArr[0] + " " + strArr[1] + " " + strArr[2];
    }

    /* renamed from: a */
    public final void mo41609a(Uri uri) {
        ContentProviderClient acquireContentProviderClient = this.f76505c.getContentResolver().acquireContentProviderClient(uri);
        if (acquireContentProviderClient != null) {
            long parseId = ContentUris.parseId(uri);
            StringBuilder sb = new StringBuilder(50);
            sb.append("mimetype=? AND raw_contact_id=");
            sb.append(parseId);
            try {
                Cursor query = acquireContentProviderClient.query(ContactsContract.Data.CONTENT_URI, f76503a, sb.toString(), f76504b, null);
                while (!Thread.currentThread().isInterrupted() && query.moveToNext()) {
                    try {
                        long j = query.getLong(0);
                        String[] a = amwx.m63591a(query.getString(2));
                        long j2 = query.getLong(3);
                        String string = query.getString(4);
                        long j3 = query.getLong(5);
                        String valueOf = String.valueOf(m63855a(a));
                        if (valueOf.length() == 0) {
                            new String(" EDIT_URI = ");
                        } else {
                            " EDIT_URI = ".concat(valueOf);
                        }
                        if (!TextUtils.isEmpty(a[1]) && !"Sync_High_Res".equals(a[2]) && string == null) {
                            a[2] = "Sync_High_Res";
                            ArrayList arrayList = new ArrayList();
                            ContentProviderOperation.Builder withValue = ContentProviderOperation.newUpdate(ContentUris.withAppendedId(ContactsContract.Data.CONTENT_URI, j).buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build()).withValue("data_sync1", m63855a(a)).withValue("data_sync3", null).withValue("data_sync4", Long.valueOf(j3 + 1));
                            StringBuilder sb2 = new StringBuilder(33);
                            sb2.append("data_version=");
                            sb2.append(j2);
                            arrayList.add(withValue.withSelection(sb2.toString(), null).build());
                            acquireContentProviderClient.applyBatch(arrayList);
                            ContentResolver.requestSync(null, "com.android.contacts", new Bundle());
                        }
                    } catch (OperationApplicationException e) {
                        throw new aaaj(13, "error writing photo data into provider");
                    } catch (Throwable th) {
                        query.close();
                        throw th;
                    }
                }
                query.close();
            } catch (RemoteException e2) {
            } catch (Throwable th2) {
                acquireContentProviderClient.release();
                throw th2;
            }
            acquireContentProviderClient.release();
            return;
        }
        Log.e("SyncHighResPhoto", "High res sync request with no content provider client.");
    }
}
