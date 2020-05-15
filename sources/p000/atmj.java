package p000;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* renamed from: atmj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atmj {
    /* renamed from: a */
    public static final axw m76179a(File file) {
        try {
            return (axw) aye.m2424a(new FileInputStream(file), (String) null).f2600a;
        } catch (FileNotFoundException e) {
            String valueOf = String.valueOf(file.getAbsolutePath());
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Could not find file name ") : "Could not find file name ".concat(valueOf), e);
        }
    }
}
