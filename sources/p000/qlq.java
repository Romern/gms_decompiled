package p000;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;

/* renamed from: qlq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qlq extends qmh {

    /* renamed from: a */
    public static qlq f41665a;

    /* renamed from: b */
    private final boolean f41666b;

    /* renamed from: c */
    private final long f41667c;

    /* renamed from: d */
    private final Context f41668d;

    public qlq(Context context) {
        this.f41668d = context.getApplicationContext();
        this.f41667c = dia.m8552b(context);
        this.f41666b = !dia.m8551a(context);
    }

    /* renamed from: a */
    public final int mo24091a(bnic bnic) {
        throw null;
    }

    /* renamed from: a */
    public final void mo24093a() {
        throw null;
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:128:0x0072 */
    /* JADX WARN: Type inference failed for: r6v6, types: [bnhe], assign insn: PHI: (r6v6 ?) = (r6v7 ?), (r6v22 bnhe) binds: [B:128:0x0072, B:21:0x006d] */
    /* JADX WARN: Type inference failed for: r6v7, assign insn: PHI: (r6v7 ?) = (r6v8 ?), (r6v9 ?) binds: [B:135:0x0072, B:134:0x0072] */
    /* JADX WARN: Type inference failed for: r6v8, assign insn: 0x026c: MOVE  (r6v8 ? I:?[OBJECT, ARRAY]) = (r18v3 bnic) */
    /* JADX WARN: Type inference failed for: r6v9, assign insn: 0x0263: MOVE  (r6v9 ? I:?[OBJECT, ARRAY]) = (r18v4 bnic) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0227 A[SYNTHETIC, Splitter:B:109:0x0227] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01cf A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01c6 A[SYNTHETIC, Splitter:B:93:0x01c6] */
    /* renamed from: a */
    public final int mo24092a(boolean z, bnic bnic) {
        File file;
        Throwable th;
        FileOutputStream fileOutputStream;
        Throwable th2;
        bnic bnic2 = bnic;
        qli a = qli.m32351a(this.f41668d);
        if (this.f41666b && z) {
            if (qli.m32351a(this.f41668d).f41640a.getLong("Chimera.downloadFrom", 0) == 0) {
                qoo.m32581a(this.f41668d).mo24093a();
            }
            a.mo24075a(1L);
            Context context = this.f41668d;
            long j = this.f41667c;
            if (qnr.f41794a == null) {
                synchronized (qnr.class) {
                    if (qnr.f41794a == null) {
                        qnr.f41794a = new qnr(context, j);
                    }
                }
            }
            qnr qnr = qnr.f41794a;
            qnd a2 = qnd.m32471a(qnr.f41796c);
            Collection<qnc> a3 = a2.mo24118a(bnic2);
            if (a3 != null) {
                if (a3.isEmpty()) {
                    return 1;
                }
                bnhe e = dgv.m8427a(qnr.f41796c).mo8987e();
                if (e != null) {
                    boolean z2 = true;
                    bnhe bnhe = e;
                    for (qnc qnc : a3) {
                        dhs dhs = new dhs(qnc.f41759a, qnc.f41760b);
                        if (bnhe.containsKey(dhs)) {
                            String valueOf = String.valueOf(dhs);
                            long j2 = qnr.f41795b;
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 59);
                            sb.append(valueOf);
                            sb.append(" already present. skipping it for user ");
                            sb.append(j2);
                            Log.i("PeerModuleDownloader", sb.toString());
                            bnic = bnhe;
                        } else {
                            try {
                                ParcelFileDescriptor openFileDescriptor = qnr.f41796c.getContentResolver().openFileDescriptor(Uri.withAppendedPath(Uri.parse("content://com.google.android.gms.chimera.container.sharedmoduleprovider"), new Uri.Builder().scheme("moduleapk-identifier").appendPath(dhs.f13182a).appendPath(dhs.f13183b).build().toString()), "r");
                                if (openFileDescriptor == null) {
                                    try {
                                        String valueOf2 = String.valueOf(dhs);
                                        bnic = bnhe;
                                        long j3 = qnr.f41795b;
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 57);
                                        sb2.append("no parcel file descriptor for ");
                                        sb2.append(valueOf2);
                                        sb2.append("(user ");
                                        sb2.append(j3);
                                        sb2.append(")");
                                        Log.e("PeerModuleDownloader", sb2.toString());
                                        file = null;
                                        if (file != null) {
                                            try {
                                                if (!a2.mo24122a(qnc.f41759a, qnc.f41760b, file)) {
                                                    String absolutePath = file.getAbsolutePath();
                                                    long j4 = qnr.f41795b;
                                                    StringBuilder sb3 = new StringBuilder(String.valueOf(absolutePath).length() + 46);
                                                    sb3.append("failure pulling ");
                                                    sb3.append(absolutePath);
                                                    sb3.append(" for user ");
                                                    sb3.append(j4);
                                                    Log.e("PeerModuleDownloader", sb3.toString());
                                                    z2 = false;
                                                }
                                                file.delete();
                                                bnhe = bnic;
                                            } catch (Throwable th3) {
                                                file.delete();
                                                throw th3;
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        Throwable th5 = th;
                                        if (openFileDescriptor == null) {
                                        }
                                        throw th5;
                                    }
                                } else {
                                    bnic = bnhe;
                                    File d = dgv.m8427a(qnr.f41796c).mo8986d();
                                    if (d != null) {
                                        if (d.isDirectory()) {
                                            File createTempFile = File.createTempFile("copied-", ".apk", d);
                                            try {
                                                ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(openFileDescriptor);
                                                try {
                                                    fileOutputStream = new FileOutputStream(createTempFile);
                                                    byte[] bArr = new byte[8192];
                                                    while (true) {
                                                        int read = autoCloseInputStream.read(bArr);
                                                        if (read == -1) {
                                                            break;
                                                        }
                                                        fileOutputStream.write(bArr, 0, read);
                                                    }
                                                    fileOutputStream.close();
                                                    autoCloseInputStream.close();
                                                    try {
                                                        openFileDescriptor.close();
                                                        file = createTempFile;
                                                    } catch (FileNotFoundException e2) {
                                                        String valueOf3 = String.valueOf(dhs);
                                                        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf3).length() + 36);
                                                        sb4.append("Cannot find the file with identifier");
                                                        sb4.append(valueOf3);
                                                        Log.e("PeerModuleDownloader", sb4.toString());
                                                        file = null;
                                                        if (file != null) {
                                                        }
                                                        bnhe = bnic;
                                                    } catch (IOException e3) {
                                                        String valueOf4 = String.valueOf(dhs);
                                                        StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf4).length() + 31);
                                                        sb5.append("Cannot create scratch file for ");
                                                        sb5.append(valueOf4);
                                                        Log.e("PeerModuleDownloader", sb5.toString());
                                                        file = null;
                                                        if (file != null) {
                                                        }
                                                        bnhe = bnic;
                                                    }
                                                    if (file != null) {
                                                    }
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    autoCloseInputStream.close();
                                                    throw th;
                                                }
                                            } catch (IOException e4) {
                                                String valueOf5 = String.valueOf(dhs);
                                                StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf5).length() + 39);
                                                sb6.append("Failed to copy the file with identifier");
                                                sb6.append(valueOf5);
                                                Log.e("PeerModuleDownloader", sb6.toString());
                                                createTempFile.delete();
                                            } catch (Throwable th7) {
                                                bqye.m113761a(th, th7);
                                            }
                                        }
                                    }
                                    Log.e("PeerModuleDownloader", "Failed to create the modules directory.");
                                    openFileDescriptor.close();
                                    file = null;
                                    if (file != null) {
                                    }
                                }
                            } catch (FileNotFoundException e5) {
                                bnic = bnhe;
                                String valueOf32 = String.valueOf(dhs);
                                StringBuilder sb42 = new StringBuilder(String.valueOf(valueOf32).length() + 36);
                                sb42.append("Cannot find the file with identifier");
                                sb42.append(valueOf32);
                                Log.e("PeerModuleDownloader", sb42.toString());
                                file = null;
                                if (file != null) {
                                }
                                bnhe = bnic;
                            } catch (IOException e6) {
                                bnic = bnhe;
                                String valueOf42 = String.valueOf(dhs);
                                StringBuilder sb52 = new StringBuilder(String.valueOf(valueOf42).length() + 31);
                                sb52.append("Cannot create scratch file for ");
                                sb52.append(valueOf42);
                                Log.e("PeerModuleDownloader", sb52.toString());
                                file = null;
                                if (file != null) {
                                }
                                bnhe = bnic;
                            }
                        }
                        bnhe = bnic;
                    }
                    if (!z2) {
                        return 2;
                    }
                    return 1;
                }
            }
            return 2;
        }
        a.mo24075a(0L);
        return qoo.m32581a(this.f41668d).mo24091a(bnic2);
        throw th2;
    }
}
