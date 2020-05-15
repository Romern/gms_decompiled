package p000;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: xwf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xwf {

    /* renamed from: a */
    public final ReadWriteLock f53271a = new ReentrantReadWriteLock();

    /* renamed from: b */
    public final File f53272b;

    /* renamed from: c */
    public final Properties f53273c;

    /* renamed from: d */
    public boolean f53274d;

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b A[Catch:{ IOException -> 0x0074, all -> 0x0072 }] */
    public xwf(File file) {
        Throwable th;
        FileInputStream fileInputStream;
        sdo.m34959a(file);
        this.f53272b = file;
        this.f53273c = new Properties();
        boolean z = false;
        this.f53274d = false;
        sdo.m34970a((this.f53272b.isFile() || this.f53272b.createNewFile()) ? true : z);
        Lock writeLock = this.f53271a.writeLock();
        writeLock.lock();
        BufferedInputStream bufferedInputStream = null;
        try {
            fileInputStream = new FileInputStream(this.f53272b);
            try {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(fileInputStream);
                try {
                    this.f53273c.load(bufferedInputStream2);
                    try {
                        bufferedInputStream2.close();
                        writeLock.unlock();
                    } catch (IOException e) {
                        throw e;
                    } catch (Throwable th2) {
                        writeLock.unlock();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedInputStream = bufferedInputStream2;
                    if (bufferedInputStream != null) {
                    }
                    writeLock.unlock();
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                if (bufferedInputStream != null) {
                }
                writeLock.unlock();
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            fileInputStream = null;
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            } else if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e2) {
                    throw e2;
                } catch (Throwable th6) {
                    writeLock.unlock();
                    throw th6;
                }
            }
            writeLock.unlock();
            throw th;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    /* renamed from: a */
    public final String mo30181a(String str) {
        sdo.checkIfNull((Object) str, (Object) "Supplied key cannot be null!");
        Lock readLock = this.f53271a.readLock();
        readLock.lock();
        try {
            return this.f53273c.getProperty(str);
        } finally {
            readLock.unlock();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    /* renamed from: a */
    public final void mo30182a(String str, String str2, String str3) {
        sdo.checkIfNull((Object) str, (Object) "Supplied key cannot be null!");
        Lock writeLock = this.f53271a.writeLock();
        writeLock.lock();
        try {
            String property = this.f53273c.getProperty(str);
            if (property != null || str3 != null) {
                if (property != null) {
                    if (!property.equals(str3)) {
                    }
                }
            }
            if (str2 == null) {
                if (this.f53273c.remove(str) != null) {
                    this.f53274d = true;
                }
            } else if (!str2.equals(property)) {
                this.f53273c.setProperty(str, str2);
                this.f53274d = true;
            }
        } finally {
            writeLock.unlock();
        }
    }
}
