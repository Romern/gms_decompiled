package p000;

import android.content.Context;
import android.util.Pair;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: ncz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ncz {

    /* renamed from: a */
    public static final lvn f35303a = new lvn("DiffScriptHelper");

    /* renamed from: a */
    public static bmxv m25945a(Context context, String str) {
        BufferedReader bufferedReader;
        FileInputStream fileInputStream;
        try {
            File c = m25950c(context, str);
            if (c.exists()) {
                fileInputStream = new FileInputStream(c);
            } else {
                File a = m25947a(context);
                if (!a.exists()) {
                    a.mkdirs();
                }
                File file = new File(context.getFilesDir().getAbsolutePath(), str);
                if (!file.exists()) {
                    c.createNewFile();
                    fileInputStream = new FileInputStream(c);
                } else {
                    file.renameTo(c);
                    fileInputStream = new FileInputStream(c);
                }
            }
            bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    JSONObject jSONObject = (JSONObject) new JSONTokener(sb.toString()).nextValue();
                    bmxv b = bmxv.m108566b(new Pair(jSONObject.getString("revisionId"), new blbn(jSONObject.getJSONObject("hashSummary"))));
                    bufferedReader.close();
                    return b;
                }
                sb.append(readLine);
            }
        } catch (IOException | JSONException e) {
            return bmvz.f131120a;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    public static void m25949b(Context context, String str) {
        File c = m25950c(context, str);
        if (c.exists()) {
            c.delete();
        }
    }

    /* renamed from: c */
    private static File m25950c(Context context, String str) {
        String valueOf = String.valueOf(context.getFilesDir().getAbsoluteFile());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append(valueOf);
        sb.append("/backup_diff_script");
        return new File(sb.toString(), str);
    }

    /* renamed from: a */
    public static bzrx m25946a(blbn blbn, InputStream inputStream, Executor executor) {
        PipedInputStream pipedInputStream = new PipedInputStream();
        PipedOutputStream pipedOutputStream = new PipedOutputStream(pipedInputStream);
        nda nda = new nda(pipedInputStream);
        executor.execute(new ncy(inputStream, blbn, pipedOutputStream, nda));
        return new bzsf(nda, 1048576);
    }

    /* renamed from: a */
    public static File m25947a(Context context) {
        String valueOf = String.valueOf(context.getFilesDir().getAbsoluteFile());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append(valueOf);
        sb.append("/backup_diff_script");
        return new File(sb.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0071 A[SYNTHETIC, Splitter:B:24:0x0071] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007c A[SYNTHETIC, Splitter:B:30:0x007c] */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public static void m25948a(Context context, String str, String str2, blbn blbn) {
        Throwable th;
        BufferedWriter bufferedWriter = null;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("revisionId", str2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("chunkMap", blbn.f125837a.mo66445a());
            jSONObject2.put("chunkSize", blbn.f125838b);
            jSONObject2.put("remainderLength", blbn.f125839c);
            Integer num = blbn.f125840d;
            if (num != null) {
                jSONObject2.put("remainderWeakHash", num);
            }
            blbh blbh = blbn.f125841e;
            if (blbh != null) {
                jSONObject2.put("remainderInfo", blbh.mo66441a());
            }
            jSONObject.put("hashSummary", jSONObject2);
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(m25950c(context, str))));
            try {
                bufferedWriter2.write(jSONObject.toString());
                try {
                    bufferedWriter2.close();
                } catch (IOException e) {
                }
            } catch (IOException | JSONException e2) {
                bufferedWriter = bufferedWriter2;
                if (bufferedWriter == null) {
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                if (bufferedWriter != null) {
                }
                throw th;
            }
        } catch (IOException | JSONException e3) {
            if (bufferedWriter == null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e4) {
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e5) {
                }
            }
            throw th;
        }
    }
}
