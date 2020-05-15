package p000;

import android.util.SparseIntArray;
import java.io.File;
import java.io.RandomAccessFile;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.GCMParameterSpec;

/* renamed from: ncb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ncb {

    /* renamed from: a */
    private static final lvn f35224a = new lvn("BackupFileDecryptorTask");

    /* renamed from: b */
    private final SecretKey f35225b;

    /* renamed from: c */
    private final Cipher f35226c;

    /* renamed from: d */
    private final mbx f35227d;

    public ncb(SecretKey secretKey, mbx mbx) {
        try {
            this.f35226c = Cipher.getInstance("AES/GCM/NoPadding");
            this.f35225b = secretKey;
            this.f35227d = mbx;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new lwh("AES/GCM/NoPadding not supported", e);
        }
    }

    /* renamed from: a */
    private final int m25907a(byte[] bArr, int i, byte[] bArr2, long j) {
        try {
            this.f35226c.init(2, this.f35225b, new GCMParameterSpec(128, bArr, 0, 12));
            try {
                return this.f35226c.doFinal(bArr, 12, i - 12, bArr2);
            } catch (BadPaddingException | IllegalBlockSizeException | ShortBufferException e) {
                this.f35227d.mo19838b(18, 4);
                throw new nbf(String.format(Locale.US, "Unable to finalize Cipher for chunk at %d of %d bytes length", Long.valueOf(j), Integer.valueOf(i)), e);
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException e2) {
            this.f35227d.mo19838b(17, 4);
            throw new nbf(String.format(Locale.US, "Unable to initialize Cipher for chunk at %d of %d bytes length", Long.valueOf(j), Integer.valueOf(i)), e2);
        }
    }

    /* renamed from: a */
    private final mcq m25908a(mct mct) {
        int a = mcn.m24879a(mct.f33451e);
        int i = 1;
        if (a != 0 && a == 2) {
            int a2 = mcv.m24887a(mct.f33448b);
            if (a2 != 0 && a2 == 2) {
                try {
                    this.f35226c.init(2, this.f35225b, new GCMParameterSpec(128, mct.f33450d.mo73780k(), 0, 12));
                    try {
                        byte[] doFinal = this.f35226c.doFinal(mct.f33450d.mo73780k(), 12, mct.f33450d.mo73744a() - 12);
                        bxvd da = mcq.f33439d.mo74144da();
                        da.mo73635b(doFinal, bxus.m123744c());
                        return (mcq) da.mo74062i();
                    } catch (BadPaddingException | IllegalBlockSizeException e) {
                        this.f35227d.mo19838b(20, 4);
                        throw new nbf("Error finalizing decrypt Cipher on ChunkOrdering", e);
                    }
                } catch (InvalidAlgorithmParameterException | InvalidKeyException e2) {
                    this.f35227d.mo19838b(19, 4);
                    throw new nbf("Could not initialize Cipher to decrypt ChunkOrdering", e2);
                }
            } else {
                this.f35227d.mo19838b(22, 4);
                int a3 = mcv.m24887a(mct.f33448b);
                if (a3 != 0) {
                    i = a3;
                }
                String valueOf = String.valueOf(Integer.toString(i - 1));
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 87);
                sb.append("Unrecognized cipher type for backup (this version of backup only supports AES-256-GCM: ");
                sb.append(valueOf);
                throw new ncv(sb.toString());
            }
        } else {
            this.f35227d.mo19838b(21, 4);
            int a4 = mcn.m24879a(mct.f33451e);
            if (a4 != 0) {
                i = a4;
            }
            String valueOf2 = String.valueOf(Integer.toString(i - 1));
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 86);
            sb2.append("Unrecognized checksum type for backup (this version of backup only supports SHA-256): ");
            sb2.append(valueOf2);
            throw new ncv(sb2.toString());
        }
    }

    /* renamed from: a */
    private final void m25909a(ncf ncf, byte[] bArr, int i) {
        try {
            ncf.mo20426a(bArr, i);
        } catch (InvalidKeyException e) {
            this.f35227d.mo19838b(16, 4);
            throw new nbf("Unable to output chunk", e);
        }
    }

    /* renamed from: a */
    public final void mo20448a(File file, ncf ncf) {
        Throwable th;
        int a;
        Throwable th2;
        ncf ncf2 = ncf;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        randomAccessFile.seek(randomAccessFile.length() - 8);
        long readLong = randomAccessFile.readLong();
        long length = randomAccessFile.length();
        int i = 1;
        if (readLong >= length || readLong < 0) {
            this.f35227d.mo19838b(23, 4);
            throw new ncr(String.format(Locale.US, "%d is not valid position for chunks metadata in file of %d bytes", Long.valueOf(readLong), Long.valueOf(length)));
        }
        randomAccessFile.seek(readLong);
        byte[] bArr = new byte[((int) ((randomAccessFile.length() - 8) - readLong))];
        randomAccessFile.readFully(bArr);
        try {
            mct mct = (mct) bxvk.m124016a(mct.f33445f, bArr, bxus.m123744c());
            mcq a2 = m25908a(mct);
            int a3 = mcs.m24884a(mct.f33449c);
            if (a3 == 0 || a3 == 1 || ((a = mcs.m24884a(mct.f33449c)) != 0 && a == 2)) {
                f35224a.mo25412b("Using explicit starts", new Object[0]);
                int[] a4 = bqcn.m112584a(a2.f33442b);
                int[] copyOf = Arrays.copyOf(a4, a4.length + 1);
                copyOf[copyOf.length - 1] = (int) readLong;
                Arrays.sort(copyOf);
                SparseIntArray sparseIntArray = new SparseIntArray();
                int i2 = 0;
                while (i2 < copyOf.length - 1) {
                    int i3 = copyOf[i2];
                    i2++;
                    sparseIntArray.put(i3, copyOf[i2] - i3);
                }
                int i4 = 0;
                for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                    i4 = Math.max(i4, sparseIntArray.valueAt(i5));
                }
                byte[] bArr2 = new byte[i4];
                byte[] bArr3 = new byte[Math.max(0, i4 - 28)];
                ncf.mo20428b();
                try {
                    for (Integer num : a2.f33442b) {
                        int intValue = num.intValue();
                        int i6 = sparseIntArray.get(intValue);
                        long j = (long) intValue;
                        randomAccessFile.seek(j);
                        randomAccessFile.readFully(bArr2, 0, i6);
                        m25909a(ncf2, bArr3, m25907a(bArr2, i6, bArr3, j));
                    }
                    if (ncf2 != null) {
                        ncf.close();
                    }
                } catch (Throwable th3) {
                    bqye.m113761a(th, th3);
                }
            } else {
                int a5 = mcs.m24884a(mct.f33449c);
                if (a5 != 0 && a5 == 3) {
                    f35224a.mo25412b("Using inline lengths", new Object[0]);
                    randomAccessFile.seek(0);
                    ncf.mo20428b();
                    while (randomAccessFile.getFilePointer() < readLong) {
                        try {
                            long filePointer = randomAccessFile.getFilePointer();
                            int readInt = randomAccessFile.readInt();
                            if (readInt <= 0) {
                                this.f35227d.mo19838b(32, 4);
                                StringBuilder sb = new StringBuilder(47);
                                sb.append("Encrypted chunk length not positive:");
                                sb.append(readInt);
                                throw new ncr(sb.toString());
                            } else if (((long) readInt) + filePointer <= readLong) {
                                byte[] bArr4 = new byte[readInt];
                                byte[] bArr5 = new byte[(readInt - 28)];
                                randomAccessFile.readFully(bArr4);
                                m25909a(ncf2, bArr5, m25907a(bArr4, readInt, bArr5, filePointer));
                            } else {
                                this.f35227d.mo19838b(33, 4);
                                throw new ncr(String.format(Locale.US, "Encrypted chunk longer (%d) than file (%d)", Integer.valueOf(readInt), Long.valueOf(readLong)));
                            }
                        } catch (Throwable th4) {
                            bqye.m113761a(th2, th4);
                        }
                    }
                    if (ncf2 != null) {
                        ncf.close();
                    }
                } else {
                    this.f35227d.mo19838b(31, 4);
                    int a6 = mcs.m24884a(mct.f33449c);
                    if (a6 != 0) {
                        i = a6;
                    }
                    String valueOf = String.valueOf(Integer.toString(i - 1));
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                    sb2.append("Unknown chunk ordering type:");
                    sb2.append(valueOf);
                    throw new ncv(sb2.toString());
                }
            }
            if (!Arrays.equals(ncf.mo20427a(), a2.f33443c.mo73780k())) {
                this.f35227d.mo19838b(15, 4);
                throw new ncs("Checksums did not match");
            }
            return;
        } catch (bxwf e) {
            this.f35227d.mo19838b(24, 4);
            throw new ncr(String.format(Locale.US, "Could not read chunks metadata at position %d of file of %d bytes", Long.valueOf(readLong), Long.valueOf(length)));
        }
        throw th2;
        throw th;
    }
}
