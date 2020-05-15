package p000;

import android.util.Log;
import com.google.android.gms.clearcut.LogEventParcelable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: rai */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rai {

    /* renamed from: a */
    private boolean f42528a = cddp.m132711c();

    /* renamed from: b */
    private long f42529b = cddp.m132710b();

    /* renamed from: c */
    private ral f42530c = null;

    /* renamed from: d */
    private boolean f42531d = false;

    /* renamed from: e */
    private int f42532e = 2;

    /* renamed from: f */
    private qxy f42533f = null;

    /* renamed from: a */
    private static cafu m33150a(rah rah) {
        bxvd da = cafu.f172965X.mo74144da();
        da.getClass();
        m33155a(new qzz(da), rah.mo24405a(rag.EVENTS_CREATED));
        da.getClass();
        m33155a(new raa(da), rah.mo24405a(rag.EVENTS_LOGGED));
        da.getClass();
        m33155a(new rab(da), rah.mo24405a(rag.EVENTS_CLIENT_EXECUTED));
        da.getClass();
        m33155a(new rac(da), rah.mo24405a(rag.EVENTS_MODIFIED));
        da.getClass();
        m33155a(new qyd(da), rah.mo24405a(rag.EVENTS_CLIENT_SAMPLED));
        da.getClass();
        m33155a(new qye(da), rah.mo24405a(rag.EVENTS_CLIENT_SERIALIZED));
        da.getClass();
        m33155a(new qyf(da), rah.mo24405a(rag.EVENTS_CLIENT_SENT));
        da.getClass();
        m33155a(new qyg(da), rah.mo24405a(rag.DROPS_BY_MODIFIER_EXCEPTION));
        da.getClass();
        m33155a(new qyh(da), rah.mo24405a(rag.DROPS_BY_MODIFIER));
        da.getClass();
        m33155a(new qyi(da), rah.mo24405a(rag.DROPS_BY_CLIENT_SAMPLING));
        da.getClass();
        m33155a(new qyj(da), rah.mo24405a(rag.DROPS_BY_CLIENT_SERIALIZATION_EXCEPTION));
        da.getClass();
        m33155a(new qyk(da), rah.mo24405a(rag.EVENTS_SERVICE_RECEIVED));
        da.getClass();
        m33155a(new qyl(da), rah.mo24405a(rag.EVENTS_SERVICE_EXECUTED));
        da.getClass();
        m33155a(new qym(da), rah.mo24405a(rag.EVENTS_AFTER_SIDEWINDER));
        da.getClass();
        m33155a(new qyo(da), rah.mo24405a(rag.EVENTS_SERVICE_SAMPLED));
        da.getClass();
        m33155a(new qyp(da), rah.mo24405a(rag.EVENTS_SERVICE_SERIALIZED));
        da.getClass();
        m33155a(new qyq(da), rah.mo24405a(rag.EVENTS_WRITTEN));
        da.getClass();
        m33155a(new qyr(da), rah.mo24405a(rag.EVENTS_SERVICE_LOGGED));
        da.getClass();
        m33155a(new qys(da), rah.mo24405a(rag.DROPS_BY_SIDEWINDER));
        da.getClass();
        m33155a(new qyt(da), rah.mo24405a(rag.DROPS_BY_SERVICE_SAMPLING));
        da.getClass();
        m33155a(new qyu(da), rah.mo24405a(rag.DROPS_BY_QOS_TIER_OVERRIDE));
        da.getClass();
        m33155a(new qyv(da), rah.mo24405a(rag.DROPS_BY_LOG_CAP));
        da.getClass();
        m33155a(new qyw(da), rah.mo24405a(rag.DROPS_BY_OVERFLOW));
        da.getClass();
        m33155a(new qyx(da), rah.mo24405a(rag.DROPS_BY_STORAGE_SIZE_EXCEPTION));
        da.getClass();
        m33155a(new qyz(da), rah.mo24405a(rag.DROPS_BY_EVENT_SIZE));
        da.getClass();
        m33155a(new qza(da), rah.mo24405a(rag.DROPS_BY_WRITE_FAILURE));
        da.getClass();
        m33155a(new qzb(da), rah.mo24405a(rag.DROPS_BY_WRITE_EXCEPTION));
        da.getClass();
        m33155a(new qzc(da), rah.mo24405a(rag.WRITE_EXCEPTIONS));
        da.getClass();
        m33155a(new qzd(da), rah.mo24405a(rag.EVENTS_UPLOADED));
        da.getClass();
        m33155a(new qze(da), rah.mo24405a(rag.DROPS_BY_BAD_REQUEST));
        da.getClass();
        m33155a(new qzf(da), rah.mo24405a(rag.DROPS_BY_PARTIAL_FAILURE_WITHOUT_STATUS));
        da.getClass();
        m33155a(new qzg(da), rah.mo24405a(rag.DROPS_BY_OVERSIZE));
        da.getClass();
        m33155a(new qzh(da), rah.mo24405a(rag.DROPS_BY_PLC_HASH_COLLISION));
        da.getClass();
        m33155a(new qzi(da), rah.mo24405a(rag.DROPS_BY_PLC_TO_BYTES_FAIL));
        da.getClass();
        m33155a(new qzk(da), rah.mo24405a(rag.DROPS_BY_LOG_FILE_TOO_OLD));
        da.getClass();
        m33155a(new qzl(da), rah.mo24405a(rag.DROPS_BY_CORRUPTED_PLC_FILE));
        da.getClass();
        m33155a(new qzm(da), rah.mo24405a(rag.DROPS_BY_FAIL_TO_DELETE_PLC_DIR));
        da.getClass();
        m33155a(new qzn(da), rah.mo24405a(rag.DROPS_BY_DIR_HAS_NO_PLC_FILE));
        da.getClass();
        m33155a(new qzo(da), rah.mo24405a(rag.DROPS_BY_CORRUPTED_LOG_FILE_NAME));
        da.getClass();
        m33155a(new qzp(da), rah.mo24405a(rag.DROPS_BY_CORRUPTED_LOG_FILE_CONTENTS));
        da.getClass();
        m33155a(new qzq(da), rah.mo24405a(rag.DROPS_BY_FAIL_TO_READ_PLC_FILE));
        da.getClass();
        m33155a(new qzr(da), rah.mo24405a(rag.DROPS_BY_FAIL_TO_PARSE_PLC_DIR_NAME));
        da.getClass();
        m33155a(new qzs(da), rah.mo24405a(rag.DROPS_BY_PLC_HASH_MISMATCH));
        da.getClass();
        m33155a(new qzt(da), rah.mo24405a(rag.DROPS_BY_FAIL_TO_PARSE_PLC_PROTO));
        da.getClass();
        m33155a(new qzv(da), rah.mo24405a(rag.DROPS_BY_DIR_TRAVERSAL_ATTACK));
        da.getClass();
        m33155a(new qzw(da), rah.mo24405a(rag.DROPS_BY_RESTRICTION));
        da.getClass();
        m33155a(new qzx(da), rah.mo24405a(rag.EVENTS_SERVICE_DISPATCHED));
        return (cafu) da.mo74062i();
    }

    /* renamed from: b */
    private static cafq m33156b(int i) {
        bxvd da = cafq.f172942j.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cafq cafq = (cafq) da.f164949b;
        cafq.f172945b = i - 1;
        cafq.f172944a |= 1;
        return (cafq) da.mo74062i();
    }

    /* renamed from: f */
    private final synchronized boolean m33157f() {
        return this.f42529b != cddp.m132710b();
    }

    /* renamed from: g */
    private final synchronized caft m33158g() {
        bxvd da;
        da = caft.f172959e.mo74144da();
        da.getClass();
        m33155a(new qzj(da), this.f42530c.mo24414a(raj.INCREMENTS_DROPPED_BY_INVALID_SOURCE));
        da.getClass();
        m33155a(new qzu(da), this.f42530c.mo24414a(raj.INCREMENTS_DROPPED_BY_SOURCE_CAPACITY));
        da.getClass();
        m33155a(new qzy(da), this.f42530c.mo24414a(raj.INVALID_INCREMENTS));
        return (caft) da.mo74062i();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0210, code lost:
        return null;
     */
    /* renamed from: c */
    public final synchronized cafq mo24410c() {
        ram ram;
        int i = this.f42532e;
        if (i != 2 && this.f42531d) {
            if (i != 3) {
                try {
                    ral ral = this.f42530c;
                    int i2 = ral.f42554f;
                    if (i2 == 3) {
                        return m33156b(5);
                    } else if (i2 == 4) {
                        return m33156b(6);
                    } else if (ral.mo24418c()) {
                        bxvd da = cafq.f172942j.mo74144da();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        cafq cafq = (cafq) da.f164949b;
                        cafq.f172945b = 1;
                        cafq.f172944a |= 1;
                        ral ral2 = this.f42530c;
                        ral2.mo24421f();
                        qxy qxy = ral2.f42555g;
                        ByteBuffer allocate = ByteBuffer.allocate(16);
                        allocate.putLong(0, qxy.mo24401c(12));
                        allocate.putLong(8, qxy.mo24401c(20));
                        ByteString a = ByteString.m123261a(allocate.array());
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        cafq cafq2 = (cafq) da.f164949b;
                        a.getClass();
                        cafq2.f172944a |= 2;
                        cafq2.f172946c = a;
                        da.getClass();
                        m33155a(new qyc(da), this.f42530c.mo24419d());
                        ral ral3 = this.f42530c;
                        ral3.mo24421f();
                        long c = ral3.f42555g.mo24401c(32);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        cafq cafq3 = (cafq) da.f164949b;
                        cafq3.f172944a = 8 | cafq3.f172944a;
                        cafq3.f172948e = c;
                        ral ral4 = this.f42530c;
                        ral4.mo24421f();
                        long c2 = ral4.f42555g.mo24401c(40);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        cafq cafq4 = (cafq) da.f164949b;
                        cafq4.f172944a = 16 | cafq4.f172944a;
                        cafq4.f172949f = c2;
                        caft g = m33158g();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        cafq cafq5 = (cafq) da.f164949b;
                        g.getClass();
                        cafq5.f172950g = g;
                        cafq5.f172944a |= 32;
                        ral ral5 = this.f42530c;
                        ral5.getClass();
                        cafu a2 = m33150a(new qyn(ral5));
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        cafq cafq6 = (cafq) da.f164949b;
                        a2.getClass();
                        cafq6.f172951h = a2;
                        cafq6.f172944a |= 64;
                        ral ral6 = this.f42530c;
                        ran ran = rak.m33169b(ral6.mo24421f()) ? ral6.f42553e : ral6.f42552d;
                        if (ran.mo24422a() != 0) {
                            ram = new ram(ran);
                        } else {
                            ram = null;
                        }
                        while (ram != null) {
                            bxvd da2 = cafr.f172953d.mo74144da();
                            String str = ram.f42562c;
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            cafr cafr = (cafr) da2.f164949b;
                            str.getClass();
                            cafr.f172955a |= 1;
                            cafr.f172956b = str;
                            ram.getClass();
                            cafu a3 = m33150a(new qyy(ram));
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            cafr cafr2 = (cafr) da2.f164949b;
                            a3.getClass();
                            cafr2.f172957c = a3;
                            cafr2.f172955a |= 2;
                            cafr cafr3 = (cafr) da2.mo74062i();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            cafq cafq7 = (cafq) da.f164949b;
                            cafr3.getClass();
                            if (!cafq7.f172952i.mo73666a()) {
                                cafq7.f172952i = GeneratedMessageLite.m124021a(cafq7.f172952i);
                            }
                            cafq7.f172952i.add(cafr3);
                            int i3 = ram.f42560a + 1;
                            ram.f42560a = i3;
                            if (i3 < ram.f42564e.mo24422a()) {
                                int i4 = ram.f42563d;
                                ran ran2 = ram.f42564e;
                                int i5 = i4 + ran2.f42568d;
                                ram.f42561b = i5;
                                ram.f42562c = ran2.mo24423a(i5);
                                ram.f42563d = qxx.m33078a(ram.f42561b + ram.f42562c.length() + 1);
                            } else {
                                ram = null;
                            }
                        }
                        return (cafq) da.mo74062i();
                    } else {
                        throw new AssertionError("store has no snapshot");
                    }
                } catch (IOException e) {
                    return m33156b(5);
                } catch (qyb e2) {
                    return m33156b(6);
                } catch (IllegalStateException e3) {
                    return m33156b(3);
                }
            } else {
                return m33156b(4);
            }
        }
    }

    /* renamed from: d */
    public final synchronized void mo24411d() {
        this.f42531d = false;
        if (this.f42532e == 1) {
            this.f42530c.mo24417b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0025, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0074, code lost:
        return;
     */
    /* renamed from: e */
    public final synchronized void mo24412e() {
        if (cddp.m132711c()) {
            int i = this.f42532e;
            if (i == 2) {
                m33151a(2);
            } else if (i == 3) {
                m33151a(1);
            } else if (this.f42530c.f42554f != 1) {
                m33151a(1);
            } else if (m33157f()) {
                m33151a(1);
            }
        } else if (this.f42532e != 2) {
            try {
                qxy qxy = this.f42533f;
                qxz.m33087a(qxy, 0, qxy.mo24396a());
            } catch (IOException e) {
                Log.e("Funnel", "Failed to clear the buffer.");
            }
            if (!new File(new File(rpr.m34216b().getFilesDir(), "clearcut"), "funnel").delete()) {
                Log.e("Funnel", "Failed to delete the buffer file.");
            }
            this.f42532e = 2;
            this.f42533f = null;
            this.f42530c = null;
        }
    }

    /* renamed from: b */
    public final synchronized void mo24408b() {
        this.f42531d = true;
        if (this.f42532e == 1) {
            try {
                if (this.f42530c.mo24418c() && ((long) this.f42530c.mo24419d()) >= cddp.f180539a.mo6606a().mo77300d()) {
                    Log.w("Funnel", "Exceeded max retries, clearing snapshot.");
                    this.f42530c.mo24417b();
                }
                this.f42530c.mo24415a();
            } catch (IOException | qyb e) {
                Log.w("Funnel", "Exception while snapshotting.", e);
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo24409b(String str, rag rag, int i) {
        boolean z;
        int i2;
        int i3;
        int i4;
        ran ran;
        ram ram;
        int i5;
        int i6;
        String str2 = str;
        rag rag2 = rag;
        int i7 = i;
        synchronized (this) {
            if (this.f42532e == 1) {
                ral ral = this.f42530c;
                if (rag2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                sdo.m34974b(z);
                if (ral.f42554f == 1) {
                    if (i7 > 0) {
                        try {
                            boolean b = rak.m33169b(ral.mo24420e());
                            if (!b) {
                                i3 = ral.f42551c;
                            } else {
                                i3 = ral.f42550b;
                            }
                            qxz.m33088b(ral.f42555g, i3 + rag2.f42527ad, i7);
                            if (rao.m33182a(str)) {
                                if (!b) {
                                    ran = ral.f42553e;
                                } else {
                                    ran = ral.f42552d;
                                }
                                sdo.m34974b(rao.m33182a(str));
                                int a = ran.mo24422a();
                                int i8 = ran.f42566b;
                                int i9 = 0;
                                loop0:
                                while (true) {
                                    if (i9 < a) {
                                        int b2 = ran.mo24424b(i8);
                                        int i10 = i8 + 1;
                                        int a2 = qxx.m33078a(i10 + b2);
                                        if (b2 == str.length()) {
                                            int i11 = 0;
                                            while (i11 < b2) {
                                                i6 = a;
                                                if (str2.charAt(i11) == ((char) ran.f42569e.mo24395a(i10 + i11))) {
                                                    i11++;
                                                    a = i6;
                                                }
                                            }
                                            ram = new ram(ran, i9, i8, a2, str);
                                            break loop0;
                                        }
                                        i6 = a;
                                        i8 = a2 + ran.f42568d;
                                        i9++;
                                        a = i6;
                                    } else {
                                        sdo.m34974b(true);
                                        sdo.m34974b(i8 >= 0);
                                        sdo.m34974b(str2 != null);
                                        int i12 = i8 + 1;
                                        int a3 = qxx.m33078a(str.length() + i12);
                                        if (ran.f42568d + a3 <= ran.f42567c) {
                                            ran.f42569e.mo24397a(i8, (byte) str.length());
                                            int i13 = i12;
                                            int i14 = 0;
                                            while (i14 < str.length()) {
                                                ran.f42569e.mo24397a(i13, (byte) str2.charAt(i14));
                                                i14++;
                                                i13++;
                                            }
                                            qxz.m33087a(ran.f42569e, a3, ran.f42568d);
                                            qxz.m33088b(ran.f42569e, ran.f42565a, 1);
                                            ram = new ram(ran, i9, i8, a3, str);
                                        } else {
                                            ram = null;
                                        }
                                    }
                                }
                                if (ram != null) {
                                    qxz.m33088b(ram.f42564e.f42569e, ram.f42563d + rag2.f42527ad, i7);
                                    return;
                                }
                                if (!b) {
                                    i5 = ral.f42547a;
                                } else {
                                    i5 = 80;
                                }
                                qxz.m33088b(ral.f42555g, i5 + raj.INCREMENTS_DROPPED_BY_SOURCE_CAPACITY.f42546l, i7);
                                return;
                            }
                            if (!b) {
                                i4 = ral.f42547a;
                            } else {
                                i4 = 80;
                            }
                            qxz.m33088b(ral.f42555g, i4 + raj.INCREMENTS_DROPPED_BY_INVALID_SOURCE.f42546l, i7);
                        } catch (IOException e) {
                            ral.f42554f = 3;
                        } catch (qyb e2) {
                            ral.f42554f = 4;
                        }
                    } else {
                        raj raj = raj.INVALID_INCREMENTS;
                        if (!rak.m33169b(ral.mo24420e())) {
                            i2 = ral.f42547a;
                        } else {
                            i2 = 80;
                        }
                        qxz.m33088b(ral.f42555g, i2 + raj.f42546l, 1);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        return;
     */
    /* renamed from: a */
    private final synchronized void m33151a(int i) {
        FileChannel channel;
        if (i == 2) {
            if (!cddp.m132711c()) {
                return;
            }
            if (this.f42532e == 1) {
                return;
            }
        }
        this.f42532e = 2;
        this.f42533f = null;
        this.f42530c = null;
        this.f42528a = cddp.m132711c();
        this.f42529b = cddp.m132710b();
        this.f42531d = false;
        if (this.f42528a) {
            File file = new File(rpr.m34216b().getFilesDir(), "clearcut");
            if (!file.exists()) {
                if (!file.mkdir()) {
                    Log.e("Funnel", "Failed find or create clearcut directory.");
                    this.f42532e = 3;
                }
            }
            File file2 = new File(file, "funnel");
            try {
                int i2 = (int) this.f42529b;
                if (file2.exists() && file2.length() != ((long) i2)) {
                    if (!file2.delete()) {
                        throw new IOException("failed to delete existing file");
                    }
                }
                RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                try {
                    channel = randomAccessFile.getChannel();
                    if (randomAccessFile.length() != 0) {
                        if (randomAccessFile.length() != ((long) i2)) {
                            throw new IOException("unexpected file size");
                        }
                    }
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_WRITE, 0, (long) i2);
                    if (channel != null) {
                        channel.close();
                    }
                    randomAccessFile.close();
                    qxy qxy = new qxy(map);
                    this.f42533f = qxy;
                    if (i == 1) {
                        qxz.m33087a(qxy, 0, qxy.mo24396a());
                    }
                    ral ral = new ral(raf.RESERVED_8, rag.RESERVED_8, this.f42533f);
                    this.f42530c = ral;
                    if (ral.f42554f != 1) {
                        Log.e("Funnel", "Failed to initialize funnel store.");
                        this.f42532e = 3;
                        this.f42533f = null;
                        this.f42530c = null;
                        return;
                    }
                    this.f42532e = 1;
                    try {
                        this.f42531d = ral.mo24418c();
                        return;
                    } catch (IOException | qyb e) {
                        Log.e("Funnel", "failed to get snapshotted state during initialization", e);
                        this.f42531d = true;
                        return;
                    }
                } catch (Throwable th) {
                    randomAccessFile.close();
                    throw th;
                }
            } catch (IOException e2) {
                Log.e("Funnel", "Failed find or create funnel file.");
                this.f42532e = 3;
                this.f42533f = null;
                return;
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
            }
        }
        throw th;
    }

    /* renamed from: a */
    public static void m33152a(LogEventParcelable logEventParcelable, rag rag) {
        if (cddp.m132711c()) {
            rae.f42460a.mo24409b(rer.m33481a(logEventParcelable.f30030a), rag, 1);
        }
    }

    /* renamed from: a */
    public static void m33153a(String str, rag rag) {
        if (cddp.m132711c()) {
            rae.f42460a.mo24409b(str, rag, 1);
        }
    }

    /* renamed from: a */
    public static void m33154a(String str, rag rag, int i) {
        if (cddp.m132711c()) {
            rae.f42460a.mo24409b(str, rag, i);
        }
    }

    /* renamed from: a */
    private static void m33155a(rad rad, int i) {
        if (i != 0) {
            rad.mo24404a(i);
        }
    }

    /* renamed from: a */
    public final synchronized void mo24406a() {
        m33151a(2);
    }

    /* renamed from: a */
    public final synchronized boolean mo24407a(String str) {
        return this.f42532e == 1 ? this.f42530c.mo24416a(str) : false;
    }
}
