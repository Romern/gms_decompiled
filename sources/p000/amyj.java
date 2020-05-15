package p000;

import android.accounts.Account;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Log;
import java.util.List;

/* renamed from: amyj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class amyj {

    /* renamed from: a */
    public final ContentResolver f76380a;

    /* renamed from: b */
    public final Account f76381b;

    /* renamed from: c */
    public final amvm f76382c;

    /* renamed from: d */
    public volatile Thread f76383d;

    public amyj(ContentResolver contentResolver, Account account, amvm amvm) {
        this.f76380a = contentResolver;
        this.f76381b = account;
        this.f76382c = amvm;
    }

    /* renamed from: b */
    public abstract void mo41563b(List list, anaq anaq);

    /* renamed from: a */
    public final int mo41560a(Uri uri, String str) {
        Cursor query = this.f76380a.query(uri, amvt.f76137a, str, null, null);
        if (query != null) {
            try {
                query.moveToLast();
                return query.getInt(0);
            } finally {
                query.close();
            }
        } else {
            Log.e("FSA2_DatabaseReader", "Failed to query CP2.");
            throw new amyc(new RemoteException("Unable to query CP2."));
        }
    }

    /* renamed from: a */
    public final void mo41561a(anaq anaq, anaq anaq2) {
        sdo.m34974b(true);
        this.f76383d = new Thread(new amyh(this, anaq, anaq2));
        this.f76383d.getId();
        this.f76382c.mo41391a(this.f76383d);
        this.f76383d.start();
    }

    /* renamed from: a */
    public final void mo41562a(List list, anaq anaq) {
        mo41563b(list, anaq);
        list.clear();
    }
}
