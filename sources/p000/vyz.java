package p000;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;

/* renamed from: vyz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vyz {

    /* renamed from: a */
    public static final vyh f50262a = new vyh();

    /* renamed from: b */
    public final Context f50263b;

    /* renamed from: c */
    public final vyv f50264c;

    /* renamed from: d */
    public final vxu f50265d;

    /* renamed from: e */
    private final vye f50266e;

    /* renamed from: f */
    private final vxt f50267f;

    public vyz(Context context, vyv vyv, vye vye, vxt vxt, vxu vxu) {
        this.f50263b = context;
        this.f50264c = vyv;
        this.f50266e = vye;
        this.f50267f = vxt;
        this.f50265d = vxu;
    }

    /* renamed from: a */
    private final boolean m41624a(File file) {
        try {
            return this.f50266e.mo28956a(file);
        } catch (GeneralSecurityException e) {
            String absolutePath = file.getAbsolutePath();
            StringBuilder sb = new StringBuilder(String.valueOf(absolutePath).length() + 37);
            sb.append("APK at ");
            sb.append(absolutePath);
            sb.append(" failed signature verification");
            Log.e("DG", sb.toString(), e);
            vxt vxt = this.f50267f;
            if (vxt == null) {
                return false;
            }
            vxt.mo28911a(e);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ac, code lost:
        throw new p000.vyw(r8, "Couldn't load VM class", r7);
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a4 A[Catch:{ vxy -> 0x00ad, ClassNotFoundException -> 0x00a4, vxy -> 0x0097, ClassNotFoundException -> 0x00a4, all -> 0x00a2 }, ExcHandler: ClassNotFoundException (r7v2 'e' java.lang.ClassNotFoundException A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:2:0x0003] */
    /* renamed from: a */
    public final Class mo28987a(vyy vyy, byte[] bArr) {
        Class cls;
        synchronized (f50262a) {
            try {
                cls = (Class) f50262a.mo28957a(vyy);
                if (cls == null) {
                    vyx a = this.f50264c.mo28981a(vyy);
                    if (a == null) {
                        String str = vyy.f50261a;
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30);
                        sb.append("VM key ");
                        sb.append(str);
                        sb.append(" not found in the cache");
                        throw new vyw(bArr, sb.toString());
                    } else if (m41624a(a.f50258a)) {
                        this.f50265d.mo28934a(7, vxw.FINE);
                        DexClassLoader dexClassLoader = new DexClassLoader(a.f50258a.getAbsolutePath(), a.f50259b.getAbsolutePath(), null, this.f50263b.getClassLoader());
                        this.f50265d.mo28934a(8, vxw.FINE);
                        cls = dexClassLoader.loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                        f50262a.f50229a.put(vyy, cls);
                    } else {
                        vxl.m41539a(a.mo28983a());
                        throw new ClassNotFoundException("APK signature verification failed");
                    }
                } else {
                    vyv.m41615a(this.f50264c.mo28980a(vyy.f50261a));
                }
            } catch (vxy e) {
                throw new vyw(bArr, "Exception in VM cache lookup", e);
            } catch (ClassNotFoundException e2) {
            } catch (vxy e3) {
                vxt vxt = this.f50267f;
                if (vxt != null) {
                    vxt.mo28911a(e3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cls;
    }

    /* renamed from: a */
    public final vza mo28988a(String str, vyj vyj, Object obj, DroidGuardResultsRequest droidGuardResultsRequest) {
        Bundle bundle;
        Class a = mo28987a(vyj.f50236b, vyj.f50238d);
        if (droidGuardResultsRequest != null) {
            bundle = droidGuardResultsRequest.f31252a;
        } else {
            bundle = null;
        }
        return new vza(a, this.f50263b, str, vyj, obj, vyj.f50238d, bundle);
    }
}
