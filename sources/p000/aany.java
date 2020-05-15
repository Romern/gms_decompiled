package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbException;
import java.io.File;
import java.util.List;

/* renamed from: aany */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class aany {

    /* renamed from: a */
    private final String f28668a;

    /* renamed from: b */
    private final Context f28669b;

    /* renamed from: c */
    private LevelDb f28670c;

    public aany(Context context, String str) {
        this.f28668a = str;
        this.f28669b = context;
    }

    /* renamed from: d */
    private final bmxv m21721d(byte[] bArr) {
        if (bArr != null) {
            try {
                return bmxv.m108566b(mo17166c(bArr));
            } catch (bxwf e) {
                Log.e("GCM", "Could not parse a proto message.", e);
            }
        }
        return bmvz.f131120a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bmxv mo17158a(byte[] bArr) {
        byte[] bArr2 = null;
        if (bArr != null) {
            try {
                bArr2 = mo17160a().get(bArr);
            } catch (LevelDbException e) {
                Log.e("GCM", "Failed to get a proto message.", e);
            }
        }
        return m21721d(bArr2);
    }

    /* renamed from: b */
    public final List mo17162b() {
        return mo17159a(aanx.f28667a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract bmxv mo17165c(bxvk bxvk);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract bxvk mo17166c(byte[] bArr);

    /* renamed from: b */
    public final void mo17163b(bxvk bxvk) {
        bmxv c = mo17165c(bxvk);
        if (!c.mo66813a()) {
            Log.e("GCM", "Invalid proto message was provided.");
        } else {
            mo17164b((byte[]) c.mo66814b());
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final bngx mo17159a(sdp sdp) {
        try {
            LevelDb.Iterator it = mo17160a().iterator();
            if (it == null) {
                return bngx.m109376e();
            }
            bngs bngs = new bngs();
            try {
                it.seekToFirst();
                while (it.isValid()) {
                    bmxv d = m21721d(it.value());
                    if (d.mo66813a() && sdp.mo17022a((bxvk) d.mo66814b())) {
                        bngs.mo67668c((bxvk) d.mo66814b());
                    }
                    it.next();
                }
                it.close();
                return bngs.mo67664a();
            } catch (Throwable th) {
                it.close();
                throw th;
            }
        } catch (LevelDbException e) {
            Log.w("GCM", "The iterator is not available.");
            return bngx.m109376e();
        }
    }

    /* renamed from: b */
    public final void mo17164b(byte[] bArr) {
        try {
            mo17160a().delete(bArr);
        } catch (LevelDbException e) {
            Log.e("GCM", "Failed to delete a proto message.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized LevelDb mo17160a() {
        LevelDb levelDb;
        levelDb = this.f28670c;
        if (levelDb == null) {
            levelDb = LevelDb.open(new File(this.f28669b.getFilesDir(), this.f28668a));
            this.f28670c = levelDb;
            if (levelDb == null) {
                throw new LevelDbException("Failed to open db.");
            }
        }
        return levelDb;
    }

    /* renamed from: a */
    public final boolean mo17161a(bxvk bxvk) {
        bmxv c = mo17165c(bxvk);
        if (!c.mo66813a()) {
            Log.w("GCM", "Not storing invalid message.");
            return false;
        }
        try {
            mo17160a().put((byte[]) c.mo66814b(), bxvk.mo73642k());
            return true;
        } catch (LevelDbException e) {
            Log.e("GCM", "Failed to addOrUpdate message.", e);
            return false;
        }
    }
}
