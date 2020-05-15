package p000;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

/* renamed from: dx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0947dx {

    /* renamed from: a */
    final HashMap f14325a;

    /* renamed from: b */
    final String[] f14326b;

    /* renamed from: c */
    final C0953ec f14327c;

    /* renamed from: d */
    AtomicBoolean f14328d = new AtomicBoolean(false);

    /* renamed from: e */
    public volatile boolean f14329e = false;

    /* renamed from: f */
    final C1207n f14330f = new C1207n();

    /* renamed from: g */
    public C0948dy f14331g;

    /* renamed from: h */
    Runnable f14332h = new C0944du(this);

    /* renamed from: i */
    volatile C0939dp f14333i;

    /* renamed from: j */
    private C0945dv f14334j;

    public C0947dx(C0953ec ecVar, Map map, String... strArr) {
        this.f14327c = ecVar;
        int length = strArr.length;
        this.f14334j = new C0945dv(length);
        this.f14325a = new HashMap();
        new C0943dt();
        this.f14326b = new String[length];
        for (int i = 0; i < length; i++) {
            String lowerCase = strArr[i].toLowerCase(Locale.US);
            this.f14325a.put(lowerCase, Integer.valueOf(i));
            String str = (String) map.get(strArr[i]);
            if (str != null) {
                this.f14326b[i] = str.toLowerCase(Locale.US);
            } else {
                this.f14326b[i] = lowerCase;
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            String lowerCase2 = ((String) entry.getValue()).toLowerCase(Locale.US);
            if (this.f14325a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(Locale.US);
                HashMap hashMap = this.f14325a;
                hashMap.put(lowerCase3, (Integer) hashMap.get(lowerCase2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo9824a(C0933dj djVar) {
        if (!djVar.mo9119d()) {
            try {
                Lock a = this.f14327c.mo9939a();
                a.lock();
                try {
                    C0945dv dvVar = this.f14334j;
                    synchronized (dvVar) {
                        boolean z = dvVar.f14153c;
                    }
                    a.unlock();
                } catch (Throwable th) {
                    a.unlock();
                    throw th;
                }
            } catch (SQLiteException | IllegalStateException e) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
            }
        }
    }
}
