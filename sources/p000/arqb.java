package p000;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.smartdevice.notification.SerializableNotification;
import java.util.Random;

/* renamed from: arqb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arqb {

    /* renamed from: a */
    private static final sek f88110a = ascp.m73787a("Utils", "NotificationUtils");

    /* renamed from: a */
    public static void m73289a(Context context, int i, String str) {
        CharSequence charSequence;
        CharSequence charSequence2;
        if (!TextUtils.isEmpty(str)) {
            charSequence2 = TextUtils.expandTemplate(context.getString(C0126R.string.smartdevice_d2d_source_notification_title), str);
            charSequence = TextUtils.expandTemplate(context.getResources().getQuantityString(C0126R.plurals.smartdevice_d2d_source_notification_text, i), str);
        } else {
            charSequence2 = context.getString(C0126R.string.smartdevice_d2d_source_notification_generic_title);
            charSequence = context.getResources().getQuantityString(C0126R.plurals.smartdevice_d2d_source_notification_generic_text, i);
        }
        boolean r = cgqs.f187523a.mo6606a().mo84332r();
        long j = !r ? 1800000 : 0;
        long n = cgqs.f187523a.mo6606a().mo84328n();
        f88110a.mo25409a("Showing notification with duration %d", Long.valueOf(j));
        f88110a.mo25409a("Delaying notification by %d", Long.valueOf(n));
        SerializableNotification serializableNotification = new SerializableNotification();
        serializableNotification.f108085b = j;
        serializableNotification.f108086c = n;
        serializableNotification.f108087d = charSequence;
        serializableNotification.f108089f = charSequence;
        serializableNotification.f108090g = charSequence2;
        serializableNotification.f108088e = Uri.parse(cgqs.f187523a.mo6606a().mo84329o());
        serializableNotification.f108091h = !r;
        serializableNotification.f108094k = false;
        serializableNotification.f108092i = qkj.m32287a(context, C0126R.C0127drawable.quantum_ic_google_white_24);
        serializableNotification.f108095l = true;
        serializableNotification.f108093j = charSequence2;
        sex a = sex.m35104a(context);
        if (a != null) {
            arsd arsd = new arsd(a, new skc(context));
            int nextInt = new Random().nextInt();
            if (serializableNotification.f108085b <= 86400000) {
                SerializableNotification a2 = SerializableNotification.m92793a(serializableNotification);
                a2.f108084a = System.currentTimeMillis();
                arsd.mo48787a("d2d", nextInt, a2);
                return;
            }
            throw new IllegalArgumentException("Notification cannot have max duration exceeding 1 day.");
        }
        throw null;
    }

    /* renamed from: b */
    public static boolean m73291b() {
        return aqxm.m72200a() == 0;
    }

    /* renamed from: a */
    public static boolean m73290a() {
        int a = aqxm.m72200a();
        return a == 0 || a == 1;
    }
}
