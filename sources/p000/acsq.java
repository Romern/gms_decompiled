package p000;

import android.content.Context;
import java.io.File;

/* renamed from: acsq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acsq {
    /* renamed from: a */
    public static File m49814a(Context context) {
        File file = new File(abvc.m48306a(context.getFilesDir()), "user_actions");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
