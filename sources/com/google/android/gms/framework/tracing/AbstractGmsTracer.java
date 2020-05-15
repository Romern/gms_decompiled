package com.google.android.gms.framework.tracing;

import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.config.ModuleManager;
import java.io.Closeable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class AbstractGmsTracer {

    /* renamed from: f */
    public static final /* synthetic */ int f32469f = 0;

    /* renamed from: g */
    private static final AtomicBoolean f32470g = new AtomicBoolean(true);

    /* renamed from: h */
    private static final AtomicBoolean f32471h = new AtomicBoolean(true);

    /* renamed from: i */
    private static final ConcurrentMap f32472i = new ConcurrentHashMap(10);

    /* renamed from: a */
    final ClassLoader f32473a;

    /* renamed from: b */
    final int f32474b;

    /* renamed from: c */
    final String f32475c;

    /* renamed from: d */
    final String f32476d;

    /* renamed from: e */
    final int f32477e;

    public AbstractGmsTracer(ClassLoader classLoader, int i, Context context, String str) {
        String str2;
        this.f32473a = classLoader;
        this.f32477e = i;
        int i2 = -1;
        String str3 = "unknown";
        if (stu.m36316b() >= 14768000) {
            ModuleManager.BasicModuleInfo basicModuleInfo = ModuleManager.getBasicModuleInfo(context);
            sdo.checkIfNull(basicModuleInfo, "A Chimera Context is required");
            if (!(basicModuleInfo == null || (str2 = basicModuleInfo.moduleId) == null)) {
                String a = sqq.m35990a(str2);
                i2 = basicModuleInfo.moduleVersion;
                str3 = a;
            }
        } else {
            ModuleManager.ModuleInfo c = sqq.m35994c(context);
            sdo.checkIfNull(c, "A Chimera Context is required");
            if (c != null) {
                str3 = sqq.m35990a(c.moduleId);
                i2 = c.moduleVersion;
            }
        }
        this.f32475c = str3;
        this.f32474b = i2;
        this.f32476d = str != null ? mo16696b(str) : "";
    }

    /* renamed from: a */
    static blji m23836a(aabt aabt, String str, zzq zzq, boolean z) {
        if (blkh.m107295b(blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS)) {
            return aabt.mo16701a(blkh.m107283a(str, blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS, aach.m21084a(zzq, z)));
        }
        bljf a = aach.m21083a(zzq);
        bljj a2 = aach.m21085a();
        bmxy.m108581a(blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
        return aabt.mo16701a(new bljb(a2.f126673a.mo66584a(str, bljf.m107237a(a2.f126674b, a), 2, a2.f126675c)));
    }

    /* renamed from: b */
    private final String mo16696b(String str) {
        StringBuilder sb = new StringBuilder(this.f32475c.length() + str.length() + 2);
        sb.append(this.f32475c);
        sb.append('-');
        sb.append(str);
        sb.append('_');
        return sb.toString();
    }

    private static Closeable beginTraceInternalUsingReflection(String str, byte[] bArr, boolean z) {
        zzq zzq = null;
        if (bArr != null) {
            try {
                zzq = (zzq) GeneratedMessageLite.m124016a(zzq.f56322f, bArr, bxus.m123744c());
            } catch (bxwf e) {
                Log.e("AbstractGmsTracer", "Invalid GCoreClientInfo bytes.");
            }
        }
        return m23836a(aabs.f27896b, str, zzq, z);
    }

    public AbstractGmsTracer(ClassLoader classLoader, int i, String str, String str2) {
        this.f32473a = classLoader;
        this.f32477e = i;
        this.f32475c = str;
        this.f32474b = -1;
        this.f32476d = mo16696b(str2);
    }

    /* renamed from: a */
    private static final String m23837a(Bundle bundle, String str) {
        String string;
        if (bundle == null) {
            return null;
        }
        synchronized (bundle) {
            try {
                string = bundle.getString(str);
            } catch (BadParcelableException e) {
                Log.e("AbstractGmsTracer", "Exception unparcelling Intent swallowed", e);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    /* renamed from: a */
    private static void m23838a() {
        f32470g.getAndSet(false);
    }

    /* renamed from: a */
    private static void m23839a(Exception exc) {
        if (f32471h.getAndSet(false)) {
            Log.e("AbstractGmsTracer", "Reflection failed", exc);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053 A[SYNTHETIC, Splitter:B:16:0x0053] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0083 A[RETURN] */
    /* renamed from: a */
    public final blji mo19212a(String str, bmzi bmzi, Intent intent, boolean z) {
        Closeable closeable;
        byte[] bArr;
        zzq a = mo19216a(str, bmzi, intent);
        if (this.f32473a == AbstractGmsTracer.class.getClassLoader()) {
            return m23836a(aabs.f27896b, str, a, z);
        }
        ClassLoader classLoader = this.f32473a;
        Method method = (Method) f32472i.get(classLoader);
        if (method == null) {
            try {
                method = Class.forName(AbstractGmsTracer.class.getCanonicalName(), true, classLoader).getDeclaredMethod("beginTraceInternalUsingReflection", String.class, byte[].class, Boolean.TYPE);
                try {
                    method.setAccessible(true);
                    f32472i.put(classLoader, method);
                } catch (ClassNotFoundException e) {
                } catch (NoSuchMethodException e2) {
                    m23838a();
                    if (method == null) {
                    }
                    if (closeable == null) {
                    }
                }
            } catch (ClassNotFoundException e3) {
                m23838a();
                if (method == null) {
                }
                if (closeable == null) {
                }
            } catch (NoSuchMethodException e4) {
                m23838a();
                if (method == null) {
                }
                if (closeable == null) {
                }
            }
        }
        if (method == null) {
            try {
                Object[] objArr = new Object[3];
                objArr[0] = str;
                if (a != null) {
                    bArr = a.mo73642k();
                } else {
                    bArr = null;
                }
                objArr[1] = bArr;
                objArr[2] = Boolean.valueOf(z);
                closeable = (Closeable) method.invoke(null, objArr);
            } catch (IllegalAccessException e5) {
                m23839a(e5);
                closeable = null;
            } catch (InvocationTargetException e6) {
                m23839a(e6);
                closeable = null;
            }
        } else {
            closeable = null;
        }
        if (closeable == null) {
            return new aaav(closeable);
        }
        return null;
    }

    /* renamed from: a */
    public final blji mo19213a(String str, boolean z) {
        return mo19212a(mo19214a(str), (bmzi) null, (Intent) null, z);
    }

    /* renamed from: a */
    public final String mo19214a(String str) {
        StringBuilder a = mo19215a(str.length());
        a.append(str);
        return a.toString();
    }

    /* renamed from: a */
    public final StringBuilder mo19215a(int i) {
        StringBuilder sb = new StringBuilder(this.f32476d.length() + i);
        sb.append(this.f32476d);
        return sb;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final zzq mo19216a(String str, bmzi bmzi, Intent intent) {
        int i;
        int i2;
        int i3;
        int i4;
        String a;
        zzp zzp;
        if (!cdoz.f181455a.mo6606a().mo78102O()) {
            return null;
        }
        bxvd da = zzq.f56322f.mo74144da();
        bxvd da2 = zzn.f56307e.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        zzn zzn = (zzn) da2.f164949b;
        str.getClass();
        int i5 = 2;
        int i6 = zzn.f56309a | 2;
        zzn.f56309a = i6;
        zzn.f56311c = str;
        zzn.f56310b = this.f32477e - 1;
        zzn.f56309a = i6 | 1;
        if (intent != null) {
            int a2 = aabq.m21067a(intent);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            zzn zzn2 = (zzn) da2.f164949b;
            zzn2.f56309a |= 4;
            zzn2.f56312d = a2;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        zzq zzq = (zzq) da.f164949b;
        zzn zzn3 = (zzn) da2.mo74062i();
        zzn3.getClass();
        zzq.f56326c = zzn3;
        zzq.f56324a |= 2;
        if (!TextUtils.isEmpty(this.f32475c)) {
            bxvd da3 = zzr.f56329d.mo74144da();
            String str2 = this.f32475c;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            zzr zzr = (zzr) da3.f164949b;
            str2.getClass();
            int i7 = zzr.f56331a | 1;
            zzr.f56331a = i7;
            zzr.f56332b = str2;
            int i8 = this.f32474b;
            if (i8 != -1) {
                zzr.f56331a = i7 | 2;
                zzr.f56333c = i8;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            zzq zzq2 = (zzq) da.f164949b;
            zzr zzr2 = (zzr) da3.mo74062i();
            zzr2.getClass();
            zzq2.f56327d = zzr2;
            zzq2.f56324a |= 4;
        }
        if (cdoz.m134482d()) {
            zzp zzp2 = bmzi != null ? (zzp) bmzi.mo6606a() : null;
            if (!(intent == null || (a = m23837a(intent.getExtras(), "gms_trace_module_LOGGED")) == null)) {
                zzp2 = aabb.m21045a(a, zzp2);
                try {
                    intent.removeExtra("gms_trace_module_LOGGED");
                } catch (BadParcelableException e) {
                    Log.e("AbstractGmsTracer", "Exception unparcelling Intent while removing swallowed", e);
                    return null;
                }
            }
            if (zzp2 != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                zzq zzq3 = (zzq) da.f164949b;
                zzp2.getClass();
                zzq3.f56325b = zzp2;
                zzq3.f56324a |= 1;
            }
        } else if (!(bmzi == null || blkh.m107295b(blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS) || (zzp = (zzp) bmzi.mo6606a()) == null)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            zzq zzq4 = (zzq) da.f164949b;
            zzp.getClass();
            zzq4.f56325b = zzp;
            zzq4.f56324a |= 1;
        }
        aabd aabd = aabc.f27869a;
        if (!aabd.f27870a || aabd.f27871b == null || aabd.f27872c == null || aabd.f27873d == null) {
            i = 7;
        } else {
            boolean booleanValue = aabd.f27871b.booleanValue();
            if (!aabd.f27872c.booleanValue()) {
                i5 = 0;
            }
            int i9 = (booleanValue ? 1 : 0) + i5;
            if (!aabd.f27873d.booleanValue()) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            int i10 = i9 + i2;
            if (!aabd.f27874e) {
                i3 = 0;
            } else {
                i3 = 16;
            }
            int i11 = i10 + i3;
            if (!aabd.f27875f) {
                i4 = 0;
            } else {
                i4 = 32;
            }
            i = i11 + i4;
        }
        if (i != 7) {
            bxvd da4 = zzl.f56302c.mo74144da();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            zzl zzl = (zzl) da4.f164949b;
            zzl.f56304a |= 1;
            zzl.f56305b = i;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            zzq zzq5 = (zzq) da.f164949b;
            zzl zzl2 = (zzl) da4.mo74062i();
            zzl2.getClass();
            zzq5.f56328e = zzl2;
            zzq5.f56324a |= 8;
        }
        return (zzq) da.mo74062i();
    }
}
