package p000;

import com.google.android.gms.romanesco.service.ContactsLoggerUploadService;

/* renamed from: apem */
public final /* synthetic */ class apem implements bmxj {

    /* renamed from: a */
    private final ContactsLoggerUploadService f84253a;

    public apem(ContactsLoggerUploadService contactsLoggerUploadService) {
        this.f84253a = contactsLoggerUploadService;
    }

    public final Object apply(Object obj) {
        return new apaj(this.f84253a.getApplicationContext(), (apal) obj);
    }
}
