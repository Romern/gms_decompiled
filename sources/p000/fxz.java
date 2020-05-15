package p000;

import android.content.Context;
import android.net.Uri;
import android.provider.ContactsContract;
import java.util.HashMap;

/* renamed from: fxz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fxz {

    /* renamed from: d */
    public static final String[] f17571d = {"_id", "contact_id", "mimetype", "is_primary", "is_super_primary", "data1", "data2", "data3"};

    /* renamed from: f */
    public static final String[] f17572f = {"_id", "contact_id"};

    /* renamed from: a */
    public final Context f17573a;

    /* renamed from: b */
    public final HashMap f17574b;

    /* renamed from: c */
    final Uri f17575c = ContactsContract.Data.CONTENT_URI;

    /* renamed from: e */
    final Uri f17576e = ContactsContract.RawContacts.CONTENT_URI;

    public fxz(Context context, HashMap hashMap) {
        this.f17573a = context;
        this.f17574b = hashMap;
    }
}
