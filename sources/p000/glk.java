package p000;

import android.content.Context;
import android.os.Build;
import android.service.persistentdata.PersistentDataBlockManager;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* renamed from: glk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class glk implements glj {

    /* renamed from: a */
    private static final Logger f18470a = ght.m13171a("DataBlockManagerHelper");

    /* renamed from: b */
    private static WeakReference f18471b = new WeakReference(null);

    /* renamed from: c */
    private final PersistentDataBlockManager f18472c;

    /* renamed from: d */
    private final Object f18473d = new Object();

    public glk(PersistentDataBlockManager persistentDataBlockManager) {
        this.f18472c = persistentDataBlockManager;
    }

    /* renamed from: a */
    public static synchronized glj m13386a(Context context) {
        glj glj;
        synchronized (glk.class) {
            glj = (glj) f18471b.get();
            cbyu.m128929c();
            if (glj == null) {
                int i = Build.VERSION.SDK_INT;
                glj = new glk((PersistentDataBlockManager) context.getApplicationContext().getSystemService("persistent_data_block"));
                f18471b = new WeakReference(glj);
            }
        }
        return glj;
    }

    /* renamed from: a */
    public final boolean mo12017a() {
        return this.f18472c != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        return null;
     */
    /* renamed from: b */
    public final imc mo12018b() {
        if (!mo12017a()) {
            return null;
        }
        try {
            synchronized (this.f18473d) {
                byte[] read = this.f18472c.read();
                if (read != null && read.length != 0) {
                    imc imc = (imc) GeneratedMessageLite.m124016a(imc.f21341d, read, bxus.m123744c());
                    return imc;
                }
            }
        } catch (Exception e) {
            f18470a.mo25417e("Failed to read data from DataBlockManager.", e, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public final long mo12016a(imc imc) {
        byte[] bArr;
        if (mo12017a()) {
            if (imc == null) {
                f18470a.mo25416d("Supplied DataBlockContainer is null. Proceeding to erase stored data.", new Object[0]);
                bArr = new byte[0];
            } else {
                bArr = imc.serializeToBytes();
            }
            synchronized (this.f18473d) {
                try {
                    long maximumDataBlockSize = this.f18472c.getMaximumDataBlockSize();
                    if (maximumDataBlockSize == -1) {
                        throw new IOException("Error when getting data block maximum capacity.");
                    } else if (((long) bArr.length) > maximumDataBlockSize) {
                        return -1;
                    } else {
                        long write = (long) this.f18472c.write(bArr);
                        if (write != -1) {
                            long j = maximumDataBlockSize - write;
                            return j;
                        }
                        throw new IOException("Error when writing to data block.");
                    }
                } catch (Exception e) {
                    throw new IOException("Unable to write data to DataBlockManager.", e);
                }
            }
        } else {
            throw new IOException("DataBlockManager is not supported on current device.");
        }
    }
}
