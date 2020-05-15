package p000;

import android.content.Context;
import com.google.android.gms.romanesco.service.ContactsLoggerUploadService;

/* renamed from: apen */
public final /* synthetic */ class apen implements bmxz {

    /* renamed from: a */
    private final ContactsLoggerUploadService f84254a;

    public apen(ContactsLoggerUploadService contactsLoggerUploadService) {
        this.f84254a = contactsLoggerUploadService;
    }

    /* renamed from: a */
    public final boolean mo6527a(Object obj) {
        Context applicationContext = this.f84254a.getApplicationContext();
        return apam.m69967a(applicationContext, new apbf(applicationContext), new lsp(applicationContext), (apal) obj);
    }
}
