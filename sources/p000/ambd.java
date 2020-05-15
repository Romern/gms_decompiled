package p000;

import android.content.res.Resources;
import android.provider.ContactsContract;

/* renamed from: ambd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ambd extends ambf {
    public ambd(Resources resources) {
        super(resources);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo41099a(Resources resources, int i) {
        return (String) ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources, i, null);
    }
}
