package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: azar */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azar {

    /* renamed from: a */
    static final byte[] f98871a = new byte[0];

    /* renamed from: b */
    public final Cursor f98872b;

    /* renamed from: c */
    public final String f98873c;

    /* renamed from: d */
    public final ContentResolver f98874d;

    /* renamed from: e */
    private final Context f98875e;

    public azar(Context context, Cursor cursor, String str) {
        this.f98875e = context;
        this.f98872b = cursor;
        this.f98873c = str;
        this.f98874d = context.getContentResolver();
    }

    /* renamed from: a */
    public static boolean m85160a(int i) {
        return i >= 30 && i <= 39;
    }

    /* renamed from: b */
    public final String mo54546b() {
        return this.f98872b.getString(9);
    }

    /* renamed from: c */
    public final cbil mo54547c() {
        byte[] blob = this.f98872b.getBlob(7);
        if (!azpi.m86080b(blob)) {
            return (cbil) azol.m85935a((bxxk) cbil.f177257h.mo74142c(7), blob);
        }
        return null;
    }

    /* renamed from: d */
    public final bxte mo54548d() {
        byte[] b = azcm.m85300a(this.f98875e).mo54659b(this.f98872b.getLong(0));
        if (!azpi.m86080b(b)) {
            return (bxte) azol.m85935a((bxxk) bxte.f164763c.mo74142c(7), b);
        }
        return null;
    }

    /* renamed from: e */
    public final int mo54549e() {
        return this.f98872b.getInt(12);
    }

    /* renamed from: a */
    public final int mo54545a() {
        String b = mo54546b();
        if (azoy.m85984a(b)) {
            return 1;
        }
        if (azoy.m85987c(b) || azoy.m85988d(b) || azoy.m85989e(b)) {
            return 2;
        }
        if (azoy.m85986b(b) || azoy.m85990f(b) || azoy.m85991g(b) || azoy.m85992h(b) || azoy.m85993i(b)) {
            return PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        return 0;
    }
}
