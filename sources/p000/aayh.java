package p000;

import android.app.ApplicationErrorReport;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.Pair;
import android.util.StateSet;
import android.view.MenuItem;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.feedback.Screenshot;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aayh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aayh {
    /* renamed from: a */
    public static Drawable m47231a(Drawable drawable, Resources resources) {
        return drawable.getConstantState().newDrawable(resources).mutate();
    }

    /* renamed from: b */
    public static Drawable m47257b(Drawable drawable, Context context, int i) {
        Drawable a = m47231a(drawable, context.getResources());
        m47244a(a, i);
        return a;
    }

    /* renamed from: c */
    public static String m47261c(long j) {
        StringBuilder sb = new StringBuilder(43);
        sb.append(j);
        sb.append("_gH_async_feedback_psbd");
        return sb.toString();
    }

    /* renamed from: d */
    public static String m47262d(long j) {
        StringBuilder sb = new StringBuilder(51);
        sb.append(j);
        sb.append("_gH_async_feedback_psbd_metrics");
        return sb.toString();
    }

    /* renamed from: a */
    public static StateListDrawable m47232a(Context context, int i) {
        Resources resources = context.getResources();
        Drawable a = m47231a(C1133kh.m17836a(context, (int) C0126R.C0127drawable.quantum_ic_send_black_24), resources);
        Drawable a2 = m47231a(a, resources);
        a2.setAlpha(100);
        Bitmap createBitmap = Bitmap.createBitmap(a2.getIntrinsicWidth(), a2.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        a2.setBounds(0, 0, a2.getIntrinsicWidth(), a2.getIntrinsicHeight());
        a2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), createBitmap);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842910}, a);
        stateListDrawable.addState(StateSet.WILD_CARD, bitmapDrawable);
        m47244a(stateListDrawable, i);
        return stateListDrawable;
    }

    /* renamed from: b */
    public static String m47258b(long j) {
        StringBuilder sb = new StringBuilder(38);
        sb.append(j);
        sb.append("_gH_async_help_psd");
        return sb.toString();
    }

    /* renamed from: b */
    private static void m47259b(int i, String str, GoogleHelp googleHelp, Context context) {
        if (TextUtils.equals("exception", str)) {
            m47239a(i, 139, googleHelp, context);
        } else if (TextUtils.equals("timeout", str)) {
            m47239a(i, 140, googleHelp, context);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        return null;
     */
    /* renamed from: b */
    public static synchronized String[] m47260b(Context context, String str, GoogleHelp googleHelp) {
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream;
        synchronized (aayh.class) {
            try {
                File file = new File(new File(context.getFilesDir(), "gH_async_psd"), str);
                if (file.exists()) {
                    fileInputStream = new FileInputStream(file);
                    objectInputStream = new ObjectInputStream(fileInputStream);
                    Object readObject = objectInputStream.readObject();
                    if (readObject instanceof String[]) {
                        String[] strArr = (String[]) readObject;
                        objectInputStream.close();
                        fileInputStream.close();
                        return strArr;
                    }
                    objectInputStream.close();
                    fileInputStream.close();
                }
            } catch (Exception e) {
                Log.e("gH_SharedFbUtils", "Reading async psbd file paths from file failed!", e);
                m47239a((int) ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, 142, googleHelp, context);
                return null;
            } catch (Throwable th) {
                objectInputStream.close();
                fileInputStream.close();
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static synchronized Bundle m47233a(Context context, String str, GoogleHelp googleHelp) {
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream;
        Bundle a;
        synchronized (aayh.class) {
            try {
                File file = new File(new File(context.getFilesDir(), "gH_async_psd"), str);
                if (!file.exists()) {
                    return null;
                }
                fileInputStream = new FileInputStream(file);
                objectInputStream = new ObjectInputStream(fileInputStream);
                if (ceib.m136899d()) {
                    a = m47234a(m47235a(objectInputStream.readObject()));
                    objectInputStream.close();
                } else {
                    a = m47235a(objectInputStream.readObject());
                    objectInputStream.close();
                }
                fileInputStream.close();
                return a;
            } catch (Exception e) {
                Log.e("gH_SharedFbUtils", "Reading async psd from file failed!", e);
                if (str.endsWith("_gH_async_help_psd")) {
                    m47239a((int) ErrorInfo.TYPE_SDU_MEMORY_FULL, 142, googleHelp, context);
                } else if (str.endsWith("_gH_async_feedback_psd")) {
                    m47239a((int) ErrorInfo.TYPE_SDU_FAILED, 142, googleHelp, context);
                }
                return null;
            } catch (Throwable th) {
                objectInputStream.close();
                fileInputStream.close();
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static Bundle m47234a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (String str : bundle.keySet()) {
            if (str != null) {
                String string = bundle.getString(str);
                if (string == null) {
                    string = "null";
                }
                bundle2.putString(str, string);
            }
        }
        return bundle2;
    }

    /* renamed from: a */
    static Bundle m47235a(Object obj) {
        if (!(obj instanceof String[][])) {
            return null;
        }
        String[][] strArr = (String[][]) obj;
        int length = strArr.length;
        Bundle bundle = new Bundle(length);
        for (String[] strArr2 : strArr) {
            if (strArr2.length == 2) {
                bundle.putString(strArr2[0], strArr2[1]);
            }
        }
        return bundle;
    }

    /* renamed from: a */
    public static File m47236a(File file) {
        File file2 = new File(file, "reports");
        if (file2.exists() || file2.mkdirs()) {
            return file2;
        }
        Log.e("gH_SharedFbUtils", "failed to create reports directory");
        return null;
    }

    /* renamed from: a */
    public static String m47237a(long j) {
        StringBuilder sb = new StringBuilder(42);
        sb.append(j);
        sb.append("_gH_async_feedback_psd");
        return sb.toString();
    }

    /* renamed from: a */
    public static String m47238a(FileTeleporter fileTeleporter, File file) {
        Pair pair;
        if (fileTeleporter == null) {
            throw new IllegalArgumentException("FileTeleporter is null");
        } else if (TextUtils.isEmpty(fileTeleporter.f31608b) || !fileTeleporter.f31608b.startsWith("text")) {
            String valueOf = String.valueOf(fileTeleporter.f31608b);
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Passing data which is not text is not currently supported. You passed in data with mimeType: ") : "Passing data which is not text is not currently supported. You passed in data with mimeType: ".concat(valueOf));
        } else {
            ParcelFileDescriptor parcelFileDescriptor = fileTeleporter.f31607a;
            if (parcelFileDescriptor == null) {
                pair = Pair.create(fileTeleporter.f31609c, Pair.create(fileTeleporter.f31608b, fileTeleporter.f31610d));
            } else {
                DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
                try {
                    byte[] bArr = new byte[dataInputStream.readInt()];
                    String readUTF = dataInputStream.readUTF();
                    String readUTF2 = dataInputStream.readUTF();
                    dataInputStream.read(bArr);
                    FileTeleporter.m23395a(dataInputStream);
                    pair = Pair.create(readUTF2, Pair.create(readUTF, bArr));
                } catch (IOException e) {
                    throw new IllegalStateException("Could not read from parcel file descriptor", e);
                } catch (Throwable th) {
                    FileTeleporter.m23395a(dataInputStream);
                    throw th;
                }
            }
            new aayg(new File(file, String.valueOf((String) pair.first).concat(".txt")), pair).start();
            return (String) pair.first;
        }
    }

    /* renamed from: a */
    public static void m47239a(int i, int i2, GoogleHelp googleHelp, Context context) {
        bxvd da = abeh.f57196I.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abeh abeh = (abeh) da.f164949b;
        abeh.f57215j = i - 1;
        int i3 = abeh.f57206a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        abeh.f57206a = i3;
        abeh.f57216k = i2 - 1;
        abeh.f57206a = i3 | 1024;
        abcm.m47448a(context, ((abeh) da.mo74062i()).mo73642k(), googleHelp);
    }

    /* renamed from: a */
    public static void m47240a(int i, long j, GoogleHelp googleHelp, Context context) {
        bxvd da = abeh.f57196I.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abeh abeh = (abeh) da.f164949b;
        abeh.f57215j = 49;
        int i2 = abeh.f57206a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        abeh.f57206a = i2;
        abeh.f57216k = i - 1;
        int i3 = i2 | 1024;
        abeh.f57206a = i3;
        abeh.f57206a = i3 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
        abeh.f57222q = j;
        abcm.m47448a(context, ((abeh) da.mo74062i()).mo73642k(), googleHelp);
    }

    /* renamed from: a */
    public static void m47241a(int i, String str, GoogleHelp googleHelp, Context context) {
        if (TextUtils.equals("exception", str)) {
            m47239a(i, 139, googleHelp, context);
        } else if (TextUtils.equals("timeout", str)) {
            m47239a(i, 140, googleHelp, context);
        }
    }

    /* renamed from: a */
    public static void m47242a(long j, Bundle bundle, Context context, GoogleHelp googleHelp) {
        m47246a(bundle, m47237a(j), context);
        new aare(googleHelp).mo31634a("UNKNOWN_SESSION_ID");
        if (bundle.containsKey("gms:feedback:async_feedback_psd_collection_time_ms")) {
            m47240a(136, Long.valueOf(bundle.getString("gms:feedback:async_feedback_psd_collection_time_ms")).longValue(), googleHelp, context);
        } else if (bundle.containsKey("gms:feedback:async_feedback_psd_failure")) {
            m47259b(ErrorInfo.TYPE_SDU_FAILED, bundle.getString("gms:feedback:async_feedback_psd_failure"), googleHelp, context);
        }
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.io.Serializable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.io.Serializable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.io.Serializable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.io.Serializable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.io.Serializable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.io.Serializable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.io.Serializable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m47243a(long j, FeedbackOptions feedbackOptions, Bundle bundle, Context context, GoogleHelp googleHelp) {
        m47246a(bundle, m47262d(j), context);
        List list = feedbackOptions.f31597h;
        Serializable serializable = null;
        serializable = null;
        if (list != null && !list.isEmpty()) {
            serializable = m47255a(context.getFilesDir(), (FileTeleporter[]) list.toArray(new FileTeleporter[list.size()]));
        }
        String c = m47261c(j);
        Serializable serializable2 = serializable;
        if (serializable == null) {
            serializable2 = new String[0];
        }
        m47253a(serializable2, c, context);
        new aare(googleHelp).mo31634a("UNKNOWN_SESSION_ID");
        if (bundle.containsKey("gms:feedback:async_feedback_psbd_collection_time_ms")) {
            m47240a(135, Long.valueOf(bundle.getString("gms:feedback:async_feedback_psbd_collection_time_ms")).longValue(), googleHelp, context);
        } else if (bundle.containsKey("gms:feedback:async_feedback_psbd_failure")) {
            m47259b(ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, bundle.getString("gms:feedback:async_feedback_psbd_failure"), googleHelp, context);
        }
    }

    /* renamed from: a */
    public static void m47244a(Drawable drawable, int i) {
        drawable.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
    }

    /* renamed from: a */
    public static void m47245a(Drawable drawable, Context context, int i) {
        m47244a(drawable, C1133kh.m17843b(context, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.String[]} */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String[][], java.io.Serializable], assign insn: 0x0013: CHECK_CAST  (r0v3 ? I:java.lang.String[][]) = (java.lang.String[][]) (r0v2 java.lang.Object) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m47246a(Bundle bundle, String str, Context context) {
        int size = bundle.size();
        int[] iArr = new int[2];
        iArr[1] = 2;
        iArr[0] = size;
        ? r0 = (String[][]) Array.newInstance(String.class, iArr);
        int i = 0;
        for (String str2 : bundle.keySet()) {
            r0[i][0] = str2;
            r0[i][1] = bundle.getString(str2);
            i++;
        }
        m47253a((Serializable) r0, str, context);
    }

    /* renamed from: a */
    public static void m47247a(Spannable spannable, String str, ClickableSpan clickableSpan) {
        int indexOf = spannable.toString().indexOf(str);
        int length = str.length() + indexOf;
        if (indexOf >= 0) {
            spannable.setSpan(clickableSpan, indexOf, length, 0);
        }
    }

    /* renamed from: a */
    public static void m47248a(MenuItem menuItem, Context context, int i) {
        menuItem.setIcon(m47257b(menuItem.getIcon(), context, i));
    }

    /* renamed from: a */
    public static void m47249a(ImageView imageView, Context context, int i) {
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            imageView.setImageDrawable(m47257b(drawable, context, i));
        }
    }

    /* renamed from: a */
    public static void m47250a(ErrorReport errorReport, ErrorReport errorReport2, Context context) {
        int i;
        int i2;
        int length;
        File filesDir = context.getFilesDir();
        Bundle bundle = errorReport2.f31513D;
        if (bundle != null && bundle.size() > 0) {
            errorReport.f31513D = new Bundle();
            for (String str : errorReport2.f31513D.keySet()) {
                if (!TextUtils.isEmpty(errorReport2.f31513D.getString(str))) {
                    errorReport.f31513D.putString(str, errorReport2.f31513D.getString(str));
                }
            }
        }
        byte[] bArr = errorReport2.f31566v;
        if (!(bArr == null || (length = bArr.length) == 0)) {
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, length);
            Screenshot a = Screenshot.m66502a(decodeByteArray);
            if (decodeByteArray != null) {
                Screenshot.m66506a(errorReport, a);
            }
        }
        if (!TextUtils.isEmpty(errorReport2.f31565u) && (i = errorReport2.f31567w) > 0 && (i2 = errorReport2.f31568x) > 0) {
            Screenshot.m66506a(errorReport, Screenshot.m66503a(errorReport2.f31565u, i2, i));
        }
        if (!TextUtils.isEmpty(errorReport2.f31511B)) {
            errorReport.f31511B = errorReport2.f31511B;
        }
        if (!TextUtils.isEmpty(errorReport2.f31546b)) {
            errorReport.f31546b = errorReport2.f31546b;
        }
        if (errorReport2.f31518I != null) {
            errorReport.f31536a.crashInfo = new ApplicationErrorReport.CrashInfo();
            errorReport.f31536a.crashInfo.throwFileName = errorReport2.f31519J;
            errorReport.f31536a.crashInfo.throwMethodName = errorReport2.f31522M;
            errorReport.f31536a.crashInfo.exceptionMessage = errorReport2.f31524O;
            errorReport.f31536a.crashInfo.exceptionClassName = errorReport2.f31518I;
            errorReport.f31536a.crashInfo.stackTrace = errorReport2.f31523N;
            errorReport.f31536a.crashInfo.throwClassName = errorReport2.f31521L;
            errorReport.f31536a.crashInfo.throwLineNumber = errorReport2.f31520K;
            errorReport.f31536a.type = 1;
        }
        if (!TextUtils.isEmpty(errorReport2.f31525P)) {
            errorReport.f31525P = errorReport2.f31525P;
        }
        if (!TextUtils.isEmpty(errorReport2.f31543ag)) {
            errorReport.f31543ag = errorReport2.f31543ag;
        }
        if (!TextUtils.isEmpty(errorReport2.f31526Q)) {
            errorReport.f31526Q = errorReport2.f31526Q;
        }
        ThemeSettings themeSettings = errorReport2.f31534Y;
        if (themeSettings != null) {
            errorReport.f31534Y = themeSettings;
        }
        ApplicationErrorReport applicationErrorReport = errorReport2.f31536a;
        if (applicationErrorReport != null && !TextUtils.isEmpty(applicationErrorReport.packageName)) {
            errorReport.f31536a.packageName = errorReport2.f31536a.packageName;
        }
        int i3 = errorReport2.f31547c;
        if (i3 > 0) {
            errorReport.f31547c = i3;
        }
        if (!TextUtils.isEmpty(errorReport2.f31548d)) {
            errorReport.f31548d = errorReport2.f31548d;
        }
        Bitmap bitmap = errorReport2.f31542af;
        if (!(bitmap == null && errorReport2.f31528S == null)) {
            if (bitmap == null) {
                bitmap = errorReport2.f31528S.mo17759a();
            }
            errorReport.f31529T = Screenshot.m66505a(filesDir, "reports", bitmap);
        }
        FileTeleporter[] fileTeleporterArr = errorReport2.f31530U;
        if (!(fileTeleporterArr == null || fileTeleporterArr.length == 0)) {
            errorReport.f31531V = m47255a(filesDir, fileTeleporterArr);
        }
        LogOptions logOptions = errorReport2.f31535Z;
        if (logOptions != null) {
            errorReport.f31535Z = logOptions;
        }
        errorReport.f31532W = errorReport2.f31532W;
        errorReport.f31541ae = errorReport2.f31541ae;
    }

    /* renamed from: a */
    public static void m47251a(File file, String str) {
        new aayf(new File(file, str)).start();
    }

    /* renamed from: a */
    public static void m47252a(File file, String str, String str2) {
        File file2 = new File(file, "reports");
        String valueOf = String.valueOf(str);
        m47251a(file2, str2.length() == 0 ? new String(valueOf) : valueOf.concat(str2));
    }

    /* renamed from: a */
    public static synchronized void m47253a(Serializable serializable, String str, Context context) {
        FileOutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream;
        synchronized (aayh.class) {
            try {
                File file = new File(context.getFilesDir(), "gH_async_psd");
                if (!file.exists()) {
                    if (!file.mkdirs()) {
                        Log.e("gH_SharedFbUtils", "Creating the async psd dir failed!");
                        return;
                    }
                }
                fileOutputStream = new FileOutputStream(new File(file, str));
                objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(serializable);
                objectOutputStream.close();
                fileOutputStream.close();
            } catch (Exception e) {
                Log.e("gH_SharedFbUtils", "Writing data to file failed!", e);
            } catch (Throwable th) {
                objectOutputStream.close();
                fileOutputStream.close();
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static boolean m47254a(String str, String str2) {
        for (String str3 : m47256a(str2)) {
            if (TextUtils.equals(str3, str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static String[] m47255a(File file, FileTeleporter[] fileTeleporterArr) {
        File a = m47236a(file);
        if (a == null) {
            return null;
        }
        File[] listFiles = a.listFiles();
        for (File file2 : listFiles) {
            if (file2.getName().endsWith(".txt")) {
                String valueOf = String.valueOf(file2.getName());
                Log.e("gH_SharedFbUtils", valueOf.length() == 0 ? new String("Deleting older file : ") : "Deleting older file : ".concat(valueOf));
                file2.delete();
            }
        }
        ArrayList arrayList = new ArrayList();
        for (FileTeleporter fileTeleporter : fileTeleporterArr) {
            arrayList.add(m47238a(fileTeleporter, a));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: a */
    public static String[] m47256a(String str) {
        String[] split = TextUtils.split(str, ",");
        for (int i = 0; i < split.length; i++) {
            split[i] = split[i].trim();
        }
        return split;
    }
}
