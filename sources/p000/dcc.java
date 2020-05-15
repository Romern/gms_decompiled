package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Looper;
import android.view.View;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.UUID;

/* renamed from: dcc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dcc {
    static {
        "0123456789abcdef".toCharArray();
    }

    /* renamed from: a */
    public static Activity m8143a(View view) {
        View rootView = view.getRootView();
        if (rootView != null) {
            view = rootView;
        }
        Context context = view.getContext();
        int i = 0;
        while ((context instanceof ContextWrapper) && i < 10) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            i++;
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m8147b(String str) {
        return str == null || str.isEmpty();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dab.a(byte[], boolean):java.lang.String
     arg types: [byte[], int]
     candidates:
      dab.a(java.lang.String, boolean):byte[]
      dab.a(byte[], boolean):java.lang.String */
    /* renamed from: a */
    public static String m8144a(String str) {
        if (str == null || !str.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            return str;
        }
        UUID fromString = UUID.fromString(str);
        byte[] bArr = new byte[16];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(fromString.getMostSignificantBits());
        wrap.putLong(fromString.getLeastSignificantBits());
        return dab.m8076a(bArr, true);
    }

    /* renamed from: a */
    public static String m8145a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        bqye.m113760a(th, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: a */
    public static boolean m8146a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
