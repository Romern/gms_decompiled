package com.google.android.gms.walletp2p.feature.rpcclient.types;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FundsTransferNotices implements Parcelable {
    public static final Parcelable.Creator CREATOR = new axij();

    /* renamed from: a */
    private final Map f110682a;

    public FundsTransferNotices(List list) {
        this.f110682a = new HashMap(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bttj bttj = (bttj) it.next();
            Map map = this.f110682a;
            btti a = btti.m117120a(bttj.f150353a);
            if (a == null) {
                a = btti.UNKNOWN_FUNDS_TRANSFER_NOTICE_TYPE;
            }
            map.put(a, bttj);
        }
    }

    /* renamed from: a */
    public final boolean mo60178a(btti btti) {
        return this.f110682a.containsKey(btti);
    }

    /* renamed from: b */
    public final String mo60179b(btti btti) {
        return ((bttj) this.f110682a.get(btti)).f150354b;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f110682a.values().size());
        for (bttj bttj : this.f110682a.values()) {
            parcel.writeByteArray(bttj.mo73642k());
        }
    }
}
