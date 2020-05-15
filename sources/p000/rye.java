package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.download.DownloadDetails;
import java.io.File;

/* renamed from: rye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rye {
    /* renamed from: a */
    public static Intent m34649a(Context context) {
        return IntentOperation.getStartIntent(context, "com.google.android.gms.common.download.DownloadIntentOperation", "com.google.android.gms.common.download.START");
    }

    /* renamed from: b */
    public static String m34651b(Context context) {
        return new File(context.getCacheDir(), "downloadservice").getAbsolutePath();
    }

    /* renamed from: a */
    public static File m34650a(Context context, DownloadDetails downloadDetails) {
        File file;
        if (downloadDetails.f30179e != null) {
            file = new File(context.getFilesDir(), downloadDetails.f30179e);
        } else {
            file = new File(m34651b(context));
        }
        return new File(file, downloadDetails.f30175a);
    }
}
