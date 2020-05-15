package p000;

import android.accounts.Account;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: amyt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amyt {

    /* renamed from: a */
    public final Account f76410a;

    /* renamed from: b */
    private final ContentResolver f76411b;

    static {
        sdo.m34974b(TextUtils.equals("sourceid", "sourceid"));
    }

    public amyt(Account account, ContentResolver contentResolver) {
        this.f76410a = account;
        this.f76411b = contentResolver;
    }

    /* renamed from: a */
    public final void mo41573a(ContentProviderOperation contentProviderOperation, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(contentProviderOperation);
        try {
            amvt.m63474a(this.f76411b, arrayList);
        } catch (OperationApplicationException | RemoteException e) {
            amdk.m62658a("FSA2_MarkAndSweepUtil", "Failed to perform %s operation", str);
            throw new amyc(e);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo41574a(Uri uri) {
        Cursor query = this.f76411b.query(amvt.m63471a(uri, this.f76410a), amvt.f76137a, "sync2='SWEEP_MARK'", null, null);
        if (query != null) {
            try {
                query.moveToLast();
                query.getInt(0);
                query.close();
                ContentProviderOperation build = ContentProviderOperation.newDelete(amvt.m63471a(uri, this.f76410a)).withSelection("sync2='SWEEP_MARK'", null).build();
                build.toString().replace("%40g", "%%40g");
                mo41573a(build, "sweep");
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        } else {
            throw new amyc(new RemoteException("Unable to query CP2."));
        }
    }
}
