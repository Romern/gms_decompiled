package p000;

import android.content.Context;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.chimera.config.InvalidConfigException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* renamed from: dft */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dft {
    /* renamed from: a */
    public static long m8316a(byte[] bArr, File file, File file2, boolean z) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        dfs dfs = new dfs();
        dhb.m8472a(m8318a(wrap, file, file2, dfs, z, false));
        return dfs.f13020a;
    }

    /* renamed from: b */
    public static brtm m8324b(FileInputStream fileInputStream) {
        MappedByteBuffer a = m8319a(fileInputStream);
        if (brtm.__has_identifier(a, "FTMR")) {
            try {
                return brtm.m114593c(a);
            } catch (IndexOutOfBoundsException e) {
                throw new InvalidConfigException("metadata out of bounds", e);
            }
        } else {
            throw new InvalidConfigException("file identifier not found");
        }
    }

    /* renamed from: c */
    public static djz m8325c(FileInputStream fileInputStream) {
        MappedByteBuffer a = m8319a(fileInputStream);
        System.currentTimeMillis();
        if (djz.m8702b(a)) {
            try {
                djz a2 = djz.m8701a(a);
                if (a2.mo9181f() != null) {
                    return a2;
                }
                throw new InvalidConfigException("missing required field");
            } catch (IndexOutOfBoundsException e) {
                throw new InvalidConfigException("metadata out of bounds", e);
            }
        } else {
            throw new InvalidConfigException("file identifier not found");
        }
    }

    /* renamed from: a */
    public static File m8317a(Context context) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            File dir = context.getDir("chimera", 0);
            if (dir == null) {
                dir = new File("/dev/null");
            } else {
                try {
                    dir = dir.getCanonicalFile();
                } catch (IOException e) {
                }
            }
            return dir;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static FileInputStream m8318a(ByteBuffer byteBuffer, File file, File file2, dfs dfs, boolean z, boolean z2) {
        dku a;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            if (z2) {
                try {
                    a = dku.m8755a("SHA-256");
                    ByteBuffer order = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN);
                    order.putInt(0, byteBuffer.remaining());
                    fileOutputStream.write(order.array());
                    m8322a(byteBuffer, fileOutputStream, a);
                    fileOutputStream.write(a.digest());
                    a.mo9223a();
                } catch (NoSuchAlgorithmException e) {
                    try {
                        throw new IOException(e);
                    } catch (Throwable th) {
                        fileOutputStream.close();
                        throw th;
                    }
                } catch (Throwable th2) {
                    bqye.m113761a(th, th2);
                }
            } else {
                m8322a(byteBuffer, fileOutputStream, null);
            }
            fileOutputStream.close();
            if (z) {
                File parentFile = file2.getParentFile();
                if (parentFile != null) {
                    dhb.m8480c(parentFile);
                }
                dhb.m8481d(file);
            }
            long lastModified = file.lastModified();
            if (lastModified != 0) {
                long lastModified2 = file2.lastModified();
                if (lastModified <= lastModified2) {
                    file.setLastModified(lastModified2 + 1000);
                    lastModified = file.lastModified();
                }
                FileInputStream fileInputStream = new FileInputStream(file);
                if (file.renameTo(file2)) {
                    dfs.f13020a = lastModified;
                    file.delete();
                    return fileInputStream;
                }
                dhb.m8472a(fileInputStream);
                throw new IOException("Failed to rename pending to live config file");
            }
            throw new IOException("Failed to get pending config file last modified time");
            throw th;
        } catch (IOException e2) {
            try {
                String valueOf = String.valueOf(e2.getMessage());
                Log.e("ConfigFileUtils", valueOf.length() == 0 ? new String("Failed to write config file: ") : "Failed to write config file: ".concat(valueOf));
                file.delete();
                dfs.f13020a = 0;
                return null;
            } catch (Throwable th3) {
                file.delete();
                throw th3;
            }
        } catch (Throwable th4) {
            bqye.m113761a(th, th4);
        }
    }

    /* renamed from: a */
    static MappedByteBuffer m8319a(FileInputStream fileInputStream) {
        System.currentTimeMillis();
        FileChannel channel = fileInputStream.getChannel();
        long size = channel.size();
        if (size > 44) {
            MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0, size);
            if (map != null) {
                map.order(ByteOrder.LITTLE_ENDIAN);
                int i = ((int) size) - 32;
                int i2 = i - 4;
                try {
                    int i3 = map.getInt();
                    if (i2 == i3) {
                        byte[] bArr = new byte[32];
                        map.position(i);
                        map.get(bArr);
                        map.position(4);
                        map.limit(i);
                        int i4 = 0;
                        while (true) {
                            if (i4 < 32) {
                                if (bArr[i4] != 0) {
                                    break;
                                }
                                i4++;
                            } else {
                                m8321a(map);
                                break;
                            }
                        }
                        int i5 = map.getInt(4);
                        if (i5 < i2) {
                            return map;
                        }
                        StringBuilder sb = new StringBuilder(48);
                        sb.append("fb offset ");
                        sb.append(i5);
                        sb.append(" >= config size ");
                        sb.append(i2);
                        throw new InvalidConfigException(sb.toString());
                    }
                    StringBuilder sb2 = new StringBuilder(50);
                    sb2.append("config size ");
                    sb2.append(i2);
                    sb2.append(" != prefix size ");
                    sb2.append(i3);
                    throw new InvalidConfigException(sb2.toString());
                } catch (IndexOutOfBoundsException | BufferUnderflowException e) {
                    throw new InvalidConfigException("file read exception", e);
                }
            } else {
                throw new InvalidConfigException("file map returned null");
            }
        } else {
            throw new InvalidConfigException("file too small");
        }
    }

    /* renamed from: a */
    public static void m8320a(InputStream inputStream, byte[] bArr) {
        int length;
        int i = 0;
        while (true) {
            length = bArr.length;
            int read = inputStream.read(bArr, i, length - i);
            if (read <= 0) {
                break;
            }
            i += read;
        }
        if (i < length) {
            throw new IOException(String.format("Input file too short (expected %d, got %d)", Integer.valueOf(length), Integer.valueOf(i)));
        }
    }

    /* renamed from: a */
    public static void m8321a(ByteBuffer byteBuffer) {
        dku a;
        int capacity = byteBuffer.capacity();
        if (capacity - byteBuffer.limit() == 32) {
            ByteBuffer duplicate = byteBuffer.duplicate();
            try {
                a = dku.m8755a("SHA-256");
                int remaining = duplicate.remaining();
                int min = Math.min(remaining, 8192);
                byte[] bArr = new byte[min];
                while (remaining > 0) {
                    int min2 = Math.min(remaining, min);
                    duplicate.get(bArr, 0, min2);
                    a.update(bArr, 0, min2);
                    remaining -= min2;
                }
                duplicate.limit(capacity);
                byte[] bArr2 = new byte[32];
                duplicate.get(bArr2);
                if (Arrays.equals(a.digest(), bArr2)) {
                    a.mo9223a();
                    return;
                }
                throw new InvalidConfigException("config checksum mismatch");
            } catch (IndexOutOfBoundsException | BufferUnderflowException | NoSuchAlgorithmException e) {
                throw new InvalidConfigException(e);
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        } else {
            throw new InvalidConfigException("config checksum not found");
        }
        throw th;
    }

    /* renamed from: a */
    private static void m8322a(ByteBuffer byteBuffer, FileOutputStream fileOutputStream, dku dku) {
        int remaining = byteBuffer.remaining();
        int min = Math.min(remaining, 8192);
        byte[] bArr = new byte[min];
        while (remaining > 0) {
            int min2 = Math.min(remaining, min);
            byteBuffer.get(bArr, 0, min2);
            if (dku != null) {
                dku.update(bArr, 0, min2);
            }
            fileOutputStream.write(bArr, 0, min2);
            remaining -= min2;
        }
    }

    /* renamed from: a */
    public static byte[] m8323a(File file) {
        FileInputStream fileInputStream;
        System.currentTimeMillis();
        try {
            fileInputStream = new FileInputStream(file);
            int size = (int) fileInputStream.getChannel().size();
            if (size > 1048576) {
                String valueOf = String.valueOf(file);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57);
                sb.append("Config file ");
                sb.append(valueOf);
                sb.append(" is too large to read (");
                sb.append(size);
                sb.append(" > ");
                sb.append(1048576);
                sb.append(")");
                Log.e("ConfigFileUtils", sb.toString());
                fileInputStream.close();
                return null;
            }
            byte[] bArr = new byte[size];
            int i = 0;
            while (true) {
                int read = fileInputStream.read(bArr, i, size - i);
                if (read <= 0) {
                    break;
                }
                i += read;
            }
            if (i >= size) {
                fileInputStream.close();
                return bArr;
            }
            throw new IOException(String.format("file too short (expected %d, got %d)", Integer.valueOf(size), Integer.valueOf(i)));
        } catch (IOException e) {
            String valueOf2 = String.valueOf(e.getMessage());
            Log.e("ConfigFileUtils", valueOf2.length() == 0 ? new String("Failed to read config file: ") : "Failed to read config file: ".concat(valueOf2));
            return null;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
