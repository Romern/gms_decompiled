package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.leveldb.LevelDb;
import java.util.ArrayList;

/* renamed from: apyv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apyv extends aqas {

    /* renamed from: c */
    private static apyv f85195c = null;

    /* renamed from: d */
    private LevelDb f85196d;

    static {
        apyv.class.getSimpleName();
    }

    private apyv(Context context) {
        super(context);
        this.f85196d = null;
        this.f85196d = mo47720a(false, null, "snet_dex_info");
    }

    /* renamed from: a */
    public static synchronized apyv m71200a(Context context) {
        apyv apyv;
        synchronized (apyv.class) {
            if (f85195c == null) {
                f85195c = new apyv(context);
            }
            apyv = f85195c;
        }
        return apyv;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: c */
    private final synchronized void m71201c() {
        this.f85196d.deleteRange(null, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00a2, code lost:
        if (r1 != null) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b2, code lost:
        if (r1 == null) goto L_0x00b5;
     */
    /* renamed from: a */
    public final synchronized ArrayList mo47709a() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        LevelDb.Iterator it = this.f85196d.iterator();
        try {
            it.seekToFirst();
            while (it.isValid()) {
                byte[] key = it.key();
                apyu apyu = (apyu) GeneratedMessageLite.m124014a(apyu.f85187f, it.value());
                Bundle bundle = new Bundle();
                bundle.putByteArray("digest", key);
                bundle.putString("package_name", apyu.f85189a);
                bundle.putStringArray("method_calls", (String[]) apyu.f85191c.toArray(new String[0]));
                bundle.putStringArray("class_names", (String[]) apyu.f85192d.toArray(new String[0]));
                bundle.putStringArray("constant_strings", (String[]) apyu.f85190b.toArray(new String[0]));
                ArrayList arrayList2 = new ArrayList();
                for (apyt apyt : apyu.f85193e) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("sim_hash_type", apyt.f85184a);
                    bundle2.putLong("sim_hash_value", apyt.f85185b);
                    arrayList2.add(bundle2);
                }
                bundle.putParcelableArrayList("sim_hashes", arrayList2);
                arrayList.add(bundle);
                it.next();
            }
            m71201c();
        } catch (Exception e) {
        } catch (Throwable th) {
            if (it != null) {
                it.close();
            }
            throw th;
        }
        return arrayList;
    }
}
