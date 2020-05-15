package p000;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: kk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C1136kk extends ContentProvider {

    /* renamed from: a */
    private static final String[] f24291a = {"_display_name", "_size"};

    /* renamed from: b */
    private static final File f24292b = new File("/");

    /* renamed from: c */
    private static final HashMap f24293c = new HashMap();

    /* renamed from: d */
    private C1135kj f24294d;

    /* renamed from: a */
    public static Uri m17966a(Context context, String str, File file) {
        String str2;
        C1135kj a = m17967a(context, str);
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : a.f24232b.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (canonicalPath.startsWith(path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry != null) {
                String path2 = ((File) entry.getValue()).getPath();
                if (path2.endsWith("/")) {
                    str2 = canonicalPath.substring(path2.length());
                } else {
                    str2 = canonicalPath.substring(path2.length() + 1);
                }
                return new Uri.Builder().scheme("content").authority(a.f24231a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(str2, "/")).build();
            }
            throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
        } catch (IOException e) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
        }
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (providerInfo.grantUriPermissions) {
            this.f24294d = m17967a(context, providerInfo.authority);
        } else {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return this.f24294d.mo14508a(uri).delete() ? 1 : 0;
    }

    public String getType(Uri uri) {
        String mimeTypeFromExtension;
        File a = this.f24294d.mo14508a(uri);
        int lastIndexOf = a.getName().lastIndexOf(46);
        return (lastIndexOf < 0 || (mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(a.getName().substring(lastIndexOf + 1))) == null) ? "application/octet-stream" : mimeTypeFromExtension;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public final boolean onCreate() {
        return true;
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        File a = this.f24294d.mo14508a(uri);
        int i = 738197504;
        if ("r".equals(str)) {
            i = 268435456;
        } else if (!"w".equals(str) && !"wt".equals(str)) {
            if ("wa".equals(str)) {
                i = 704643072;
            } else if ("rw".equals(str)) {
                i = 939524096;
            } else if ("rwt".equals(str)) {
                i = 1006632960;
            } else {
                throw new IllegalArgumentException("Invalid mode: " + str);
            }
        }
        return ParcelFileDescriptor.open(a, i);
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        File a = this.f24294d.mo14508a(uri);
        if (strArr == null) {
            strArr = f24291a;
        }
        int length = strArr.length;
        String[] strArr3 = new String[length];
        Object[] objArr = new Object[length];
        int i = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i] = "_display_name";
                objArr[i] = a.getName();
                i++;
            } else if ("_size".equals(str3)) {
                strArr3[i] = "_size";
                objArr[i] = Long.valueOf(a.length());
                i++;
            }
        }
        String[] strArr4 = new String[i];
        System.arraycopy(strArr3, 0, strArr4, 0, i);
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        p000.C1136kk.f24293c.put(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x011c, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0124, code lost:
        throw new java.lang.IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", r10);
     */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x011c A[ExcHandler: XmlPullParserException (r10v3 'e' org.xmlpull.v1.XmlPullParserException A[CUSTOM_DECLARE]), Splitter:B:5:0x000d] */
    /* renamed from: a */
    private static C1135kj m17967a(Context context, String str) {
        C1135kj kjVar;
        File file;
        synchronized (f24293c) {
            kjVar = (C1135kj) f24293c.get(str);
            if (kjVar == null) {
                try {
                    kjVar = new C1135kj(str);
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
                    if (resolveContentProvider != null) {
                        XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
                        if (loadXmlMetaData != null) {
                            while (true) {
                                int next = loadXmlMetaData.next();
                                if (next == 1) {
                                    break;
                                } else if (next == 2) {
                                    String name = loadXmlMetaData.getName();
                                    file = null;
                                    String attributeValue = loadXmlMetaData.getAttributeValue(null, "name");
                                    String attributeValue2 = loadXmlMetaData.getAttributeValue(null, "path");
                                    if ("root-path".equals(name)) {
                                        file = f24292b;
                                    } else if ("files-path".equals(name)) {
                                        file = context.getFilesDir();
                                    } else if ("cache-path".equals(name)) {
                                        file = context.getCacheDir();
                                    } else if ("external-path".equals(name)) {
                                        file = Environment.getExternalStorageDirectory();
                                    } else if ("external-files-path".equals(name)) {
                                        File[] e = C1133kh.m17847e(context);
                                        if (e.length > 0) {
                                            file = e[0];
                                        }
                                    } else if (!"external-cache-path".equals(name)) {
                                        int i = Build.VERSION.SDK_INT;
                                        if ("external-media-path".equals(name)) {
                                            File[] externalMediaDirs = context.getExternalMediaDirs();
                                            if (externalMediaDirs.length > 0) {
                                                file = externalMediaDirs[0];
                                            }
                                        }
                                    } else {
                                        File[] b = C1133kh.m17844b(context);
                                        if (b.length > 0) {
                                            file = b[0];
                                        }
                                    }
                                    if (file != null) {
                                        String[] strArr = {attributeValue2};
                                        for (char c = 0; c <= 0; c = 1) {
                                            String str2 = strArr[0];
                                            if (str2 != null) {
                                                file = new File(file, str2);
                                            }
                                        }
                                        if (!TextUtils.isEmpty(attributeValue)) {
                                            kjVar.f24232b.put(attributeValue, file.getCanonicalFile());
                                        } else {
                                            throw new IllegalArgumentException("Name must not be empty");
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        } else {
                            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
                        }
                    } else {
                        throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
                    }
                } catch (IOException e2) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e2);
                } catch (XmlPullParserException e3) {
                } catch (IOException e4) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e4);
                }
            }
        }
        return kjVar;
    }
}
