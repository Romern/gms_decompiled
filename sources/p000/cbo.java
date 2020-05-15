package p000;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.GeneratedAppGlideModule;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: cbo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbo implements ComponentCallbacks2 {

    /* renamed from: g */
    private static volatile cbo f6401g;

    /* renamed from: h */
    private static volatile boolean f6402h;

    /* renamed from: a */
    public final cgt f6403a;

    /* renamed from: b */
    public final cbr f6404b;

    /* renamed from: c */
    public final cby f6405c;

    /* renamed from: d */
    public final cgr f6406d;

    /* renamed from: e */
    public final coz f6407e;

    /* renamed from: f */
    public final List f6408f = new ArrayList();

    /* renamed from: i */
    private final chr f6409i;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cby.a(java.lang.Class, cdn):void
     arg types: [java.lang.Class, cll]
     candidates:
      cby.a(java.lang.Class, ccv):void
      cby.a(java.lang.Class, cdn):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cby.a(java.lang.Class, cdn):void
     arg types: [java.lang.Class, clk]
     candidates:
      cby.a(java.lang.Class, ccv):void
      cby.a(java.lang.Class, cdn):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cby.a(java.lang.Class, cdn):void
     arg types: [java.lang.Class, cnv]
     candidates:
      cby.a(java.lang.Class, ccv):void
      cby.a(java.lang.Class, cdn):void */
    public cbo(Context context, cfu cfu, chr chr, cgt cgt, cgr cgr, coz coz, Map map, List list) {
        this.f6403a = cgt;
        this.f6406d = cgr;
        this.f6409i = chr;
        this.f6407e = coz;
        Resources resources = context.getResources();
        cby cby = new cby();
        this.f6405c = cby;
        cby.mo3663a((ccx) new clw());
        int i = Build.VERSION.SDK_INT;
        this.f6405c.mo3663a((ccx) new cmi());
        List a = this.f6405c.mo3661a();
        cnr cnr = new cnr(context, a, cgt, cgr);
        cng cng = new cng(cgt, new cnf());
        cme cme = new cme(this.f6405c.mo3661a(), resources.getDisplayMetrics(), cgt, cgr);
        clo clo = new clo(cme);
        cmu cmu = new cmu(cme, cgr);
        cnn cnn = new cnn(context);
        ckc ckc = new ckc(resources);
        ckd ckd = new ckd(resources);
        ckb ckb = new ckb(resources);
        cka cka = new cka(resources);
        cll cll = new cll(cgr);
        coe coe = new coe();
        coh coh = new coh();
        ContentResolver contentResolver = context.getContentResolver();
        cby cby2 = this.f6405c;
        cby2.mo3665a(ByteBuffer.class, new cip());
        cby2.mo3665a(InputStream.class, new ckf(cgr));
        cby2.mo3670a("Bitmap", ByteBuffer.class, Bitmap.class, clo);
        cby2.mo3670a("Bitmap", InputStream.class, Bitmap.class, cmu);
        int i2 = Build.VERSION.SDK_INT;
        this.f6405c.mo3670a("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new cmp(cme));
        cby cby3 = this.f6405c;
        cby3.mo3670a("Bitmap", ParcelFileDescriptor.class, Bitmap.class, cng);
        cby3.mo3670a("Bitmap", AssetFileDescriptor.class, Bitmap.class, new cng(cgt, new cnb()));
        cby3.mo3668a(Bitmap.class, Bitmap.class, ckk.f6980a);
        cby3.mo3670a("Bitmap", Bitmap.class, Bitmap.class, new cmy());
        cby3.mo3666a(Bitmap.class, (cdn) cll);
        cby3.mo3670a("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new clj(resources, clo));
        cby3.mo3670a("BitmapDrawable", InputStream.class, BitmapDrawable.class, new clj(resources, cmu));
        cby3.mo3670a("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new clj(resources, cng));
        cby3.mo3666a(BitmapDrawable.class, (cdn) new clk(cgt, cll));
        cby3.mo3670a("Gif", InputStream.class, cnu.class, new cod(a, cnr, cgr));
        cby3.mo3670a("Gif", ByteBuffer.class, cnu.class, cnr);
        cby3.mo3666a(cnu.class, (cdn) new cnv());
        cby3.mo3668a(cco.class, cco.class, ckk.f6980a);
        cby3.mo3670a("Bitmap", cco.class, Bitmap.class, new cob(cgt));
        cby3.mo3667a(Uri.class, Drawable.class, cnn);
        cby3.mo3667a(Uri.class, Bitmap.class, new cms(cnn, cgt));
        cby3.mo3664a((cdu) new cnh());
        cby3.mo3668a(File.class, ByteBuffer.class, new cir());
        cby3.mo3668a(File.class, InputStream.class, new cix(new cjb()));
        cby3.mo3667a(File.class, File.class, new cnp());
        cby3.mo3668a(File.class, ParcelFileDescriptor.class, new cix(new ciy()));
        cby3.mo3668a(File.class, File.class, ckk.f6980a);
        cby3.mo3664a((cdu) new ced(cgr));
        int i3 = Build.VERSION.SDK_INT;
        this.f6405c.mo3664a((cdu) new ceg());
        cby cby4 = this.f6405c;
        cby4.mo3668a(Integer.TYPE, InputStream.class, ckc);
        cby4.mo3668a(Integer.TYPE, ParcelFileDescriptor.class, ckb);
        cby4.mo3668a(Integer.class, InputStream.class, ckc);
        cby4.mo3668a(Integer.class, ParcelFileDescriptor.class, ckb);
        cby4.mo3668a(Integer.class, Uri.class, ckd);
        cby4.mo3668a(Integer.TYPE, AssetFileDescriptor.class, cka);
        cby4.mo3668a(Integer.class, AssetFileDescriptor.class, cka);
        cby4.mo3668a(Integer.TYPE, Uri.class, ckd);
        cby4.mo3668a(String.class, InputStream.class, new civ());
        cby4.mo3668a(Uri.class, InputStream.class, new civ());
        cby4.mo3668a(String.class, InputStream.class, new cki());
        cby4.mo3668a(String.class, ParcelFileDescriptor.class, new ckh());
        cby4.mo3668a(String.class, AssetFileDescriptor.class, new ckg());
        cby4.mo3668a(Uri.class, InputStream.class, new ckw());
        cby4.mo3668a(Uri.class, InputStream.class, new cig(context.getAssets()));
        cby4.mo3668a(Uri.class, ParcelFileDescriptor.class, new cif(context.getAssets()));
        cby4.mo3668a(Uri.class, InputStream.class, new cky(context));
        cby4.mo3668a(Uri.class, InputStream.class, new cla(context));
        int i4 = Build.VERSION.SDK_INT;
        this.f6405c.mo3668a(Uri.class, InputStream.class, new clc(context, InputStream.class));
        this.f6405c.mo3668a(Uri.class, ParcelFileDescriptor.class, new clc(context, ParcelFileDescriptor.class));
        cby cby5 = this.f6405c;
        cby5.mo3668a(Uri.class, InputStream.class, new ckq(contentResolver));
        cby5.mo3668a(Uri.class, ParcelFileDescriptor.class, new cko(contentResolver));
        cby5.mo3668a(Uri.class, AssetFileDescriptor.class, new ckn(contentResolver));
        cby5.mo3668a(Uri.class, InputStream.class, new cks());
        cby5.mo3668a(URL.class, InputStream.class, new clf());
        cby5.mo3668a(Uri.class, File.class, new cji(context));
        cby5.mo3668a(cjd.class, InputStream.class, new cku());
        cby5.mo3668a(byte[].class, ByteBuffer.class, new cij());
        cby5.mo3668a(byte[].class, InputStream.class, new cin());
        cby5.mo3668a(Uri.class, Uri.class, ckk.f6980a);
        cby5.mo3668a(Drawable.class, Drawable.class, ckk.f6980a);
        cby5.mo3667a(Drawable.class, Drawable.class, new cno());
        cby5.mo3669a(Bitmap.class, BitmapDrawable.class, new cof(resources));
        cby5.mo3669a(Bitmap.class, byte[].class, coe);
        cby5.mo3669a(Drawable.class, byte[].class, new cog(cgt, coe, coh));
        cby5.mo3669a(cnu.class, byte[].class, coh);
        int i5 = Build.VERSION.SDK_INT;
        cng cng2 = new cng(cgt, new cnd());
        this.f6405c.mo3667a(ByteBuffer.class, Bitmap.class, cng2);
        this.f6405c.mo3667a(ByteBuffer.class, BitmapDrawable.class, new clj(resources, cng2));
        this.f6404b = new cbr(context, cgr, this.f6405c, map, list, cfu);
    }

    /* renamed from: a */
    public static cbo m3902a(Context context) {
        if (f6401g == null) {
            GeneratedAppGlideModule c = m3906c(context.getApplicationContext());
            synchronized (cbo.class) {
                if (f6401g == null) {
                    if (!f6402h) {
                        f6402h = true;
                        m3903a(context, new cbq(), c);
                        f6402h = false;
                    } else {
                        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
                    }
                }
            }
        }
        return f6401g;
    }

    /* renamed from: c */
    private static GeneratedAppGlideModule m3906c(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException e) {
            if (!Log.isLoggable("Glide", 5)) {
                return null;
            }
            Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            return null;
        } catch (InstantiationException e2) {
            m3904a(e2);
            return null;
        } catch (IllegalAccessException e3) {
            m3904a(e3);
            return null;
        } catch (NoSuchMethodException e4) {
            m3904a(e4);
            return null;
        } catch (InvocationTargetException e5) {
            m3904a(e5);
            return null;
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    /* renamed from: b */
    public static ccd m3905b(Context context) {
        crb.m7383a(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m3902a(context).f6407e.mo8074a(context);
    }

    public final void onLowMemory() {
        crd.m7393a();
        this.f6409i.mo8175b();
        this.f6403a.mo3879a();
        this.f6406d.mo3872a();
    }

    public final void onTrimMemory(int i) {
        crd.m7393a();
        synchronized (this.f6408f) {
            for (ccd ccd : this.f6408f) {
            }
        }
        chr chr = this.f6409i;
        if (i >= 40) {
            chr.mo8175b();
        } else if (i >= 20 || i == 15) {
            chr.mo8172a(chr.mo8171a() / 2);
        }
        this.f6403a.mo3880a(i);
        this.f6406d.mo3873a(i);
    }

    /* renamed from: a */
    private static void m3903a(Context context, cbq cbq, GeneratedAppGlideModule generatedAppGlideModule) {
        int i;
        cbq cbq2 = cbq;
        Context applicationContext = context.getApplicationContext();
        Collections.emptyList();
        if (generatedAppGlideModule == null) {
            cpj cpj = new cpj(applicationContext);
            ArrayList arrayList = new ArrayList();
            try {
                ApplicationInfo applicationInfo = cpj.f11770a.getPackageManager().getApplicationInfo(cpj.f11770a.getPackageName(), 128);
                if (applicationInfo.metaData != null) {
                    for (String str : applicationInfo.metaData.keySet()) {
                        if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                            arrayList.add(cpj.m7250a(str));
                        }
                    }
                }
                int size = arrayList.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    ((cph) arrayList.get(i3)).mo8082a();
                }
                if (cbq2.f6414e == null) {
                    chy chy = new chy(false);
                    chy.mo3911a(cid.m4293a());
                    chy.f6889a = "source";
                    cbq2.f6414e = chy.mo3910a();
                }
                if (cbq2.f6415f == null) {
                    chy chy2 = new chy(true);
                    chy2.mo3911a(1);
                    chy2.f6889a = "disk-cache";
                    cbq2.f6415f = chy2.mo3910a();
                }
                if (cbq2.f6417h == null) {
                    if (cid.m4293a() >= 4) {
                        i = 2;
                    } else {
                        i = 1;
                    }
                    chy chy3 = new chy(true);
                    chy3.mo3911a(i);
                    chy3.f6889a = "animation";
                    cbq2.f6417h = chy3.mo3910a();
                }
                if (cbq2.f6416g == null) {
                    cbq2.f6416g = new chu(new chs(applicationContext));
                }
                if (cbq2.f6421l == null) {
                    cbq2.f6421l = new cor();
                }
                if (cbq2.f6412c == null) {
                    int i4 = cbq2.f6416g.f6882a;
                    if (i4 > 0) {
                        cbq2.f6412c = new chc((long) i4);
                    } else {
                        cbq2.f6412c = new cgu();
                    }
                }
                if (cbq2.f6413d == null) {
                    cbq2.f6413d = new chb(cbq2.f6416g.f6884c);
                }
                if (cbq2.f6419j == null) {
                    cbq2.f6419j = new chr((long) cbq2.f6416g.f6883b);
                }
                if (cbq2.f6420k == null) {
                    cbq2.f6420k = new cho(applicationContext);
                }
                if (cbq2.f6411b == null) {
                    cbq2.f6411b = new cfu(cbq2.f6419j, cbq2.f6420k, cbq2.f6415f, cbq2.f6414e, new cid(new ThreadPoolExecutor(0, Integer.MAX_VALUE, cid.f6903a, TimeUnit.MILLISECONDS, new SynchronousQueue(), new cia("source-unlimited", cic.f6902b, false))), cbq2.f6417h);
                }
                List list = cbq2.f6418i;
                if (list == null) {
                    cbq2.f6418i = Collections.emptyList();
                } else {
                    cbq2.f6418i = Collections.unmodifiableList(list);
                }
                cbo cbo = new cbo(applicationContext, cbq2.f6411b, cbq2.f6419j, cbq2.f6412c, cbq2.f6413d, new coz(), cbq2.f6410a, cbq2.f6418i);
                int size2 = arrayList.size();
                while (i2 < size2) {
                    cph cph = (cph) arrayList.get(i2);
                    try {
                        cph.mo8083b();
                        i2++;
                    } catch (AbstractMethodError e) {
                        AbstractMethodError abstractMethodError = e;
                        String valueOf = String.valueOf(cph.getClass().getName());
                        throw new IllegalStateException(valueOf.length() == 0 ? new String("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ") : "Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(valueOf), abstractMethodError);
                    }
                }
                applicationContext.registerComponentCallbacks(cbo);
                f6401g = cbo;
            } catch (PackageManager.NameNotFoundException e2) {
                throw new RuntimeException("Unable to find metadata to parse GlideModules", e2);
            }
        } else {
            throw null;
        }
    }

    /* renamed from: a */
    private static void m3904a(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    /* renamed from: a */
    public final Context mo3656a() {
        return this.f6404b.getBaseContext();
    }
}
