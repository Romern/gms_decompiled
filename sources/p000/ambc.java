package p000;

import android.content.res.Resources;
import android.provider.ContactsContract;

/* renamed from: ambc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ambc extends ambf {
    public ambc(Resources resources) {
        super(resources);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo41099a(Resources resources, int i) {
        return (String) ContactsContract.CommonDataKinds.Email.getTypeLabel(resources, i, null);
    }
}
