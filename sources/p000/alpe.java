package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.gms.people.internal.ParcelableLoadImageOptions;
import com.google.android.gms.people.model.AvatarReference;

/* renamed from: alpe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alpe {
    /* renamed from: a */
    public static alot m61454a(Context context, String str, int i, almp almp, String str2, long j, ParcelableLoadImageOptions parcelableLoadImageOptions) {
        alot b = m61459b(context, str, i, almp, str2, parcelableLoadImageOptions);
        return b == null ? new alpd(str, i, almp, j, !parcelableLoadImageOptions.f81930c) : b;
    }

    /* renamed from: b */
    static alot m61459b(Context context, String str, int i, almp almp, String str2, ParcelableLoadImageOptions parcelableLoadImageOptions) {
        int i2;
        if (altn.m61774a(context).mo40738a(str2, null) == -1) {
            return null;
        }
        if (parcelableLoadImageOptions.f81930c) {
            i2 = parcelableLoadImageOptions.f81928a;
        } else {
            i2 = 4;
        }
        return new alpf(str, i, almp, str2, null, i2, 1);
    }

    /* renamed from: a */
    public static alot m61455a(Context context, String str, int i, almp almp, String str2, ParcelableLoadImageOptions parcelableLoadImageOptions) {
        alon alon;
        amig.m62939a();
        if (((Boolean) amhs.f74921a.mo41191a()).booleanValue()) {
            alon = alon.m61426a(context);
        } else {
            alon = null;
        }
        return new alpc(context, str, i, alon, almp, str2, parcelableLoadImageOptions.f81928a, parcelableLoadImageOptions.f81929b);
    }

    /* renamed from: b */
    public static alot m61460b(Context context, String str, int i, almp almp, String str2, AvatarReference avatarReference, ParcelableLoadImageOptions parcelableLoadImageOptions) {
        alot b = m61459b(context, str, i, almp, str2, parcelableLoadImageOptions);
        if (b != null) {
            return b;
        }
        return new alpa(str, i, (ConnectivityManager) context.getSystemService("connectivity"), alon.m61426a(context), almp, avatarReference, parcelableLoadImageOptions);
    }

    /* renamed from: a */
    public static alot m61456a(Context context, String str, int i, almp almp, String str2, AvatarReference avatarReference, ParcelableLoadImageOptions parcelableLoadImageOptions) {
        alot b = m61459b(context, str, i, almp, str2, parcelableLoadImageOptions);
        return b == null ? new aloz(str, i, almp, avatarReference, parcelableLoadImageOptions) : b;
    }

    /* renamed from: a */
    public static alot m61457a(String str, int i, almp almp, long j, ParcelableLoadImageOptions parcelableLoadImageOptions) {
        return new alph(str, i, almp, j, !parcelableLoadImageOptions.f81930c);
    }

    /* renamed from: a */
    public static alot m61458a(String str, int i, almp almp, String str2, ParcelableLoadImageOptions parcelableLoadImageOptions) {
        boolean z;
        if ((parcelableLoadImageOptions.f81929b & 1) == 0) {
            z = false;
        } else {
            z = true;
        }
        return new alop(str, i, str2, almp, z, "BaseLoadRemoteImage");
    }
}
