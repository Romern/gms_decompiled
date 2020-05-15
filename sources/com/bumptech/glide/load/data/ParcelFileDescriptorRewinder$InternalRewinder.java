package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.IOException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ParcelFileDescriptorRewinder$InternalRewinder {

    /* renamed from: a */
    private final ParcelFileDescriptor f7371a;

    public ParcelFileDescriptorRewinder$InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f7371a = parcelFileDescriptor;
    }

    public ParcelFileDescriptor rewind() {
        try {
            Os.lseek(this.f7371a.getFileDescriptor(), 0, OsConstants.SEEK_SET);
            return this.f7371a;
        } catch (ErrnoException e) {
            throw new IOException(e);
        }
    }
}
