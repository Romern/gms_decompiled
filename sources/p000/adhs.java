package p000;

import android.os.Bundle;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: adhs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adhs extends adfj {

    /* renamed from: b */
    final /* synthetic */ adhu f61720b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public adhs(adhu adhu) {
        super("setInstantAppCookie");
        this.f61720b = adhu;
    }

    /* renamed from: a */
    public final Bundle mo33418a(adfi adfi, String str, Bundle bundle) {
        String str2;
        int length;
        byte[] byteArray = bundle.getByteArray("cookie");
        String str3 = adfi.f61556b.packageName;
        int a = this.f61720b.mo33521a();
        boolean z = true;
        if (byteArray != null && (length = byteArray.length) > a) {
            adhu.f61721a.mo33426b("Cookie for %s is too large; %d > %d", str3, Integer.valueOf(length), Integer.valueOf(a));
            z = false;
        } else {
            File a2 = this.f61720b.mo33522a(str3);
            if (a2 != null && (!a2.exists() || a2.delete())) {
                FileOutputStream fileOutputStream = null;
                if (byteArray != null) {
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(a2);
                        try {
                            fileOutputStream2.write(byteArray);
                            fileOutputStream2.flush();
                            fileOutputStream = fileOutputStream2;
                        } catch (IOException e) {
                            e = e;
                            fileOutputStream = fileOutputStream2;
                            try {
                                adhu.f61721a.mo33425a(e, "Failed to write to file", new Object[0]);
                                srz.m36171a(fileOutputStream);
                                z = false;
                                Bundle bundle2 = new Bundle();
                                bundle2.putBoolean("result", z);
                                return bundle2;
                            } catch (Throwable th) {
                                th = th;
                                srz.m36171a(fileOutputStream);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = fileOutputStream2;
                            srz.m36171a(fileOutputStream);
                            throw th;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        adhu.f61721a.mo33425a(e, "Failed to write to file", new Object[0]);
                        srz.m36171a(fileOutputStream);
                        z = false;
                        Bundle bundle22 = new Bundle();
                        bundle22.putBoolean("result", z);
                        return bundle22;
                    } catch (Throwable th3) {
                        th = th3;
                        srz.m36171a(fileOutputStream);
                        throw th;
                    }
                }
                srz.m36171a(fileOutputStream);
            } else {
                adfs adfs = adhu.f61721a;
                Object[] objArr = new Object[1];
                if (a2 == null) {
                    str2 = "null";
                } else {
                    str2 = a2.toString();
                }
                objArr[0] = str2;
                adfs.mo33426b("Could not delete existing file, or file was null: %s", objArr);
                z = false;
            }
        }
        Bundle bundle222 = new Bundle();
        bundle222.putBoolean("result", z);
        return bundle222;
    }
}
