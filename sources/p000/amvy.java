package p000;

import android.accounts.Account;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.provider.ContactsContract;
import android.util.Base64;
import android.util.Log;
import java.util.List;

/* renamed from: amvy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amvy extends amvx {

    /* renamed from: b */
    public static final String f76153b = String.format("%s IS NULL AND %s !=0", "data_set", "should_sync");

    /* renamed from: c */
    public static final String f76154c = String.format("%s IS NULL", "data_set");

    private amvy(Cursor cursor) {
        super(cursor);
    }

    /* renamed from: a */
    public static amvy m63503a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        try {
            return m63506b(contentResolver, uri, strArr, str, strArr2, str2);
        } catch (RemoteException e) {
            throw new amyc(e);
        }
    }

    /* renamed from: b */
    public static amvy m63506b(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor query = contentResolver.query(uri, strArr, str, strArr2, str2);
        if (query != null) {
            return new amvy(query);
        }
        throw new RemoteException("Unable to query CP2.");
    }

    /* renamed from: a */
    public static List m63504a(ContentResolver contentResolver, Account account, String str) {
        return m63503a(contentResolver, amvt.m63471a(ContactsContract.Groups.CONTENT_URI, account), new String[]{"_id", "sourceid"}, str, null, null).mo41471e();
    }

    /* renamed from: a */
    public static boolean m63505a(ContentResolver contentResolver, Account account) {
        Cursor query = contentResolver.query(amvt.m63471a(ContactsContract.Settings.CONTENT_URI, account), new String[]{"should_sync"}, null, null, null);
        if (query != null) {
            boolean z = true;
            while (query.moveToNext()) {
                try {
                    z = query.getLong(0) != 0;
                } finally {
                    query.close();
                }
            }
            return z;
        }
        throw new amyc(new RemoteException("Unable to query CP2."));
    }

    /* renamed from: a */
    public final amvr mo41464b() {
        if (!mo41469d()) {
            return null;
        }
        amvq r = amvr.m63450r();
        r.f76118a = mo41466b("_id");
        r.f76121d = mo41465a("sourceid");
        r.f76122e = mo41465a("system_id");
        r.f76123f = mo41465a("title");
        r.f76120c = mo41466b("sync3");
        r.f76124g = mo41465a("sync2");
        r.f76125h = mo41465a("account_name");
        r.f76119b = mo41466b("version");
        if (cfxe.f185877a.mo6606a().mo82887j()) {
            r.f76126i = mo41465a("account_type");
        }
        if (cfxe.m143366e()) {
            r.f76127j = mo41465a("data_set");
        }
        if (cfxs.m143767b() && !bmxx.m108577a(mo41465a("sync1"))) {
            try {
                r.f76128k = (alvh) bxvk.m124016a(alvh.f74376d, Base64.decode(mo41465a("sync1"), 2), bxus.m123744c());
            } catch (bxwf | IllegalArgumentException e) {
                Log.e("FSA2_GroupsCursor", "SyncOneColumnData parsing error", e);
            }
        }
        if (mo41470d("favorites")) {
            r.mo41445d(true);
        }
        if (mo41470d("group_visible")) {
            r.mo41447f(true);
        }
        if (mo41470d("group_is_read_only")) {
            r.mo41446e(true);
        }
        if (mo41470d("auto_add")) {
            r.mo41442a(true);
        }
        if (mo41470d("dirty")) {
            r.mo41444c(true);
        }
        if (mo41470d("deleted")) {
            r.mo41443b(true);
        }
        return r.mo41441a();
    }
}
