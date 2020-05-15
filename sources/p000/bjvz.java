package p000;

import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Array;

/* renamed from: bjvz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjvz {

    /* renamed from: a */
    private final String[] f123452a;

    /* renamed from: b */
    private final int f123453b;

    /* renamed from: c */
    private int f123454c;

    public bjvz(String str) {
        int i;
        if (str != null) {
            String[] split = bjwb.f123456a.split(str, -1);
            this.f123452a = split;
            i = split.length;
        } else {
            this.f123452a = null;
            i = 0;
        }
        this.f123453b = i;
    }

    /* renamed from: a */
    public final long mo65575a(long j) {
        String a = mo65577a();
        if (a != null) {
            try {
                return Long.parseLong(a);
            } catch (Throwable th) {
                Log.w("StringSerializer", "Unable to parse long");
            }
        }
        return j;
    }

    /* renamed from: b */
    public final String mo65579b() {
        String a = mo65577a();
        if (a == null) {
            return null;
        }
        return a;
    }

    /* renamed from: a */
    public final bxxc mo65576a(bxxk bxxk, bxxc bxxc) {
        String a = mo65577a();
        if (a != null) {
            try {
                return bjvp.m104732a(a, bxxk);
            } catch (Throwable th) {
                String valueOf = String.valueOf(bxxk.getClass().getName());
                Log.w("StringSerializer", valueOf.length() == 0 ? new String("Unable to parse proto ") : "Unable to parse proto ".concat(valueOf));
            }
        }
        return bxxc;
    }

    /* renamed from: a */
    public final String mo65577a() {
        int i = this.f123454c;
        this.f123454c = i + 1;
        if (i >= this.f123453b) {
            return null;
        }
        String str = this.f123452a[i];
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    /* renamed from: a */
    public final bxxc[] mo65578a(bxxk bxxk, bxxc[] bxxcArr) {
        String a = mo65577a();
        if (a == null) {
            return bxxcArr;
        }
        String[] split = bjwb.f123457b.split(a, -1);
        int length = split.length;
        bxxc[] bxxcArr2 = null;
        for (int i = 0; i < length; i++) {
            if (!TextUtils.isEmpty(split[i])) {
                try {
                    bxxc a2 = bjvp.m104732a(split[i], bxxk);
                    if (bxxcArr2 == null) {
                        bxxcArr2 = (bxxc[]) Array.newInstance(a2.getClass(), length);
                    }
                    bxxcArr2[i] = a2;
                } catch (Throwable th) {
                    String valueOf = String.valueOf(bxxk.getClass().getName());
                    Log.w("StringSerializer", valueOf.length() == 0 ? new String("Unable to parse proto in array ") : "Unable to parse proto in array ".concat(valueOf));
                    return bxxcArr;
                }
            }
        }
        return bxxcArr2;
    }
}
