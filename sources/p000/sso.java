package p000;

import java.io.File;

/* renamed from: sso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sso extends File {
    /* JADX WARNING: Illegal instructions before constructor call */
    public sso(File file, String str) {
        super(new File(r5.getParentFile(), String.format("%s_%s", ssy.m36271a(), r5.getName())).getPath());
        File file2 = new File(new File(file.getPath(), str).getPath());
    }
}
