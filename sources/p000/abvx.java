package p000;

import android.content.Context;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.CRC32;

/* renamed from: abvx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abvx implements abvy {

    /* renamed from: a */
    public final abvw f58584a;

    /* renamed from: b */
    public final aeat f58585b;

    /* renamed from: c */
    private final Context f58586c;

    /* renamed from: d */
    private final abqv f58587d;

    /* renamed from: e */
    private final acpl f58588e;

    /* renamed from: f */
    private final abze f58589f;

    /* renamed from: g */
    private final abyx f58590g;

    /* renamed from: h */
    private final NativeIndex f58591h;

    /* renamed from: i */
    private final abym f58592i;

    /* renamed from: j */
    private final abyh f58593j;

    /* renamed from: k */
    private final AtomicBoolean f58594k = new AtomicBoolean(false);

    public abvx(Context context, abqv abqv, acpl acpl, abvw abvw, abze abze, abyx abyx, NativeIndex nativeIndex, abym abym, abyh abyh) {
        this.f58586c = context;
        this.f58587d = abqv;
        this.f58588e = acpl;
        this.f58584a = abvw;
        this.f58589f = abze;
        this.f58590g = abyx;
        this.f58591h = nativeIndex;
        this.f58592i = abym;
        this.f58593j = abyh;
        this.f58585b = aeat.m51532a(context);
    }

    /* renamed from: a */
    public final void mo32373a() {
        try {
            abvw abvw = this.f58584a;
            if (abvw.f58581i != null) {
                synchronized (abvw.f58579g) {
                    if (abvw.f58581i != null) {
                        Iterator it = abvw.mo32369a().iterator();
                        boolean z = false;
                        while (it.hasNext()) {
                            String str = (String) it.next();
                            if (str.compareTo(abvw.f58581i) > 0) {
                                break;
                            }
                            File file = new File(abvw.f58573a, str);
                            if (!file.delete()) {
                                absg.m48206e("Failed to delete file %s", file);
                                abvw.mo32370a(bqba.SHARD_DELETE_FAILED);
                                z = true;
                            }
                        }
                        abvw.f58581i = null;
                        if (z) {
                            throw new IOException("failed to delete some shards");
                        }
                    }
                }
            }
        } catch (IOException e) {
            absg.m48189a(e, "Failed to prune from request queue");
        }
    }

    /* renamed from: b */
    public final void mo32375b() {
        this.f58588e.mo32995d(new acag(this.f58586c, this, this.f58587d, this.f58589f, this.f58590g, this.f58592i, this.f58593j, this.f58591h, this.f58594k));
    }

    /* renamed from: a */
    public final void mo32374a(abqq abqq) {
        boolean z;
        abvw abvw = this.f58584a;
        byte[] k = abqq.serializeToBytes();
        CRC32 crc32 = new CRC32();
        crc32.update(k);
        long value = crc32.getValue();
        synchronized (abvw.f58576d) {
            if (abvw.f58578f == null) {
                String format = String.format(Locale.ROOT, "%016x", Long.valueOf(abvw.f58577e));
                abvw.f58577e++;
                abvw.f58582j = format;
                abvw.f58578f = new abvv(new File(abvw.f58573a, format));
                abvw.f58578f.f58571b.mo73858e(1);
            }
            abvw.f58578f.f58571b.mo73854c(value);
            abvw.f58578f.f58571b.mo73867c(k);
            abvw.f58578f.f58571b.mo73851c();
            abvw.f58578f.f58570a.flush();
            abvv abvv = abvw.f58578f;
            int i = abvv.f58572c + 1;
            abvv.f58572c = i;
            if (((long) i) >= abvw.f58575c.f58565a) {
                abvv.close();
                abvw.f58578f = null;
                abvw.f58582j = null;
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            synchronized (abvw.f58583k) {
                bxvd bxvd = abvw.f58583k;
                int i2 = ((bpys) bxvd.f164949b).f139929c + 1;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bpys bpys = (bpys) bxvd.f164949b;
                bpys bpys2 = bpys.f139925f;
                bpys.f139927a |= 1;
                bpys.f139929c = i2;
            }
        }
        if (this.f58594k.compareAndSet(false, true)) {
            bpws a = acxi.m49935a(this.f58586c);
            bxvd bxvd2 = (bxvd) a.mo74142c(5);
            bxvd2.mo73625a((GeneratedMessageLite) a);
            if (((bpws) bxvd2.f164949b).f139566g) {
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                bpws bpws = (bpws) bxvd2.f164949b;
                bpws bpws2 = bpws.f139558h;
                bpws.f139561b = bpzc.m112420a(9);
                bpws.f139560a |= 1;
                this.f58592i.mo32440a((bpws) bxvd2.mo74062i());
            }
            if (!cemw.f183016a.mo6606a().mo79379i()) {
                aeat aeat = this.f58585b;
                aebi aebi = new aebi();
                aebi.f63097i = "com.google.android.gms.icing.service.IcingGcmTaskService";
                aebi.f63099k = "drain-request-queue";
                aebi.mo34027b(0);
                aebi.mo34004a(cemz.f183035a.mo6606a().mo79393e(), cemz.f183035a.mo6606a().mo79392d());
                aebi.mo34026a(false);
                aebi.mo34024a(0, cdny.m134338c() ? 1 : 0);
                aebi.mo34023a(2);
                aeat.mo33984a(aebi.mo33974b());
                return;
            }
            mo32375b();
        }
    }
}
