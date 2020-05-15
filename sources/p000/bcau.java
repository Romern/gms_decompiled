package p000;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.concurrent.Callable;

/* renamed from: bcau */
final /* synthetic */ class bcau implements Callable {

    /* renamed from: a */
    private final bcav f103917a;

    /* renamed from: b */
    private final ContactId f103918b;

    /* renamed from: c */
    private final ContentValues f103919c;

    public bcau(bcav bcav, ContactId contactId, ContentValues contentValues) {
        this.f103917a = bcav;
        this.f103918b = contactId;
        this.f103919c = contentValues;
    }

    public final Object call() {
        long j;
        bcav bcav = this.f103917a;
        ContactId contactId = this.f103918b;
        ContentValues contentValues = this.f103919c;
        Cursor b = bcav.mo56672b(contactId);
        try {
            boolean z = false;
            if (b.moveToFirst()) {
                j = (long) b.getInt(bced.m88857a(1));
                bcav.f103920a.mo54674a(bcav.mo56666a("registration"), contentValues, "registration_id =? AND tachyon_app_name =?", new String[]{Long.toString(j), contactId.mo60493b()});
            } else {
                j = -1;
            }
            if (b != null) {
                b.close();
            }
            if (j != -1) {
                z = true;
            }
            return Boolean.valueOf(z);
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
