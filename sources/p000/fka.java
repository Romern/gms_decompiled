package p000;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.C0271c;
import com.google.android.gms.ads.identifier.C0272d;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* renamed from: fka */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fka extends fkj {

    /* renamed from: a */
    public static boolean f16762a;

    /* renamed from: b */
    private C0271c f16763b;

    /* renamed from: c */
    private final fof f16764c;

    /* renamed from: e */
    private String f16765e;

    /* renamed from: f */
    private boolean f16766f = false;

    /* renamed from: g */
    private final Object f16767g = new Object();

    public fka(fkm fkm) {
        super(fkm);
        this.f16764c = new fof(fkm.f16787c);
    }

    /* renamed from: a */
    private static String m11837a(String str) {
        MessageDigest c = fog.m12079c("MD5");
        if (c == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, c.digest(str.getBytes())));
    }

    /* renamed from: b */
    private final boolean m11838b(String str) {
        try {
            String a = m11837a(str);
            mo10933d("Storing hashed adid.");
            FileOutputStream openFileOutput = mo10939f().openFileOutput("gaClientIdData", 0);
            openFileOutput.write(a.getBytes());
            openFileOutput.close();
            this.f16765e = a;
            return true;
        } catch (IOException e) {
            mo10938e("Error creating hash file", e);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10890a() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:94:0x0175 A[Catch:{ FileNotFoundException -> 0x00a5, IOException -> 0x0094 }] */
    /* renamed from: b */
    public final synchronized C0271c mo10912b() {
        C0271c cVar;
        boolean z;
        String str;
        String str2;
        if (this.f16764c.mo11060a(1000)) {
            this.f16764c.mo11059a();
            try {
                cVar = C0272d.m5150a(mo10939f());
            } catch (IllegalStateException e) {
                mo10940f("IllegalStateException getting Ad Id Info. If you would like to see Audience reports, please ensure that you have added '<meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />' to your application manifest file. See http://goo.gl/naFqQk for details.");
                cVar = null;
            } catch (Exception e2) {
                if (!f16762a) {
                    f16762a = true;
                    mo10934d("Error getting advertiser id", e2);
                    cVar = null;
                } else {
                    cVar = null;
                }
            }
            C0271c cVar2 = this.f16763b;
            String str3 = cVar != null ? cVar.f7985a : null;
            if (!TextUtils.isEmpty(str3)) {
                String b = mo10950o().mo11000b();
                synchronized (this.f16767g) {
                    if (!this.f16766f) {
                        try {
                            FileInputStream openFileInput = mo10939f().openFileInput("gaClientIdData");
                            byte[] bArr = new byte[128];
                            int read = openFileInput.read(bArr, 0, 128);
                            if (openFileInput.available() > 0) {
                                mo10940f("Hash file seems corrupted, deleting it.");
                                openFileInput.close();
                                mo10939f().deleteFile("gaClientIdData");
                                str2 = null;
                            } else if (read <= 0) {
                                mo10933d("Hash file is empty.");
                                openFileInput.close();
                                str2 = null;
                            } else {
                                str2 = new String(bArr, 0, read);
                                try {
                                    openFileInput.close();
                                } catch (FileNotFoundException e3) {
                                } catch (IOException e4) {
                                    e = e4;
                                    mo10934d("Error reading Hash file, deleting it", e);
                                    mo10939f().deleteFile("gaClientIdData");
                                }
                            }
                        } catch (FileNotFoundException e5) {
                            str2 = null;
                        } catch (IOException e6) {
                            e = e6;
                            str2 = null;
                            mo10934d("Error reading Hash file, deleting it", e);
                            mo10939f().deleteFile("gaClientIdData");
                        }
                        this.f16765e = str2;
                        this.f16766f = true;
                    } else if (TextUtils.isEmpty(this.f16765e)) {
                        if (cVar2 != null) {
                            str = cVar2.f7985a;
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            String valueOf = String.valueOf(str);
                            String valueOf2 = String.valueOf(b);
                            this.f16765e = m11837a(valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2));
                        } else {
                            String valueOf3 = String.valueOf(str3);
                            String valueOf4 = String.valueOf(b);
                            z = m11838b(valueOf4.length() == 0 ? new String(valueOf3) : valueOf3.concat(valueOf4));
                            if (!z) {
                                mo10942g("Failed to reset client id on adid change. Not using adid");
                                this.f16763b = new C0271c("", false);
                            }
                        }
                    }
                    String valueOf5 = String.valueOf(str3);
                    String valueOf6 = String.valueOf(b);
                    String a = m11837a(valueOf6.length() == 0 ? new String(valueOf5) : valueOf5.concat(valueOf6));
                    if (TextUtils.isEmpty(a)) {
                        mo10942g("Failed to reset client id on adid change. Not using adid");
                        this.f16763b = new C0271c("", false);
                    } else if (!a.equals(this.f16765e)) {
                        if (!TextUtils.isEmpty(this.f16765e)) {
                            mo10933d("Resetting the client id because Advertising Id changed.");
                            fle o = mo10950o();
                            synchronized (o) {
                                o.f16848a = null;
                                o.f16849b = o.mo10944i().mo10885a(new fld(o));
                            }
                            b = o.mo11000b();
                            mo10926a("New client Id", b);
                        }
                        String valueOf7 = String.valueOf(str3);
                        String valueOf8 = String.valueOf(b);
                        z = m11838b(valueOf8.length() == 0 ? new String(valueOf7) : valueOf7.concat(valueOf8));
                        if (!z) {
                        }
                    }
                }
            }
            this.f16763b = cVar;
        }
        return this.f16763b;
    }
}
