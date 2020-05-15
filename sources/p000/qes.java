package p000;

import android.os.Debug;
import android.os.DropBoxManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

/* renamed from: qes */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qes {

    /* renamed from: a */
    private static final Logger f41092a = qgn.m32143a("ServiceDumpSys");

    private qes() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00df A[Catch:{ all -> 0x00ff }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e5 A[Catch:{ all -> 0x00ff }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f0 A[SYNTHETIC, Splitter:B:41:0x00f0] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0102 A[SYNTHETIC, Splitter:B:47:0x0102] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x000a A[SYNTHETIC] */
    /* renamed from: a */
    public static void m32028a(Map map, DropBoxManager dropBoxManager, File file) {
        String[] strArr;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str.startsWith("dumpsys:")) {
                String substring = str.substring(8);
                if (((String) entry.getValue()).length() != 0) {
                    strArr = ((String) entry.getValue()).split("\\s+");
                } else {
                    strArr = new String[0];
                }
                FileOutputStream fileOutputStream = null;
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    try {
                        Logger Logger = f41092a;
                        StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 18);
                        sb.append("dumping service [");
                        sb.append(substring);
                        sb.append("]");
                        Logger.mo25414c(sb.toString(), new Object[0]);
                        if (!Debug.dumpService(substring, fileOutputStream2.getFD(), strArr)) {
                            try {
                                fileOutputStream2.close();
                            } catch (IOException e) {
                                f41092a.mo25417e("Cannot close", e, new Object[0]);
                            }
                        } else {
                            try {
                                fileOutputStream2.close();
                            } catch (IOException e2) {
                                f41092a.mo25417e("Cannot close", e2, new Object[0]);
                            }
                            try {
                                dropBoxManager.addFile(str, file, 2);
                                file.delete();
                            } catch (IOException e3) {
                                Logger logger2 = f41092a;
                                String valueOf = String.valueOf(file);
                                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 24);
                                sb2.append("Can't log service dump: ");
                                sb2.append(valueOf);
                                logger2.mo25417e(sb2.toString(), e3, new Object[0]);
                            }
                        }
                    } catch (IOException e4) {
                        e = e4;
                        fileOutputStream = fileOutputStream2;
                        try {
                            Logger logger3 = f41092a;
                            String valueOf2 = String.valueOf(substring);
                            logger3.mo25417e(valueOf2.length() != 0 ? new String("Can't dump service: ") : "Can't dump service: ".concat(valueOf2), e, new Object[0]);
                            if (fileOutputStream == null) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (fileOutputStream != null) {
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                        }
                        throw th;
                    }
                } catch (IOException e5) {
                    e = e5;
                    Logger logger32 = f41092a;
                    String valueOf22 = String.valueOf(substring);
                    logger32.mo25417e(valueOf22.length() != 0 ? new String("Can't dump service: ") : "Can't dump service: ".concat(valueOf22), e, new Object[0]);
                    if (fileOutputStream == null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e6) {
                            f41092a.mo25417e("Cannot close", e6, new Object[0]);
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e7) {
                            f41092a.mo25417e("Cannot close", e7, new Object[0]);
                        }
                    }
                    throw th;
                }
            } else {
                String valueOf3 = String.valueOf(str);
                throw new IllegalArgumentException(valueOf3.length() == 0 ? new String("Bad service key: ") : "Bad service key: ".concat(valueOf3));
            }
        }
    }
}
