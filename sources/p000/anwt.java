package p000;

import android.content.pm.ApplicationInfo;
import android.os.Parcel;

/* renamed from: anwt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anwt {

    /* renamed from: a */
    public static final String[] f77841a = {"display_name", "icon_url", "application_id", "application_info", "is_aspen", "scopes", "revoke_handle", "revoke_message", "has_conn_read", "is_fitness"};

    /* renamed from: a */
    public static final byte[] m65476a(ApplicationInfo applicationInfo) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeParcelable(applicationInfo, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }
}
