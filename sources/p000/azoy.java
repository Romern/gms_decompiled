package p000;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: azoy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azoy {
    static {
        HashMap hashMap = new HashMap();
        hashMap.put("jpeg", "image/jpeg");
        hashMap.put("jpg", "image/jpg");
        hashMap.put("gif", "image/gif");
        hashMap.put("png", "image/png");
        hashMap.put("webp", "image/webp");
        hashMap.put("bmp", "image/bmp");
        hashMap.put("x-ms-bmp", "image/x-ms-bmp");
    }

    /* renamed from: a */
    public static boolean m85984a(String str) {
        return "text/plain".equalsIgnoreCase(str) || "text/html".equalsIgnoreCase(str) || "application/vnd.wap.xhtml+xml".equalsIgnoreCase(str);
    }

    /* renamed from: b */
    public static boolean m85986b(String str) {
        return "application/sticker".equalsIgnoreCase(str);
    }

    /* renamed from: c */
    public static boolean m85987c(String str) {
        return str != null && str.toLowerCase(Locale.getDefault()).startsWith("image/");
    }

    /* renamed from: d */
    public static boolean m85988d(String str) {
        return str != null && (str.toLowerCase(Locale.getDefault()).startsWith("audio/") || str.equalsIgnoreCase("application/ogg"));
    }

    /* renamed from: e */
    public static boolean m85989e(String str) {
        return str != null && str.toLowerCase(Locale.getDefault()).startsWith("video/");
    }

    /* renamed from: f */
    public static boolean m85990f(String str) {
        return str != null && str.equalsIgnoreCase("application/link");
    }

    /* renamed from: g */
    public static boolean m85991g(String str) {
        return str != null && str.equalsIgnoreCase("application/location");
    }

    /* renamed from: h */
    public static boolean m85992h(String str) {
        return str != null && str.equalsIgnoreCase("application/botquery");
    }

    /* renamed from: i */
    public static boolean m85993i(String str) {
        return str != null && str.equalsIgnoreCase("application/botresponse-unsupported");
    }

    /* renamed from: j */
    public static boolean m85994j(String str) {
        if (str != null) {
            return str.equalsIgnoreCase("group/add-group-users") || str.equalsIgnoreCase("group/kick-group-users") || str.equalsIgnoreCase("group/create-group");
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m85995k(String str) {
        return str != null && str.equalsIgnoreCase("application/business-chat-prompt");
    }

    /* renamed from: l */
    public static boolean m85996l(String str) {
        return "proto/MatchstickMessageContent".equalsIgnoreCase(str);
    }

    /* renamed from: m */
    public static boolean m85997m(String str) {
        return "text/plain".equalsIgnoreCase(str) || "text/html".equalsIgnoreCase(str) || "application/vnd.wap.xhtml+xml".equalsIgnoreCase(str);
    }

    /* renamed from: a */
    public static boolean m85985a(String str, int i) {
        return i == 3 && TextUtils.equals(str, cfeo.m138895z());
    }
}
