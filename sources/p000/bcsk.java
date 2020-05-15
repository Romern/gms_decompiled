package p000;

import com.google.android.libraries.messaging.lighter.model.AutoValue_ContactId;
import com.google.android.libraries.messaging.lighter.model.ContactId;

/* renamed from: bcsk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcsk {

    /* renamed from: a */
    private String f104804a;

    /* renamed from: b */
    private String f104805b;

    /* renamed from: c */
    private ContactId.ContactType f104806c;

    /* renamed from: d */
    private bmxv f104807d;

    public bcsk() {
    }

    /* renamed from: a */
    public final ContactId mo57450a() {
        String str = this.f104804a == null ? " id" : "";
        if (this.f104805b == null) {
            str = str.concat(" tachyonAppName");
        }
        if (this.f104806c == null) {
            str = String.valueOf(str).concat(" type");
        }
        if (str.isEmpty()) {
            return new AutoValue_ContactId(this.f104804a, this.f104805b, this.f104806c, this.f104807d);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo57453b(String str) {
        if (str != null) {
            this.f104804a = str;
            return;
        }
        throw new NullPointerException("Null id");
    }

    /* renamed from: c */
    public final void mo57454c(String str) {
        if (str != null) {
            this.f104805b = str;
            return;
        }
        throw new NullPointerException("Null tachyonAppName");
    }

    public bcsk(ContactId contactId) {
        this.f104807d = bmvz.f131120a;
        this.f104804a = contactId.mo60492a();
        this.f104805b = contactId.mo60493b();
        this.f104806c = contactId.mo60494c();
        this.f104807d = contactId.mo60495d();
    }

    /* renamed from: a */
    public final void mo57451a(ContactId.ContactType contactType) {
        if (contactType != null) {
            this.f104806c = contactType;
            return;
        }
        throw new NullPointerException("Null type");
    }

    public bcsk(byte[] bArr) {
        this.f104807d = bmvz.f131120a;
    }

    /* renamed from: a */
    public final void mo57452a(String str) {
        this.f104807d = bmxv.m108567c(str);
    }
}
