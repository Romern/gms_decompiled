package p000;

import android.content.Context;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbCorruptionException;
import com.google.android.gms.leveldb.LevelDbException;
import java.io.File;

/* renamed from: aqas */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aqas {

    /* renamed from: a */
    protected final String f85472a;

    /* renamed from: b */
    protected boolean f85473b;

    protected aqas(Context context) {
        this.f85472a = context.getApplicationInfo().dataDir;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final LevelDb mo47720a(boolean z, LevelDb levelDb, String str) {
        if (levelDb != null) {
            return levelDb;
        }
        File b = mo47721b();
        if (!b.exists()) {
            b.mkdirs();
        }
        LevelDb.Options options = new LevelDb.Options();
        options.mDeleteIfCorrupted = z;
        try {
            return LevelDb.open(new File(b, str), options);
        } catch (LevelDbCorruptionException e) {
            this.f85473b = true;
            return null;
        } catch (LevelDbException e2) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final File mo47721b() {
        return new File(String.valueOf(this.f85472a).concat("/snet/leveldb"));
    }
}
