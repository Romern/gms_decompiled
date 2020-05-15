package p000;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: ien */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ien {

    /* renamed from: a */
    public static final Logger f20807a = new Logger("GLSUser", "DeviceKeyStore");

    /* renamed from: e */
    private static WeakReference f20808e = new WeakReference(null);

    /* renamed from: b */
    public final ReadWriteLock f20809b = new ReentrantReadWriteLock();

    /* renamed from: c */
    public final Context f20810c;

    /* renamed from: d */
    public bzxb f20811d;

    private ien(Context context) {
        sdo.m34959a(context);
        this.f20810c = context;
    }

    /* renamed from: a */
    public static synchronized ien m15332a(Context context) {
        ien ien;
        synchronized (ien.class) {
            ien = (ien) f20808e.get();
            if (ien == null) {
                ien = new ien(context.getApplicationContext());
                f20808e = new WeakReference(ien);
            }
        }
        return ien;
    }

    /* renamed from: a */
    public final bzxb getDeviceKeyFromFile() {
        FileInputStream openFileInput;
        Lock readLock = this.f20809b.readLock();
        readLock.lock();
        try {
            if (this.f20811d == null) {
                try {
                    Lock writeLock = this.f20809b.writeLock();
                    writeLock.lock();
                    try {
                        if (this.f20811d == null) {
                            openFileInput = this.f20810c.openFileInput("device_key");
                            int size = (int) openFileInput.getChannel().size();
                            Logger logger = f20807a;
                            StringBuilder sb = new StringBuilder(45);
                            sb.append("Retrieving device key, file size: ");
                            sb.append(size);
                            logger.logVerbose(sb.toString(), new Object[0]);
                            bxvd da = bzxb.f171716f.mo74144da();
                            da.mo73634b(openFileInput);
                            this.f20811d = (bzxb) da.mo74062i();
                            openFileInput.close();
                        }
                        writeLock.unlock();
                    } catch (FileNotFoundException e) {
                        throw new IOException("Device key file not found.", e);
                    } catch (IOException e2) {
                        throw new IOException("Failed to read size of key file. ", e2);
                    } catch (Throwable th) {
                        writeLock.unlock();
                        throw th;
                    }
                } catch (IOException e3) {
                    Logger logger2 = f20807a;
                    String valueOf = String.valueOf(e3.getMessage());
                    logger2.mo25416d(valueOf.length() == 0 ? new String("Cannot load key: ") : "Cannot load key: ".concat(valueOf), new Object[0]);
                }
            }
            Lock readLock2 = this.f20809b.readLock();
            readLock2.lock();
            try {
                return this.f20811d;
            } finally {
                readLock2.unlock();
            }
        } finally {
            readLock.unlock();
        }
    }
}
