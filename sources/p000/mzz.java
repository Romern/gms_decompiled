package p000;

import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.content.Context;
import android.os.ParcelFileDescriptor;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import javax.crypto.SecretKey;

/* renamed from: mzz */
final /* synthetic */ class mzz implements Callable {

    /* renamed from: a */
    private final nab f35071a;

    /* renamed from: b */
    private final ParcelFileDescriptor f35072b;

    public mzz(nab nab, ParcelFileDescriptor parcelFileDescriptor) {
        this.f35071a = nab;
        this.f35072b = parcelFileDescriptor;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ndv.a(java.lang.String, boolean):ndu
     arg types: [java.lang.String, int]
     candidates:
      ndv.a(android.content.Context, int):void
      ndv.a(java.lang.String, boolean):ndu */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bngx.a(java.util.Comparator, java.lang.Iterable):bngx
     arg types: [bnny, bnic]
     candidates:
      bngx.a(java.lang.Object, java.lang.Object):bngx
      bngx.a(java.lang.Object[], int):int
      bngx.a(int, int):bngx
      bngm.a(java.lang.Object[], int):int
      bngx.a(java.util.Comparator, java.lang.Iterable):bngx */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00fc  */
    public final Object call() {
        int i;
        File file;
        ltj ltj;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        nab nab = this.f35071a;
        ParcelFileDescriptor parcelFileDescriptor = this.f35072b;
        myr myr = nab.f35107n;
        if (myr != null) {
            String str = (String) myr.f34965d.get(myr.f34966e);
            File b = myr.f34967f.mo19847b(str);
            lvn lvn = myr.f34962a;
            String valueOf = String.valueOf(str);
            lvn.mo25409a(valueOf.length() == 0 ? new String("Starting d2d restore of k/v package: ") : "Starting d2d restore of k/v package: ".concat(valueOf), new Object[0]);
            try {
                fileInputStream2 = new FileInputStream(b);
            } catch (IOException e) {
                e = e;
                fileInputStream = null;
                try {
                    myr.f34962a.mo25417e("Error restoring.", e, new Object[0]);
                    myr.f34964c.mo19838b(12, 4);
                    srz.m36171a((Closeable) fileInputStream);
                    srz.m36170a(parcelFileDescriptor);
                    if (!"@pm@".equals(str)) {
                        b.delete();
                        i = -1000;
                        return Integer.valueOf(i);
                    }
                    i = -1000;
                    return Integer.valueOf(i);
                } catch (Throwable th) {
                    th = th;
                    srz.m36171a((Closeable) fileInputStream);
                    srz.m36170a(parcelFileDescriptor);
                    if (!"@pm@".equals(str)) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = null;
                srz.m36171a((Closeable) fileInputStream);
                srz.m36170a(parcelFileDescriptor);
                if (!"@pm@".equals(str)) {
                    b.delete();
                }
                throw th;
            }
            try {
                BackupDataInput backupDataInput = new BackupDataInput(fileInputStream2.getFD());
                BackupDataOutput backupDataOutput = new BackupDataOutput(parcelFileDescriptor.getFileDescriptor());
                HashMap hashMap = new HashMap();
                while (backupDataInput.readNextHeader()) {
                    String key = backupDataInput.getKey();
                    int dataSize = backupDataInput.getDataSize();
                    if (dataSize >= 0) {
                        byte[] bArr = new byte[dataSize];
                        backupDataInput.readEntityData(bArr, 0, dataSize);
                        hashMap.put(key, bArr);
                    } else {
                        backupDataInput.skipEntityData();
                    }
                }
                ArrayList<String> arrayList = new ArrayList(hashMap.keySet());
                Collections.sort(arrayList);
                for (String str2 : arrayList) {
                    byte[] bArr2 = (byte[]) hashMap.get(str2);
                    int length = bArr2.length;
                    backupDataOutput.writeEntityHeader(str2, length);
                    backupDataOutput.writeEntityData(bArr2, length);
                }
                myr.f34962a.mo25409a("D2d restore complete.", new Object[0]);
                srz.m36171a((Closeable) fileInputStream2);
                srz.m36170a(parcelFileDescriptor);
                if (!"@pm@".equals(str)) {
                    b.delete();
                    i = 0;
                } else {
                    i = 0;
                }
            } catch (IOException e2) {
                e = e2;
                fileInputStream = fileInputStream2;
                myr.f34962a.mo25417e("Error restoring.", e, new Object[0]);
                myr.f34964c.mo19838b(12, 4);
                srz.m36171a((Closeable) fileInputStream);
                srz.m36170a(parcelFileDescriptor);
                if (!"@pm@".equals(str)) {
                }
                i = -1000;
                return Integer.valueOf(i);
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = fileInputStream2;
                srz.m36171a((Closeable) fileInputStream);
                srz.m36170a(parcelFileDescriptor);
                if (!"@pm@".equals(str)) {
                }
                throw th;
            }
        } else {
            ndn ndn = nab.f35100g;
            if (!(ndn instanceof ndj) || ndn.mo20491a() != 1) {
                ndn ndn2 = nab.f35100g;
                if (ndn2 instanceof ndm) {
                    nab.f35075a.mo25414c("Unencrypted kv restore of %s", nab.f35100g.f35344d);
                    myl myl = new myl(new BackupDataOutput(parcelFileDescriptor.getFileDescriptor()));
                    while (true) {
                        ndn ndn3 = nab.f35100g;
                        if (ndn3 != null && ndn3.f35344d.equals(nab.f35101h)) {
                            try {
                                Map map = ((ndm) nab.f35100g).f35343a;
                                String[] strArr = (String[]) map.keySet().toArray(new String[map.size()]);
                                Arrays.sort(strArr);
                                for (String str3 : strArr) {
                                    byte[] bArr3 = (byte[]) map.get(str3);
                                    int lastIndexOf = str3.lastIndexOf(":#");
                                    if (lastIndexOf == -1) {
                                        myl.mo20312a(str3, 0, bArr3.length, bArr3);
                                        myl.f34939a = -2;
                                    } else {
                                        ParsePosition parsePosition = new ParsePosition(lastIndexOf);
                                        myl.mo20312a(str3.substring(0, lastIndexOf), myj.f34934a.parse(str3, parsePosition).intValue(), myj.f34935b.parse(str3, parsePosition).intValue(), bArr3);
                                    }
                                }
                                if (!nab.mo20383f()) {
                                    nab.f35075a.mo25418e("Error getting restore data from server", new Object[0]);
                                    nab.f35117x.mo19824a(6, 4, nab.f35100g.f35344d);
                                    nab.f35085J = false;
                                    nab.f35098e = null;
                                    i = -1000;
                                    break;
                                }
                            } catch (IOException | myk e3) {
                                nab.f35075a.mo25417e("Error in restore data from server", e3, new Object[0]);
                                if (e3 instanceof myk) {
                                    nab.f35117x.mo19824a(9, 4, nab.f35100g.f35344d);
                                } else {
                                    nab.f35117x.mo19824a(10, 4, nab.f35100g.f35344d);
                                }
                                nab.f35085J = false;
                                nab.f35098e = null;
                                i = -1000;
                                return Integer.valueOf(i);
                            }
                        }
                    }
                    nab.f35106m.mo20504a(nab.f35101h);
                    i = 0;
                } else {
                    String valueOf2 = String.valueOf(ndn2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 31);
                    sb.append("Package in progress is not kv: ");
                    sb.append(valueOf2);
                    throw new IllegalStateException(sb.toString());
                }
            } else {
                nab.f35075a.mo25414c("Encrypted kv restore of %s", nab.f35100g.f35344d);
                ndj ndj = (ndj) nab.f35100g;
                if (!lwb.m24519c()) {
                    nab.f35075a.mo25418e("Attempted encrypted kv restore but disabled", new Object[0]);
                    i = -1002;
                } else {
                    try {
                        Context context = nab.f35110q;
                        ndw.m25994d();
                        Random random = new Random();
                        myo myo = nab.f35088M;
                        aboy aboy = nab.f35105l;
                        ndu a = nab.f35106m.mo20502a(ndj.f35344d, true);
                        mbx mbx = nab.f35117x;
                        ndi ndi = nab.f35099f;
                        ltj ltj2 = ndi != null ? (ltj) ndi.f35337b.get(ndj.f35344d) : null;
                        SecretKey a2 = nbl.m25890a(myo, mbx, ndj.f35339a, ndj.f35340b);
                        ncn ncn = new ncn(context.getFilesDir(), new naz(a2), new ncp(new mze(context, ndj.f35344d, ndj.f35342c, aboy, a, random)), new ncb(a2, mbx), ltj2);
                        file = new File(ncn.f35288a, "encrypted_kv");
                        ncn.f35290c.mo20455a(file);
                        nbt nbt = new nbt(ncn.f35289b);
                        ncn.f35291d.mo20448a(file, nbt);
                        BackupDataOutput backupDataOutput2 = new BackupDataOutput(parcelFileDescriptor.getFileDescriptor());
                        bmxy.m108601b(nbt.f35213b, "Must close() before getPairs()");
                        bnre i2 = bngx.m109369a((Comparator) bnnt.f131877a.mo68159a(nbs.f35211a), (Iterable) nbt.f35212a.mo67751a()).listIterator();
                        while (i2.hasNext()) {
                            mcy mcy = (mcy) i2.next();
                            if (!ccmw.m130709b() || (ltj = ncn.f35292e) == null || !ltj.f32944b.contains(mcy.f33464b)) {
                                backupDataOutput2.writeEntityHeader(mcy.f33464b, mcy.f33465c.mo73744a());
                                backupDataOutput2.writeEntityData(mcy.f33465c.mo73780k(), mcy.f33465c.mo73744a());
                            }
                        }
                        file.delete();
                        nab.f35106m.mo20504a(nab.f35101h);
                        i = 0;
                    } catch (nct e4) {
                        nab.f35075a.mo25418e("Missing secondary key, expected if the user did d2d: %s", e4.getMessage());
                        nab.f35098e = null;
                        nab.f35085J = false;
                        i = -1000;
                    } catch (mbb | mbf | mbh | nco e5) {
                        nab.f35075a.mo25417e("Encrypted kv restore failed", e5, new Object[0]);
                        nab.f35098e = null;
                        nab.f35085J = false;
                        i = -1000;
                    } catch (IOException e6) {
                        nab.f35075a.mo25417e("Encrypted kv restore failed", e6, new Object[0]);
                        nab.f35117x.mo19838b(30, 4);
                        nab.f35085J = false;
                        nab.f35098e = null;
                        i = -1000;
                    } catch (lwh e7) {
                        nab.f35075a.mo25417e("Encrypted kv restore failed", e7, new Object[0]);
                        nab.f35117x.mo19838b(29, 4);
                        nab.f35085J = false;
                        mab.m24748a(nab.f35110q, e7, cclp.m130476f());
                        nab.f35098e = null;
                        i = -1000;
                    } catch (Throwable th4) {
                        file.delete();
                        throw th4;
                    }
                }
            }
        }
        return Integer.valueOf(i);
    }
}
