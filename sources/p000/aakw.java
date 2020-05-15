package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.Log;
import android.util.Xml;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: aakw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aakw {

    /* renamed from: a */
    public final Context f28390a;

    /* renamed from: b */
    public String f28391b;

    /* renamed from: c */
    public String f28392c;

    static {
        Uri.parse("content://com.google.android.gsf.gservices/override");
    }

    public aakw(Context context) {
        this.f28390a = context;
    }

    /* renamed from: a */
    public static Context m21413a(Context context, String str) {
        if (context.getPackageName().equals(str)) {
            return context;
        }
        try {
            return context.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    /* renamed from: b */
    public static int m21416b(Context context, String str) {
        try {
            return spn.m35864b(context, str);
        } catch (PackageManager.NameNotFoundException e) {
            return -1;
        }
    }

    /* renamed from: c */
    public final String mo16955c() {
        if (ceck.m135992b()) {
            sdo.m34970a(aytw.m84815b(this.f28390a));
        } else if (!aytw.m84815b(this.f28390a)) {
            Log.e("GCM", "getToken: DirectBootUtils.isUserUnlocked() is false.");
        }
        if (this.f28392c == null) {
            mo16953a();
        }
        return this.f28392c;
    }

    /* renamed from: b */
    public static SharedPreferences m21417b(Context context) {
        return context.getSharedPreferences("com.google.android.gcm", 4);
    }

    /* renamed from: a */
    public static String m21414a(Context context) {
        return context.getSharedPreferences("Checkin", 4).getString("CheckinService_versionInfo", "");
    }

    /* renamed from: b */
    public final String mo16954b() {
        if (ceck.m135992b()) {
            sdo.m34970a(aytw.m84815b(this.f28390a));
        } else if (!aytw.m84815b(this.f28390a)) {
            Log.e("GCM", "getAndroidId: DirectBootUtils.isUserUnlocked() is false.");
        }
        if (this.f28391b == null) {
            mo16953a();
        }
        return this.f28391b;
    }

    /* renamed from: a */
    private static final String m21415a(File file) {
        BufferedReader bufferedReader;
        try {
            if (file.exists() && file.canRead()) {
                bufferedReader = new BufferedReader(new FileReader(file));
                XmlPullParser newPullParser = Xml.newPullParser();
                newPullParser.setInput(bufferedReader);
                int eventType = newPullParser.getEventType();
                do {
                    if (eventType == 2) {
                        String name = newPullParser.getName();
                        String attributeValue = newPullParser.getAttributeValue(null, "name");
                        String attributeValue2 = newPullParser.getAttributeValue(null, "value");
                        if ("long".equals(name) && "CheckinTask_securityToken".equals(attributeValue) && attributeValue2 != null) {
                            bufferedReader.close();
                            return attributeValue2;
                        }
                    }
                    eventType = newPullParser.next();
                } while (eventType != 1);
                bufferedReader.close();
            }
        } catch (IOException e) {
            String valueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
            sb.append("Failed to read ");
            sb.append(valueOf);
            Log.e("GCM", sb.toString(), e);
        } catch (XmlPullParserException e2) {
            String valueOf2 = String.valueOf(file);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 16);
            sb2.append("Failed to parse ");
            sb2.append(valueOf2);
            Log.e("GCM", sb2.toString(), e2);
        } catch (Throwable th) {
            bufferedReader.close();
            throw th;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c3 A[SYNTHETIC, Splitter:B:41:0x00c3] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0159  */
    /* renamed from: a */
    public final boolean mo16953a() {
        String str;
        String str2;
        DataInputStream dataInputStream;
        String str3;
        String str4 = null;
        String string = this.f28390a.getSharedPreferences("GcmId", 0).getString("gcmappid", null);
        if (cdci.m132542h() && cecz.f182285a.mo6606a().mo78818aj() && string == null) {
            try {
                str3 = new String(srz.m36178b((InputStream) this.f28390a.openFileInput("checkin_id_token")), "UTF-8");
            } catch (FileNotFoundException e) {
                str3 = null;
            } catch (IOException e2) {
                Log.w("GCM", "Error reading file: checkin_id_token", e2);
                str3 = null;
            }
            if (str3 != null) {
                String[] split = str3.split(":");
                if (split.length != 2) {
                    Log.w("GCM", str3.length() == 0 ? new String("Invalid id-token:") : "Invalid id-token:".concat(str3));
                } else {
                    try {
                        Long.parseLong(split[0]);
                        Long.parseLong(split[1]);
                        string = str3;
                    } catch (NumberFormatException e3) {
                        Log.w("GCM", "NumberFormatException while parsing id-token", e3);
                    }
                }
            }
        }
        if (string == null) {
            long a = spn.getAndroidId(this.f28390a);
            this.f28391b = a != 0 ? String.valueOf(a) : null;
            try {
                Context a2 = m21413a(this.f28390a, "com.google.android.gsf");
                if (a2 != null) {
                    long j = a2.getSharedPreferences("CheckinService", 4).getLong("CheckinTask_securityToken", 0);
                    if (j != 0) {
                        Log.i("GCM", "GCM config loaded");
                        str = Long.toString(j);
                        if (str != null) {
                            try {
                                dataInputStream = new DataInputStream(m21413a(this.f28390a, "com.google.android.gsf").openFileInput("security_token"));
                                str2 = Long.toString(dataInputStream.readLong());
                                dataInputStream.close();
                            } catch (FileNotFoundException e4) {
                                Log.e("GCM", "Missing checkin config file");
                                str2 = null;
                            } catch (IOException e5) {
                                Log.e("GCM", "GCM failed to read backup checkin config, checkin may have failed");
                                str2 = null;
                            } catch (Exception e6) {
                                Log.e("GCM", "GCM error reading backup config file");
                                str2 = null;
                            } catch (Throwable th) {
                                dataInputStream.close();
                                throw th;
                            }
                            if (str2 == null) {
                                String a3 = m21415a(new File(new File(this.f28390a.getDir("APP", 0).getParentFile().getAbsolutePath().replace(".gms", ".gsf")), "shared_prefs/CheckinService.xml"));
                                if (a3 == null) {
                                    String[] split2 = cecz.f182285a.mo6606a().mo78804W().split(",");
                                    int length = split2.length;
                                    int i = 0;
                                    while (true) {
                                        if (i < length) {
                                            String a4 = m21415a(new File(split2[i]));
                                            if (a4 != null) {
                                                str4 = a4;
                                                break;
                                            }
                                            i++;
                                        } else {
                                            Log.w("GCM", "GCM FAILED TO INITIALIZE - missing checkin");
                                            break;
                                        }
                                    }
                                } else {
                                    str4 = a3;
                                }
                            } else {
                                str4 = str2;
                            }
                        } else {
                            str4 = str;
                        }
                        if (str4 != null || this.f28391b == null) {
                            return false;
                        }
                        this.f28392c = str4;
                        return true;
                    }
                }
                str = null;
            } catch (Exception e7) {
                Log.e("GCM", "Unexpected error reading config file", e7);
                str = null;
            }
            if (str != null) {
            }
            if (str4 != null) {
            }
            return false;
        }
        String[] split3 = string.split(":");
        this.f28391b = split3[0];
        this.f28392c = split3[1];
        return true;
    }
}
