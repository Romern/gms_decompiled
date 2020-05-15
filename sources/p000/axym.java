package p000;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.MessageDigest;

/* renamed from: axym */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axym {

    /* renamed from: a */
    final ayev f96777a;

    /* renamed from: b */
    final MessageDigest f96778b = axxv.m83507d();

    /* renamed from: c */
    File f96779c = null;

    /* renamed from: d */
    FileOutputStream f96780d = null;

    /* renamed from: e */
    final /* synthetic */ axyn f96781e;

    public axym(axyn axyn, ayev ayev) {
        this.f96781e = axyn;
        this.f96777a = ayev;
    }

    /* renamed from: a */
    public final void mo53769a() {
        try {
            FileOutputStream fileOutputStream = this.f96780d;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        } catch (IOException e) {
        }
        this.f96780d = null;
    }
}
