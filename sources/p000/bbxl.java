package p000;

import android.content.ContentValues;
import com.google.android.libraries.messaging.lighter.model.ContactId;

/* renamed from: bbxl */
final /* synthetic */ class bbxl implements Runnable {

    /* renamed from: a */
    private final bbxm f103673a;

    /* renamed from: b */
    private final ContactId f103674b;

    public bbxl(bbxm bbxm, ContactId contactId) {
        this.f103673a = bbxm;
        this.f103674b = contactId;
    }

    public final void run() {
        bbxm bbxm = this.f103673a;
        ContactId contactId = this.f103674b;
        bdaw bdaw = bbxm.f103676b;
        ContentValues contentValues = new ContentValues();
        contentValues.put("server_registration_status", Integer.valueOf(bcog.INVALID.f104618c));
        if (((bcav) bdaw).mo56671a(contactId, contentValues)) {
            bbxm.mo56490d(contactId);
        }
    }
}
