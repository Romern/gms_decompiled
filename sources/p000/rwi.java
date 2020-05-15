package p000;

import android.content.Context;
import android.os.PatternMatcher;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: rwi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rwi extends rvd {

    /* renamed from: d */
    static final bngx f43792d = bngx.m109358a("/shared_prefs/adid_settings", "/shared_prefs/event_attestation_settings", "/shared_prefs/LockboxOptInSettings");

    public rwi() {
        super("DeleteFilesFix", TimeUnit.MINUTES.toSeconds(5));
    }

    /* renamed from: a */
    private static IllegalArgumentException m34557a(String str, String str2) {
        return new IllegalArgumentException(String.format("Path incorrectly formatted [%s]. %s", str, str2));
    }

    /* renamed from: b */
    public final rvl mo25189b(rvl rvl) {
        Log.i("DeleteFilesFix", "Preparing to possibly delete files.");
        Context context = rvl.f43760b;
        String c = cdkp.f181122a.mo6606a().mo77816c();
        int i = 3;
        if (bmxx.m108577a(c)) {
            rvk d = rvl.mo25205d();
            d.mo25199a(this, 3);
            return d.mo25198a();
        }
        try {
            List a = m34558a(context, bmyx.m108640a(',').mo66917a().mo66920b().mo66925c((CharSequence) c));
            List c2 = bmyx.m108640a(',').mo66917a().mo66920b().mo66925c((CharSequence) cdkp.f181122a.mo6606a().mo77815b());
            bnia j = bnic.m109500j();
            j.mo67752b((Iterable) m34558a(context, f43792d));
            j.mo67752b((Iterable) m34558a(context, c2));
            bnic a2 = j.mo67751a();
            HashSet hashSet = new HashSet();
            int size = a.size();
            for (int i2 = 0; i2 < size; i2++) {
                m34560a(a2, hashSet, (File) a.get(i2));
            }
            ArrayList arrayList = new ArrayList(hashSet);
            Collections.sort(arrayList, Collections.reverseOrder());
            if (((long) arrayList.size()) > cdkp.m133838e()) {
                int size2 = arrayList.size();
                long e = cdkp.m133838e();
                StringBuilder sb = new StringBuilder(76);
                sb.append("Too many files found to delete. Found: ");
                sb.append(size2);
                sb.append(" Max: ");
                sb.append(e);
                Log.w("DeleteFilesFix", sb.toString());
                rvk d2 = rvl.mo25205d();
                d2.mo25199a(this, 5);
                return d2.mo25198a();
            }
            int size3 = arrayList.size();
            String str = null;
            int i3 = 0;
            for (int i4 = 0; i4 < size3; i4++) {
                File file = (File) arrayList.get(i4);
                try {
                    String canonicalPath = file.getCanonicalPath();
                    if (str != null) {
                        if (!canonicalPath.endsWith("/") && file.isDirectory()) {
                            str = String.valueOf(str).concat("/");
                        }
                        if (!str.startsWith(canonicalPath)) {
                        }
                        str = canonicalPath;
                    }
                    if (!file.delete()) {
                        String valueOf = String.valueOf(file);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 17);
                        sb2.append("Unable to delete ");
                        sb2.append(valueOf);
                        Log.w("DeleteFilesFix", sb2.toString());
                    } else {
                        canonicalPath = str;
                    }
                    if (!file.exists() || file.isDirectory()) {
                        i3++;
                        str = canonicalPath;
                    }
                    str = canonicalPath;
                } catch (IOException e2) {
                    String valueOf2 = String.valueOf(file);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 17);
                    sb3.append("Unable to delete ");
                    sb3.append(valueOf2);
                    Log.w("DeleteFilesFix", sb3.toString(), e2);
                    str = file.getPath();
                }
            }
            StringBuilder sb4 = new StringBuilder(26);
            sb4.append(i3);
            sb4.append(" files deleted.");
            Log.i("DeleteFilesFix", sb4.toString());
            rvk d3 = rvl.mo25205d();
            if (i3 < arrayList.size()) {
                i = 5;
            }
            d3.mo25199a(this, i);
            return d3.mo25198a();
        } catch (IllegalArgumentException e3) {
            Log.e("DeleteFilesFix", "Illegally formatted relative paths.", e3);
            rvk d4 = rvl.mo25205d();
            d4.mo25199a(this, 5);
            return d4.mo25198a();
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a5, code lost:
        if (r8.equals("/cache/") != false) goto L_0x00c5;
     */
    /* renamed from: a */
    private static final List m34558a(Context context, List list) {
        Context context2;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!bmxx.m108577a(str)) {
                if (str.startsWith("direct_boot:")) {
                    context2 = aytw.m84817d(context);
                    str = str.substring(12);
                } else {
                    context2 = context;
                }
                char c = 2;
                if (str.length() < 2 || str.charAt(0) != '/' || bmxx.m108577a(str) || str.length() > 2048 || str.contains("**")) {
                    throw m34557a(str, "Path must start with /root_file/ and be a valid file path.");
                }
                int indexOf = str.indexOf(47, 1);
                if (indexOf >= 0) {
                    int i = indexOf + 1;
                    String substring = str.substring(0, i);
                    String substring2 = str.substring(i);
                    File file = null;
                    if (!bmxx.m108577a(substring)) {
                        switch (substring.hashCode()) {
                            case -1665474924:
                                if (substring.equals("/sqlite/")) {
                                    c = 7;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -39485538:
                                if (substring.equals("/backup/")) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 46489073:
                                if (substring.equals("/dir/")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1689919964:
                                break;
                            case 1779776714:
                                if (substring.equals("/shared_prefs/")) {
                                    c = 6;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1783461255:
                                if (substring.equals("/files/")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1878838226:
                                if (substring.equals("/external_cache/")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1972379517:
                                if (substring.equals("/external_files/")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                                int indexOf2 = substring2.indexOf(47);
                                if (indexOf2 > 0) {
                                    String substring3 = substring2.substring(0, indexOf2);
                                    substring2.substring(indexOf2 + 1);
                                    file = context2.getDir(substring3, 0);
                                    break;
                                }
                                break;
                            case 1:
                                file = context2.getFilesDir();
                                break;
                            case 2:
                                file = context2.getCacheDir();
                                break;
                            case 3:
                                file = context2.getExternalFilesDir(null);
                                break;
                            case 4:
                                file = context2.getExternalCacheDir();
                                break;
                            case 5:
                                file = C1133kh.m17845c(context2);
                                break;
                            case 6:
                                file = new File(context2.getFilesDir().getParent(), "shared_prefs/");
                                break;
                            case 7:
                                if (substring2.indexOf(47) < 0) {
                                    file = context2.getDatabasePath("somenotrealdatabase").getParentFile();
                                    break;
                                }
                                break;
                        }
                    }
                    if (file != null) {
                        if ("/dir/".equals(substring)) {
                            substring2 = substring2.substring(substring2.indexOf(47) + 1);
                        }
                        try {
                            File canonicalFile = file.getCanonicalFile();
                            String trim = substring2.trim();
                            if (!bmxx.m108577a(trim)) {
                                ArrayList arrayList2 = new ArrayList();
                                List c2 = bmyx.m108640a('/').mo66917a().mo66920b().mo66925c((CharSequence) trim);
                                if (((long) c2.size()) <= cdkp.m133839f()) {
                                    m34559a(context2, arrayList2, c2, canonicalFile, 0);
                                    arrayList.addAll(arrayList2);
                                } else {
                                    int size = c2.size();
                                    long f = cdkp.m133839f();
                                    StringBuilder sb = new StringBuilder(92);
                                    sb.append("Recursion depth too large! Proposed depth: ");
                                    sb.append(size);
                                    sb.append(" exceeds limit of ");
                                    sb.append(f);
                                    throw m34557a(trim, sb.toString());
                                }
                            } else {
                                throw m34557a(trim, "Relative file pattern should not be empty.");
                            }
                        } catch (IOException e) {
                            String valueOf = String.valueOf(file);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 39);
                            sb2.append("Unable to convert to a canonical file: ");
                            sb2.append(valueOf);
                            Log.e("DeleteFilesFix", sb2.toString(), e);
                            String valueOf2 = String.valueOf(file);
                            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 39);
                            sb3.append("Unable to convert to a canonical file: ");
                            sb3.append(valueOf2);
                            throw m34557a(str, sb3.toString());
                        }
                    } else {
                        StringBuilder sb4 = new StringBuilder(String.valueOf(substring).length() + 32);
                        sb4.append("Unable to parse root file for [");
                        sb4.append(substring);
                        sb4.append("]");
                        throw m34557a(str, sb4.toString());
                    }
                } else {
                    throw m34557a(str, "Root file should be formatted between first and second slash. For example: /cache/");
                }
            } else {
                throw m34557a(str, "Relative path should not be empty.");
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m34559a(Context context, List list, List list2, File file, int i) {
        int length;
        File[] listFiles = file.listFiles(new rwh(new PatternMatcher(((String) list2.get(i)).replace("*", ".*"), 2)));
        if (listFiles != null && (length = listFiles.length) != 0) {
            int i2 = i + 1;
            int i3 = 0;
            if (i2 >= list2.size()) {
                while (i3 < length) {
                    File file2 = listFiles[i3];
                    if (file2.isFile()) {
                        list.add(file2);
                    }
                    i3++;
                }
                return;
            }
            while (i3 < length) {
                File file3 = listFiles[i3];
                if (file3.isDirectory() && !file3.isHidden()) {
                    m34559a(context, list, list2, file3, i2);
                }
                i3++;
            }
        }
    }

    /* renamed from: a */
    private static boolean m34560a(Set set, Set set2, File file) {
        if (set.contains(file)) {
            return false;
        }
        if (file.isFile()) {
            set2.add(file);
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            boolean z = true;
            for (File file2 : listFiles) {
                z &= m34560a(set, set2, file2);
            }
            if (!z) {
                return false;
            }
        }
        set2.add(file);
        return true;
    }

    /* renamed from: a */
    public final boolean mo25188a(rvl rvl) {
        return cdkp.f181122a.mo6606a().mo77814a() && "/".equals(File.separator);
    }
}
