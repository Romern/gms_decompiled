package p000;

import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.WriteBatch;

/* renamed from: adyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adyb extends LevelDb {
    public adyb() {
        super(-1, "");
    }

    /* access modifiers changed from: protected */
    public final void closeNativeObject() {
    }

    public final void delete(byte[] bArr) {
    }

    public final int deleteRange(byte[] bArr, byte[] bArr2) {
        return 0;
    }

    public final byte[] get(LevelDb.Snapshot snapshot, byte[] bArr) {
        return null;
    }

    public final byte[] get(byte[] bArr) {
        return null;
    }

    public final LevelDb.Snapshot getSnapshot() {
        return new adya(this);
    }

    public final LevelDb.Iterator iterator() {
        return new adxz(this);
    }

    public final void put(byte[] bArr, byte[] bArr2) {
    }

    public final void write(WriteBatch writeBatch) {
    }

    public final LevelDb.Iterator iterator(LevelDb.Snapshot snapshot) {
        return new adxz(this);
    }
}
