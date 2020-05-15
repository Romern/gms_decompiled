package p000;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.io.Serializable;
import java.util.Set;

/* renamed from: bcol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bcol implements Serializable {
    /* renamed from: b */
    private final ContactId m89475b(String str) {
        bcsk f = ContactId.m94830f();
        f.mo57453b(str);
        f.mo57451a(ContactId.ContactType.EMAIL);
        f.mo57454c(mo57073d());
        return f.mo57450a();
    }

    /* renamed from: c */
    private final ContactId m89476c(String str) {
        bcsk f = ContactId.m94830f();
        f.mo57453b(str);
        f.mo57451a(ContactId.ContactType.DEVICE_ID);
        f.mo57454c(mo57073d());
        return f.mo57450a();
    }

    /* renamed from: g */
    public static bcok m89477g() {
        return new bcok(null);
    }

    /* renamed from: a */
    public abstract bmxv mo57069a();

    /* renamed from: a */
    public final ContactId mo57070a(String str) {
        bcsk f = ContactId.m94830f();
        f.mo57453b(str);
        f.mo57451a(ContactId.ContactType.PHONE_NUMBER);
        f.mo57454c(mo57073d());
        return f.mo57450a();
    }

    /* renamed from: b */
    public abstract Set mo57071b();

    /* renamed from: c */
    public abstract bmxv mo57072c();

    /* renamed from: d */
    public abstract String mo57073d();

    /* renamed from: e */
    public final ContactId mo57074e() {
        if (mo57069a().mo66813a()) {
            return m89475b((String) mo57069a().mo66814b());
        }
        if (mo57072c().mo66813a()) {
            return m89476c((String) mo57072c().mo66814b());
        }
        return mo57070a((String) mo57071b().iterator().next());
    }

    /* renamed from: f */
    public final bngx mo57075f() {
        bngs j = bngx.m109377j();
        if (mo57069a().mo66813a()) {
            j.mo67668c(m89475b((String) mo57069a().mo66814b()));
        }
        if (mo57072c().mo66813a()) {
            j.mo67668c(m89476c((String) mo57072c().mo66814b()));
        }
        j.mo67666b((Iterable) bnfi.m109235a(mo57071b()).mo67501a(new bcoi(this)));
        return j.mo67664a();
    }
}
