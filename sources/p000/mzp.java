package p000;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Callable;
import javax.crypto.SecretKey;

/* renamed from: mzp */
final /* synthetic */ class mzp implements Callable {

    /* renamed from: a */
    private final nab f35054a;

    /* renamed from: b */
    private final ParcelFileDescriptor f35055b;

    public mzp(nab nab, ParcelFileDescriptor parcelFileDescriptor) {
        this.f35054a = nab;
        this.f35055b = parcelFileDescriptor;
    }

    /* JADX WARN: Type inference failed for: r8v11, types: [ncj], assign insn: 0x00a6: CONSTRUCTOR  (r8v11 ? I:ncj) = (r6v33 java.io.File), (r9v9 mze), (r10v2 ncb) call: ncj.<init>(java.io.File, mze, ncb):void type: CONSTRUCTOR */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0184, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0185, code lost:
        r5 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        p000.nab.f35075a.mo25417e("Restore failed", r5, new java.lang.Object[0]);
        r3.f35117x.mo19838b(29, 4);
        r3.f35085J = false;
        p000.mab.m24748a(r3.f35110q, r5, p000.cclp.m130476f());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01b8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01b9, code lost:
        p000.nab.f35075a.mo25417e("Restore failed", r0, new java.lang.Object[0]);
        r3.f35085J = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01ca, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        p000.nab.f35075a.mo25418e("Missing secondary key, expected if the user did d2d: %s", r0.getMessage());
        r3.f35085J = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01de, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01df, code lost:
        p000.nab.f35075a.mo25417e("Restore failed", r0, new java.lang.Object[0]);
        r3.f35089N = 3;
        r3.f35085J = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01ed, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01ef, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01f0, code lost:
        p000.nab.f35075a.mo25417e("Restore failed", r0, new java.lang.Object[0]);
        r3.f35089N = 4;
        r3.f35085J = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01fd, code lost:
        p000.srz.m36170a(r4);
        r7 = -1000;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00cc A[Catch:{ IOException -> 0x0174, mbb -> 0x01ef, mbh -> 0x01ed, mbf -> 0x01de, nct -> 0x01ca, nco -> 0x01b8, lwh -> 0x0184, IOException -> 0x0164, all -> 0x0161, mbb -> 0x01ef, mbh -> 0x01ed, mbf -> 0x01de, nct -> 0x01ca, nco -> 0x01b8, IOException -> 0x01a1, lwh -> 0x0184, all -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d2 A[Catch:{ IOException -> 0x0174, mbb -> 0x01ef, mbh -> 0x01ed, mbf -> 0x01de, nct -> 0x01ca, nco -> 0x01b8, lwh -> 0x0184, IOException -> 0x0164, all -> 0x0161, mbb -> 0x01ef, mbh -> 0x01ed, mbf -> 0x01de, nct -> 0x01ca, nco -> 0x01b8, IOException -> 0x01a1, lwh -> 0x0184, all -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0184 A[ExcHandler: lwh (r0v13 'e' lwh A[CUSTOM_DECLARE]), Splitter:B:11:0x0025] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01b8 A[Catch:{ IOException -> 0x0174, mbb -> 0x01ef, mbh -> 0x01ed, mbf -> 0x01de, nct -> 0x01ca, nco -> 0x01b8, lwh -> 0x0184, IOException -> 0x0164, all -> 0x0161, mbb -> 0x01ef, mbh -> 0x01ed, mbf -> 0x01de, nct -> 0x01ca, nco -> 0x01b8, IOException -> 0x01a1, lwh -> 0x0184, all -> 0x0180 }, ExcHandler: nco (r0v11 'e' nco A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:11:0x0025] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01ca A[ExcHandler: nct (r0v10 'e' nct A[CUSTOM_DECLARE]), Splitter:B:11:0x0025] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01de A[Catch:{ IOException -> 0x0174, mbb -> 0x01ef, mbh -> 0x01ed, mbf -> 0x01de, nct -> 0x01ca, nco -> 0x01b8, lwh -> 0x0184, IOException -> 0x0164, all -> 0x0161, mbb -> 0x01ef, mbh -> 0x01ed, mbf -> 0x01de, nct -> 0x01ca, nco -> 0x01b8, IOException -> 0x01a1, lwh -> 0x0184, all -> 0x0180 }, ExcHandler: mbf (r0v9 'e' mbf A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:11:0x0025] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ed A[Catch:{ IOException -> 0x0174, mbb -> 0x01ef, mbh -> 0x01ed, mbf -> 0x01de, nct -> 0x01ca, nco -> 0x01b8, lwh -> 0x0184, IOException -> 0x0164, all -> 0x0161, mbb -> 0x01ef, mbh -> 0x01ed, mbf -> 0x01de, nct -> 0x01ca, nco -> 0x01b8, IOException -> 0x01a1, lwh -> 0x0184, all -> 0x0180 }, ExcHandler: mbh (e mbh), Splitter:B:11:0x0025] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01ef A[Catch:{ IOException -> 0x0174, mbb -> 0x01ef, mbh -> 0x01ed, mbf -> 0x01de, nct -> 0x01ca, nco -> 0x01b8, lwh -> 0x0184, IOException -> 0x0164, all -> 0x0161, mbb -> 0x01ef, mbh -> 0x01ed, mbf -> 0x01de, nct -> 0x01ca, nco -> 0x01b8, IOException -> 0x01a1, lwh -> 0x0184, all -> 0x0180 }, ExcHandler: mbb (e mbb), Splitter:B:11:0x0025] */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final Object call() {
        int i;
        Throwable th;
        IOException iOException;
        FileOutputStream fileOutputStream;
        boolean z;
        nab nab = this.f35054a;
        ParcelFileDescriptor parcelFileDescriptor = this.f35055b;
        myr myr = nab.f35107n;
        if (myr != null) {
            if (myr.f34968g == null) {
                String str = (String) myr.f34965d.get(myr.f34966e);
                File b = myr.f34967f.mo19847b(str);
                lvn lvn = myr.f34962a;
                String valueOf = String.valueOf(str);
                lvn.mo25409a(valueOf.length() == 0 ? new String("Starting d2d full restore of ") : "Starting d2d full restore of ".concat(valueOf), new Object[0]);
                try {
                    myr.f34968g = new BufferedInputStream(new FileInputStream(b));
                } catch (IOException e) {
                    myr.f34962a.mo25418e(e.getMessage(), new Object[0]);
                    myr.f34964c.mo19838b(11, 4);
                    myr.mo20329b();
                    i = -1000;
                }
            }
            byte[] bArr = new byte[AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT];
            FileOutputStream fileOutputStream2 = null;
            fileOutputStream2 = null;
            try {
                int read = myr.f34968g.read(bArr);
                i = -1;
                if (read == -1) {
                    myr.mo20329b();
                    myr.f34962a.mo25409a("Full d2d restore complete.", new Object[0]);
                    srz.m36171a((Closeable) null);
                } else {
                    FileOutputStream fileOutputStream3 = new FileOutputStream(parcelFileDescriptor.getFileDescriptor());
                    try {
                        fileOutputStream3.write(bArr, 0, read);
                        fileOutputStream3.close();
                        lvn lvn2 = myr.f34962a;
                        StringBuilder sb = new StringBuilder(27);
                        sb.append("Restored ");
                        sb.append(read);
                        sb.append(" bytes.");
                        lvn2.mo25409a(sb.toString(), new Object[0]);
                        srz.m36171a(fileOutputStream3);
                        i = read;
                    } catch (IOException e2) {
                        iOException = e2;
                        fileOutputStream2 = fileOutputStream3;
                        try {
                            myr.f34962a.mo25418e(iOException.getMessage(), new Object[0]);
                            myr.f34964c.mo19838b(12, 4);
                            myr.mo20329b();
                            srz.m36171a(fileOutputStream2);
                            i = -1000;
                            return Integer.valueOf(i);
                        } catch (Throwable th2) {
                            th = th2;
                            srz.m36171a(fileOutputStream2);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream2 = fileOutputStream3;
                        srz.m36171a(fileOutputStream2);
                        throw th;
                    }
                }
            } catch (IOException e3) {
                iOException = e3;
                myr.f34962a.mo25418e(iOException.getMessage(), new Object[0]);
                myr.f34964c.mo19838b(12, 4);
                myr.mo20329b();
                srz.m36171a(fileOutputStream2);
                i = -1000;
                return Integer.valueOf(i);
            } catch (Throwable th4) {
                th = th4;
                srz.m36171a(fileOutputStream2);
                throw th;
            }
        } else if (nab.f35098e != null) {
            ndn ndn = nab.f35100g;
            if (ndn != null && ndn.mo20491a() == 2 && (nab.f35100g instanceof ndk)) {
                try {
                    if (nab.f35104k == null) {
                        mzd mzd = nab.f35079D;
                        Context context = nab.f35110q;
                        ndw.m25994d();
                        aboy aboy = nab.f35105l;
                        myo myo = nab.f35088M;
                        ndv ndv = nab.f35106m;
                        ndn ndn2 = nab.f35100g;
                        ndu a = ndv.mo20502a(ndn2.f35344d, ndn2.mo20492b());
                        ndk ndk = (ndk) nab.f35100g;
                        mbx mbx = nab.f35117x;
                        if (ndk.mo20491a() == 2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        sdo.m34975b(z, "App must be full data");
                        Context context2 = context;
                        mze mze = new mze(context2, ndk.f35344d, ndk.f35342c, aboy, a, new Random());
                        if (lwb.m24519c()) {
                            if (ndk instanceof ndj) {
                                mzd.f35017a.mo25414c("Performing encrypted restore for %s", ndk.f35344d);
                                ndj ndj = (ndj) ndk;
                                SecretKey a2 = nbl.m25890a(myo, mbx, ndj.f35339a, ndj.f35340b);
                                File file = new File(context2.getFilesDir(), "encrypted_restore_temp");
                                file.mkdirs();
                                mze = new ncj(file, mze, new ncb(a2, mbx));
                                nab.f35104k = mze;
                                sek sek = nab.f35075a;
                                String valueOf2 = String.valueOf(nab.f35100g.f35344d);
                                sek.mo25409a(valueOf2.length() != 0 ? new String("Read first chunk for ") : "Read first chunk for ".concat(valueOf2), new Object[0]);
                            }
                        }
                        mzd.f35017a.mo25414c("Performing unencrypted restore for %s", ndk.f35344d);
                        nab.f35104k = mze;
                        sek sek2 = nab.f35075a;
                        String valueOf22 = String.valueOf(nab.f35100g.f35344d);
                        sek2.mo25409a(valueOf22.length() != 0 ? new String("Read first chunk for ") : "Read first chunk for ".concat(valueOf22), new Object[0]);
                    } else {
                        sek sek3 = nab.f35075a;
                        String valueOf3 = String.valueOf(nab.f35100g.f35344d);
                        sek3.mo25409a(valueOf3.length() == 0 ? new String("Read next chunk for ") : "Read next chunk for ".concat(valueOf3), new Object[0]);
                    }
                    byte[] bArr2 = new byte[AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT];
                    int a3 = nab.f35104k.mo20345a(bArr2);
                    sek sek4 = nab.f35075a;
                    StringBuilder sb2 = new StringBuilder(22);
                    sb2.append("Read ");
                    sb2.append(a3);
                    sb2.append(" Bytes");
                    sek4.mo25409a(sb2.toString(), new Object[0]);
                    if (a3 == -1) {
                        nab.f35089N = 2;
                        nab.mo20382e();
                        nab.f35075a.mo25409a("Reach end of http content -- NO MORE DATA", new Object[0]);
                        nab.f35106m.mo20504a(nab.f35100g.f35344d);
                        srz.m36170a(parcelFileDescriptor);
                        i = -1;
                    } else {
                        fileOutputStream = new FileOutputStream(parcelFileDescriptor.getFileDescriptor());
                        fileOutputStream.write(bArr2, 0, a3);
                        fileOutputStream.close();
                        srz.m36171a(fileOutputStream);
                        srz.m36170a(parcelFileDescriptor);
                        i = a3;
                    }
                } catch (IOException e4) {
                    IOException iOException2 = e4;
                    nab.f35075a.mo25417e("HTTP reading error", iOException2, new Object[0]);
                    throw iOException2;
                } catch (mbb e5) {
                } catch (mbh e6) {
                } catch (mbf e7) {
                } catch (nct e8) {
                } catch (nco e9) {
                } catch (lwh e10) {
                } catch (IOException e11) {
                    IOException iOException3 = e11;
                    nab.f35075a.mo25418e("Fail to write to socket.", new Object[0]);
                    throw iOException3;
                } catch (IOException e12) {
                    nab.f35075a.mo25417e("Restore failed", e12, new Object[0]);
                    nab.f35089N = 3;
                    nab.f35117x.mo19838b(30, 4);
                    nab.f35085J = false;
                } catch (Throwable th5) {
                    Throwable th6 = th5;
                    srz.m36170a(parcelFileDescriptor);
                    throw th6;
                }
            } else {
                nab.f35075a.mo25416d("getNextFullRestoreDataChunk() but no current full restore app", new Object[0]);
                i = -1002;
            }
        } else {
            i = -1000;
        }
        return Integer.valueOf(i);
        srz.m36170a(parcelFileDescriptor);
        i = -1002;
        return Integer.valueOf(i);
    }
}
