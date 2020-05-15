package p000;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbCorruptionException;
import com.google.android.gms.leveldb.LevelDbException;
import com.google.android.gms.leveldb.WriteBatch;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: aaoh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaoh {

    /* renamed from: b */
    private static LevelDb f28686b;

    /* renamed from: a */
    private SimpleDateFormat f28687a;

    /* renamed from: c */
    private final Context f28688c;

    /* renamed from: d */
    private final aaoi f28689d;

    public aaoh(Context context, aaoi aaoi) {
        this.f28688c = context;
        this.f28689d = aaoi;
    }

    /* renamed from: c */
    public static final void m21756c() {
        synchronized (aaoh.class) {
            if (f28686b != null) {
                f28686b.close();
                f28686b = null;
            }
        }
    }

    /* renamed from: a */
    public final long mo17174a(String str) {
        if (str == null) {
            return 0;
        }
        if (this.f28687a == null) {
            this.f28687a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        }
        try {
            return this.f28687a.parse(str).getTime();
        } catch (ParseException e) {
            Log.e("GCM", "Error while parsing device-time message date");
            return 0;
        }
    }

    /* renamed from: b */
    public final LevelDb mo17176b() {
        LevelDb levelDb;
        synchronized (aaoh.class) {
            if (f28686b == null) {
                File file = new File(this.f28688c.getApplicationContext().getFilesDir(), "gcm_cm.ldb");
                try {
                    f28686b = LevelDb.open(file);
                } catch (LevelDbCorruptionException e) {
                    Log.e("GCM", "Failed to open device-time msgs db: db is corrupted");
                    try {
                        LevelDb.destroy(file);
                    } catch (LevelDbException e2) {
                        Log.e("GCM", "Failed to delete device-time db", e2);
                    }
                } catch (LevelDbException e3) {
                    Log.e("GCM", "Failed to open device-time msgs db", e3);
                } catch (UnsatisfiedLinkError e4) {
                    Log.e("GCM", "Failed to open device-time msgs db: unable to use native methods");
                }
            }
            levelDb = f28686b;
        }
        return levelDb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0187, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo17175a() {
        long j;
        byte[] key;
        aaog aaog;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        synchronized (aaoh.class) {
            LevelDb b = mo17176b();
            if (b != null) {
                LevelDb.Iterator it = b.iterator();
                try {
                    it.seekToFirst();
                    while (it.isValid()) {
                        key = it.key();
                        String[] split = new String(key, "UTF-8").split("@");
                        int length = split.length;
                        aaog = new aaog(key, mo17174a(split[0]), mo17174a(split[1]));
                        if (aaog.f28683a > 0) {
                            long j2 = aaog.f28684b;
                            if (j2 > 0) {
                                if (j2 >= System.currentTimeMillis()) {
                                    if (aaog.f28683a > System.currentTimeMillis()) {
                                        j = aaog.f28683a;
                                        it.close();
                                        break;
                                    }
                                    arrayList2.add(aaog.f28685c);
                                } else {
                                    arrayList.add(aaog.f28685c);
                                }
                                it.next();
                            }
                        }
                        arrayList.add(aaog.f28685c);
                        it.next();
                    }
                    it.close();
                    j = 0;
                } catch (UnsupportedEncodingException e) {
                    aaog = new aaog(key, 0, 0);
                } catch (Throwable th) {
                    it.close();
                    throw th;
                }
            } else {
                j = 0;
            }
        }
        if (j != 0) {
            aaoi aaoi = this.f28689d;
            long currentTimeMillis = (j - System.currentTimeMillis()) / 1000;
            aebi aebi = new aebi();
            aebi.f63097i = "com.google.android.gms.gcm.gmsproc.cm.GcmReceiverService$MessageTriggeredService";
            aebi.f63099k = "GCM-CM";
            aebi.mo34004a(currentTimeMillis, 1 + currentTimeMillis);
            aebi.f63102n = true;
            aebi.mo34023a(2);
            aebj a = aebi.mo33974b();
            StringBuilder sb = new StringBuilder(59);
            sb.append("device-time msg is being scheduled in ");
            sb.append(currentTimeMillis);
            sb.append("s");
            Log.i("GCM", sb.toString());
            aaoi.f28690a.mo33984a(a);
        }
        synchronized (aaoh.class) {
            LevelDb b2 = mo17176b();
            if (b2 != null) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    try {
                        byte[] bArr = b2.get((byte[]) it2.next());
                        Bundle bundle = null;
                        if (bArr != null) {
                            try {
                                blmp blmp = (blmp) bxvk.m124014a(blmp.f126864r, bArr);
                                bundle = new Bundle();
                                for (blmi blmi : blmp.f126872g) {
                                    bundle.putString(blmi.f126845b, blmi.f126846c);
                                }
                            } catch (bxwf e2) {
                            }
                        }
                        if (bundle != null) {
                            this.f28689d.mo17177a(bundle);
                        }
                    } catch (LevelDbException e3) {
                    }
                }
                if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
                    WriteBatch create = WriteBatch.create();
                    try {
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            create.delete((byte[]) it3.next());
                        }
                        Iterator it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            create.delete((byte[]) it4.next());
                        }
                        b2.write(create);
                    } catch (LevelDbException e4) {
                        try {
                            Log.e("GCM", "Failed to delete expired and triggered device-time messages", e4);
                        } catch (Throwable th2) {
                            create.close();
                            throw th2;
                        }
                    }
                    create.close();
                }
            }
        }
    }
}
