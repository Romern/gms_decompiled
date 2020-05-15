package com.google.android.gms.leveldb;

import com.google.android.gms.leveldb.constants.LevelDbTableSharedObjectName;
import com.google.android.gms.leveldb.environment.LevelDbPlatform;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class LevelDbTable extends NativeObject {
    static {
        LevelDbPlatform.loadLibrary(LevelDbTableSharedObjectName.get());
    }

    private LevelDbTable(long j) {
        super(j);
    }

    private static native void nativeClose(long j);

    private static native byte[] nativeGet(long j, byte[] bArr);

    private static native long nativeOpen(String str);

    public static LevelDbTable open(String str) {
        if (str != null) {
            return new LevelDbTable(nativeOpen(str));
        }
        throw new NullPointerException("Parameter \"tablePath\" was not set.");
    }

    public void closeNativeObject() {
        nativeClose(this.mPtr);
    }

    public byte[] get(byte[] bArr) {
        assertOpen();
        return nativeGet(this.mPtr, bArr);
    }
}
