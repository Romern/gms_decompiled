package com.felicanetworks.mfc;

import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class Data implements Parcelable {
    private static final int BYTES_LENGTH = 16;
    private static final String EXC_LENGTH = "The length must be 16.";
    private static final String EXC_NULL = "null is not allowed.";

    /* access modifiers changed from: package-private */
    public final void checkBytes(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException(EXC_NULL);
        } else if (bArr.length != 16) {
            throw new IllegalArgumentException(EXC_LENGTH);
        }
    }

    public abstract void checkFormat();

    /* access modifiers changed from: protected */
    public int getBytesLength() {
        return 16;
    }

    public abstract int getType();
}
