package p000;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;

/* renamed from: becl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class becl {

    /* renamed from: a */
    public static final ClipData f106906a = ClipData.newRawUri("", Uri.EMPTY);

    static {
        int i = Build.VERSION.SDK_INT;
    }

    /* renamed from: a */
    private static boolean m91782a(int i, int i2) {
        return (i & i2) == i2;
    }

    /* renamed from: a */
    public static PendingIntent m91780a(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getActivity(context, i, m91781a(intent, i2), i2);
    }

    /* renamed from: a */
    public static Intent m91781a(Intent intent, int i) {
        boolean z;
        boolean z2;
        if ((i & 95) == 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108589a(z, "Cannot set any dangerous parts of intent to be mutable.");
        if (intent.getComponent() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        bmxy.m108589a(z2, "Must set component on Intent.");
        if (m91782a(0, 1)) {
            bmxy.m108589a(!m91782a(i, 67108864), "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
        } else {
            int i2 = Build.VERSION.SDK_INT;
            bmxy.m108589a(m91782a(i, 67108864), "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
        }
        Intent intent2 = new Intent(intent);
        int i3 = Build.VERSION.SDK_INT;
        if (!m91782a(i, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!m91782a(0, 3) && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!m91782a(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!m91782a(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!m91782a(0, 17)) {
                int i4 = Build.VERSION.SDK_INT;
                if (intent2.getClipData() == null) {
                    intent2.setClipData(f106906a);
                }
            }
        }
        return intent2;
    }
}
