package p000;

import android.content.SharedPreferences;
import android.os.StrictMode;
import android.util.Log;
import java.io.DataInputStream;
import java.io.DataOutputStream;

/* renamed from: bwbp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwbp extends bwaw {

    /* renamed from: a */
    private final bwbe f158753a;

    public bwbp(bwbe bwbe) {
        this.f158753a = bwbe;
    }

    /* renamed from: a */
    public final int mo73402a() {
        return 15;
    }

    /* renamed from: a */
    public final void mo73403a(DataOutputStream dataOutputStream) {
    }

    /* renamed from: b */
    public final boolean mo73405b() {
        return false;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final boolean mo73404a(DataInputStream dataInputStream) {
        long readLong = dataInputStream.readLong();
        bwbe bwbe = this.f158753a;
        if (bwam.m121655a(bwbe.f158692a, 4)) {
            String str = bwbe.f158692a;
            String valueOf = String.valueOf(Long.toHexString(readLong));
            Log.i(str, valueOf.length() == 0 ? new String("New GMM Server Cookie: ") : "New GMM Server Cookie: ".concat(valueOf));
        }
        synchronized (bwbe) {
            bwbe.f158699c = Long.valueOf(readLong);
        }
        SharedPreferences.Editor edit = bwbe.f158702f.edit();
        edit.putLong("SessionID", readLong);
        StrictMode.ThreadPolicy b = bwap.f158670a.mo73412b();
        try {
            edit.commit();
            bwap.f158670a.mo73411a(b);
            return true;
        } catch (Throwable th) {
            bwap.f158670a.mo73411a(b);
            throw th;
        }
    }
}
