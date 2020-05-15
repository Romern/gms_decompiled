package org.chromium.net;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.nio.ByteBuffer;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class UploadDataProviders {
    private UploadDataProviders() {
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new cird(new cira(parcelFileDescriptor));
    }

    public static UploadDataProvider create(File file) {
        return new cird(new ciqz(file));
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new cirb(byteBuffer.slice());
    }

    public static UploadDataProvider create(byte[] bArr) {
        return create(bArr, 0, bArr.length);
    }

    public static UploadDataProvider create(byte[] bArr, int i, int i2) {
        return new cirb(ByteBuffer.wrap(bArr, i, i2).slice());
    }
}
