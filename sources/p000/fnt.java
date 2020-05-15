package p000;

import android.content.SharedPreferences;
import android.util.Log;
import java.util.Map;
import java.util.UUID;

/* renamed from: fnt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fnt extends fkj {

    /* renamed from: a */
    public static fnt f16975a;

    public fnt(fkm fkm) {
        super(fkm);
    }

    /* renamed from: a */
    protected static final String m12025a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        String str = "-";
        if (obj instanceof Long) {
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) != '-') {
                str = "";
            }
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            return str + Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1))) + "..." + str + Math.round(Math.pow(10.0d, (double) valueOf.length()) - 4.0d);
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            return obj instanceof Throwable ? obj.getClass().getCanonicalName() : str;
        }
    }

    /* renamed from: b */
    public final void mo11029b(int i, String str, Object obj, Object obj2, Object obj3) {
        String str2 = (String) fni.f16924b.mo11021a();
        if (Log.isLoggable(str2, i)) {
            Log.println(i, str2, fki.m11849b(str, obj, obj2, obj3));
        }
        if (i >= 5) {
            mo11030c(i, str, obj, obj2, obj3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f8, code lost:
        return;
     */
    /* renamed from: c */
    public final synchronized void mo11030c(int i, String str, Object obj, Object obj2, Object obj3) {
        char c;
        sdo.m34959a((Object) str);
        if (mo10943h().mo11005a()) {
            mo10943h();
            c = 'P';
        } else {
            mo10943h();
            c = 'p';
        }
        char charAt = "01VDIWEA?".charAt(i);
        String str2 = fkk.f16781a;
        String b = fki.m11849b(str, m12025a(obj), m12025a(obj2), m12025a(obj3));
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(b).length());
        sb.append("3");
        sb.append(charAt);
        sb.append(c);
        sb.append(str2);
        sb.append(":");
        sb.append(b);
        String sb2 = sb.toString();
        if (sb2.length() > 1024) {
            sb2 = sb2.substring(0, 1024);
        }
        fkm fkm = this.f16779d;
        fny fny = fkm.f16791g;
        fny fny2 = null;
        if (fny != null && fny.mo10953s()) {
            fny2 = fkm.f16791g;
        }
        if (fny2 != null) {
            fnx fnx = fny2.f16990b;
            if (fnx.mo11047b() == 0) {
                fnx.mo11046a();
            }
            if (sb2 == null) {
                sb2 = "";
            }
            synchronized (fnx) {
                long j = fnx.f16987b.f16989a.getLong(fnx.mo11048c(), 0);
                if (j > 0) {
                    long j2 = j + 1;
                    SharedPreferences.Editor edit = fnx.f16987b.f16989a.edit();
                    if ((UUID.randomUUID().getLeastSignificantBits() & Long.MAX_VALUE) < Long.MAX_VALUE / j2) {
                        edit.putString(fnx.mo11049d(), sb2);
                    }
                    edit.putLong(fnx.mo11048c(), j2);
                    edit.apply();
                    return;
                }
                SharedPreferences.Editor edit2 = fnx.f16987b.f16989a.edit();
                edit2.putString(fnx.mo11049d(), sb2);
                edit2.putLong(fnx.mo11048c(), 1);
                edit2.apply();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10890a() {
        synchronized (fnt.class) {
            f16975a = this;
        }
    }

    /* renamed from: a */
    public final void mo11027a(fnl fnl, String str) {
        mo10934d(str.length() == 0 ? new String("Discarding hit. ") : "Discarding hit. ".concat(str), fnl == null ? "no hit data" : fnl.toString());
    }

    /* renamed from: a */
    public final void mo11028a(Map map, String str) {
        String str2;
        if (map != null) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry entry : map.entrySet()) {
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append((String) entry.getKey());
                sb.append('=');
                sb.append((String) entry.getValue());
            }
            str2 = sb.toString();
        } else {
            str2 = "no hit data";
        }
        mo10934d(str.length() == 0 ? new String("Discarding hit. ") : "Discarding hit. ".concat(str), str2);
    }
}
