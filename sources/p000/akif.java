package p000;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.os.StatFs;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: akif */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akif {

    /* renamed from: a */
    public static final String[] f72050a = {".pdf", ".txt", ".rtf", ".csv", ".docx", ".epub"};

    /* renamed from: b */
    private static final String[] f72051b = {".png", ".jpg", ".jpeg", ".gif", ".webp", ".bmp", ".heic", ".heif"};

    /* renamed from: c */
    private static final String[] f72052c = {".mp4", ".3gp", ".ts", ".webm", ".mkv"};

    /* renamed from: d */
    private static final String[] f72053d = {".mp3", ".3gp", ".mp4", ".m4a", ".aac", ".flac", ".gsm", ".mid", ".xmf", ".mxmf", ".rtttl", ".rtx", ".ota", ".imy", ".mkv", ".wav", ".ogg", ".mkv"};

    /* renamed from: e */
    private static final MimeTypeMap f72054e = MimeTypeMap.getSingleton();

    /* renamed from: a */
    public static ParcelFileDescriptor m59796a(Context context, Uri uri) {
        try {
            return becp.m91785a(context, uri, "r");
        } catch (FileNotFoundException | SecurityException e) {
            throw new IOException(String.format("Failed to open file descriptor for uri \"%s\"", uri), e);
        }
    }

    /* renamed from: b */
    public static long m59808b(Context context, Uri uri) {
        ParcelFileDescriptor parcelFileDescriptor = null;
        try {
            parcelFileDescriptor = m59796a(context, uri);
            try {
                long statSize = parcelFileDescriptor.getStatSize();
                srz.m36170a(parcelFileDescriptor);
                return statSize;
            } catch (IOException e) {
                e = e;
                try {
                    bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("akif", "b", 191, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("Failed to get the file size of uri %s.", uri);
                    srz.m36170a(parcelFileDescriptor);
                    return -1;
                } catch (Throwable th) {
                    th = th;
                    srz.m36170a(parcelFileDescriptor);
                    throw th;
                }
            }
        } catch (IOException e2) {
            e = e2;
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("akif", "b", 191, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Failed to get the file size of uri %s.", uri);
            srz.m36170a(parcelFileDescriptor);
            return -1;
        } catch (Throwable th2) {
            th = th2;
            srz.m36170a(parcelFileDescriptor);
            throw th;
        }
    }

    /* renamed from: c */
    public static String m59812c(Context context, Uri uri) {
        return m59797a(context, uri, null);
    }

    /* renamed from: d */
    public static String m59814d(Context context, Uri uri) {
        return m59809b(context, uri, "application/octet-stream");
    }

    /* renamed from: c */
    public static boolean m59813c(String str) {
        for (String str2 : f72051b) {
            if (str.toLowerCase(Locale.getDefault()).endsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static String m59797a(Context context, Uri uri, String str) {
        String b;
        String b2;
        Cursor a = ahgk.m55686a(context, uri);
        if (a != null) {
            try {
                String a2 = ahgk.m55691a(a, "_display_name");
                if (TextUtils.isEmpty(a2)) {
                    a.close();
                } else if (m59799a(a2) != null || !"content".equals(uri.getScheme()) || (b2 = m59810b(context.getContentResolver().getType(uri))) == null) {
                    a.close();
                    return a2;
                } else {
                    String valueOf = String.valueOf(a2);
                    return b2.length() == 0 ? new String(valueOf) : valueOf.concat(b2);
                }
            } finally {
                a.close();
            }
        }
        if (str == null) {
            str = m59814d(context, uri);
        }
        String uri2 = uri.toString();
        if (uri2.contains("?") && uri2.indexOf(63) != uri2.length()) {
            String[] split = uri2.substring(uri2.indexOf(63) + 1).split("&", -1);
            String str2 = null;
            for (String str3 : split) {
                try {
                    if (str3.startsWith("fileName=")) {
                        str2 = URLDecoder.decode(str3.substring(9), "UTF-8");
                        if (str2.contains("/")) {
                            if (str2.lastIndexOf(47) != str2.length()) {
                                str2 = str2.substring(str2.lastIndexOf(47) + 1);
                            }
                        }
                    } else if (str3.startsWith("mimeType=")) {
                        str = URLDecoder.decode(str3.substring(9), "UTF-8");
                    }
                } catch (UnsupportedEncodingException e) {
                }
            }
            if (!(str == null || (b = m59810b(str)) == null || str2 == null || str2.endsWith(b))) {
                String valueOf2 = String.valueOf(str2);
                str2 = b.length() == 0 ? new String(valueOf2) : valueOf2.concat(b);
            }
            if (str2 != null) {
                return str2;
            }
        }
        String a3 = m59798a(uri);
        if (str.startsWith("image")) {
            if (m59813c(a3)) {
                return a3;
            }
            String valueOf3 = String.valueOf(a3);
            String valueOf4 = String.valueOf(f72051b[0]);
            return valueOf4.length() == 0 ? new String(valueOf3) : valueOf3.concat(valueOf4);
        } else if (str.startsWith("video")) {
            for (String str4 : f72052c) {
                if (a3.toLowerCase(Locale.getDefault()).endsWith(str4)) {
                    return a3;
                }
            }
            String valueOf5 = String.valueOf(a3);
            String valueOf6 = String.valueOf(f72052c[0]);
            return valueOf6.length() == 0 ? new String(valueOf5) : valueOf5.concat(valueOf6);
        } else if (!str.startsWith("audio")) {
            return a3;
        } else {
            for (String str5 : f72053d) {
                if (a3.toLowerCase(Locale.getDefault()).endsWith(str5)) {
                    return a3;
                }
            }
            String valueOf7 = String.valueOf(a3);
            String valueOf8 = String.valueOf(f72053d[0]);
            return valueOf8.length() == 0 ? new String(valueOf7) : valueOf7.concat(valueOf8);
        }
    }

    /* renamed from: b */
    public static String m59809b(Context context, Uri uri, String str) {
        String mimeTypeFromExtension;
        if ("content".equals(uri.getScheme())) {
            String type = context.getContentResolver().getType(uri);
            if (type != null) {
                return type;
            }
        } else if ("file".equals(uri.getScheme())) {
            String a = m59799a(m59798a(uri));
            if (TextUtils.isEmpty(a) || (mimeTypeFromExtension = f72054e.getMimeTypeFromExtension(a)) == null) {
                return str;
            }
            return mimeTypeFromExtension;
        }
        return str;
    }

    /* renamed from: b */
    public static String m59810b(String str) {
        String str2;
        if (str == null) {
            return null;
        }
        if (!str.contains("/") || str.indexOf(47) == str.length()) {
            str2 = null;
        } else {
            String valueOf = String.valueOf(str.substring(str.indexOf(47) + 1));
            str2 = valueOf.length() == 0 ? new String(".") : ".".concat(valueOf);
        }
        if (str.startsWith("image")) {
            for (String str3 : f72051b) {
                if (str3.equals(str2)) {
                    return str2;
                }
            }
            return f72051b[0];
        } else if (str.startsWith("video")) {
            for (String str4 : f72052c) {
                if (str4.equals(str2)) {
                    return str2;
                }
            }
            return f72052c[0];
        } else if (!str.startsWith("audio")) {
            return null;
        } else {
            for (String str5 : f72053d) {
                if (str5.equals(str2)) {
                    return str2;
                }
            }
            return f72053d[0];
        }
    }

    /* renamed from: b */
    public static byte[] m59811b(File file) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                StringBuilder sb = new StringBuilder("");
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                        sb.append("\n");
                    } else {
                        byte[] bytes = sb.toString().getBytes();
                        srz.m36171a(bufferedReader);
                        return bytes;
                    }
                }
            } catch (IOException e) {
                e = e;
                try {
                    bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("akif", "b", 558, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("Ran into an issue reading file %s", file);
                    srz.m36171a(bufferedReader);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    bufferedReader2 = bufferedReader;
                    srz.m36171a(bufferedReader2);
                    throw th;
                }
            }
        } catch (IOException e2) {
            e = e2;
            bufferedReader = null;
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("akif", "b", 558, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Ran into an issue reading file %s", file);
            srz.m36171a(bufferedReader);
            return null;
        } catch (Throwable th2) {
            th = th2;
            srz.m36171a(bufferedReader2);
            throw th;
        }
    }

    /* renamed from: a */
    private static String m59798a(Uri uri) {
        String path = uri.getPath();
        return path != null ? path.substring(path.lastIndexOf(47) + 1) : "";
    }

    /* renamed from: a */
    public static String m59799a(String str) {
        if (str.indexOf(46) != -1) {
            return str.substring(str.lastIndexOf(46) + 1);
        }
        return null;
    }

    /* renamed from: a */
    public static BigDecimal m59800a() {
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        return new BigDecimal(Long.toString(statFs.getBlockSizeLong())).multiply(new BigDecimal(Long.toString(statFs.getAvailableBlocksLong())));
    }

    /* renamed from: a */
    public static void m59801a(File file, File file2) {
        if (file2.getParentFile() != null) {
            file2.getParentFile().mkdirs();
        }
        if (!file.renameTo(file2)) {
            m59802a(new FileInputStream(file), new FileOutputStream(file2));
            file.delete();
        }
    }

    /* renamed from: a */
    public static void m59802a(InputStream inputStream, OutputStream outputStream) {
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    outputStream.flush();
                    return;
                }
            }
        } finally {
            inputStream.close();
            outputStream.close();
        }
    }

    /* renamed from: a */
    private static void m59803a(List list, Uri uri) {
        if (uri != null && !list.contains(uri)) {
            list.add(uri);
        }
    }

    /* renamed from: a */
    private static void m59804a(List list, File file) {
        if (file != null) {
            Uri fromFile = Uri.fromFile(file);
            if (!list.contains(fromFile)) {
                list.add(fromFile);
            }
        }
    }

    /* renamed from: a */
    private static void m59805a(List list, String str) {
        if (str != null) {
            Uri parse = Uri.parse(str);
            if (parse.getAuthority() == null) {
                File file = new File(str);
                if (file.exists() && file.isFile()) {
                    parse = Uri.fromFile(file);
                } else {
                    return;
                }
            }
            if (!list.contains(parse)) {
                list.add(parse);
            }
        }
    }

    /* renamed from: a */
    public static boolean m59806a(File file) {
        File[] listFiles;
        if (!file.exists()) {
            return true;
        }
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (!m59806a(file2)) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    /* renamed from: a */
    public static Uri[] m59807a(Intent intent) {
        Object obj;
        Object obj2;
        List list;
        Uri uri;
        Uri[] uriArr;
        File file;
        File[] fileArr;
        String str;
        String[] strArr;
        Uri uri2;
        File file2;
        Bundle extras = intent.getExtras();
        String str2 = null;
        if (extras != null) {
            obj = extras.get("android.intent.extra.STREAM");
        } else {
            obj = null;
        }
        if (extras != null) {
            obj2 = extras.get("output");
        } else {
            obj2 = null;
        }
        if (obj instanceof List) {
            list = (List) obj;
        } else {
            list = null;
        }
        if (obj instanceof Uri) {
            uri = (Uri) obj;
        } else {
            uri = null;
        }
        if (obj instanceof Uri[]) {
            uriArr = (Uri[]) obj;
        } else {
            uriArr = null;
        }
        if (obj instanceof File) {
            file = (File) obj;
        } else {
            file = null;
        }
        if (obj instanceof File[]) {
            fileArr = (File[]) obj;
        } else {
            fileArr = null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        if (obj instanceof String[]) {
            strArr = (String[]) obj;
        } else {
            strArr = null;
        }
        if (obj2 instanceof Uri) {
            uri2 = (Uri) obj2;
        } else {
            uri2 = null;
        }
        if (obj2 instanceof File) {
            file2 = (File) obj2;
        } else {
            file2 = null;
        }
        if (obj2 instanceof String) {
            str2 = (String) obj2;
        }
        Uri data = intent.getData();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Object obj3 : list) {
                if (obj3 instanceof Uri) {
                    m59803a(arrayList, (Uri) obj3);
                } else if (obj3 instanceof File) {
                    m59804a(arrayList, (File) obj3);
                } else if (obj3 instanceof String) {
                    m59805a(arrayList, (String) obj3);
                }
            }
        }
        m59803a(arrayList, uri);
        if (uriArr != null) {
            for (Uri uri3 : uriArr) {
                m59803a(arrayList, uri3);
            }
        }
        m59804a(arrayList, file);
        if (fileArr != null) {
            for (File file3 : fileArr) {
                m59804a(arrayList, file3);
            }
        }
        m59805a(arrayList, str);
        if (strArr != null) {
            for (String str3 : strArr) {
                m59805a(arrayList, str3);
            }
        }
        m59803a(arrayList, uri2);
        m59804a(arrayList, file2);
        m59805a(arrayList, str2);
        m59803a(arrayList, data);
        return (Uri[]) arrayList.toArray(new Uri[0]);
    }
}
