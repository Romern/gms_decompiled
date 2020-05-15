package p000;

import android.content.pm.ApplicationInfo;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: anwv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anwv extends rtr implements anxl {
    public anwv(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    /* renamed from: a */
    public final String mo42351a() {
        return mo25151d("display_name");
    }

    /* renamed from: b */
    public final String mo42352b() {
        return mo25151d("icon_url");
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        throw new UnsupportedOperationException("Please use ApplicationEntity.from(application)");
    }

    /* renamed from: c */
    public final String mo42353c() {
        return mo25151d("application_id");
    }

    /* renamed from: d */
    public final ApplicationInfo mo42354d() {
        byte[] e = mo25152e("application_info");
        if (e == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(e, 0, e.length);
            obtain.setDataPosition(0);
            return (ApplicationInfo) obtain.readParcelable(ApplicationInfo.class.getClassLoader());
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: f */
    public final boolean mo42355f() {
        return mo25150c("is_aspen");
    }

    /* renamed from: g */
    public final boolean mo42356g() {
        return mo25150c("is_fitness");
    }

    /* renamed from: h */
    public final String mo42357h() {
        return mo25151d("scopes");
    }

    /* renamed from: i */
    public final String mo42358i() {
        return mo25151d("revoke_handle");
    }

    /* renamed from: j */
    public final String mo42359j() {
        return mo25151d("revoke_message");
    }

    /* renamed from: k */
    public final boolean mo42360k() {
        return mo25150c("has_conn_read");
    }
}
