package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.system.OsConstants;
import android.system.StructStat;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: becp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class becp {

    /* renamed from: a */
    private static final String[] f106911a = {"com.android.", "com.google.", "com.chrome.", "com.nest.", "com.waymo.", "com.waze"};

    /* renamed from: b */
    private static final String[] f106912b;

    static {
        String[] strArr = new String[4];
        strArr[0] = "media";
        int i = Build.VERSION.SDK_INT;
        String str = "";
        strArr[1] = str;
        int i2 = Build.VERSION.SDK_INT;
        strArr[2] = str;
        if (Build.HARDWARE.equals("goldfish") || Build.HARDWARE.equals("ranchu")) {
            str = "com.google.android.apps.common.testing.services.storage.runfiles";
        }
        strArr[3] = str;
        f106912b = strArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0040 A[RETURN] */
    /* renamed from: a */
    private static int m91783a(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode != 114) {
            if (hashCode != 119) {
                if (hashCode == 3653 && str.equals("rw")) {
                    c = 2;
                    if (c != 0) {
                        return 1;
                    }
                    if (c == 1 || c == 2) {
                        return 2;
                    }
                    throw new IllegalArgumentException();
                }
            } else if (str.equals("w")) {
                c = 1;
                if (c != 0) {
                }
            }
        } else if (str.equals("r")) {
            c = 0;
            if (c != 0) {
            }
        }
        c = 65535;
        if (c != 0) {
        }
    }

    /* renamed from: a */
    private static Uri m91784a(Uri uri) {
        return Uri.parse(uri.toString());
    }

    @Deprecated
    /* renamed from: a */
    public static ParcelFileDescriptor m91785a(Context context, Uri uri, String str) {
        beco beco = beco.f106909a;
        ContentResolver contentResolver = context.getContentResolver();
        Uri a = m91784a(uri);
        String scheme = a.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openFileDescriptor(a, str);
        }
        if ("content".equals(scheme)) {
            if (m91793a(context, a, m91783a(str), beco)) {
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(a, str);
                m91792a(openFileDescriptor);
                return openFileDescriptor;
            }
            throw new FileNotFoundException("Can't open content uri.");
        } else if ("file".equals(scheme)) {
            ParcelFileDescriptor openFileDescriptor2 = contentResolver.openFileDescriptor(a, str);
            try {
                m91788a(context, openFileDescriptor2, a, beco);
                return openFileDescriptor2;
            } catch (FileNotFoundException e) {
                m91790a(openFileDescriptor2, e);
                throw e;
            } catch (IOException e2) {
                FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
                fileNotFoundException.initCause(e2);
                m91790a(openFileDescriptor2, fileNotFoundException);
                throw fileNotFoundException;
            }
        } else {
            throw new FileNotFoundException("Not implemented. Contact tiktok-users@");
        }
    }

    /* renamed from: a */
    public static InputStream m91786a(Context context, Uri uri) {
        beco beco = beco.f106909a;
        ContentResolver contentResolver = context.getContentResolver();
        Uri a = m91784a(uri);
        String scheme = a.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openInputStream(a);
        }
        if ("content".equals(scheme)) {
            if (m91793a(context, a, 1, beco)) {
                InputStream openInputStream = contentResolver.openInputStream(a);
                m91792a(openInputStream);
                return openInputStream;
            }
            throw new FileNotFoundException("Can't open content uri.");
        } else if ("file".equals(scheme)) {
            try {
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(Uri.fromFile(new File(a.getPath()).getCanonicalFile()), "r");
                try {
                    m91788a(context, openFileDescriptor, a, beco);
                    return new ParcelFileDescriptor.AutoCloseInputStream(openFileDescriptor);
                } catch (FileNotFoundException e) {
                    m91790a(openFileDescriptor, e);
                    throw e;
                } catch (IOException e2) {
                    FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
                    fileNotFoundException.initCause(e2);
                    m91790a(openFileDescriptor, fileNotFoundException);
                    throw fileNotFoundException;
                }
            } catch (IOException e3) {
                FileNotFoundException fileNotFoundException2 = new FileNotFoundException("Canonicalization failed.");
                fileNotFoundException2.initCause(e3);
                throw fileNotFoundException2;
            }
        } else {
            throw new FileNotFoundException("Not implemented. Contact tiktok-users@");
        }
    }

    /* renamed from: a */
    public static OutputStream m91787a(Context context, Uri uri, beco beco) {
        AssetFileDescriptor assetFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        Uri a = m91784a(uri);
        String scheme = a.getScheme();
        if ("android.resource".equals(scheme)) {
            assetFileDescriptor = contentResolver.openAssetFileDescriptor(a, "w");
        } else if ("content".equals(scheme)) {
            if (m91793a(context, a, m91783a("w"), beco)) {
                assetFileDescriptor = contentResolver.openAssetFileDescriptor(a, "w");
                m91792a(assetFileDescriptor);
            } else {
                throw new FileNotFoundException("Can't open content uri.");
            }
        } else if ("file".equals(scheme)) {
            AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(a, "w");
            m91792a(openAssetFileDescriptor);
            try {
                m91788a(context, openAssetFileDescriptor.getParcelFileDescriptor(), a, beco);
                assetFileDescriptor = openAssetFileDescriptor;
            } catch (FileNotFoundException e) {
                m91789a(openAssetFileDescriptor, e);
                throw e;
            } catch (IOException e2) {
                FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
                fileNotFoundException.initCause(e2);
                m91789a(openAssetFileDescriptor, fileNotFoundException);
                throw fileNotFoundException;
            }
        } else {
            throw new FileNotFoundException("Not implemented. Contact tiktok-users@");
        }
        if (assetFileDescriptor == null) {
            return null;
        }
        try {
            return assetFileDescriptor.createOutputStream();
        } catch (IOException e3) {
            FileNotFoundException fileNotFoundException2 = new FileNotFoundException("Unable to create stream");
            fileNotFoundException2.initCause(e3);
            m91789a(assetFileDescriptor, fileNotFoundException2);
            throw fileNotFoundException2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009d, code lost:
        if (r10.startsWith(r9.getCanonicalPath()) == false) goto L_0x00b3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0111 A[RETURN] */
    /* renamed from: a */
    private static void m91788a(Context context, ParcelFileDescriptor parcelFileDescriptor, Uri uri, beco beco) {
        File a;
        String canonicalPath = new File(uri.getPath()).getCanonicalPath();
        FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();
        int i = Build.VERSION.SDK_INT;
        StructStat structStat = (StructStat) becs.m91795a(new becq(fileDescriptor));
        becs becs = new becs(structStat.st_dev, structStat.st_ino, OsConstants.S_ISLNK(structStat.st_mode));
        int i2 = Build.VERSION.SDK_INT;
        StructStat structStat2 = (StructStat) becs.m91795a(new becr(canonicalPath));
        becs becs2 = new becs(structStat2.st_dev, structStat2.st_ino, OsConstants.S_ISLNK(structStat2.st_mode));
        if (becs2.f106917c) {
            String valueOf = String.valueOf(canonicalPath);
            throw new FileNotFoundException(valueOf.length() == 0 ? new String("Can't open file: ") : "Can't open file: ".concat(valueOf));
        } else if (becs.f106915a == becs2.f106915a && becs.f106916b == becs2.f106916b) {
            if (!canonicalPath.startsWith("/proc/") && !canonicalPath.startsWith("/data/misc/")) {
                File a2 = C1133kh.m17837a(context);
                boolean z = false;
                if (a2 == null) {
                    if (canonicalPath.startsWith(Environment.getDataDirectory().getCanonicalPath())) {
                        z = true;
                        if (z == beco.f106910b) {
                            return;
                        }
                    }
                    int i3 = Build.VERSION.SDK_INT;
                    Context createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
                    if (createDeviceProtectedStorageContext == null || (a = C1133kh.m17837a(createDeviceProtectedStorageContext)) == null || !canonicalPath.startsWith(a.getCanonicalPath())) {
                        int i4 = Build.VERSION.SDK_INT;
                        File[] a3 = m91794a((Callable) new becm(context));
                        int length = a3.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 < length) {
                                File file = a3[i5];
                                if (file != null && canonicalPath.startsWith(file.getCanonicalPath())) {
                                    break;
                                }
                                i5++;
                            } else {
                                File[] a4 = m91794a((Callable) new becn(context));
                                int length2 = a4.length;
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= length2) {
                                        break;
                                    }
                                    File file2 = a4[i6];
                                    if (file2 != null && canonicalPath.startsWith(file2.getCanonicalPath())) {
                                        z = true;
                                        break;
                                    }
                                    i6++;
                                }
                            }
                        }
                    }
                }
                z = true;
                if (z == beco.f106910b) {
                }
            }
            String valueOf2 = String.valueOf(canonicalPath);
            throw new FileNotFoundException(valueOf2.length() == 0 ? new String("Can't open file: ") : "Can't open file: ".concat(valueOf2));
        } else {
            String valueOf3 = String.valueOf(canonicalPath);
            throw new FileNotFoundException(valueOf3.length() == 0 ? new String("Can't open file: ") : "Can't open file: ".concat(valueOf3));
        }
    }

    /* renamed from: a */
    private static void m91789a(AssetFileDescriptor assetFileDescriptor, FileNotFoundException fileNotFoundException) {
        try {
            assetFileDescriptor.close();
        } catch (IOException e) {
            m91791a(fileNotFoundException, e);
        }
    }

    /* renamed from: a */
    private static void m91790a(ParcelFileDescriptor parcelFileDescriptor, FileNotFoundException fileNotFoundException) {
        try {
            parcelFileDescriptor.close();
        } catch (IOException e) {
            m91791a(fileNotFoundException, e);
        }
    }

    /* renamed from: a */
    private static void m91791a(Exception exc, Exception exc2) {
        int i = Build.VERSION.SDK_INT;
        bqye.m113761a(exc, exc2);
    }

    /* renamed from: a */
    private static void m91792a(Object obj) {
        if (obj == null) {
            throw new FileNotFoundException("Content resolver returned null value.");
        }
    }

    /* renamed from: a */
    private static boolean m91793a(Context context, Uri uri, int i, beco beco) {
        String authority = uri.getAuthority();
        int indexOf = authority.indexOf(64);
        if (indexOf >= 0) {
            authority = authority.substring(indexOf + 1);
        }
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
        if (resolveContentProvider == null) {
            List<ProviderInfo> queryContentProviders = context.getPackageManager().queryContentProviders(context.getPackageName(), Process.myUid(), 0);
            if (queryContentProviders != null) {
                for (ProviderInfo providerInfo : queryContentProviders) {
                    if (authority.equals(providerInfo.authority)) {
                        return beco.f106910b;
                    }
                }
            }
            return true;
        } else if (context.getPackageName().equals(resolveContentProvider.packageName)) {
            return beco.f106910b;
        } else {
            if (beco.f106910b) {
                return false;
            }
            if (context.checkUriPermission(uri, Process.myPid(), Process.myUid(), i) != 0) {
                for (String str : f106912b) {
                    if (str.equals(authority)) {
                        return true;
                    }
                }
                if (resolveContentProvider.exported) {
                    String[] strArr = f106911a;
                    for (String str2 : strArr) {
                        if (str2.charAt(str2.length() - 1) == '.') {
                            if (resolveContentProvider.packageName.startsWith(str2)) {
                                return false;
                            }
                        } else if (resolveContentProvider.packageName.equals(str2)) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    private static File[] m91794a(Callable callable) {
        try {
            return (File[]) callable.call();
        } catch (NullPointerException e) {
            int i = Build.VERSION.SDK_INT;
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
