package com.android.volley.toolbox;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.volley.Cache;
import com.android.volley.Header;
import com.android.volley.VolleyLog;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DiskBasedCache implements Cache {

    /* renamed from: a */
    private final Map f7321a;

    /* renamed from: b */
    private long f7322b;

    /* renamed from: c */
    private final FileSupplier f7323c;

    /* renamed from: d */
    private final int f7324d;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface FileSupplier {
        File get();
    }

    public DiskBasedCache(FileSupplier fileSupplier) {
        this(fileSupplier, 5242880);
    }

    /* renamed from: a */
    public static int m4770a(InputStream inputStream) {
        return (m4781c(inputStream) << 24) | m4781c(inputStream) | (m4781c(inputStream) << 8) | (m4781c(inputStream) << 16);
    }

    /* renamed from: b */
    public static long m4779b(InputStream inputStream) {
        return (((long) m4781c(inputStream)) & 255) | ((((long) m4781c(inputStream)) & 255) << 8) | ((((long) m4781c(inputStream)) & 255) << 16) | ((((long) m4781c(inputStream)) & 255) << 24) | ((((long) m4781c(inputStream)) & 255) << 32) | ((((long) m4781c(inputStream)) & 255) << 40) | ((((long) m4781c(inputStream)) & 255) << 48) | ((255 & ((long) m4781c(inputStream))) << 56);
    }

    /* renamed from: c */
    private static int m4781c(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    public synchronized void clear() {
        File[] listFiles = this.f7323c.get().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                file.delete();
            }
        }
        this.f7321a.clear();
        this.f7322b = 0;
        VolleyLog.m4764d("Cache cleared.", new Object[0]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        return null;
     */
    public synchronized Cache.Entry get(String str) {
        bny bny;
        bnx bnx = (bnx) this.f7321a.get(str);
        if (bnx != null) {
            File fileForKey = getFileForKey(str);
            try {
                bny = new bny(new BufferedInputStream(m4771a(fileForKey)), fileForKey.length());
                bnx a = bnx.m3396a(bny);
                if (!TextUtils.equals(str, a.f5213b)) {
                    VolleyLog.m4764d("%s: key=%s, found=%s", fileForKey.getAbsolutePath(), str, a.f5213b);
                    m4776a(str);
                    bny.close();
                } else {
                    byte[] a2 = m4778a(bny, bny.mo3313a());
                    Cache.Entry entry = new Cache.Entry();
                    entry.data = a2;
                    entry.etag = bnx.f5214c;
                    entry.serverDate = bnx.f5215d;
                    entry.lastModified = bnx.f5216e;
                    entry.ttl = bnx.f5217f;
                    entry.softTtl = bnx.f5218g;
                    List<Header> list = bnx.f5219h;
                    TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                    for (Header header : list) {
                        treeMap.put(header.getName(), header.getValue());
                    }
                    entry.responseHeaders = treeMap;
                    entry.allResponseHeaders = Collections.unmodifiableList(bnx.f5219h);
                    bny.close();
                    return entry;
                }
            } catch (IOException e) {
                VolleyLog.m4764d("%s: %s", fileForKey.getAbsolutePath(), e.toString());
                remove(str);
                return null;
            } catch (Throwable th) {
                bny.close();
                throw th;
            }
        }
    }

    public File getFileForKey(String str) {
        return new File(this.f7323c.get(), m4780b(str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        return;
     */
    public synchronized void initialize() {
        bny bny;
        File file = this.f7323c.get();
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    try {
                        long length = file2.length();
                        bny = new bny(new BufferedInputStream(m4771a(file2)), length);
                        bnx a = bnx.m3396a(bny);
                        a.f5212a = length;
                        m4777a(a.f5213b, a);
                        bny.close();
                    } catch (IOException e) {
                        file2.delete();
                    } catch (Throwable th) {
                        bny.close();
                        throw th;
                    }
                }
            }
        } else if (!file.mkdirs()) {
            VolleyLog.m4765e("Unable to create cache dir %s", file.getAbsolutePath());
        }
    }

    public synchronized void invalidate(String str, boolean z) {
        Cache.Entry entry = get(str);
        if (entry != null) {
            entry.softTtl = 0;
            if (z) {
                entry.ttl = 0;
            }
            put(str, entry);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.android.volley.toolbox.DiskBasedCache.a(java.io.OutputStream, int):void
     arg types: [java.io.BufferedOutputStream, int]
     candidates:
      com.android.volley.toolbox.DiskBasedCache.a(java.io.OutputStream, long):void
      com.android.volley.toolbox.DiskBasedCache.a(java.io.OutputStream, java.lang.String):void
      com.android.volley.toolbox.DiskBasedCache.a(java.lang.String, bnx):void
      com.android.volley.toolbox.DiskBasedCache.a(bny, long):byte[]
      com.android.volley.toolbox.DiskBasedCache.a(java.io.OutputStream, int):void */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x019b, code lost:
        return;
     */
    public synchronized void put(String str, Cache.Entry entry) {
        BufferedOutputStream bufferedOutputStream;
        ArrayList arrayList;
        long j;
        Cache.Entry entry2 = entry;
        synchronized (this) {
            long j2 = this.f7322b;
            int length = entry2.data.length;
            int i = this.f7324d;
            if (j2 + ((long) length) <= ((long) i) || ((float) length) <= ((float) i) * 0.9f) {
                File fileForKey = getFileForKey(str);
                try {
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileForKey));
                    String str2 = entry2.etag;
                    long j3 = entry2.serverDate;
                    long j4 = entry2.lastModified;
                    long j5 = entry2.ttl;
                    long j6 = entry2.softTtl;
                    List list = entry2.allResponseHeaders;
                    if (list == null) {
                        Map map = entry2.responseHeaders;
                        j = j5;
                        ArrayList arrayList2 = new ArrayList(map.size());
                        for (Iterator it = map.entrySet().iterator(); it.hasNext(); it = it) {
                            Map.Entry entry3 = (Map.Entry) it.next();
                            arrayList2.add(new Header((String) entry3.getKey(), (String) entry3.getValue()));
                        }
                        arrayList = arrayList2;
                    } else {
                        j = j5;
                        arrayList = list;
                    }
                    bnx bnx = new bnx(str, str2, j3, j4, j, j6, arrayList);
                    m4773a((OutputStream) bufferedOutputStream, 538247942);
                    m4775a(bufferedOutputStream, bnx.f5213b);
                    String str3 = bnx.f5214c;
                    if (str3 == null) {
                        str3 = "";
                    }
                    m4775a(bufferedOutputStream, str3);
                    m4774a(bufferedOutputStream, bnx.f5215d);
                    m4774a(bufferedOutputStream, bnx.f5216e);
                    m4774a(bufferedOutputStream, bnx.f5217f);
                    m4774a(bufferedOutputStream, bnx.f5218g);
                    List<Header> list2 = bnx.f5219h;
                    if (list2 != null) {
                        m4773a((OutputStream) bufferedOutputStream, list2.size());
                        for (Header header : list2) {
                            m4775a(bufferedOutputStream, header.getName());
                            m4775a(bufferedOutputStream, header.getValue());
                        }
                    } else {
                        m4773a((OutputStream) bufferedOutputStream, 0);
                    }
                    bufferedOutputStream.flush();
                    bufferedOutputStream.write(entry2.data);
                    bufferedOutputStream.close();
                    bnx.f5212a = fileForKey.length();
                    m4777a(str, bnx);
                    if (this.f7322b >= ((long) this.f7324d)) {
                        if (VolleyLog.DEBUG) {
                            VolleyLog.m4767v("Pruning old cache entries.", new Object[0]);
                        }
                        long j7 = this.f7322b;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        Iterator it2 = this.f7321a.entrySet().iterator();
                        int i2 = 0;
                        while (it2.hasNext()) {
                            bnx bnx2 = (bnx) ((Map.Entry) it2.next()).getValue();
                            if (!getFileForKey(bnx2.f5213b).delete()) {
                                String str4 = bnx2.f5213b;
                                VolleyLog.m4764d("Could not delete cache entry for key=%s, filename=%s", str4, m4780b(str4));
                            } else {
                                this.f7322b -= bnx2.f5212a;
                            }
                            it2.remove();
                            i2++;
                            if (((float) this.f7322b) < ((float) this.f7324d) * 0.9f) {
                                break;
                            }
                        }
                        if (VolleyLog.DEBUG) {
                            VolleyLog.m4767v("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.f7322b - j7), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                        }
                    }
                } catch (IOException e) {
                    VolleyLog.m4764d("%s", e.toString());
                    bufferedOutputStream.close();
                    VolleyLog.m4764d("Failed to write header for %s", fileForKey.getAbsolutePath());
                    throw new IOException();
                } catch (IOException e2) {
                    if (!fileForKey.delete()) {
                        VolleyLog.m4764d("Could not clean up file %s", fileForKey.getAbsolutePath());
                    }
                }
            }
        }
    }

    public synchronized void remove(String str) {
        boolean delete = getFileForKey(str).delete();
        m4776a(str);
        if (!delete) {
            VolleyLog.m4764d("Could not delete cache entry for key=%s, filename=%s", str, m4780b(str));
        }
    }

    public DiskBasedCache(FileSupplier fileSupplier, int i) {
        this.f7321a = new LinkedHashMap(16, 0.75f, true);
        this.f7322b = 0;
        this.f7323c = fileSupplier;
        this.f7324d = i;
    }

    /* renamed from: a */
    static final InputStream m4771a(File file) {
        return new FileInputStream(file);
    }

    /* renamed from: b */
    private static final String m4780b(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        String valueOf2 = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    /* renamed from: a */
    public static String m4772a(bny bny) {
        return new String(m4778a(bny, m4779b(bny)), "UTF-8");
    }

    public DiskBasedCache(File file) {
        this(file, 5242880);
    }

    /* renamed from: a */
    static void m4773a(OutputStream outputStream, int i) {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    public DiskBasedCache(File file, int i) {
        this.f7321a = new LinkedHashMap(16, 0.75f, true);
        this.f7322b = 0;
        this.f7323c = new bnw(file);
        this.f7324d = i;
    }

    /* renamed from: a */
    static void m4774a(OutputStream outputStream, long j) {
        outputStream.write((byte) ((int) j));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    /* renamed from: a */
    static void m4775a(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        m4774a(outputStream, (long) length);
        outputStream.write(bytes, 0, length);
    }

    /* renamed from: a */
    private final void m4776a(String str) {
        bnx bnx = (bnx) this.f7321a.remove(str);
        if (bnx != null) {
            this.f7322b -= bnx.f5212a;
        }
    }

    /* renamed from: a */
    private final void m4777a(String str, bnx bnx) {
        if (this.f7321a.containsKey(str)) {
            this.f7322b += bnx.f5212a - ((bnx) this.f7321a.get(str)).f5212a;
        } else {
            this.f7322b += bnx.f5212a;
        }
        this.f7321a.put(str, bnx);
    }

    /* renamed from: a */
    static byte[] m4778a(bny bny, long j) {
        long a = bny.mo3313a();
        if (j >= 0 && j <= a) {
            int i = (int) j;
            if (((long) i) == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(bny).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(73);
        sb.append("streamToBytes length=");
        sb.append(j);
        sb.append(", maxLength=");
        sb.append(a);
        throw new IOException(sb.toString());
    }
}
