package com.google.android.gms.chimera.container;

import android.content.Context;
import android.database.Cursor;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.chimera.config.InvalidConfigException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DynamiteLoaderImpl extends was implements qme {

    /* renamed from: a */
    private static final String f29973a = String.valueOf(DynamiteLoaderImpl.class.getName()).concat("$GmsProcessDynamiteLoaderImpl");

    /* renamed from: b */
    private final qme f29974b;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    class GmsProcessDynamiteLoaderImpl implements qme {
        GmsProcessDynamiteLoaderImpl() {
        }

        public final Context loadModule(Context context, String str, int i, Cursor cursor) {
            djz a;
            int i2;
            int i3 = cursor.getInt(5);
            long j = cursor.getLong(6);
            qlr a2 = qlr.m32402a(context);
            if (a2 == null) {
                Log.e("DynamiteLoaderImpl", "Failed to create dynamite context.");
                return null;
            }
            dfy a3 = dfy.m8329a(a2);
            dfs dfs = new dfs();
            StrictMode.ThreadPolicy a4 = stl.m36298a();
            try {
                a = a3.mo8884a(dfs);
                if (j == dfs.f13020a) {
                    i2 = 2;
                    while (true) {
                        Context a5 = a3.mo8882a(a2, a, i3);
                        StrictMode.setThreadPolicy(a4);
                        return a5;
                    }
                }
                throw new InvalidConfigException("module configuration is not current");
            } catch (InvalidConfigException e) {
                if (i2 != 0) {
                    a = a3.mo8884a(dfs);
                    int a6 = qmj.m32437a(a, str, i);
                    if (a6 >= 0) {
                        i2--;
                        i3 = a6;
                    } else {
                        throw e;
                    }
                } else {
                    throw e;
                }
            } catch (InvalidConfigException e2) {
                int a7 = qmj.m32437a(a, str, i);
                if (a7 >= 0) {
                    i3 = a7;
                } else {
                    throw e2;
                }
            } catch (InvalidConfigException e3) {
                try {
                    String valueOf = String.valueOf(e3.getMessage());
                    Log.e("DynamiteLoaderImpl", valueOf.length() == 0 ? new String("Failed to load module from gms config:") : "Failed to load module from gms config:".concat(valueOf));
                    return null;
                } finally {
                    StrictMode.setThreadPolicy(a4);
                }
            }
        }

        public final Cursor queryForDynamiteModule(Context context, String str, boolean z) {
            return qmj.m32440a().mo24108a(context, null, waq.m41675a(str, z), z, false);
        }
    }

    public DynamiteLoaderImpl() {
        qme qme;
        if (rpr.m34215a()) {
            ClassLoader classLoader = getClass().getClassLoader();
            bmzs.m108696a(classLoader);
            qme = (qme) classLoader.loadClass(f29973a).asSubclass(qme.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } else {
            qme = null;
        }
        this.f29974b = qme;
    }

    /* renamed from: a */
    private final qme m22391a() {
        qme qme = this.f29974b;
        return qme != null ? qme : this;
    }

    public vzr createModuleContext(vzr vzr, String str, int i) {
        Context context = (Context) vzs.m41641a(vzr);
        if (context == null) {
            return vzs.m41642a((Object) null);
        }
        try {
            return createModuleContextNoCrashUtils(vzr, str, i);
        } catch (Throwable th) {
            if (!sqr.m35998a()) {
                sqx.m36053a(context, th);
            }
            throw th;
        }
    }

    public vzr createModuleContextNoCrashUtils(vzr vzr, String str, int i) {
        Cursor queryForDynamiteModule;
        Context context = (Context) vzs.m41641a(vzr);
        if (context == null) {
            return vzs.m41642a((Object) null);
        }
        qme a = m22391a();
        try {
            queryForDynamiteModule = a.queryForDynamiteModule(context, str, false);
            if (queryForDynamiteModule != null) {
                if (queryForDynamiteModule.moveToFirst()) {
                    if (queryForDynamiteModule.getInt(0) < i) {
                        Log.e("DynamiteLoaderImpl", "Requested feature version is not available.");
                        vzr a2 = vzs.m41642a((Object) null);
                        queryForDynamiteModule.close();
                        return a2;
                    }
                    vzr a3 = vzs.m41642a(a.loadModule(context, str, i, queryForDynamiteModule));
                    queryForDynamiteModule.close();
                    return a3;
                }
            }
            Log.w("DynamiteLoaderImpl", "Failed to load remote feature.");
            vzr a4 = vzs.m41642a((Object) null);
            if (queryForDynamiteModule != null) {
                queryForDynamiteModule.close();
            }
            return a4;
        } catch (Throwable th) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
            sb.append("Error creating module context: ");
            sb.append(valueOf);
            Log.e("DynamiteLoaderImpl", sb.toString());
            throw th;
        }
        throw th;
    }

    public int getIDynamiteLoaderVersion() {
        return 2;
    }

    public int getModuleVersion(vzr vzr, String str) {
        return getModuleVersion2(vzr, str, true);
    }

    public int getModuleVersion2(vzr vzr, String str, boolean z) {
        Context context = (Context) vzs.m41641a(vzr);
        if (context == null) {
            Log.w("DynamiteLoaderImpl", "Invalid client Context.");
            return 0;
        }
        try {
            return getModuleVersion2NoCrashUtils(vzr, str, z);
        } catch (Exception e) {
            if (!sqr.m35998a()) {
                sqx.m36053a(context, e);
            }
            throw e;
        }
    }

    public int getModuleVersion2NoCrashUtils(vzr vzr, String str, boolean z) {
        Cursor queryForDynamiteModule;
        Context context = (Context) vzs.m41641a(vzr);
        if (context == null) {
            Log.w("DynamiteLoaderImpl", "Invalid client Context.");
            return 0;
        }
        try {
            queryForDynamiteModule = m22391a().queryForDynamiteModule(context, str, z);
            if (queryForDynamiteModule != null) {
                if (queryForDynamiteModule.moveToFirst()) {
                    int i = queryForDynamiteModule.getInt(0);
                    queryForDynamiteModule.close();
                    return i;
                }
            }
            Log.w("DynamiteLoaderImpl", "Failed to retrieve remote feature version.");
            if (queryForDynamiteModule != null) {
                queryForDynamiteModule.close();
            }
            return 0;
        } catch (Exception e) {
            Log.e("DynamiteLoaderImpl", "Error retrieving remote feature version: ", e);
            return 0;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public Context loadModule(Context context, String str, int i, Cursor cursor) {
        return wba.m41703a(context).mo29009a(context, str, i, cursor);
    }

    public Cursor queryForDynamiteModule(Context context, String str, boolean z) {
        return waq.m41679b(context, str, z);
    }
}
