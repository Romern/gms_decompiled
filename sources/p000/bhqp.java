package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.places.PlatformKeyManager$1;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: bhqp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhqp {

    /* renamed from: b */
    private static bhqp f119339b = null;

    /* renamed from: a */
    public String f119340a = null;

    /* renamed from: c */
    private final BroadcastReceiver f119341c;

    /* renamed from: d */
    private final Context f119342d;

    /* renamed from: e */
    private int f119343e = 0;

    private bhqp(Context context) {
        this.f119342d = context;
        PlatformKeyManager$1 platformKeyManager$1 = new PlatformKeyManager$1(this, "places");
        this.f119341c = platformKeyManager$1;
        this.f119342d.registerReceiver(platformKeyManager$1, new IntentFilter("com.google.android.places.PLATFORM_KEY_CHANGED_ACTION"), "com.google.android.gms.permission.INTERNAL_BROADCAST", new snr(new sns("PLATFORM_KEY_CHANGE_LISTENER", 10)));
    }

    /* renamed from: a */
    public static bhqp m101339a(Context context) {
        synchronized (bhqp.class) {
            if (f119339b == null) {
                f119339b = new bhqp(context.getApplicationContext());
            }
        }
        return f119339b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004d A[SYNTHETIC, Splitter:B:21:0x004d] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005a A[SYNTHETIC, Splitter:B:29:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0067 A[SYNTHETIC, Splitter:B:37:0x0067] */
    /* renamed from: b */
    public final String mo64169b() {
        DataInputStream dataInputStream;
        File file = new File(this.f119342d.getFilesDir(), "places_PlatformKey");
        DataInputStream dataInputStream2 = null;
        try {
            dataInputStream = new DataInputStream(new GZIPInputStream(new BufferedInputStream(new FileInputStream(file))));
            try {
                String readUTF = dataInputStream.readUTF();
                this.f119340a = readUTF;
                this.f119343e = 0;
                try {
                    dataInputStream.close();
                } catch (IOException e) {
                    bioi.m102658a("Places", "Couldn't close platform key inputStream.");
                }
                return readUTF;
            } catch (FileNotFoundException e2) {
                bioi.m102660b("Places", "Couldn't find platform key file.");
                if (dataInputStream != null) {
                    dataInputStream.close();
                }
                return null;
            } catch (IOException e3) {
                try {
                    bioi.m102658a("Places", "Unexpected IOException when reading platform key.");
                    m101340a(file);
                    if (dataInputStream != null) {
                        try {
                            dataInputStream.close();
                        } catch (IOException e4) {
                            bioi.m102658a("Places", "Couldn't close platform key inputStream.");
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    dataInputStream2 = dataInputStream;
                    if (dataInputStream2 != null) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                dataInputStream2 = dataInputStream;
                if (dataInputStream2 != null) {
                    try {
                        dataInputStream2.close();
                    } catch (IOException e5) {
                        bioi.m102658a("Places", "Couldn't close platform key inputStream.");
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException e6) {
            dataInputStream = null;
            bioi.m102660b("Places", "Couldn't find platform key file.");
            if (dataInputStream != null) {
            }
            return null;
        } catch (IOException e7) {
            dataInputStream = null;
            bioi.m102658a("Places", "Unexpected IOException when reading platform key.");
            m101340a(file);
            if (dataInputStream != null) {
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (dataInputStream2 != null) {
            }
            throw th;
        }
    }

    /* renamed from: a */
    private final void m101340a(File file) {
        int i = this.f119343e + 1;
        this.f119343e = i;
        if (((long) i) >= cgfl.f186724a.mo6606a().mo83607n()) {
            file.delete();
            bioi.m102663d("Places", "Deleted platform key file due to probable corruption");
        }
    }

    /* renamed from: a */
    public final synchronized String mo64167a() {
        String str;
        str = this.f119340a;
        if (str == null) {
            str = mo64169b();
        }
        return str;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.zip.GZIPOutputStream.<init>(java.io.OutputStream, boolean):void throws java.io.IOException}
     arg types: [java.io.FileOutputStream, int]
     candidates:
      ClspMth{java.util.zip.GZIPOutputStream.<init>(java.io.OutputStream, int):void throws java.io.IOException}
      ClspMth{java.util.zip.GZIPOutputStream.<init>(java.io.OutputStream, boolean):void throws java.io.IOException} */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x009c A[SYNTHETIC, Splitter:B:51:0x009c] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00be A[SYNTHETIC, Splitter:B:68:0x00be] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d5 A[SYNTHETIC, Splitter:B:77:0x00d5] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00e2 A[SYNTHETIC, Splitter:B:83:0x00e2] */
    /* renamed from: a */
    public final synchronized void mo64168a(String str) {
        String str2;
        String str3;
        DataOutputStream dataOutputStream;
        GZIPOutputStream gZIPOutputStream;
        sdo.m34977c(str);
        if (!str.equals(this.f119340a)) {
            File filesDir = this.f119342d.getFilesDir();
            if (!filesDir.exists()) {
                if (!filesDir.mkdirs()) {
                    bioi.m102658a("Places", "Failed to create filesDir.");
                }
            }
            File file = new File(this.f119342d.getFilesDir(), "places_PlatformKey");
            DataOutputStream dataOutputStream2 = null;
            FileLock fileLock = null;
            r1 = null;
            DataOutputStream dataOutputStream3 = null;
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    FileLock lock = fileOutputStream.getChannel().lock();
                    try {
                        int i = Build.VERSION.SDK_INT;
                        gZIPOutputStream = new GZIPOutputStream((OutputStream) fileOutputStream, false);
                        dataOutputStream = new DataOutputStream(gZIPOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        dataOutputStream = null;
                        fileLock = lock;
                        if (fileLock != null) {
                        }
                        throw th;
                    }
                    try {
                        dataOutputStream.writeUTF(str);
                        dataOutputStream.flush();
                        gZIPOutputStream.finish();
                        dataOutputStream.close();
                        this.f119342d.sendBroadcast(spn.m35889g("com.google.android.places.PLATFORM_KEY_CHANGED_ACTION"), "com.google.android.gms.permission.INTERNAL_BROADCAST");
                        this.f119343e = 0;
                        this.f119340a = str;
                        if (lock != null) {
                            try {
                                if (lock.isValid()) {
                                    lock.release();
                                }
                            } catch (IOException e) {
                                dataOutputStream2 = dataOutputStream;
                                bioi.m102658a("Places", "Unexpected IOException when writing platform key.");
                                m101340a(file);
                                if (dataOutputStream3 != null) {
                                }
                            } catch (OverlappingFileLockException e2) {
                                dataOutputStream3 = dataOutputStream;
                                try {
                                    bioi.m102662c("Places", "Platform key write failed due to held file lock.");
                                    m101340a(file);
                                    if (dataOutputStream3 != null) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (dataOutputStream3 != null) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                dataOutputStream3 = dataOutputStream;
                                if (dataOutputStream3 != null) {
                                }
                                throw th;
                            }
                        }
                        try {
                            dataOutputStream.close();
                        } catch (IOException e3) {
                            str2 = "Places";
                            str3 = "Couldn't close platform key outputStream.";
                            bioi.m102658a(str2, str3);
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        fileLock = lock;
                        if (fileLock != null) {
                            try {
                                if (fileLock.isValid()) {
                                    fileLock.release();
                                }
                            } catch (IOException e4) {
                                dataOutputStream2 = dataOutputStream;
                                bioi.m102658a("Places", "Unexpected IOException when writing platform key.");
                                m101340a(file);
                                if (dataOutputStream3 != null) {
                                }
                            } catch (OverlappingFileLockException e5) {
                                dataOutputStream3 = dataOutputStream;
                                bioi.m102662c("Places", "Platform key write failed due to held file lock.");
                                m101340a(file);
                                if (dataOutputStream3 != null) {
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                dataOutputStream3 = dataOutputStream;
                                if (dataOutputStream3 != null) {
                                }
                                throw th;
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    dataOutputStream = null;
                    if (fileLock != null) {
                    }
                    throw th;
                }
            } catch (IOException e6) {
                bioi.m102658a("Places", "Unexpected IOException when writing platform key.");
                m101340a(file);
                if (dataOutputStream3 != null) {
                    try {
                        dataOutputStream3.close();
                    } catch (IOException e7) {
                        str2 = "Places";
                        str3 = "Couldn't close platform key outputStream.";
                    }
                }
            } catch (OverlappingFileLockException e8) {
                bioi.m102662c("Places", "Platform key write failed due to held file lock.");
                m101340a(file);
                if (dataOutputStream3 != null) {
                    try {
                        dataOutputStream3.close();
                    } catch (IOException e9) {
                        str2 = "Places";
                        str3 = "Couldn't close platform key outputStream.";
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                if (dataOutputStream3 != null) {
                    try {
                        dataOutputStream3.close();
                    } catch (IOException e10) {
                        bioi.m102658a("Places", "Couldn't close platform key outputStream.");
                    }
                }
                throw th;
            }
        }
    }
}
