package p000;

import android.content.ContentProviderClient;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.Context;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: sgq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sgq {
    /* renamed from: a */
    public static Cursor m35235a(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        ContentProviderClient acquireContentProviderClient = context.getContentResolver().acquireContentProviderClient(uri.getAuthority());
        try {
            Cursor query = acquireContentProviderClient.query(uri, strArr, str, strArr2, str2);
            acquireContentProviderClient.release();
            return query;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        } catch (Throwable th) {
            acquireContentProviderClient.release();
            throw th;
        }
    }

    /* renamed from: b */
    public static DataHolder m35237b(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return new DataHolder(m35235a(context, uri, strArr, str, strArr2, str2), null);
    }

    /* renamed from: b */
    public static ArrayList m35238b(ContentResolver contentResolver, ArrayList arrayList, String str) {
        if (arrayList.size() == 0) {
            return new ArrayList();
        }
        try {
            return new ArrayList(Arrays.asList(contentResolver.applyBatch(((ContentProviderOperation) arrayList.get(0)).getUri().getAuthority(), arrayList)));
        } catch (RemoteException e) {
            throw new AssertionError(e);
        } catch (OperationApplicationException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
            sb.append("Error applying batch operation: ");
            sb.append(valueOf);
            Log.e(str, sb.toString());
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m35236a(ContentResolver contentResolver, ArrayList arrayList, String str) {
        return m35238b(contentResolver, arrayList, str) != null;
    }
}
