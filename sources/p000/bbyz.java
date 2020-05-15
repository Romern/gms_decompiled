package p000;

import android.database.Cursor;
import android.net.Uri;
import java.util.concurrent.Callable;

/* renamed from: bbyz */
final /* synthetic */ class bbyz implements Callable {

    /* renamed from: a */
    private final bcas f103782a;

    /* renamed from: b */
    private final String f103783b;

    public bbyz(bcas bcas, String str) {
        this.f103782a = bcas;
        this.f103783b = str;
    }

    public final Object call() {
        bcas bcas = this.f103782a;
        String str = this.f103783b;
        bdae bdae = bcas.f103908c;
        Uri d = bcas.mo56655d("messages");
        boolean z = true;
        Cursor a = bdae.mo54677a(d, new String[]{"id"}, "message_id = ?", new String[]{str}, null, null);
        try {
            if (a.getCount() == 0) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            if (a != null) {
                a.close();
            }
            return valueOf;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
