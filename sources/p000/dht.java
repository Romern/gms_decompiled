package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/* renamed from: dht */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class dht {

    /* renamed from: a */
    private final int f13184a;

    /* renamed from: e */
    protected final Context f13185e;

    /* renamed from: f */
    protected final int f13186f;

    /* renamed from: g */
    public String f13187g;

    /* renamed from: h */
    public String f13188h;

    /* renamed from: i */
    public final dhs f13189i;

    protected dht(Context context, int i, int i2, dhs dhs) {
        this.f13185e = context.getApplicationContext();
        this.f13184a = i;
        this.f13186f = i2;
        this.f13189i = dhs;
    }

    /* renamed from: a */
    public static dht m8526a(Context context, djy djy) {
        int a = dik.m8576a(djy.mo9149a());
        if (a == 0) {
            int a2 = djy.mo9149a();
            StringBuilder sb = new StringBuilder(44);
            sb.append("ModuleApk has invalid APK type (");
            sb.append(a2);
            sb.append(")");
            Log.e("ChimeraModuleApk", sb.toString());
            return null;
        }
        int a3 = dkc.m8723a(djy.mo9158i());
        if (a3 != 0) {
            return m8527a(context, djy.mo9151b(), a, djy.mo9162m(), a3, djy.mo9161l(), djy.mo9163n(), djy.mo9164o(), djy.mo9165p());
        }
        int i = djy.mo9158i();
        StringBuilder sb2 = new StringBuilder(47);
        sb2.append("ModuleApk has invalid source type (");
        sb2.append(i);
        sb2.append(")");
        Log.e("ChimeraModuleApk", sb2.toString());
        return null;
    }

    /* renamed from: a */
    public abstract ApplicationInfo mo8907a();

    /* renamed from: a */
    public abstract ClassLoader mo8908a(ClassLoader classLoader);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo8909a(djy djy);

    /* renamed from: b */
    public abstract String mo8910b();

    /* renamed from: c */
    public Resources mo8911c() {
        try {
            Resources resourcesForApplication = this.f13185e.getPackageManager().getResourcesForApplication(mo8907a());
            if (resourcesForApplication != null && resourcesForApplication.getAssets() != null) {
                return resourcesForApplication;
            }
            throw new djq(String.valueOf(toString()).concat(" resources are null"));
        } catch (Exception e) {
            dgd.m8383a(this.f13185e, 19, e.toString());
            throw new djq("Error in getResources()", e);
        }
    }

    /* renamed from: e */
    public din mo8913e() {
        return (din) mo8962j().mo74062i();
    }

    /* renamed from: f */
    public abstract din mo8914f();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public bxvd mo8962j() {
        bxvd da = din.f13229r.mo74144da();
        int i = this.f13184a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        din din = (din) da.f164949b;
        din.f13232b = i - 1;
        int i2 = din.f13231a | 1;
        din.f13231a = i2;
        int i3 = this.f13186f;
        int i4 = i2 | 1024;
        din.f13231a = i4;
        din.f13243m = i3;
        dhs dhs = this.f13189i;
        if (dhs != null) {
            String str = dhs.f13182a;
            str.getClass();
            int i5 = i4 | 4096;
            din.f13231a = i5;
            din.f13245o = str;
            String str2 = dhs.f13183b;
            str2.getClass();
            din.f13231a = i5 | 8192;
            din.f13246p = str2;
        }
        return da;
    }

    /* renamed from: k */
    public dmj mo8966k() {
        InputStream open;
        String valueOf = String.valueOf(toString());
        if (valueOf.length() == 0) {
            new String("Loading chimera manifest from ");
        } else {
            "Loading chimera manifest from ".concat(valueOf);
        }
        try {
            try {
                open = mo8911c().getAssets().open("ChimeraManifest.pb");
                dmj a = m8528a(open);
                if (open != null) {
                    open.close();
                }
                return a;
            } catch (IOException e) {
                String valueOf2 = String.valueOf(this);
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 40 + String.valueOf(message).length());
                sb.append("Failed to read chimera manifests from ");
                sb.append(valueOf2);
                sb.append(": ");
                sb.append(message);
                Log.w("ChimeraModuleApk", sb.toString());
                return null;
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
            throw th;
        } catch (PackageManager.NameNotFoundException | djq e2) {
            String valueOf3 = String.valueOf(e2.getMessage());
            Log.e("ChimeraModuleApk", valueOf3.length() == 0 ? new String("Failed to load module resources for manifest: ") : "Failed to load module resources for manifest: ".concat(valueOf3));
            return null;
        }
    }

    /* renamed from: m */
    public final String mo9029m() {
        String b = mo8910b();
        if (b != null) {
            return Uri.fromFile(new File(b)).toString();
        }
        return null;
    }

    /* renamed from: n */
    public final String mo9030n() {
        InputStream openRawResource;
        try {
            String str = mo8914f().f13236f;
            Resources c = mo8911c();
            openRawResource = c.openRawResource(c.getIdentifier("third_party_licenses", "raw", str));
            String next = new Scanner(openRawResource).useDelimiter("\\A").next();
            if (openRawResource != null) {
                openRawResource.close();
            }
            return next;
        } catch (PackageManager.NameNotFoundException | Resources.NotFoundException | djq | IOException e) {
            String b = mo8910b();
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 41 + String.valueOf(valueOf).length());
            sb.append("Failed to get third party licenses for ");
            sb.append(b);
            sb.append(": ");
            sb.append(valueOf);
            sb.toString();
            return null;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: o */
    public boolean mo8963o() {
        return false;
    }

    /* renamed from: p */
    public boolean mo8964p() {
        return false;
    }

    /* renamed from: a */
    public static dht m8527a(Context context, String str, int i, int i2, int i3, int i4, String str2, String str3, String str4) {
        dhs dhs;
        String str5 = str3;
        String str6 = str4;
        if (str == null) {
            Log.e("ChimeraModuleApk", "Unable to create ModuleApk from invalid descriptor (path null)");
            return null;
        }
        if (str5 != null && str6 != null) {
            dhs = new dhs(str5, str6);
        } else if (str5 == null && str6 == null) {
            dhs = null;
        } else {
            Log.e("ChimeraModuleApk", str.length() == 0 ? new String("Invalid module.yaml info for apk: ") : "Invalid module.yaml info for apk: ".concat(str));
            return null;
        }
        int i5 = i - 1;
        if (i5 != 1) {
            if (i5 == 2) {
                return new dhc(context, i2, str);
            }
            if (i5 != 3) {
                if (i5 != 4) {
                    StringBuilder sb = new StringBuilder(43);
                    sb.append("Module APK type '");
                    sb.append(i5);
                    sb.append("' not supported");
                    Log.e("ChimeraModuleApk", sb.toString());
                    return null;
                } else if (str2 != null) {
                    Uri parse = Uri.parse(str2);
                    List<String> pathSegments = parse.getPathSegments();
                    if (!Objects.equals(parse.getScheme(), "split") || pathSegments.size() != 2) {
                        String valueOf = String.valueOf(parse);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 35 + str.length());
                        sb2.append("Bad source URI (");
                        sb2.append(valueOf);
                        sb2.append(") for split APK at ");
                        sb2.append(str);
                        Log.e("ChimeraSplitApk", sb2.toString());
                        return null;
                    } else if (pathSegments.get(0).equals(context.getPackageName())) {
                        return new dig(context, i2, pathSegments.get(1), str, dhs);
                    } else {
                        String valueOf2 = String.valueOf(pathSegments.get(0));
                        Log.e("ChimeraSplitApk", valueOf2.length() == 0 ? new String("Bad package name - cannot load split APKs from other packages: ") : "Bad package name - cannot load split APKs from other packages: ".concat(valueOf2));
                        return null;
                    }
                } else {
                    Log.e("ChimeraModuleApk", str.length() == 0 ? new String("Missing source URI for split APK at ") : "Missing source URI for split APK at ".concat(str));
                    return null;
                }
            } else if (str2 != null) {
                return new dgl(context, i2, str, i3, i4, str2, dhs);
            } else {
                Log.e("ChimeraModuleApk", str.length() == 0 ? new String("Missing source URI for file APK at ") : "Missing source URI for file APK at ".concat(str));
                return null;
            }
        } else if (str.equals(context.getPackageName())) {
            return new dfz(context);
        } else {
            Log.e("ChimeraModuleApk", "Unable to create ModuleApk from invalid descriptor (CONTAINER has incorrect package name)");
            return null;
        }
    }

    /* renamed from: a */
    public static dmj m8528a(InputStream inputStream) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        m8529a(inputStream, allocate.array());
        allocate.order(ByteOrder.BIG_ENDIAN);
        byte[] bArr = new byte[allocate.getInt()];
        m8529a(inputStream, bArr);
        return (dmj) bxvk.m124016a(dmj.f13537b, bArr, bxus.m123743b());
    }

    /* renamed from: a */
    private static void m8529a(InputStream inputStream, byte[] bArr) {
        int length;
        int i = 0;
        while (true) {
            length = bArr.length;
            int read = inputStream.read(bArr, i, length - i);
            if (read <= 0) {
                break;
            }
            i += read;
        }
        if (i < length) {
            throw new IOException(String.format("Input file too short (expected %d, got %d)", Integer.valueOf(length), Integer.valueOf(i)));
        }
    }

    /* renamed from: a */
    public boolean mo8957a(djy djy, boolean z) {
        return mo8909a(djy);
    }
}
