package p000;

import android.content.Context;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.config.InvalidConfigException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: djw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class djw {

    /* renamed from: a */
    private final Class f13369a;

    /* renamed from: b */
    private final C1231nx f13370b;

    /* renamed from: c */
    private WeakReference f13371c = new WeakReference(null);

    public djw(Class cls, int i) {
        C1231nx nxVar = null;
        this.f13369a = cls;
        if (i > 0) {
            int highestOneBit = Integer.highestOneBit(i);
            nxVar = new C1231nx(Math.max((int) (((((long) (i > highestOneBit ? highestOneBit + highestOneBit : highestOneBit)) * 3) / 4) - 1), 2));
        }
        this.f13370b = nxVar;
    }

    /* renamed from: a */
    public final boolean mo9147a(Context context, dju dju) {
        return mo9148a(context, dju, dju.getClass().getName());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo8643a(dju dju, brtm brtm, String str, djv djv);

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x019f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01a1, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b9, code lost:
        r10 = java.lang.String.valueOf(r25);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c5, code lost:
        if (r10.length() != 0) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c7, code lost:
        r10 = new java.lang.String("No registered Chimera impl for ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cd, code lost:
        r10 = "No registered Chimera impl for ".concat(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d4, code lost:
        throw new com.google.android.chimera.config.InvalidConfigException(r10);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x019f A[ExcHandler: ClassCastException | ClassNotFoundException (e java.lang.Throwable), Splitter:B:94:0x0169] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0133 A[EDGE_INSN: B:128:0x0133->B:80:0x0133 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x015c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0152 A[Catch:{ all -> 0x01f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0158 A[LOOP:0: B:4:0x0025->B:90:0x0158, LOOP_END] */
    /* renamed from: a */
    public final boolean mo9148a(Context context, dju dju, String str) {
        djt djt;
        Object a;
        String str2;
        Class<? extends U> asSubclass;
        Method method;
        Constructor<? extends U> constructor;
        int i;
        Context context2 = context;
        dju dju2 = dju;
        String str3 = str;
        dfy a2 = dfy.m8329a(context);
        djv djv = new djv();
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            dfq.m8314a();
            boolean z = false;
            boolean z2 = !cdjl.m133596b();
            Context context3 = null;
            djt djt2 = null;
            boolean z3 = false;
            while (true) {
                try {
                    djz f = a2.mo8898f();
                    try {
                        if (this.f13370b == null) {
                            djt2 = null;
                        } else if (this.f13371c.get() != f) {
                            this.f13370b.mo15548a();
                            this.f13371c = new WeakReference(f);
                            djt2 = null;
                        } else {
                            djt2 = (djt) this.f13370b.mo15546a(str3);
                        }
                        if (djt2 == null) {
                            try {
                                djv.f13364c = -1;
                                djv.f13365d = "";
                                djv.f13366e = djv.f13362a;
                                djv.f13367f = djv.f13363b;
                                djv.f13368g = z;
                                brtm f2 = f.mo9181f();
                                String E = f2.mo69896E();
                                if (!mo8643a(dju2, f2, dmv.m8834a(E, str3), djv)) {
                                    if (!z2) {
                                        if (!dju2.mo9146c(context2)) {
                                            break;
                                        }
                                        try {
                                            if (a2.mo8898f() == f) {
                                                break;
                                            }
                                            z2 = true;
                                            z3 = true;
                                            if (context3 == null) {
                                                z = false;
                                            } else {
                                                StrictMode.setThreadPolicy(allowThreadDiskWrites);
                                                if (djt2 == null) {
                                                    int i2 = djv.f13364c;
                                                    str2 = djv.f13365d;
                                                    Class[] clsArr = djv.f13367f;
                                                    Object[] objArr = djv.f13366e;
                                                    try {
                                                        asSubclass = context3.getClassLoader().loadClass(str2).asSubclass(dix.class);
                                                        constructor = asSubclass.getConstructor(clsArr);
                                                        method = null;
                                                    } catch (NoSuchMethodException e) {
                                                        method = asSubclass.getDeclaredMethod("provideInstance", new Class[0]);
                                                        constructor = null;
                                                    } catch (ClassCastException | ClassNotFoundException e2) {
                                                    }
                                                    djt = new djt(i2, str2, constructor, objArr, method);
                                                } else {
                                                    djt = djt2;
                                                }
                                                if (djt != null || (a = djt.mo9144a(this.f13369a)) == null) {
                                                    return false;
                                                }
                                                C1231nx nxVar = this.f13370b;
                                                if (nxVar != null && djt2 == null) {
                                                    nxVar.mo15547a(str3, djt);
                                                }
                                                dju2.mo8648a(a, context3);
                                                return true;
                                            }
                                        } catch (InvalidConfigException e3) {
                                            e = e3;
                                            z2 = true;
                                            if (z3) {
                                            }
                                        }
                                    } else {
                                        break;
                                    }
                                } else if (djv.f13368g) {
                                    break;
                                } else {
                                    bmzs.m108698a(djv.f13364c >= 0 && !TextUtils.isEmpty(djv.f13365d));
                                    bmzs.m108698a(djv.f13366e.length == djv.f13367f.length);
                                    djv.f13365d = dmv.m8840b(E, djv.f13365d);
                                    i = djv.f13364c;
                                }
                            } catch (IndexOutOfBoundsException e4) {
                                dfq.m8314a();
                                if (cdjl.f180997a.mo6606a().mo77691E()) {
                                    String valueOf = String.valueOf(str);
                                    throw new InvalidConfigException(valueOf.length() == 0 ? new String("IndexOutOfBounds retrieving Chimera impl for ") : "IndexOutOfBounds retrieving Chimera impl for ".concat(valueOf));
                                }
                                throw e4;
                            } catch (InvalidConfigException e5) {
                                e = e5;
                                if (z3) {
                                }
                            }
                        } else {
                            i = djt2.f13357a;
                        }
                        context3 = a2.mo8882a(context2, f, i);
                        if (context3 == null) {
                            try {
                                String valueOf2 = String.valueOf(str);
                                Log.e("ChimeraProxyRslvr", valueOf2.length() == 0 ? new String("Failed to load module containing Chimera impl for ") : "Failed to load module containing Chimera impl for ".concat(valueOf2));
                            } catch (InvalidConfigException e6) {
                                e = e6;
                                if (z3) {
                                    String valueOf3 = String.valueOf(e.toString());
                                    Log.e("ChimeraProxyRslvr", valueOf3.length() == 0 ? new String("Chimera config error: ") : "Chimera config error: ".concat(valueOf3));
                                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                                    return false;
                                }
                                dju.mo9145c();
                                z3 = true;
                                if (context3 == null) {
                                }
                            }
                        }
                    } catch (InvalidConfigException e7) {
                        e = e7;
                        djt2 = null;
                        if (z3) {
                        }
                    }
                } catch (InvalidConfigException e8) {
                    e = e8;
                    if (z3) {
                    }
                }
                if (context3 == null) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
            String valueOf4 = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 24 + String.valueOf(valueOf4).length());
            sb.append("Failed to instantiate ");
            sb.append(str2);
            sb.append(": ");
            sb.append(valueOf4);
            Log.e("ChimeraProxyRslvr", sb.toString());
            djt = null;
            if (djt != null) {
                return false;
            }
            return false;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }
}
