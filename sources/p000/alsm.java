package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: alsm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alsm extends sbm {
    public alsm(Context context, Looper looper, sat sat, rlz rlz, rof rof) {
        super(context, looper, 208, sat, rlz, rof);
    }

    /* renamed from: I */
    public final Feature[] mo6461I() {
        return new Feature[]{alks.f73599b, alks.f73600c, alks.f73601d, alks.f73603f};
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.people.contactssync.internal.IContactsSyncService");
        if (queryLocalInterface instanceof alsp) {
            return (alsp) queryLocalInterface;
        }
        return new alsn(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.people.contactssync.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.people.contactssync.internal.IContactsSyncService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 17108000;
    }
}
