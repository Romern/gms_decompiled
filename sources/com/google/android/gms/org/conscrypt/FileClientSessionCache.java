package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.p059io.IoUtils;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSession;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class FileClientSessionCache {
    public static final int MAX_SIZE = 12;
    static final Map caches = new HashMap();
    /* access modifiers changed from: private */
    public static final Logger logger = Logger.getLogger(FileClientSessionCache.class.getName());

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    class CacheFile extends File {
        long lastModified = -1;
        final String name;

        public CacheFile(File file, String str) {
            super(file, str);
            this.name = str;
        }

        public int compareTo(File file) {
            long lastModified2 = lastModified() - file.lastModified();
            if (lastModified2 != 0) {
                return lastModified2 < 0 ? -1 : 1;
            }
            return super.compareTo(file);
        }

        public long lastModified() {
            long j = this.lastModified;
            if (j != -1) {
                return j;
            }
            long lastModified2 = super.lastModified();
            this.lastModified = lastModified2;
            return lastModified2;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    class Impl implements SSLClientSessionCache {
        Map accessOrder = newAccessOrder();
        final File directory;
        String[] initialFiles;
        int size;

        public Impl(File file) {
            if (file.exists()) {
                if (file.isDirectory()) {
                    String[] list = file.list();
                    this.initialFiles = list;
                    if (list != null) {
                        Arrays.sort(list);
                        this.size = this.initialFiles.length;
                    } else {
                        String valueOf = String.valueOf(file);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
                        sb.append(valueOf);
                        sb.append(" exists but cannot list contents.");
                        throw new IOException(sb.toString());
                    }
                } else {
                    String valueOf2 = String.valueOf(file);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 31);
                    sb2.append(valueOf2);
                    sb2.append(" exists but is not a directory.");
                    throw new IOException(sb2.toString());
                }
            } else if (file.mkdirs()) {
                this.size = 0;
            } else {
                String valueOf3 = String.valueOf(file);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 30);
                sb3.append("Creation of ");
                sb3.append(valueOf3);
                sb3.append(" directory failed.");
                throw new IOException(sb3.toString());
            }
            this.directory = file;
        }

        /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
         method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
         arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.io.IOException]
         candidates:
          ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
          ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
          ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
          ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
        private void delete(File file) {
            if (!file.delete()) {
                String valueOf = String.valueOf(file);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
                sb.append("FileClientSessionCache: Failed to delete ");
                sb.append(valueOf);
                sb.append(".");
                IOException iOException = new IOException(sb.toString());
                FileClientSessionCache.logger.logp(Level.WARNING, "com.google.android.gms.org.conscrypt.FileClientSessionCache$Impl", "delete", iOException.getMessage(), (Throwable) iOException);
            }
            this.size--;
        }

        private static String fileName(String str, int i) {
            if (str != null) {
                StringBuilder sb = new StringBuilder(str.length() + 12);
                sb.append(str);
                sb.append(".");
                sb.append(i);
                return sb.toString();
            }
            throw new NullPointerException("host == null");
        }

        private void indexFiles() {
            String[] strArr = this.initialFiles;
            if (strArr != null) {
                this.initialFiles = null;
                TreeSet<CacheFile> treeSet = new TreeSet();
                for (String str : strArr) {
                    if (!this.accessOrder.containsKey(str)) {
                        treeSet.add(new CacheFile(this.directory, str));
                    }
                }
                if (!treeSet.isEmpty()) {
                    Map newAccessOrder = newAccessOrder();
                    for (CacheFile cacheFile : treeSet) {
                        newAccessOrder.put(cacheFile.name, cacheFile);
                    }
                    newAccessOrder.putAll(this.accessOrder);
                    this.accessOrder = newAccessOrder;
                }
            }
        }

        static void logReadError(String str, File file, Throwable th) {
            Logger access$000 = FileClientSessionCache.logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 62 + String.valueOf(valueOf).length());
            sb.append("FileClientSessionCache: Error reading session data for ");
            sb.append(str);
            sb.append(" from ");
            sb.append(valueOf);
            sb.append(".");
            access$000.logp(level, "com.google.android.gms.org.conscrypt.FileClientSessionCache$Impl", "logReadError", sb.toString(), th);
        }

        static void logWriteError(String str, File file, Throwable th) {
            Logger access$000 = FileClientSessionCache.logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 60 + String.valueOf(valueOf).length());
            sb.append("FileClientSessionCache: Error writing session data for ");
            sb.append(str);
            sb.append(" to ");
            sb.append(valueOf);
            sb.append(".");
            access$000.logp(level, "com.google.android.gms.org.conscrypt.FileClientSessionCache$Impl", "logWriteError", sb.toString(), th);
        }

        private void makeRoom() {
            if (this.size > 12) {
                indexFiles();
                int i = this.size - 12;
                Iterator it = this.accessOrder.values().iterator();
                do {
                    delete((File) it.next());
                    it.remove();
                    i--;
                } while (i > 0);
            }
        }

        private static Map newAccessOrder() {
            return new LinkedHashMap(12, 0.75f, true);
        }

        /* JADX INFO: finally extract failed */
        public synchronized byte[] getSessionData(String str, int i) {
            String fileName = fileName(str, i);
            File file = (File) this.accessOrder.get(fileName);
            if (file == null) {
                String[] strArr = this.initialFiles;
                if (strArr != null && Arrays.binarySearch(strArr, fileName) >= 0) {
                    file = new File(this.directory, fileName);
                    this.accessOrder.put(fileName, file);
                }
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[((int) file.length())];
                    new DataInputStream(fileInputStream).readFully(bArr);
                    IoUtils.closeQuietly(fileInputStream);
                    return bArr;
                } catch (IOException e) {
                    try {
                        logReadError(str, file, e);
                        IoUtils.closeQuietly(fileInputStream);
                        return null;
                    } catch (Throwable th) {
                        IoUtils.closeQuietly(fileInputStream);
                        throw th;
                    }
                }
            } catch (FileNotFoundException e2) {
                logReadError(str, file, e2);
                return null;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
            r5 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            delete(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0046, code lost:
            r5 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
            r3.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
            delete(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x0062, code lost:
            r5 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x0064, code lost:
            r6 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
            logWriteError(r0, r1, r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
            throw r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x006a, code lost:
            delete(r1);
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:20:0x003a, B:31:0x0049] */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:22:0x003d=Splitter:B:22:0x003d, B:43:0x005e=Splitter:B:43:0x005e} */
        public synchronized void putSessionData(SSLSession sSLSession, byte[] bArr) {
            String peerHost = sSLSession.getPeerHost();
            if (bArr != null) {
                String fileName = fileName(peerHost, sSLSession.getPeerPort());
                File file = new File(this.directory, fileName);
                boolean exists = file.exists();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    if (!exists) {
                        this.size++;
                        makeRoom();
                    }
                    try {
                        fileOutputStream.write(bArr);
                        try {
                            fileOutputStream.close();
                            this.accessOrder.put(fileName, file);
                        } catch (IOException e) {
                            logWriteError(peerHost, file, e);
                            delete(file);
                        }
                    } catch (IOException e2) {
                        logWriteError(peerHost, file, e2);
                        try {
                            fileOutputStream.close();
                        } catch (IOException e3) {
                            logWriteError(peerHost, file, e3);
                        } catch (Throwable th) {
                            th = th;
                            delete(file);
                            throw th;
                        }
                        delete(file);
                    }
                } catch (FileNotFoundException e4) {
                    logWriteError(peerHost, file, e4);
                }
            } else {
                throw new NullPointerException("sessionData == null");
            }
        }
    }

    private FileClientSessionCache() {
    }

    static synchronized void reset() {
        synchronized (FileClientSessionCache.class) {
            caches.clear();
        }
    }

    public static synchronized SSLClientSessionCache usingDirectory(File file) {
        Impl impl;
        synchronized (FileClientSessionCache.class) {
            impl = (Impl) caches.get(file);
            if (impl == null) {
                impl = new Impl(file);
                caches.put(file, impl);
            }
        }
        return impl;
    }
}
