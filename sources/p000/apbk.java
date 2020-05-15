package p000;

import com.google.android.gms.romanesco.contactsupload.triggers.ContactsLoggerIntentOperation;

/* renamed from: apbk */
public final /* synthetic */ class apbk implements bmxj {

    /* renamed from: a */
    private final bzep f84105a;

    public apbk(bzep bzep) {
        this.f84105a = bzep;
    }

    public final Object apply(Object obj) {
        String str;
        bzep bzep = this.f84105a;
        aoyh aoyh = ContactsLoggerIntentOperation.f107226a;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(bzep.f169702d);
        if (!((Boolean) obj).booleanValue()) {
            str = "disabled";
        } else {
            str = "scheduled";
        }
        objArr[1] = str;
        aoyh.mo46979a("SPE one-time sync %d %s", objArr);
        return null;
    }
}
