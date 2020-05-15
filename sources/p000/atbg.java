package p000;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.RequestFuture;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.ModuleContext;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: atbg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atbg {

    /* renamed from: a */
    private static final srn f89999a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    private static Bitmap m75367a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        RequestFuture newFuture = RequestFuture.newFuture();
        rpr.m34216b().getRequestQueue().add(new ImageRequest(str, newFuture, 0, 0, ImageView.ScaleType.CENTER, Bitmap.Config.ARGB_8888, newFuture));
        try {
            return (Bitmap) newFuture.get(60, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            bnsl bnsl = (bnsl) f89999a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68420a("unable to download image: %s", str);
            return null;
        }
    }

    /* renamed from: b */
    private static void m75375b(Context context, C1102je jeVar) {
        jeVar.mo13630b(qkj.m32287a(context, C0126R.C0127drawable.quantum_ic_google_white_24));
    }

    /* renamed from: c */
    public static void m75377c(C1102je jeVar, String str) {
        if (C1221nn.m19678a(Locale.getDefault()) == 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2);
            sb.append("‏");
            sb.append(str);
            sb.append("‏");
            jeVar.mo13632b(sb.toString());
            return;
        }
        jeVar.mo13632b(str);
    }

    /* renamed from: d */
    public static void m75378d(C1102je jeVar, String str) {
        Bitmap a = m75367a(str);
        if (a != null) {
            jeVar.mo13621a(a);
        }
    }

    /* renamed from: e */
    public static void m75379e(C1102je jeVar, String str) {
        Bitmap a = m75367a(str);
        if (a != null) {
            C1100jc jcVar = new C1100jc();
            jcVar.f22139a = a;
            jeVar.mo13626a(jcVar);
        }
    }

    /* renamed from: b */
    public static void m75376b(C1102je jeVar, String str) {
        if (C1221nn.m19678a(Locale.getDefault()) == 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2);
            sb.append("‏");
            sb.append(str);
            sb.append("‏");
            jeVar.mo13640e(sb.toString());
            return;
        }
        jeVar.mo13640e(str);
    }

    /* renamed from: a */
    public static C1102je m75368a(Context context, atbf atbf) {
        C1102je jeVar;
        int i = Build.VERSION.SDK_INT;
        if (!cgwn.m147274x()) {
            jeVar = new C1102je(context);
        } else {
            sex a = sex.m35104a(context);
            if (a == null || a.mo25437a(atbf.f89994e) == null) {
                m75369a(context);
            }
            jeVar = new C1102je(context, atbf.f89994e);
        }
        m75374a(jeVar, context.getString(C0126R.string.tp_google_pay));
        m75375b(context, jeVar);
        m75372a(context, jeVar);
        C1107jj jjVar = new C1107jj();
        jjVar.f22596c = C0126R.C0127drawable.tp_notification_wear_content_icon;
        jjVar.f22595b = BitmapFactory.decodeResource(context.getResources(), C0126R.C0127drawable.tp_notification_wear_background);
        jjVar.f22594a |= 2;
        jeVar.mo13625a(jjVar);
        return jeVar;
    }

    /* renamed from: a */
    public static void m75369a(Context context) {
        sex a = sex.m35104a(context);
        if (a != null) {
            a.mo25443a(new NotificationChannelGroup("tapandpay", context.getString(C0126R.string.tp_google_pay)));
            atbf[] values = atbf.values();
            for (atbf atbf : values) {
                NotificationChannel notificationChannel = new NotificationChannel(atbf.f89994e, context.getString(atbf.f89995f), atbf.f89997h);
                notificationChannel.setGroup("tapandpay");
                notificationChannel.setDescription(context.getString(atbf.f89996g));
                notificationChannel.enableVibration(atbf.f89998i);
                notificationChannel.setShowBadge(false);
                a.mo25442a(notificationChannel);
            }
            for (String str : atbf.f89992d) {
                a.mo25447b(str);
            }
        }
    }

    /* renamed from: a */
    public static void m75370a(Context context, String str) {
        sex a = sex.m35104a(context);
        if (a == null) {
            ((bnsl) f89999a.mo68388c()).mo68405a("Notification manager unavailable");
        } else {
            a.mo25444a(str, 1001);
        }
    }

    /* renamed from: a */
    public static void m75371a(Context context, String str, C1102je jeVar) {
        sex a = sex.m35104a(context);
        if (a == null) {
            ((bnsl) f89999a.mo68388c()).mo68405a("Notification manager unavailable");
            return;
        }
        try {
            a.mo25445a(str, 1001, jeVar.mo13629b());
        } catch (IllegalArgumentException e) {
            bnsl bnsl = (bnsl) f89999a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Notification failed");
        }
    }

    /* renamed from: a */
    public static void m75372a(Context context, C1102je jeVar) {
        sre.m36089i(context);
        jeVar.f22271w = context.getResources().getColor(C0126R.color.quantum_googblue);
    }

    /* renamed from: a */
    public static void m75373a(Context context, C1102je jeVar, String str) {
        if (TextUtils.isEmpty(str)) {
            m75375b(context, jeVar);
            return;
        }
        ModuleContext moduleContext = ModuleContext.getModuleContext(context);
        if (moduleContext == null) {
            m75375b(context, jeVar);
            return;
        }
        int identifier = moduleContext.getContainerResources().getIdentifier(str, "drawable", moduleContext.getPackageName());
        if (identifier == 0) {
            m75375b(context, jeVar);
        } else {
            jeVar.mo13630b(identifier);
        }
    }

    /* renamed from: a */
    public static void m75374a(C1102je jeVar, String str) {
        int i = Build.VERSION.SDK_INT;
        Bundle bundle = new Bundle();
        bundle.putString("android.substName", str);
        jeVar.mo13623a(bundle);
    }
}
