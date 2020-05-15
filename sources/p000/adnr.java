package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;

/* renamed from: adnr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adnr {

    /* renamed from: a */
    private final ContentResolver f62232a;

    /* renamed from: b */
    private final adns f62233b = adns.m50862a();

    /* renamed from: c */
    private final adnq f62234c;

    public adnr(ContentResolver contentResolver, adnq adnq) {
        this.f62232a = contentResolver;
        this.f62234c = adnq;
    }

    /* renamed from: a */
    public final Cursor mo33689a(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        CancellationSignal cancellationSignal;
        try {
            ContentResolver contentResolver = this.f62232a;
            adnq adnq = this.f62234c;
            if (adnq != null) {
                cancellationSignal = adnq.mo33686a();
            } else {
                cancellationSignal = null;
            }
            return contentResolver.query(uri, strArr, str, strArr2, str2, cancellationSignal);
        } catch (SecurityException e) {
            new Object[1][0] = e;
            this.f62233b.mo33690a(1);
            return null;
        } catch (SQLiteException e2) {
            new Object[1][0] = e2;
            this.f62233b.mo33690a(2);
            return null;
        } catch (NullPointerException e3) {
            new Object[1][0] = e3;
            this.f62233b.mo33690a(3);
            return null;
        } catch (NoClassDefFoundError e4) {
            new Object[1][0] = e4;
            this.f62233b.mo33690a(4);
            return null;
        } catch (OperationCanceledException e5) {
            new Object[1][0] = e5;
            this.f62233b.mo33690a(5);
            return null;
        }
    }
}
