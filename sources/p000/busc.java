package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import com.google.location.nearby.common.fastpair.DiscoveryListItem;
import java.util.List;

/* renamed from: busc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class busc extends dck implements busd {

    /* renamed from: a */
    public Context f154807a;

    /* renamed from: b */
    public bure f154808b;

    /* renamed from: c */
    private final Handler f154809c;

    public busc() {
        super("com.google.location.nearby.common.fastpair.IDiscoveryServiceCallback");
    }

    /* renamed from: a */
    public final void mo73079a(int i, List list) {
        this.f154809c.post(new buri(this, list));
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo73079a(parcel.readInt(), parcel.createTypedArrayList(DiscoveryListItem.CREATOR));
        return true;
    }

    public busc(Context context, bure bure) {
        super("com.google.location.nearby.common.fastpair.IDiscoveryServiceCallback");
        this.f154807a = context;
        this.f154809c = new Handler(Looper.getMainLooper());
        this.f154808b = bure;
    }
}
