package p000;

import android.os.SystemClock;
import android.util.Log;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: bhux */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhux implements bhup {

    /* renamed from: a */
    public static final Long f119662a = Long.valueOf(((f119663j.longValue() + f119664k.longValue()) + f119665l.longValue()) + f119664k.longValue());

    /* renamed from: j */
    private static final Long f119663j = 1L;

    /* renamed from: k */
    private static final Long f119664k = 8L;

    /* renamed from: l */
    private static final Long f119665l = 4L;

    /* renamed from: b */
    public int f119666b;

    /* renamed from: c */
    public long f119667c = -1;

    /* renamed from: d */
    public bhun f119668d;

    /* renamed from: e */
    public final bhuk f119669e;

    /* renamed from: f */
    public final Executor f119670f;

    /* renamed from: g */
    public final File f119671g;

    /* renamed from: h */
    public final bicy f119672h;

    /* renamed from: i */
    public final bhuy f119673i;

    /* renamed from: m */
    private final bhqw f119674m;

    public bhux(bicy bicy, bhqw bhqw, bhuy bhuy, bhuk bhuk, Executor executor, File file) {
        this.f119672h = bicy;
        this.f119674m = bhqw;
        this.f119673i = bhuy;
        this.f119669e = bhuk;
        this.f119670f = executor;
        this.f119671g = new File(file, "simple_tensorflow_model_weights");
        this.f119666b = -1;
        this.f119668d = null;
    }

    /* renamed from: a */
    public static Long m101575a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            return Long.valueOf(ByteBuffer.wrap(instance.digest()).getLong());
        } catch (NoSuchAlgorithmException e) {
            bhuj.m101555a().mo64360b("Will never happen.");
            return 0L;
        }
    }

    /* renamed from: a */
    public final void mo64333a(bhun bhun) {
        if (bhun != null) {
            this.f119668d = bhun;
        }
    }

    /* renamed from: b */
    public final void mo64145b() {
        this.f119666b = -1;
        this.f119668d = null;
    }

    /* renamed from: c */
    public final void mo64147c() {
        if (this.f119666b != 0) {
            bhuj.m101555a();
        } else if (System.currentTimeMillis() > this.f119667c) {
            bhuj.m101555a();
            mo64338e();
        }
    }

    /* renamed from: d */
    public final bhun mo64149d() {
        return this.f119668d;
    }

    /* renamed from: e */
    public final void mo64338e() {
        int i;
        this.f119666b = 2;
        bhqw bhqw = this.f119674m;
        bhun bhun = this.f119668d;
        if (bhun != null) {
            i = bhun.f119646e;
        } else {
            i = 0;
        }
        bxvd da = bvmo.f156764e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvmo bvmo = (bvmo) da.f164949b;
        int i2 = bvmo.f156766a | 1;
        bvmo.f156766a = i2;
        bvmo.f156767b = i;
        int i3 = i2 | 8;
        bvmo.f156766a = i3;
        bvmo.f156769d = 6;
        bvmo.f156768c = 2;
        bvmo.f156766a = 2 | i3;
        bvmo[] bvmoArr = {(bvmo) da.mo74062i()};
        bhuw bhuw = new bhuw(this, SystemClock.elapsedRealtime());
        if (cggm.f186849a.mo6606a().mo83742u()) {
            if (!cghh.m145424e()) {
                bhqw.f119358c.mo64490a(new biav(bhqw.f119356a, bvmoArr), new bhqu(bhuw));
            } else {
                bhqw.f119358c.mo64490a(new biby(bhqw.f119357b, bvmoArr), new bhqv(bhuw));
            }
        } else if (Log.isLoggable("Places", 5)) {
            bioi.m102662c("Places", "Disabled getInferenceModelWeights - no RPC");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bhuy.a(int, java.lang.Boolean):bhul
     arg types: [int, int]
     candidates:
      bhuy.a(bxsz[], int):bhun
      bhuy.a(int, java.lang.Boolean):bhul */
    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo64336b(bhuv bhuv) {
        ByteBuffer a = mo64332a(this.f119671g.getPath(), this.f119671g.length(), true);
        if (a == null || ((long) a.remaining()) < f119662a.longValue() || a.get() != 4) {
            bhuv.mo64328a(1);
            return;
        }
        long j = a.getLong();
        int i = a.getInt();
        Long valueOf = Long.valueOf(a.getLong());
        ByteBuffer slice = a.slice();
        byte[] bArr = new byte[i];
        slice.asReadOnlyBuffer().get(bArr, 0, i);
        if (valueOf.equals(m101575a(bArr))) {
            try {
                bhun bhun = new bhun(slice, bhuy.m101590a(bicy.m101985d(), (Boolean) true));
                brtm brtm = bhun.f119648g;
                if (brtm != null) {
                    if (brtm.mo69906O() != null && !bhun.f119642a.isEmpty()) {
                        bhuv.mo64329a(bhun);
                        m101576a(j);
                    }
                }
                bhuj.m101555a().mo64361c("Invalid model weights, returning null model weights container");
                bhun = null;
                bhuv.mo64329a(bhun);
                m101576a(j);
            } catch (IndexOutOfBoundsException e) {
                bhuj.m101555a().mo64360b("Flatbuffer Was corrupted while parsing.");
                bhuv.mo64328a(2);
            }
        } else {
            bhuj.m101555a().mo64360b("Flatbuffer Data is corrupted.");
            bhuv.mo64328a(1);
        }
    }

    /* renamed from: a */
    private final void m101576a(long j) {
        long currentTimeMillis = System.currentTimeMillis();
        this.f119667c = j;
        long millis = TimeUnit.SECONDS.toMillis(cggm.m145256b()) + currentTimeMillis;
        if (currentTimeMillis > j || millis < j) {
            mo64338e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo64337c(bhuv bhuv) {
        FileInputStream fileInputStream;
        DataInputStream dataInputStream = null;
        try {
            fileInputStream = new FileInputStream(this.f119671g);
            try {
                DataInputStream dataInputStream2 = new DataInputStream(fileInputStream);
                try {
                    if (dataInputStream2.readByte() == 3) {
                        long readLong = dataInputStream2.readLong();
                        int readInt = dataInputStream2.readInt();
                        ArrayList arrayList = new ArrayList(readInt);
                        int i = 0;
                        loop0:
                        while (true) {
                            if (i < readInt) {
                                int readInt2 = dataInputStream2.readInt();
                                byte[] bArr = new byte[readInt2];
                                int i2 = 0;
                                while (i2 < readInt2) {
                                    int read = dataInputStream2.read(bArr, i2, readInt2 - i2);
                                    if (read == -1) {
                                        bhuv.mo64328a(1);
                                        break loop0;
                                    }
                                    i2 += read;
                                }
                                arrayList.add(bArr);
                                i++;
                            } else if (arrayList.size() == 1) {
                                bvpf bvpf = (bvpf) ((bxvd) bvpf.f157278g.mo74144da().mo73633b((byte[]) arrayList.get(0))).mo74062i();
                                if (bvpf.f157284e == 6) {
                                    bhuv.mo64329a(bhuy.m101591a(new bvpf[]{bvpf}, bicy.m101985d()));
                                    m101576a(readLong);
                                } else {
                                    throw new IOException("Wrong graphVersion");
                                }
                            } else {
                                throw new IOException("Unexpected proto");
                            }
                        }
                    } else {
                        bhuv.mo64328a(1);
                    }
                    m101578a(dataInputStream2);
                } catch (IOException | StringIndexOutOfBoundsException e) {
                    dataInputStream = dataInputStream2;
                    try {
                        bhuv.mo64328a(1);
                        m101578a(dataInputStream);
                        m101578a(fileInputStream);
                    } catch (Throwable th) {
                        th = th;
                        m101578a(dataInputStream);
                        m101578a(fileInputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    dataInputStream = dataInputStream2;
                    m101578a(dataInputStream);
                    m101578a(fileInputStream);
                    throw th;
                }
            } catch (IOException | StringIndexOutOfBoundsException e2) {
                bhuv.mo64328a(1);
                m101578a(dataInputStream);
                m101578a(fileInputStream);
            } catch (Throwable th3) {
                th = th3;
                m101578a(dataInputStream);
                m101578a(fileInputStream);
                throw th;
            }
        } catch (IOException | StringIndexOutOfBoundsException e3) {
            fileInputStream = null;
            bhuv.mo64328a(1);
            m101578a(dataInputStream);
            m101578a(fileInputStream);
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
            m101578a(dataInputStream);
            m101578a(fileInputStream);
            throw th;
        }
        m101578a(fileInputStream);
    }

    /* renamed from: a */
    public static void m101578a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:27:0x003b=Splitter:B:27:0x003b, B:33:0x004f=Splitter:B:33:0x004f} */
    /* renamed from: a */
    public final ByteBuffer mo64332a(String str, long j, boolean z) {
        RandomAccessFile randomAccessFile;
        FileChannel fileChannel;
        FileChannel.MapMode mapMode;
        FileChannel fileChannel2 = null;
        try {
            randomAccessFile = new RandomAccessFile(str, !z ? "rw" : "r");
            try {
                fileChannel = randomAccessFile.getChannel();
                if (!z) {
                    try {
                        mapMode = FileChannel.MapMode.READ_WRITE;
                    } catch (FileNotFoundException e) {
                        this.f119669e.mo64320a(3, z, System.currentTimeMillis());
                        m101578a(fileChannel);
                        m101578a(randomAccessFile);
                        return null;
                    } catch (IOException e2) {
                        try {
                            this.f119669e.mo64320a(2, z, System.currentTimeMillis());
                            m101578a(fileChannel);
                            m101578a(randomAccessFile);
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            fileChannel2 = fileChannel;
                        }
                    }
                } else {
                    mapMode = FileChannel.MapMode.READ_ONLY;
                }
                MappedByteBuffer map = fileChannel.map(mapMode, 0, j);
                m101578a(fileChannel);
                m101578a(randomAccessFile);
                return map;
            } catch (FileNotFoundException e3) {
                fileChannel = null;
                this.f119669e.mo64320a(3, z, System.currentTimeMillis());
                m101578a(fileChannel);
                m101578a(randomAccessFile);
                return null;
            } catch (IOException e4) {
                fileChannel = null;
                this.f119669e.mo64320a(2, z, System.currentTimeMillis());
                m101578a(fileChannel);
                m101578a(randomAccessFile);
                return null;
            } catch (Throwable th2) {
                th = th2;
                m101578a(fileChannel2);
                m101578a(randomAccessFile);
                throw th;
            }
        } catch (FileNotFoundException e5) {
            fileChannel = null;
            randomAccessFile = null;
            this.f119669e.mo64320a(3, z, System.currentTimeMillis());
            m101578a(fileChannel);
            m101578a(randomAccessFile);
            return null;
        } catch (IOException e6) {
            fileChannel = null;
            randomAccessFile = null;
            this.f119669e.mo64320a(2, z, System.currentTimeMillis());
            m101578a(fileChannel);
            m101578a(randomAccessFile);
            return null;
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
            m101578a(fileChannel2);
            m101578a(randomAccessFile);
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo64142a() {
        this.f119666b = 0;
        if (!cgfo.m145040b()) {
            bhuv bhuv = new bhuv(this, -1);
            this.f119666b = 1;
            this.f119670f.execute(new bhus(this, bhuv));
            return;
        }
        mo64334a(new bhuv(this, -1));
    }

    /* renamed from: a */
    public final void mo64334a(bhuv bhuv) {
        this.f119666b = 1;
        this.f119670f.execute(new bhuu(this, bhuv));
    }

    /* renamed from: a */
    public final void mo64335a(bxsz[] bxszArr) {
        this.f119670f.execute(new bhut(this, bxszArr));
    }
}
