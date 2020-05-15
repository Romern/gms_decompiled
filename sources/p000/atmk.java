package p000;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* renamed from: atmk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atmk {
    /* renamed from: a */
    public static final File m76180a(Context context, String str, File file) {
        sdo.m34973b("Cannot make a network request from the main thread.");
        if (file.exists()) {
            return file;
        }
        try {
            asmd.m74375a(str, file, context);
            return file;
        } catch (IOException e) {
            bnsl bnsl = (bnsl) atml.f90485a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Could not download token selector image.");
            return null;
        }
    }
}
