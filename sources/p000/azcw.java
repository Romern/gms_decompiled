package p000;

import android.content.ContentValues;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* renamed from: azcw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azcw {

    /* renamed from: b */
    private static WeakReference f99017b = new WeakReference(null);

    /* renamed from: a */
    public final Context f99018a;

    public azcw(Context context) {
        this.f99018a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static synchronized azcw m85379a(Context context) {
        azcw azcw;
        synchronized (azcw.class) {
            azcw = (azcw) f99017b.get();
            if (azcw == null) {
                azcw = new azcw(context);
                f99017b = new WeakReference(azcw);
            }
        }
        return azcw;
    }

    /* renamed from: a */
    public final void mo54708a(String str, String str2, int i) {
        Executor executor = azox.f99803a;
        azcm a = azcm.m85300a(this.f99018a);
        if (a.mo54658b()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("key", str);
            contentValues.put("type", Integer.valueOf(i));
            contentValues.put("value", str2);
            a.f98996b.beginTransaction();
            try {
                a.f98996b.insert("sharedPreference", null, contentValues);
                a.f98996b.setTransactionSuccessful();
            } finally {
                a.f98996b.endTransaction();
            }
        }
    }
}
