package com.google.android.gms.drive.query.internal;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.query.Filter;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class AbstractFilter extends AbstractSafeParcelable implements Filter {
    public final String toString() {
        return String.format("Filter[%s]", mo18284a(new vgh()));
    }
}
