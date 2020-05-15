package p000;

import android.accounts.Account;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.database.SQLException;
import android.net.Uri;
import android.os.RemoteException;
import android.provider.ContactsContract;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: amwm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amwm {

    /* renamed from: b */
    private static final String[] f76192b = {"data"};

    /* renamed from: c */
    private static final Uri f76193c = ContactsContract.SyncState.CONTENT_URI;

    /* renamed from: a */
    public boolean f76194a = false;

    /* renamed from: d */
    private final ContentResolver f76195d;

    /* renamed from: e */
    private final String f76196e;

    /* renamed from: f */
    private final String[] f76197f;

    /* renamed from: g */
    private final Object f76198g = new Object();

    public amwm(ContentResolver contentResolver, Account account) {
        this.f76195d = contentResolver;
        String str = account.name;
        String str2 = account.type;
        this.f76196e = "account_name=? AND account_type=?";
        this.f76197f = new String[]{str, str2};
        byte[] bArr = null;
        try {
            bArr = mo41495b();
        } catch (SQLException e) {
            String message = e.getMessage();
            if (message != null && message.indexOf("Unable to convert") >= 0) {
                Log.e("FSA2_SyncState", "Error to read sync state bytes from CP2, clearing...");
                mo41494a(ContentProviderOperation.newDelete(f76193c).withSelection(this.f76196e, this.f76197f).build());
            }
        }
        if (bArr == null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("account_name", str);
            contentValues.put("account_type", str2);
            contentValues.put("data", m63545b(amvh.f76004g));
            mo41494a(ContentProviderOperation.newInsert(f76193c).withValues(contentValues).build());
        }
    }

    /* renamed from: b */
    static final byte[] m63545b(amvh amvh) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            amvh.mo73638a(byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            Log.e("FSA2_SyncState", "Error when converting FocusSyncState to bytes.", e);
            return null;
        }
    }

    /* renamed from: a */
    public final amvh mo41492a() {
        byte[] b = mo41495b();
        amvh amvh = amvh.f76004g;
        if (b != null) {
            try {
                amvh = (amvh) GeneratedMessageLite.m124016a(amvh.f76004g, b, bxus.m123744c());
            } catch (bxwf e) {
                this.f76194a = true;
                Log.e("FSA2_SyncState", "error when parsing blob to proto", e);
                mo41494a(mo41493a(amvh));
            }
        }
        amdk.m62656a("FSA2_SyncState", "@readSyncState: %s", amvh);
        return amvh;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final byte[] mo41495b() {
        synchronized (this.f76198g) {
            ContentResolver contentResolver = this.f76195d;
            Uri uri = f76193c;
            String[] strArr = f76192b;
            String str = this.f76196e;
            String[] strArr2 = this.f76197f;
            String[] strArr3 = amvt.f76137a;
            Cursor query = contentResolver.query(uri, strArr, str, strArr2, null);
            if (query != null) {
                try {
                    if (query.moveToNext()) {
                        byte[] blob = query.getBlob(0);
                        return blob;
                    }
                    query.close();
                    return null;
                } finally {
                    query.close();
                }
            } else {
                Log.e("FSA2_SyncState", "Failed to query CP2");
                throw new amyc(new RemoteException("Unable to query CP2"));
            }
        }
    }

    /* renamed from: a */
    public final ContentProviderOperation mo41493a(amvh amvh) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("data", m63545b(amvh));
        return ContentProviderOperation.newUpdate(f76193c).withValues(contentValues).withSelection(this.f76196e, this.f76197f).build();
    }

    /* renamed from: a */
    public final void mo41494a(ContentProviderOperation contentProviderOperation) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(contentProviderOperation);
        try {
            synchronized (this.f76198g) {
                amvt.m63474a(this.f76195d, arrayList);
            }
        } catch (OperationApplicationException | RemoteException e) {
            Log.e("FSA2_SyncState", "Failed to apply database operation", e);
            throw new amyc(e);
        }
    }
}
