package p000;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.RecoverySystem;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

/* renamed from: avll */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avll extends AsyncTask {

    /* renamed from: a */
    private final Context f93309a;

    /* renamed from: b */
    private File f93310b;

    /* renamed from: c */
    private asfb f93311c;

    public avll(Context context) {
        this.f93309a = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0076  */
    /* renamed from: a */
    static Map m78713a(File file) {
        ZipFile zipFile;
        ZipFile zipFile2 = null;
        try {
            zipFile = new ZipFile(file);
            try {
                ZipEntry entry = zipFile.getEntry("META-INF/com/android/metadata");
                if (entry != null) {
                    InputStream inputStream = zipFile.getInputStream(entry);
                    HashMap hashMap = new HashMap();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            bufferedReader.close();
                            zipFile.close();
                            return hashMap;
                        } else if (!(readLine.length() == 0 || readLine.charAt(0) == '#')) {
                            String[] split = readLine.split("=", 2);
                            if (split.length == 2) {
                                hashMap.put(split[0], split[1]);
                            } else {
                                throw new IOException("bad key-value pair line");
                            }
                        }
                    }
                } else {
                    zipFile.close();
                    return null;
                }
            } catch (ZipException e) {
                e = e;
                try {
                    Log.w("UpdateFromSdCardVerifierTask", "cannot read zip file", e);
                    if (zipFile != null) {
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    zipFile2 = zipFile;
                    if (zipFile2 != null) {
                        zipFile2.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                zipFile2 = zipFile;
                if (zipFile2 != null) {
                }
                throw th;
            }
        } catch (ZipException e2) {
            e = e2;
            zipFile = null;
            Log.w("UpdateFromSdCardVerifierTask", "cannot read zip file", e);
            if (zipFile != null) {
                zipFile.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (zipFile2 != null) {
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d2 A[SYNTHETIC, Splitter:B:41:0x00d2] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d7 A[Catch:{ IOException -> 0x00e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00dc A[Catch:{ IOException -> 0x00e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e3 A[Catch:{ IOException -> 0x00e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00eb A[Catch:{ IOException -> 0x00e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f8 A[Catch:{ all -> 0x0283, IOException -> 0x02b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ff A[Catch:{ all -> 0x0283, IOException -> 0x02b8 }] */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        File file;
        asfb asfb;
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        File file2;
        String[] strArr = (String[]) objArr;
        String valueOf = String.valueOf(strArr[0]);
        if (valueOf.length() == 0) {
            new String("running verify task for: ");
        } else {
            "running verify task for: ".concat(valueOf);
        }
        try {
            String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
            String str = strArr[0];
            StringBuilder sb = new StringBuilder(String.valueOf(absolutePath).length() + 1 + String.valueOf(str).length());
            sb.append(absolutePath);
            sb.append("/");
            sb.append(str);
            String sb2 = sb.toString();
            String valueOf2 = String.valueOf(sb2);
            if (valueOf2.length() == 0) {
                new String("Verify file at path: ");
            } else {
                "Verify file at path: ".concat(valueOf2);
            }
            File file3 = new File(sb2);
            try {
                File dir = this.f93309a.getDir("download", 0);
                file2 = new File(dir, "copy_of_update_file.zip");
                if (file2.exists()) {
                    file2.delete();
                    file2 = new File(dir, "copy_of_update_file.zip");
                }
                file2.createNewFile();
                fileInputStream = new FileInputStream(file3);
                try {
                    fileOutputStream = new FileOutputStream(file2);
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = null;
                    try {
                        Log.e("UpdateFromSdCardVerifierTask", "Exception while copying file over to data.", e);
                        if (fileInputStream != null) {
                        }
                        if (fileOutputStream == null) {
                        }
                        this.f93310b = file2;
                        file = this.f93310b;
                        if (file == null) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = null;
                    if (fileInputStream != null) {
                    }
                    if (fileOutputStream != null) {
                    }
                    throw th;
                }
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read <= 0) {
                            try {
                                break;
                            } catch (IOException e2) {
                                Log.e("UpdateFromSdCardVerifierTask", "Caught exception while copying update file.", e2);
                            }
                        } else {
                            fileOutputStream.write(bArr, 0, read);
                        }
                    }
                    fileInputStream.close();
                    fileOutputStream.close();
                } catch (IOException e3) {
                    e = e3;
                } catch (Throwable th3) {
                    th = th3;
                    if (fileInputStream != null) {
                    }
                    if (fileOutputStream != null) {
                    }
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
                fileOutputStream = null;
                fileInputStream = null;
                Log.e("UpdateFromSdCardVerifierTask", "Exception while copying file over to data.", e);
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream == null) {
                    fileOutputStream.close();
                    file2 = null;
                } else {
                    file2 = null;
                }
                this.f93310b = file2;
                file = this.f93310b;
                if (file == null) {
                }
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
                fileInputStream = null;
                if (fileInputStream != null) {
                }
                if (fileOutputStream != null) {
                }
                throw th;
            }
            this.f93310b = file2;
            file = this.f93310b;
            if (file == null) {
                Log.e("UpdateFromSdCardVerifierTask", "Verify failed because we were not able to copy the file.");
                return false;
            }
            Map a = m78713a(file);
            if (a == null) {
                return false;
            }
            if (a.containsKey("pre-device") && a.get("pre-device") != null && !((String) a.get("pre-device")).isEmpty() && !Build.DEVICE.equals(a.get("pre-device"))) {
                String str2 = (String) a.get("pre-device");
                String str3 = Build.DEVICE;
                StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 67 + String.valueOf(str3).length());
                sb3.append("Verification failure: device does not match. Pre-device: ");
                sb3.append(str2);
                sb3.append(", device: ");
                sb3.append(str3);
                Log.w("UpdateFromSdCardVerifierTask", sb3.toString());
                return false;
            } else if (!a.containsKey("pre-build") || a.get("pre-build") == null || ((String) a.get("pre-build")).isEmpty() || Build.FINGERPRINT.equals(a.get("pre-build"))) {
                if (a.containsKey("post-timestamp")) {
                    if (a.get("post-timestamp") != null && !((String) a.get("post-timestamp")).isEmpty()) {
                        try {
                            long parseLong = Long.parseLong((String) a.get("post-timestamp"));
                            if (Build.TIME >= parseLong) {
                                long j = Build.TIME;
                                StringBuilder sb4 = new StringBuilder(116);
                                sb4.append("Verification failure: older build. Update timestamp: ");
                                sb4.append(parseLong);
                                sb4.append(", timestamp on device: ");
                                sb4.append(j);
                                Log.w("UpdateFromSdCardVerifierTask", sb4.toString());
                                return false;
                            }
                        } catch (NumberFormatException e5) {
                            String valueOf3 = String.valueOf((String) a.get("post-timestamp"));
                            Log.w("UpdateFromSdCardVerifierTask", valueOf3.length() == 0 ? new String("Bad timestamp format: ") : "Bad timestamp format: ".concat(valueOf3));
                            return false;
                        }
                    }
                }
                Process.setThreadPriority(10);
                if (this.f93311c == null) {
                    this.f93311c = new asfb(this.f93309a, 1, "UpdateFromSdCardVerifierTask", null, "com.google.android.gms");
                }
                asfb = this.f93311c;
                asfb.mo49117b();
                try {
                    RecoverySystem.verifyPackage(this.f93310b, null, null);
                    String valueOf4 = String.valueOf(this.f93310b);
                    StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf4).length() + 27);
                    sb5.append("verification of ");
                    sb5.append(valueOf4);
                    sb5.append(" succeeded.");
                    Log.i("UpdateFromSdCardVerifierTask", sb5.toString());
                    asfb.mo49120c();
                    return 1;
                } catch (Exception e6) {
                    String valueOf5 = String.valueOf(this.f93310b);
                    StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf5).length() + 24);
                    sb6.append("verification of ");
                    sb6.append(valueOf5);
                    sb6.append(" failed.");
                    Log.e("UpdateFromSdCardVerifierTask", sb6.toString(), e6);
                    asfb.mo49120c();
                    return false;
                }
            } else {
                String str4 = (String) a.get("pre-build");
                String str5 = Build.FINGERPRINT;
                StringBuilder sb7 = new StringBuilder(String.valueOf(str4).length() + 86 + String.valueOf(str5).length());
                sb7.append("Verification failure: fingerprint does not match. Pre-build: ");
                sb7.append(str4);
                sb7.append(", fingerprint on device: ");
                sb7.append(str5);
                Log.w("UpdateFromSdCardVerifierTask", sb7.toString());
                return false;
            }
        } catch (IOException e7) {
            Log.w("UpdateFromSdCardVerifierTask", "IOException in VerifyTask", e7);
            return false;
        } catch (Throwable th5) {
            asfb.mo49120c();
            throw th5;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        File file;
        Boolean bool = (Boolean) obj;
        Intent intent = new Intent();
        intent.setAction("com.google.android.gms.update.UpdateFromSdCard.VERIFIER_RESULT_CHANGED");
        intent.putExtra("verifier_task_result", bool);
        avli.m78712a(this.f93309a, intent);
        try {
            if (!bool.booleanValue() && (file = this.f93310b) != null && file.exists()) {
                this.f93310b.delete();
            }
        } catch (Exception e) {
            Log.e("UpdateFromSdCardVerifierTask", "Failed to delete the copy of the update file.", e);
        }
    }
}
