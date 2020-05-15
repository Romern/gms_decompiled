package p000;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@Deprecated
/* renamed from: iml */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iml {

    /* renamed from: a */
    public final ReadWriteLock f21359a = new ReentrantReadWriteLock();

    /* renamed from: b */
    public final Properties f21360b;

    /* renamed from: c */
    public boolean f21361c;

    /* renamed from: d */
    private final File f21362d;

    /* JADX WARNING: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0080 A[Catch:{ IOException -> 0x0089, all -> 0x0087 }] */
    public iml(File file) {
        Throwable th;
        FileInputStream fileInputStream;
        BufferedInputStream bufferedInputStream;
        sdo.m34959a(file);
        this.f21362d = file;
        this.f21360b = new Properties();
        this.f21361c = false;
        if (!this.f21362d.isFile()) {
            if (this.f21362d.exists()) {
                this.f21362d.delete();
            }
            this.f21362d.createNewFile();
            if (!this.f21362d.isFile()) {
                throw new IOException("Failed to create a new file");
            }
        }
        Lock writeLock = this.f21359a.writeLock();
        writeLock.lock();
        BufferedInputStream bufferedInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(this.f21362d);
            try {
                bufferedInputStream = new BufferedInputStream(fileInputStream);
            } catch (Throwable th2) {
                th = th2;
                if (bufferedInputStream2 != null) {
                    bufferedInputStream2.close();
                } else if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e) {
                        throw e;
                    } catch (Throwable th3) {
                        writeLock.unlock();
                        throw th3;
                    }
                }
                writeLock.unlock();
                throw th;
            }
            try {
                this.f21360b.load(bufferedInputStream);
                try {
                    bufferedInputStream.close();
                    writeLock.unlock();
                } catch (IOException e2) {
                    throw e2;
                } catch (Throwable th4) {
                    writeLock.unlock();
                    throw th4;
                }
            } catch (Throwable th5) {
                th = th5;
                bufferedInputStream2 = bufferedInputStream;
                if (bufferedInputStream2 != null) {
                }
                writeLock.unlock();
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            fileInputStream = null;
            if (bufferedInputStream2 != null) {
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
    public final String mo13139a(String str) {
        sdo.checkIfNull((Object) str, (Object) "Supplied key cannot be null!");
        Lock readLock = this.f21359a.readLock();
        readLock.lock();
        try {
            return this.f21360b.getProperty(str);
        } finally {
            readLock.unlock();
        }
    }

    /* renamed from: b */
    public final Set mo13142b() {
        Lock readLock = this.f21359a.readLock();
        readLock.lock();
        try {
            return this.f21360b.stringPropertyNames();
        } finally {
            readLock.unlock();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0043 A[Catch:{ IOException -> 0x004c, all -> 0x004a }] */
    /* renamed from: a */
    public final void mo13140a() {
        Throwable th;
        FileOutputStream fileOutputStream;
        BufferedOutputStream bufferedOutputStream;
        Lock writeLock = this.f21359a.writeLock();
        writeLock.lock();
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            if (this.f21361c) {
                fileOutputStream = new FileOutputStream(this.f21362d);
                try {
                    bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedOutputStream2 != null) {
                    }
                    writeLock.unlock();
                    throw th;
                }
                try {
                    this.f21360b.store(bufferedOutputStream, (String) null);
                    this.f21361c = false;
                    try {
                        bufferedOutputStream.close();
                    } catch (IOException e) {
                        throw e;
                    } catch (Throwable th3) {
                        writeLock.unlock();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    bufferedOutputStream2 = bufferedOutputStream;
                    if (bufferedOutputStream2 != null) {
                        bufferedOutputStream2.close();
                    } else if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e2) {
                            throw e2;
                        } catch (Throwable th5) {
                            writeLock.unlock();
                            throw th5;
                        }
                    }
                    writeLock.unlock();
                    throw th;
                }
            }
            writeLock.unlock();
        } catch (Throwable th6) {
            th = th6;
            fileOutputStream = null;
            if (bufferedOutputStream2 != null) {
            }
            writeLock.unlock();
            throw th;
        }
    }

    /* renamed from: b */
    public final void mo13143b(String str) {
        Lock writeLock = this.f21359a.writeLock();
        writeLock.lock();
        try {
            this.f21360b.remove(str);
            this.f21361c = true;
        } finally {
            writeLock.unlock();
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
    public final boolean mo13141a(String str, String str2, String str3) {
        sdo.checkIfNull((Object) str, (Object) "Supplied key cannot be null!");
        Lock writeLock = this.f21359a.writeLock();
        writeLock.lock();
        try {
            String property = this.f21360b.getProperty(str);
            if (property != null || str3 != null) {
                if (property != null) {
                    if (!property.equals(str3)) {
                    }
                }
                writeLock.unlock();
                return false;
            }
            if (str2 == null) {
                if (this.f21360b.remove(str) != null) {
                    this.f21361c = true;
                }
            } else if (!str2.equals(property)) {
                this.f21360b.setProperty(str, str2);
                this.f21361c = true;
            }
            return true;
        } finally {
            writeLock.unlock();
        }
    }
}
