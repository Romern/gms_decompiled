package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.util.Collections;

/* renamed from: alue */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alue {

    /* renamed from: a */
    static alue f74297a;

    private alue() {
    }

    /* renamed from: a */
    public static aluc m61882a() {
        aluc aluc = new aluc();
        m61884b();
        return aluc;
    }

    /* renamed from: b */
    public static synchronized void m61884b() {
        synchronized (alue.class) {
            if (f74297a == null) {
                f74297a = new alue();
            }
        }
    }

    /* renamed from: a */
    public static final bngx m61883a(Context context) {
        ByteArrayInputStream byteArrayInputStream;
        ObjectInputStream objectInputStream;
        bngs j = bngx.m109377j();
        SharedPreferences sharedPreferences = context.getSharedPreferences("People-DebugUploaderService", 0);
        for (String str : sharedPreferences.getStringSet("available_uploaders", Collections.emptySet())) {
            String string = sharedPreferences.getString(str, null);
            if (string != null) {
                try {
                    byteArrayInputStream = new ByteArrayInputStream(Base64.decode(string, 0));
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    alud alud = (alud) objectInputStream.readObject();
                    objectInputStream.close();
                    byteArrayInputStream.close();
                    j.mo67668c(alud);
                } catch (Exception e) {
                    new Object[1][0] = str;
                } catch (Throwable th) {
                    objectInputStream.close();
                    byteArrayInputStream.close();
                    throw th;
                }
            }
        }
        return j.mo67664a();
    }
}
