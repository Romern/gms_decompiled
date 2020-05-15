package com.google.android.gms.nearby.sharing;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class Attachment extends AbstractSafeParcelable {
    /* renamed from: a */
    public abstract long mo44383a();

    /* renamed from: b */
    public abstract int mo44384b();

    /* renamed from: c */
    public final boolean mo44385c() {
        return mo44388f() == 2;
    }

    /* renamed from: d */
    public final boolean mo44386d() {
        return mo44388f() == 3;
    }

    /* renamed from: e */
    public final boolean mo44387e() {
        return mo44388f() == 4;
    }

    /* renamed from: f */
    public abstract int mo44388f();
}
