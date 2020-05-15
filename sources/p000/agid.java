package p000;

import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;

/* renamed from: agid */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agid extends agjv {

    /* renamed from: a */
    public char f65562a = 0;

    /* renamed from: b */
    public long f65563b = -1;

    /* renamed from: c */
    public final agib f65564c = new agib(this, 6, false, false);

    /* renamed from: d */
    public final agib f65565d = new agib(this, 6, true, false);

    /* renamed from: e */
    public final agib f65566e = new agib(this, 6, false, true);

    /* renamed from: f */
    public final agib f65567f = new agib(this, 5, false, false);

    /* renamed from: g */
    public final agib f65568g = new agib(this, 5, true, false);

    /* renamed from: h */
    public final agib f65569h = new agib(this, 5, false, true);

    /* renamed from: i */
    public final agib f65570i = new agib(this, 4, false, false);

    /* renamed from: j */
    public final agib f65571j = new agib(this, 3, false, false);

    /* renamed from: k */
    public final agib f65572k = new agib(this, 2, false, false);

    /* renamed from: l */
    private String f65573l;

    public agid(agje agje) {
        super(agje);
    }

    /* renamed from: a */
    protected static Object m54288a(String str) {
        if (str != null) {
            return new agic(str);
        }
        return null;
    }

    /* renamed from: b */
    private static String m54291b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf != -1 ? str.substring(0, lastIndexOf) : str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo35371a() {
        return false;
    }

    /* renamed from: c */
    public final String mo35443c() {
        long j;
        Pair pair;
        agio agio = mo35539w().f65618c;
        agio.f65609e.mo35241h();
        agio.f65609e.mo35241h();
        long b = agio.mo35461b();
        if (b == 0) {
            agio.mo35460a();
            j = 0;
        } else {
            j = Math.abs(b - agio.f65609e.mo35534A().mo20505a());
        }
        long j2 = agio.f65608d;
        if (j >= j2) {
            if (j <= j2 + j2) {
                String string = agio.f65609e.mo35468c().getString(agio.f65607c, null);
                long j3 = agio.f65609e.mo35468c().getLong(agio.f65606b, 0);
                agio.mo35460a();
                if (string != null && j3 > 0) {
                    pair = new Pair(string, Long.valueOf(j3));
                } else {
                    pair = agiq.f65614a;
                }
                if (pair != null || pair == agiq.f65614a) {
                    return null;
                }
                String valueOf = String.valueOf(pair.second);
                String str = (String) pair.first;
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
                sb.append(valueOf);
                sb.append(":");
                sb.append(str);
                return sb.toString();
            }
            agio.mo35460a();
        }
        pair = null;
        if (pair != null) {
        }
        return null;
    }

    /* renamed from: a */
    static String m54289a(boolean z, Object obj) {
        String className;
        String str = "";
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i = 0;
        if (!(obj instanceof Long)) {
            if (obj instanceof Boolean) {
                return String.valueOf(obj);
            }
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                StringBuilder sb = new StringBuilder(z ? th.getClass().getName() : th.toString());
                String b = m54291b(agje.class.getCanonicalName());
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && m54291b(className).equals(b)) {
                        sb.append(": ");
                        sb.append(stackTraceElement);
                        break;
                    }
                    i++;
                }
                return sb.toString();
            } else if (obj instanceof agic) {
                return ((agic) obj).f65561a;
            } else {
                if (!z) {
                    return String.valueOf(obj);
                }
                return "-";
            }
        } else if (!z) {
            return String.valueOf(obj);
        } else {
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                str = "-";
            }
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 4.0d);
            StringBuilder sb2 = new StringBuilder(str.length() + 43 + str.length());
            sb2.append(str);
            sb2.append(round);
            sb2.append("...");
            sb2.append(str);
            sb2.append(round2);
            return sb2.toString();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo35442b() {
        String str;
        synchronized (this) {
            if (this.f65573l == null) {
                String str2 = this.f65756y.f65688d;
                if (str2 == null) {
                    str2 = mo35538v().mo35312a();
                }
                this.f65573l = str2;
            }
            str = this.f65573l;
        }
        return str;
    }

    /* renamed from: a */
    static String m54290a(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String a = m54289a(z, obj);
        String a2 = m54289a(z, obj2);
        String a3 = m54289a(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(a)) {
            sb.append(str2);
            sb.append(a);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(a2)) {
            sb.append(str2);
            sb.append(a2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(a3)) {
            sb.append(str3);
            sb.append(a3);
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo35439a(int i, String str) {
        Log.println(i, mo35442b(), str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo35440a(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && mo35441a(i)) {
            mo35439a(i, m54290a(false, str, obj, obj2, obj3));
        }
        if (!z2 && i >= 5) {
            sdo.m34959a((Object) str);
            agjb agjb = this.f65756y.f65694j;
            if (agjb == null) {
                mo35439a(6, "Scheduler not set. Not logging error/warn");
            } else if (!agjb.mo35543g()) {
                mo35439a(6, "Scheduler not initialized. Not logging error/warn");
            } else {
                agjb.mo35492a(new agia(this, i, str, obj, obj2, obj3));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo35441a(int i) {
        return Log.isLoggable(mo35442b(), i);
    }
}
