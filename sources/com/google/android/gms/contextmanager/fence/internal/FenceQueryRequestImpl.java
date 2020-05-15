package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.fence.FenceQueryRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FenceQueryRequestImpl extends FenceQueryRequest {
    public static final Parcelable.Creator CREATOR = new tkm();

    /* renamed from: a */
    public final QueryFenceOperation f30650a;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class QueryFenceOperation extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new tle();

        /* renamed from: a */
        public final int f30651a;

        /* renamed from: b */
        public final List f30652b;

        public QueryFenceOperation(int i, List list) {
            this.f30651a = i;
            this.f30652b = list;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = see.m35030a(parcel);
            see.m35063b(parcel, 2, this.f30651a);
            see.m35065b(parcel, 3, this.f30652b, false);
            see.m35062b(parcel, a);
        }
    }

    public FenceQueryRequestImpl() {
        this(new QueryFenceOperation(1, null));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f30650a, i, false);
        see.m35062b(parcel, a);
    }

    public FenceQueryRequestImpl(QueryFenceOperation queryFenceOperation) {
        this.f30650a = queryFenceOperation;
    }
}
