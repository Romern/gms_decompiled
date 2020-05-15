package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: aye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aye {

    /* renamed from: a */
    public static final Map f2532a = new HashMap();

    /* renamed from: a */
    public static ayu m2422a(bef bef, String str) {
        return m2423a(bef, str, true);
    }

    /* renamed from: b */
    public static ayu m2431b(Context context, int i) {
        try {
            return m2424a(context.getResources().openRawResource(i), m2434c(context, i));
        } catch (Resources.NotFoundException e) {
            return new ayu((Throwable) e);
        }
    }

    /* renamed from: c */
    public static ayu m2433c(Context context, String str) {
        try {
            String str2 = "asset_" + str;
            if (str.endsWith(".zip")) {
                return m2426a(new ZipInputStream(context.getAssets().open(str)), str2);
            }
            return m2424a(context.getAssets().open(str), str2);
        } catch (IOException e) {
            return new ayu((Throwable) e);
        }
    }

    /* renamed from: a */
    private static ayu m2423a(bef bef, String str, boolean z) {
        try {
            axw a = bdm.m2737a(bef);
            if (str != null) {
                baw.f2816a.mo2968a(str, a);
            }
            ayu ayu = new ayu(a);
            if (z) {
                ben.m2837a(bef);
            }
            return ayu;
        } catch (Exception e) {
            ayu ayu2 = new ayu((Throwable) e);
            if (z) {
                ben.m2837a(bef);
            }
            return ayu2;
        } catch (Throwable th) {
            if (z) {
                ben.m2837a(bef);
            }
            throw th;
        }
    }

    /* renamed from: b */
    public static ayx m2432b(Context context, String str) {
        return m2430a(str, new aya(context.getApplicationContext(), str));
    }

    /* renamed from: c */
    private static String m2434c(Context context, int i) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("rawRes");
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            str = "_night_";
        } else {
            str = "_day_";
        }
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: a */
    public static ayu m2424a(InputStream inputStream, String str) {
        try {
            return m2422a(bef.m2756a(ciqh.m150828a(ciqh.m150833a(inputStream))), str);
        } finally {
            ben.m2837a(inputStream);
        }
    }

    /* renamed from: a */
    public static ayu m2425a(String str) {
        return m2422a(bef.m2756a(ciqh.m150828a(ciqh.m150833a(new ByteArrayInputStream(str.getBytes())))), (String) null);
    }

    /* renamed from: a */
    public static ayu m2426a(ZipInputStream zipInputStream, String str) {
        ayu ayu;
        ayp ayp;
        try {
            HashMap hashMap = new HashMap();
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            Object obj = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    obj = m2423a(bef.m2756a(ciqh.m150828a(ciqh.m150833a(zipInputStream))), null, false).f2600a;
                } else if (!name.contains(".png") && !name.contains(".webp")) {
                    zipInputStream.closeEntry();
                } else {
                    String[] split = name.split("/");
                    hashMap.put(split[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (obj == null) {
                ayu = new ayu((Throwable) new IllegalArgumentException("Unable to parse composition"));
            } else {
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    Iterator it = ((axw) obj).f2508b.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            ayp = null;
                            break;
                        }
                        ayp = (ayp) it.next();
                        if (ayp.f2569d.equals(str2)) {
                            break;
                        }
                    }
                    if (ayp != null) {
                        ayp.f2570e = ben.m2832a((Bitmap) entry.getValue(), ayp.f2566a, ayp.f2567b);
                    }
                }
                Iterator it2 = ((axw) obj).f2508b.entrySet().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it2.next();
                        if (((ayp) entry2.getValue()).f2570e == null) {
                            ayu = new ayu((Throwable) new IllegalStateException("There is no image for " + ((ayp) entry2.getValue()).f2569d));
                            break;
                        }
                    } else {
                        if (str != null) {
                            baw.f2816a.mo2968a(str, (axw) obj);
                        }
                        ayu = new ayu(obj);
                    }
                }
            }
        } catch (IOException e) {
            ayu = new ayu((Throwable) e);
        } catch (Throwable th) {
            ben.m2837a(zipInputStream);
            throw th;
        }
        ben.m2837a(zipInputStream);
        return ayu;
    }

    /* renamed from: a */
    public static ayx m2427a(Context context, int i) {
        return m2430a(m2434c(context, i), new ayb(new WeakReference(context), context.getApplicationContext(), i));
    }

    /* renamed from: a */
    public static ayx m2428a(Context context, String str) {
        return m2430a("url_" + str, new axz(context, str));
    }

    /* renamed from: a */
    public static ayx m2429a(InputStream inputStream) {
        return m2430a((String) null, new ayc(inputStream));
    }

    /* renamed from: a */
    private static ayx m2430a(String str, Callable callable) {
        axw axw;
        if (str != null) {
            axw = (axw) baw.f2816a.f2817b.mo15546a(str);
        } else {
            axw = null;
        }
        if (axw != null) {
            return new ayx(new ayd(axw));
        }
        if (str != null && f2532a.containsKey(str)) {
            return (ayx) f2532a.get(str);
        }
        ayx ayx = new ayx(callable);
        ayx.mo2916b(new axx(str));
        ayx.mo2912a((ayq) new axy(str));
        f2532a.put(str, ayx);
        return ayx;
    }
}
