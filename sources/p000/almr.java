package p000;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import java.util.Locale;

/* renamed from: almr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class almr {

    /* renamed from: a */
    public static Bundle f73787a;

    /* renamed from: b */
    public static Bundle f73788b;

    /* renamed from: c */
    private static Locale f73789c;

    /* renamed from: a */
    public static void m61306a(Context context) {
        Locale locale = Locale.getDefault();
        if (!locale.equals(f73789c)) {
            Bundle bundle = new Bundle();
            Resources resources = context.getResources();
            m61307a(bundle, 1, ContactsContract.CommonDataKinds.Email.getTypeLabel(resources, 1, null));
            m61307a(bundle, 2, ContactsContract.CommonDataKinds.Email.getTypeLabel(resources, 2, null));
            f73787a = bundle;
            Bundle bundle2 = new Bundle();
            Resources resources2 = context.getResources();
            m61307a(bundle2, 1, ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources2, 1, null));
            m61307a(bundle2, 2, ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources2, 3, null));
            m61307a(bundle2, 3, ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources2, 2, null));
            m61307a(bundle2, 4, ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources2, 5, null));
            m61307a(bundle2, 5, ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources2, 4, null));
            m61307a(bundle2, 6, ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources2, 13, null));
            m61307a(bundle2, 7, ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources2, 6, null));
            m61307a(bundle2, 8, ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources2, 10, null));
            m61307a(bundle2, 9, ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources2, 19, null));
            m61307a(bundle2, 10, ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources2, 9, null));
            m61307a(bundle2, 11, ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources2, 14, null));
            m61307a(bundle2, 12, ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources2, 11, null));
            m61307a(bundle2, 13, ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources2, 8, null));
            m61307a(bundle2, 14, ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources2, 15, null));
            m61307a(bundle2, 15, ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources2, 16, null));
            m61307a(bundle2, 16, ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources2, 17, null));
            m61307a(bundle2, 17, ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources2, 18, null));
            m61307a(bundle2, 18, ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources2, 12, null));
            m61307a(bundle2, 19, resources2.getString(C0126R.string.people_google_voice_phone_label));
            f73788b = bundle2;
            f73789c = locale;
        }
    }

    /* renamed from: a */
    private static void m61307a(Bundle bundle, int i, CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            bundle.putString(String.valueOf(i), charSequence.toString());
        }
    }
}
