package p000;

import android.content.Context;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: rbl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rbl implements qwp {

    /* renamed from: a */
    static Boolean f42575a = null;

    /* renamed from: b */
    static Long f42576b = null;

    /* renamed from: c */
    private static final Charset f42577c = Charset.forName("UTF-8");

    /* renamed from: d */
    private static final bdyw f42578d = new bdyw(anef.m64088a("com.google.android.gms.clearcut.public")).mo58445a("gms:playlog:service:samplingrules_").mo58451b("LogSamplingRulesV2__");

    /* renamed from: f */
    private static final ConcurrentHashMap f42579f = new ConcurrentHashMap();

    /* renamed from: e */
    private final Context f42580e;

    public rbl(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f42580e = applicationContext;
        if (applicationContext != null) {
            bdyx.m91615b(applicationContext);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aymn.a(android.content.ContentResolver, java.lang.String, long):long
     arg types: [android.content.ContentResolver, java.lang.String, int]
     candidates:
      aymn.a(android.content.ContentResolver, java.lang.String, int):int
      aymn.a(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object
      aymn.a(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String
      aymn.a(java.lang.Object, java.lang.String, java.lang.String):void
      aymn.a(android.content.ContentResolver, java.lang.String, boolean):boolean
      aymn.a(android.content.ContentResolver, java.lang.String, long):long */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x011e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x004e A[SYNTHETIC] */
    /* renamed from: a */
    public final boolean mo24332a(String str, int i, int i2) {
        String str2;
        List<cahm> list;
        long j;
        long j2;
        long j3;
        long j4;
        if (str == null || str.isEmpty()) {
            str2 = i >= 0 ? String.valueOf(i) : null;
        } else {
            str2 = str;
        }
        if (str2 == null) {
            return true;
        }
        if (this.f42580e != null) {
            bdyx bdyx = (bdyx) f42579f.get(str2);
            if (bdyx == null) {
                bdyx = bdyx.m91608a(f42578d, str2, cahn.f174569b, rbk.f42574a);
                bdyx bdyx2 = (bdyx) f42579f.putIfAbsent(str2, bdyx);
                if (bdyx2 != null) {
                    bdyx = bdyx2;
                }
            }
            list = ((cahn) bdyx.mo58455c()).f174571a;
        } else {
            list = Collections.emptyList();
        }
        for (cahm cahm : list) {
            if ((cahm.f174564a & 1) != 0) {
                int i3 = cahm.f174565b;
                if (i3 != 0) {
                    if (i3 != i2) {
                        continue;
                    }
                }
            }
            String str3 = cahm.f174566c;
            Context context = this.f42580e;
            if (!aytw.m84813a(context)) {
                if (f42576b == null) {
                    if (context != null) {
                        if (f42575a == null) {
                            f42575a = Boolean.valueOf(svr.m36484b(context).mo26169a("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
                        }
                        if (f42575a.booleanValue()) {
                            f42576b = Long.valueOf(aymn.m84261a(context.getContentResolver(), "android_id", 0L));
                        } else {
                            f42576b = 0L;
                        }
                    }
                }
                j = f42576b.longValue();
                if (str3 != null && !str3.isEmpty()) {
                    byte[] bytes = str3.getBytes(f42577c);
                    ByteBuffer allocate = ByteBuffer.allocate(bytes.length + 8);
                    allocate.put(bytes);
                    allocate.putLong(j);
                    j2 = rax.m33210a(allocate.array());
                } else {
                    j2 = rax.m33210a(ByteBuffer.allocate(8).putLong(j).array());
                }
                j3 = cahm.f174567d;
                long j5 = cahm.f174568e;
                if (j3 >= 0 && j5 > 0) {
                    if (j2 < 0) {
                        j4 = (((Long.MAX_VALUE % j5) + 1) + ((j2 & Long.MAX_VALUE) % j5)) % j5;
                    } else {
                        j4 = j2 % j5;
                    }
                    if (j4 >= j3) {
                        return false;
                    }
                }
            }
            j = 0;
            if (str3 != null) {
                byte[] bytes2 = str3.getBytes(f42577c);
                ByteBuffer allocate2 = ByteBuffer.allocate(bytes2.length + 8);
                allocate2.put(bytes2);
                allocate2.putLong(j);
                j2 = rax.m33210a(allocate2.array());
                j3 = cahm.f174567d;
                long j52 = cahm.f174568e;
                if (j2 < 0) {
                }
                if (j4 >= j3) {
                }
            }
            j2 = rax.m33210a(ByteBuffer.allocate(8).putLong(j).array());
            j3 = cahm.f174567d;
            long j522 = cahm.f174568e;
            if (j2 < 0) {
            }
            if (j4 >= j3) {
            }
        }
        return true;
    }
}
