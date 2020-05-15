package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* renamed from: waq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class waq {

    /* renamed from: a */
    public static final wap f50353a = new wag();

    /* renamed from: b */
    public static final wap f50354b = new wah();

    /* renamed from: c */
    public static final wap f50355c = new wai();

    /* renamed from: d */
    public static final wap f50356d = new waj();

    /* renamed from: f */
    private static Boolean f50357f;

    /* renamed from: g */
    private static wat f50358g;

    /* renamed from: h */
    private static waw f50359h;

    /* renamed from: i */
    private static String f50360i;

    /* renamed from: j */
    private static int f50361j = -1;

    /* renamed from: k */
    private static final ThreadLocal f50362k = new ThreadLocal();

    /* renamed from: l */
    private static final wan f50363l = new waf();

    /* renamed from: e */
    public final Context f50364e;

    private waq(Context context) {
        sdo.m34959a(context);
        this.f50364e = context;
    }

    /* renamed from: a */
    public static int m41673a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".");
            sb.append("ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get(null).equals(str)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException e) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e2) {
            String valueOf2 = String.valueOf(e2.getMessage());
            Log.e("DynamiteModule", valueOf2.length() == 0 ? new String("Failed to load module descriptor class: ") : "Failed to load module descriptor class: ".concat(valueOf2));
            return 0;
        }
    }

    /* renamed from: b */
    public static Cursor m41679b(Context context, String str, boolean z) {
        return context.getContentResolver().query(m41675a(str, z), null, null, null, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0072  */
    /* renamed from: c */
    private static int m41681c(Context context, String str, boolean z) {
        Throwable th;
        Cursor cursor = null;
        try {
            Cursor b = m41679b(context, str, z);
            if (b != null) {
                try {
                    if (b.moveToFirst()) {
                        int i = b.getInt(0);
                        if (i > 0) {
                            synchronized (waq.class) {
                                f50360i = b.getString(2);
                                int columnIndex = b.getColumnIndex("loaderVersion");
                                if (columnIndex >= 0) {
                                    f50361j = b.getInt(columnIndex);
                                }
                            }
                            wak wak = (wak) f50362k.get();
                            if (wak != null && wak.f50348a == null) {
                                wak.f50348a = b;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                return i;
                            }
                        }
                        cursor = b;
                        if (cursor != null) {
                        }
                        return i;
                    }
                } catch (Exception e) {
                    e = e;
                    cursor = b;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = b;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
            throw new wam("Failed to connect to dynamite module ContentResolver.");
        } catch (Exception e2) {
            e = e2;
            try {
                if (!(e instanceof wam)) {
                    throw new wam("V2 version check failed", e);
                }
                throw e;
            } catch (Throwable th3) {
                th = th3;
                if (cursor != null) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            if (cursor != null) {
            }
            throw th;
        }
    }

    /* renamed from: b */
    private static waq m41680b(Context context, String str) {
        String valueOf = String.valueOf(str);
        Log.i("DynamiteModule", valueOf.length() == 0 ? new String("Selected local version of ") : "Selected local version of ".concat(valueOf));
        return new waq(context.getApplicationContext());
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ca A[Catch:{ RemoteException -> 0x00f0, all -> 0x013c }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0113 A[SYNTHETIC, Splitter:B:73:0x0113] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:26:0x0067=Splitter:B:26:0x0067, B:41:0x008e=Splitter:B:41:0x008e} */
    /* renamed from: a */
    public static int m41674a(Context context, String str, boolean z) {
        try {
            synchronized (waq.class) {
                Boolean bool = f50357f;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                            if (classLoader == null) {
                                if (!"com.google.android.gms".equals(context.getApplicationContext().getPackageName())) {
                                    try {
                                        int c = m41681c(context, str, z);
                                        if (f50360i == null || f50360i.isEmpty()) {
                                            return c;
                                        }
                                        int i = Build.VERSION.SDK_INT;
                                        DelegateLastClassLoader delegateLastClassLoader = new DelegateLastClassLoader(f50360i, ClassLoader.getSystemClassLoader());
                                        m41678a(delegateLastClassLoader);
                                        declaredField.set(null, delegateLastClassLoader);
                                        f50357f = Boolean.TRUE;
                                        return c;
                                    } catch (wam e) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                        f50357f = bool;
                                        if (bool.booleanValue()) {
                                            wat a = m41677a(context);
                                            if (a == null) {
                                                return 0;
                                            }
                                            if (a.getIDynamiteLoaderVersion() >= 2) {
                                                return a.getModuleVersion2NoCrashUtils(vzs.m41642a(context), str, z);
                                            }
                                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                            return a.getModuleVersion2(vzs.m41642a(context), str, z);
                                        }
                                        try {
                                            return m41681c(context, str, z);
                                        } catch (wam e2) {
                                            String valueOf = String.valueOf(e2.getMessage());
                                            Log.w("DynamiteModule", valueOf.length() == 0 ? new String("Failed to retrieve remote module version: ") : "Failed to retrieve remote module version: ".concat(valueOf));
                                            return 0;
                                        }
                                    }
                                } else {
                                    declaredField.set(null, ClassLoader.getSystemClassLoader());
                                    bool = Boolean.FALSE;
                                }
                            } else if (classLoader == ClassLoader.getSystemClassLoader()) {
                                bool = Boolean.FALSE;
                            } else {
                                try {
                                    m41678a(classLoader);
                                } catch (wam e3) {
                                }
                                bool = Boolean.TRUE;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e4) {
                        String valueOf2 = String.valueOf(e4);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 30);
                        sb.append("Failed to load module via V2: ");
                        sb.append(valueOf2);
                        Log.w("DynamiteModule", sb.toString());
                        bool = Boolean.FALSE;
                        f50357f = bool;
                        if (bool.booleanValue()) {
                        }
                    }
                }
            }
        } catch (RemoteException e5) {
            String valueOf3 = String.valueOf(e5.getMessage());
            Log.w("DynamiteModule", valueOf3.length() == 0 ? new String("Failed to retrieve remote module version: ") : "Failed to retrieve remote module version: ".concat(valueOf3));
            return 0;
        } catch (Throwable th) {
            if (!sqr.m35998a()) {
                sqx.m36053a(context, th);
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static Uri m41675a(String str, boolean z) {
        String str2 = !z ? "api" : "api_force_staging";
        StringBuilder sb = new StringBuilder(str2.length() + 42 + String.valueOf(str).length());
        sb.append("content://com.google.android.gms.chimera/");
        sb.append(str2);
        sb.append("/");
        sb.append(str);
        return Uri.parse(sb.toString());
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static waq m41676a(Context context, wap wap, String str) {
        waq b;
        ThreadLocal threadLocal;
        Boolean bool;
        waq waq;
        vzr vzr;
        waw waw;
        Boolean valueOf;
        vzr vzr2;
        wak wak = (wak) f50362k.get();
        wak wak2 = new wak();
        f50362k.set(wak2);
        try {
            wao a = wap.mo29006a(context, str, f50363l);
            int i = a.f50350a;
            int i2 = a.f50351b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str).length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(":");
            sb.append(i);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(":");
            sb.append(i2);
            Log.i("DynamiteModule", sb.toString());
            int i3 = a.f50352c;
            if (!(i3 == 0 || (i3 == -1 && a.f50350a == 0))) {
                boolean z = true;
                if (!(i3 == 1 && a.f50351b == 0)) {
                    if (i3 == -1) {
                        b = m41680b(context, str);
                        Cursor cursor = wak2.f50348a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal = f50362k;
                    } else if (i3 == 1) {
                        try {
                            int i4 = a.f50351b;
                            try {
                                synchronized (waq.class) {
                                    bool = f50357f;
                                }
                                if (bool != null) {
                                    if (bool.booleanValue()) {
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 51);
                                        sb2.append("Selected remote version of ");
                                        sb2.append(str);
                                        sb2.append(", version >= ");
                                        sb2.append(i4);
                                        Log.i("DynamiteModule", sb2.toString());
                                        synchronized (waq.class) {
                                            waw = f50359h;
                                        }
                                        if (waw != null) {
                                            wak wak3 = (wak) f50362k.get();
                                            if (wak3 == null || wak3.f50348a == null) {
                                                throw new wam("No result cursor");
                                            }
                                            Context applicationContext = context.getApplicationContext();
                                            Cursor cursor2 = wak3.f50348a;
                                            vzs.m41642a((Object) null);
                                            synchronized (waq.class) {
                                                if (f50361j < 2) {
                                                    z = false;
                                                }
                                                valueOf = Boolean.valueOf(z);
                                            }
                                            if (!valueOf.booleanValue()) {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                vzr2 = waw.loadModule2(vzs.m41642a(applicationContext), str, i4, vzs.m41642a(cursor2));
                                            } else {
                                                vzr2 = waw.loadModule2NoCrashUtils(vzs.m41642a(applicationContext), str, i4, vzs.m41642a(cursor2));
                                            }
                                            Context context2 = (Context) vzs.m41641a(vzr2);
                                            if (context2 != null) {
                                                waq = new waq(context2);
                                            } else {
                                                throw new wam("Failed to get module context");
                                            }
                                        } else {
                                            throw new wam("DynamiteLoaderV2 was not cached.");
                                        }
                                    } else {
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 51);
                                        sb3.append("Selected remote version of ");
                                        sb3.append(str);
                                        sb3.append(", version >= ");
                                        sb3.append(i4);
                                        Log.i("DynamiteModule", sb3.toString());
                                        wat a2 = m41677a(context);
                                        if (a2 != null) {
                                            if (a2.getIDynamiteLoaderVersion() < 2) {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                vzr = a2.createModuleContext(vzs.m41642a(context), str, i4);
                                            } else {
                                                vzr = a2.createModuleContextNoCrashUtils(vzs.m41642a(context), str, i4);
                                            }
                                            if (vzs.m41641a(vzr) != null) {
                                                waq = new waq((Context) vzs.m41641a(vzr));
                                            } else {
                                                throw new wam("Failed to load remote module.");
                                            }
                                        } else {
                                            throw new wam("Failed to create IDynamiteLoader.");
                                        }
                                    }
                                    Cursor cursor3 = wak2.f50348a;
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                    f50362k.set(wak);
                                    return waq;
                                }
                                throw new wam("Failed to determine which loading route to use.");
                            } catch (RemoteException e) {
                                throw new wam("Failed to load remote module.", e);
                            } catch (wam e2) {
                                throw e2;
                            } catch (Throwable th) {
                                if (!sqr.m35998a()) {
                                    sqx.m36053a(context, th);
                                    throw new wam("Failed to load remote module.", th);
                                }
                                throw th;
                            }
                        } catch (wam e3) {
                            String valueOf2 = String.valueOf(e3.getMessage());
                            Log.w("DynamiteModule", valueOf2.length() == 0 ? new String("Failed to load remote module: ") : "Failed to load remote module: ".concat(valueOf2));
                            int i5 = a.f50350a;
                            if (i5 == 0 || wap.mo29006a(context, str, new wal(i5)).f50352c != -1) {
                                throw new wam("Remote load failed. No local fallback found.", e3);
                            }
                            b = m41680b(context, str);
                            Cursor cursor4 = wak2.f50348a;
                            if (cursor4 != null) {
                                cursor4.close();
                            }
                            threadLocal = f50362k;
                        }
                    } else {
                        StringBuilder sb4 = new StringBuilder(47);
                        sb4.append("VersionPolicy returned invalid code:");
                        sb4.append(0);
                        throw new wam(sb4.toString());
                    }
                    threadLocal.set(wak);
                    return b;
                }
            }
            int i6 = a.f50350a;
            int i7 = a.f50351b;
            StringBuilder sb5 = new StringBuilder(91);
            sb5.append("No acceptable module found. Local version is ");
            sb5.append(i6);
            sb5.append(" and remote version is ");
            sb5.append(i7);
            sb5.append(".");
            throw new wam(sb5.toString());
        } catch (Throwable th2) {
            Cursor cursor5 = wak2.f50348a;
            if (cursor5 != null) {
                cursor5.close();
            }
            f50362k.set(wak);
            throw th2;
        }
    }

    /* renamed from: a */
    private static wat m41677a(Context context) {
        synchronized (waq.class) {
            if (f50358g == null) {
                try {
                    wat asInterface = was.asInterface((IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance());
                    if (asInterface != null) {
                        f50358g = asInterface;
                        return asInterface;
                    }
                } catch (Exception e) {
                    String valueOf = String.valueOf(e.getMessage());
                    Log.e("DynamiteModule", valueOf.length() == 0 ? new String("Failed to load IDynamiteLoader from GmsCore: ") : "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf));
                }
            } else {
                wat wat = f50358g;
                return wat;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static void m41678a(ClassLoader classLoader) {
        try {
            f50359h = wav.asInterface((IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new wam("Failed to instantiate dynamite loader", e);
        }
    }

    /* renamed from: a */
    public final IBinder mo29007a(String str) {
        try {
            return (IBinder) this.f50364e.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new wam(str.length() == 0 ? new String("Failed to instantiate module class: ") : "Failed to instantiate module class: ".concat(str), e);
        }
    }
}
