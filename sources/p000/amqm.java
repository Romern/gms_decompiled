package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.people.internal.MatrixCursorParcelable;

/* renamed from: amqm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amqm extends amqd {

    /* renamed from: a */
    private final alzm f75758a;

    /* renamed from: b */
    private final Uri f75759b;

    /* renamed from: c */
    private final String[] f75760c;

    /* renamed from: d */
    private final String f75761d;

    /* renamed from: e */
    private final String[] f75762e;

    /* renamed from: f */
    private final String f75763f;

    public amqm(String str, int i, alzm alzm, Uri uri, String[] strArr, String str2, String[] strArr2, String str3) {
        super(str, i, null, "QueryGalProvider");
        this.f75758a = alzm;
        this.f75759b = uri;
        this.f75760c = strArr;
        this.f75761d = str2;
        this.f75762e = strArr2;
        this.f75763f = str3;
    }

    /* renamed from: a */
    private final void m63183a(amqv amqv, MatrixCursorParcelable matrixCursorParcelable) {
        alzm alzm = this.f75758a;
        if (alzm != null) {
            try {
                alzm.mo40533a(amqv.f75784a, matrixCursorParcelable);
            } catch (RemoteException e) {
                Log.e("QueryGalProviderOperation", "Operation failed remotely: ", e);
            }
        }
    }

    /* renamed from: b */
    public final void mo40603b(Context context) {
        Cursor query;
        if (cgbt.m144706b()) {
            try {
                query = context.getContentResolver().query(this.f75759b, this.f75760c, this.f75761d, this.f75762e, this.f75763f);
                m63183a(amqv.f75777c, new MatrixCursorParcelable(query));
                if (query != null) {
                    query.close();
                    return;
                }
                return;
            } catch (UnsupportedOperationException e) {
                m63183a(amqv.f75783i, null);
                return;
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        } else {
            Log.w("QueryGalProviderOperation", "GalProvider delegation disabled.");
            m63183a(amqv.f75783i, null);
            return;
        }
        throw th;
    }
}
