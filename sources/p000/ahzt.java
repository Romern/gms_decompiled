package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: ahzt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ahzt {

    /* renamed from: b */
    private static final bngx f68496b = bngx.m109357a("com.android.settings", cfog.m141291s());

    /* renamed from: a */
    public ahws f68497a;

    /* renamed from: a */
    public static ahzt m56924a(aiaa aiaa, ahzs ahzs) {
        String str;
        ahzq ahzq = new ahzq();
        String str2 = aiaa.f68537y;
        if (str2 != null) {
            ahzq.f68486b = str2;
            if (ahzs != null) {
                ahzq.f68485a = ahzs;
                if (ahzs.equals(ahzs.MAIN)) {
                    ahzq.f68488d = aiaa.f68538z;
                } else if (!buqy.m120264a(aiaa)) {
                    ((bnsl) ahsd.f67925a.mo68388c()).mo68420a("FastPair: image is not supported with type %s on non-untethered device", ahzs);
                } else {
                    byzb byzb = aiaa.f68511I;
                    if (byzb == null) {
                        byzb = byzb.f169045j;
                    }
                    bzaa bzaa = byzb.f169050d;
                    if (bzaa == null) {
                        bzaa = bzaa.f169202d;
                    }
                    int ordinal = ahzs.ordinal();
                    if (ordinal == 1) {
                        str = bzaa.f169204a;
                    } else if (ordinal == 2) {
                        str = bzaa.f169205b;
                    } else if (ordinal != 3) {
                        ((bnsl) ahsd.f67925a.mo68388c()).mo68420a("FastPair: insufficient image info with type %s on untethered device", ahzs);
                    } else {
                        str = bzaa.f169206c;
                    }
                    ahzq.f68487c = str;
                }
                String str3 = ahzq.f68485a == null ? " type" : "";
                if (ahzq.f68486b == null) {
                    str3 = str3.concat(" modelId");
                }
                if (str3.isEmpty()) {
                    return new ahzo(ahzq.f68485a, ahzq.f68486b, ahzq.f68487c, ahzq.f68488d);
                }
                String valueOf = String.valueOf(str3);
                throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
            }
            throw new NullPointerException("Null type");
        }
        throw new NullPointerException("Null modelId");
    }

    /* renamed from: b */
    public static void m56928b(Context context) {
        File[] fileArr;
        File c = m56929c(context);
        if (c != null) {
            fileArr = c.listFiles();
        } else {
            fileArr = null;
        }
        int i = 0;
        if (fileArr != null) {
            int i2 = 0;
            while (i < fileArr.length) {
                if (fileArr[i].isFile() && fileArr[i].getName().endsWith(".png")) {
                    srn srn = ahsd.f67925a;
                    m56925a(context, fileArr[i]);
                    i2++;
                }
                i++;
            }
            i = i2;
        }
        ((bnsl) ahsd.f67925a.mo68390d()).mo68409a("FastPair: HeadsetPieceImage, grant permission files:%d", i);
    }

    /* renamed from: c */
    private static File m56929c(Context context) {
        File file = new File(context.getCacheDir(), "nearby_bluetooth_metadata");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        srn srn = ahsd.f67925a;
        return null;
    }

    /* renamed from: a */
    public abstract ahzs mo37319a();

    /* renamed from: b */
    public abstract String mo37320b();

    /* renamed from: c */
    public abstract String mo37321c();

    /* renamed from: d */
    public abstract bxtx mo37322d();

    /* renamed from: a */
    private static Uri m56925a(Context context, File file) {
        try {
            Uri a = C1136kk.m17966a(context, "com.google.android.gms.fileprovider", file);
            bnre i = f68496b.listIterator();
            while (i.hasNext()) {
                context.grantUriPermission((String) i.next(), a, 65);
                srn srn = ahsd.f67925a;
            }
            return a;
        } catch (IllegalArgumentException e) {
            bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68420a("FastPair: HeadsetPieceImage, failed to create content uri for file of %s", file);
            return null;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int, java.lang.Object):void
     arg types: [java.lang.String, int, java.lang.String]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, int, java.lang.Object):void */
    /* renamed from: a */
    public static void m56926a(Context context, String str) {
        File c = m56929c(context);
        int i = 0;
        if (c != null) {
            try {
                File[] listFiles = c.listFiles();
                int length = listFiles.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    try {
                        File file = listFiles[i2];
                        String name = file.getName();
                        if (name.length() >= str.length()) {
                            if (bmwb.m108443a(str, name.substring(0, str.length()))) {
                                file.delete();
                                i3++;
                                srn srn = ahsd.f67925a;
                                file.getCanonicalPath();
                            }
                        }
                        i2++;
                    } catch (IOException | SecurityException e) {
                        e = e;
                        i = i3;
                        bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
                        bnsl.mo68437a(e);
                        bnsl.mo68420a("FastPair: HeadsetPieceImage, unable to delete images by model id:%s", str);
                        ((bnsl) ahsd.f67925a.mo68390d()).mo68413a("FastPair: HeadsetPieceImage, delete files:%d by %s", i, (Object) str);
                    }
                }
                i = i3;
            } catch (IOException | SecurityException e2) {
                e = e2;
                bnsl bnsl2 = (bnsl) ahsd.f67925a.mo68388c();
                bnsl2.mo68437a(e);
                bnsl2.mo68420a("FastPair: HeadsetPieceImage, unable to delete images by model id:%s", str);
                ((bnsl) ahsd.f67925a.mo68390d()).mo68413a("FastPair: HeadsetPieceImage, delete files:%d by %s", i, (Object) str);
            }
        }
        ((bnsl) ahsd.f67925a.mo68390d()).mo68413a("FastPair: HeadsetPieceImage, delete files:%d by %s", i, (Object) str);
    }

    /* renamed from: a */
    public static boolean m56927a(Context context, Uri uri) {
        try {
            File canonicalFile = new File(m56929c(context), uri.getLastPathSegment()).getCanonicalFile();
            if (!uri.equals(C1136kk.m17966a(context, "com.google.android.gms.fileprovider", canonicalFile))) {
                ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPair: HeadsetPieceImage, invalid uri:%s", uri);
                return false;
            }
            srn srn = ahsd.f67925a;
            canonicalFile.exists();
            return canonicalFile.exists();
        } catch (IOException | IllegalArgumentException e) {
            bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68420a("FastPair: HeadsetPieceImage, invalid uri:%s", uri);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ae, code lost:
        if (r2.exists() != false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d7, code lost:
        if (r2.exists() != false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d9, code lost:
        r2.delete();
        r9 = p000.ahsd.f67925a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00df, code lost:
        if (r3 != false) goto L_0x00e1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d3  */
    /* renamed from: a */
    public final Uri mo37328a(Context context) {
        File file;
        Bitmap bitmap;
        BufferedOutputStream bufferedOutputStream;
        File c = m56929c(context);
        if (c != null) {
            String b = mo37320b();
            ahzs a = mo37319a();
            ahzs ahzs = ahzs.MAIN;
            String str = a.f68495e;
            StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 4 + String.valueOf(str).length());
            sb.append(b);
            sb.append(str);
            sb.append(".png");
            file = new File(c, sb.toString());
        } else {
            file = null;
        }
        if (file != null) {
            if (!file.exists()) {
                boolean z = false;
                if (mo37322d() != null) {
                    bitmap = BitmapFactory.decodeByteArray(mo37322d().mo73780k(), 0, mo37322d().mo73744a());
                    srn srn = ahsd.f67925a;
                } else if (mo37321c() != null) {
                    String c2 = mo37321c();
                    ahzr ahzr = new ahzr();
                    snp.m35704b(9).execute(new ahzp(this, ahzr, c2));
                    try {
                        ahzr.await(5, TimeUnit.SECONDS);
                    } catch (InterruptedException e) {
                    }
                    bitmap = ahzr.f68489a;
                    srn srn2 = ahsd.f67925a;
                } else {
                    bitmap = null;
                }
                if (bitmap != null) {
                    try {
                        bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                        z = bitmap.compress(Bitmap.CompressFormat.PNG, 0, bufferedOutputStream);
                        try {
                            bufferedOutputStream.close();
                            if (!z) {
                            }
                        } catch (IOException e2) {
                            if (!z) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (!z && file.exists()) {
                                file.delete();
                                srn srn3 = ahsd.f67925a;
                            }
                            throw th;
                        }
                    } catch (IOException e3) {
                        if (!z) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        file.delete();
                        srn srn32 = ahsd.f67925a;
                        throw th;
                    }
                }
            }
            return m56925a(context, file);
        }
        srn srn4 = ahsd.f67925a;
        return null;
        throw th;
    }
}
