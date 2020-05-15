package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.contextmanager.ContextData;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WriteBatchImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new tne();

    /* renamed from: a */
    public ArrayList f30703a;

    public WriteBatchImpl() {
    }

    /* renamed from: a */
    public final void mo18101a(ContextData contextData) {
        sdo.m34959a(contextData);
        if (this.f30703a == null) {
            this.f30703a = new ArrayList();
        }
        this.f30703a.add(contextData);
    }

    public WriteBatchImpl(ArrayList arrayList) {
        this.f30703a = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 3, this.f30703a, false);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final boolean mo18102a() {
        ArrayList arrayList = this.f30703a;
        return arrayList != null && !arrayList.isEmpty();
    }
}
